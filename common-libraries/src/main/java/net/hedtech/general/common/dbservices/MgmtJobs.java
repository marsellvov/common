package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class MgmtJobs {
		public static void addEvent(NString pEventName,NString pEventCallback) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_JOBS.ADD_EVENT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_EVENT_NAME", pEventName);
			cmd.addParameter("@P_EVENT_CALLBACK", pEventCallback);
				
			cmd.execute();


		}
		
//		public static void addJobParameters(byte[] pJobId,byte[] pExecutionId,List<MgmtJobParamListRow> pParamList) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_JOBS.ADD_JOB_PARAMETERS", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_JOB_ID", pJobId);
//			cmd.addParameter("@P_EXECUTION_ID", pExecutionId);
//			// cmd.addParameter(DbTypes.getCollectionType("P_PARAM_LIST", "", pParamList, object.class));
//				
//			cmd.execute();
//
//
//		}
		
//		public static void associateEventWithExecution(byte[] pExecutionId,NString pEventName,List<SmpEmdNvpairArrayRow> pEventParams) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_JOBS.ASSOCIATE_EVENT_WITH_EXECUTION", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_EXECUTION_ID", pExecutionId);
//			cmd.addParameter("@P_EVENT_NAME", pEventName);
//			// cmd.addParameter(DbTypes.getCollectionType("P_EVENT_PARAMS", "", pEventParams, object.class));
//				
//			cmd.execute();
//
//
//		}
		
//		public static void createLibraryJob(NString pJobName,NString pDescription,NString pJobType,List<MgmtJobTargetListRow> pJobTargets,List<MgmtJobParamListRow> pJobParams,Ref<> pSchedule,Ref<byte[]> pJobIdOut,List<MgmtJobCredArrayRow> pJobCreds,NString pJobTargetType,List<SmpEmdIntegerArrayRow> pJobNotifyStates) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_JOBS.CREATE_LIBRARY_JOB", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_JOB_NAME", pJobName);
//			cmd.addParameter("@P_DESCRIPTION", pDescription);
//			cmd.addParameter("@P_JOB_TYPE", pJobType);
//			// cmd.addParameter(DbTypes.getCollectionType("P_JOB_TARGETS", "", pJobTargets, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("P_JOB_PARAMS", "", pJobParams, object.class));
//			cmd.addParameter("@P_SCHEDULE", pSchedule, true);
//			cmd.addParameter("@P_JOB_ID_OUT", byte[].class);
//			// cmd.addParameter(DbTypes.getCollectionType("P_JOB_CREDS", "", pJobCreds, object.class));
//			cmd.addParameter("@P_JOB_TARGET_TYPE", pJobTargetType);
//			// cmd.addParameter(DbTypes.getCollectionType("P_JOB_NOTIFY_STATES", "", pJobNotifyStates, object.class));
//				
//			cmd.execute();
//			pSchedule.val = cmd.getParameterValue("@P_SCHEDULE", .class);
//			pJobIdOut.val = cmd.getParameterValue("@P_JOB_ID_OUT", byte[].class);
//
//
//		}
		
		public static void deleteAllExecutions(NString pJobName,NString pJobOwner,NNumber pCommit,NNumber pIsLibrary) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_JOBS.DELETE_ALL_EXECUTIONS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_JOB_NAME", pJobName);
			cmd.addParameter("@P_JOB_OWNER", pJobOwner);
			cmd.addParameter("@P_COMMIT", pCommit);
			cmd.addParameter("@P_IS_LIBRARY", pIsLibrary);
				
			cmd.execute();


		}
		
		public static void deleteJob(NString pJobName,NString pJobOwner,NNumber pCommit,NNumber pIsLibrary) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_JOBS.DELETE_JOB", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_JOB_NAME", pJobName);
			cmd.addParameter("@P_JOB_OWNER", pJobOwner);
			cmd.addParameter("@P_COMMIT", pCommit);
			cmd.addParameter("@P_IS_LIBRARY", pIsLibrary);
				
			cmd.execute();


		}
		
		public static void deleteJob(NString pJobName,NNumber pCommit,NNumber pIsLibrary) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_JOBS.DELETE_JOB", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_JOB_NAME", pJobName);
			cmd.addParameter("@P_COMMIT", pCommit);
			cmd.addParameter("@P_IS_LIBRARY", pIsLibrary);
				
			cmd.execute();


		}
		
		public static void deleteJob(byte[] pJobId,NNumber pCommit) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_JOBS.DELETE_JOB", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_JOB_ID", pJobId);
			cmd.addParameter("@P_COMMIT", pCommit);
				
			cmd.execute();


		}
		
		public static void deleteJobExecution(byte[] pExecutionId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_JOBS.DELETE_JOB_EXECUTION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_EXECUTION_ID", pExecutionId);
				
			cmd.execute();


		}
		
