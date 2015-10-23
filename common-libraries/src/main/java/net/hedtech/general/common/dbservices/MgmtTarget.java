package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class MgmtTarget {
//		public static void addGroup(NString pGroupName,NString pGroupType,List<SmpEmdNvpairArrayRow> pMemberTargets,NString pGroupOwner,NString pTimezoneRgn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_TARGET.ADD_GROUP", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_GROUP_NAME", pGroupName);
//			cmd.addParameter("@P_GROUP_TYPE", pGroupType);
//			// cmd.addParameter(DbTypes.getCollectionType("P_MEMBER_TARGETS", "", pMemberTargets, object.class));
//			cmd.addParameter("@P_GROUP_OWNER", pGroupOwner);
//			cmd.addParameter("@P_TIMEZONE_RGN", pTimezoneRgn);
//				
//			cmd.execute();
//
//
//		}
		
		public static void addMasterChangedCallback(NString vTargetName,NString vTargetType,NString vCallbackName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_TARGET.ADD_MASTER_CHANGED_CALLBACK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@V_TARGET_NAME", vTargetName);
			cmd.addParameter("@V_TARGET_TYPE", vTargetType);
			cmd.addParameter("@V_CALLBACK_NAME", vCallbackName);
				
			cmd.execute();


		}
		
		public static void addMetaverCatpropCallback(NString pCallbackName,NString pTargetType,NString pToMetaVer,NNumber pEvalOrder) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_TARGET.ADD_METAVER_CATPROP_CALLBACK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CALLBACK_NAME", pCallbackName);
			cmd.addParameter("@P_TARGET_TYPE", pTargetType);
			cmd.addParameter("@P_TO_META_VER", pToMetaVer);
			cmd.addParameter("@P_EVAL_ORDER", pEvalOrder);
				
			cmd.execute();


		}
		
		public static void addMetaverUpdCallback(NString pCallbackName,NString pTargetType,NString pToMetaVer,NNumber pEvalOrder) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_TARGET.ADD_METAVER_UPD_CALLBACK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CALLBACK_NAME", pCallbackName);
			cmd.addParameter("@P_TARGET_TYPE", pTargetType);
			cmd.addParameter("@P_TO_META_VER", pToMetaVer);
			cmd.addParameter("@P_EVAL_ORDER", pEvalOrder);
				
			cmd.execute();


		}
		
//		public static void addMetricSeverityDeps( vMetricDesc,List<MgmtMetricDescArrayRow> vDependencyList,NNumber vOptCode) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_TARGET.ADD_METRIC_SEVERITY_DEPS", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@V_METRIC_DESC", vMetricDesc);
//			// cmd.addParameter(DbTypes.getCollectionType("V_DEPENDENCY_LIST", "", vDependencyList, object.class));
//			cmd.addParameter("@V_OPT_CODE", vOptCode);
//				
//			cmd.execute();
//
//
//		}
		
//		public static void addMetricSeverityDeps( vMetricInstance,List<MgmtMetricInstanceArrayRow> vDependencyList) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_TARGET.ADD_METRIC_SEVERITY_DEPS", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@V_METRIC_INSTANCE", vMetricInstance);
//			// cmd.addParameter(DbTypes.getCollectionType("V_DEPENDENCY_LIST", "", vDependencyList, object.class));
//				
//			cmd.execute();
//
//
//		}
		
//		public static void addRepoMetricCollection( vMetric,NString vEvalProc,List<MgmtMetricInstanceArrayRow> vDepMetrics,NNumber vCollInterval,NNumber vOptCode) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_TARGET.ADD_REPO_METRIC_COLLECTION", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@V_METRIC", vMetric);
//			cmd.addParameter("@V_EVAL_PROC", vEvalProc);
//			// cmd.addParameter(DbTypes.getCollectionType("V_DEP_METRICS", "", vDepMetrics, object.class));
//			cmd.addParameter("@V_COLL_INTERVAL", vCollInterval);
//			cmd.addParameter("@V_OPT_CODE", vOptCode);
//				
//			cmd.execute();
//
//
//		}
		
//		public static void addTarget(NString pTargetName,NString pTargetType,NString pHostName,List<MgmtTargetPropertyListRow> pProperties,List<SmpEmdNvpairArrayRow> pGroups,List<SmpEmdNvpairArrayRow> pMemberTargets,List<SmpEmdNvpairArrayRow> pMonitoringCredentials,NString pTargetDisplayName,NString pAgentUrl,NString pTzRgn,NNumber pMonMode,NString pTypeMetaVer,NString pCategoryProp1,NString pCategoryProp2,NString pCategoryProp3,NString pCategoryProp4,NString pCategoryProp5,NNumber pRepositoryOnlyTarget,NString pTargetOwner) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_TARGET.ADD_TARGET", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_TARGET_NAME", pTargetName);
//			cmd.addParameter("@P_TARGET_TYPE", pTargetType);
//			cmd.addParameter("@P_HOST_NAME", pHostName);
//			// cmd.addParameter(DbTypes.getCollectionType("P_PROPERTIES", "", pProperties, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("P_GROUPS", "", pGroups, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("P_MEMBER_TARGETS", "", pMemberTargets, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("P_MONITORING_CREDENTIALS", "", pMonitoringCredentials, object.class));
//			cmd.addParameter("@P_TARGET_DISPLAY_NAME", pTargetDisplayName);
//			cmd.addParameter("@P_AGENT_URL", pAgentUrl);
//			cmd.addParameter("@P_TZ_RGN", pTzRgn);
//			cmd.addParameter("@P_MON_MODE", pMonMode);
//			cmd.addParameter("@P_TYPE_META_VER", pTypeMetaVer);
//			cmd.addParameter("@P_CATEGORY_PROP_1", pCategoryProp1);
//			cmd.addParameter("@P_CATEGORY_PROP_2", pCategoryProp2);
//			cmd.addParameter("@P_CATEGORY_PROP_3", pCategoryProp3);
//			cmd.addParameter("@P_CATEGORY_PROP_4", pCategoryProp4);
//			cmd.addParameter("@P_CATEGORY_PROP_5", pCategoryProp5);
//			cmd.addParameter("@P_REPOSITORY_ONLY_TARGET", pRepositoryOnlyTarget);
//			cmd.addParameter("@P_TARGET_OWNER", pTargetOwner);
//				
//			cmd.execute();
//
//
//		}
		
