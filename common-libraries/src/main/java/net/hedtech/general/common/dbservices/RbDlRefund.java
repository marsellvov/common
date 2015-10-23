package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class RbDlRefund {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_DL_REFUND.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_DL_REFUND.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(DlRefundRecRow recOne,DlRefundRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_DL_REFUND.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, DlRefundRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, DlRefundRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NNumber pPidm,NString pDlLoanId,NNumber pSeqNo,NNumber pDlDisbNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_DL_REFUND.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_DL_LOAN_ID", pDlLoanId);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_DL_DISB_NO", pDlDisbNo);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_DL_REFUND.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NNumber pPidm,NString pDlLoanId,NNumber pSeqNo,NNumber pDlDisbNo,NDate pTransDate,NString pBatchNo,NNumber pRefundAmt,NDate pAckDate,NString pDocumentId,NString pUserId,NString pDataOrigin,NNumber pPrevDisbSeqNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_DL_REFUND.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_DL_LOAN_ID", pDlLoanId);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_DL_DISB_NO", pDlDisbNo);
			cmd.addParameter("@P_TRANS_DATE", pTransDate);
			cmd.addParameter("@P_BATCH_NO", pBatchNo);
			cmd.addParameter("@P_REFUND_AMT", pRefundAmt);
			cmd.addParameter("@P_ACK_DATE", pAckDate);
			cmd.addParameter("@P_DOCUMENT_ID", pDocumentId);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_PREV_DISB_SEQ_NO", pPrevDisbSeqNo);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_DL_REFUND.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NNumber pPidm,NString pDlLoanId,NNumber pSeqNo,NNumber pDlDisbNo,NDate pTransDate,NString pBatchNo,NNumber pRefundAmt,NDate pAckDate,NString pDocumentId,NString pUserId,NString pDataOrigin,NNumber pPrevDisbSeqNo,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_DL_REFUND.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_DL_LOAN_ID", pDlLoanId);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_DL_DISB_NO", pDlDisbNo);
			cmd.addParameter("@P_TRANS_DATE", pTransDate);
			cmd.addParameter("@P_BATCH_NO", pBatchNo);
			cmd.addParameter("@P_REFUND_AMT", pRefundAmt);
			cmd.addParameter("@P_ACK_DATE", pAckDate);
			cmd.addParameter("@P_DOCUMENT_ID", pDocumentId);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_PREV_DISB_SEQ_NO", pPrevDisbSeqNo);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NNumber pPidm,NString pDlLoanId,NNumber pSeqNo,NNumber pDlDisbNo,NDate pTransDate,NString pBatchNo,NNumber pRefundAmt,NDate pAckDate,NString pDocumentId,NString pUserId,NString pDataOrigin,NNumber pPrevDisbSeqNo,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_DL_REFUND.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_DL_LOAN_ID", pDlLoanId);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_DL_DISB_NO", pDlDisbNo);
			cmd.addParameter("@P_TRANS_DATE", pTransDate);
			cmd.addParameter("@P_BATCH_NO", pBatchNo);
			cmd.addParameter("@P_REFUND_AMT", pRefundAmt);
			cmd.addParameter("@P_ACK_DATE", pAckDate);
			cmd.addParameter("@P_DOCUMENT_ID", pDocumentId);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_PREV_DISB_SEQ_NO", pPrevDisbSeqNo);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_DL_REFUND.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NNumber pPidm,NString pDlLoanId,NNumber pSeqNo,NNumber pDlDisbNo,NDate pTransDate,NString pBatchNo,NNumber pRefundAmt,NDate pAckDate,NString pDocumentId,NString pUserId,NString pDataOrigin,NNumber pPrevDisbSeqNo,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_DL_REFUND.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_DL_LOAN_ID", pDlLoanId);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_DL_DISB_NO", pDlDisbNo);
			cmd.addParameter("@P_TRANS_DATE", pTransDate);
			cmd.addParameter("@P_BATCH_NO", pBatchNo);
			cmd.addParameter("@P_REFUND_AMT", pRefundAmt);
			cmd.addParameter("@P_ACK_DATE", pAckDate);
			cmd.addParameter("@P_DOCUMENT_ID", pDocumentId);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_PREV_DISB_SEQ_NO", pPrevDisbSeqNo);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="DlRefundRecRow", dataSourceName="DL_REFUND_REC")
	public static class DlRefundRecRow
	{
		@DbRecordField(dataSourceName="R_PIDM")
		public NNumber RPidm;
		@DbRecordField(dataSourceName="R_DL_LOAN_ID")
		public NString RDlLoanId;
		@DbRecordField(dataSourceName="R_SEQ_NO")
		public NNumber RSeqNo;
		@DbRecordField(dataSourceName="R_DL_DISB_NO")
		public NNumber RDlDisbNo;
		@DbRecordField(dataSourceName="R_TRANS_DATE")
		public NDate RTransDate;
		@DbRecordField(dataSourceName="R_BATCH_NO")
		public NString RBatchNo;
		@DbRecordField(dataSourceName="R_REFUND_AMT")
		public NNumber RRefundAmt;
		@DbRecordField(dataSourceName="R_ACK_DATE")
		public NDate RAckDate;
		@DbRecordField(dataSourceName="R_DOCUMENT_ID")
		public NString RDocumentId;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_PREV_DISB_SEQ_NO")
		public NNumber RPrevDisbSeqNo;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