//		public static void deleteJobExecutions(List<MgmtJobGuidArrayRow> pExecutionIds,NNumber pCommit) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_JOBS.DELETE_JOB_EXECUTIONS", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getCollectionType("P_EXECUTION_IDS", "", pExecutionIds, object.class));
//			cmd.addParameter("@P_COMMIT", pCommit);
//				
//			cmd.execute();
//
//
//		}
		
		public static void deleteJobRun(NString pJobName,NString pJobOwner,NDate pScheduledTime) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_JOBS.DELETE_JOB_RUN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_JOB_NAME", pJobName);
			cmd.addParameter("@P_JOB_OWNER", pJobOwner);
			cmd.addParameter("@P_SCHEDULED_TIME", pScheduledTime);
				
			cmd.execute();


		}
		
		public static void deregisterCommandBlockProc(NString pProcName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_JOBS.DEREGISTER_COMMAND_BLOCK_PROC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PROC_NAME", pProcName);
				
			cmd.execute();


		}
		
		public static void dropPurgePolicy(NString pPolicyName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_JOBS.DROP_PURGE_POLICY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_POLICY_NAME", pPolicyName);
				
			cmd.execute();


		}
		
//		public static void editJob(NString pJobName,NString pOwner,NNumber pIsLibrary,NString pDescription,List<MgmtJobParamListRow> pParams,List<MgmtJobTargetListRow> pTargets, pSchedule,List<MgmtJobCredArrayRow> pOverriddenCreds,List<SmpEmdIntegerArrayRow> pJobNotifyStates) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_JOBS.EDIT_JOB", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_JOB_NAME", pJobName);
//			cmd.addParameter("@P_OWNER", pOwner);
//			cmd.addParameter("@P_IS_LIBRARY", pIsLibrary);
//			cmd.addParameter("@P_DESCRIPTION", pDescription);
//			// cmd.addParameter(DbTypes.getCollectionType("P_PARAMS", "", pParams, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("P_TARGETS", "", pTargets, object.class));
//			cmd.addParameter("@P_SCHEDULE", pSchedule);
//			// cmd.addParameter(DbTypes.getCollectionType("P_OVERRIDDEN_CREDS", "", pOverriddenCreds, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("P_JOB_NOTIFY_STATES", "", pJobNotifyStates, object.class));
//				
//			cmd.execute();
//
//
//		}
		
//		public static void editJob(NString pJobName,NString pOwner,NNumber pIsLibrary,NString pDescription,List<MgmtJobParamListRow> pParams,List<MgmtJobTargetListArrayRow> pTargets, pSchedule,List<MgmtJobCredArrayRow> pOverriddenCreds,List<SmpEmdIntegerArrayRow> pJobNotifyStates) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_JOBS.EDIT_JOB", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_JOB_NAME", pJobName);
//			cmd.addParameter("@P_OWNER", pOwner);
//			cmd.addParameter("@P_IS_LIBRARY", pIsLibrary);
//			cmd.addParameter("@P_DESCRIPTION", pDescription);
//			// cmd.addParameter(DbTypes.getCollectionType("P_PARAMS", "", pParams, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("P_TARGETS", "", pTargets, object.class));
//			cmd.addParameter("@P_SCHEDULE", pSchedule);
//			// cmd.addParameter(DbTypes.getCollectionType("P_OVERRIDDEN_CREDS", "", pOverriddenCreds, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("P_JOB_NOTIFY_STATES", "", pJobNotifyStates, object.class));
//				
//			cmd.execute();
//
//
//		}
		