//		public static void addTargetTypeProperties(NString pTargetTypeIn,List<SmpEmdNvpairArrayRow> pTypePropertyListIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_TARGET.ADD_TARGET_TYPE_PROPERTIES", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_TARGET_TYPE_IN", pTargetTypeIn);
//			// cmd.addParameter(DbTypes.getCollectionType("P_TYPE_PROPERTY_LIST_IN", "", pTypePropertyListIn, object.class));
//				
//			cmd.execute();
//
//
//		}
		
		public static void addTargetTypeProperty(NString pTargetTypeIn,NString pTypePropertyNameIn,NString pTypePropertyValueIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_TARGET.ADD_TARGET_TYPE_PROPERTY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TARGET_TYPE_IN", pTargetTypeIn);
			cmd.addParameter("@P_TYPE_PROPERTY_NAME_IN", pTypePropertyNameIn);
			cmd.addParameter("@P_TYPE_PROPERTY_VALUE_IN", pTypePropertyValueIn);
				
			cmd.execute();


		}
		
		public static void addTgtRelocationCallback(NString vCallbackName,NString vTargetName,NString vTargetType) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_TARGET.ADD_TGT_RELOCATION_CALLBACK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@V_CALLBACK_NAME", vCallbackName);
			cmd.addParameter("@V_TARGET_NAME", vTargetName);
			cmd.addParameter("@V_TARGET_TYPE", vTargetType);
				
			cmd.execute();


		}
		
		public static void addTgttypeAdditionCallback(NString pCallbackName,NString pTargetType) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_TARGET.ADD_TGTTYPE_ADDITION_CALLBACK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CALLBACK_NAME", pCallbackName);
			cmd.addParameter("@P_TARGET_TYPE", pTargetType);
				
			cmd.execute();


		}
		
		public static void addTzrgnUpdateCallback(NString pCallbackName,NString pTargetType,NNumber pEvalOrder) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_TARGET.ADD_TZRGN_UPDATE_CALLBACK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CALLBACK_NAME", pCallbackName);
			cmd.addParameter("@P_TARGET_TYPE", pTargetType);
			cmd.addParameter("@P_EVAL_ORDER", pEvalOrder);
				
			cmd.execute();


		}
		
		public static void delMetaverCatpropCallback(NString pCallbackName,NString pTargetType,NString pToMetaVer) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_TARGET.DEL_METAVER_CATPROP_CALLBACK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CALLBACK_NAME", pCallbackName);
			cmd.addParameter("@P_TARGET_TYPE", pTargetType);
			cmd.addParameter("@P_TO_META_VER", pToMetaVer);
				
			cmd.execute();


		}
		
		public static void delMetaverUpdCallback(NString pCallbackName,NString pTargetType,NString pToMetaVer) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_TARGET.DEL_METAVER_UPD_CALLBACK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CALLBACK_NAME", pCallbackName);
			cmd.addParameter("@P_TARGET_TYPE", pTargetType);
			cmd.addParameter("@P_TO_META_VER", pToMetaVer);
				
			cmd.execute();


		}
		
		public static void delTgttypeAdditionCallback(NString pCallbackName,NString pTargetType) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_TARGET.DEL_TGTTYPE_ADDITION_CALLBACK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CALLBACK_NAME", pCallbackName);
			cmd.addParameter("@P_TARGET_TYPE", pTargetType);
				
			cmd.execute();


		}
		
		public static void delTzrgnUpdateCallback(NString pCallbackName,NString pTargetType) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_TARGET.DEL_TZRGN_UPDATE_CALLBACK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CALLBACK_NAME", pCallbackName);
			cmd.addParameter("@P_TARGET_TYPE", pTargetType);
				
			cmd.execute();


		}
		
		public static void deleteMasterChangedCallback(NString vTargetName,NString vTargetType,NString vCallbackName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_TARGET.DELETE_MASTER_CHANGED_CALLBACK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@V_TARGET_NAME", vTargetName);
			cmd.addParameter("@V_TARGET_TYPE", vTargetType);
			cmd.addParameter("@V_CALLBACK_NAME", vCallbackName);
				
			cmd.execute();


		}
		
//		public static void deleteMetricSeverityDeps( vMetricDesc) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_TARGET.DELETE_METRIC_SEVERITY_DEPS", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@V_METRIC_DESC", vMetricDesc);
//				
//			cmd.execute();
//
//
//		}
		
