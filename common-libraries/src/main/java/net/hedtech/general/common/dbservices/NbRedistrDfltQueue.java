package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class NbRedistrDfltQueue {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NB_REDISTR_DFLT_QUEUE.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NNumber pNtrqprtId,NNumber pSeqNo,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NB_REDISTR_DFLT_QUEUE.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_NTRQPRT_ID", pNtrqprtId);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(RedistrDfltQueueRecRow recOne,RedistrDfltQueueRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NB_REDISTR_DFLT_QUEUE.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, RedistrDfltQueueRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, RedistrDfltQueueRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NNumber pNtrqprtId,NNumber pSeqNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NB_REDISTR_DFLT_QUEUE.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_NTRQPRT_ID", pNtrqprtId);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryById(NNumber pId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NB_REDISTR_DFLT_QUEUE.F_QUERY_BY_ID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ID", pId);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NB_REDISTR_DFLT_QUEUE.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NNumber pNtrqprtId,NNumber pSeqNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NB_REDISTR_DFLT_QUEUE.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_NTRQPRT_ID", pNtrqprtId);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NNumber pNtrqprtId,NNumber pSeqNo,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NB_REDISTR_DFLT_QUEUE.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_NTRQPRT_ID", pNtrqprtId);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NNumber pNtrqprtId,NNumber pSeqNo,NString pGrantsOnlyInd,NString pApproverAction,NString pUserId,NNumber pElapsedDays,NString pDataOrigin,Ref<NNumber> pIdOut,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NB_REDISTR_DFLT_QUEUE.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_NTRQPRT_ID", pNtrqprtId);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_GRANTS_ONLY_IND", pGrantsOnlyInd);
			cmd.addParameter("@P_APPROVER_ACTION", pApproverAction);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_ELAPSED_DAYS", pElapsedDays);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ID_OUT", NNumber.class);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pIdOut.val = cmd.getParameterValue("@P_ID_OUT", NNumber.class);
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NNumber pNtrqprtId,NNumber pSeqNo,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NB_REDISTR_DFLT_QUEUE.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_NTRQPRT_ID", pNtrqprtId);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NNumber pNtrqprtId,NNumber pSeqNo,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NB_REDISTR_DFLT_QUEUE.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_NTRQPRT_ID", pNtrqprtId);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NNumber pNtrqprtId,NNumber pSeqNo,NString pGrantsOnlyInd,NString pApproverAction,NString pUserId,NNumber pElapsedDays,NString pDataOrigin,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NB_REDISTR_DFLT_QUEUE.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_NTRQPRT_ID", pNtrqprtId);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_GRANTS_ONLY_IND", pGrantsOnlyInd);
			cmd.addParameter("@P_APPROVER_ACTION", pApproverAction);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_ELAPSED_DAYS", pElapsedDays);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="RedistrDfltQueueRecRow", dataSourceName="REDISTR_DFLT_QUEUE_REC")
	public static class RedistrDfltQueueRecRow
	{
		@DbRecordField(dataSourceName="R_ID")
		public NNumber RId;
		@DbRecordField(dataSourceName="R_NTRQPRT_ID")
		public NNumber RNtrqprtId;
		@DbRecordField(dataSourceName="R_SEQ_NO")
		public NNumber RSeqNo;
		@DbRecordField(dataSourceName="R_GRANTS_ONLY_IND")
		public NString RGrantsOnlyInd;
		@DbRecordField(dataSourceName="R_APPROVER_ACTION")
		public NString RApproverAction;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_ELAPSED_DAYS")
		public NNumber RElapsedDays;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
