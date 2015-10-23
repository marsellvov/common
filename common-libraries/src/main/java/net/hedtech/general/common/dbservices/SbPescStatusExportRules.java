package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SbPescStatusExportRules {
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_PESC_STATUS_EXPORT_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NNumber pPidm,NNumber pRequestSeqNo,NString pUserId,NString pDocumentId,NDate pDocIdExtractDate,NDate pDocIdRcptProcDate,NDate pDocIdRespProcDate,NString pDocIdRespStatus,NString pDocIdReceiptStatus,NString pDocumentType,NString pDataOrigin,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_PESC_STATUS_EXPORT_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_REQUEST_SEQ_NO", pRequestSeqNo);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DOCUMENT_ID", pDocumentId);
			cmd.addParameter("@P_DOC_ID_EXTRACT_DATE", pDocIdExtractDate);
			cmd.addParameter("@P_DOC_ID_RCPT_PROC_DATE", pDocIdRcptProcDate);
			cmd.addParameter("@P_DOC_ID_RESP_PROC_DATE", pDocIdRespProcDate);
			cmd.addParameter("@P_DOC_ID_RESP_STATUS", pDocIdRespStatus);
			cmd.addParameter("@P_DOC_ID_RECEIPT_STATUS", pDocIdReceiptStatus);
			cmd.addParameter("@P_DOCUMENT_TYPE", pDocumentType);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NNumber pPidm,NNumber pRequestSeqNo,NString pUserId,NString pDocumentId,NDate pDocIdExtractDate,NDate pDocIdRcptProcDate,NDate pDocIdRespProcDate,NString pDocIdRespStatus,NString pDocIdReceiptStatus,NString pDocumentType,NString pDataOrigin) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_PESC_STATUS_EXPORT_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_REQUEST_SEQ_NO", pRequestSeqNo);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DOCUMENT_ID", pDocumentId);
			cmd.addParameter("@P_DOC_ID_EXTRACT_DATE", pDocIdExtractDate);
			cmd.addParameter("@P_DOC_ID_RCPT_PROC_DATE", pDocIdRcptProcDate);
			cmd.addParameter("@P_DOC_ID_RESP_PROC_DATE", pDocIdRespProcDate);
			cmd.addParameter("@P_DOC_ID_RESP_STATUS", pDocIdRespStatus);
			cmd.addParameter("@P_DOC_ID_RECEIPT_STATUS", pDocIdReceiptStatus);
			cmd.addParameter("@P_DOCUMENT_TYPE", pDocumentType);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
				
			cmd.execute();


		}
		
	
	
	
}