//		public static void deleteMetricSeverityDeps( vMetricInstance,List<MgmtMetricInstanceArrayRow> vDependencyList) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_TARGET.DELETE_METRIC_SEVERITY_DEPS", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@V_METRIC_INSTANCE", vMetricInstance);
//			// cmd.addParameter(DbTypes.getCollectionType("V_DEPENDENCY_LIST", "", vDependencyList, object.class));
//				
//			cmd.execute();
//
//
//		}
		
//		public static void deleteRepoMetricCollection( vMetric) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_TARGET.DELETE_REPO_METRIC_COLLECTION", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@V_METRIC", vMetric);
//				
//			cmd.execute();
//
//
//		}
		
		public static void deleteTargetPropertyDef(NString vTargetType,NString vTypeMetaVer,NString vPropertyName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_TARGET.DELETE_TARGET_PROPERTY_DEF", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@V_TARGET_TYPE", vTargetType);
			cmd.addParameter("@V_TYPE_META_VER", vTypeMetaVer);
			cmd.addParameter("@V_PROPERTY_NAME", vPropertyName);
				
			cmd.execute();


		}
		
		public static void deleteTargetType(NString pTargetTypeIn,NString pTypeMetaVerIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_TARGET.DELETE_TARGET_TYPE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TARGET_TYPE_IN", pTargetTypeIn);
			cmd.addParameter("@P_TYPE_META_VER_IN", pTypeMetaVerIn);
				
			cmd.execute();


		}
		
		public static void deleteTargetTypeProperty(NString pTargetTypeIn,NString pTypePropertyNameIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_TARGET.DELETE_TARGET_TYPE_PROPERTY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TARGET_TYPE_IN", pTargetTypeIn);
			cmd.addParameter("@P_TYPE_PROPERTY_NAME_IN", pTypePropertyNameIn);
				
			cmd.execute();


		}
		
		public static void deleteTgtRelocationCallback(NString vCallbackName,NString vTargetName,NString vTargetType) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_TARGET.DELETE_TGT_RELOCATION_CALLBACK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@V_CALLBACK_NAME", vCallbackName);
			cmd.addParameter("@V_TARGET_NAME", vTargetName);
			cmd.addParameter("@V_TARGET_TYPE", vTargetType);
				
			cmd.execute();


		}
		
		public static void dropUserTargets(NString userNameIn,NNumber typeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_TARGET.DROP_USER_TARGETS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@USER_NAME_IN", userNameIn);
			cmd.addParameter("@TYPE_IN", typeIn);
				
			cmd.execute();


		}
		
		public static void evalRepoTargetStatus(byte[] pTargetGuid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_TARGET.EVAL_REPO_TARGET_STATUS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TARGET_GUID", pTargetGuid);
				
			cmd.execute();


		}
		
		public static byte[] FgenerateMetricColumnGuid(NString pTargetType,NString pMetricName,NString pMetricColumn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_TARGET.GENERATE_METRIC_COLUMN_GUID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(byte[].class);
			cmd.addParameter("@P_TARGET_TYPE", pTargetType);
			cmd.addParameter("@P_METRIC_NAME", pMetricName);
			cmd.addParameter("@P_METRIC_COLUMN", pMetricColumn);
				
			cmd.execute();

			return cmd.getReturnValue(byte[].class);

		}
		
		public static byte[] FgenerateMetricGuid(NString pTargetType,NString pMetricName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_TARGET.GENERATE_METRIC_GUID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(byte[].class);
			cmd.addParameter("@P_TARGET_TYPE", pTargetType);
			cmd.addParameter("@P_METRIC_NAME", pMetricName);
				
			cmd.execute();

			return cmd.getReturnValue(byte[].class);

		}
		
		public static byte[] FgenerateTargetGuid(NString pTargetName,NString pTargetType) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_TARGET.GENERATE_TARGET_GUID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(byte[].class);
			cmd.addParameter("@P_TARGET_NAME", pTargetName);
			cmd.addParameter("@P_TARGET_TYPE", pTargetType);
				
			cmd.execute();

			return cmd.getReturnValue(byte[].class);

		}
		
		public static void getAgentVersion(NString pEmdUrl,Ref<NString> pAgentVersion) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_TARGET.GET_AGENT_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_EMD_URL", pEmdUrl);
			cmd.addParameter("@P_AGENT_VERSION", NString.class);
				
			cmd.execute();
			pAgentVersion.val = cmd.getParameterValue("@P_AGENT_VERSION", NString.class);


		}
		
		public static void getAllTargetsMntrSummary(NString searchTargetNameIn,Ref<DataCursor> summaryOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_TARGET.GET_ALL_TARGETS_MNTR_SUMMARY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SEARCH_TARGET_NAME_IN", searchTargetNameIn);
			cmd.addParameter("@SUMMARY_OUT", DataCursor.class);
				
			cmd.execute();
			summaryOut.val = cmd.getParameterValue("@SUMMARY_OUT", DataCursor.class);


		}
		
		public static NNumber FgetAvailCurrentStatus(byte[] targetGuidIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_TARGET.GET_AVAIL_CURRENT_STATUS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@TARGET_GUID_IN", targetGuidIn);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber FgetAvailPctValue(NString targetNameIn,NString targetTypeIn,NNumber numOfDaysIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_TARGET.GET_AVAIL_PCT_VALUE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@TARGET_NAME_IN", targetNameIn);
			cmd.addParameter("@TARGET_TYPE_IN", targetTypeIn);
			cmd.addParameter("@NUM_OF_DAYS_IN", numOfDaysIn);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber FgetAvailPctValue(byte[] targetGuidIn,NNumber numOfDaysIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_TARGET.GET_AVAIL_PCT_VALUE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@TARGET_GUID_IN", targetGuidIn);
			cmd.addParameter("@NUM_OF_DAYS_IN", numOfDaysIn);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber FgetAvailPctValue(NString targetNameIn,NString targetTypeIn,NNumber targetTzDeltaIn,NNumber numOfDaysIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_TARGET.GET_AVAIL_PCT_VALUE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@TARGET_NAME_IN", targetNameIn);
			cmd.addParameter("@TARGET_TYPE_IN", targetTypeIn);
			cmd.addParameter("@TARGET_TZ_DELTA_IN", targetTzDeltaIn);
			cmd.addParameter("@NUM_OF_DAYS_IN", numOfDaysIn);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber FgetAvailPctValue(byte[] targetGuidIn,NNumber targetTzDeltaIn,NNumber numOfDaysIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_TARGET.GET_AVAIL_PCT_VALUE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@TARGET_GUID_IN", targetGuidIn);
			cmd.addParameter("@TARGET_TZ_DELTA_IN", targetTzDeltaIn);
			cmd.addParameter("@NUM_OF_DAYS_IN", numOfDaysIn);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NDate FgetCurrentStatusTimestamp(byte[] targetGuidIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_TARGET.GET_CURRENT_STATUS_TIMESTAMP", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NDate.class);
			cmd.addParameter("@TARGET_GUID_IN", targetGuidIn);
				
			cmd.execute();

			return cmd.getReturnValue(NDate.class);

		}
		
		public static void getDeleteTargetInfo(NString pTargetName,NString pTargetType,Ref<DataCursor> pBasicInfoOut,Ref<DataCursor> pPropertiesOut,Ref<DataCursor> pCompositeinfoOut,Ref<DataCursor> pMonitorCredsOut,Ref<DataCursor> pAgentUrlListOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_TARGET.GET_DELETE_TARGET_INFO", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TARGET_NAME", pTargetName);
			cmd.addParameter("@P_TARGET_TYPE", pTargetType);
			cmd.addParameter("@P_BASIC_INFO_OUT", DataCursor.class);
			cmd.addParameter("@P_PROPERTIES_OUT", DataCursor.class);
			cmd.addParameter("@P_COMPOSITEINFO_OUT", DataCursor.class);
			cmd.addParameter("@P_MONITOR_CREDS_OUT", DataCursor.class);
			cmd.addParameter("@P_AGENT_URL_LIST_OUT", DataCursor.class);
				
			cmd.execute();
			pBasicInfoOut.val = cmd.getParameterValue("@P_BASIC_INFO_OUT", DataCursor.class);
			pPropertiesOut.val = cmd.getParameterValue("@P_PROPERTIES_OUT", DataCursor.class);
			pCompositeinfoOut.val = cmd.getParameterValue("@P_COMPOSITEINFO_OUT", DataCursor.class);
			pMonitorCredsOut.val = cmd.getParameterValue("@P_MONITOR_CREDS_OUT", DataCursor.class);
			pAgentUrlListOut.val = cmd.getParameterValue("@P_AGENT_URL_LIST_OUT", DataCursor.class);


		}
		
		public static NString FgetMasterAgentUrl(NString pTargetName,NString pTargetType) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_TARGET.GET_MASTER_AGENT_URL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_TARGET_NAME", pTargetName);
			cmd.addParameter("@P_TARGET_TYPE", pTargetType);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void getMemberMonitoringSummary(NString targetNameIn,NString targetTypeIn,NString memberTargetTypeIn,NNumber timeperiodIn,Ref<DataCursor> summaryOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_TARGET.GET_MEMBER_MONITORING_SUMMARY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TARGET_NAME_IN", targetNameIn);
			cmd.addParameter("@TARGET_TYPE_IN", targetTypeIn);
			cmd.addParameter("@MEMBER_TARGET_TYPE_IN", memberTargetTypeIn);
			cmd.addParameter("@TIMEPERIOD_IN", timeperiodIn);
			cmd.addParameter("@SUMMARY_OUT", DataCursor.class);
				
			cmd.execute();
			summaryOut.val = cmd.getParameterValue("@SUMMARY_OUT", DataCursor.class);


		}
		
//		public static List<SmpEmdNvpairArrayRow> FgetMetricColumnGuids(NString targetTypeIn,NString metricNameIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_TARGET.GET_METRIC_COLUMN_GUIDS", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<SmpEmdNvpairArrayRow>.class);
//			cmd.addParameter("@TARGET_TYPE_IN", targetTypeIn);
//			cmd.addParameter("@METRIC_NAME_IN", metricNameIn);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<SmpEmdNvpairArrayRow>.class);
//
//		}
		
		public static byte[] FgetMetricGuid(NString targetTypeIn,NString metricNameIn,NString metricColumnIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_TARGET.GET_METRIC_GUID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(byte[].class);
			cmd.addParameter("@TARGET_TYPE_IN", targetTypeIn);
			cmd.addParameter("@METRIC_NAME_IN", metricNameIn);
			cmd.addParameter("@METRIC_COLUMN_IN", metricColumnIn);
				
			cmd.execute();

			return cmd.getReturnValue(byte[].class);

		}
		
//		public static void getRepoMetricEvalProc( vMetric,Ref<NString> vEvalProc) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_TARGET.GET_REPO_METRIC_EVAL_PROC", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@V_METRIC", vMetric);
//			cmd.addParameter("@V_EVAL_PROC", NString.class);
//				
//			cmd.execute();
//			vEvalProc.val = cmd.getParameterValue("@V_EVAL_PROC", NString.class);
//
//
//		}
		
		public static byte[] FgetTargetGuid(NString targetNameIn,NString targetTypeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_TARGET.GET_TARGET_GUID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(byte[].class);
			cmd.addParameter("@TARGET_NAME_IN", targetNameIn);
			cmd.addParameter("@TARGET_TYPE_IN", targetTypeIn);
				
			cmd.execute();

			return cmd.getReturnValue(byte[].class);

		}
		
		public static void getTargetInfo(NString pTargetName,NString pTargetType,Ref<DataCursor> pBasicInfoOut,Ref<DataCursor> pPropertiesOut,Ref<DataCursor> pPropDefsOut,Ref<DataCursor> pCompositeinfoOut,Ref<DataCursor> pMemberinfoOut,Ref<DataCursor> pMonitorCredsOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_TARGET.GET_TARGET_INFO", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TARGET_NAME", pTargetName);
			cmd.addParameter("@P_TARGET_TYPE", pTargetType);
			cmd.addParameter("@P_BASIC_INFO_OUT", DataCursor.class);
			cmd.addParameter("@P_PROPERTIES_OUT", DataCursor.class);
			cmd.addParameter("@P_PROP_DEFS_OUT", DataCursor.class);
			cmd.addParameter("@P_COMPOSITEINFO_OUT", DataCursor.class);
			cmd.addParameter("@P_MEMBERINFO_OUT", DataCursor.class);
			cmd.addParameter("@P_MONITOR_CREDS_OUT", DataCursor.class);
				
			cmd.execute();
			pBasicInfoOut.val = cmd.getParameterValue("@P_BASIC_INFO_OUT", DataCursor.class);
			pPropertiesOut.val = cmd.getParameterValue("@P_PROPERTIES_OUT", DataCursor.class);
			pPropDefsOut.val = cmd.getParameterValue("@P_PROP_DEFS_OUT", DataCursor.class);
			pCompositeinfoOut.val = cmd.getParameterValue("@P_COMPOSITEINFO_OUT", DataCursor.class);
			pMemberinfoOut.val = cmd.getParameterValue("@P_MEMBERINFO_OUT", DataCursor.class);
			pMonitorCredsOut.val = cmd.getParameterValue("@P_MONITOR_CREDS_OUT", DataCursor.class);


		}
		
		public static void getTargetInfo(NString pTargetName,NString pTargetType,Ref<DataCursor> pBasicInfoOut,Ref<DataCursor> pPropertiesOut,Ref<DataCursor> pCompositeinfoOut,Ref<DataCursor> pMemberinfoOut,Ref<DataCursor> pMonitorCredsOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_TARGET.GET_TARGET_INFO", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TARGET_NAME", pTargetName);
			cmd.addParameter("@P_TARGET_TYPE", pTargetType);
			cmd.addParameter("@P_BASIC_INFO_OUT", DataCursor.class);
			cmd.addParameter("@P_PROPERTIES_OUT", DataCursor.class);
			cmd.addParameter("@P_COMPOSITEINFO_OUT", DataCursor.class);
			cmd.addParameter("@P_MEMBERINFO_OUT", DataCursor.class);
			cmd.addParameter("@P_MONITOR_CREDS_OUT", DataCursor.class);
				
			cmd.execute();
			pBasicInfoOut.val = cmd.getParameterValue("@P_BASIC_INFO_OUT", DataCursor.class);
			pPropertiesOut.val = cmd.getParameterValue("@P_PROPERTIES_OUT", DataCursor.class);
			pCompositeinfoOut.val = cmd.getParameterValue("@P_COMPOSITEINFO_OUT", DataCursor.class);
			pMemberinfoOut.val = cmd.getParameterValue("@P_MEMBERINFO_OUT", DataCursor.class);
			pMonitorCredsOut.val = cmd.getParameterValue("@P_MONITOR_CREDS_OUT", DataCursor.class);


		}
		
