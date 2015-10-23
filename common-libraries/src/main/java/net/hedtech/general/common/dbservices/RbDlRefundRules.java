package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class RbDlRefundRules {
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_DL_REFUND_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NNumber pPidm,NString pDlLoanId,NNumber pSeqNo,NNumber pDlDisbNo,NDate pTransDate,NString pBatchNo,NNumber pRefundAmt,NDate pAckDate,NString pDocumentId,NString pUserId,NString pDataOrigin,NNumber pPrevDisbSeqNo,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_DL_REFUND_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
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
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NNumber pPidm,NString pDlLoanId,NNumber pSeqNo,NNumber pDlDisbNo,NDate pTransDate,NString pBatchNo,NNumber pRefundAmt,NDate pAckDate,NString pDocumentId,NString pUserId,NString pDataOrigin,NNumber pPrevDisbSeqNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_DL_REFUND_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
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


		}
		
	
	
	
}
