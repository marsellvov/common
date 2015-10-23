package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class MgmtAdmin {
		public static void addTargetAdditionCallback(NString pProcedureNameIn,NString pTargetTypeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_ADMIN.ADD_TARGET_ADDITION_CALLBACK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PROCEDURE_NAME_IN", pProcedureNameIn);
			cmd.addParameter("@P_TARGET_TYPE_IN", pTargetTypeIn);
				
			cmd.execute();


		}
		
		public static void addTargetDeletionCallback(NString pProcedureNameIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_ADMIN.ADD_TARGET_DELETION_CALLBACK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PROCEDURE_NAME_IN", pProcedureNameIn);
				
			cmd.execute();


		}
		
//		public static void addTargetDeletionExceptions(List<SmpEmdStringArrayRow> pExceptionsIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_ADMIN.ADD_TARGET_DELETION_EXCEPTIONS", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getCollectionType("P_EXCEPTIONS_IN", "", pExceptionsIn, object.class));
//				
//			cmd.execute();
//
//
//		}
		
		public static void cleanupAgent(NString vAgentNameIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_ADMIN.CLEANUP_AGENT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@V_AGENT_NAME_IN", vAgentNameIn);
				
			cmd.execute();


		}
		
		public static void delTargetAdditionCallback(NString pProcedureNameIn,NString pTargetTypeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_ADMIN.DEL_TARGET_ADDITION_CALLBACK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PROCEDURE_NAME_IN", pProcedureNameIn);
			cmd.addParameter("@P_TARGET_TYPE_IN", pTargetTypeIn);
				
			cmd.execute();


		}
		
		public static void deleteOms(NString omsnameIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_ADMIN.DELETE_OMS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@OMSNAME_IN", omsnameIn);
				
			cmd.execute();


		}
		
		public static void deleteTarget(NString targetNameIn,NString targetTypeIn,NNumber deleteMembersIn,NNumber deleteHostsIn,NNumber forceDeleteIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_ADMIN.DELETE_TARGET", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TARGET_NAME_IN", targetNameIn);
			cmd.addParameter("@TARGET_TYPE_IN", targetTypeIn);
			cmd.addParameter("@DELETE_MEMBERS_IN", deleteMembersIn);
			cmd.addParameter("@DELETE_HOSTS_IN", deleteHostsIn);
			cmd.addParameter("@FORCE_DELETE_IN", forceDeleteIn);
				
			cmd.execute();


		}
		
		public static void deleteTarget(NString targetNameIn,NString targetTypeIn,NBool raiseCompositeErrorIn,NBool submitJobIn,NBool deleteMembersIn,NBool deleteHostsIn,NBool forceDeleteIn,NBool deleteSyncIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_ADMIN.DELETE_TARGET", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TARGET_NAME_IN", targetNameIn);
			cmd.addParameter("@TARGET_TYPE_IN", targetTypeIn);
			cmd.addParameter("@RAISE_COMPOSITE_ERROR_IN", raiseCompositeErrorIn);
			cmd.addParameter("@SUBMIT_JOB_IN", submitJobIn);
			cmd.addParameter("@DELETE_MEMBERS_IN", deleteMembersIn);
			cmd.addParameter("@DELETE_HOSTS_IN", deleteHostsIn);
			cmd.addParameter("@FORCE_DELETE_IN", forceDeleteIn);
			cmd.addParameter("@DELETE_SYNC_IN", deleteSyncIn);
				
			cmd.execute();


		}
		
		public static void deleteTargetInternal(NString targetNameIn,NString targetTypeIn,NString delCompleteTimeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_ADMIN.DELETE_TARGET_INTERNAL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TARGET_NAME_IN", targetNameIn);
			cmd.addParameter("@TARGET_TYPE_IN", targetTypeIn);
			cmd.addParameter("@DEL_COMPLETE_TIME_IN", delCompleteTimeIn);
				
			cmd.execute();


		}
		
//		public static void deleteTargetMetrics1day(List<MgmtTargetGuidArrayRow> pTargetGuids) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_ADMIN.DELETE_TARGET_METRICS_1DAY", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getCollectionType("P_TARGET_GUIDS", "", pTargetGuids, object.class));
//				
//			cmd.execute();
//
//
//		}
		
//		public static void deleteTargetMetrics1hour(List<MgmtTargetGuidArrayRow> pTargetGuids) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_ADMIN.DELETE_TARGET_METRICS_1HOUR", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getCollectionType("P_TARGET_GUIDS", "", pTargetGuids, object.class));
//				
//			cmd.execute();
//
//
//		}
		
//		public static void deleteTargetMetricsRaw(List<MgmtTargetGuidArrayRow> pTargetGuids) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_ADMIN.DELETE_TARGET_METRICS_RAW", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getCollectionType("P_TARGET_GUIDS", "", pTargetGuids, object.class));
//				
//			cmd.execute();
//
//
//		}
		
		public static void deleteTargetSync(NString targetNameIn,NString targetTypeIn,NNumber deleteMembersIn,NNumber deleteHostsIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_ADMIN.DELETE_TARGET_SYNC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TARGET_NAME_IN", targetNameIn);
			cmd.addParameter("@TARGET_TYPE_IN", targetTypeIn);
			cmd.addParameter("@DELETE_MEMBERS_IN", deleteMembersIn);
			cmd.addParameter("@DELETE_HOSTS_IN", deleteHostsIn);
				
			cmd.execute();


		}
		
		public static void disableMetricDeletion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_ADMIN.DISABLE_METRIC_DELETION", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void enableMetricDeletion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_ADMIN.ENABLE_METRIC_DELETION", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static NString FgetMsName() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_ADMIN.GET_MS_NAME", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor FgetOmsData(NString pOmsName,NString pHostName,NString pOc4jName,NString pIasName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_ADMIN.GET_OMS_DATA", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_OMS_NAME", pOmsName);
			cmd.addParameter("@P_HOST_NAME", pHostName);
			cmd.addParameter("@P_OC4J_NAME", pOc4jName);
			cmd.addParameter("@P_IAS_NAME", pIasName);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static NNumber FgetOmsStatus(NString pOmsHostUrl) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_ADMIN.GET_OMS_STATUS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_OMS_HOST_URL", pOmsHostUrl);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static DataCursor FgetOmsUrls() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_ADMIN.GET_OMS_URLS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static NNumber FisMetricDeletionEnabled() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_ADMIN.IS_METRIC_DELETION_ENABLED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static void setInactiveTime(byte[] pAgentGuid,NNumber pMaxInactiveTime) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_ADMIN.SET_INACTIVE_TIME", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AGENT_GUID", pAgentGuid);
			cmd.addParameter("@P_MAX_INACTIVE_TIME", pMaxInactiveTime);
				
			cmd.execute();


		}
		
		public static void setInactiveTime(NString pAgentName,NNumber pMaxInactiveTime) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_ADMIN.SET_INACTIVE_TIME", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AGENT_NAME", pAgentName);
			cmd.addParameter("@P_MAX_INACTIVE_TIME", pMaxInactiveTime);
				
			cmd.execute();


		}
		
		public static void setLogLevel(NString levelIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_ADMIN.SET_LOG_LEVEL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@LEVEL_IN", levelIn);
				
			cmd.execute();


		}
		
		public static void setLogPurge(NNumber hoursIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_ADMIN.SET_LOG_PURGE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@HOURS_IN", hoursIn);
				
			cmd.execute();


		}
		
	
	
	
}