//		public static void getTargetListViewSummary(List<MgmtGuidArrayRow> targetsIn,NNumber listModeIn,NString searchTargetNameIn,NNumber timeperiodIn,Ref<DataCursor> summaryOut) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_TARGET.GET_TARGET_LIST_VIEW_SUMMARY", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getCollectionType("TARGETS_IN", "", targetsIn, object.class));
//			cmd.addParameter("@LIST_MODE_IN", listModeIn);
//			cmd.addParameter("@SEARCH_TARGET_NAME_IN", searchTargetNameIn);
//			cmd.addParameter("@TIMEPERIOD_IN", timeperiodIn);
//			cmd.addParameter("@SUMMARY_OUT", DataCursor.class);
//				
//			cmd.execute();
//			summaryOut.val = cmd.getParameterValue("@SUMMARY_OUT", DataCursor.class);
//
//
//		}
		
		public static NNumber FgetTargetMaxSeverity(NString targetNameIn,NString targetTypeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_TARGET.GET_TARGET_MAX_SEVERITY", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@TARGET_NAME_IN", targetNameIn);
			cmd.addParameter("@TARGET_TYPE_IN", targetTypeIn);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber FgetTargetMaxSeverity(byte[] targetGuidIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_TARGET.GET_TARGET_MAX_SEVERITY", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@TARGET_GUID_IN", targetGuidIn);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static void getTargetMonitoringSummary(NString targetNameIn,NString targetTypeIn,NString searchTargetNameIn,NNumber timeperiodIn,Ref<DataCursor> summaryOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_TARGET.GET_TARGET_MONITORING_SUMMARY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TARGET_NAME_IN", targetNameIn);
			cmd.addParameter("@TARGET_TYPE_IN", targetTypeIn);
			cmd.addParameter("@SEARCH_TARGET_NAME_IN", searchTargetNameIn);
			cmd.addParameter("@TIMEPERIOD_IN", timeperiodIn);
			cmd.addParameter("@SUMMARY_OUT", DataCursor.class);
				
			cmd.execute();
			summaryOut.val = cmd.getParameterValue("@SUMMARY_OUT", DataCursor.class);


		}
		
		public static NNumber FgetTargetNumSeverity(byte[] targetGuidIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_TARGET.GET_TARGET_NUM_SEVERITY", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@TARGET_GUID_IN", targetGuidIn);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
