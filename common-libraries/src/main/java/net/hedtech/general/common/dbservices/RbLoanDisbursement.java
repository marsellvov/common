package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class RbLoanDisbursement {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_LOAN_DISBURSEMENT.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NNumber pPidm,NString pFundCode,NNumber pApplNo,NString pPeriod,NDate pDisburseDate,NNumber pSeqNo,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_LOAN_DISBURSEMENT.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_APPL_NO", pApplNo);
			cmd.addParameter("@P_PERIOD", pPeriod);
			cmd.addParameter("@P_DISBURSE_DATE", pDisburseDate);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(LoanDisbursementRecRow recOne,LoanDisbursementRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_LOAN_DISBURSEMENT.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, LoanDisbursementRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, LoanDisbursementRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NNumber pPidm,NString pFundCode,NNumber pApplNo,NString pPeriod,NDate pDisburseDate,NNumber pSeqNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_LOAN_DISBURSEMENT.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_APPL_NO", pApplNo);
			cmd.addParameter("@P_PERIOD", pPeriod);
			cmd.addParameter("@P_DISBURSE_DATE", pDisburseDate);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_LOAN_DISBURSEMENT.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NNumber pPidm,NString pFundCode,NNumber pApplNo,NString pPeriod,NDate pDisburseDate,NNumber pSeqNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_LOAN_DISBURSEMENT.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_APPL_NO", pApplNo);
			cmd.addParameter("@P_PERIOD", pPeriod);
			cmd.addParameter("@P_DISBURSE_DATE", pDisburseDate);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NNumber pPidm,NString pFundCode,NNumber pApplNo,NDate pDisburseDate,NString pPeriod,NNumber pSeqNo,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_LOAN_DISBURSEMENT.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_APPL_NO", pApplNo);
			cmd.addParameter("@P_DISBURSE_DATE", pDisburseDate);
			cmd.addParameter("@P_PERIOD", pPeriod);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NNumber pPidm,NString pFundCode,NNumber pApplNo,NDate pDisburseDate,NString pPeriod,NNumber pSeqNo,NNumber pLoanPct,NString pFeedInd,NNumber pCheckAmt,NDate pCheckDate,NDate pStuReceiveDate,NDate pFeedDate,NNumber pCheckReturnAmt,NDate pCheckReturnDate,NNumber pTranNumber,NNumber pMemoExpDays,NString pDisburseLoad,NString pDisburseLoadOpt,NString pAidyCode,NNumber pDlSeqNo,NString pUserId,NString pDisbStatus,NString pReconcileInd,NDate pReconcileDate,NString pBatchNo,NString pCancelInd,NDate pCancelDate,NNumber pRefundAmt,NDate pRefundDate,NNumber pDlGrossAmt,NNumber pDlFeeAmt,NDate pPnDisbDate,NNumber pDlDisbNo,NString pReconBatchNo,NNumber pServGrossAmt,NNumber pServFeeAmt,NNumber pServNetAmt,NNumber pServNetAdjAmt,NString pServLoanidErr,NString pServDisbnoErr,NString pServActionErr,NString pServDateErr,NString pServSeqnoErr,NString pRefId,NDate pRetLndrDate,NString pEftInd,NString pComment,NString pDisbBypass,NString pDlRejectCode1,NString pDlRejectCode2,NString pDlRejectCode3,NString pDlRejectCode4,NString pDlRejectCode5,NString pDlReconReject1,NString pDlReconReject2,NString pDlReconReject3,NString pDlReconReject4,NString pDlReconReject5,NDate pDlAcknDate,NDate pSasEndDate,NDate pSasProcessDate,NString pSchoolCode,NNumber pSasRecordCountSeq,NNumber pFeesPaid,NString pAffirmFlag,NString pHoldRelStatus,NNumber pRevDisbAmt,NDate pPriorDisbDate,NString pDisbOverrideInd,NNumber pDlRebateAmt,NNumber pServRebateAmt,NString pServBookedStatus,NDate pServBookedDate,NDate pElHoldRelDate,NNumber pElRevGrossAmt,NNumber pElDisbNo,NString pServTransType,NString pRegionCd,NString pSchoolStatCode,NNumber pElServGrossAmt,NNumber pElServOrigFee,NNumber pElServGuarFee,NNumber pElServNetAmt,NDate pElServDisbDate,NNumber pElServGuarFeePaid,NNumber pElServOrigFeePaid,NString pDocumentId,NNumber pPrevDisbSeqNo,NString pDataOrigin,NString pDlEditField1,NString pDlEditField2,NString pDlEditField3,NString pDlEditField4,NString pDlEditField5,NString pElBorDirectDisbInd,NNumber pElDirectCheckAmt,NString pExcludeLnexFlag,NString pTermCode,NString pServicer,NDate pReptDisbDate,NString pDlAuthorizedInd,NString pEnrollmentSchoolCde,NDate pSasStartDate,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_LOAN_DISBURSEMENT.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_APPL_NO", pApplNo);
			cmd.addParameter("@P_DISBURSE_DATE", pDisburseDate);
			cmd.addParameter("@P_PERIOD", pPeriod);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_LOAN_PCT", pLoanPct);
			cmd.addParameter("@P_FEED_IND", pFeedInd);
			cmd.addParameter("@P_CHECK_AMT", pCheckAmt);
			cmd.addParameter("@P_CHECK_DATE", pCheckDate);
			cmd.addParameter("@P_STU_RECEIVE_DATE", pStuReceiveDate);
			cmd.addParameter("@P_FEED_DATE", pFeedDate);
			cmd.addParameter("@P_CHECK_RETURN_AMT", pCheckReturnAmt);
			cmd.addParameter("@P_CHECK_RETURN_DATE", pCheckReturnDate);
			cmd.addParameter("@P_TRAN_NUMBER", pTranNumber);
			cmd.addParameter("@P_MEMO_EXP_DAYS", pMemoExpDays);
			cmd.addParameter("@P_DISBURSE_LOAD", pDisburseLoad);
			cmd.addParameter("@P_DISBURSE_LOAD_OPT", pDisburseLoadOpt);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_DL_SEQ_NO", pDlSeqNo);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DISB_STATUS", pDisbStatus);
			cmd.addParameter("@P_RECONCILE_IND", pReconcileInd);
			cmd.addParameter("@P_RECONCILE_DATE", pReconcileDate);
			cmd.addParameter("@P_BATCH_NO", pBatchNo);
			cmd.addParameter("@P_CANCEL_IND", pCancelInd);
			cmd.addParameter("@P_CANCEL_DATE", pCancelDate);
			cmd.addParameter("@P_REFUND_AMT", pRefundAmt);
			cmd.addParameter("@P_REFUND_DATE", pRefundDate);
			cmd.addParameter("@P_DL_GROSS_AMT", pDlGrossAmt);
			cmd.addParameter("@P_DL_FEE_AMT", pDlFeeAmt);
			cmd.addParameter("@P_PN_DISB_DATE", pPnDisbDate);
			cmd.addParameter("@P_DL_DISB_NO", pDlDisbNo);
			cmd.addParameter("@P_RECON_BATCH_NO", pReconBatchNo);
			cmd.addParameter("@P_SERV_GROSS_AMT", pServGrossAmt);
			cmd.addParameter("@P_SERV_FEE_AMT", pServFeeAmt);
			cmd.addParameter("@P_SERV_NET_AMT", pServNetAmt);
			cmd.addParameter("@P_SERV_NET_ADJ_AMT", pServNetAdjAmt);
			cmd.addParameter("@P_SERV_LOANID_ERR", pServLoanidErr);
			cmd.addParameter("@P_SERV_DISBNO_ERR", pServDisbnoErr);
			cmd.addParameter("@P_SERV_ACTION_ERR", pServActionErr);
			cmd.addParameter("@P_SERV_DATE_ERR", pServDateErr);
			cmd.addParameter("@P_SERV_SEQNO_ERR", pServSeqnoErr);
			cmd.addParameter("@P_REF_ID", pRefId);
			cmd.addParameter("@P_RET_LNDR_DATE", pRetLndrDate);
			cmd.addParameter("@P_EFT_IND", pEftInd);
			cmd.addParameter("@P_COMMENT", pComment);
			cmd.addParameter("@P_DISB_BYPASS", pDisbBypass);
			cmd.addParameter("@P_DL_REJECT_CODE_1", pDlRejectCode1);
			cmd.addParameter("@P_DL_REJECT_CODE_2", pDlRejectCode2);
			cmd.addParameter("@P_DL_REJECT_CODE_3", pDlRejectCode3);
			cmd.addParameter("@P_DL_REJECT_CODE_4", pDlRejectCode4);
			cmd.addParameter("@P_DL_REJECT_CODE_5", pDlRejectCode5);
			cmd.addParameter("@P_DL_RECON_REJECT_1", pDlReconReject1);
			cmd.addParameter("@P_DL_RECON_REJECT_2", pDlReconReject2);
			cmd.addParameter("@P_DL_RECON_REJECT_3", pDlReconReject3);
			cmd.addParameter("@P_DL_RECON_REJECT_4", pDlReconReject4);
			cmd.addParameter("@P_DL_RECON_REJECT_5", pDlReconReject5);
			cmd.addParameter("@P_DL_ACKN_DATE", pDlAcknDate);
			cmd.addParameter("@P_SAS_END_DATE", pSasEndDate);
			cmd.addParameter("@P_SAS_PROCESS_DATE", pSasProcessDate);
			cmd.addParameter("@P_SCHOOL_CODE", pSchoolCode);
			cmd.addParameter("@P_SAS_RECORD_COUNT_SEQ", pSasRecordCountSeq);
			cmd.addParameter("@P_FEES_PAID", pFeesPaid);
			cmd.addParameter("@P_AFFIRM_FLAG", pAffirmFlag);
			cmd.addParameter("@P_HOLD_REL_STATUS", pHoldRelStatus);
			cmd.addParameter("@P_REV_DISB_AMT", pRevDisbAmt);
			cmd.addParameter("@P_PRIOR_DISB_DATE", pPriorDisbDate);
			cmd.addParameter("@P_DISB_OVERRIDE_IND", pDisbOverrideInd);
			cmd.addParameter("@P_DL_REBATE_AMT", pDlRebateAmt);
			cmd.addParameter("@P_SERV_REBATE_AMT", pServRebateAmt);
			cmd.addParameter("@P_SERV_BOOKED_STATUS", pServBookedStatus);
			cmd.addParameter("@P_SERV_BOOKED_DATE", pServBookedDate);
			cmd.addParameter("@P_EL_HOLD_REL_DATE", pElHoldRelDate);
			cmd.addParameter("@P_EL_REV_GROSS_AMT", pElRevGrossAmt);
			cmd.addParameter("@P_EL_DISB_NO", pElDisbNo);
			cmd.addParameter("@P_SERV_TRANS_TYPE", pServTransType);
			cmd.addParameter("@P_REGION_CD", pRegionCd);
			cmd.addParameter("@P_SCHOOL_STAT_CODE", pSchoolStatCode);
			cmd.addParameter("@P_EL_SERV_GROSS_AMT", pElServGrossAmt);
			cmd.addParameter("@P_EL_SERV_ORIG_FEE", pElServOrigFee);
			cmd.addParameter("@P_EL_SERV_GUAR_FEE", pElServGuarFee);
			cmd.addParameter("@P_EL_SERV_NET_AMT", pElServNetAmt);
			cmd.addParameter("@P_EL_SERV_DISB_DATE", pElServDisbDate);
			cmd.addParameter("@P_EL_SERV_GUAR_FEE_PAID", pElServGuarFeePaid);
			cmd.addParameter("@P_EL_SERV_ORIG_FEE_PAID", pElServOrigFeePaid);
			cmd.addParameter("@P_DOCUMENT_ID", pDocumentId);
			cmd.addParameter("@P_PREV_DISB_SEQ_NO", pPrevDisbSeqNo);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_DL_EDIT_FIELD_1", pDlEditField1);
			cmd.addParameter("@P_DL_EDIT_FIELD_2", pDlEditField2);
			cmd.addParameter("@P_DL_EDIT_FIELD_3", pDlEditField3);
			cmd.addParameter("@P_DL_EDIT_FIELD_4", pDlEditField4);
			cmd.addParameter("@P_DL_EDIT_FIELD_5", pDlEditField5);
			cmd.addParameter("@P_EL_BOR_DIRECT_DISB_IND", pElBorDirectDisbInd);
			cmd.addParameter("@P_EL_DIRECT_CHECK_AMT", pElDirectCheckAmt);
			cmd.addParameter("@P_EXCLUDE_LNEX_FLAG", pExcludeLnexFlag);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_SERVICER", pServicer);
			cmd.addParameter("@P_REPT_DISB_DATE", pReptDisbDate);
			cmd.addParameter("@P_DL_AUTHORIZED_IND", pDlAuthorizedInd);
			cmd.addParameter("@P_ENROLLMENT_SCHOOL_CDE", pEnrollmentSchoolCde);
			cmd.addParameter("@P_SAS_START_DATE", pSasStartDate);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NNumber pPidm,NString pFundCode,NNumber pApplNo,NString pPeriod,NDate pDisburseDate,NNumber pSeqNo,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_LOAN_DISBURSEMENT.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_APPL_NO", pApplNo);
			cmd.addParameter("@P_PERIOD", pPeriod);
			cmd.addParameter("@P_DISBURSE_DATE", pDisburseDate);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NNumber pPidm,NString pFundCode,NNumber pApplNo,NString pPeriod,NDate pDisburseDate,NNumber pSeqNo,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_LOAN_DISBURSEMENT.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_APPL_NO", pApplNo);
			cmd.addParameter("@P_PERIOD", pPeriod);
			cmd.addParameter("@P_DISBURSE_DATE", pDisburseDate);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NNumber pPidm,NString pFundCode,NNumber pApplNo,NDate pDisburseDate,NString pPeriod,NNumber pSeqNo,NNumber pLoanPct,NString pFeedInd,NNumber pCheckAmt,NDate pCheckDate,NDate pStuReceiveDate,NDate pFeedDate,NNumber pCheckReturnAmt,NDate pCheckReturnDate,NNumber pTranNumber,NNumber pMemoExpDays,NString pDisburseLoad,NString pDisburseLoadOpt,NString pAidyCode,NNumber pDlSeqNo,NString pUserId,NString pDisbStatus,NString pReconcileInd,NDate pReconcileDate,NString pBatchNo,NString pCancelInd,NDate pCancelDate,NNumber pRefundAmt,NDate pRefundDate,NNumber pDlGrossAmt,NNumber pDlFeeAmt,NDate pPnDisbDate,NNumber pDlDisbNo,NString pReconBatchNo,NNumber pServGrossAmt,NNumber pServFeeAmt,NNumber pServNetAmt,NNumber pServNetAdjAmt,NString pServLoanidErr,NString pServDisbnoErr,NString pServActionErr,NString pServDateErr,NString pServSeqnoErr,NString pRefId,NDate pRetLndrDate,NString pEftInd,NString pComment,NString pDisbBypass,NString pDlRejectCode1,NString pDlRejectCode2,NString pDlRejectCode3,NString pDlRejectCode4,NString pDlRejectCode5,NString pDlReconReject1,NString pDlReconReject2,NString pDlReconReject3,NString pDlReconReject4,NString pDlReconReject5,NDate pDlAcknDate,NDate pSasEndDate,NDate pSasProcessDate,NString pSchoolCode,NNumber pSasRecordCountSeq,NNumber pFeesPaid,NString pAffirmFlag,NString pHoldRelStatus,NNumber pRevDisbAmt,NDate pPriorDisbDate,NString pDisbOverrideInd,NNumber pDlRebateAmt,NNumber pServRebateAmt,NString pServBookedStatus,NDate pServBookedDate,NDate pElHoldRelDate,NNumber pElRevGrossAmt,NNumber pElDisbNo,NString pServTransType,NString pRegionCd,NString pSchoolStatCode,NNumber pElServGrossAmt,NNumber pElServOrigFee,NNumber pElServGuarFee,NNumber pElServNetAmt,NDate pElServDisbDate,NNumber pElServGuarFeePaid,NNumber pElServOrigFeePaid,NString pDocumentId,NNumber pPrevDisbSeqNo,NString pDataOrigin,NString pDlEditField1,NString pDlEditField2,NString pDlEditField3,NString pDlEditField4,NString pDlEditField5,NString pElBorDirectDisbInd,NNumber pElDirectCheckAmt,NString pExcludeLnexFlag,NString pTermCode,NString pServicer,NDate pReptDisbDate,NString pDlAuthorizedInd,NString pEnrollmentSchoolCde,NDate pSasStartDate,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_LOAN_DISBURSEMENT.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_APPL_NO", pApplNo);
			cmd.addParameter("@P_DISBURSE_DATE", pDisburseDate);
			cmd.addParameter("@P_PERIOD", pPeriod);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_LOAN_PCT", pLoanPct);
			cmd.addParameter("@P_FEED_IND", pFeedInd);
			cmd.addParameter("@P_CHECK_AMT", pCheckAmt);
			cmd.addParameter("@P_CHECK_DATE", pCheckDate);
			cmd.addParameter("@P_STU_RECEIVE_DATE", pStuReceiveDate);
			cmd.addParameter("@P_FEED_DATE", pFeedDate);
			cmd.addParameter("@P_CHECK_RETURN_AMT", pCheckReturnAmt);
			cmd.addParameter("@P_CHECK_RETURN_DATE", pCheckReturnDate);
			cmd.addParameter("@P_TRAN_NUMBER", pTranNumber);
			cmd.addParameter("@P_MEMO_EXP_DAYS", pMemoExpDays);
			cmd.addParameter("@P_DISBURSE_LOAD", pDisburseLoad);
			cmd.addParameter("@P_DISBURSE_LOAD_OPT", pDisburseLoadOpt);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_DL_SEQ_NO", pDlSeqNo);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DISB_STATUS", pDisbStatus);
			cmd.addParameter("@P_RECONCILE_IND", pReconcileInd);
			cmd.addParameter("@P_RECONCILE_DATE", pReconcileDate);
			cmd.addParameter("@P_BATCH_NO", pBatchNo);
			cmd.addParameter("@P_CANCEL_IND", pCancelInd);
			cmd.addParameter("@P_CANCEL_DATE", pCancelDate);
			cmd.addParameter("@P_REFUND_AMT", pRefundAmt);
			cmd.addParameter("@P_REFUND_DATE", pRefundDate);
			cmd.addParameter("@P_DL_GROSS_AMT", pDlGrossAmt);
			cmd.addParameter("@P_DL_FEE_AMT", pDlFeeAmt);
			cmd.addParameter("@P_PN_DISB_DATE", pPnDisbDate);
			cmd.addParameter("@P_DL_DISB_NO", pDlDisbNo);
			cmd.addParameter("@P_RECON_BATCH_NO", pReconBatchNo);
			cmd.addParameter("@P_SERV_GROSS_AMT", pServGrossAmt);
			cmd.addParameter("@P_SERV_FEE_AMT", pServFeeAmt);
			cmd.addParameter("@P_SERV_NET_AMT", pServNetAmt);
			cmd.addParameter("@P_SERV_NET_ADJ_AMT", pServNetAdjAmt);
			cmd.addParameter("@P_SERV_LOANID_ERR", pServLoanidErr);
			cmd.addParameter("@P_SERV_DISBNO_ERR", pServDisbnoErr);
			cmd.addParameter("@P_SERV_ACTION_ERR", pServActionErr);
			cmd.addParameter("@P_SERV_DATE_ERR", pServDateErr);
			cmd.addParameter("@P_SERV_SEQNO_ERR", pServSeqnoErr);
			cmd.addParameter("@P_REF_ID", pRefId);
			cmd.addParameter("@P_RET_LNDR_DATE", pRetLndrDate);
			cmd.addParameter("@P_EFT_IND", pEftInd);
			cmd.addParameter("@P_COMMENT", pComment);
			cmd.addParameter("@P_DISB_BYPASS", pDisbBypass);
			cmd.addParameter("@P_DL_REJECT_CODE_1", pDlRejectCode1);
			cmd.addParameter("@P_DL_REJECT_CODE_2", pDlRejectCode2);
			cmd.addParameter("@P_DL_REJECT_CODE_3", pDlRejectCode3);
			cmd.addParameter("@P_DL_REJECT_CODE_4", pDlRejectCode4);
			cmd.addParameter("@P_DL_REJECT_CODE_5", pDlRejectCode5);
			cmd.addParameter("@P_DL_RECON_REJECT_1", pDlReconReject1);
			cmd.addParameter("@P_DL_RECON_REJECT_2", pDlReconReject2);
			cmd.addParameter("@P_DL_RECON_REJECT_3", pDlReconReject3);
			cmd.addParameter("@P_DL_RECON_REJECT_4", pDlReconReject4);
			cmd.addParameter("@P_DL_RECON_REJECT_5", pDlReconReject5);
			cmd.addParameter("@P_DL_ACKN_DATE", pDlAcknDate);
			cmd.addParameter("@P_SAS_END_DATE", pSasEndDate);
			cmd.addParameter("@P_SAS_PROCESS_DATE", pSasProcessDate);
			cmd.addParameter("@P_SCHOOL_CODE", pSchoolCode);
			cmd.addParameter("@P_SAS_RECORD_COUNT_SEQ", pSasRecordCountSeq);
			cmd.addParameter("@P_FEES_PAID", pFeesPaid);
			cmd.addParameter("@P_AFFIRM_FLAG", pAffirmFlag);
			cmd.addParameter("@P_HOLD_REL_STATUS", pHoldRelStatus);
			cmd.addParameter("@P_REV_DISB_AMT", pRevDisbAmt);
			cmd.addParameter("@P_PRIOR_DISB_DATE", pPriorDisbDate);
			cmd.addParameter("@P_DISB_OVERRIDE_IND", pDisbOverrideInd);
			cmd.addParameter("@P_DL_REBATE_AMT", pDlRebateAmt);
			cmd.addParameter("@P_SERV_REBATE_AMT", pServRebateAmt);
			cmd.addParameter("@P_SERV_BOOKED_STATUS", pServBookedStatus);
			cmd.addParameter("@P_SERV_BOOKED_DATE", pServBookedDate);
			cmd.addParameter("@P_EL_HOLD_REL_DATE", pElHoldRelDate);
			cmd.addParameter("@P_EL_REV_GROSS_AMT", pElRevGrossAmt);
			cmd.addParameter("@P_EL_DISB_NO", pElDisbNo);
			cmd.addParameter("@P_SERV_TRANS_TYPE", pServTransType);
			cmd.addParameter("@P_REGION_CD", pRegionCd);
			cmd.addParameter("@P_SCHOOL_STAT_CODE", pSchoolStatCode);
			cmd.addParameter("@P_EL_SERV_GROSS_AMT", pElServGrossAmt);
			cmd.addParameter("@P_EL_SERV_ORIG_FEE", pElServOrigFee);
			cmd.addParameter("@P_EL_SERV_GUAR_FEE", pElServGuarFee);
			cmd.addParameter("@P_EL_SERV_NET_AMT", pElServNetAmt);
			cmd.addParameter("@P_EL_SERV_DISB_DATE", pElServDisbDate);
			cmd.addParameter("@P_EL_SERV_GUAR_FEE_PAID", pElServGuarFeePaid);
			cmd.addParameter("@P_EL_SERV_ORIG_FEE_PAID", pElServOrigFeePaid);
			cmd.addParameter("@P_DOCUMENT_ID", pDocumentId);
			cmd.addParameter("@P_PREV_DISB_SEQ_NO", pPrevDisbSeqNo);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_DL_EDIT_FIELD_1", pDlEditField1);
			cmd.addParameter("@P_DL_EDIT_FIELD_2", pDlEditField2);
			cmd.addParameter("@P_DL_EDIT_FIELD_3", pDlEditField3);
			cmd.addParameter("@P_DL_EDIT_FIELD_4", pDlEditField4);
			cmd.addParameter("@P_DL_EDIT_FIELD_5", pDlEditField5);
			cmd.addParameter("@P_EL_BOR_DIRECT_DISB_IND", pElBorDirectDisbInd);
			cmd.addParameter("@P_EL_DIRECT_CHECK_AMT", pElDirectCheckAmt);
			cmd.addParameter("@P_EXCLUDE_LNEX_FLAG", pExcludeLnexFlag);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_SERVICER", pServicer);
			cmd.addParameter("@P_REPT_DISB_DATE", pReptDisbDate);
			cmd.addParameter("@P_DL_AUTHORIZED_IND", pDlAuthorizedInd);
			cmd.addParameter("@P_ENROLLMENT_SCHOOL_CDE", pEnrollmentSchoolCde);
			cmd.addParameter("@P_SAS_START_DATE", pSasStartDate);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="LoanDisbursementRecRow", dataSourceName="LOAN_DISBURSEMENT_REC")
	public static class LoanDisbursementRecRow
	{
		@DbRecordField(dataSourceName="R_PIDM")
		public NNumber RPidm;
		@DbRecordField(dataSourceName="R_FUND_CODE")
		public NString RFundCode;
		@DbRecordField(dataSourceName="R_APPL_NO")
		public NNumber RApplNo;
		@DbRecordField(dataSourceName="R_DISBURSE_DATE")
		public NDate RDisburseDate;
		@DbRecordField(dataSourceName="R_PERIOD")
		public NString RPeriod;
		@DbRecordField(dataSourceName="R_SEQ_NO")
		public NNumber RSeqNo;
		@DbRecordField(dataSourceName="R_LOAN_PCT")
		public NNumber RLoanPct;
		@DbRecordField(dataSourceName="R_FEED_IND")
		public NString RFeedInd;
		@DbRecordField(dataSourceName="R_CHECK_AMT")
		public NNumber RCheckAmt;
		@DbRecordField(dataSourceName="R_CHECK_DATE")
		public NDate RCheckDate;
		@DbRecordField(dataSourceName="R_STU_RECEIVE_DATE")
		public NDate RStuReceiveDate;
		@DbRecordField(dataSourceName="R_FEED_DATE")
		public NDate RFeedDate;
		@DbRecordField(dataSourceName="R_CHECK_RETURN_AMT")
		public NNumber RCheckReturnAmt;
		@DbRecordField(dataSourceName="R_CHECK_RETURN_DATE")
		public NDate RCheckReturnDate;
		@DbRecordField(dataSourceName="R_TRAN_NUMBER")
		public NNumber RTranNumber;
		@DbRecordField(dataSourceName="R_MEMO_EXP_DAYS")
		public NNumber RMemoExpDays;
		@DbRecordField(dataSourceName="R_DISBURSE_LOAD")
		public NString RDisburseLoad;
		@DbRecordField(dataSourceName="R_DISBURSE_LOAD_OPT")
		public NString RDisburseLoadOpt;
		@DbRecordField(dataSourceName="R_AIDY_CODE")
		public NString RAidyCode;
		@DbRecordField(dataSourceName="R_DL_SEQ_NO")
		public NNumber RDlSeqNo;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_DISB_STATUS")
		public NString RDisbStatus;
		@DbRecordField(dataSourceName="R_RECONCILE_IND")
		public NString RReconcileInd;
		@DbRecordField(dataSourceName="R_RECONCILE_DATE")
		public NDate RReconcileDate;
		@DbRecordField(dataSourceName="R_BATCH_NO")
		public NString RBatchNo;
		@DbRecordField(dataSourceName="R_CANCEL_IND")
		public NString RCancelInd;
		@DbRecordField(dataSourceName="R_CANCEL_DATE")
		public NDate RCancelDate;
		@DbRecordField(dataSourceName="R_REFUND_AMT")
		public NNumber RRefundAmt;
		@DbRecordField(dataSourceName="R_REFUND_DATE")
		public NDate RRefundDate;
		@DbRecordField(dataSourceName="R_DL_GROSS_AMT")
		public NNumber RDlGrossAmt;
		@DbRecordField(dataSourceName="R_DL_FEE_AMT")
		public NNumber RDlFeeAmt;
		@DbRecordField(dataSourceName="R_PN_DISB_DATE")
		public NDate RPnDisbDate;
		@DbRecordField(dataSourceName="R_DL_DISB_NO")
		public NNumber RDlDisbNo;
		@DbRecordField(dataSourceName="R_RECON_BATCH_NO")
		public NString RReconBatchNo;
		@DbRecordField(dataSourceName="R_SERV_GROSS_AMT")
		public NNumber RServGrossAmt;
		@DbRecordField(dataSourceName="R_SERV_FEE_AMT")
		public NNumber RServFeeAmt;
		@DbRecordField(dataSourceName="R_SERV_NET_AMT")
		public NNumber RServNetAmt;
		@DbRecordField(dataSourceName="R_SERV_NET_ADJ_AMT")
		public NNumber RServNetAdjAmt;
		@DbRecordField(dataSourceName="R_SERV_LOANID_ERR")
		public NString RServLoanidErr;
		@DbRecordField(dataSourceName="R_SERV_DISBNO_ERR")
		public NString RServDisbnoErr;
		@DbRecordField(dataSourceName="R_SERV_ACTION_ERR")
		public NString RServActionErr;
		@DbRecordField(dataSourceName="R_SERV_DATE_ERR")
		public NString RServDateErr;
		@DbRecordField(dataSourceName="R_SERV_SEQNO_ERR")
		public NString RServSeqnoErr;
		@DbRecordField(dataSourceName="R_REF_ID")
		public NString RRefId;
		@DbRecordField(dataSourceName="R_RET_LNDR_DATE")
		public NDate RRetLndrDate;
		@DbRecordField(dataSourceName="R_EFT_IND")
		public NString REftInd;
		@DbRecordField(dataSourceName="R_COMMENT")
		public NString RComment;
		@DbRecordField(dataSourceName="R_DISB_BYPASS")
		public NString RDisbBypass;
		@DbRecordField(dataSourceName="R_DL_REJECT_CODE_1")
		public NString RDlRejectCode1;
		@DbRecordField(dataSourceName="R_DL_REJECT_CODE_2")
		public NString RDlRejectCode2;
		@DbRecordField(dataSourceName="R_DL_REJECT_CODE_3")
		public NString RDlRejectCode3;
		@DbRecordField(dataSourceName="R_DL_REJECT_CODE_4")
		public NString RDlRejectCode4;
		@DbRecordField(dataSourceName="R_DL_REJECT_CODE_5")
		public NString RDlRejectCode5;
		@DbRecordField(dataSourceName="R_DL_RECON_REJECT_1")
		public NString RDlReconReject1;
		@DbRecordField(dataSourceName="R_DL_RECON_REJECT_2")
		public NString RDlReconReject2;
		@DbRecordField(dataSourceName="R_DL_RECON_REJECT_3")
		public NString RDlReconReject3;
		@DbRecordField(dataSourceName="R_DL_RECON_REJECT_4")
		public NString RDlReconReject4;
		@DbRecordField(dataSourceName="R_DL_RECON_REJECT_5")
		public NString RDlReconReject5;
		@DbRecordField(dataSourceName="R_DL_ACKN_DATE")
		public NDate RDlAcknDate;
		@DbRecordField(dataSourceName="R_SAS_END_DATE")
		public NDate RSasEndDate;
		@DbRecordField(dataSourceName="R_SAS_PROCESS_DATE")
		public NDate RSasProcessDate;
		@DbRecordField(dataSourceName="R_SCHOOL_CODE")
		public NString RSchoolCode;
		@DbRecordField(dataSourceName="R_SAS_RECORD_COUNT_SEQ")
		public NNumber RSasRecordCountSeq;
		@DbRecordField(dataSourceName="R_FEES_PAID")
		public NNumber RFeesPaid;
		@DbRecordField(dataSourceName="R_AFFIRM_FLAG")
		public NString RAffirmFlag;
		@DbRecordField(dataSourceName="R_HOLD_REL_STATUS")
		public NString RHoldRelStatus;
		@DbRecordField(dataSourceName="R_REV_DISB_AMT")
		public NNumber RRevDisbAmt;
		@DbRecordField(dataSourceName="R_PRIOR_DISB_DATE")
		public NDate RPriorDisbDate;
		@DbRecordField(dataSourceName="R_DISB_OVERRIDE_IND")
		public NString RDisbOverrideInd;
		@DbRecordField(dataSourceName="R_DL_REBATE_AMT")
		public NNumber RDlRebateAmt;
		@DbRecordField(dataSourceName="R_SERV_REBATE_AMT")
		public NNumber RServRebateAmt;
		@DbRecordField(dataSourceName="R_SERV_BOOKED_STATUS")
		public NString RServBookedStatus;
		@DbRecordField(dataSourceName="R_SERV_BOOKED_DATE")
		public NDate RServBookedDate;
		@DbRecordField(dataSourceName="R_EL_HOLD_REL_DATE")
		public NDate RElHoldRelDate;
		@DbRecordField(dataSourceName="R_EL_REV_GROSS_AMT")
		public NNumber RElRevGrossAmt;
		@DbRecordField(dataSourceName="R_EL_DISB_NO")
		public NNumber RElDisbNo;
		@DbRecordField(dataSourceName="R_SERV_TRANS_TYPE")
		public NString RServTransType;
		@DbRecordField(dataSourceName="R_REGION_CD")
		public NString RRegionCd;
		@DbRecordField(dataSourceName="R_SCHOOL_STAT_CODE")
		public NString RSchoolStatCode;
		@DbRecordField(dataSourceName="R_EL_SERV_GROSS_AMT")
		public NNumber RElServGrossAmt;
		@DbRecordField(dataSourceName="R_EL_SERV_ORIG_FEE")
		public NNumber RElServOrigFee;
		@DbRecordField(dataSourceName="R_EL_SERV_GUAR_FEE")
		public NNumber RElServGuarFee;
		@DbRecordField(dataSourceName="R_EL_SERV_NET_AMT")
		public NNumber RElServNetAmt;
		@DbRecordField(dataSourceName="R_EL_SERV_DISB_DATE")
		public NDate RElServDisbDate;
		@DbRecordField(dataSourceName="R_EL_SERV_GUAR_FEE_PAID")
		public NNumber RElServGuarFeePaid;
		@DbRecordField(dataSourceName="R_EL_SERV_ORIG_FEE_PAID")
		public NNumber RElServOrigFeePaid;
		@DbRecordField(dataSourceName="R_DOCUMENT_ID")
		public NString RDocumentId;
		@DbRecordField(dataSourceName="R_PREV_DISB_SEQ_NO")
		public NNumber RPrevDisbSeqNo;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_DL_EDIT_FIELD_1")
		public NString RDlEditField1;
		@DbRecordField(dataSourceName="R_DL_EDIT_FIELD_2")
		public NString RDlEditField2;
		@DbRecordField(dataSourceName="R_DL_EDIT_FIELD_3")
		public NString RDlEditField3;
		@DbRecordField(dataSourceName="R_DL_EDIT_FIELD_4")
		public NString RDlEditField4;
		@DbRecordField(dataSourceName="R_DL_EDIT_FIELD_5")
		public NString RDlEditField5;
		@DbRecordField(dataSourceName="R_EL_BOR_DIRECT_DISB_IND")
		public NString RElBorDirectDisbInd;
		@DbRecordField(dataSourceName="R_EL_DIRECT_CHECK_AMT")
		public NNumber RElDirectCheckAmt;
		@DbRecordField(dataSourceName="R_EXCLUDE_LNEX_FLAG")
		public NString RExcludeLnexFlag;
		@DbRecordField(dataSourceName="R_TERM_CODE")
		public NString RTermCode;
		@DbRecordField(dataSourceName="R_SERVICER")
		public NString RServicer;
		@DbRecordField(dataSourceName="R_REPT_DISB_DATE")
		public NDate RReptDisbDate;
		@DbRecordField(dataSourceName="R_DL_AUTHORIZED_IND")
		public NString RDlAuthorizedInd;
		@DbRecordField(dataSourceName="R_ENROLLMENT_SCHOOL_CDE")
		public NString REnrollmentSchoolCde;
		@DbRecordField(dataSourceName="R_SAS_START_DATE")
		public NDate RSasStartDate;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