//		public static  FgetImmediateScheduleRecord() {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_JOBS.GET_IMMEDIATE_SCHEDULE_RECORD", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
		
		public static void getJobGrants(byte[] jobIdIn,Ref<NString> ownerOut,Ref<DataCursor> granteesOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_JOBS.GET_JOB_GRANTS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@JOB_ID_IN", jobIdIn);
			cmd.addParameter("@OWNER_OUT", NString.class);
			cmd.addParameter("@GRANTEES_OUT", DataCursor.class);
				
			cmd.execute();
			ownerOut.val = cmd.getParameterValue("@OWNER_OUT", NString.class);
			granteesOut.val = cmd.getParameterValue("@GRANTEES_OUT", DataCursor.class);


		}
		
//		public static void getJobGrantsForSet(byte[] jobIdIn,List<SmpEmdStringArrayRow> namesIn,Ref<NString> ownerOut,Ref<DataCursor> granteesOut) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_JOBS.GET_JOB_GRANTS_FOR_SET", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@JOB_ID_IN", jobIdIn);
//			// cmd.addParameter(DbTypes.getCollectionType("NAMES_IN", "", namesIn, object.class));
//			cmd.addParameter("@OWNER_OUT", NString.class);
//			cmd.addParameter("@GRANTEES_OUT", DataCursor.class);
//				
//			cmd.execute();
//			ownerOut.val = cmd.getParameterValue("@OWNER_OUT", NString.class);
//			granteesOut.val = cmd.getParameterValue("@GRANTEES_OUT", DataCursor.class);
//
//
//		}
		
//		public static  FgetJobScheduleRecord(NNumber pFrequencyCode,NDate pStartTime,NDate pEndTime,NNumber pExecutionHours,NNumber pExecutionMinutes,NNumber pInterval,List<MgmtJobIntArrayRow> pMonths,List<MgmtJobIntArrayRow> pDays,NNumber pTimezoneInfo,NNumber pTimezoneTargetIndex,NNumber pTimezoneOffset,NString pTimezoneRegion,NNumber pStartGracePeriod) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_JOBS.GET_JOB_SCHEDULE_RECORD", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@P_FREQUENCY_CODE", pFrequencyCode);
//			cmd.addParameter("@P_START_TIME", pStartTime);
//			cmd.addParameter("@P_END_TIME", pEndTime);
//			cmd.addParameter("@P_EXECUTION_HOURS", pExecutionHours);
//			cmd.addParameter("@P_EXECUTION_MINUTES", pExecutionMinutes);
//			cmd.addParameter("@P_INTERVAL", pInterval);
//			// cmd.addParameter(DbTypes.getCollectionType("P_MONTHS", "", pMonths, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("P_DAYS", "", pDays, object.class));
//			cmd.addParameter("@P_TIMEZONE_INFO", pTimezoneInfo);
//			cmd.addParameter("@P_TIMEZONE_TARGET_INDEX", pTimezoneTargetIndex);
//			cmd.addParameter("@P_TIMEZONE_OFFSET", pTimezoneOffset);
//			cmd.addParameter("@P_TIMEZONE_REGION", pTimezoneRegion);
//			cmd.addParameter("@P_START_GRACE_PERIOD", pStartGracePeriod);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
		
		public static NString FgetLargeParam(byte[] pJobId,byte[] pExecutionId,NString pParameterName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_JOBS.GET_LARGE_PARAM", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_JOB_ID", pJobId);
			cmd.addParameter("@P_EXECUTION_ID", pExecutionId);
			cmd.addParameter("@P_PARAMETER_NAME", pParameterName);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber FgetStatusBucket(NNumber pStatus) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_JOBS.GET_STATUS_BUCKET", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_STATUS", pStatus);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static void insertStepErrorMessage(NNumber pStepId,NString pErrorMessage) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_JOBS.INSERT_STEP_ERROR_MESSAGE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_STEP_ID", pStepId);
			cmd.addParameter("@P_ERROR_MESSAGE", pErrorMessage);
				
			cmd.execute();


		}
		