//		public static void getTargetSubtabSummary(NString targetTypeIn,List<MgmtGuidArrayRow> targetsIn,NString searchTargetNameIn,NNumber timeperiodIn,Ref<DataCursor> summaryOut) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_TARGET.GET_TARGET_SUBTAB_SUMMARY", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@TARGET_TYPE_IN", targetTypeIn);
//			// cmd.addParameter(DbTypes.getCollectionType("TARGETS_IN", "", targetsIn, object.class));
//			cmd.addParameter("@SEARCH_TARGET_NAME_IN", searchTargetNameIn);
//			cmd.addParameter("@TIMEPERIOD_IN", timeperiodIn);
//			cmd.addParameter("@SUMMARY_OUT", DataCursor.class);
//				
//			cmd.execute();
//			summaryOut.val = cmd.getParameterValue("@SUMMARY_OUT", DataCursor.class);
//
//
//		}
		
		public static NNumber FgetTimeDifference(NNumber timeperiodIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_TARGET.GET_TIME_DIFFERENCE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@TIMEPERIOD_IN", timeperiodIn);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static void getTrafficLightInfo(NString targetNameIn,NString targetTypeIn,NNumber timeperiodIn,Ref<NNumber> availPctOut,Ref<NNumber> currentStatusOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_TARGET.GET_TRAFFIC_LIGHT_INFO", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TARGET_NAME_IN", targetNameIn);
			cmd.addParameter("@TARGET_TYPE_IN", targetTypeIn);
			cmd.addParameter("@TIMEPERIOD_IN", timeperiodIn);
			cmd.addParameter("@AVAIL_PCT_OUT", NNumber.class);
			cmd.addParameter("@CURRENT_STATUS_OUT", NNumber.class);
				
			cmd.execute();
			availPctOut.val = cmd.getParameterValue("@AVAIL_PCT_OUT", NNumber.class);
			currentStatusOut.val = cmd.getParameterValue("@CURRENT_STATUS_OUT", NNumber.class);


		}
		
		public static NString FgetTypeProperty(NString pTargetType,NString pPropertyName,NString pDefault) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_TARGET.GET_TYPE_PROPERTY", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_TARGET_TYPE", pTargetType);
			cmd.addParameter("@P_PROPERTY_NAME", pPropertyName);
			cmd.addParameter("@P_DEFAULT", pDefault);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void getTypeUdtp(NString pTargetType,NString pTypeMetaVer,Ref<DataCursor> pUdtpDefsOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_TARGET.GET_TYPE_UDTP", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TARGET_TYPE", pTargetType);
			cmd.addParameter("@P_TYPE_META_VER", pTypeMetaVer);
			cmd.addParameter("@P_UDTP_DEFS_OUT", DataCursor.class);
				
			cmd.execute();
			pUdtpDefsOut.val = cmd.getParameterValue("@P_UDTP_DEFS_OUT", DataCursor.class);


		}
		
