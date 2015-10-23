package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class CtxReport {
		public static void createIndexScript(NString indexName,Ref<NString> report,NString prefnamePrefix) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_REPORT.CREATE_INDEX_SCRIPT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@INDEX_NAME", indexName);
			cmd.addParameter("@REPORT", report, true);
			cmd.addParameter("@PREFNAME_PREFIX", prefnamePrefix);
				
			cmd.execute();
			report.val = cmd.getParameterValue("@REPORT", NString.class);


		}
		
		public static NString FcreateIndexScript(NString indexName,NString prefnamePrefix) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_REPORT.CREATE_INDEX_SCRIPT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@INDEX_NAME", indexName);
			cmd.addParameter("@PREFNAME_PREFIX", prefnamePrefix);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void createPolicyScript(NString policyName,Ref<NString> report,NString prefnamePrefix) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_REPORT.CREATE_POLICY_SCRIPT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@POLICY_NAME", policyName);
			cmd.addParameter("@REPORT", report, true);
			cmd.addParameter("@PREFNAME_PREFIX", prefnamePrefix);
				
			cmd.execute();
			report.val = cmd.getParameterValue("@REPORT", NString.class);


		}
		
		public static NString FcreatePolicyScript(NString policyName,NString prefnamePrefix) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_REPORT.CREATE_POLICY_SCRIPT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@POLICY_NAME", policyName);
			cmd.addParameter("@PREFNAME_PREFIX", prefnamePrefix);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void describeIndex(NString indexName,Ref<NString> report,NString reportFormat) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_REPORT.DESCRIBE_INDEX", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@INDEX_NAME", indexName);
			cmd.addParameter("@REPORT", report, true);
			cmd.addParameter("@REPORT_FORMAT", reportFormat);
				
			cmd.execute();
			report.val = cmd.getParameterValue("@REPORT", NString.class);


		}
		
		public static NString FdescribeIndex(NString indexName,NString reportFormat) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_REPORT.DESCRIBE_INDEX", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@INDEX_NAME", indexName);
			cmd.addParameter("@REPORT_FORMAT", reportFormat);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void describePolicy(NString policyName,Ref<NString> report,NString reportFormat) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_REPORT.DESCRIBE_POLICY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@POLICY_NAME", policyName);
			cmd.addParameter("@REPORT", report, true);
			cmd.addParameter("@REPORT_FORMAT", reportFormat);
				
			cmd.execute();
			report.val = cmd.getParameterValue("@REPORT", NString.class);


		}
		
		public static NString FdescribePolicy(NString policyName,NString reportFormat) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_REPORT.DESCRIBE_POLICY", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@POLICY_NAME", policyName);
			cmd.addParameter("@REPORT_FORMAT", reportFormat);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void indexSize(NString indexName,Ref<NString> report,NString partName,NString reportFormat) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_REPORT.INDEX_SIZE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@INDEX_NAME", indexName);
			cmd.addParameter("@REPORT", report, true);
			cmd.addParameter("@PART_NAME", partName);
			cmd.addParameter("@REPORT_FORMAT", reportFormat);
				
			cmd.execute();
			report.val = cmd.getParameterValue("@REPORT", NString.class);


		}
		
		public static NString FindexSize(NString indexName,NString partName,NString reportFormat) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_REPORT.INDEX_SIZE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@INDEX_NAME", indexName);
			cmd.addParameter("@PART_NAME", partName);
			cmd.addParameter("@REPORT_FORMAT", reportFormat);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void indexStats(NString indexName,Ref<NString> report,NString partName,NBool fragStats,NNumber listSize,NString reportFormat,NString statType) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_REPORT.INDEX_STATS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@INDEX_NAME", indexName);
			cmd.addParameter("@REPORT", report, true);
			cmd.addParameter("@PART_NAME", partName);
			cmd.addParameter("@FRAG_STATS", fragStats);
			cmd.addParameter("@LIST_SIZE", listSize);
			cmd.addParameter("@REPORT_FORMAT", reportFormat);
			cmd.addParameter("@STAT_TYPE", statType);
				
			cmd.execute();
			report.val = cmd.getParameterValue("@REPORT", NString.class);


		}
		
//		public static void queryLogSummary(NString logfile,NString indexname,Ref<List<QueryTableRow>> resultTable,NNumber rowNum,NBool mostFreq,NBool hasHit) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_REPORT.QUERY_LOG_SUMMARY", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@LOGFILE", logfile);
//			cmd.addParameter("@INDEXNAME", indexname);
//			// cmd.addParameter(DbTypes.getTableType("RESULT_TABLE", "", resultTable.val, object.class , true));
//			cmd.addParameter("@ROW_NUM", rowNum);
//			cmd.addParameter("@MOST_FREQ", mostFreq);
//			cmd.addParameter("@HAS_HIT", hasHit);
//				
//			cmd.execute();
//			// resultTable.val = cmd.getTableParameterValue("@RESULT_TABLE", object.class);
//
//
//		}
		
		public static void tokenInfo(NString indexName,Ref<NString> report,NString token,NNumber tokenType,NString partName,NBool rawInfo,NBool decodedInfo,NString reportFormat) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_REPORT.TOKEN_INFO", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@INDEX_NAME", indexName);
			cmd.addParameter("@REPORT", report, true);
			cmd.addParameter("@TOKEN", token);
			cmd.addParameter("@TOKEN_TYPE", tokenType);
			cmd.addParameter("@PART_NAME", partName);
			cmd.addParameter("@RAW_INFO", rawInfo);
			cmd.addParameter("@DECODED_INFO", decodedInfo);
			cmd.addParameter("@REPORT_FORMAT", reportFormat);
				
			cmd.execute();
			report.val = cmd.getParameterValue("@REPORT", NString.class);


		}
		
		public static NString FtokenInfo(NString indexName,NString token,NNumber tokenType,NString partName,NString rawInfo,NString decodedInfo,NString reportFormat) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_REPORT.TOKEN_INFO", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@INDEX_NAME", indexName);
			cmd.addParameter("@TOKEN", token);
			cmd.addParameter("@TOKEN_TYPE", tokenType);
			cmd.addParameter("@PART_NAME", partName);
			cmd.addParameter("@RAW_INFO", rawInfo);
			cmd.addParameter("@DECODED_INFO", decodedInfo);
			cmd.addParameter("@REPORT_FORMAT", reportFormat);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber FtokenType(NString indexName,NString typeName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_REPORT.TOKEN_TYPE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@INDEX_NAME", indexName);
			cmd.addParameter("@TYPE_NAME", typeName);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
	
	
	@DbRecordType(id="QueryRecordRow", dataSourceName="QUERY_RECORD")
	public static class QueryRecordRow
	{
		@DbRecordField(dataSourceName="TIMES")
		public NNumber Times;
		@DbRecordField(dataSourceName="QUERY")
		public NString Query;
	}

	
	
}