//		public static void raiseEvent(NString pEventName,List<SmpEmdNvpairArrayRow> pEventParams) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_JOBS.RAISE_EVENT", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_EVENT_NAME", pEventName);
//			// cmd.addParameter(DbTypes.getCollectionType("P_EVENT_PARAMS", "", pEventParams, object.class));
//				
//			cmd.execute();
//
//
//		}
		
		public static void registerCommand(NString pCommandName,NString pClassName,NNumber pCommandType,NNumber pIsTrustable) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_JOBS.REGISTER_COMMAND", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_COMMAND_NAME", pCommandName);
			cmd.addParameter("@P_CLASS_NAME", pClassName);
			cmd.addParameter("@P_COMMAND_TYPE", pCommandType);
			cmd.addParameter("@P_IS_TRUSTABLE", pIsTrustable);
				
			cmd.execute();


		}
		
//		public static void registerCommandBlockProc(NString pProcName,List<MgmtShortStringArrayRow> pParamTypes) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_JOBS.REGISTER_COMMAND_BLOCK_PROC", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_PROC_NAME", pProcName);
//			// cmd.addParameter(DbTypes.getCollectionType("P_PARAM_TYPES", "", pParamTypes, object.class));
//				
//			cmd.execute();
//
//
//		}
		
//		public static void registerPurgePolicy(NString pPolicyName,NNumber pTimeframe,List<MgmtJobPurgeCriterionListRow> pPurgeCriteria) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_JOBS.REGISTER_PURGE_POLICY", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_POLICY_NAME", pPolicyName);
//			cmd.addParameter("@P_TIMEFRAME", pTimeframe);
//			// cmd.addParameter(DbTypes.getCollectionType("P_PURGE_CRITERIA", "", pPurgeCriteria, object.class));
//				
//			cmd.execute();
//
//
//		}
		
//		public static byte[] FrestartJob(byte[] pJobId,NNumber pTargetListIndex,List<MgmtJobParamListRow> pParams) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_JOBS.RESTART_JOB", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(byte[].class);
//			cmd.addParameter("@P_JOB_ID", pJobId);
//			cmd.addParameter("@P_TARGET_LIST_INDEX", pTargetListIndex);
//			// cmd.addParameter(DbTypes.getCollectionType("P_PARAMS", "", pParams, object.class));
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(byte[].class);
//
//		}
		
//		public static byte[] FrestartJob(byte[] pJobId,List<MgmtJobParamListRow> pParams) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_JOBS.RESTART_JOB", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(byte[].class);
//			cmd.addParameter("@P_JOB_ID", pJobId);
//			// cmd.addParameter(DbTypes.getCollectionType("P_PARAMS", "", pParams, object.class));
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(byte[].class);
//
//		}
		
//		public static byte[] FrestartJob(NString pJobName,NString pJobOwner,NNumber pTargetListIndex,List<MgmtJobParamListRow> pParams) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_JOBS.RESTART_JOB", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(byte[].class);
//			cmd.addParameter("@P_JOB_NAME", pJobName);
//			cmd.addParameter("@P_JOB_OWNER", pJobOwner);
//			cmd.addParameter("@P_TARGET_LIST_INDEX", pTargetListIndex);
//			// cmd.addParameter(DbTypes.getCollectionType("P_PARAMS", "", pParams, object.class));
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(byte[].class);
//
//		}
		
//		public static byte[] FrestartJobExecution(byte[] pExecId,List<MgmtJobParamListRow> pParams) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_JOBS.RESTART_JOB_EXECUTION", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(byte[].class);
//			cmd.addParameter("@P_EXEC_ID", pExecId);
//			// cmd.addParameter(DbTypes.getCollectionType("P_PARAMS", "", pParams, object.class));
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(byte[].class);
//
//		}
		
//		public static List<MgmtJobGuidArrayRow> FresubmitJob(byte[] pJobId) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_JOBS.RESUBMIT_JOB", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<MgmtJobGuidArrayRow>.class);
//			cmd.addParameter("@P_JOB_ID", pJobId);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<MgmtJobGuidArrayRow>.class);
//
//		}
		