//		public static void getUserTargets(NString userNameIn,Ref<List<MgmtUserObjectsRow>> userObjectsOut,NNumber typeIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_TARGET.GET_USER_TARGETS", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@USER_NAME_IN", userNameIn);
//			// cmd.addParameter(DbTypes.getCollectionType("USER_OBJECTS_OUT", "", object.class));
//			cmd.addParameter("@TYPE_IN", typeIn);
//				
//			cmd.execute();
//			// userObjectsOut.val = cmd.getTableParameterValue("@USER_OBJECTS_OUT", object.class);
//
//
//		}
		
		public static NNumber FisAggregateType(NString pTargetType) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_TARGET.IS_AGGREGATE_TYPE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_TARGET_TYPE", pTargetType);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber FisMultiAgentTarget(NString pTargetName,NString pTargetType) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_TARGET.IS_MULTI_AGENT_TARGET", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_TARGET_NAME", pTargetName);
			cmd.addParameter("@P_TARGET_TYPE", pTargetType);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
//		public static void modifyGroup(NString pGroupName,NString pGroupType,List<SmpEmdNvpairArrayRow> pTargetsToAdd,List<SmpEmdNvpairArrayRow> pTargetsToRemove,NString pGroupOwner) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_TARGET.MODIFY_GROUP", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_GROUP_NAME", pGroupName);
//			cmd.addParameter("@P_GROUP_TYPE", pGroupType);
//			// cmd.addParameter(DbTypes.getCollectionType("P_TARGETS_TO_ADD", "", pTargetsToAdd, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("P_TARGETS_TO_REMOVE", "", pTargetsToRemove, object.class));
//			cmd.addParameter("@P_GROUP_OWNER", pGroupOwner);
//				
//			cmd.execute();
//
//
//		}
		
