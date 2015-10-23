package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class RbPromissoryNote {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_PROMISSORY_NOTE.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NString pAidyCode,NNumber pPidm,NString pFundCode,NString pPeriod,NNumber pDlSeqNo,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_PROMISSORY_NOTE.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_PERIOD", pPeriod);
			cmd.addParameter("@P_DL_SEQ_NO", pDlSeqNo);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsDirectLoan(NString pAidyCode,NString pFundCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_PROMISSORY_NOTE.F_IS_DIRECT_LOAN", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(PromissoryNoteRecRow recOne,PromissoryNoteRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_PROMISSORY_NOTE.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, PromissoryNoteRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, PromissoryNoteRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NString pAidyCode,NNumber pPidm,NString pFundCode,NString pPeriod,NNumber pDlSeqNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_PROMISSORY_NOTE.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_PERIOD", pPeriod);
			cmd.addParameter("@P_DL_SEQ_NO", pDlSeqNo);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_PROMISSORY_NOTE.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NString pAidyCode,NNumber pPidm,NString pFundCode,NString pPeriod,NNumber pDlSeqNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_PROMISSORY_NOTE.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_PERIOD", pPeriod);
			cmd.addParameter("@P_DL_SEQ_NO", pDlSeqNo);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NString pAidyCode,NNumber pPidm,NString pFundCode,NString pPeriod,NNumber pDlSeqNo,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_PROMISSORY_NOTE.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_PERIOD", pPeriod);
			cmd.addParameter("@P_DL_SEQ_NO", pDlSeqNo);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NString pAidyCode,NNumber pPidm,NString pFundCode,NString pPeriod,NDate pEffDate,NString pSatInd,NDate pSatDate,NNumber pDlSeqNo,NString pDlNoteStatus,NDate pDlPrintDate,NDate pDlShipDate,NString pDlBatchNo,NDate pDlConfDate,NString pDlRejReason1,NString pDlRejReason2,NString pDlRejReason3,NString pDlRejReason4,NString pDlRejReason5,NString pDlServNoteStatus,NNumber pPrintSeqNo,NString pDlDocumentId,NString pUserId,NString pDataOrigin,NString pInfoAccessInd,NString pTermCode,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_PROMISSORY_NOTE.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_PERIOD", pPeriod);
			cmd.addParameter("@P_EFF_DATE", pEffDate);
			cmd.addParameter("@P_SAT_IND", pSatInd);
			cmd.addParameter("@P_SAT_DATE", pSatDate);
			cmd.addParameter("@P_DL_SEQ_NO", pDlSeqNo);
			cmd.addParameter("@P_DL_NOTE_STATUS", pDlNoteStatus);
			cmd.addParameter("@P_DL_PRINT_DATE", pDlPrintDate);
			cmd.addParameter("@P_DL_SHIP_DATE", pDlShipDate);
			cmd.addParameter("@P_DL_BATCH_NO", pDlBatchNo);
			cmd.addParameter("@P_DL_CONF_DATE", pDlConfDate);
			cmd.addParameter("@P_DL_REJ_REASON_1", pDlRejReason1);
			cmd.addParameter("@P_DL_REJ_REASON_2", pDlRejReason2);
			cmd.addParameter("@P_DL_REJ_REASON_3", pDlRejReason3);
			cmd.addParameter("@P_DL_REJ_REASON_4", pDlRejReason4);
			cmd.addParameter("@P_DL_REJ_REASON_5", pDlRejReason5);
			cmd.addParameter("@P_DL_SERV_NOTE_STATUS", pDlServNoteStatus);
			cmd.addParameter("@P_PRINT_SEQ_NO", pPrintSeqNo);
			cmd.addParameter("@P_DL_DOCUMENT_ID", pDlDocumentId);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_INFO_ACCESS_IND", pInfoAccessInd);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NString pAidyCode,NNumber pPidm,NString pFundCode,NString pPeriod,NNumber pDlSeqNo,NString pTermCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_PROMISSORY_NOTE.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_PERIOD", pPeriod);
			cmd.addParameter("@P_DL_SEQ_NO", pDlSeqNo);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NString pAidyCode,NNumber pPidm,NString pFundCode,NString pPeriod,NNumber pDlSeqNo,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_PROMISSORY_NOTE.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_PERIOD", pPeriod);
			cmd.addParameter("@P_DL_SEQ_NO", pDlSeqNo);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NString pAidyCode,NNumber pPidm,NString pFundCode,NString pPeriod,NDate pEffDate,NString pSatInd,NDate pSatDate,NNumber pDlSeqNo,NString pDlNoteStatus,NDate pDlPrintDate,NDate pDlShipDate,NString pDlBatchNo,NDate pDlConfDate,NString pDlRejReason1,NString pDlRejReason2,NString pDlRejReason3,NString pDlRejReason4,NString pDlRejReason5,NString pDlServNoteStatus,NNumber pPrintSeqNo,NString pDlDocumentId,NString pUserId,NString pDataOrigin,NString pInfoAccessInd,NString pTermCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_PROMISSORY_NOTE.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_PERIOD", pPeriod);
			cmd.addParameter("@P_EFF_DATE", pEffDate);
			cmd.addParameter("@P_SAT_IND", pSatInd);
			cmd.addParameter("@P_SAT_DATE", pSatDate);
			cmd.addParameter("@P_DL_SEQ_NO", pDlSeqNo);
			cmd.addParameter("@P_DL_NOTE_STATUS", pDlNoteStatus);
			cmd.addParameter("@P_DL_PRINT_DATE", pDlPrintDate);
			cmd.addParameter("@P_DL_SHIP_DATE", pDlShipDate);
			cmd.addParameter("@P_DL_BATCH_NO", pDlBatchNo);
			cmd.addParameter("@P_DL_CONF_DATE", pDlConfDate);
			cmd.addParameter("@P_DL_REJ_REASON_1", pDlRejReason1);
			cmd.addParameter("@P_DL_REJ_REASON_2", pDlRejReason2);
			cmd.addParameter("@P_DL_REJ_REASON_3", pDlRejReason3);
			cmd.addParameter("@P_DL_REJ_REASON_4", pDlRejReason4);
			cmd.addParameter("@P_DL_REJ_REASON_5", pDlRejReason5);
			cmd.addParameter("@P_DL_SERV_NOTE_STATUS", pDlServNoteStatus);
			cmd.addParameter("@P_PRINT_SEQ_NO", pPrintSeqNo);
			cmd.addParameter("@P_DL_DOCUMENT_ID", pDlDocumentId);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_INFO_ACCESS_IND", pInfoAccessInd);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="PromissoryNoteRecRow", dataSourceName="PROMISSORY_NOTE_REC")
	public static class PromissoryNoteRecRow
	{
		@DbRecordField(dataSourceName="R_AIDY_CODE")
		public NString RAidyCode;
		@DbRecordField(dataSourceName="R_PIDM")
		public NNumber RPidm;
		@DbRecordField(dataSourceName="R_FUND_CODE")
		public NString RFundCode;
		@DbRecordField(dataSourceName="R_PERIOD")
		public NString RPeriod;
		@DbRecordField(dataSourceName="R_EFF_DATE")
		public NDate REffDate;
		@DbRecordField(dataSourceName="R_SAT_IND")
		public NString RSatInd;
		@DbRecordField(dataSourceName="R_SAT_DATE")
		public NDate RSatDate;
		@DbRecordField(dataSourceName="R_DL_SEQ_NO")
		public NNumber RDlSeqNo;
		@DbRecordField(dataSourceName="R_DL_NOTE_STATUS")
		public NString RDlNoteStatus;
		@DbRecordField(dataSourceName="R_DL_PRINT_DATE")
		public NDate RDlPrintDate;
		@DbRecordField(dataSourceName="R_DL_SHIP_DATE")
		public NDate RDlShipDate;
		@DbRecordField(dataSourceName="R_DL_BATCH_NO")
		public NString RDlBatchNo;
		@DbRecordField(dataSourceName="R_DL_CONF_DATE")
		public NDate RDlConfDate;
		@DbRecordField(dataSourceName="R_DL_REJ_REASON_1")
		public NString RDlRejReason1;
		@DbRecordField(dataSourceName="R_DL_REJ_REASON_2")
		public NString RDlRejReason2;
		@DbRecordField(dataSourceName="R_DL_REJ_REASON_3")
		public NString RDlRejReason3;
		@DbRecordField(dataSourceName="R_DL_REJ_REASON_4")
		public NString RDlRejReason4;
		@DbRecordField(dataSourceName="R_DL_REJ_REASON_5")
		public NString RDlRejReason5;
		@DbRecordField(dataSourceName="R_DL_SERV_NOTE_STATUS")
		public NString RDlServNoteStatus;
		@DbRecordField(dataSourceName="R_PRINT_SEQ_NO")
		public NNumber RPrintSeqNo;
		@DbRecordField(dataSourceName="R_DL_DOCUMENT_ID")
		public NString RDlDocumentId;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_INFO_ACCESS_IND")
		public NString RInfoAccessInd;
		@DbRecordField(dataSourceName="R_TERM_CODE")
		public NString RTermCode;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