//		public static List<MgmtJobGuidArrayRow> FresubmitJob(NString pJobName,NString pJobOwner) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_JOBS.RESUBMIT_JOB", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<MgmtJobGuidArrayRow>.class);
//			cmd.addParameter("@P_JOB_NAME", pJobName);
//			cmd.addParameter("@P_JOB_OWNER", pJobOwner);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<MgmtJobGuidArrayRow>.class);
//
//		}
		
		public static void resumeJob(NString pJobName,NString pJobOwner) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_JOBS.RESUME_JOB", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_JOB_NAME", pJobName);
			cmd.addParameter("@P_JOB_OWNER", pJobOwner);
				
			cmd.execute();


		}
		
		public static void resumeJobExecution(byte[] pExecutionId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_JOBS.RESUME_JOB_EXECUTION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_EXECUTION_ID", pExecutionId);
				
			cmd.execute();


		}
		
		public static void stopAllExecutions(NString pJobName,NString pJobOwner) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_JOBS.STOP_ALL_EXECUTIONS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_JOB_NAME", pJobName);
			cmd.addParameter("@P_JOB_OWNER", pJobOwner);
				
			cmd.execute();


		}
		
		public static void stopExecution(byte[] pExecutionId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_JOBS.STOP_EXECUTION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_EXECUTION_ID", pExecutionId);
				
			cmd.execute();


		}
		
//		public static void stopExecutions(List<MgmtJobGuidArrayRow> pExecutionIds) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_JOBS.STOP_EXECUTIONS", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getCollectionType("P_EXECUTION_IDS", "", pExecutionIds, object.class));
//				
//			cmd.execute();
//
//
//		}
		
		public static void stopJobRun(NString pJobName,NString pJobOwner,NDate pScheduledTime) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_JOBS.STOP_JOB_RUN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_JOB_NAME", pJobName);
			cmd.addParameter("@P_JOB_OWNER", pJobOwner);
			cmd.addParameter("@P_SCHEDULED_TIME", pScheduledTime);
				
			cmd.execute();


		}
		
//		public static void submitJob(NString pJobName,NString pDescription,NString pJobType,List<MgmtJobTargetListRow> pJobTargets,List<MgmtJobParamListRow> pJobParams,Ref<> pSchedule,Ref<byte[]> pJobIdOut,Ref<byte[]> pExecutionIdOut,NString pOwner,NNumber pSystemJob,List<MgmtJobCredArrayRow> pJobCreds,NString pJobTargetType,List<SmpEmdIntegerArrayRow> pJobNotifyStates) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_JOBS.SUBMIT_JOB", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_JOB_NAME", pJobName);
//			cmd.addParameter("@P_DESCRIPTION", pDescription);
//			cmd.addParameter("@P_JOB_TYPE", pJobType);
//			// cmd.addParameter(DbTypes.getCollectionType("P_JOB_TARGETS", "", pJobTargets, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("P_JOB_PARAMS", "", pJobParams, object.class));
//			cmd.addParameter("@P_SCHEDULE", pSchedule, true);
//			cmd.addParameter("@P_JOB_ID_OUT", byte[].class);
//			cmd.addParameter("@P_EXECUTION_ID_OUT", byte[].class);
//			cmd.addParameter("@P_OWNER", pOwner);
//			cmd.addParameter("@P_SYSTEM_JOB", pSystemJob);
//			// cmd.addParameter(DbTypes.getCollectionType("P_JOB_CREDS", "", pJobCreds, object.class));
//			cmd.addParameter("@P_JOB_TARGET_TYPE", pJobTargetType);
//			// cmd.addParameter(DbTypes.getCollectionType("P_JOB_NOTIFY_STATES", "", pJobNotifyStates, object.class));
//				
//			cmd.execute();
//			pSchedule.val = cmd.getParameterValue("@P_SCHEDULE", .class);
//			pJobIdOut.val = cmd.getParameterValue("@P_JOB_ID_OUT", byte[].class);
//			pExecutionIdOut.val = cmd.getParameterValue("@P_EXECUTION_ID_OUT", byte[].class);
//
//
//		}
		