//		public static void modifyRepoMetricCollection( vMetric,NString vEvalProc,List<MgmtMetricInstanceArrayRow> vDepMetrics,NNumber vCollInterval,NNumber vOptCode) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_TARGET.MODIFY_REPO_METRIC_COLLECTION", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@V_METRIC", vMetric);
//			cmd.addParameter("@V_EVAL_PROC", vEvalProc);
//			// cmd.addParameter(DbTypes.getCollectionType("V_DEP_METRICS", "", vDepMetrics, object.class));
//			cmd.addParameter("@V_COLL_INTERVAL", vCollInterval);
//			cmd.addParameter("@V_OPT_CODE", vOptCode);
//				
//			cmd.execute();
//
//
//		}
		
//		public static void modifyRepoMetricDeps( vMetric,List<MgmtMetricInstanceArrayRow> vDepMetricsToAdd,List<MgmtMetricInstanceArrayRow> vDepMetricsToDel) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_TARGET.MODIFY_REPO_METRIC_DEPS", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@V_METRIC", vMetric);
//			// cmd.addParameter(DbTypes.getCollectionType("V_DEP_METRICS_TO_ADD", "", vDepMetricsToAdd, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("V_DEP_METRICS_TO_DEL", "", vDepMetricsToDel, object.class));
//				
//			cmd.execute();
//
//
//		}
		
//		public static void modifyTarget(NString pTargetName,NString pTargetType,List<MgmtTargetPropertyListRow> pProperties,List<SmpEmdNvpairArrayRow> pMemberTargetsToAdd,List<SmpEmdNvpairArrayRow> pMemberTargetsToRemove,List<SmpEmdNvpairArrayRow> pMonitoringCredentials,NString pTargetDisplayName,NNumber pPropagateToAgent,NString pTargetOwner) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_TARGET.MODIFY_TARGET", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_TARGET_NAME", pTargetName);
//			cmd.addParameter("@P_TARGET_TYPE", pTargetType);
//			// cmd.addParameter(DbTypes.getCollectionType("P_PROPERTIES", "", pProperties, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("P_MEMBER_TARGETS_TO_ADD", "", pMemberTargetsToAdd, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("P_MEMBER_TARGETS_TO_REMOVE", "", pMemberTargetsToRemove, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("P_MONITORING_CREDENTIALS", "", pMonitoringCredentials, object.class));
//			cmd.addParameter("@P_TARGET_DISPLAY_NAME", pTargetDisplayName);
//			cmd.addParameter("@P_PROPAGATE_TO_AGENT", pPropagateToAgent);
//			cmd.addParameter("@P_TARGET_OWNER", pTargetOwner);
//				
//			cmd.execute();
//
//
//		}
		
		public static void moveTarget(NString pTargetName,NString pTargetType,NString pNewEmdUrl) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_TARGET.MOVE_TARGET", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TARGET_NAME", pTargetName);
			cmd.addParameter("@P_TARGET_TYPE", pTargetType);
			cmd.addParameter("@P_NEW_EMD_URL", pNewEmdUrl);
				
			cmd.execute();


		}
		
		public static void reassignUserTargets(NString userNameIn,NString newUserNameIn,NNumber typeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_TARGET.REASSIGN_USER_TARGETS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@USER_NAME_IN", userNameIn);
			cmd.addParameter("@NEW_USER_NAME_IN", newUserNameIn);
			cmd.addParameter("@TYPE_IN", typeIn);
				
			cmd.execute();


		}
		
//		public static void registerTargetType(NString pTargetTypeIn,NString pTypeDisplayNameIn,NString pTypeDisplayNlsidIn,List<SmpEmdNvpairArrayRow> pTypePropertyListIn,NString pTypeResourceBundleIn,NString pTypeMetaVerIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_TARGET.REGISTER_TARGET_TYPE", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_TARGET_TYPE_IN", pTargetTypeIn);
//			cmd.addParameter("@P_TYPE_DISPLAY_NAME_IN", pTypeDisplayNameIn);
//			cmd.addParameter("@P_TYPE_DISPLAY_NLSID_IN", pTypeDisplayNlsidIn);
//			// cmd.addParameter(DbTypes.getCollectionType("P_TYPE_PROPERTY_LIST_IN", "", pTypePropertyListIn, object.class));
//			cmd.addParameter("@P_TYPE_RESOURCE_BUNDLE_IN", pTypeResourceBundleIn);
//			cmd.addParameter("@P_TYPE_META_VER_IN", pTypeMetaVerIn);
//				
//			cmd.execute();
//
//
//		}
		
		public static void removeClusterMember(NString pClusterName,NString pClusterType,NString pMemberName,NString pMemberType) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_TARGET.REMOVE_CLUSTER_MEMBER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CLUSTER_NAME", pClusterName);
			cmd.addParameter("@P_CLUSTER_TYPE", pClusterType);
			cmd.addParameter("@P_MEMBER_NAME", pMemberName);
			cmd.addParameter("@P_MEMBER_TYPE", pMemberType);
				
			cmd.execute();


		}
		
		public static void setAgentTzrgn(NString pAgentName,NString pTimezoneRegion) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_TARGET.SET_AGENT_TZRGN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AGENT_NAME", pAgentName);
			cmd.addParameter("@P_TIMEZONE_REGION", pTimezoneRegion);
				
			cmd.execute();


		}
		
		public static void setInstanceTargetProperty(NString pTargetName,NString pTargetType,NString pPropertyName,NString pPropertyValue) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_TARGET.SET_INSTANCE_TARGET_PROPERTY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TARGET_NAME", pTargetName);
			cmd.addParameter("@P_TARGET_TYPE", pTargetType);
			cmd.addParameter("@P_PROPERTY_NAME", pPropertyName);
			cmd.addParameter("@P_PROPERTY_VALUE", pPropertyValue);
				
			cmd.execute();


		}
		
		public static void setMasterAgent(NString pTargetName,NString pTargetType,NString pAgentName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_TARGET.SET_MASTER_AGENT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TARGET_NAME", pTargetName);
			cmd.addParameter("@P_TARGET_TYPE", pTargetType);
			cmd.addParameter("@P_AGENT_NAME", pAgentName);
				
			cmd.execute();


		}
		
