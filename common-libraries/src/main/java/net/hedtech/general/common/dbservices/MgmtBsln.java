package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class MgmtBsln {
		public static void activateBaseline(NString nameIn,byte[] targetUidIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_BSLN.ACTIVATE_BASELINE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@NAME_IN", nameIn);
			cmd.addParameter("@TARGET_UID_IN", targetUidIn);
				
			cmd.execute();


		}
		
		public static byte[] FbaselineGuid(byte[] targetUidIn,NString nameIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_BSLN.BASELINE_GUID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(byte[].class);
			cmd.addParameter("@TARGET_UID_IN", targetUidIn);
			cmd.addParameter("@NAME_IN", nameIn);
				
			cmd.execute();

			return cmd.getReturnValue(byte[].class);

		}
		
		public static void computeAllStatistics() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_BSLN.COMPUTE_ALL_STATISTICS", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
//		public static List<BslnStatisticsSetRow> FcomputeStatistics(NString bslnNameIn,NDate intervalBeginIn,NDate intervalEndIn,NString subintervalKeyIn,byte[] targetUidIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_BSLN.COMPUTE_STATISTICS", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<BslnStatisticsSetRow>.class);
//			cmd.addParameter("@BSLN_NAME_IN", bslnNameIn);
//			cmd.addParameter("@INTERVAL_BEGIN_IN", intervalBeginIn);
//			cmd.addParameter("@INTERVAL_END_IN", intervalEndIn);
//			cmd.addParameter("@SUBINTERVAL_KEY_IN", subintervalKeyIn);
//			cmd.addParameter("@TARGET_UID_IN", targetUidIn);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<BslnStatisticsSetRow>.class);
//
//		}
		
		public static void createBaselineStatic(NString nameIn,NDate intervalBeginIn,NDate intervalEndIn,NString subintervalKeyIn,byte[] targetUidIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_BSLN.CREATE_BASELINE_STATIC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@NAME_IN", nameIn);
			cmd.addParameter("@INTERVAL_BEGIN_IN", intervalBeginIn);
			cmd.addParameter("@INTERVAL_END_IN", intervalEndIn);
			cmd.addParameter("@SUBINTERVAL_KEY_IN", subintervalKeyIn);
			cmd.addParameter("@TARGET_UID_IN", targetUidIn);
				
			cmd.execute();


		}
		
		public static NNumber FdataAndModelOk(NString thresholdMethodIn,NNumber thresholdParamIn,NNumber sampleCountIn,NNumber fitQualityIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_BSLN.DATA_AND_MODEL_OK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@THRESHOLD_METHOD_IN", thresholdMethodIn);
			cmd.addParameter("@THRESHOLD_PARAM_IN", thresholdParamIn);
			cmd.addParameter("@SAMPLE_COUNT_IN", sampleCountIn);
			cmd.addParameter("@FIT_QUALITY_IN", fitQualityIn);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static byte[] FdatasourceGuid(byte[] targetUidIn,byte[] metricUidIn,NString keyValueIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_BSLN.DATASOURCE_GUID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(byte[].class);
			cmd.addParameter("@TARGET_UID_IN", targetUidIn);
			cmd.addParameter("@METRIC_UID_IN", metricUidIn);
			cmd.addParameter("@KEY_VALUE_IN", keyValueIn);
				
			cmd.execute();

			return cmd.getReturnValue(byte[].class);

		}
		
		public static void deactivateBaseline(NString nameIn,byte[] targetUidIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_BSLN.DEACTIVATE_BASELINE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@NAME_IN", nameIn);
			cmd.addParameter("@TARGET_UID_IN", targetUidIn);
				
			cmd.execute();


		}
		
		public static void deleteBslnJobs() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_BSLN.DELETE_BSLN_JOBS", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void deregisterDatasource() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_BSLN.DEREGISTER_DATASOURCE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void disable() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_BSLN.DISABLE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void dropBaseline(NString nameIn,byte[] targetUidIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_BSLN.DROP_BASELINE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@NAME_IN", nameIn);
			cmd.addParameter("@TARGET_UID_IN", targetUidIn);
				
			cmd.execute();


		}
		
		public static void enable() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_BSLN.ENABLE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static NNumber FisEnabled() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_BSLN.IS_ENABLED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static void metricSignalQualities() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_BSLN.METRIC_SIGNAL_QUALITIES", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void metricUid() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_BSLN.METRIC_UID", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void movingWindowBaselineGuid() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_BSLN.MOVING_WINDOW_BASELINE_GUID", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void registerDatasource() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_BSLN.REGISTER_DATASOURCE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void setAllThresholds() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_BSLN.SET_ALL_THRESHOLDS", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void setDefaultTimegrouping() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_BSLN.SET_DEFAULT_TIMEGROUPING", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void setThresholdParameters() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_BSLN.SET_THRESHOLD_PARAMETERS", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
