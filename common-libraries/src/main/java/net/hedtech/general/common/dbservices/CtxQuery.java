package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class CtxQuery {
		public static void browseWords(NString indexName,NString seed,NString restab,NNumber browseId,NNumber numwords,NString direction,NString partName,NNumber tokenType) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_QUERY.BROWSE_WORDS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@INDEX_NAME", indexName);
			cmd.addParameter("@SEED", seed);
			cmd.addParameter("@RESTAB", restab);
			cmd.addParameter("@BROWSE_ID", browseId);
			cmd.addParameter("@NUMWORDS", numwords);
			cmd.addParameter("@DIRECTION", direction);
			cmd.addParameter("@PART_NAME", partName);
			cmd.addParameter("@TOKEN_TYPE", tokenType);
				
			cmd.execute();


		}
		
//		public static void browseWords(NString indexName,NString seed,Ref<List<BrowseTabRow>> resarr,NNumber numwords,NString direction,NString partName,NNumber tokenType) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_QUERY.BROWSE_WORDS", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@INDEX_NAME", indexName);
//			cmd.addParameter("@SEED", seed);
//			// cmd.addParameter(DbTypes.getTableType("RESARR", "", resarr.val, object.class , true));
//			cmd.addParameter("@NUMWORDS", numwords);
//			cmd.addParameter("@DIRECTION", direction);
//			cmd.addParameter("@PART_NAME", partName);
//			cmd.addParameter("@TOKEN_TYPE", tokenType);
//				
//			cmd.execute();
//			// resarr.val = cmd.getTableParameterValue("@RESARR", object.class);
//
//
//		}
		
		public static NNumber FchkTxnqryDisblSwitch() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_QUERY.CHK_TXNQRY_DISBL_SWITCH", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString FchkXpath(NString indexName,NString textQuery,NString partName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_QUERY.CHK_XPATH", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@INDEX_NAME", indexName);
			cmd.addParameter("@TEXT_QUERY", textQuery);
			cmd.addParameter("@PART_NAME", partName);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber FcountHits(NString indexName,NString textQuery,NBool exact,NString partName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_QUERY.COUNT_HITS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@INDEX_NAME", indexName);
			cmd.addParameter("@TEXT_QUERY", textQuery);
			cmd.addParameter("@EXACT", exact);
			cmd.addParameter("@PART_NAME", partName);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber FcountHitsClobQuery(NString indexName,NString textQuery,NBool exact,NString partName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_QUERY.COUNT_HITS_CLOB_QUERY", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@INDEX_NAME", indexName);
			cmd.addParameter("@TEXT_QUERY", textQuery);
			cmd.addParameter("@EXACT", exact);
			cmd.addParameter("@PART_NAME", partName);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static void explain(NString indexName,NString textQuery,NString explainTable,NNumber sharelevel,NString explainId,NString partName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_QUERY.EXPLAIN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@INDEX_NAME", indexName);
			cmd.addParameter("@TEXT_QUERY", textQuery);
			cmd.addParameter("@EXPLAIN_TABLE", explainTable);
			cmd.addParameter("@SHARELEVEL", sharelevel);
			cmd.addParameter("@EXPLAIN_ID", explainId);
			cmd.addParameter("@PART_NAME", partName);
				
			cmd.execute();


		}
		
		public static void explainClobQuery(NString indexName,NString textQuery,NString explainTable,NNumber sharelevel,NString explainId,NString partName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_QUERY.EXPLAIN_CLOB_QUERY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@INDEX_NAME", indexName);
			cmd.addParameter("@TEXT_QUERY", textQuery);
			cmd.addParameter("@EXPLAIN_TABLE", explainTable);
			cmd.addParameter("@SHARELEVEL", sharelevel);
			cmd.addParameter("@EXPLAIN_ID", explainId);
			cmd.addParameter("@PART_NAME", partName);
				
			cmd.execute();


		}
		
		public static NNumber fcontains(NString textValue,NString textQuery,NString policyName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_QUERY.FCONTAINS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@TEXT_VALUE", textValue);
			cmd.addParameter("@TEXT_QUERY", textQuery);
			cmd.addParameter("@POLICY_NAME", policyName);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static void hfeedback(NString indexName,NString textQuery,NString feedbackTable,NNumber sharelevel,NString feedbackId,NString partName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_QUERY.HFEEDBACK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@INDEX_NAME", indexName);
			cmd.addParameter("@TEXT_QUERY", textQuery);
			cmd.addParameter("@FEEDBACK_TABLE", feedbackTable);
			cmd.addParameter("@SHARELEVEL", sharelevel);
			cmd.addParameter("@FEEDBACK_ID", feedbackId);
			cmd.addParameter("@PART_NAME", partName);
				
			cmd.execute();


		}
		
		public static void hfeedbackClobQuery(NString indexName,NString textQuery,NString feedbackTable,NNumber sharelevel,NString feedbackId,NString partName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_QUERY.HFEEDBACK_CLOB_QUERY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@INDEX_NAME", indexName);
			cmd.addParameter("@TEXT_QUERY", textQuery);
			cmd.addParameter("@FEEDBACK_TABLE", feedbackTable);
			cmd.addParameter("@SHARELEVEL", sharelevel);
			cmd.addParameter("@FEEDBACK_ID", feedbackId);
			cmd.addParameter("@PART_NAME", partName);
				
			cmd.execute();


		}
		
		public static void removeSqe(NString queryName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_QUERY.REMOVE_SQE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@QUERY_NAME", queryName);
				
			cmd.execute();


		}
		
		public static void resultSet(NString indexName,NString query,NString resultSetDescriptor,Ref<NString> resultSet,NString partName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_QUERY.RESULT_SET", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@INDEX_NAME", indexName);
			cmd.addParameter("@QUERY", query);
			cmd.addParameter("@RESULT_SET_DESCRIPTOR", resultSetDescriptor);
			cmd.addParameter("@RESULT_SET", resultSet, true);
			cmd.addParameter("@PART_NAME", partName);
				
			cmd.execute();
			resultSet.val = cmd.getParameterValue("@RESULT_SET", NString.class);


		}
		
		public static void resultSetClobQuery(NString indexName,NString query,NString resultSetDescriptor,Ref<NString> resultSet,NString partName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_QUERY.RESULT_SET_CLOB_QUERY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@INDEX_NAME", indexName);
			cmd.addParameter("@QUERY", query);
			cmd.addParameter("@RESULT_SET_DESCRIPTOR", resultSetDescriptor);
			cmd.addParameter("@RESULT_SET", resultSet, true);
			cmd.addParameter("@PART_NAME", partName);
				
			cmd.execute();
			resultSet.val = cmd.getParameterValue("@RESULT_SET", NString.class);


		}
		
		public static void storeSqe(NString queryName,NString textQuery,NNumber duration) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_QUERY.STORE_SQE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@QUERY_NAME", queryName);
			cmd.addParameter("@TEXT_QUERY", textQuery);
			cmd.addParameter("@DURATION", duration);
				
			cmd.execute();


		}
		
		public static void storeSqeClobQuery(NString queryName,NString textQuery,NNumber duration) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_QUERY.STORE_SQE_CLOB_QUERY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@QUERY_NAME", queryName);
			cmd.addParameter("@TEXT_QUERY", textQuery);
			cmd.addParameter("@DURATION", duration);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="BrowseRecRow", dataSourceName="BROWSE_REC")
	public static class BrowseRecRow
	{
		@DbRecordField(dataSourceName="WORD")
		public NString Word;
		@DbRecordField(dataSourceName="DOC_COUNT")
		public NNumber DocCount;
	}

	
	
}