//		public static void setRepoMetricEvalProc( vMetric,NString vEvalProc,NNumber vOptCode) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_TARGET.SET_REPO_METRIC_EVAL_PROC", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@V_METRIC", vMetric);
//			cmd.addParameter("@V_EVAL_PROC", vEvalProc);
//			cmd.addParameter("@V_OPT_CODE", vOptCode);
//				
//			cmd.execute();
//
//
//		}
		
//		public static void setTargetProperties(NString pTargetName,NString pTargetType,List<MgmtTargetPropertyListRow> pProperties) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_TARGET.SET_TARGET_PROPERTIES", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_TARGET_NAME", pTargetName);
//			cmd.addParameter("@P_TARGET_TYPE", pTargetType);
//			// cmd.addParameter(DbTypes.getCollectionType("P_PROPERTIES", "", pProperties, object.class));
//				
//			cmd.execute();
//
//
//		}
		
		public static void setTargetProperty(NString pTargetName,NString pTargetType,NString pPropertyName,NString pPropertyType,NString pPropertyValue) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_TARGET.SET_TARGET_PROPERTY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TARGET_NAME", pTargetName);
			cmd.addParameter("@P_TARGET_TYPE", pTargetType);
			cmd.addParameter("@P_PROPERTY_NAME", pPropertyName);
			cmd.addParameter("@P_PROPERTY_TYPE", pPropertyType);
			cmd.addParameter("@P_PROPERTY_VALUE", pPropertyValue);
				
			cmd.execute();


		}
		
		public static void setTargetTzrgn(NString pTargetName,NString pTargetType,NString pTimezoneRegion) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_TARGET.SET_TARGET_TZRGN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TARGET_NAME", pTargetName);
			cmd.addParameter("@P_TARGET_TYPE", pTargetType);
			cmd.addParameter("@P_TIMEZONE_REGION", pTimezoneRegion);
				
			cmd.execute();


		}
		
		public static NDate FsysdateTarget(byte[] pTargetGuid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_TARGET.SYSDATE_TARGET", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NDate.class);
			cmd.addParameter("@P_TARGET_GUID", pTargetGuid);
				
			cmd.execute();

			return cmd.getReturnValue(NDate.class);

		}
		
		public static void upsertTargetPropertyDef(NString vTargetType,NString vTypeMetaVer,NString vPropertyName,NString vPropertyType,NString vPropertyDisplayName,NString vPropertyDisplayNlsid,NNumber vRequiredFlag,NNumber vCredentialFlag,NString vDefaultValue,NNumber vComputedFlag,NNumber vSystemFlag,NNumber vAllVersions,NNumber vReadOnlyFlag,NNumber vHiddenFlag) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_TARGET.UPSERT_TARGET_PROPERTY_DEF", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@V_TARGET_TYPE", vTargetType);
			cmd.addParameter("@V_TYPE_META_VER", vTypeMetaVer);
			cmd.addParameter("@V_PROPERTY_NAME", vPropertyName);
			cmd.addParameter("@V_PROPERTY_TYPE", vPropertyType);
			cmd.addParameter("@V_PROPERTY_DISPLAY_NAME", vPropertyDisplayName);
			cmd.addParameter("@V_PROPERTY_DISPLAY_NLSID", vPropertyDisplayNlsid);
			cmd.addParameter("@V_REQUIRED_FLAG", vRequiredFlag);
			cmd.addParameter("@V_CREDENTIAL_FLAG", vCredentialFlag);
			cmd.addParameter("@V_DEFAULT_VALUE", vDefaultValue);
			cmd.addParameter("@V_COMPUTED_FLAG", vComputedFlag);
			cmd.addParameter("@V_SYSTEM_FLAG", vSystemFlag);
			cmd.addParameter("@V_ALL_VERSIONS", vAllVersions);
			cmd.addParameter("@V_READ_ONLY_FLAG", vReadOnlyFlag);
			cmd.addParameter("@V_HIDDEN_FLAG", vHiddenFlag);
				
			cmd.execute();


		}
		
	
	
	
}