//		public static void submitJob(NString pJobName,NString pDescription,NNumber pIsLibrary,NString pJobType,List<MgmtJobTargetListArrayRow> pJobTargets,List<MgmtJobParamListRow> pJobParams,Ref<> pSchedule,NNumber pExecutionTimeout,Ref<byte[]> pJobIdOut,Ref<List<MgmtJobGuidArrayRow>> pExecutionIdsOut,NString pOwner,NNumber pSystemJob,List<MgmtJobCredArrayRow> pJobCreds,NString pJobTargetType,List<SmpEmdStringArrayRow> pQueueNames,List<SmpEmdIntegerArrayRow> pJobNotifyStates) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_JOBS.SUBMIT_JOB", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_JOB_NAME", pJobName);
//			cmd.addParameter("@P_DESCRIPTION", pDescription);
//			cmd.addParameter("@P_IS_LIBRARY", pIsLibrary);
//			cmd.addParameter("@P_JOB_TYPE", pJobType);
//			// cmd.addParameter(DbTypes.getCollectionType("P_JOB_TARGETS", "", pJobTargets, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("P_JOB_PARAMS", "", pJobParams, object.class));
//			cmd.addParameter("@P_SCHEDULE", pSchedule, true);
//			cmd.addParameter("@P_EXECUTION_TIMEOUT", pExecutionTimeout);
//			cmd.addParameter("@P_JOB_ID_OUT", byte[].class);
//			// cmd.addParameter(DbTypes.getCollectionType("P_EXECUTION_IDS_OUT", "", object.class));
//			cmd.addParameter("@P_OWNER", pOwner);
//			cmd.addParameter("@P_SYSTEM_JOB", pSystemJob);
//			// cmd.addParameter(DbTypes.getCollectionType("P_JOB_CREDS", "", pJobCreds, object.class));
//			cmd.addParameter("@P_JOB_TARGET_TYPE", pJobTargetType);
//			// cmd.addParameter(DbTypes.getCollectionType("P_QUEUE_NAMES", "", pQueueNames, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("P_JOB_NOTIFY_STATES", "", pJobNotifyStates, object.class));
//				
//			cmd.execute();
//			pSchedule.val = cmd.getParameterValue("@P_SCHEDULE", .class);
//			pJobIdOut.val = cmd.getParameterValue("@P_JOB_ID_OUT", byte[].class);
//			// pExecutionIdsOut.val = cmd.getTableParameterValue("@P_EXECUTION_IDS_OUT", object.class);
//
//
//		}
		
//		public static void submitJobFromLibrary(NString pLibJobName,NString pLibJobOwner,NString pNewJobName,NString pJobDescription,List<MgmtJobTargetListRow> pJobTargets,List<MgmtJobParamListRow> pJobParams,NNumber pReplaceTargets,NNumber pReplaceParams, pSchedule,Ref<byte[]> pJobIdOut,Ref<byte[]> pExecutionIdOut,NNumber pSystemJob,List<MgmtJobCredArrayRow> pJobCreds,List<SmpEmdIntegerArrayRow> pJobNotifyStates) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_JOBS.SUBMIT_JOB_FROM_LIBRARY", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_LIB_JOB_NAME", pLibJobName);
//			cmd.addParameter("@P_LIB_JOB_OWNER", pLibJobOwner);
//			cmd.addParameter("@P_NEW_JOB_NAME", pNewJobName);
//			cmd.addParameter("@P_JOB_DESCRIPTION", pJobDescription);
//			// cmd.addParameter(DbTypes.getCollectionType("P_JOB_TARGETS", "", pJobTargets, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("P_JOB_PARAMS", "", pJobParams, object.class));
//			cmd.addParameter("@P_REPLACE_TARGETS", pReplaceTargets);
//			cmd.addParameter("@P_REPLACE_PARAMS", pReplaceParams);
//			cmd.addParameter("@P_SCHEDULE", pSchedule);
//			cmd.addParameter("@P_JOB_ID_OUT", byte[].class);
//			cmd.addParameter("@P_EXECUTION_ID_OUT", byte[].class);
//			cmd.addParameter("@P_SYSTEM_JOB", pSystemJob);
//			// cmd.addParameter(DbTypes.getCollectionType("P_JOB_CREDS", "", pJobCreds, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("P_JOB_NOTIFY_STATES", "", pJobNotifyStates, object.class));
//				
//			cmd.execute();
//			pJobIdOut.val = cmd.getParameterValue("@P_JOB_ID_OUT", byte[].class);
//			pExecutionIdOut.val = cmd.getParameterValue("@P_EXECUTION_ID_OUT", byte[].class);
//
//
//		}
		
