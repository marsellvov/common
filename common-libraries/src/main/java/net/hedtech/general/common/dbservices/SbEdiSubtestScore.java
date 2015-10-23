package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SbEdiSubtestScore {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_EDI_SUBTEST_SCORE.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NNumber pDcmtSeqno,NNumber pTestSeqno,NNumber pStstSeqno,NNumber pSeqno,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_EDI_SUBTEST_SCORE.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_DCMT_SEQNO", pDcmtSeqno);
			cmd.addParameter("@P_TEST_SEQNO", pTestSeqno);
			cmd.addParameter("@P_STST_SEQNO", pStstSeqno);
			cmd.addParameter("@P_SEQNO", pSeqno);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(EdiSubtestScoreRecRow recOne,EdiSubtestScoreRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_EDI_SUBTEST_SCORE.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, EdiSubtestScoreRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, EdiSubtestScoreRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NNumber pDcmtSeqno,NNumber pTestSeqno,NNumber pStstSeqno,NNumber pSeqno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_EDI_SUBTEST_SCORE.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_DCMT_SEQNO", pDcmtSeqno);
			cmd.addParameter("@P_TEST_SEQNO", pTestSeqno);
			cmd.addParameter("@P_STST_SEQNO", pStstSeqno);
			cmd.addParameter("@P_SEQNO", pSeqno);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_EDI_SUBTEST_SCORE.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NNumber pDcmtSeqno,NNumber pTestSeqno,NNumber pStstSeqno,NNumber pSeqno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_EDI_SUBTEST_SCORE.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_DCMT_SEQNO", pDcmtSeqno);
			cmd.addParameter("@P_TEST_SEQNO", pTestSeqno);
			cmd.addParameter("@P_STST_SEQNO", pStstSeqno);
			cmd.addParameter("@P_SEQNO", pSeqno);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NNumber pDcmtSeqno,NNumber pTestSeqno,NNumber pStstSeqno,NNumber pSeqno,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_EDI_SUBTEST_SCORE.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_DCMT_SEQNO", pDcmtSeqno);
			cmd.addParameter("@P_TEST_SEQNO", pTestSeqno);
			cmd.addParameter("@P_STST_SEQNO", pStstSeqno);
			cmd.addParameter("@P_SEQNO", pSeqno);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NNumber pDcmtSeqno,NNumber pTestSeqno,NNumber pStstSeqno,NNumber pSeqno,NString pScore,NString pTefrCode,NString pScoreRevisedInd,NString pScoreInvalidatedInd,NString pScoreSelfreportedInd,NString pMessage,NString pUserId,NString pDataOrigin,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_EDI_SUBTEST_SCORE.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DCMT_SEQNO", pDcmtSeqno);
			cmd.addParameter("@P_TEST_SEQNO", pTestSeqno);
			cmd.addParameter("@P_STST_SEQNO", pStstSeqno);
			cmd.addParameter("@P_SEQNO", pSeqno);
			cmd.addParameter("@P_SCORE", pScore);
			cmd.addParameter("@P_TEFR_CODE", pTefrCode);
			cmd.addParameter("@P_SCORE_REVISED_IND", pScoreRevisedInd);
			cmd.addParameter("@P_SCORE_INVALIDATED_IND", pScoreInvalidatedInd);
			cmd.addParameter("@P_SCORE_SELFREPORTED_IND", pScoreSelfreportedInd);
			cmd.addParameter("@P_MESSAGE", pMessage);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NNumber pDcmtSeqno,NNumber pTestSeqno,NNumber pStstSeqno,NNumber pSeqno,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_EDI_SUBTEST_SCORE.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DCMT_SEQNO", pDcmtSeqno);
			cmd.addParameter("@P_TEST_SEQNO", pTestSeqno);
			cmd.addParameter("@P_STST_SEQNO", pStstSeqno);
			cmd.addParameter("@P_SEQNO", pSeqno);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NNumber pDcmtSeqno,NNumber pTestSeqno,NNumber pStstSeqno,NNumber pSeqno,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_EDI_SUBTEST_SCORE.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DCMT_SEQNO", pDcmtSeqno);
			cmd.addParameter("@P_TEST_SEQNO", pTestSeqno);
			cmd.addParameter("@P_STST_SEQNO", pStstSeqno);
			cmd.addParameter("@P_SEQNO", pSeqno);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NNumber pDcmtSeqno,NNumber pTestSeqno,NNumber pStstSeqno,NNumber pSeqno,NString pScore,NString pTefrCode,NString pScoreRevisedInd,NString pScoreInvalidatedInd,NString pScoreSelfreportedInd,NString pMessage,NString pUserId,NString pDataOrigin,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_EDI_SUBTEST_SCORE.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DCMT_SEQNO", pDcmtSeqno);
			cmd.addParameter("@P_TEST_SEQNO", pTestSeqno);
			cmd.addParameter("@P_STST_SEQNO", pStstSeqno);
			cmd.addParameter("@P_SEQNO", pSeqno);
			cmd.addParameter("@P_SCORE", pScore);
			cmd.addParameter("@P_TEFR_CODE", pTefrCode);
			cmd.addParameter("@P_SCORE_REVISED_IND", pScoreRevisedInd);
			cmd.addParameter("@P_SCORE_INVALIDATED_IND", pScoreInvalidatedInd);
			cmd.addParameter("@P_SCORE_SELFREPORTED_IND", pScoreSelfreportedInd);
			cmd.addParameter("@P_MESSAGE", pMessage);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="EdiSubtestScoreRecRow", dataSourceName="EDI_SUBTEST_SCORE_REC")
	public static class EdiSubtestScoreRecRow
	{
		@DbRecordField(dataSourceName="R_DCMT_SEQNO")
		public NNumber RDcmtSeqno;
		@DbRecordField(dataSourceName="R_TEST_SEQNO")
		public NNumber RTestSeqno;
		@DbRecordField(dataSourceName="R_STST_SEQNO")
		public NNumber RStstSeqno;
		@DbRecordField(dataSourceName="R_SEQNO")
		public NNumber RSeqno;
		@DbRecordField(dataSourceName="R_SCORE")
		public NString RScore;
		@DbRecordField(dataSourceName="R_TEFR_CODE")
		public NString RTefrCode;
		@DbRecordField(dataSourceName="R_SCORE_REVISED_IND")
		public NString RScoreRevisedInd;
		@DbRecordField(dataSourceName="R_SCORE_INVALIDATED_IND")
		public NString RScoreInvalidatedInd;
		@DbRecordField(dataSourceName="R_SCORE_SELFREPORTED_IND")
		public NString RScoreSelfreportedInd;
		@DbRecordField(dataSourceName="R_MESSAGE")
		public NString RMessage;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
