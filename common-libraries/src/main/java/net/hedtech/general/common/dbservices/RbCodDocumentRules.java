package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class RbCodDocumentRules {
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_COD_DOCUMENT_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NString pAidyCode,NString pUserId,NString pDocumentId,NDate pDocIdExtractDate,NDate pDocIdRcptProcDate,NDate pDocIdRespProcDate,NString pDocIdRespStatus,NString pDocIdReceiptStatus,NString pDocumentType,NString pDataOrigin,NString pExtractFile,NString pResentAsDocId,NString pAttendingId,NString pReportingId,NString pSourceId,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_COD_DOCUMENT_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DOCUMENT_ID", pDocumentId);
			cmd.addParameter("@P_DOC_ID_EXTRACT_DATE", pDocIdExtractDate);
			cmd.addParameter("@P_DOC_ID_RCPT_PROC_DATE", pDocIdRcptProcDate);
			cmd.addParameter("@P_DOC_ID_RESP_PROC_DATE", pDocIdRespProcDate);
			cmd.addParameter("@P_DOC_ID_RESP_STATUS", pDocIdRespStatus);
			cmd.addParameter("@P_DOC_ID_RECEIPT_STATUS", pDocIdReceiptStatus);
			cmd.addParameter("@P_DOCUMENT_TYPE", pDocumentType);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_EXTRACT_FILE", pExtractFile);
			cmd.addParameter("@P_RESENT_AS_DOC_ID", pResentAsDocId);
			cmd.addParameter("@P_ATTENDING_ID", pAttendingId);
			cmd.addParameter("@P_REPORTING_ID", pReportingId);
			cmd.addParameter("@P_SOURCE_ID", pSourceId);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NString pAidyCode,NString pUserId,NString pDocumentId,NDate pDocIdExtractDate,NDate pDocIdRcptProcDate,NDate pDocIdRespProcDate,NString pDocIdRespStatus,NString pDocIdReceiptStatus,NString pDocumentType,NString pDataOrigin,NString pExtractFile,NString pResentAsDocId,NString pAttendingId,NString pReportingId,NString pSourceId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_COD_DOCUMENT_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DOCUMENT_ID", pDocumentId);
			cmd.addParameter("@P_DOC_ID_EXTRACT_DATE", pDocIdExtractDate);
			cmd.addParameter("@P_DOC_ID_RCPT_PROC_DATE", pDocIdRcptProcDate);
			cmd.addParameter("@P_DOC_ID_RESP_PROC_DATE", pDocIdRespProcDate);
			cmd.addParameter("@P_DOC_ID_RESP_STATUS", pDocIdRespStatus);
			cmd.addParameter("@P_DOC_ID_RECEIPT_STATUS", pDocIdReceiptStatus);
			cmd.addParameter("@P_DOCUMENT_TYPE", pDocumentType);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_EXTRACT_FILE", pExtractFile);
			cmd.addParameter("@P_RESENT_AS_DOC_ID", pResentAsDocId);
			cmd.addParameter("@P_ATTENDING_ID", pAttendingId);
			cmd.addParameter("@P_REPORTING_ID", pReportingId);
			cmd.addParameter("@P_SOURCE_ID", pSourceId);
				
			cmd.execute();


		}
		
	
	
	
}
