package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class RbAwardDisbursementRules {
		public static NString fParentExists(NString pAidyCode,NNumber pPidm,NString pFundCode,NString pPeriod) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_AWARD_DISBURSEMENT_RULES.F_PARENT_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_PERIOD", pPeriod);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fTermDateExists(NString pAidyCode,NNumber pPidm,NString pFundCode,NString pPeriod,NDate pScheduleDate,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_AWARD_DISBURSEMENT_RULES.F_TERM_DATE_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_PERIOD", pPeriod);
			cmd.addParameter("@P_SCHEDULE_DATE", pScheduleDate);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_AWARD_DISBURSEMENT_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NString pAidyCode,NNumber pPidm,NDate pScheduleDate,NString pFundCode,NString pPeriod,NNumber pScheduleAmt,NDate pDisburseDate,NNumber pDisburseAmt,NNumber pTranNumber,NNumber pDisbursePct,NString pDisburseLoad,NString pDisburseLoadOpt,NString pLmsFeedInd,NNumber pPellCalcDisbAmt,NString pPellcDisbLoad,NString pPellcDisbLoadOpt,NString pDisbBatchNo,NNumber pDisbRefNo,NString pDebitCrInd,NNumber pDisbAmt,NString pDisbActionCode,NNumber pDisbAckRefNo,NString pDisbAcptDebitCrInd,NNumber pDisbAcptAmt,NDate pDisbAcptDate,NNumber pYtdAmtPaid,NString pEditRej01,NString pEditRej02,NString pEditRej03,NString pEditRej04,NString pEditRej05,NString pEditRej06,NString pEditRej07,NString pEditRej08,NString pEditRej09,NString pEditRej10,NString pEditRej11,NString pEditRej12,NString pEditRej13,NString pEditRej14,NString pEditRej15,NString pEditRej16,NString pEditRej17,NString pEditRej18,NString pEditRej19,NString pEditRej20,NString pEditRej21,NString pEditRej22,NString pEditRej23,NString pEditRej24,NString pEditRej25,NString pSharedSarIdFlag,NString pVerifWStatusFlag,NString pConcurEnrollFlag,NString pPotentialOverpmtFlag,NString pOrigId,NString pInstXref,NDate pDisbDateSent,NDate pDisbDate,NDate pPayPdStartDate,NDate pAcptPayPdStartDate,NString pDisbLockInd,NString pAlternatePellInd,NString pUserId,NNumber pDisbSeqNo,NNumber pAcptDisbSeqNo,NString pDocumentId,NNumber pDisbNetAmt,NNumber pAcptPrevDisbSeqNo,NNumber pDisbSchedNoDays,NString pSysInd,NString pDataOrigin,NString pCpsVerInd,NString pHighestCpsTranNo,NString pExclFromNetAmt,NString pEditField1,NString pEditValue1,NString pEditField2,NString pEditValue2,NString pEditField3,NString pEditValue3,NString pEditField4,NString pEditValue4,NString pEditField5,NString pEditValue5,NString pCipCode,NNumber pPercentEligUsed,NNumber pPellLeu,NString pTermCode,NString pEnrollmentSchoolCde,NString pDateChangeInd,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_AWARD_DISBURSEMENT_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SCHEDULE_DATE", pScheduleDate);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_PERIOD", pPeriod);
			cmd.addParameter("@P_SCHEDULE_AMT", pScheduleAmt);
			cmd.addParameter("@P_DISBURSE_DATE", pDisburseDate);
			cmd.addParameter("@P_DISBURSE_AMT", pDisburseAmt);
			cmd.addParameter("@P_TRAN_NUMBER", pTranNumber);
			cmd.addParameter("@P_DISBURSE_PCT", pDisbursePct);
			cmd.addParameter("@P_DISBURSE_LOAD", pDisburseLoad);
			cmd.addParameter("@P_DISBURSE_LOAD_OPT", pDisburseLoadOpt);
			cmd.addParameter("@P_LMS_FEED_IND", pLmsFeedInd);
			cmd.addParameter("@P_PELL_CALC_DISB_AMT", pPellCalcDisbAmt);
			cmd.addParameter("@P_PELLC_DISB_LOAD", pPellcDisbLoad);
			cmd.addParameter("@P_PELLC_DISB_LOAD_OPT", pPellcDisbLoadOpt);
			cmd.addParameter("@P_DISB_BATCH_NO", pDisbBatchNo);
			cmd.addParameter("@P_DISB_REF_NO", pDisbRefNo);
			cmd.addParameter("@P_DEBIT_CR_IND", pDebitCrInd);
			cmd.addParameter("@P_DISB_AMT", pDisbAmt);
			cmd.addParameter("@P_DISB_ACTION_CODE", pDisbActionCode);
			cmd.addParameter("@P_DISB_ACK_REF_NO", pDisbAckRefNo);
			cmd.addParameter("@P_DISB_ACPT_DEBIT_CR_IND", pDisbAcptDebitCrInd);
			cmd.addParameter("@P_DISB_ACPT_AMT", pDisbAcptAmt);
			cmd.addParameter("@P_DISB_ACPT_DATE", pDisbAcptDate);
			cmd.addParameter("@P_YTD_AMT_PAID", pYtdAmtPaid);
			cmd.addParameter("@P_EDIT_REJ_01", pEditRej01);
			cmd.addParameter("@P_EDIT_REJ_02", pEditRej02);
			cmd.addParameter("@P_EDIT_REJ_03", pEditRej03);
			cmd.addParameter("@P_EDIT_REJ_04", pEditRej04);
			cmd.addParameter("@P_EDIT_REJ_05", pEditRej05);
			cmd.addParameter("@P_EDIT_REJ_06", pEditRej06);
			cmd.addParameter("@P_EDIT_REJ_07", pEditRej07);
			cmd.addParameter("@P_EDIT_REJ_08", pEditRej08);
			cmd.addParameter("@P_EDIT_REJ_09", pEditRej09);
			cmd.addParameter("@P_EDIT_REJ_10", pEditRej10);
			cmd.addParameter("@P_EDIT_REJ_11", pEditRej11);
			cmd.addParameter("@P_EDIT_REJ_12", pEditRej12);
			cmd.addParameter("@P_EDIT_REJ_13", pEditRej13);
			cmd.addParameter("@P_EDIT_REJ_14", pEditRej14);
			cmd.addParameter("@P_EDIT_REJ_15", pEditRej15);
			cmd.addParameter("@P_EDIT_REJ_16", pEditRej16);
			cmd.addParameter("@P_EDIT_REJ_17", pEditRej17);
			cmd.addParameter("@P_EDIT_REJ_18", pEditRej18);
			cmd.addParameter("@P_EDIT_REJ_19", pEditRej19);
			cmd.addParameter("@P_EDIT_REJ_20", pEditRej20);
			cmd.addParameter("@P_EDIT_REJ_21", pEditRej21);
			cmd.addParameter("@P_EDIT_REJ_22", pEditRej22);
			cmd.addParameter("@P_EDIT_REJ_23", pEditRej23);
			cmd.addParameter("@P_EDIT_REJ_24", pEditRej24);
			cmd.addParameter("@P_EDIT_REJ_25", pEditRej25);
			cmd.addParameter("@P_SHARED_SAR_ID_FLAG", pSharedSarIdFlag);
			cmd.addParameter("@P_VERIF_W_STATUS_FLAG", pVerifWStatusFlag);
			cmd.addParameter("@P_CONCUR_ENROLL_FLAG", pConcurEnrollFlag);
			cmd.addParameter("@P_POTENTIAL_OVERPMT_FLAG", pPotentialOverpmtFlag);
			cmd.addParameter("@P_ORIG_ID", pOrigId);
			cmd.addParameter("@P_INST_XREF", pInstXref);
			cmd.addParameter("@P_DISB_DATE_SENT", pDisbDateSent);
			cmd.addParameter("@P_DISB_DATE", pDisbDate);
			cmd.addParameter("@P_PAY_PD_START_DATE", pPayPdStartDate);
			cmd.addParameter("@P_ACPT_PAY_PD_START_DATE", pAcptPayPdStartDate);
			cmd.addParameter("@P_DISB_LOCK_IND", pDisbLockInd);
			cmd.addParameter("@P_ALTERNATE_PELL_IND", pAlternatePellInd);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DISB_SEQ_NO", pDisbSeqNo);
			cmd.addParameter("@P_ACPT_DISB_SEQ_NO", pAcptDisbSeqNo);
			cmd.addParameter("@P_DOCUMENT_ID", pDocumentId);
			cmd.addParameter("@P_DISB_NET_AMT", pDisbNetAmt);
			cmd.addParameter("@P_ACPT_PREV_DISB_SEQ_NO", pAcptPrevDisbSeqNo);
			cmd.addParameter("@P_DISB_SCHED_NO_DAYS", pDisbSchedNoDays);
			cmd.addParameter("@P_SYS_IND", pSysInd);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_CPS_VER_IND", pCpsVerInd);
			cmd.addParameter("@P_HIGHEST_CPS_TRAN_NO", pHighestCpsTranNo);
			cmd.addParameter("@P_EXCL_FROM_NET_AMT", pExclFromNetAmt);
			cmd.addParameter("@P_EDIT_FIELD_1", pEditField1);
			cmd.addParameter("@P_EDIT_VALUE_1", pEditValue1);
			cmd.addParameter("@P_EDIT_FIELD_2", pEditField2);
			cmd.addParameter("@P_EDIT_VALUE_2", pEditValue2);
			cmd.addParameter("@P_EDIT_FIELD_3", pEditField3);
			cmd.addParameter("@P_EDIT_VALUE_3", pEditValue3);
			cmd.addParameter("@P_EDIT_FIELD_4", pEditField4);
			cmd.addParameter("@P_EDIT_VALUE_4", pEditValue4);
			cmd.addParameter("@P_EDIT_FIELD_5", pEditField5);
			cmd.addParameter("@P_EDIT_VALUE_5", pEditValue5);
			cmd.addParameter("@P_CIP_CODE", pCipCode);
			cmd.addParameter("@P_PERCENT_ELIG_USED", pPercentEligUsed);
			cmd.addParameter("@P_PELL_LEU", pPellLeu);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_ENROLLMENT_SCHOOL_CDE", pEnrollmentSchoolCde);
			cmd.addParameter("@P_DATE_CHANGE_IND", pDateChangeInd);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NString pAidyCode,NNumber pPidm,NDate pScheduleDate,NString pFundCode,NString pPeriod,NNumber pScheduleAmt,NDate pDisburseDate,NNumber pDisburseAmt,NNumber pTranNumber,NNumber pDisbursePct,NString pDisburseLoad,NString pDisburseLoadOpt,NString pLmsFeedInd,NNumber pPellCalcDisbAmt,NString pPellcDisbLoad,NString pPellcDisbLoadOpt,NString pDisbBatchNo,NNumber pDisbRefNo,NString pDebitCrInd,NNumber pDisbAmt,NString pDisbActionCode,NNumber pDisbAckRefNo,NString pDisbAcptDebitCrInd,NNumber pDisbAcptAmt,NDate pDisbAcptDate,NNumber pYtdAmtPaid,NString pEditRej01,NString pEditRej02,NString pEditRej03,NString pEditRej04,NString pEditRej05,NString pEditRej06,NString pEditRej07,NString pEditRej08,NString pEditRej09,NString pEditRej10,NString pEditRej11,NString pEditRej12,NString pEditRej13,NString pEditRej14,NString pEditRej15,NString pEditRej16,NString pEditRej17,NString pEditRej18,NString pEditRej19,NString pEditRej20,NString pEditRej21,NString pEditRej22,NString pEditRej23,NString pEditRej24,NString pEditRej25,NString pSharedSarIdFlag,NString pVerifWStatusFlag,NString pConcurEnrollFlag,NString pPotentialOverpmtFlag,NString pOrigId,NString pInstXref,NDate pDisbDateSent,NDate pDisbDate,NDate pPayPdStartDate,NDate pAcptPayPdStartDate,NString pDisbLockInd,NString pAlternatePellInd,NString pUserId,NNumber pDisbSeqNo,NNumber pAcptDisbSeqNo,NString pDocumentId,NNumber pDisbNetAmt,NNumber pAcptPrevDisbSeqNo,NNumber pDisbSchedNoDays,NString pSysInd,NString pDataOrigin,NString pCpsVerInd,NString pHighestCpsTranNo,NString pExclFromNetAmt,NString pEditField1,NString pEditValue1,NString pEditField2,NString pEditValue2,NString pEditField3,NString pEditValue3,NString pEditField4,NString pEditValue4,NString pEditField5,NString pEditValue5,NString pCipCode,NNumber pPercentEligUsed,NNumber pPellLeu,NString pTermCode,NString pEnrollmentSchoolCde,NString pDateChangeInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_AWARD_DISBURSEMENT_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SCHEDULE_DATE", pScheduleDate);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_PERIOD", pPeriod);
			cmd.addParameter("@P_SCHEDULE_AMT", pScheduleAmt);
			cmd.addParameter("@P_DISBURSE_DATE", pDisburseDate);
			cmd.addParameter("@P_DISBURSE_AMT", pDisburseAmt);
			cmd.addParameter("@P_TRAN_NUMBER", pTranNumber);
			cmd.addParameter("@P_DISBURSE_PCT", pDisbursePct);
			cmd.addParameter("@P_DISBURSE_LOAD", pDisburseLoad);
			cmd.addParameter("@P_DISBURSE_LOAD_OPT", pDisburseLoadOpt);
			cmd.addParameter("@P_LMS_FEED_IND", pLmsFeedInd);
			cmd.addParameter("@P_PELL_CALC_DISB_AMT", pPellCalcDisbAmt);
			cmd.addParameter("@P_PELLC_DISB_LOAD", pPellcDisbLoad);
			cmd.addParameter("@P_PELLC_DISB_LOAD_OPT", pPellcDisbLoadOpt);
			cmd.addParameter("@P_DISB_BATCH_NO", pDisbBatchNo);
			cmd.addParameter("@P_DISB_REF_NO", pDisbRefNo);
			cmd.addParameter("@P_DEBIT_CR_IND", pDebitCrInd);
			cmd.addParameter("@P_DISB_AMT", pDisbAmt);
			cmd.addParameter("@P_DISB_ACTION_CODE", pDisbActionCode);
			cmd.addParameter("@P_DISB_ACK_REF_NO", pDisbAckRefNo);
			cmd.addParameter("@P_DISB_ACPT_DEBIT_CR_IND", pDisbAcptDebitCrInd);
			cmd.addParameter("@P_DISB_ACPT_AMT", pDisbAcptAmt);
			cmd.addParameter("@P_DISB_ACPT_DATE", pDisbAcptDate);
			cmd.addParameter("@P_YTD_AMT_PAID", pYtdAmtPaid);
			cmd.addParameter("@P_EDIT_REJ_01", pEditRej01);
			cmd.addParameter("@P_EDIT_REJ_02", pEditRej02);
			cmd.addParameter("@P_EDIT_REJ_03", pEditRej03);
			cmd.addParameter("@P_EDIT_REJ_04", pEditRej04);
			cmd.addParameter("@P_EDIT_REJ_05", pEditRej05);
			cmd.addParameter("@P_EDIT_REJ_06", pEditRej06);
			cmd.addParameter("@P_EDIT_REJ_07", pEditRej07);
			cmd.addParameter("@P_EDIT_REJ_08", pEditRej08);
			cmd.addParameter("@P_EDIT_REJ_09", pEditRej09);
			cmd.addParameter("@P_EDIT_REJ_10", pEditRej10);
			cmd.addParameter("@P_EDIT_REJ_11", pEditRej11);
			cmd.addParameter("@P_EDIT_REJ_12", pEditRej12);
			cmd.addParameter("@P_EDIT_REJ_13", pEditRej13);
			cmd.addParameter("@P_EDIT_REJ_14", pEditRej14);
			cmd.addParameter("@P_EDIT_REJ_15", pEditRej15);
			cmd.addParameter("@P_EDIT_REJ_16", pEditRej16);
			cmd.addParameter("@P_EDIT_REJ_17", pEditRej17);
			cmd.addParameter("@P_EDIT_REJ_18", pEditRej18);
			cmd.addParameter("@P_EDIT_REJ_19", pEditRej19);
			cmd.addParameter("@P_EDIT_REJ_20", pEditRej20);
			cmd.addParameter("@P_EDIT_REJ_21", pEditRej21);
			cmd.addParameter("@P_EDIT_REJ_22", pEditRej22);
			cmd.addParameter("@P_EDIT_REJ_23", pEditRej23);
			cmd.addParameter("@P_EDIT_REJ_24", pEditRej24);
			cmd.addParameter("@P_EDIT_REJ_25", pEditRej25);
			cmd.addParameter("@P_SHARED_SAR_ID_FLAG", pSharedSarIdFlag);
			cmd.addParameter("@P_VERIF_W_STATUS_FLAG", pVerifWStatusFlag);
			cmd.addParameter("@P_CONCUR_ENROLL_FLAG", pConcurEnrollFlag);
			cmd.addParameter("@P_POTENTIAL_OVERPMT_FLAG", pPotentialOverpmtFlag);
			cmd.addParameter("@P_ORIG_ID", pOrigId);
			cmd.addParameter("@P_INST_XREF", pInstXref);
			cmd.addParameter("@P_DISB_DATE_SENT", pDisbDateSent);
			cmd.addParameter("@P_DISB_DATE", pDisbDate);
			cmd.addParameter("@P_PAY_PD_START_DATE", pPayPdStartDate);
			cmd.addParameter("@P_ACPT_PAY_PD_START_DATE", pAcptPayPdStartDate);
			cmd.addParameter("@P_DISB_LOCK_IND", pDisbLockInd);
			cmd.addParameter("@P_ALTERNATE_PELL_IND", pAlternatePellInd);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DISB_SEQ_NO", pDisbSeqNo);
			cmd.addParameter("@P_ACPT_DISB_SEQ_NO", pAcptDisbSeqNo);
			cmd.addParameter("@P_DOCUMENT_ID", pDocumentId);
			cmd.addParameter("@P_DISB_NET_AMT", pDisbNetAmt);
			cmd.addParameter("@P_ACPT_PREV_DISB_SEQ_NO", pAcptPrevDisbSeqNo);
			cmd.addParameter("@P_DISB_SCHED_NO_DAYS", pDisbSchedNoDays);
			cmd.addParameter("@P_SYS_IND", pSysInd);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_CPS_VER_IND", pCpsVerInd);
			cmd.addParameter("@P_HIGHEST_CPS_TRAN_NO", pHighestCpsTranNo);
			cmd.addParameter("@P_EXCL_FROM_NET_AMT", pExclFromNetAmt);
			cmd.addParameter("@P_EDIT_FIELD_1", pEditField1);
			cmd.addParameter("@P_EDIT_VALUE_1", pEditValue1);
			cmd.addParameter("@P_EDIT_FIELD_2", pEditField2);
			cmd.addParameter("@P_EDIT_VALUE_2", pEditValue2);
			cmd.addParameter("@P_EDIT_FIELD_3", pEditField3);
			cmd.addParameter("@P_EDIT_VALUE_3", pEditValue3);
			cmd.addParameter("@P_EDIT_FIELD_4", pEditField4);
			cmd.addParameter("@P_EDIT_VALUE_4", pEditValue4);
			cmd.addParameter("@P_EDIT_FIELD_5", pEditField5);
			cmd.addParameter("@P_EDIT_VALUE_5", pEditValue5);
			cmd.addParameter("@P_CIP_CODE", pCipCode);
			cmd.addParameter("@P_PERCENT_ELIG_USED", pPercentEligUsed);
			cmd.addParameter("@P_PELL_LEU", pPellLeu);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_ENROLLMENT_SCHOOL_CDE", pEnrollmentSchoolCde);
			cmd.addParameter("@P_DATE_CHANGE_IND", pDateChangeInd);
				
			cmd.execute();


		}
		
		public static void pValidateDate(NString pAidyCode,NNumber pPidm,NString pFundCode,NString pPeriod,NDate pScheduleDate,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_AWARD_DISBURSEMENT_RULES.P_VALIDATE_DATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_PERIOD", pPeriod);
			cmd.addParameter("@P_SCHEDULE_DATE", pScheduleDate);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	
}