//		public static void submitJobToQueue(NString pJobName,List<SmpEmdStringArrayRow> pQueueNames,NString pDescription,NString pJobType,List<MgmtJobTargetListRow> pJobTargets,List<MgmtJobParamListRow> pJobParams,NString pOwner,NNumber pSystemJob,List<MgmtJobCredArrayRow> pJobCreds,NString pJobTargetType,Ref<byte[]> pJobIdOut,Ref<List<MgmtJobGuidArrayRow>> pExecutionIdsOut) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_JOBS.SUBMIT_JOB_TO_QUEUE", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_JOB_NAME", pJobName);
//			// cmd.addParameter(DbTypes.getCollectionType("P_QUEUE_NAMES", "", pQueueNames, object.class));
//			cmd.addParameter("@P_DESCRIPTION", pDescription);
//			cmd.addParameter("@P_JOB_TYPE", pJobType);
//			// cmd.addParameter(DbTypes.getCollectionType("P_JOB_TARGETS", "", pJobTargets, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("P_JOB_PARAMS", "", pJobParams, object.class));
//			cmd.addParameter("@P_OWNER", pOwner);
//			cmd.addParameter("@P_SYSTEM_JOB", pSystemJob);
//			// cmd.addParameter(DbTypes.getCollectionType("P_JOB_CREDS", "", pJobCreds, object.class));
//			cmd.addParameter("@P_JOB_TARGET_TYPE", pJobTargetType);
//			cmd.addParameter("@P_JOB_ID_OUT", byte[].class);
//			// cmd.addParameter(DbTypes.getCollectionType("P_EXECUTION_IDS_OUT", "", object.class));
//				
//			cmd.execute();
//			pJobIdOut.val = cmd.getParameterValue("@P_JOB_ID_OUT", byte[].class);
//			// pExecutionIdsOut.val = cmd.getTableParameterValue("@P_EXECUTION_IDS_OUT", object.class);
//
//
//		}
		
		public static void suspendJob(NString pJobName,NString pJobOwner) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_JOBS.SUSPEND_JOB", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_JOB_NAME", pJobName);
			cmd.addParameter("@P_JOB_OWNER", pJobOwner);
				
			cmd.execute();


		}
		
		public static void suspendJobExecution(byte[] pExecutionId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_JOBS.SUSPEND_JOB_EXECUTION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_EXECUTION_ID", pExecutionId);
				
			cmd.execute();


		}
		
		public static void suspendJobExecution(NNumber pStepId,NNumber pSuspendStep) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_JOBS.SUSPEND_JOB_EXECUTION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_STEP_ID", pStepId);
			cmd.addParameter("@P_SUSPEND_STEP", pSuspendStep);
				
			cmd.execute();


		}
		
//		public static void suspendJobExecutionOnEvent(byte[] pExecutionId,NString pEventName,List<SmpEmdNvpairArrayRow> pEventParams,NNumber pSuspendTimeout) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_JOBS.SUSPEND_JOB_EXECUTION_ON_EVENT", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_EXECUTION_ID", pExecutionId);
//			cmd.addParameter("@P_EVENT_NAME", pEventName);
//			// cmd.addParameter(DbTypes.getCollectionType("P_EVENT_PARAMS", "", pEventParams, object.class));
//			cmd.addParameter("@P_SUSPEND_TIMEOUT", pSuspendTimeout);
//				
//			cmd.execute();
//
//
//		}
		
	
	
	
}
