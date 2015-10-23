package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Rekce08 {
		public static NString fGetCodNatnCode(NString pCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("REKCE08.F_GET_COD_NATN_CODE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_CODE", pCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetCodStateCode(NString pCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("REKCE08.F_GET_COD_STATE_CODE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_CODE", pCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("REKCE08.F_GET_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fSelectAcgDisbursements(NString pAidyCode,NNumber pPidm,NString pFundCode,NString pResendDocId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("REKCE08.F_SELECT_ACG_DISBURSEMENTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_RESEND_DOC_ID", pResendDocId);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fSelectAcgOriginations(NString pAidyCode,NNumber pPidm,NString pResendDocId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("REKCE08.F_SELECT_ACG_ORIGINATIONS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_RESEND_DOC_ID", pResendDocId);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fSelectDlAwards(NString pAidyCode,NNumber pPidm,NNumber pJobno,NString pJobname,NString pResendDocId,NString pExtractRecs) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("REKCE08.F_SELECT_DL_AWARDS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_JOBNO", pJobno);
			cmd.addParameter("@P_JOBNAME", pJobname);
			cmd.addParameter("@P_RESEND_DOC_ID", pResendDocId);
			cmd.addParameter("@P_EXTRACT_RECS", pExtractRecs);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fSelectDlChanges(NString pAidyCode,NNumber pPidm,NNumber pJobno,NString pJobname,NString pResendDocId,NString pExtractRecs) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("REKCE08.F_SELECT_DL_CHANGES", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_JOBNO", pJobno);
			cmd.addParameter("@P_JOBNAME", pJobname);
			cmd.addParameter("@P_RESEND_DOC_ID", pResendDocId);
			cmd.addParameter("@P_EXTRACT_RECS", pExtractRecs);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fSelectDlDisbursements(NString pAidyCode,NNumber pPidm,NString pFundCode,NNumber pApplNo,NString pResendDocId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("REKCE08.F_SELECT_DL_DISBURSEMENTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_APPL_NO", pApplNo);
			cmd.addParameter("@P_RESEND_DOC_ID", pResendDocId);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fSelectPellAwards(NString pAidyCode,NNumber pPidm,NString pResendDocId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("REKCE08.F_SELECT_PELL_AWARDS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_RESEND_DOC_ID", pResendDocId);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fSelectPellDisbursements(NString pAidyCode,NNumber pPidm,NString pResendDocId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("REKCE08.F_SELECT_PELL_DISBURSEMENTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_RESEND_DOC_ID", pResendDocId);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fSelectSmartDisbursements(NString pAidyCode,NNumber pPidm,NString pFundCode,NString pResendDocId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("REKCE08.F_SELECT_SMART_DISBURSEMENTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_RESEND_DOC_ID", pResendDocId);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fSelectSmartOriginations(NString pAidyCode,NNumber pPidm,NString pResendDocId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("REKCE08.F_SELECT_SMART_ORIGINATIONS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_RESEND_DOC_ID", pResendDocId);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fSelectStudents(NString pAidyCode,NString pExtractPell,NString pExtractAcg,NString pExtractSmart,NString pExtractRecs,NString pResendDocId,NString pApplicationCode,NString pSelectionId,NString pCreatorId,NString pUserId,NNumber pJobno,NString pJobname) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("REKCE08.F_SELECT_STUDENTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_EXTRACT_PELL", pExtractPell);
			cmd.addParameter("@P_EXTRACT_ACG", pExtractAcg);
			cmd.addParameter("@P_EXTRACT_SMART", pExtractSmart);
			cmd.addParameter("@P_EXTRACT_RECS", pExtractRecs);
			cmd.addParameter("@P_RESEND_DOC_ID", pResendDocId);
			cmd.addParameter("@P_APPLICATION_CODE", pApplicationCode);
			cmd.addParameter("@P_SELECTION_ID", pSelectionId);
			cmd.addParameter("@P_CREATOR_ID", pCreatorId);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_JOBNO", pJobno);
			cmd.addParameter("@P_JOBNAME", pJobname);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCalcAcgData(NString pAidyCode,NNumber pPidm,NString pFundCode,NNumber pDisbAmt,NNumber pDisburseAmt,NDate pDisbDate,NDate pDisburseDate,NString pTermCode,NDate pScheduleDate,NString pDisbLockInd,NNumber pDisbursePct,NString pDebitCrInd,NString pAwardId,NString pInstXref,NString pDocumentId,NString pCampPellId,NString pRowid,Ref<NNumber> pDisbRefNo,Ref<NNumber> pDisbSeqNo,Ref<NDate> pPayPdStartDate,Ref<NDate> pDisbursementDate,Ref<NNumber> pDisbursementAmt,Ref<NString> pDisbReleaseInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("REKCE08.P_CALC_ACG_DATA", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_DISB_AMT", pDisbAmt);
			cmd.addParameter("@P_DISBURSE_AMT", pDisburseAmt);
			cmd.addParameter("@P_DISB_DATE", pDisbDate);
			cmd.addParameter("@P_DISBURSE_DATE", pDisburseDate);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_SCHEDULE_DATE", pScheduleDate);
			cmd.addParameter("@P_DISB_LOCK_IND", pDisbLockInd);
			cmd.addParameter("@P_DISBURSE_PCT", pDisbursePct);
			cmd.addParameter("@P_DEBIT_CR_IND", pDebitCrInd);
			cmd.addParameter("@P_AWARD_ID", pAwardId);
			cmd.addParameter("@P_INST_XREF", pInstXref);
			cmd.addParameter("@P_DOCUMENT_ID", pDocumentId);
			cmd.addParameter("@P_CAMP_PELL_ID", pCampPellId);
			cmd.addParameter("@P_ROWID", pRowid);
			cmd.addParameter("@P_DISB_REF_NO", pDisbRefNo, true);
			cmd.addParameter("@P_DISB_SEQ_NO", pDisbSeqNo, true);
			cmd.addParameter("@P_PAY_PD_START_DATE", NDate.class);
			cmd.addParameter("@P_DISBURSEMENT_DATE", NDate.class);
			cmd.addParameter("@P_DISBURSEMENT_AMT", NNumber.class);
			cmd.addParameter("@P_DISB_RELEASE_IND", NString.class);
				
			cmd.execute();
			pDisbRefNo.val = cmd.getParameterValue("@P_DISB_REF_NO", NNumber.class);
			pDisbSeqNo.val = cmd.getParameterValue("@P_DISB_SEQ_NO", NNumber.class);
			pPayPdStartDate.val = cmd.getParameterValue("@P_PAY_PD_START_DATE", NDate.class);
			pDisbursementDate.val = cmd.getParameterValue("@P_DISBURSEMENT_DATE", NDate.class);
			pDisbursementAmt.val = cmd.getParameterValue("@P_DISBURSEMENT_AMT", NNumber.class);
			pDisbReleaseInd.val = cmd.getParameterValue("@P_DISB_RELEASE_IND", NString.class);


		}
		
		public static void pCalcDlDisbursement(NNumber pPidm,NString pFundCode,NNumber pApplNo,NNumber pDlDisbNo,NNumber pSeqNo,Ref<NNumber> pDlGrossAmt,Ref<NNumber> pDlFeeAmt,Ref<NNumber> pDlNetAmt,Ref<NNumber> pDlRebateAmt,Ref<NDate> pFeedDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("REKCE08.P_CALC_DL_DISBURSEMENT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_APPL_NO", pApplNo);
			cmd.addParameter("@P_DL_DISB_NO", pDlDisbNo);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_DL_GROSS_AMT", NNumber.class);
			cmd.addParameter("@P_DL_FEE_AMT", NNumber.class);
			cmd.addParameter("@P_DL_NET_AMT", NNumber.class);
			cmd.addParameter("@P_DL_REBATE_AMT", NNumber.class);
			cmd.addParameter("@P_FEED_DATE", NDate.class);
				
			cmd.execute();
			pDlGrossAmt.val = cmd.getParameterValue("@P_DL_GROSS_AMT", NNumber.class);
			pDlFeeAmt.val = cmd.getParameterValue("@P_DL_FEE_AMT", NNumber.class);
			pDlNetAmt.val = cmd.getParameterValue("@P_DL_NET_AMT", NNumber.class);
			pDlRebateAmt.val = cmd.getParameterValue("@P_DL_REBATE_AMT", NNumber.class);
			pFeedDate.val = cmd.getParameterValue("@P_FEED_DATE", NDate.class);


		}
		
		public static void pCalcPellData(NString pAidyCode,NNumber pPidm,NString pFundCode,NNumber pDisbAmt,NNumber pDisburseAmt,NDate pDisbDate,NDate pDisburseDate,NString pTermCode,NDate pScheduleDate,NString pDisbLockInd,NNumber pDisbursePct,NString pDebitCrInd,NString pOrigId,NString pInstXref,NString pDocumentId,NString pRowid,Ref<NNumber> pDisbRefNo,Ref<NNumber> pDisbSeqNo,Ref<NDate> pPayPdStartDate,Ref<NDate> pDisbursementDate,Ref<NNumber> pDisbursementAmt,Ref<NString> pDisbReleaseInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("REKCE08.P_CALC_PELL_DATA", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_DISB_AMT", pDisbAmt);
			cmd.addParameter("@P_DISBURSE_AMT", pDisburseAmt);
			cmd.addParameter("@P_DISB_DATE", pDisbDate);
			cmd.addParameter("@P_DISBURSE_DATE", pDisburseDate);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_SCHEDULE_DATE", pScheduleDate);
			cmd.addParameter("@P_DISB_LOCK_IND", pDisbLockInd);
			cmd.addParameter("@P_DISBURSE_PCT", pDisbursePct);
			cmd.addParameter("@P_DEBIT_CR_IND", pDebitCrInd);
			cmd.addParameter("@P_ORIG_ID", pOrigId);
			cmd.addParameter("@P_INST_XREF", pInstXref);
			cmd.addParameter("@P_DOCUMENT_ID", pDocumentId);
			cmd.addParameter("@P_ROWID", pRowid);
			cmd.addParameter("@P_DISB_REF_NO", pDisbRefNo, true);
			cmd.addParameter("@P_DISB_SEQ_NO", pDisbSeqNo, true);
			cmd.addParameter("@P_PAY_PD_START_DATE", NDate.class);
			cmd.addParameter("@P_DISBURSEMENT_DATE", NDate.class);
			cmd.addParameter("@P_DISBURSEMENT_AMT", NNumber.class);
			cmd.addParameter("@P_DISB_RELEASE_IND", NString.class);
				
			cmd.execute();
			pDisbRefNo.val = cmd.getParameterValue("@P_DISB_REF_NO", NNumber.class);
			pDisbSeqNo.val = cmd.getParameterValue("@P_DISB_SEQ_NO", NNumber.class);
			pPayPdStartDate.val = cmd.getParameterValue("@P_PAY_PD_START_DATE", NDate.class);
			pDisbursementDate.val = cmd.getParameterValue("@P_DISBURSEMENT_DATE", NDate.class);
			pDisbursementAmt.val = cmd.getParameterValue("@P_DISBURSEMENT_AMT", NNumber.class);
			pDisbReleaseInd.val = cmd.getParameterValue("@P_DISB_RELEASE_IND", NString.class);


		}
		
		public static void pCalcSmartData(NString pAidyCode,NNumber pPidm,NString pFundCode,NNumber pDisbAmt,NNumber pDisburseAmt,NDate pDisbDate,NDate pDisburseDate,NString pTermCode,NDate pScheduleDate,NString pDisbLockInd,NNumber pDisbursePct,NString pDebitCrInd,NString pAwardId,NString pInstXref,NString pDocumentId,NString pCampPellId,NString pRowid,Ref<NNumber> pDisbRefNo,Ref<NNumber> pDisbSeqNo,Ref<NDate> pPayPdStartDate,Ref<NDate> pDisbursementDate,Ref<NNumber> pDisbursementAmt,Ref<NString> pDisbReleaseInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("REKCE08.P_CALC_SMART_DATA", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_DISB_AMT", pDisbAmt);
			cmd.addParameter("@P_DISBURSE_AMT", pDisburseAmt);
			cmd.addParameter("@P_DISB_DATE", pDisbDate);
			cmd.addParameter("@P_DISBURSE_DATE", pDisburseDate);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_SCHEDULE_DATE", pScheduleDate);
			cmd.addParameter("@P_DISB_LOCK_IND", pDisbLockInd);
			cmd.addParameter("@P_DISBURSE_PCT", pDisbursePct);
			cmd.addParameter("@P_DEBIT_CR_IND", pDebitCrInd);
			cmd.addParameter("@P_AWARD_ID", pAwardId);
			cmd.addParameter("@P_INST_XREF", pInstXref);
			cmd.addParameter("@P_DOCUMENT_ID", pDocumentId);
			cmd.addParameter("@P_CAMP_PELL_ID", pCampPellId);
			cmd.addParameter("@P_ROWID", pRowid);
			cmd.addParameter("@P_DISB_REF_NO", pDisbRefNo, true);
			cmd.addParameter("@P_DISB_SEQ_NO", pDisbSeqNo, true);
			cmd.addParameter("@P_PAY_PD_START_DATE", NDate.class);
			cmd.addParameter("@P_DISBURSEMENT_DATE", NDate.class);
			cmd.addParameter("@P_DISBURSEMENT_AMT", NNumber.class);
			cmd.addParameter("@P_DISB_RELEASE_IND", NString.class);
				
			cmd.execute();
			pDisbRefNo.val = cmd.getParameterValue("@P_DISB_REF_NO", NNumber.class);
			pDisbSeqNo.val = cmd.getParameterValue("@P_DISB_SEQ_NO", NNumber.class);
			pPayPdStartDate.val = cmd.getParameterValue("@P_PAY_PD_START_DATE", NDate.class);
			pDisbursementDate.val = cmd.getParameterValue("@P_DISBURSEMENT_DATE", NDate.class);
			pDisbursementAmt.val = cmd.getParameterValue("@P_DISBURSEMENT_AMT", NNumber.class);
			pDisbReleaseInd.val = cmd.getParameterValue("@P_DISB_RELEASE_IND", NString.class);


		}
		
		public static void pInsertCodDocument(NString pAidyCode,NString pDocumentId,NString pResendDocId,NString pExtractFile) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("REKCE08.P_INSERT_COD_DOCUMENT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_DOCUMENT_ID", pDocumentId);
			cmd.addParameter("@P_RESEND_DOC_ID", pResendDocId);
			cmd.addParameter("@P_EXTRACT_FILE", pExtractFile);
				
			cmd.execute();


		}
		
		public static void pInsertCodIdentifier(NString pAidyCode,NNumber pPidm,NNumber pSeqNo,NString pIdentifierType,NString pDocumentId,NString pSsn,NString pLastName,NDate pBirthDate,NString pStatusCde,Ref<NString> pPlusBorrowerIdNo,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("REKCE08.P_INSERT_COD_IDENTIFIER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_IDENTIFIER_TYPE", pIdentifierType);
			cmd.addParameter("@P_DOCUMENT_ID", pDocumentId);
			cmd.addParameter("@P_SSN", pSsn);
			cmd.addParameter("@P_LAST_NAME", pLastName);
			cmd.addParameter("@P_BIRTH_DATE", pBirthDate);
			cmd.addParameter("@P_STATUS_CDE", pStatusCde);
			cmd.addParameter("@P_PLUS_BORROWER_ID_NO", pPlusBorrowerIdNo, true);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pPlusBorrowerIdNo.val = cmd.getParameterValue("@P_PLUS_BORROWER_ID_NO", NString.class);
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pSelectBorrowerIdentifier(NString pAidyCode,NNumber pPidm,NString pResendDocId,Ref<NString> pSsn,Ref<NDate> pBirthDate,Ref<NString> pLastName,Ref<NString> pPlusBorrowerIdNo,Ref<NString> pNewSsn,Ref<NDate> pNewBirthDate,Ref<NString> pNewLastName,Ref<NString> pStatusCde,Ref<NNumber> pSeqNo,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("REKCE08.P_SELECT_BORROWER_IDENTIFIER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_RESEND_DOC_ID", pResendDocId);
			cmd.addParameter("@P_SSN", pSsn, true);
			cmd.addParameter("@P_BIRTH_DATE", pBirthDate, true);
			cmd.addParameter("@P_LAST_NAME", pLastName, true);
			cmd.addParameter("@P_PLUS_BORROWER_ID_NO", pPlusBorrowerIdNo, true);
			cmd.addParameter("@P_NEW_SSN", NString.class);
			cmd.addParameter("@P_NEW_BIRTH_DATE", NDate.class);
			cmd.addParameter("@P_NEW_LAST_NAME", NString.class);
			cmd.addParameter("@P_STATUS_CDE", NString.class);
			cmd.addParameter("@P_SEQ_NO", NNumber.class);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pSsn.val = cmd.getParameterValue("@P_SSN", NString.class);
			pBirthDate.val = cmd.getParameterValue("@P_BIRTH_DATE", NDate.class);
			pLastName.val = cmd.getParameterValue("@P_LAST_NAME", NString.class);
			pPlusBorrowerIdNo.val = cmd.getParameterValue("@P_PLUS_BORROWER_ID_NO", NString.class);
			pNewSsn.val = cmd.getParameterValue("@P_NEW_SSN", NString.class);
			pNewBirthDate.val = cmd.getParameterValue("@P_NEW_BIRTH_DATE", NDate.class);
			pNewLastName.val = cmd.getParameterValue("@P_NEW_LAST_NAME", NString.class);
			pStatusCde.val = cmd.getParameterValue("@P_STATUS_CDE", NString.class);
			pSeqNo.val = cmd.getParameterValue("@P_SEQ_NO", NNumber.class);
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pSelectDlDisbRequired(NString pAidyCode,NNumber pPidm,NString pFundCode,NNumber pApplNo,NNumber pDlSeqNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("REKCE08.P_SELECT_DL_DISB_REQUIRED", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_APPL_NO", pApplNo);
			cmd.addParameter("@P_DL_SEQ_NO", pDlSeqNo);
				
			cmd.execute();


		}
		
		public static void pSelectDlPnoteRequired(NString pAidyCode,NNumber pPidm,NString pFundCode,NNumber pDlSeqNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("REKCE08.P_SELECT_DL_PNOTE_REQUIRED", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_DL_SEQ_NO", pDlSeqNo);
				
			cmd.execute();


		}
		
		public static void pSelectDocumentInfo(NString pAidyCode,NString pResendDocId,Ref<NString> pAttendingId,Ref<NString> pReportingId,Ref<NString> pSourceId,Ref<NString> pDocumentId,Ref<NString> pCreateDatetime,Ref<NString> pDestinationId,Ref<NString> pSoftwareProvider,Ref<NString> pSoftwareVersion) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("REKCE08.P_SELECT_DOCUMENT_INFO", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_RESEND_DOC_ID", pResendDocId);
			cmd.addParameter("@P_ATTENDING_ID", pAttendingId, true);
			cmd.addParameter("@P_REPORTING_ID", NString.class);
			cmd.addParameter("@P_SOURCE_ID", NString.class);
			cmd.addParameter("@P_DOCUMENT_ID", NString.class);
			cmd.addParameter("@P_CREATE_DATETIME", NString.class);
			cmd.addParameter("@P_DESTINATION_ID", NString.class);
			cmd.addParameter("@P_SOFTWARE_PROVIDER", NString.class);
			cmd.addParameter("@P_SOFTWARE_VERSION", NString.class);
				
			cmd.execute();
			pAttendingId.val = cmd.getParameterValue("@P_ATTENDING_ID", NString.class);
			pReportingId.val = cmd.getParameterValue("@P_REPORTING_ID", NString.class);
			pSourceId.val = cmd.getParameterValue("@P_SOURCE_ID", NString.class);
			pDocumentId.val = cmd.getParameterValue("@P_DOCUMENT_ID", NString.class);
			pCreateDatetime.val = cmd.getParameterValue("@P_CREATE_DATETIME", NString.class);
			pDestinationId.val = cmd.getParameterValue("@P_DESTINATION_ID", NString.class);
			pSoftwareProvider.val = cmd.getParameterValue("@P_SOFTWARE_PROVIDER", NString.class);
			pSoftwareVersion.val = cmd.getParameterValue("@P_SOFTWARE_VERSION", NString.class);


		}
		
		public static void pSelectIdentifierChanges(NString pAidyCode,NNumber pPidm,NString pDocumentId,NString pResendDocId,Ref<NString> pAwardType,Ref<NNumber> pAwardNumber,Ref<NString> pAwardId,Ref<NString> pSsn,Ref<NDate> pBirthDate,Ref<NString> pLastName,Ref<NString> pPlusBorrowerIdNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("REKCE08.P_SELECT_IDENTIFIER_CHANGES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_DOCUMENT_ID", pDocumentId);
			cmd.addParameter("@P_RESEND_DOC_ID", pResendDocId);
			cmd.addParameter("@P_AWARD_TYPE", NString.class);
			cmd.addParameter("@P_AWARD_NUMBER", NNumber.class);
			cmd.addParameter("@P_AWARD_ID", NString.class);
			cmd.addParameter("@P_SSN", NString.class);
			cmd.addParameter("@P_BIRTH_DATE", NDate.class);
			cmd.addParameter("@P_LAST_NAME", NString.class);
			cmd.addParameter("@P_PLUS_BORROWER_ID_NO", NString.class);
				
			cmd.execute();
			pAwardType.val = cmd.getParameterValue("@P_AWARD_TYPE", NString.class);
			pAwardNumber.val = cmd.getParameterValue("@P_AWARD_NUMBER", NNumber.class);
			pAwardId.val = cmd.getParameterValue("@P_AWARD_ID", NString.class);
			pSsn.val = cmd.getParameterValue("@P_SSN", NString.class);
			pBirthDate.val = cmd.getParameterValue("@P_BIRTH_DATE", NDate.class);
			pLastName.val = cmd.getParameterValue("@P_LAST_NAME", NString.class);
			pPlusBorrowerIdNo.val = cmd.getParameterValue("@P_PLUS_BORROWER_ID_NO", NString.class);


		}
		
		public static void pSelectPersonInfo(NString pAidyCode,NNumber pPidm,NNumber pJobno,NString pJobname,NString pDocumentId,NString pResendDocId,Ref<NString> pSsn,Ref<NDate> pBirthDate,Ref<NString> pLastName,Ref<NString> pStatCodeLic,Ref<NString> pDriverLicNo,Ref<NString> pFirstName,Ref<NString> pMi,Ref<NString> pAddress,Ref<NString> pCity,Ref<NString> pState,Ref<NString> pZip,Ref<NString> pPhoneNo,Ref<NString> pEmailAddress,Ref<NString> pCitzInd,Ref<NString> pNatnCode,Ref<NString> pLocalAddress,Ref<NString> pLocalCity,Ref<NString> pLocalStatCode,Ref<NString> pLocalZip,Ref<NString> pLocalNatnCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("REKCE08.P_SELECT_PERSON_INFO", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_JOBNO", pJobno);
			cmd.addParameter("@P_JOBNAME", pJobname);
			cmd.addParameter("@P_DOCUMENT_ID", pDocumentId);
			cmd.addParameter("@P_RESEND_DOC_ID", pResendDocId);
			cmd.addParameter("@P_SSN", NString.class);
			cmd.addParameter("@P_BIRTH_DATE", NDate.class);
			cmd.addParameter("@P_LAST_NAME", NString.class);
			cmd.addParameter("@P_STAT_CODE_LIC", NString.class);
			cmd.addParameter("@P_DRIVER_LIC_NO", NString.class);
			cmd.addParameter("@P_FIRST_NAME", NString.class);
			cmd.addParameter("@P_MI", NString.class);
			cmd.addParameter("@P_ADDRESS", NString.class);
			cmd.addParameter("@P_CITY", NString.class);
			cmd.addParameter("@P_STATE", NString.class);
			cmd.addParameter("@P_ZIP", NString.class);
			cmd.addParameter("@P_PHONE_NO", NString.class);
			cmd.addParameter("@P_EMAIL_ADDRESS", NString.class);
			cmd.addParameter("@P_CITZ_IND", NString.class);
			cmd.addParameter("@P_NATN_CODE", NString.class);
			cmd.addParameter("@P_LOCAL_ADDRESS", NString.class);
			cmd.addParameter("@P_LOCAL_CITY", NString.class);
			cmd.addParameter("@P_LOCAL_STAT_CODE", NString.class);
			cmd.addParameter("@P_LOCAL_ZIP", NString.class);
			cmd.addParameter("@P_LOCAL_NATN_CODE", NString.class);
				
			cmd.execute();
			pSsn.val = cmd.getParameterValue("@P_SSN", NString.class);
			pBirthDate.val = cmd.getParameterValue("@P_BIRTH_DATE", NDate.class);
			pLastName.val = cmd.getParameterValue("@P_LAST_NAME", NString.class);
			pStatCodeLic.val = cmd.getParameterValue("@P_STAT_CODE_LIC", NString.class);
			pDriverLicNo.val = cmd.getParameterValue("@P_DRIVER_LIC_NO", NString.class);
			pFirstName.val = cmd.getParameterValue("@P_FIRST_NAME", NString.class);
			pMi.val = cmd.getParameterValue("@P_MI", NString.class);
			pAddress.val = cmd.getParameterValue("@P_ADDRESS", NString.class);
			pCity.val = cmd.getParameterValue("@P_CITY", NString.class);
			pState.val = cmd.getParameterValue("@P_STATE", NString.class);
			pZip.val = cmd.getParameterValue("@P_ZIP", NString.class);
			pPhoneNo.val = cmd.getParameterValue("@P_PHONE_NO", NString.class);
			pEmailAddress.val = cmd.getParameterValue("@P_EMAIL_ADDRESS", NString.class);
			pCitzInd.val = cmd.getParameterValue("@P_CITZ_IND", NString.class);
			pNatnCode.val = cmd.getParameterValue("@P_NATN_CODE", NString.class);
			pLocalAddress.val = cmd.getParameterValue("@P_LOCAL_ADDRESS", NString.class);
			pLocalCity.val = cmd.getParameterValue("@P_LOCAL_CITY", NString.class);
			pLocalStatCode.val = cmd.getParameterValue("@P_LOCAL_STAT_CODE", NString.class);
			pLocalZip.val = cmd.getParameterValue("@P_LOCAL_ZIP", NString.class);
			pLocalNatnCode.val = cmd.getParameterValue("@P_LOCAL_NATN_CODE", NString.class);


		}
		
		public static void pSelectStudentIdentifier(NString pAidyCode,NNumber pPidm,NString pResendDocId,NString pUpdateStuId,Ref<NString> pSsn,Ref<NDate> pBirthDate,Ref<NString> pLastName,Ref<NString> pNewSsn,Ref<NDate> pNewBirthDate,Ref<NString> pNewLastName,Ref<NString> pStatusCde,Ref<NNumber> pSeqNo,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("REKCE08.P_SELECT_STUDENT_IDENTIFIER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_RESEND_DOC_ID", pResendDocId);
			cmd.addParameter("@P_UPDATE_STU_ID", pUpdateStuId);
			cmd.addParameter("@P_SSN", pSsn, true);
			cmd.addParameter("@P_BIRTH_DATE", pBirthDate, true);
			cmd.addParameter("@P_LAST_NAME", pLastName, true);
			cmd.addParameter("@P_NEW_SSN", NString.class);
			cmd.addParameter("@P_NEW_BIRTH_DATE", NDate.class);
			cmd.addParameter("@P_NEW_LAST_NAME", NString.class);
			cmd.addParameter("@P_STATUS_CDE", NString.class);
			cmd.addParameter("@P_SEQ_NO", NNumber.class);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pSsn.val = cmd.getParameterValue("@P_SSN", NString.class);
			pBirthDate.val = cmd.getParameterValue("@P_BIRTH_DATE", NDate.class);
			pLastName.val = cmd.getParameterValue("@P_LAST_NAME", NString.class);
			pNewSsn.val = cmd.getParameterValue("@P_NEW_SSN", NString.class);
			pNewBirthDate.val = cmd.getParameterValue("@P_NEW_BIRTH_DATE", NDate.class);
			pNewLastName.val = cmd.getParameterValue("@P_NEW_LAST_NAME", NString.class);
			pStatusCde.val = cmd.getParameterValue("@P_STATUS_CDE", NString.class);
			pSeqNo.val = cmd.getParameterValue("@P_SEQ_NO", NNumber.class);
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pUpdateAcgOrigination(NString pAidyCode,NNumber pPidm,NString pFundCode,NNumber pIntSeqNo,NString pDocumentId,NString pStatusCde,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("REKCE08.P_UPDATE_ACG_ORIGINATION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_INT_SEQ_NO", pIntSeqNo);
			cmd.addParameter("@P_DOCUMENT_ID", pDocumentId);
			cmd.addParameter("@P_STATUS_CDE", pStatusCde);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pUpdateBorrowerIdNo(NString pPlusBorrowerIdNo,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("REKCE08.P_UPDATE_BORROWER_ID_NO", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PLUS_BORROWER_ID_NO", pPlusBorrowerIdNo);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pUpdateCodIdentifier(NString pAidyCode,NNumber pPidm,NNumber pSeqNo,NString pIdentifierType,NString pPlusBorrowerIdNo,NString pDocumentId,NString pStatusCde,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("REKCE08.P_UPDATE_COD_IDENTIFIER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_IDENTIFIER_TYPE", pIdentifierType);
			cmd.addParameter("@P_PLUS_BORROWER_ID_NO", pPlusBorrowerIdNo);
			cmd.addParameter("@P_DOCUMENT_ID", pDocumentId);
			cmd.addParameter("@P_STATUS_CDE", pStatusCde);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pUpdateDiscNeedPrintFlag(NNumber pPidm,NString pFundCode,NNumber pApplNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("REKCE08.P_UPDATE_DISC_NEED_PRINT_FLAG", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_APPL_NO", pApplNo);
				
			cmd.execute();


		}
		
		public static void pUpdateDlAward(NString pAidyCode,NNumber pPidm,NString pFundCode,NNumber pApplNo,NString pDocumentId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("REKCE08.P_UPDATE_DL_AWARD", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_APPL_NO", pApplNo);
			cmd.addParameter("@P_DOCUMENT_ID", pDocumentId);
				
			cmd.execute();


		}
		
		public static void pUpdateDlChange(NString pAidyCode,NNumber pPidm,NString pDocumentId,NString pDataCde,NString pDataValue,NString pDlLoanId,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("REKCE08.P_UPDATE_DL_CHANGE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_DOCUMENT_ID", pDocumentId);
			cmd.addParameter("@P_DATA_CDE", pDataCde);
			cmd.addParameter("@P_DATA_VALUE", pDataValue);
			cmd.addParameter("@P_DL_LOAN_ID", pDlLoanId);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pUpdateDlDisbursement(NString pDocumentId,NString pReleaseInd,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("REKCE08.P_UPDATE_DL_DISBURSEMENT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DOCUMENT_ID", pDocumentId);
			cmd.addParameter("@P_RELEASE_IND", pReleaseInd);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pUpdateMpnReprint(NNumber pPidm,NString pFundCode,NNumber pApplNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("REKCE08.P_UPDATE_MPN_REPRINT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_APPL_NO", pApplNo);
				
			cmd.execute();


		}
		
		public static void pUpdatePellAward(NString pAidyCode,NNumber pPidm,NString pDocumentId,NString pStatusCde,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("REKCE08.P_UPDATE_PELL_AWARD", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_DOCUMENT_ID", pDocumentId);
			cmd.addParameter("@P_STATUS_CDE", pStatusCde);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pUpdateSmartOrigination(NString pAidyCode,NNumber pPidm,NString pFundCode,NNumber pIntSeqNo,NString pDocumentId,NString pStatusCde,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("REKCE08.P_UPDATE_SMART_ORIGINATION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_INT_SEQ_NO", pIntSeqNo);
			cmd.addParameter("@P_DOCUMENT_ID", pDocumentId);
			cmd.addParameter("@P_STATUS_CDE", pStatusCde);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pValidateAcgOrigination(NString pAidyCode,NNumber pPidm,NString pFundCode,NString pDocumentId,NString pCitzInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("REKCE08.P_VALIDATE_ACG_ORIGINATION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_DOCUMENT_ID", pDocumentId);
			cmd.addParameter("@P_CITZ_IND", pCitzInd);
				
			cmd.execute();


		}
		
		public static void pValidatePersonInfo(NString pAddressType,NString pAddress,NString pCity,NString pZip,NString pDriverLicNo,NString pPhoneNo,NString pCitzInd,Ref<NString> pState,Ref<NString> pStatCodeLic,Ref<NString> pNatnCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("REKCE08.P_VALIDATE_PERSON_INFO", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ADDRESS_TYPE", pAddressType);
			cmd.addParameter("@P_ADDRESS", pAddress);
			cmd.addParameter("@P_CITY", pCity);
			cmd.addParameter("@P_ZIP", pZip);
			cmd.addParameter("@P_DRIVER_LIC_NO", pDriverLicNo);
			cmd.addParameter("@P_PHONE_NO", pPhoneNo);
			cmd.addParameter("@P_CITZ_IND", pCitzInd);
			cmd.addParameter("@P_STATE", pState, true);
			cmd.addParameter("@P_STAT_CODE_LIC", pStatCodeLic, true);
			cmd.addParameter("@P_NATN_CODE", pNatnCode, true);
				
			cmd.execute();
			pState.val = cmd.getParameterValue("@P_STATE", NString.class);
			pStatCodeLic.val = cmd.getParameterValue("@P_STAT_CODE_LIC", NString.class);
			pNatnCode.val = cmd.getParameterValue("@P_NATN_CODE", NString.class);


		}
		
		public static void pValidateSmartOrigination(NString pAidyCode,NNumber pPidm,NString pFundCode,NString pDocumentId,NString pCitzInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("REKCE08.P_VALIDATE_SMART_ORIGINATION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_DOCUMENT_ID", pDocumentId);
			cmd.addParameter("@P_CITZ_IND", pCitzInd);
				
			cmd.execute();


		}
		
	
	
	
}
