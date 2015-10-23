package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class RbPromissoryNoteRules {
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_PROMISSORY_NOTE_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NString pAidyCode,NNumber pPidm,NString pFundCode,NString pPeriod,NDate pEffDate,NString pSatInd,NDate pSatDate,NNumber pDlSeqNo,NString pDlNoteStatus,NDate pDlPrintDate,NDate pDlShipDate,NString pDlBatchNo,NDate pDlConfDate,NString pDlRejReason1,NString pDlRejReason2,NString pDlRejReason3,NString pDlRejReason4,NString pDlRejReason5,NString pDlServNoteStatus,NNumber pPrintSeqNo,NString pDlDocumentId,NString pUserId,NString pDataOrigin,NString pInfoAccessInd,NString pTermCode,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_PROMISSORY_NOTE_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
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
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NString pAidyCode,NNumber pPidm,NString pFundCode,NString pPeriod,NDate pEffDate,NString pSatInd,NDate pSatDate,NNumber pDlSeqNo,NString pDlNoteStatus,NDate pDlPrintDate,NDate pDlShipDate,NString pDlBatchNo,NDate pDlConfDate,NString pDlRejReason1,NString pDlRejReason2,NString pDlRejReason3,NString pDlRejReason4,NString pDlRejReason5,NString pDlServNoteStatus,NNumber pPrintSeqNo,NString pDlDocumentId,NString pUserId,NString pDataOrigin,NString pInfoAccessInd,NString pTermCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_PROMISSORY_NOTE_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
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
				
			cmd.execute();


		}
		
	
	
	
}
