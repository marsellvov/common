package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SbPescStatusImpRules {
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_PESC_STATUS_IMP_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NString pRecvDocumentId,NString pSentDocumentId,NString pSentOrgCde,NString pSentOrgCdeType,NString pSentOrgName,NDate pDocIdReceiveDate,NString pDocIdReceiveStatus,NNumber pDcmtSeqno,NDate pProcessedDate,NString pUserId,NString pDataOrigin,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_PESC_STATUS_IMP_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_RECV_DOCUMENT_ID", pRecvDocumentId);
			cmd.addParameter("@P_SENT_DOCUMENT_ID", pSentDocumentId);
			cmd.addParameter("@P_SENT_ORG_CDE", pSentOrgCde);
			cmd.addParameter("@P_SENT_ORG_CDE_TYPE", pSentOrgCdeType);
			cmd.addParameter("@P_SENT_ORG_NAME", pSentOrgName);
			cmd.addParameter("@P_DOC_ID_RECEIVE_DATE", pDocIdReceiveDate);
			cmd.addParameter("@P_DOC_ID_RECEIVE_STATUS", pDocIdReceiveStatus);
			cmd.addParameter("@P_DCMT_SEQNO", pDcmtSeqno);
			cmd.addParameter("@P_PROCESSED_DATE", pProcessedDate);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NString pRecvDocumentId,NString pSentDocumentId,NString pSentOrgCde,NString pSentOrgCdeType,NString pSentOrgName,NDate pDocIdReceiveDate,NString pDocIdReceiveStatus,NNumber pDcmtSeqno,NDate pProcessedDate,NString pUserId,NString pDataOrigin) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_PESC_STATUS_IMP_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_RECV_DOCUMENT_ID", pRecvDocumentId);
			cmd.addParameter("@P_SENT_DOCUMENT_ID", pSentDocumentId);
			cmd.addParameter("@P_SENT_ORG_CDE", pSentOrgCde);
			cmd.addParameter("@P_SENT_ORG_CDE_TYPE", pSentOrgCdeType);
			cmd.addParameter("@P_SENT_ORG_NAME", pSentOrgName);
			cmd.addParameter("@P_DOC_ID_RECEIVE_DATE", pDocIdReceiveDate);
			cmd.addParameter("@P_DOC_ID_RECEIVE_STATUS", pDocIdReceiveStatus);
			cmd.addParameter("@P_DCMT_SEQNO", pDcmtSeqno);
			cmd.addParameter("@P_PROCESSED_DATE", pProcessedDate);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
				
			cmd.execute();


		}
		
	
	
	
}
