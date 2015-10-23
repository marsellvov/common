package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Rekci05 {
//		public static void pUpdateDlplusDisbursements(NString pAidyCode,NString pDocumentId,NString pDocumentTypeCode,NDate pDlAcknDate,NString pDlLoanId,NNumber pDlDisbNo,NNumber pSeqNo,NString pDisbStatus,NDate pTransDate,NNumber pRefundAmt,NString pReleaseInd,List<StringNtRow> pDlRejectCodes) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("REKCI05.P_UPDATE_DLPLUS_DISBURSEMENTS", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
//			cmd.addParameter("@P_DOCUMENT_ID", pDocumentId);
//			cmd.addParameter("@P_DOCUMENT_TYPE_CODE", pDocumentTypeCode);
//			cmd.addParameter("@P_DL_ACKN_DATE", pDlAcknDate);
//			cmd.addParameter("@P_DL_LOAN_ID", pDlLoanId);
//			cmd.addParameter("@P_DL_DISB_NO", pDlDisbNo);
//			cmd.addParameter("@P_SEQ_NO", pSeqNo);
//			cmd.addParameter("@P_DISB_STATUS", pDisbStatus);
//			cmd.addParameter("@P_TRANS_DATE", pTransDate);
//			cmd.addParameter("@P_REFUND_AMT", pRefundAmt);
//			cmd.addParameter("@P_RELEASE_IND", pReleaseInd);
//			// cmd.addParameter(DbTypes.getCollectionType("P_DL_REJECT_CODES", "", pDlRejectCodes, object.class));
//				
//			cmd.execute();
//
//
//		}
//		
//		public static void pUpdateDlplusOriginations(NString pAidyCode,NString pDocumentId,NString pSsn,NString pLastName,NDate pBirthDate,NString pParentStatusCde,NString pStudentStatusCde,List<StringNtRow> pRejectCodes,NString pDlLoanId,NNumber pApproveAmt,NString pEmpnIndicator,NString pDlStatus,NString pMpnId,NString pMpnStatusInd,NNumber pParEndorserAmt,List<StringNtRow> pDlRejectCodes,NString pDocumentTypeCode,NDate pConfDate,List<StringNtRow> pResponseErrorField,List<StringNtRow> pLogRejectCode,NString pCreditStatus,NDate pCreditCheckDate,NString pCreditCheckInd,NDate pBookDate,NNumber pLocTotNetLoanAmt) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("REKCI05.P_UPDATE_DLPLUS_ORIGINATIONS", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
//			cmd.addParameter("@P_DOCUMENT_ID", pDocumentId);
//			cmd.addParameter("@P_SSN", pSsn);
//			cmd.addParameter("@P_LAST_NAME", pLastName);
//			cmd.addParameter("@P_BIRTH_DATE", pBirthDate);
//			cmd.addParameter("@P_PARENT_STATUS_CDE", pParentStatusCde);
//			cmd.addParameter("@P_STUDENT_STATUS_CDE", pStudentStatusCde);
//			// cmd.addParameter(DbTypes.getCollectionType("P_REJECT_CODES", "", pRejectCodes, object.class));
//			cmd.addParameter("@P_DL_LOAN_ID", pDlLoanId);
//			cmd.addParameter("@P_APPROVE_AMT", pApproveAmt);
//			cmd.addParameter("@P_EMPN_INDICATOR", pEmpnIndicator);
//			cmd.addParameter("@P_DL_STATUS", pDlStatus);
//			cmd.addParameter("@P_MPN_ID", pMpnId);
//			cmd.addParameter("@P_MPN_STATUS_IND", pMpnStatusInd);
//			cmd.addParameter("@P_PAR_ENDORSER_AMT", pParEndorserAmt);
//			// cmd.addParameter(DbTypes.getCollectionType("P_DL_REJECT_CODES", "", pDlRejectCodes, object.class));
//			cmd.addParameter("@P_DOCUMENT_TYPE_CODE", pDocumentTypeCode);
//			cmd.addParameter("@P_CONF_DATE", pConfDate);
//			// cmd.addParameter(DbTypes.getCollectionType("P_RESPONSE_ERROR_FIELD", "", pResponseErrorField, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("P_LOG_REJECT_CODE", "", pLogRejectCode, object.class));
//			cmd.addParameter("@P_CREDIT_STATUS", pCreditStatus);
//			cmd.addParameter("@P_CREDIT_CHECK_DATE", pCreditCheckDate);
//			cmd.addParameter("@P_CREDIT_CHECK_IND", pCreditCheckInd);
//			cmd.addParameter("@P_BOOK_DATE", pBookDate);
//			cmd.addParameter("@P_LOC_TOT_NET_LOAN_AMT", pLocTotNetLoanAmt);
//				
//			cmd.execute();
//
//
//		}
//		
//		public static void pUpdateDlsubDisbursements(NString pAidyCode,NString pDocumentId,NString pDocumentTypeCode,NDate pDlAcknDate,NString pDlLoanId,NNumber pDlDisbNo,NNumber pSeqNo,NString pDisbStatus,NDate pTransDate,NNumber pRefundAmt,NString pReleaseInd,List<StringNtRow> pDlRejectCodes) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("REKCI05.P_UPDATE_DLSUB_DISBURSEMENTS", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
//			cmd.addParameter("@P_DOCUMENT_ID", pDocumentId);
//			cmd.addParameter("@P_DOCUMENT_TYPE_CODE", pDocumentTypeCode);
//			cmd.addParameter("@P_DL_ACKN_DATE", pDlAcknDate);
//			cmd.addParameter("@P_DL_LOAN_ID", pDlLoanId);
//			cmd.addParameter("@P_DL_DISB_NO", pDlDisbNo);
//			cmd.addParameter("@P_SEQ_NO", pSeqNo);
//			cmd.addParameter("@P_DISB_STATUS", pDisbStatus);
//			cmd.addParameter("@P_TRANS_DATE", pTransDate);
//			cmd.addParameter("@P_REFUND_AMT", pRefundAmt);
//			cmd.addParameter("@P_RELEASE_IND", pReleaseInd);
//			// cmd.addParameter(DbTypes.getCollectionType("P_DL_REJECT_CODES", "", pDlRejectCodes, object.class));
//				
//			cmd.execute();
//
//
//		}
//		
//		public static void pUpdateDlsubOriginations(NString pAidyCode,NString pDocumentId,NString pSsn,NString pLastName,NDate pBirthDate,NString pStudentStatusCde,List<StringNtRow> pRejectCodes,NString pDlLoanId,NNumber pApproveAmt,NString pEmpnIndicator,NString pDlStatus,NString pMpnId,NString pMpnStatusInd,List<StringNtRow> pDlRejectCodes,NString pDocumentTypeCode,NDate pConfDate,List<StringNtRow> pResponseErrorField,List<StringNtRow> pLogRejectCode,NDate pBookDate,NNumber pLocTotNetLoanAmt) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("REKCI05.P_UPDATE_DLSUB_ORIGINATIONS", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
//			cmd.addParameter("@P_DOCUMENT_ID", pDocumentId);
//			cmd.addParameter("@P_SSN", pSsn);
//			cmd.addParameter("@P_LAST_NAME", pLastName);
//			cmd.addParameter("@P_BIRTH_DATE", pBirthDate);
//			cmd.addParameter("@P_STUDENT_STATUS_CDE", pStudentStatusCde);
//			// cmd.addParameter(DbTypes.getCollectionType("P_REJECT_CODES", "", pRejectCodes, object.class));
//			cmd.addParameter("@P_DL_LOAN_ID", pDlLoanId);
//			cmd.addParameter("@P_APPROVE_AMT", pApproveAmt);
//			cmd.addParameter("@P_EMPN_INDICATOR", pEmpnIndicator);
//			cmd.addParameter("@P_DL_STATUS", pDlStatus);
//			cmd.addParameter("@P_MPN_ID", pMpnId);
//			cmd.addParameter("@P_MPN_STATUS_IND", pMpnStatusInd);
//			// cmd.addParameter(DbTypes.getCollectionType("P_DL_REJECT_CODES", "", pDlRejectCodes, object.class));
//			cmd.addParameter("@P_DOCUMENT_TYPE_CODE", pDocumentTypeCode);
//			cmd.addParameter("@P_CONF_DATE", pConfDate);
//			// cmd.addParameter(DbTypes.getCollectionType("P_RESPONSE_ERROR_FIELD", "", pResponseErrorField, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("P_LOG_REJECT_CODE", "", pLogRejectCode, object.class));
//			cmd.addParameter("@P_BOOK_DATE", pBookDate);
//			cmd.addParameter("@P_LOC_TOT_NET_LOAN_AMT", pLocTotNetLoanAmt);
//				
//			cmd.execute();
//
//
//		}
//		
//		public static void pUpdateDlunsubDisbursements(NString pAidyCode,NString pDocumentId,NString pDocumentTypeCode,NDate pDlAcknDate,NString pDlLoanId,NNumber pDlDisbNo,NNumber pSeqNo,NString pDisbStatus,NDate pTransDate,NNumber pRefundAmt,NString pReleaseInd,List<StringNtRow> pDlRejectCodes) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("REKCI05.P_UPDATE_DLUNSUB_DISBURSEMENTS", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
//			cmd.addParameter("@P_DOCUMENT_ID", pDocumentId);
//			cmd.addParameter("@P_DOCUMENT_TYPE_CODE", pDocumentTypeCode);
//			cmd.addParameter("@P_DL_ACKN_DATE", pDlAcknDate);
//			cmd.addParameter("@P_DL_LOAN_ID", pDlLoanId);
//			cmd.addParameter("@P_DL_DISB_NO", pDlDisbNo);
//			cmd.addParameter("@P_SEQ_NO", pSeqNo);
//			cmd.addParameter("@P_DISB_STATUS", pDisbStatus);
//			cmd.addParameter("@P_TRANS_DATE", pTransDate);
//			cmd.addParameter("@P_REFUND_AMT", pRefundAmt);
//			cmd.addParameter("@P_RELEASE_IND", pReleaseInd);
//			// cmd.addParameter(DbTypes.getCollectionType("P_DL_REJECT_CODES", "", pDlRejectCodes, object.class));
//				
//			cmd.execute();
//
//
//		}
//		
//		public static void pUpdateDlunsubOriginations(NString pAidyCode,NString pDocumentId,NString pSsn,NString pLastName,NDate pBirthDate,NString pStudentStatusCde,List<StringNtRow> pRejectCodes,NString pDlLoanId,NNumber pApproveAmt,NString pEmpnIndicator,NString pDlStatus,NString pMpnId,NString pMpnStatusInd,List<StringNtRow> pDlRejectCodes,NString pDocumentTypeCode,NDate pConfDate,List<StringNtRow> pResponseErrorField,List<StringNtRow> pLogRejectCode,NDate pBookDate,NNumber pLocTotNetLoanAmt) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("REKCI05.P_UPDATE_DLUNSUB_ORIGINATIONS", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
//			cmd.addParameter("@P_DOCUMENT_ID", pDocumentId);
//			cmd.addParameter("@P_SSN", pSsn);
//			cmd.addParameter("@P_LAST_NAME", pLastName);
//			cmd.addParameter("@P_BIRTH_DATE", pBirthDate);
//			cmd.addParameter("@P_STUDENT_STATUS_CDE", pStudentStatusCde);
//			// cmd.addParameter(DbTypes.getCollectionType("P_REJECT_CODES", "", pRejectCodes, object.class));
//			cmd.addParameter("@P_DL_LOAN_ID", pDlLoanId);
//			cmd.addParameter("@P_APPROVE_AMT", pApproveAmt);
//			cmd.addParameter("@P_EMPN_INDICATOR", pEmpnIndicator);
//			cmd.addParameter("@P_DL_STATUS", pDlStatus);
//			cmd.addParameter("@P_MPN_ID", pMpnId);
//			cmd.addParameter("@P_MPN_STATUS_IND", pMpnStatusInd);
//			// cmd.addParameter(DbTypes.getCollectionType("P_DL_REJECT_CODES", "", pDlRejectCodes, object.class));
//			cmd.addParameter("@P_DOCUMENT_TYPE_CODE", pDocumentTypeCode);
//			cmd.addParameter("@P_CONF_DATE", pConfDate);
//			// cmd.addParameter(DbTypes.getCollectionType("P_RESPONSE_ERROR_FIELD", "", pResponseErrorField, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("P_LOG_REJECT_CODE", "", pLogRejectCode, object.class));
//			cmd.addParameter("@P_BOOK_DATE", pBookDate);
//			cmd.addParameter("@P_LOC_TOT_NET_LOAN_AMT", pLocTotNetLoanAmt);
//				
//			cmd.execute();
//
//
//		}
//		
//		public static void pUpdatePellDisbursements(NString pAidyCode,NString pDocumentId,NString pSsn,NString pLastName,NDate pBirthDate,NString pDocumentTypeCode,NString pVerifWStatusFlag,NString pSarTranNo,NNumber pYtdAmtPaid,NNumber pDisbAckRefNo,NNumber pDisbAcptAmt,NDate pDisbAcptDate,NNumber pAcptDisbSeqNo,NDate pAcptPayPdStartDate,NString pDisbActionCode,NNumber pAcptPrevDisbSeqNo,List<StringNtRow> pFsaCode,List<StringNtRow> pEditRejects,List<StringNtRow> pDisbErrorFields,List<StringNtRow> pDisbErrorValues,NString pCpsVerInd,NString pHighestCpsTranNo,NDate pProcessDate) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("REKCI05.P_UPDATE_PELL_DISBURSEMENTS", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
//			cmd.addParameter("@P_DOCUMENT_ID", pDocumentId);
//			cmd.addParameter("@P_SSN", pSsn);
//			cmd.addParameter("@P_LAST_NAME", pLastName);
//			cmd.addParameter("@P_BIRTH_DATE", pBirthDate);
//			cmd.addParameter("@P_DOCUMENT_TYPE_CODE", pDocumentTypeCode);
//			cmd.addParameter("@P_VERIF_W_STATUS_FLAG", pVerifWStatusFlag);
//			cmd.addParameter("@P_SAR_TRAN_NO", pSarTranNo);
//			cmd.addParameter("@P_YTD_AMT_PAID", pYtdAmtPaid);
//			cmd.addParameter("@P_DISB_ACK_REF_NO", pDisbAckRefNo);
//			cmd.addParameter("@P_DISB_ACPT_AMT", pDisbAcptAmt);
//			cmd.addParameter("@P_DISB_ACPT_DATE", pDisbAcptDate);
//			cmd.addParameter("@P_ACPT_DISB_SEQ_NO", pAcptDisbSeqNo);
//			cmd.addParameter("@P_ACPT_PAY_PD_START_DATE", pAcptPayPdStartDate);
//			cmd.addParameter("@P_DISB_ACTION_CODE", pDisbActionCode);
//			cmd.addParameter("@P_ACPT_PREV_DISB_SEQ_NO", pAcptPrevDisbSeqNo);
//			// cmd.addParameter(DbTypes.getCollectionType("P_FSA_CODE", "", pFsaCode, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("P_EDIT_REJECTS", "", pEditRejects, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("P_DISB_ERROR_FIELDS", "", pDisbErrorFields, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("P_DISB_ERROR_VALUES", "", pDisbErrorValues, object.class));
//			cmd.addParameter("@P_CPS_VER_IND", pCpsVerInd);
//			cmd.addParameter("@P_HIGHEST_CPS_TRAN_NO", pHighestCpsTranNo);
//			cmd.addParameter("@P_PROCESS_DATE", pProcessDate);
//				
//			cmd.execute();
//
//
//		}
//		
//		public static void pUpdatePellOriginations(NString pAidyCode,NString pDocumentId,NString pSsn,NString pLastName,NDate pBirthDate,NString pDocumentTypeCode,NString pIdStatusCde,List<StringNtRow> pRejectCodes,NString pOrigStatusCde,NString pAcptSarTranNo,NNumber pAcptAmtDue,NNumber pAcptAttendCost,NString pAcptLowCostCde,NString pPrisonInd,NString pAcptVerStatus,List<StringNtRow> pFsaCode,NDate pAcptEnrollmentDate,NString pAcptSecPgiUsed,NString pInstXref,NNumber pSchPellGrant,NString pAcptCurrentSsn,NDate pAcptBirthDate,NString pAcptLastName,NString pAcptFirstName,NString pAcptMi,NNumber pNegPendingAmt,List<StringNtRow> pEditRejects,List<DateNtRow> pAcptEstDisbDates) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("REKCI05.P_UPDATE_PELL_ORIGINATIONS", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
//			cmd.addParameter("@P_DOCUMENT_ID", pDocumentId);
//			cmd.addParameter("@P_SSN", pSsn);
//			cmd.addParameter("@P_LAST_NAME", pLastName);
//			cmd.addParameter("@P_BIRTH_DATE", pBirthDate);
//			cmd.addParameter("@P_DOCUMENT_TYPE_CODE", pDocumentTypeCode);
//			cmd.addParameter("@P_ID_STATUS_CDE", pIdStatusCde);
//			// cmd.addParameter(DbTypes.getCollectionType("P_REJECT_CODES", "", pRejectCodes, object.class));
//			cmd.addParameter("@P_ORIG_STATUS_CDE", pOrigStatusCde);
//			cmd.addParameter("@P_ACPT_SAR_TRAN_NO", pAcptSarTranNo);
//			cmd.addParameter("@P_ACPT_AMT_DUE", pAcptAmtDue);
//			cmd.addParameter("@P_ACPT_ATTEND_COST", pAcptAttendCost);
//			cmd.addParameter("@P_ACPT_LOW_COST_CDE", pAcptLowCostCde);
//			cmd.addParameter("@P_PRISON_IND", pPrisonInd);
//			cmd.addParameter("@P_ACPT_VER_STATUS", pAcptVerStatus);
//			// cmd.addParameter(DbTypes.getCollectionType("P_FSA_CODE", "", pFsaCode, object.class));
//			cmd.addParameter("@P_ACPT_ENROLLMENT_DATE", pAcptEnrollmentDate);
//			cmd.addParameter("@P_ACPT_SEC_PGI_USED", pAcptSecPgiUsed);
//			cmd.addParameter("@P_INST_XREF", pInstXref);
//			cmd.addParameter("@P_SCH_PELL_GRANT", pSchPellGrant);
//			cmd.addParameter("@P_ACPT_CURRENT_SSN", pAcptCurrentSsn);
//			cmd.addParameter("@P_ACPT_BIRTH_DATE", pAcptBirthDate);
//			cmd.addParameter("@P_ACPT_LAST_NAME", pAcptLastName);
//			cmd.addParameter("@P_ACPT_FIRST_NAME", pAcptFirstName);
//			cmd.addParameter("@P_ACPT_MI", pAcptMi);
//			cmd.addParameter("@P_NEG_PENDING_AMT", pNegPendingAmt);
//			// cmd.addParameter(DbTypes.getCollectionType("P_EDIT_REJECTS", "", pEditRejects, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("P_ACPT_EST_DISB_DATES", "", pAcptEstDisbDates, object.class));
//				
//			cmd.execute();
//
//
//		}
		
		public static void pUpdateRercoddReceipt(NString pAidyCode,NString pDocumentId,NDate pCreatedDateTime,NString pDocumentStatusCode,NString pDocumentType) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("REKCI05.P_UPDATE_RERCODD_RECEIPT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_DOCUMENT_ID", pDocumentId);
			cmd.addParameter("@P_CREATED_DATE_TIME", pCreatedDateTime);
			cmd.addParameter("@P_DOCUMENT_STATUS_CODE", pDocumentStatusCode);
			cmd.addParameter("@P_DOCUMENT_TYPE", pDocumentType);
				
			cmd.execute();


		}
		
		public static void pUpdateRercoddResponse(NString pAidyCode,NString pDocumentId,NDate pCreatedDateTime,NString pDocumentStatusCode,NString pDocumentType) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("REKCI05.P_UPDATE_RERCODD_RESPONSE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_DOCUMENT_ID", pDocumentId);
			cmd.addParameter("@P_CREATED_DATE_TIME", pCreatedDateTime);
			cmd.addParameter("@P_DOCUMENT_STATUS_CODE", pDocumentStatusCode);
			cmd.addParameter("@P_DOCUMENT_TYPE", pDocumentType);
				
			cmd.execute();


		}
		
	
	
	
}