//		public static void setThresholdParameters() {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_BSLN.SET_THRESHOLD_PARAMETERS", DbManager.getDataBaseFactory());
//			
//				
//			cmd.execute();
//
//
//		}
		
		public static byte[] FsubintervalCode(NString subintervalKeyIn,NDate timeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_BSLN.SUBINTERVAL_CODE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(byte[].class);
			cmd.addParameter("@SUBINTERVAL_KEY_IN", subintervalKeyIn);
			cmd.addParameter("@TIME_IN", timeIn);
				
			cmd.execute();

			return cmd.getReturnValue(byte[].class);

		}
		
		public static byte[] FtargetUid(byte[] targetGuidIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_BSLN.TARGET_UID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(byte[].class);
			cmd.addParameter("@TARGET_GUID_IN", targetGuidIn);
				
			cmd.execute();

			return cmd.getReturnValue(byte[].class);

		}
		
		public static byte[] FtargetUid(NNumber dbidIn,NNumber instanceNumIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_BSLN.TARGET_UID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(byte[].class);
			cmd.addParameter("@DBID_IN", dbidIn);
			cmd.addParameter("@INSTANCE_NUM_IN", instanceNumIn);
				
			cmd.execute();

			return cmd.getReturnValue(byte[].class);

		}
		
		public static byte[] FthisTargetUid() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_BSLN.THIS_TARGET_UID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(byte[].class);
				
			cmd.execute();

			return cmd.getReturnValue(byte[].class);

		}
		
		public static void timegroup() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_BSLN.TIMEGROUP", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
//		public static void timegroup() {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_BSLN.TIMEGROUP", DbManager.getDataBaseFactory());
//			
//				
//			cmd.execute();
//
//
//		}
		
		public static void unsetThresholdParameters(byte[] bslnGuidIn,byte[] dsGuidIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_BSLN.UNSET_THRESHOLD_PARAMETERS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@BSLN_GUID_IN", bslnGuidIn);
			cmd.addParameter("@DS_GUID_IN", dsGuidIn);
				
			cmd.execute();


		}
		
		public static void updateMovingWindow(NNumber intervalDaysIn,NString subintervalKeyIn,byte[] targetUidIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_BSLN.UPDATE_MOVING_WINDOW", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@INTERVAL_DAYS_IN", intervalDaysIn);
			cmd.addParameter("@SUBINTERVAL_KEY_IN", subintervalKeyIn);
			cmd.addParameter("@TARGET_UID_IN", targetUidIn);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="SignalRectypeRow", dataSourceName="SIGNAL_RECTYPE")
	public static class SignalRectypeRow
	{
		@DbRecordField(dataSourceName="BSLN_GUID")
		public byte[] BslnGuid;
		@DbRecordField(dataSourceName="METRIC_ID")
		public NNumber MetricId;
		@DbRecordField(dataSourceName="QUALITY")
		public NNumber Quality;
	}

	
	
}
