package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Rekci3d {
		public static NString fGetVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("REKCI3D.F_GET_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
//		public static void pUpdateAcgDisbursements(NString pAidyCode,NString pDocumentId,NString pSsn,NString pLastName,NDate pBirthDate,NString pDocumentTypeCode,NNumber pYtdAmtPaid,NNumber pDisbAckRefNo,NNumber pDisbAcptAmt,NDate pDisbAcptDate,NDate pAcptPayPdStartDate,NNumber pAcptDisbSeqNo,NString pDisbActionCode,NNumber pAcptPrevDisbSeqNo,List<StringNtRow> pFsaCode,List<StringNtRow> pEditRejects,List<StringNtRow> pDisbErrorFields,List<StringNtRow> pDisbErrorValues,NString pCpsVerInd,NString pHighestCpsTranNo,NDate pProcessDate,NString pAwardId,NNumber pPercentEligUsed) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("REKCI3D.P_UPDATE_ACG_DISBURSEMENTS", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
//			cmd.addParameter("@P_DOCUMENT_ID", pDocumentId);
//			cmd.addParameter("@P_SSN", pSsn);
//			cmd.addParameter("@P_LAST_NAME", pLastName);
//			cmd.addParameter("@P_BIRTH_DATE", pBirthDate);
//			cmd.addParameter("@P_DOCUMENT_TYPE_CODE", pDocumentTypeCode);
//			cmd.addParameter("@P_YTD_AMT_PAID", pYtdAmtPaid);
//			cmd.addParameter("@P_DISB_ACK_REF_NO", pDisbAckRefNo);
//			cmd.addParameter("@P_DISB_ACPT_AMT", pDisbAcptAmt);
//			cmd.addParameter("@P_DISB_ACPT_DATE", pDisbAcptDate);
//			cmd.addParameter("@P_ACPT_PAY_PD_START_DATE", pAcptPayPdStartDate);
//			cmd.addParameter("@P_ACPT_DISB_SEQ_NO", pAcptDisbSeqNo);
//			cmd.addParameter("@P_DISB_ACTION_CODE", pDisbActionCode);
//			cmd.addParameter("@P_ACPT_PREV_DISB_SEQ_NO", pAcptPrevDisbSeqNo);
//			// cmd.addParameter(DbTypes.getCollectionType("P_FSA_CODE", "", pFsaCode, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("P_EDIT_REJECTS", "", pEditRejects, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("P_DISB_ERROR_FIELDS", "", pDisbErrorFields, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("P_DISB_ERROR_VALUES", "", pDisbErrorValues, object.class));
//			cmd.addParameter("@P_CPS_VER_IND", pCpsVerInd);
//			cmd.addParameter("@P_HIGHEST_CPS_TRAN_NO", pHighestCpsTranNo);
//			cmd.addParameter("@P_PROCESS_DATE", pProcessDate);
//			cmd.addParameter("@P_AWARD_ID", pAwardId);
//			cmd.addParameter("@P_PERCENT_ELIG_USED", pPercentEligUsed);
//				
//			cmd.execute();
//
//
//		}
//		
//		public static void pUpdateAcgOriginations(NString pAidyCode,NString pDocumentId,NString pSsn,NString pLastName,NDate pBirthDate,NString pDocumentTypeCode,NString pIdStatusCde,List<StringNtRow> pRejectCodes,NString pOrigStatusCde,NString pAcptSarTranNo,NNumber pAcptAwardAmount,List<StringNtRow> pFsaCode,NDate pAcptEnrollmentDate,NNumber pNegPendingAmt,List<StringNtRow> pEditRejects,List<StringNtRow> pEditField,List<StringNtRow> pEditValue,List<StringNtRow> pRejectFields,NNumber pYtdAmtPaid,NString pAcptYrInColl,NString pAcptPayReasonCde,NString pAcptHsProgramCode,NString pAwardId,NNumber pPercentEligUsed) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("REKCI3D.P_UPDATE_ACG_ORIGINATIONS", DbManager.getDataBaseFactory());
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
//			cmd.addParameter("@P_ACPT_AWARD_AMOUNT", pAcptAwardAmount);
//			// cmd.addParameter(DbTypes.getCollectionType("P_FSA_CODE", "", pFsaCode, object.class));
//			cmd.addParameter("@P_ACPT_ENROLLMENT_DATE", pAcptEnrollmentDate);
//			cmd.addParameter("@P_NEG_PENDING_AMT", pNegPendingAmt);
//			// cmd.addParameter(DbTypes.getCollectionType("P_EDIT_REJECTS", "", pEditRejects, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("P_EDIT_FIELD", "", pEditField, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("P_EDIT_VALUE", "", pEditValue, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("P_REJECT_FIELDS", "", pRejectFields, object.class));
//			cmd.addParameter("@P_YTD_AMT_PAID", pYtdAmtPaid);
//			cmd.addParameter("@P_ACPT_YR_IN_COLL", pAcptYrInColl);
//			cmd.addParameter("@P_ACPT_PAY_REASON_CDE", pAcptPayReasonCde);
//			cmd.addParameter("@P_ACPT_HS_PROGRAM_CODE", pAcptHsProgramCode);
//			cmd.addParameter("@P_AWARD_ID", pAwardId);
//			cmd.addParameter("@P_PERCENT_ELIG_USED", pPercentEligUsed);
//				
//			cmd.execute();
//
//
//		}
		
		public static void pUpdateCounselingAck(NString pAidyCode,NString pDocumentId,NString pDocumentTypeCode,NDate pProcessDate,NString pSsn,NDate pBirthDate,NString pLastName,NString pFirstName,NString pMiddleInit,NString pAwardYear,NString pCounselingType,NDate pCompDate,NNumber pSequenceNo,NString pEntrReq,NString pEntrReqStatus,NString pGplusEntrReq,NString pGplusEntrReqStatus,NString pCounselingRespCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("REKCI3D.P_UPDATE_COUNSELING_ACK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_DOCUMENT_ID", pDocumentId);
			cmd.addParameter("@P_DOCUMENT_TYPE_CODE", pDocumentTypeCode);
			cmd.addParameter("@P_PROCESS_DATE", pProcessDate);
			cmd.addParameter("@P_SSN", pSsn);
			cmd.addParameter("@P_BIRTH_DATE", pBirthDate);
			cmd.addParameter("@P_LAST_NAME", pLastName);
			cmd.addParameter("@P_FIRST_NAME", pFirstName);
			cmd.addParameter("@P_MIDDLE_INIT", pMiddleInit);
			cmd.addParameter("@P_AWARD_YEAR", pAwardYear);
			cmd.addParameter("@P_COUNSELING_TYPE", pCounselingType);
			cmd.addParameter("@P_COMP_DATE", pCompDate);
			cmd.addParameter("@P_SEQUENCE_NO", pSequenceNo);
			cmd.addParameter("@P_ENTR_REQ", pEntrReq);
			cmd.addParameter("@P_ENTR_REQ_STATUS", pEntrReqStatus);
			cmd.addParameter("@P_GPLUS_ENTR_REQ", pGplusEntrReq);
			cmd.addParameter("@P_GPLUS_ENTR_REQ_STATUS", pGplusEntrReqStatus);
			cmd.addParameter("@P_COUNSELING_RESP_CODE", pCounselingRespCode);
				
			cmd.execute();


		}
		
//		public static void pUpdateDlplusDisbursements(NString pAidyCode,NString pDocumentId,NString pDocumentTypeCode,NDate pDlAcknDate,NString pDlLoanId,NNumber pDlDisbNo,NNumber pSeqNo,NString pDisbStatus,NDate pTransDate,NNumber pRefundAmt,NString pReleaseInd,List<StringNtRow> pDlRejectCodes,List<StringNtRow> pDlErrorFields,NNumber pDlPrevSeqNo) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("REKCI3D.P_UPDATE_DLPLUS_DISBURSEMENTS", DbManager.getDataBaseFactory());
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
//			// cmd.addParameter(DbTypes.getCollectionType("P_DL_ERROR_FIELDS", "", pDlErrorFields, object.class));
//			cmd.addParameter("@P_DL_PREV_SEQ_NO", pDlPrevSeqNo);
//				
//			cmd.execute();
//
//
//		}
//		
//		public static void pUpdateDlplusOriginations(NString pAidyCode,NString pDocumentId,NString pSsn,NString pLastName,NDate pBirthDate,NString pParentStatusCde,NString pStudentStatusCde,List<StringNtRow> pRejectCodes,NString pDlLoanId,NNumber pApproveAmt,NString pEmpnIndicator,NString pDlStatus,NString pMpnId,NDate pMpnExpDate,NString pMpnStatusInd,NNumber pParEndorserAmt,List<StringNtRow> pDlRejectCodes,NString pDocumentTypeCode,NDate pConfDate,List<StringNtRow> pResponseErrorField,List<StringNtRow> pLogRejectCode,NString pCreditStatus,NDate pCreditCheckDate,NString pCreditCheckInd,NDate pBookDate,NNumber pLocTotNetLoanAmt,List<StringNtRow> pDlErrorFields,List<StringNtRow> pRejectFields,NNumber pAppId,NString pMaxLoanInd,NDate pAppCompDate,NString pDefermentOpt,NString pPlusToStudent,NString pOrigCreditStatus,NDate pCreditCheckExpDate,NNumber pAppLoanAmt,NString pCrAppealStatus,NString pCrOverrideCde,NString pAddress,NString pCity,NString pState,NString pZip,NString pNatnCode,NString pPhoneNo,NString pStuEmail,NString pLocalAddress,NString pLocalCity,NString pLocalStatCode,NString pLocalZip,NString pLocalNatnCode,NString pParSsn,NDate pParBirthDate,NString pParLastName,NString pParFirstName,NString pParMi,NString pParCitzInd,NString pParAddress,NString pParCity,NString pParState,NString pParZip,NString pParNatnCode,NString pParPhoneNo,NString pBorrowerEmail,NString pParLocalAddress,NString pParLocalCity,NString pParLocalStatCode,NString pParLocalZip,NString pParLocalNatnCode,NString pCreditDocumentId,NString pCrActionOpt,NString pFirstName,NString pMi,NString pUnsatPnStatus,NString pMpnLinkInd) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("REKCI3D.P_UPDATE_DLPLUS_ORIGINATIONS", DbManager.getDataBaseFactory());
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
//			cmd.addParameter("@P_MPN_EXP_DATE", pMpnExpDate);
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
//			// cmd.addParameter(DbTypes.getCollectionType("P_DL_ERROR_FIELDS", "", pDlErrorFields, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("P_REJECT_FIELDS", "", pRejectFields, object.class));
//			cmd.addParameter("@P_APP_ID", pAppId);
//			cmd.addParameter("@P_MAX_LOAN_IND", pMaxLoanInd);
//			cmd.addParameter("@P_APP_COMP_DATE", pAppCompDate);
//			cmd.addParameter("@P_DEFERMENT_OPT", pDefermentOpt);
//			cmd.addParameter("@P_PLUS_TO_STUDENT", pPlusToStudent);
//			cmd.addParameter("@P_ORIG_CREDIT_STATUS", pOrigCreditStatus);
//			cmd.addParameter("@P_CREDIT_CHECK_EXP_DATE", pCreditCheckExpDate);
//			cmd.addParameter("@P_APP_LOAN_AMT", pAppLoanAmt);
//			cmd.addParameter("@P_CR_APPEAL_STATUS", pCrAppealStatus);
//			cmd.addParameter("@P_CR_OVERRIDE_CDE", pCrOverrideCde);
//			cmd.addParameter("@P_ADDRESS", pAddress);
//			cmd.addParameter("@P_CITY", pCity);
//			cmd.addParameter("@P_STATE", pState);
//			cmd.addParameter("@P_ZIP", pZip);
//			cmd.addParameter("@P_NATN_CODE", pNatnCode);
//			cmd.addParameter("@P_PHONE_NO", pPhoneNo);
//			cmd.addParameter("@P_STU_EMAIL", pStuEmail);
//			cmd.addParameter("@P_LOCAL_ADDRESS", pLocalAddress);
//			cmd.addParameter("@P_LOCAL_CITY", pLocalCity);
//			cmd.addParameter("@P_LOCAL_STAT_CODE", pLocalStatCode);
//			cmd.addParameter("@P_LOCAL_ZIP", pLocalZip);
//			cmd.addParameter("@P_LOCAL_NATN_CODE", pLocalNatnCode);
//			cmd.addParameter("@P_PAR_SSN", pParSsn);
//			cmd.addParameter("@P_PAR_BIRTH_DATE", pParBirthDate);
//			cmd.addParameter("@P_PAR_LAST_NAME", pParLastName);
//			cmd.addParameter("@P_PAR_FIRST_NAME", pParFirstName);
//			cmd.addParameter("@P_PAR_MI", pParMi);
//			cmd.addParameter("@P_PAR_CITZ_IND", pParCitzInd);
//			cmd.addParameter("@P_PAR_ADDRESS", pParAddress);
//			cmd.addParameter("@P_PAR_CITY", pParCity);
//			cmd.addParameter("@P_PAR_STATE", pParState);
//			cmd.addParameter("@P_PAR_ZIP", pParZip);
//			cmd.addParameter("@P_PAR_NATN_CODE", pParNatnCode);
//			cmd.addParameter("@P_PAR_PHONE_NO", pParPhoneNo);
//			cmd.addParameter("@P_BORROWER_EMAIL", pBorrowerEmail);
//			cmd.addParameter("@P_PAR_LOCAL_ADDRESS", pParLocalAddress);
//			cmd.addParameter("@P_PAR_LOCAL_CITY", pParLocalCity);
//			cmd.addParameter("@P_PAR_LOCAL_STAT_CODE", pParLocalStatCode);
//			cmd.addParameter("@P_PAR_LOCAL_ZIP", pParLocalZip);
//			cmd.addParameter("@P_PAR_LOCAL_NATN_CODE", pParLocalNatnCode);
//			cmd.addParameter("@P_CREDIT_DOCUMENT_ID", pCreditDocumentId);
//			cmd.addParameter("@P_CR_ACTION_OPT", pCrActionOpt);
//			cmd.addParameter("@P_FIRST_NAME", pFirstName);
//			cmd.addParameter("@P_MI", pMi);
//			cmd.addParameter("@P_UNSAT_PN_STATUS", pUnsatPnStatus);
//			cmd.addParameter("@P_MPN_LINK_IND", pMpnLinkInd);
//				
//			cmd.execute();
//
//
//		}
//		
//		public static void pUpdateDlsubDisbursements(NString pAidyCode,NString pDocumentId,NString pDocumentTypeCode,NDate pDlAcknDate,NString pDlLoanId,NNumber pDlDisbNo,NNumber pSeqNo,NString pDisbStatus,NDate pTransDate,NNumber pRefundAmt,NString pReleaseInd,List<StringNtRow> pDlRejectCodes,List<StringNtRow> pDlErrorFields,NNumber pDlPrevSeqNo) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("REKCI3D.P_UPDATE_DLSUB_DISBURSEMENTS", DbManager.getDataBaseFactory());
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
//			// cmd.addParameter(DbTypes.getCollectionType("P_DL_ERROR_FIELDS", "", pDlErrorFields, object.class));
//			cmd.addParameter("@P_DL_PREV_SEQ_NO", pDlPrevSeqNo);
//				
//			cmd.execute();
//
//
//		}
//		
//		public static void pUpdateDlsubOriginations(NString pAidyCode,NString pDocumentId,NString pSsn,NString pLastName,NDate pBirthDate,NString pStudentStatusCde,List<StringNtRow> pRejectCodes,NString pDlLoanId,NNumber pApproveAmt,NString pEmpnIndicator,NString pDlStatus,NString pMpnId,NDate pMpnExpDate,NString pMpnStatusInd,List<StringNtRow> pDlRejectCodes,NString pDocumentTypeCode,NDate pConfDate,List<StringNtRow> pResponseErrorField,List<StringNtRow> pLogRejectCode,NDate pBookDate,NNumber pLocTotNetLoanAmt,List<StringNtRow> pDlErrorFields,List<StringNtRow> pRejectFields,NString pUnsatPnStatus,NString pMpnLinkInd) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("REKCI3D.P_UPDATE_DLSUB_ORIGINATIONS", DbManager.getDataBaseFactory());
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
//			cmd.addParameter("@P_MPN_EXP_DATE", pMpnExpDate);
//			cmd.addParameter("@P_MPN_STATUS_IND", pMpnStatusInd);
//			// cmd.addParameter(DbTypes.getCollectionType("P_DL_REJECT_CODES", "", pDlRejectCodes, object.class));
//			cmd.addParameter("@P_DOCUMENT_TYPE_CODE", pDocumentTypeCode);
//			cmd.addParameter("@P_CONF_DATE", pConfDate);
//			// cmd.addParameter(DbTypes.getCollectionType("P_RESPONSE_ERROR_FIELD", "", pResponseErrorField, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("P_LOG_REJECT_CODE", "", pLogRejectCode, object.class));
//			cmd.addParameter("@P_BOOK_DATE", pBookDate);
//			cmd.addParameter("@P_LOC_TOT_NET_LOAN_AMT", pLocTotNetLoanAmt);
//			// cmd.addParameter(DbTypes.getCollectionType("P_DL_ERROR_FIELDS", "", pDlErrorFields, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("P_REJECT_FIELDS", "", pRejectFields, object.class));
//			cmd.addParameter("@P_UNSAT_PN_STATUS", pUnsatPnStatus);
//			cmd.addParameter("@P_MPN_LINK_IND", pMpnLinkInd);
//				
//			cmd.execute();
//
//
//		}
//		
//		public static void pUpdateDlunsubDisbursements(NString pAidyCode,NString pDocumentId,NString pDocumentTypeCode,NDate pDlAcknDate,NString pDlLoanId,NNumber pDlDisbNo,NNumber pSeqNo,NString pDisbStatus,NDate pTransDate,NNumber pRefundAmt,NString pReleaseInd,List<StringNtRow> pDlRejectCodes,List<StringNtRow> pDlErrorFields,NNumber pDlPrevSeqNo) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("REKCI3D.P_UPDATE_DLUNSUB_DISBURSEMENTS", DbManager.getDataBaseFactory());
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
//			// cmd.addParameter(DbTypes.getCollectionType("P_DL_ERROR_FIELDS", "", pDlErrorFields, object.class));
//			cmd.addParameter("@P_DL_PREV_SEQ_NO", pDlPrevSeqNo);
//				
//			cmd.execute();
//
//
//		}
//		
//		public static void pUpdateDlunsubOriginations(NString pAidyCode,NString pDocumentId,NString pSsn,NString pLastName,NDate pBirthDate,NString pStudentStatusCde,List<StringNtRow> pRejectCodes,NString pDlLoanId,NNumber pApproveAmt,NString pEmpnIndicator,NString pDlStatus,NString pMpnId,NDate pMpnExpDate,NString pMpnStatusInd,List<StringNtRow> pDlRejectCodes,NString pDocumentTypeCode,NDate pConfDate,List<StringNtRow> pResponseErrorField,List<StringNtRow> pLogRejectCode,NDate pBookDate,NNumber pLocTotNetLoanAmt,List<StringNtRow> pDlErrorFields,List<StringNtRow> pRejectFields,NString pUnsatPnStatus,NString pMpnLinkInd) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("REKCI3D.P_UPDATE_DLUNSUB_ORIGINATIONS", DbManager.getDataBaseFactory());
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
//			cmd.addParameter("@P_MPN_EXP_DATE", pMpnExpDate);
//			cmd.addParameter("@P_MPN_STATUS_IND", pMpnStatusInd);
//			// cmd.addParameter(DbTypes.getCollectionType("P_DL_REJECT_CODES", "", pDlRejectCodes, object.class));
//			cmd.addParameter("@P_DOCUMENT_TYPE_CODE", pDocumentTypeCode);
//			cmd.addParameter("@P_CONF_DATE", pConfDate);
//			// cmd.addParameter(DbTypes.getCollectionType("P_RESPONSE_ERROR_FIELD", "", pResponseErrorField, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("P_LOG_REJECT_CODE", "", pLogRejectCode, object.class));
//			cmd.addParameter("@P_BOOK_DATE", pBookDate);
//			cmd.addParameter("@P_LOC_TOT_NET_LOAN_AMT", pLocTotNetLoanAmt);
//			// cmd.addParameter(DbTypes.getCollectionType("P_DL_ERROR_FIELDS", "", pDlErrorFields, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("P_REJECT_FIELDS", "", pRejectFields, object.class));
//			cmd.addParameter("@P_UNSAT_PN_STATUS", pUnsatPnStatus);
//			cmd.addParameter("@P_MPN_LINK_IND", pMpnLinkInd);
//				
//			cmd.execute();
//
//
//		}
//		
//		public static void pUpdateGplusDisbursements(NString pAidyCode,NString pDocumentId,NString pDocumentTypeCode,NDate pDlAcknDate,NString pDlLoanId,NNumber pDlDisbNo,NNumber pSeqNo,NString pDisbStatus,NDate pTransDate,NNumber pRefundAmt,NString pReleaseInd,List<StringNtRow> pDlRejectCodes,List<StringNtRow> pDlErrorFields,NNumber pDlPrevSeqNo) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("REKCI3D.P_UPDATE_GPLUS_DISBURSEMENTS", DbManager.getDataBaseFactory());
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
//			// cmd.addParameter(DbTypes.getCollectionType("P_DL_ERROR_FIELDS", "", pDlErrorFields, object.class));
//			cmd.addParameter("@P_DL_PREV_SEQ_NO", pDlPrevSeqNo);
//				
//			cmd.execute();
//
//
//		}
//		
//		public static void pUpdateGplusOriginations(NString pAidyCode,NString pDocumentId,NString pSsn,NString pLastName,NDate pBirthDate,NString pStudentStatusCde,List<StringNtRow> pRejectCodes,NString pDlLoanId,NNumber pApproveAmt,NString pEmpnIndicator,NString pDlStatus,NString pMpnId,NDate pMpnExpDate,NString pMpnStatusInd,NNumber pParEndorserAmt,List<StringNtRow> pDlRejectCodes,NString pDocumentTypeCode,NDate pConfDate,List<StringNtRow> pResponseErrorField,List<StringNtRow> pLogRejectCode,NString pCreditStatus,NDate pCreditCheckDate,NString pCreditCheckInd,NDate pBookDate,NNumber pLocTotNetLoanAmt,List<StringNtRow> pDlErrorFields,List<StringNtRow> pRejectFields,NNumber pAppId,NString pMaxLoanInd,NDate pAppCompDate,NString pDefermentOpt,NString pPlusToStudent,NString pOrigCreditStatus,NDate pCreditCheckExpDate,NNumber pAppLoanAmt,NString pCrAppealStatus,NString pCrOverrideCde,NString pAddress,NString pCity,NString pState,NString pZip,NString pNatnCode,NString pPhoneNo,NString pStuEmail,NString pLocalAddress,NString pLocalCity,NString pLocalStatCode,NString pLocalZip,NString pLocalNatnCode,NString pParSsn,NDate pParBirthDate,NString pParLastName,NString pParFirstName,NString pParMi,NString pParCitzInd,NString pParAddress,NString pParCity,NString pParState,NString pParZip,NString pParNatnCode,NString pParPhoneNo,NString pBorrowerEmail,NString pParLocalAddress,NString pParLocalCity,NString pParLocalStatCode,NString pParLocalZip,NString pParLocalNatnCode,NString pCreditDocumentId,NString pCrActionOpt,NString pFirstName,NString pMi,NString pUnsatPnStatus,NString pGplusReq,NString pGplusReqStatus,NString pMpnLinkInd) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("REKCI3D.P_UPDATE_GPLUS_ORIGINATIONS", DbManager.getDataBaseFactory());
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
//			cmd.addParameter("@P_MPN_EXP_DATE", pMpnExpDate);
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
//			// cmd.addParameter(DbTypes.getCollectionType("P_DL_ERROR_FIELDS", "", pDlErrorFields, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("P_REJECT_FIELDS", "", pRejectFields, object.class));
//			cmd.addParameter("@P_APP_ID", pAppId);
//			cmd.addParameter("@P_MAX_LOAN_IND", pMaxLoanInd);
//			cmd.addParameter("@P_APP_COMP_DATE", pAppCompDate);
//			cmd.addParameter("@P_DEFERMENT_OPT", pDefermentOpt);
//			cmd.addParameter("@P_PLUS_TO_STUDENT", pPlusToStudent);
//			cmd.addParameter("@P_ORIG_CREDIT_STATUS", pOrigCreditStatus);
//			cmd.addParameter("@P_CREDIT_CHECK_EXP_DATE", pCreditCheckExpDate);
//			cmd.addParameter("@P_APP_LOAN_AMT", pAppLoanAmt);
//			cmd.addParameter("@P_CR_APPEAL_STATUS", pCrAppealStatus);
//			cmd.addParameter("@P_CR_OVERRIDE_CDE", pCrOverrideCde);
//			cmd.addParameter("@P_ADDRESS", pAddress);
//			cmd.addParameter("@P_CITY", pCity);
//			cmd.addParameter("@P_STATE", pState);
//			cmd.addParameter("@P_ZIP", pZip);
//			cmd.addParameter("@P_NATN_CODE", pNatnCode);
//			cmd.addParameter("@P_PHONE_NO", pPhoneNo);
//			cmd.addParameter("@P_STU_EMAIL", pStuEmail);
//			cmd.addParameter("@P_LOCAL_ADDRESS", pLocalAddress);
//			cmd.addParameter("@P_LOCAL_CITY", pLocalCity);
//			cmd.addParameter("@P_LOCAL_STAT_CODE", pLocalStatCode);
//			cmd.addParameter("@P_LOCAL_ZIP", pLocalZip);
//			cmd.addParameter("@P_LOCAL_NATN_CODE", pLocalNatnCode);
//			cmd.addParameter("@P_PAR_SSN", pParSsn);
//			cmd.addParameter("@P_PAR_BIRTH_DATE", pParBirthDate);
//			cmd.addParameter("@P_PAR_LAST_NAME", pParLastName);
//			cmd.addParameter("@P_PAR_FIRST_NAME", pParFirstName);
//			cmd.addParameter("@P_PAR_MI", pParMi);
//			cmd.addParameter("@P_PAR_CITZ_IND", pParCitzInd);
//			cmd.addParameter("@P_PAR_ADDRESS", pParAddress);
//			cmd.addParameter("@P_PAR_CITY", pParCity);
//			cmd.addParameter("@P_PAR_STATE", pParState);
//			cmd.addParameter("@P_PAR_ZIP", pParZip);
//			cmd.addParameter("@P_PAR_NATN_CODE", pParNatnCode);
//			cmd.addParameter("@P_PAR_PHONE_NO", pParPhoneNo);
//			cmd.addParameter("@P_BORROWER_EMAIL", pBorrowerEmail);
//			cmd.addParameter("@P_PAR_LOCAL_ADDRESS", pParLocalAddress);
//			cmd.addParameter("@P_PAR_LOCAL_CITY", pParLocalCity);
//			cmd.addParameter("@P_PAR_LOCAL_STAT_CODE", pParLocalStatCode);
//			cmd.addParameter("@P_PAR_LOCAL_ZIP", pParLocalZip);
//			cmd.addParameter("@P_PAR_LOCAL_NATN_CODE", pParLocalNatnCode);
//			cmd.addParameter("@P_CREDIT_DOCUMENT_ID", pCreditDocumentId);
//			cmd.addParameter("@P_CR_ACTION_OPT", pCrActionOpt);
//			cmd.addParameter("@P_FIRST_NAME", pFirstName);
//			cmd.addParameter("@P_MI", pMi);
//			cmd.addParameter("@P_UNSAT_PN_STATUS", pUnsatPnStatus);
//			cmd.addParameter("@P_GPLUS_REQ", pGplusReq);
//			cmd.addParameter("@P_GPLUS_REQ_STATUS", pGplusReqStatus);
//			cmd.addParameter("@P_MPN_LINK_IND", pMpnLinkInd);
//				
//			cmd.execute();
//
//
//		}
		
		public static void pUpdateIdStudent(NString pAidyCode,NString pDocumentId,NString pSsn,NString pLastName,NDate pBirthDate,NString pDocumentTypeCode,NDate pProcessDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("REKCI3D.P_UPDATE_ID_STUDENT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_DOCUMENT_ID", pDocumentId);
			cmd.addParameter("@P_SSN", pSsn);
			cmd.addParameter("@P_LAST_NAME", pLastName);
			cmd.addParameter("@P_BIRTH_DATE", pBirthDate);
			cmd.addParameter("@P_DOCUMENT_TYPE_CODE", pDocumentTypeCode);
			cmd.addParameter("@P_PROCESS_DATE", pProcessDate);
				
			cmd.execute();


		}
		
//		public static void pUpdatePellDisbursements(NString pAidyCode,NString pDocumentId,NString pSsn,NString pLastName,NDate pBirthDate,NString pDocumentTypeCode,NString pVerifWStatusFlag,NString pSarTranNo,NNumber pYtdAmtPaid,NNumber pDisbAckRefNo,NNumber pDisbAcptAmt,NDate pDisbAcptDate,NNumber pAcptDisbSeqNo,NDate pAcptPayPdStartDate,NString pDisbActionCode,NNumber pAcptPrevDisbSeqNo,List<StringNtRow> pFsaCode,List<StringNtRow> pEditRejects,List<StringNtRow> pDisbErrorFields,List<StringNtRow> pDisbErrorValues,NString pCpsVerInd,NString pHighestCpsTranNo,NDate pProcessDate,NNumber pPercentEligUsed,NNumber pLifetimeEligUsed) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("REKCI3D.P_UPDATE_PELL_DISBURSEMENTS", DbManager.getDataBaseFactory());
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
//			cmd.addParameter("@P_PERCENT_ELIG_USED", pPercentEligUsed);
//			cmd.addParameter("@P_LIFETIME_ELIG_USED", pLifetimeEligUsed);
//				
//			cmd.execute();
//
//
//		}
//		
//		public static void pUpdatePellOriginations(NString pAidyCode,NString pDocumentId,NString pSsn,NString pLastName,NDate pBirthDate,NString pDocumentTypeCode,NString pIdStatusCde,List<StringNtRow> pRejectCodes,NString pOrigStatusCde,NString pAcptSarTranNo,NNumber pAcptAmtDue,NNumber pAcptAttendCost,NString pPrisonInd,NString pAcptVerStatus,List<StringNtRow> pFsaCode,NDate pAcptEnrollmentDate,NNumber pSchPellGrant,NString pAcptCurrentSsn,NDate pAcptBirthDate,NString pAcptLastName,NString pAcptFirstName,NString pAcptMi,NNumber pNegPendingAmt,List<StringNtRow> pEditRejects,List<DateNtRow> pAcptEstDisbDates,List<StringNtRow> pEditField,List<StringNtRow> pEditValue,List<StringNtRow> pRejectFields,NNumber pPercentEligUsed,NNumber pYtdAmtPaid,NString pAwardId,NNumber pAwardNo,NString pAddlEligInd,NNumber pLifetimeEligUsed) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("REKCI3D.P_UPDATE_PELL_ORIGINATIONS", DbManager.getDataBaseFactory());
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
//			cmd.addParameter("@P_PRISON_IND", pPrisonInd);
//			cmd.addParameter("@P_ACPT_VER_STATUS", pAcptVerStatus);
//			// cmd.addParameter(DbTypes.getCollectionType("P_FSA_CODE", "", pFsaCode, object.class));
//			cmd.addParameter("@P_ACPT_ENROLLMENT_DATE", pAcptEnrollmentDate);
//			cmd.addParameter("@P_SCH_PELL_GRANT", pSchPellGrant);
//			cmd.addParameter("@P_ACPT_CURRENT_SSN", pAcptCurrentSsn);
//			cmd.addParameter("@P_ACPT_BIRTH_DATE", pAcptBirthDate);
//			cmd.addParameter("@P_ACPT_LAST_NAME", pAcptLastName);
//			cmd.addParameter("@P_ACPT_FIRST_NAME", pAcptFirstName);
//			cmd.addParameter("@P_ACPT_MI", pAcptMi);
//			cmd.addParameter("@P_NEG_PENDING_AMT", pNegPendingAmt);
//			// cmd.addParameter(DbTypes.getCollectionType("P_EDIT_REJECTS", "", pEditRejects, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("P_ACPT_EST_DISB_DATES", "", pAcptEstDisbDates, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("P_EDIT_FIELD", "", pEditField, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("P_EDIT_VALUE", "", pEditValue, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("P_REJECT_FIELDS", "", pRejectFields, object.class));
//			cmd.addParameter("@P_PERCENT_ELIG_USED", pPercentEligUsed);
//			cmd.addParameter("@P_YTD_AMT_PAID", pYtdAmtPaid);
//			cmd.addParameter("@P_AWARD_ID", pAwardId);
//			cmd.addParameter("@P_AWARD_NO", pAwardNo);
//			cmd.addParameter("@P_ADDL_ELIG_IND", pAddlEligInd);
//			cmd.addParameter("@P_LIFETIME_ELIG_USED", pLifetimeEligUsed);
//				
//			cmd.execute();
//
//
//		}
		
		public static void pUpdateRercoddReceipt(NString pAidyCode,NString pDocumentId,NDate pCreatedDateTime,NString pDocumentStatusCode,NString pDocumentType) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("REKCI3D.P_UPDATE_RERCODD_RECEIPT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_DOCUMENT_ID", pDocumentId);
			cmd.addParameter("@P_CREATED_DATE_TIME", pCreatedDateTime);
			cmd.addParameter("@P_DOCUMENT_STATUS_CODE", pDocumentStatusCode);
			cmd.addParameter("@P_DOCUMENT_TYPE", pDocumentType);
				
			cmd.execute();


		}
		
//		public static void pUpdateRercoddResponse(NString pAidyCode,NString pDocumentId,NDate pDocIdRespProcDate,NString pDocIdRespStatus,NString pDocumentType,NString pSourceId,List<StringNtRow> pReportingId,List<StringNtRow> pAttendingId) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("REKCI3D.P_UPDATE_RERCODD_RESPONSE", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
//			cmd.addParameter("@P_DOCUMENT_ID", pDocumentId);
//			cmd.addParameter("@P_DOC_ID_RESP_PROC_DATE", pDocIdRespProcDate);
//			cmd.addParameter("@P_DOC_ID_RESP_STATUS", pDocIdRespStatus);
//			cmd.addParameter("@P_DOCUMENT_TYPE", pDocumentType);
//			cmd.addParameter("@P_SOURCE_ID", pSourceId);
//			// cmd.addParameter(DbTypes.getCollectionType("P_REPORTING_ID", "", pReportingId, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("P_ATTENDING_ID", "", pAttendingId, object.class));
//				
//			cmd.execute();
//
//
//		}
//		
//		public static void pUpdateSmartDisbursements(NString pAidyCode,NString pDocumentId,NString pSsn,NString pLastName,NDate pBirthDate,NString pDocumentTypeCode,NNumber pYtdAmtPaid,NNumber pDisbAckRefNo,NNumber pDisbAcptAmt,NDate pDisbAcptDate,NDate pAcptPayPdStartDate,NNumber pAcptDisbSeqNo,NString pDisbActionCode,NNumber pAcptPrevDisbSeqNo,List<StringNtRow> pFsaCode,List<StringNtRow> pEditRejects,List<StringNtRow> pDisbErrorFields,List<StringNtRow> pDisbErrorValues,NString pCpsVerInd,NString pHighestCpsTranNo,NDate pProcessDate,NString pAwardId,NNumber pPercentEligUsed) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("REKCI3D.P_UPDATE_SMART_DISBURSEMENTS", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
//			cmd.addParameter("@P_DOCUMENT_ID", pDocumentId);
//			cmd.addParameter("@P_SSN", pSsn);
//			cmd.addParameter("@P_LAST_NAME", pLastName);
//			cmd.addParameter("@P_BIRTH_DATE", pBirthDate);
//			cmd.addParameter("@P_DOCUMENT_TYPE_CODE", pDocumentTypeCode);
//			cmd.addParameter("@P_YTD_AMT_PAID", pYtdAmtPaid);
//			cmd.addParameter("@P_DISB_ACK_REF_NO", pDisbAckRefNo);
//			cmd.addParameter("@P_DISB_ACPT_AMT", pDisbAcptAmt);
//			cmd.addParameter("@P_DISB_ACPT_DATE", pDisbAcptDate);
//			cmd.addParameter("@P_ACPT_PAY_PD_START_DATE", pAcptPayPdStartDate);
//			cmd.addParameter("@P_ACPT_DISB_SEQ_NO", pAcptDisbSeqNo);
//			cmd.addParameter("@P_DISB_ACTION_CODE", pDisbActionCode);
//			cmd.addParameter("@P_ACPT_PREV_DISB_SEQ_NO", pAcptPrevDisbSeqNo);
//			// cmd.addParameter(DbTypes.getCollectionType("P_FSA_CODE", "", pFsaCode, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("P_EDIT_REJECTS", "", pEditRejects, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("P_DISB_ERROR_FIELDS", "", pDisbErrorFields, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("P_DISB_ERROR_VALUES", "", pDisbErrorValues, object.class));
//			cmd.addParameter("@P_CPS_VER_IND", pCpsVerInd);
//			cmd.addParameter("@P_HIGHEST_CPS_TRAN_NO", pHighestCpsTranNo);
//			cmd.addParameter("@P_PROCESS_DATE", pProcessDate);
//			cmd.addParameter("@P_AWARD_ID", pAwardId);
//			cmd.addParameter("@P_PERCENT_ELIG_USED", pPercentEligUsed);
//				
//			cmd.execute();
//
//
//		}
//		
//		public static void pUpdateSmartOriginations(NString pAidyCode,NString pDocumentId,NString pSsn,NString pLastName,NDate pBirthDate,NString pDocumentTypeCode,NString pIdStatusCde,List<StringNtRow> pRejectCodes,NString pOrigStatusCde,NString pAcptSarTranNo,NNumber pAcptAwardAmount,List<StringNtRow> pFsaCode,NDate pAcptEnrollmentDate,NNumber pNegPendingAmt,List<StringNtRow> pEditRejects,List<StringNtRow> pEditField,List<StringNtRow> pEditValue,List<StringNtRow> pRejectFields,NNumber pYtdAmtPaid,NString pAcptYrInColl,NString pAcptCipCode,NString pAwardId,NNumber pPercentEligUsed) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("REKCI3D.P_UPDATE_SMART_ORIGINATIONS", DbManager.getDataBaseFactory());
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
//			cmd.addParameter("@P_ACPT_AWARD_AMOUNT", pAcptAwardAmount);
//			// cmd.addParameter(DbTypes.getCollectionType("P_FSA_CODE", "", pFsaCode, object.class));
//			cmd.addParameter("@P_ACPT_ENROLLMENT_DATE", pAcptEnrollmentDate);
//			cmd.addParameter("@P_NEG_PENDING_AMT", pNegPendingAmt);
//			// cmd.addParameter(DbTypes.getCollectionType("P_EDIT_REJECTS", "", pEditRejects, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("P_EDIT_FIELD", "", pEditField, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("P_EDIT_VALUE", "", pEditValue, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("P_REJECT_FIELDS", "", pRejectFields, object.class));
//			cmd.addParameter("@P_YTD_AMT_PAID", pYtdAmtPaid);
//			cmd.addParameter("@P_ACPT_YR_IN_COLL", pAcptYrInColl);
//			cmd.addParameter("@P_ACPT_CIP_CODE", pAcptCipCode);
//			cmd.addParameter("@P_AWARD_ID", pAwardId);
//			cmd.addParameter("@P_PERCENT_ELIG_USED", pPercentEligUsed);
//				
//			cmd.execute();
//
//
//		}
//		
//		public static void pUpdateTeachDisbursements(NString pAidyCode,NString pDocumentId,NString pSsn,NString pLastName,NDate pBirthDate,NString pDocumentTypeCode,NNumber pYtdAmtPaid,NNumber pDisbAckRefNo,NNumber pDisbAcptAmt,NDate pDisbAcptDate,NDate pAcptPayPdStartDate,NNumber pAcptDisbSeqNo,NString pDisbActionCode,NNumber pAcptPrevDisbSeqNo,List<StringNtRow> pFsaCode,List<StringNtRow> pEditRejects,List<StringNtRow> pDisbErrorFields,List<StringNtRow> pDisbErrorValues,NString pCpsVerInd,NString pHighestCpsTranNo,NDate pProcessDate,NString pAwardId,NNumber pPercentEligUsed,NString pReleaseInd) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("REKCI3D.P_UPDATE_TEACH_DISBURSEMENTS", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
//			cmd.addParameter("@P_DOCUMENT_ID", pDocumentId);
//			cmd.addParameter("@P_SSN", pSsn);
//			cmd.addParameter("@P_LAST_NAME", pLastName);
//			cmd.addParameter("@P_BIRTH_DATE", pBirthDate);
//			cmd.addParameter("@P_DOCUMENT_TYPE_CODE", pDocumentTypeCode);
//			cmd.addParameter("@P_YTD_AMT_PAID", pYtdAmtPaid);
//			cmd.addParameter("@P_DISB_ACK_REF_NO", pDisbAckRefNo);
//			cmd.addParameter("@P_DISB_ACPT_AMT", pDisbAcptAmt);
//			cmd.addParameter("@P_DISB_ACPT_DATE", pDisbAcptDate);
//			cmd.addParameter("@P_ACPT_PAY_PD_START_DATE", pAcptPayPdStartDate);
//			cmd.addParameter("@P_ACPT_DISB_SEQ_NO", pAcptDisbSeqNo);
//			cmd.addParameter("@P_DISB_ACTION_CODE", pDisbActionCode);
//			cmd.addParameter("@P_ACPT_PREV_DISB_SEQ_NO", pAcptPrevDisbSeqNo);
//			// cmd.addParameter(DbTypes.getCollectionType("P_FSA_CODE", "", pFsaCode, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("P_EDIT_REJECTS", "", pEditRejects, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("P_DISB_ERROR_FIELDS", "", pDisbErrorFields, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("P_DISB_ERROR_VALUES", "", pDisbErrorValues, object.class));
//			cmd.addParameter("@P_CPS_VER_IND", pCpsVerInd);
//			cmd.addParameter("@P_HIGHEST_CPS_TRAN_NO", pHighestCpsTranNo);
//			cmd.addParameter("@P_PROCESS_DATE", pProcessDate);
//			cmd.addParameter("@P_AWARD_ID", pAwardId);
//			cmd.addParameter("@P_PERCENT_ELIG_USED", pPercentEligUsed);
//			cmd.addParameter("@P_RELEASE_IND", pReleaseInd);
//				
//			cmd.execute();
//
//
//		}
//		
//		public static void pUpdateTeachOriginations(NString pAidyCode,NString pDocumentId,NString pSsn,NString pLastName,NDate pBirthDate,NString pDocumentTypeCode,NString pIdStatusCde,List<StringNtRow> pRejectCodes,NString pOrigStatusCde,NString pAcptSarTranNo,NNumber pAcptAwardAmount,List<StringNtRow> pFsaCode,NDate pAcptEnrollmentDate,NNumber pNegPendingAmt,List<StringNtRow> pEditRejects,List<StringNtRow> pEditField,List<StringNtRow> pEditValue,List<StringNtRow> pRejectFields,NNumber pYtdAmtPaid,NString pAcptYrInColl,NString pAwardId,NNumber pPercentEligUsed,NString pTeachExpertInd,NDate pBookDate,NNumber pBookAmt,NString pAtsId,NString pAtsStatus,NDate pProcessDate,NString pAtsReq,NString pAtsReqStatus) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("REKCI3D.P_UPDATE_TEACH_ORIGINATIONS", DbManager.getDataBaseFactory());
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
//			cmd.addParameter("@P_ACPT_AWARD_AMOUNT", pAcptAwardAmount);
//			// cmd.addParameter(DbTypes.getCollectionType("P_FSA_CODE", "", pFsaCode, object.class));
//			cmd.addParameter("@P_ACPT_ENROLLMENT_DATE", pAcptEnrollmentDate);
//			cmd.addParameter("@P_NEG_PENDING_AMT", pNegPendingAmt);
//			// cmd.addParameter(DbTypes.getCollectionType("P_EDIT_REJECTS", "", pEditRejects, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("P_EDIT_FIELD", "", pEditField, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("P_EDIT_VALUE", "", pEditValue, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("P_REJECT_FIELDS", "", pRejectFields, object.class));
//			cmd.addParameter("@P_YTD_AMT_PAID", pYtdAmtPaid);
//			cmd.addParameter("@P_ACPT_YR_IN_COLL", pAcptYrInColl);
//			cmd.addParameter("@P_AWARD_ID", pAwardId);
//			cmd.addParameter("@P_PERCENT_ELIG_USED", pPercentEligUsed);
//			cmd.addParameter("@P_TEACH_EXPERT_IND", pTeachExpertInd);
//			cmd.addParameter("@P_BOOK_DATE", pBookDate);
//			cmd.addParameter("@P_BOOK_AMT", pBookAmt);
//			cmd.addParameter("@P_ATS_ID", pAtsId);
//			cmd.addParameter("@P_ATS_STATUS", pAtsStatus);
//			cmd.addParameter("@P_PROCESS_DATE", pProcessDate);
//			cmd.addParameter("@P_ATS_REQ", pAtsReq);
//			cmd.addParameter("@P_ATS_REQ_STATUS", pAtsReqStatus);
//				
//			cmd.execute();
//
//
//		}
		
	
	
	
}
