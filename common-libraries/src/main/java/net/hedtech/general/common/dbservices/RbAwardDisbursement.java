package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class RbAwardDisbursement {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_AWARD_DISBURSEMENT.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_AWARD_DISBURSEMENT.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(AwardDisbursementRecRow recOne,AwardDisbursementRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_AWARD_DISBURSEMENT.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, AwardDisbursementRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, AwardDisbursementRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NString pAidyCode,NNumber pPidm,NDate pScheduleDate,NString pFundCode,NString pPeriod) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_AWARD_DISBURSEMENT.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SCHEDULE_DATE", pScheduleDate);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_PERIOD", pPeriod);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_AWARD_DISBURSEMENT.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NString pAidyCode,NNumber pPidm,NDate pScheduleDate,NString pFundCode,NString pPeriod) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_AWARD_DISBURSEMENT.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SCHEDULE_DATE", pScheduleDate);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_PERIOD", pPeriod);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NString pAidyCode,NNumber pPidm,NDate pScheduleDate,NString pFundCode,NString pPeriod) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_AWARD_DISBURSEMENT.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SCHEDULE_DATE", pScheduleDate);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_PERIOD", pPeriod);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NString pAidyCode,NNumber pPidm,NDate pScheduleDate,NString pFundCode,NString pPeriod,NNumber pScheduleAmt,NDate pDisburseDate,NNumber pDisburseAmt,NNumber pTranNumber,NNumber pDisbursePct,NString pDisburseLoad,NString pDisburseLoadOpt,NString pLmsFeedInd,NNumber pPellCalcDisbAmt,NString pPellcDisbLoad,NString pPellcDisbLoadOpt,NString pDisbBatchNo,NNumber pDisbRefNo,NString pDebitCrInd,NNumber pDisbAmt,NString pDisbActionCode,NNumber pDisbAckRefNo,NString pDisbAcptDebitCrInd,NNumber pDisbAcptAmt,NDate pDisbAcptDate,NNumber pYtdAmtPaid,NString pEditRej01,NString pEditRej02,NString pEditRej03,NString pEditRej04,NString pEditRej05,NString pEditRej06,NString pEditRej07,NString pEditRej08,NString pEditRej09,NString pEditRej10,NString pEditRej11,NString pEditRej12,NString pEditRej13,NString pEditRej14,NString pEditRej15,NString pEditRej16,NString pEditRej17,NString pEditRej18,NString pEditRej19,NString pEditRej20,NString pEditRej21,NString pEditRej22,NString pEditRej23,NString pEditRej24,NString pEditRej25,NString pSharedSarIdFlag,NString pVerifWStatusFlag,NString pConcurEnrollFlag,NString pPotentialOverpmtFlag,NString pOrigId,NString pInstXref,NDate pDisbDateSent,NDate pDisbDate,NDate pPayPdStartDate,NDate pAcptPayPdStartDate,NString pDisbLockInd,NString pAlternatePellInd,NString pUserId,NNumber pDisbSeqNo,NNumber pAcptDisbSeqNo,NString pDocumentId,NNumber pDisbNetAmt,NNumber pAcptPrevDisbSeqNo,NNumber pDisbSchedNoDays,NString pSysInd,NString pDataOrigin,NString pCpsVerInd,NString pHighestCpsTranNo,NString pExclFromNetAmt,NString pEditField1,NString pEditValue1,NString pEditField2,NString pEditValue2,NString pEditField3,NString pEditValue3,NString pEditField4,NString pEditValue4,NString pEditField5,NString pEditValue5,NString pCipCode,NNumber pPercentEligUsed,NNumber pPellLeu,NString pTermCode,NString pEnrollmentSchoolCde,NString pDateChangeInd,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_AWARD_DISBURSEMENT.P_CREATE", DbManager.getDataBaseFactory());
			
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
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_AWARD_DISBURSEMENT.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_AWARD_DISBURSEMENT.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NString pAidyCode,NNumber pPidm,NDate pScheduleDate,NString pFundCode,NString pPeriod,NNumber pScheduleAmt,NDate pDisburseDate,NNumber pDisburseAmt,NNumber pTranNumber,NNumber pDisbursePct,NString pDisburseLoad,NString pDisburseLoadOpt,NString pLmsFeedInd,NNumber pPellCalcDisbAmt,NString pPellcDisbLoad,NString pPellcDisbLoadOpt,NString pDisbBatchNo,NNumber pDisbRefNo,NString pDebitCrInd,NNumber pDisbAmt,NString pDisbActionCode,NNumber pDisbAckRefNo,NString pDisbAcptDebitCrInd,NNumber pDisbAcptAmt,NDate pDisbAcptDate,NNumber pYtdAmtPaid,NString pEditRej01,NString pEditRej02,NString pEditRej03,NString pEditRej04,NString pEditRej05,NString pEditRej06,NString pEditRej07,NString pEditRej08,NString pEditRej09,NString pEditRej10,NString pEditRej11,NString pEditRej12,NString pEditRej13,NString pEditRej14,NString pEditRej15,NString pEditRej16,NString pEditRej17,NString pEditRej18,NString pEditRej19,NString pEditRej20,NString pEditRej21,NString pEditRej22,NString pEditRej23,NString pEditRej24,NString pEditRej25,NString pSharedSarIdFlag,NString pVerifWStatusFlag,NString pConcurEnrollFlag,NString pPotentialOverpmtFlag,NString pOrigId,NString pInstXref,NDate pDisbDateSent,NDate pDisbDate,NDate pPayPdStartDate,NDate pAcptPayPdStartDate,NString pDisbLockInd,NString pAlternatePellInd,NString pUserId,NNumber pDisbSeqNo,NNumber pAcptDisbSeqNo,NString pDocumentId,NNumber pDisbNetAmt,NNumber pAcptPrevDisbSeqNo,NNumber pDisbSchedNoDays,NString pSysInd,NString pDataOrigin,NString pCpsVerInd,NString pHighestCpsTranNo,NString pExclFromNetAmt,NString pEditField1,NString pEditValue1,NString pEditField2,NString pEditValue2,NString pEditField3,NString pEditValue3,NString pEditField4,NString pEditValue4,NString pEditField5,NString pEditValue5,NString pCipCode,NNumber pPercentEligUsed,NNumber pPellLeu,NString pTermCode,NString pEnrollmentSchoolCde,NString pDateChangeInd,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_AWARD_DISBURSEMENT.P_UPDATE", DbManager.getDataBaseFactory());
			
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
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="AwardDisbursementRecRow", dataSourceName="AWARD_DISBURSEMENT_REC")
	public static class AwardDisbursementRecRow
	{
		@DbRecordField(dataSourceName="R_AIDY_CODE")
		public NString RAidyCode;
		@DbRecordField(dataSourceName="R_PIDM")
		public NNumber RPidm;
		@DbRecordField(dataSourceName="R_SCHEDULE_DATE")
		public NDate RScheduleDate;
		@DbRecordField(dataSourceName="R_FUND_CODE")
		public NString RFundCode;
		@DbRecordField(dataSourceName="R_PERIOD")
		public NString RPeriod;
		@DbRecordField(dataSourceName="R_SCHEDULE_AMT")
		public NNumber RScheduleAmt;
		@DbRecordField(dataSourceName="R_DISBURSE_DATE")
		public NDate RDisburseDate;
		@DbRecordField(dataSourceName="R_DISBURSE_AMT")
		public NNumber RDisburseAmt;
		@DbRecordField(dataSourceName="R_TRAN_NUMBER")
		public NNumber RTranNumber;
		@DbRecordField(dataSourceName="R_DISBURSE_PCT")
		public NNumber RDisbursePct;
		@DbRecordField(dataSourceName="R_DISBURSE_LOAD")
		public NString RDisburseLoad;
		@DbRecordField(dataSourceName="R_DISBURSE_LOAD_OPT")
		public NString RDisburseLoadOpt;
		@DbRecordField(dataSourceName="R_LMS_FEED_IND")
		public NString RLmsFeedInd;
		@DbRecordField(dataSourceName="R_PELL_CALC_DISB_AMT")
		public NNumber RPellCalcDisbAmt;
		@DbRecordField(dataSourceName="R_PELLC_DISB_LOAD")
		public NString RPellcDisbLoad;
		@DbRecordField(dataSourceName="R_PELLC_DISB_LOAD_OPT")
		public NString RPellcDisbLoadOpt;
		@DbRecordField(dataSourceName="R_DISB_BATCH_NO")
		public NString RDisbBatchNo;
		@DbRecordField(dataSourceName="R_DISB_REF_NO")
		public NNumber RDisbRefNo;
		@DbRecordField(dataSourceName="R_DEBIT_CR_IND")
		public NString RDebitCrInd;
		@DbRecordField(dataSourceName="R_DISB_AMT")
		public NNumber RDisbAmt;
		@DbRecordField(dataSourceName="R_DISB_ACTION_CODE")
		public NString RDisbActionCode;
		@DbRecordField(dataSourceName="R_DISB_ACK_REF_NO")
		public NNumber RDisbAckRefNo;
		@DbRecordField(dataSourceName="R_DISB_ACPT_DEBIT_CR_IND")
		public NString RDisbAcptDebitCrInd;
		@DbRecordField(dataSourceName="R_DISB_ACPT_AMT")
		public NNumber RDisbAcptAmt;
		@DbRecordField(dataSourceName="R_DISB_ACPT_DATE")
		public NDate RDisbAcptDate;
		@DbRecordField(dataSourceName="R_YTD_AMT_PAID")
		public NNumber RYtdAmtPaid;
		@DbRecordField(dataSourceName="R_EDIT_REJ_01")
		public NString REditRej01;
		@DbRecordField(dataSourceName="R_EDIT_REJ_02")
		public NString REditRej02;
		@DbRecordField(dataSourceName="R_EDIT_REJ_03")
		public NString REditRej03;
		@DbRecordField(dataSourceName="R_EDIT_REJ_04")
		public NString REditRej04;
		@DbRecordField(dataSourceName="R_EDIT_REJ_05")
		public NString REditRej05;
		@DbRecordField(dataSourceName="R_EDIT_REJ_06")
		public NString REditRej06;
		@DbRecordField(dataSourceName="R_EDIT_REJ_07")
		public NString REditRej07;
		@DbRecordField(dataSourceName="R_EDIT_REJ_08")
		public NString REditRej08;
		@DbRecordField(dataSourceName="R_EDIT_REJ_09")
		public NString REditRej09;
		@DbRecordField(dataSourceName="R_EDIT_REJ_10")
		public NString REditRej10;
		@DbRecordField(dataSourceName="R_EDIT_REJ_11")
		public NString REditRej11;
		@DbRecordField(dataSourceName="R_EDIT_REJ_12")
		public NString REditRej12;
		@DbRecordField(dataSourceName="R_EDIT_REJ_13")
		public NString REditRej13;
		@DbRecordField(dataSourceName="R_EDIT_REJ_14")
		public NString REditRej14;
		@DbRecordField(dataSourceName="R_EDIT_REJ_15")
		public NString REditRej15;
		@DbRecordField(dataSourceName="R_EDIT_REJ_16")
		public NString REditRej16;
		@DbRecordField(dataSourceName="R_EDIT_REJ_17")
		public NString REditRej17;
		@DbRecordField(dataSourceName="R_EDIT_REJ_18")
		public NString REditRej18;
		@DbRecordField(dataSourceName="R_EDIT_REJ_19")
		public NString REditRej19;
		@DbRecordField(dataSourceName="R_EDIT_REJ_20")
		public NString REditRej20;
		@DbRecordField(dataSourceName="R_EDIT_REJ_21")
		public NString REditRej21;
		@DbRecordField(dataSourceName="R_EDIT_REJ_22")
		public NString REditRej22;
		@DbRecordField(dataSourceName="R_EDIT_REJ_23")
		public NString REditRej23;
		@DbRecordField(dataSourceName="R_EDIT_REJ_24")
		public NString REditRej24;
		@DbRecordField(dataSourceName="R_EDIT_REJ_25")
		public NString REditRej25;
		@DbRecordField(dataSourceName="R_SHARED_SAR_ID_FLAG")
		public NString RSharedSarIdFlag;
		@DbRecordField(dataSourceName="R_VERIF_W_STATUS_FLAG")
		public NString RVerifWStatusFlag;
		@DbRecordField(dataSourceName="R_CONCUR_ENROLL_FLAG")
		public NString RConcurEnrollFlag;
		@DbRecordField(dataSourceName="R_POTENTIAL_OVERPMT_FLAG")
		public NString RPotentialOverpmtFlag;
		@DbRecordField(dataSourceName="R_ORIG_ID")
		public NString ROrigId;
		@DbRecordField(dataSourceName="R_INST_XREF")
		public NString RInstXref;
		@DbRecordField(dataSourceName="R_DISB_DATE_SENT")
		public NDate RDisbDateSent;
		@DbRecordField(dataSourceName="R_DISB_DATE")
		public NDate RDisbDate;
		@DbRecordField(dataSourceName="R_PAY_PD_START_DATE")
		public NDate RPayPdStartDate;
		@DbRecordField(dataSourceName="R_ACPT_PAY_PD_START_DATE")
		public NDate RAcptPayPdStartDate;
		@DbRecordField(dataSourceName="R_DISB_LOCK_IND")
		public NString RDisbLockInd;
		@DbRecordField(dataSourceName="R_ALTERNATE_PELL_IND")
		public NString RAlternatePellInd;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_DISB_SEQ_NO")
		public NNumber RDisbSeqNo;
		@DbRecordField(dataSourceName="R_ACPT_DISB_SEQ_NO")
		public NNumber RAcptDisbSeqNo;
		@DbRecordField(dataSourceName="R_DOCUMENT_ID")
		public NString RDocumentId;
		@DbRecordField(dataSourceName="R_DISB_NET_AMT")
		public NNumber RDisbNetAmt;
		@DbRecordField(dataSourceName="R_ACPT_PREV_DISB_SEQ_NO")
		public NNumber RAcptPrevDisbSeqNo;
		@DbRecordField(dataSourceName="R_DISB_SCHED_NO_DAYS")
		public NNumber RDisbSchedNoDays;
		@DbRecordField(dataSourceName="R_SYS_IND")
		public NString RSysInd;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_CPS_VER_IND")
		public NString RCpsVerInd;
		@DbRecordField(dataSourceName="R_HIGHEST_CPS_TRAN_NO")
		public NString RHighestCpsTranNo;
		@DbRecordField(dataSourceName="R_EXCL_FROM_NET_AMT")
		public NString RExclFromNetAmt;
		@DbRecordField(dataSourceName="R_EDIT_FIELD_1")
		public NString REditField1;
		@DbRecordField(dataSourceName="R_EDIT_VALUE_1")
		public NString REditValue1;
		@DbRecordField(dataSourceName="R_EDIT_FIELD_2")
		public NString REditField2;
		@DbRecordField(dataSourceName="R_EDIT_VALUE_2")
		public NString REditValue2;
		@DbRecordField(dataSourceName="R_EDIT_FIELD_3")
		public NString REditField3;
		@DbRecordField(dataSourceName="R_EDIT_VALUE_3")
		public NString REditValue3;
		@DbRecordField(dataSourceName="R_EDIT_FIELD_4")
		public NString REditField4;
		@DbRecordField(dataSourceName="R_EDIT_VALUE_4")
		public NString REditValue4;
		@DbRecordField(dataSourceName="R_EDIT_FIELD_5")
		public NString REditField5;
		@DbRecordField(dataSourceName="R_EDIT_VALUE_5")
		public NString REditValue5;
		@DbRecordField(dataSourceName="R_CIP_CODE")
		public NString RCipCode;
		@DbRecordField(dataSourceName="R_PERCENT_ELIG_USED")
		public NNumber RPercentEligUsed;
		@DbRecordField(dataSourceName="R_PELL_LEU")
		public NNumber RPellLeu;
		@DbRecordField(dataSourceName="R_TERM_CODE")
		public NString RTermCode;
		@DbRecordField(dataSourceName="R_ENROLLMENT_SCHOOL_CDE")
		public NString REnrollmentSchoolCde;
		@DbRecordField(dataSourceName="R_DATE_CHANGE_IND")
		public NString RDateChangeInd;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
