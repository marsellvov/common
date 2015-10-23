package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class RbPellOriginations {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_PELL_ORIGINATIONS.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NString pAidyCode,NNumber pPidm,NDate pDateSent,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_PELL_ORIGINATIONS.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_DATE_SENT", pDateSent);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(PellOriginationsRecRow recOne,PellOriginationsRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_PELL_ORIGINATIONS.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, PellOriginationsRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, PellOriginationsRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NString pAidyCode,NNumber pPidm,NDate pDateSent) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_PELL_ORIGINATIONS.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_DATE_SENT", pDateSent);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_PELL_ORIGINATIONS.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NString pAidyCode,NNumber pPidm,NDate pDateSent) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_PELL_ORIGINATIONS.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_DATE_SENT", pDateSent);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NString pAidyCode,NNumber pPidm,NDate pDateSent,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_PELL_ORIGINATIONS.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_DATE_SENT", pDateSent);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NString pAidyCode,NNumber pPidm,NString pCampPellId,NString pInstPellId,NString pAcadCal,NDate pDateSent,NNumber pAttendCost,NString pEnrollStatus,NNumber pExpectHrs,NNumber pHrsInYr,NNumber pAmtPaid,NNumber pAmtDue,NNumber pNbrMthsPay,NString pInstXref,NString pSecondaryPgiUsed,NNumber pPgi,NString pPrisonInd,NString pVerStatus,NString pSarSsn,NString pSarInit,NString pSarTranNo,NString pPaymentMethod,NNumber pExpectWks,NNumber pWksInYr,NDate pEnrollmentDate,NDate pEstDisbDate01,NDate pEstDisbDate02,NDate pEstDisbDate03,NDate pEstDisbDate04,NDate pEstDisbDate05,NDate pEstDisbDate06,NDate pEstDisbDate07,NDate pEstDisbDate08,NDate pEstDisbDate09,NDate pEstDisbDate10,NDate pEstDisbDate11,NDate pEstDisbDate12,NDate pEstDisbDate13,NDate pEstDisbDate14,NDate pEstDisbDate15,NString pLowCostCde,NString pOrigBatchNo,NString pOrigId,NString pStatusCde,NNumber pAcptNbrMthsPay,NNumber pAcptAmtDue,NDate pAcptEstDisbDate01,NDate pAcptEstDisbDate02,NDate pAcptEstDisbDate03,NDate pAcptEstDisbDate04,NDate pAcptEstDisbDate05,NDate pAcptEstDisbDate06,NDate pAcptEstDisbDate07,NDate pAcptEstDisbDate08,NDate pAcptEstDisbDate09,NDate pAcptEstDisbDate10,NDate pAcptEstDisbDate11,NDate pAcptEstDisbDate12,NDate pAcptEstDisbDate13,NDate pAcptEstDisbDate14,NDate pAcptEstDisbDate15,NDate pAcptEnrollmentDate,NString pAcptLowCostCde,NString pAcptVerStatus,NString pAcptPrisonInd,NString pAcptSarTranNo,NNumber pAcptPgi,NString pAcptSecPgiUsed,NString pAcptAcadCal,NString pAcptPaymentMethod,NNumber pAcptAttendCost,NString pAcptEnrollStatus,NNumber pAcptExpectWks,NNumber pAcptWksInYr,NNumber pAcptExpectHrs,NNumber pAcptHrsInYr,NNumber pSchPellGrant,NString pPrevAcptSarTranNo,NNumber pPrevAcptEfc,NString pPrevAcptSecEfcCde,NNumber pPrevAcptAttendCost,NString pEditRej01,NString pEditRej02,NString pEditRej03,NString pEditRej04,NString pEditRej05,NString pEditRej06,NString pEditRej07,NString pEditRej08,NString pEditRej09,NString pEditRej10,NString pEditRej11,NString pEditRej12,NString pEditRej13,NString pEditRej14,NString pEditRej15,NString pEditRej16,NString pEditRej17,NString pEditRej18,NString pEditRej19,NString pEditRej20,NString pEditRej21,NString pEditRej22,NString pEditRej23,NString pEditRej24,NString pEditRej25,NString pSharedSarIdFlag,NString pVerifWStatusFlag,NString pConcurEnrollFlag,NString pPotentialOverpmtFlag,NString pLockInd,NNumber pLowTuitionCost,NNumber pIntSeqNo,NNumber pAcptIntSeqNo,NString pCurrentSsn,NDate pCurrentBirthDate,NString pCurrentLastName,NString pCurrentFirstName,NString pCurrentMi,NNumber pNegPendingAmt,NNumber pSecEfc,NString pAcptCurrentSsn,NDate pAcptBirthDate,NString pAcptLastName,NString pAcptFirstName,NString pAcptMi,NString pDocumentId,NString pUserId,NString pDataOrigin,NString pEditField1,NString pEditValue1,NString pEditField2,NString pEditValue2,NString pEditField3,NString pEditValue3,NString pEditField4,NString pEditValue4,NString pEditField5,NString pEditValue5,NNumber pPercentEligUsed,NString pAddlEligInd,NString pAcptAddlEligInd,NNumber pPellLeu,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_PELL_ORIGINATIONS.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_CAMP_PELL_ID", pCampPellId);
			cmd.addParameter("@P_INST_PELL_ID", pInstPellId);
			cmd.addParameter("@P_ACAD_CAL", pAcadCal);
			cmd.addParameter("@P_DATE_SENT", pDateSent);
			cmd.addParameter("@P_ATTEND_COST", pAttendCost);
			cmd.addParameter("@P_ENROLL_STATUS", pEnrollStatus);
			cmd.addParameter("@P_EXPECT_HRS", pExpectHrs);
			cmd.addParameter("@P_HRS_IN_YR", pHrsInYr);
			cmd.addParameter("@P_AMT_PAID", pAmtPaid);
			cmd.addParameter("@P_AMT_DUE", pAmtDue);
			cmd.addParameter("@P_NBR_MTHS_PAY", pNbrMthsPay);
			cmd.addParameter("@P_INST_XREF", pInstXref);
			cmd.addParameter("@P_SECONDARY_PGI_USED", pSecondaryPgiUsed);
			cmd.addParameter("@P_PGI", pPgi);
			cmd.addParameter("@P_PRISON_IND", pPrisonInd);
			cmd.addParameter("@P_VER_STATUS", pVerStatus);
			cmd.addParameter("@P_SAR_SSN", pSarSsn);
			cmd.addParameter("@P_SAR_INIT", pSarInit);
			cmd.addParameter("@P_SAR_TRAN_NO", pSarTranNo);
			cmd.addParameter("@P_PAYMENT_METHOD", pPaymentMethod);
			cmd.addParameter("@P_EXPECT_WKS", pExpectWks);
			cmd.addParameter("@P_WKS_IN_YR", pWksInYr);
			cmd.addParameter("@P_ENROLLMENT_DATE", pEnrollmentDate);
			cmd.addParameter("@P_EST_DISB_DATE_01", pEstDisbDate01);
			cmd.addParameter("@P_EST_DISB_DATE_02", pEstDisbDate02);
			cmd.addParameter("@P_EST_DISB_DATE_03", pEstDisbDate03);
			cmd.addParameter("@P_EST_DISB_DATE_04", pEstDisbDate04);
			cmd.addParameter("@P_EST_DISB_DATE_05", pEstDisbDate05);
			cmd.addParameter("@P_EST_DISB_DATE_06", pEstDisbDate06);
			cmd.addParameter("@P_EST_DISB_DATE_07", pEstDisbDate07);
			cmd.addParameter("@P_EST_DISB_DATE_08", pEstDisbDate08);
			cmd.addParameter("@P_EST_DISB_DATE_09", pEstDisbDate09);
			cmd.addParameter("@P_EST_DISB_DATE_10", pEstDisbDate10);
			cmd.addParameter("@P_EST_DISB_DATE_11", pEstDisbDate11);
			cmd.addParameter("@P_EST_DISB_DATE_12", pEstDisbDate12);
			cmd.addParameter("@P_EST_DISB_DATE_13", pEstDisbDate13);
			cmd.addParameter("@P_EST_DISB_DATE_14", pEstDisbDate14);
			cmd.addParameter("@P_EST_DISB_DATE_15", pEstDisbDate15);
			cmd.addParameter("@P_LOW_COST_CDE", pLowCostCde);
			cmd.addParameter("@P_ORIG_BATCH_NO", pOrigBatchNo);
			cmd.addParameter("@P_ORIG_ID", pOrigId);
			cmd.addParameter("@P_STATUS_CDE", pStatusCde);
			cmd.addParameter("@P_ACPT_NBR_MTHS_PAY", pAcptNbrMthsPay);
			cmd.addParameter("@P_ACPT_AMT_DUE", pAcptAmtDue);
			cmd.addParameter("@P_ACPT_EST_DISB_DATE_01", pAcptEstDisbDate01);
			cmd.addParameter("@P_ACPT_EST_DISB_DATE_02", pAcptEstDisbDate02);
			cmd.addParameter("@P_ACPT_EST_DISB_DATE_03", pAcptEstDisbDate03);
			cmd.addParameter("@P_ACPT_EST_DISB_DATE_04", pAcptEstDisbDate04);
			cmd.addParameter("@P_ACPT_EST_DISB_DATE_05", pAcptEstDisbDate05);
			cmd.addParameter("@P_ACPT_EST_DISB_DATE_06", pAcptEstDisbDate06);
			cmd.addParameter("@P_ACPT_EST_DISB_DATE_07", pAcptEstDisbDate07);
			cmd.addParameter("@P_ACPT_EST_DISB_DATE_08", pAcptEstDisbDate08);
			cmd.addParameter("@P_ACPT_EST_DISB_DATE_09", pAcptEstDisbDate09);
			cmd.addParameter("@P_ACPT_EST_DISB_DATE_10", pAcptEstDisbDate10);
			cmd.addParameter("@P_ACPT_EST_DISB_DATE_11", pAcptEstDisbDate11);
			cmd.addParameter("@P_ACPT_EST_DISB_DATE_12", pAcptEstDisbDate12);
			cmd.addParameter("@P_ACPT_EST_DISB_DATE_13", pAcptEstDisbDate13);
			cmd.addParameter("@P_ACPT_EST_DISB_DATE_14", pAcptEstDisbDate14);
			cmd.addParameter("@P_ACPT_EST_DISB_DATE_15", pAcptEstDisbDate15);
			cmd.addParameter("@P_ACPT_ENROLLMENT_DATE", pAcptEnrollmentDate);
			cmd.addParameter("@P_ACPT_LOW_COST_CDE", pAcptLowCostCde);
			cmd.addParameter("@P_ACPT_VER_STATUS", pAcptVerStatus);
			cmd.addParameter("@P_ACPT_PRISON_IND", pAcptPrisonInd);
			cmd.addParameter("@P_ACPT_SAR_TRAN_NO", pAcptSarTranNo);
			cmd.addParameter("@P_ACPT_PGI", pAcptPgi);
			cmd.addParameter("@P_ACPT_SEC_PGI_USED", pAcptSecPgiUsed);
			cmd.addParameter("@P_ACPT_ACAD_CAL", pAcptAcadCal);
			cmd.addParameter("@P_ACPT_PAYMENT_METHOD", pAcptPaymentMethod);
			cmd.addParameter("@P_ACPT_ATTEND_COST", pAcptAttendCost);
			cmd.addParameter("@P_ACPT_ENROLL_STATUS", pAcptEnrollStatus);
			cmd.addParameter("@P_ACPT_EXPECT_WKS", pAcptExpectWks);
			cmd.addParameter("@P_ACPT_WKS_IN_YR", pAcptWksInYr);
			cmd.addParameter("@P_ACPT_EXPECT_HRS", pAcptExpectHrs);
			cmd.addParameter("@P_ACPT_HRS_IN_YR", pAcptHrsInYr);
			cmd.addParameter("@P_SCH_PELL_GRANT", pSchPellGrant);
			cmd.addParameter("@P_PREV_ACPT_SAR_TRAN_NO", pPrevAcptSarTranNo);
			cmd.addParameter("@P_PREV_ACPT_EFC", pPrevAcptEfc);
			cmd.addParameter("@P_PREV_ACPT_SEC_EFC_CDE", pPrevAcptSecEfcCde);
			cmd.addParameter("@P_PREV_ACPT_ATTEND_COST", pPrevAcptAttendCost);
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
			cmd.addParameter("@P_LOCK_IND", pLockInd);
			cmd.addParameter("@P_LOW_TUITION_COST", pLowTuitionCost);
			cmd.addParameter("@P_INT_SEQ_NO", pIntSeqNo);
			cmd.addParameter("@P_ACPT_INT_SEQ_NO", pAcptIntSeqNo);
			cmd.addParameter("@P_CURRENT_SSN", pCurrentSsn);
			cmd.addParameter("@P_CURRENT_BIRTH_DATE", pCurrentBirthDate);
			cmd.addParameter("@P_CURRENT_LAST_NAME", pCurrentLastName);
			cmd.addParameter("@P_CURRENT_FIRST_NAME", pCurrentFirstName);
			cmd.addParameter("@P_CURRENT_MI", pCurrentMi);
			cmd.addParameter("@P_NEG_PENDING_AMT", pNegPendingAmt);
			cmd.addParameter("@P_SEC_EFC", pSecEfc);
			cmd.addParameter("@P_ACPT_CURRENT_SSN", pAcptCurrentSsn);
			cmd.addParameter("@P_ACPT_BIRTH_DATE", pAcptBirthDate);
			cmd.addParameter("@P_ACPT_LAST_NAME", pAcptLastName);
			cmd.addParameter("@P_ACPT_FIRST_NAME", pAcptFirstName);
			cmd.addParameter("@P_ACPT_MI", pAcptMi);
			cmd.addParameter("@P_DOCUMENT_ID", pDocumentId);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
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
			cmd.addParameter("@P_PERCENT_ELIG_USED", pPercentEligUsed);
			cmd.addParameter("@P_ADDL_ELIG_IND", pAddlEligInd);
			cmd.addParameter("@P_ACPT_ADDL_ELIG_IND", pAcptAddlEligInd);
			cmd.addParameter("@P_PELL_LEU", pPellLeu);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NString pAidyCode,NNumber pPidm,NDate pDateSent,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_PELL_ORIGINATIONS.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_DATE_SENT", pDateSent);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NString pAidyCode,NNumber pPidm,NDate pDateSent,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_PELL_ORIGINATIONS.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_DATE_SENT", pDateSent);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NString pAidyCode,NNumber pPidm,NString pCampPellId,NString pInstPellId,NString pAcadCal,NDate pDateSent,NNumber pAttendCost,NString pEnrollStatus,NNumber pExpectHrs,NNumber pHrsInYr,NNumber pAmtPaid,NNumber pAmtDue,NNumber pNbrMthsPay,NString pInstXref,NString pSecondaryPgiUsed,NNumber pPgi,NString pPrisonInd,NString pVerStatus,NString pSarSsn,NString pSarInit,NString pSarTranNo,NString pPaymentMethod,NNumber pExpectWks,NNumber pWksInYr,NDate pEnrollmentDate,NDate pEstDisbDate01,NDate pEstDisbDate02,NDate pEstDisbDate03,NDate pEstDisbDate04,NDate pEstDisbDate05,NDate pEstDisbDate06,NDate pEstDisbDate07,NDate pEstDisbDate08,NDate pEstDisbDate09,NDate pEstDisbDate10,NDate pEstDisbDate11,NDate pEstDisbDate12,NDate pEstDisbDate13,NDate pEstDisbDate14,NDate pEstDisbDate15,NString pLowCostCde,NString pOrigBatchNo,NString pOrigId,NString pStatusCde,NNumber pAcptNbrMthsPay,NNumber pAcptAmtDue,NDate pAcptEstDisbDate01,NDate pAcptEstDisbDate02,NDate pAcptEstDisbDate03,NDate pAcptEstDisbDate04,NDate pAcptEstDisbDate05,NDate pAcptEstDisbDate06,NDate pAcptEstDisbDate07,NDate pAcptEstDisbDate08,NDate pAcptEstDisbDate09,NDate pAcptEstDisbDate10,NDate pAcptEstDisbDate11,NDate pAcptEstDisbDate12,NDate pAcptEstDisbDate13,NDate pAcptEstDisbDate14,NDate pAcptEstDisbDate15,NDate pAcptEnrollmentDate,NString pAcptLowCostCde,NString pAcptVerStatus,NString pAcptPrisonInd,NString pAcptSarTranNo,NNumber pAcptPgi,NString pAcptSecPgiUsed,NString pAcptAcadCal,NString pAcptPaymentMethod,NNumber pAcptAttendCost,NString pAcptEnrollStatus,NNumber pAcptExpectWks,NNumber pAcptWksInYr,NNumber pAcptExpectHrs,NNumber pAcptHrsInYr,NNumber pSchPellGrant,NString pPrevAcptSarTranNo,NNumber pPrevAcptEfc,NString pPrevAcptSecEfcCde,NNumber pPrevAcptAttendCost,NString pEditRej01,NString pEditRej02,NString pEditRej03,NString pEditRej04,NString pEditRej05,NString pEditRej06,NString pEditRej07,NString pEditRej08,NString pEditRej09,NString pEditRej10,NString pEditRej11,NString pEditRej12,NString pEditRej13,NString pEditRej14,NString pEditRej15,NString pEditRej16,NString pEditRej17,NString pEditRej18,NString pEditRej19,NString pEditRej20,NString pEditRej21,NString pEditRej22,NString pEditRej23,NString pEditRej24,NString pEditRej25,NString pSharedSarIdFlag,NString pVerifWStatusFlag,NString pConcurEnrollFlag,NString pPotentialOverpmtFlag,NString pLockInd,NNumber pLowTuitionCost,NNumber pIntSeqNo,NNumber pAcptIntSeqNo,NString pCurrentSsn,NDate pCurrentBirthDate,NString pCurrentLastName,NString pCurrentFirstName,NString pCurrentMi,NNumber pNegPendingAmt,NNumber pSecEfc,NString pAcptCurrentSsn,NDate pAcptBirthDate,NString pAcptLastName,NString pAcptFirstName,NString pAcptMi,NString pDocumentId,NString pUserId,NString pDataOrigin,NString pEditField1,NString pEditValue1,NString pEditField2,NString pEditValue2,NString pEditField3,NString pEditValue3,NString pEditField4,NString pEditValue4,NString pEditField5,NString pEditValue5,NNumber pPercentEligUsed,NString pAddlEligInd,NString pAcptAddlEligInd,NNumber pPellLeu,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_PELL_ORIGINATIONS.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_CAMP_PELL_ID", pCampPellId);
			cmd.addParameter("@P_INST_PELL_ID", pInstPellId);
			cmd.addParameter("@P_ACAD_CAL", pAcadCal);
			cmd.addParameter("@P_DATE_SENT", pDateSent);
			cmd.addParameter("@P_ATTEND_COST", pAttendCost);
			cmd.addParameter("@P_ENROLL_STATUS", pEnrollStatus);
			cmd.addParameter("@P_EXPECT_HRS", pExpectHrs);
			cmd.addParameter("@P_HRS_IN_YR", pHrsInYr);
			cmd.addParameter("@P_AMT_PAID", pAmtPaid);
			cmd.addParameter("@P_AMT_DUE", pAmtDue);
			cmd.addParameter("@P_NBR_MTHS_PAY", pNbrMthsPay);
			cmd.addParameter("@P_INST_XREF", pInstXref);
			cmd.addParameter("@P_SECONDARY_PGI_USED", pSecondaryPgiUsed);
			cmd.addParameter("@P_PGI", pPgi);
			cmd.addParameter("@P_PRISON_IND", pPrisonInd);
			cmd.addParameter("@P_VER_STATUS", pVerStatus);
			cmd.addParameter("@P_SAR_SSN", pSarSsn);
			cmd.addParameter("@P_SAR_INIT", pSarInit);
			cmd.addParameter("@P_SAR_TRAN_NO", pSarTranNo);
			cmd.addParameter("@P_PAYMENT_METHOD", pPaymentMethod);
			cmd.addParameter("@P_EXPECT_WKS", pExpectWks);
			cmd.addParameter("@P_WKS_IN_YR", pWksInYr);
			cmd.addParameter("@P_ENROLLMENT_DATE", pEnrollmentDate);
			cmd.addParameter("@P_EST_DISB_DATE_01", pEstDisbDate01);
			cmd.addParameter("@P_EST_DISB_DATE_02", pEstDisbDate02);
			cmd.addParameter("@P_EST_DISB_DATE_03", pEstDisbDate03);
			cmd.addParameter("@P_EST_DISB_DATE_04", pEstDisbDate04);
			cmd.addParameter("@P_EST_DISB_DATE_05", pEstDisbDate05);
			cmd.addParameter("@P_EST_DISB_DATE_06", pEstDisbDate06);
			cmd.addParameter("@P_EST_DISB_DATE_07", pEstDisbDate07);
			cmd.addParameter("@P_EST_DISB_DATE_08", pEstDisbDate08);
			cmd.addParameter("@P_EST_DISB_DATE_09", pEstDisbDate09);
			cmd.addParameter("@P_EST_DISB_DATE_10", pEstDisbDate10);
			cmd.addParameter("@P_EST_DISB_DATE_11", pEstDisbDate11);
			cmd.addParameter("@P_EST_DISB_DATE_12", pEstDisbDate12);
			cmd.addParameter("@P_EST_DISB_DATE_13", pEstDisbDate13);
			cmd.addParameter("@P_EST_DISB_DATE_14", pEstDisbDate14);
			cmd.addParameter("@P_EST_DISB_DATE_15", pEstDisbDate15);
			cmd.addParameter("@P_LOW_COST_CDE", pLowCostCde);
			cmd.addParameter("@P_ORIG_BATCH_NO", pOrigBatchNo);
			cmd.addParameter("@P_ORIG_ID", pOrigId);
			cmd.addParameter("@P_STATUS_CDE", pStatusCde);
			cmd.addParameter("@P_ACPT_NBR_MTHS_PAY", pAcptNbrMthsPay);
			cmd.addParameter("@P_ACPT_AMT_DUE", pAcptAmtDue);
			cmd.addParameter("@P_ACPT_EST_DISB_DATE_01", pAcptEstDisbDate01);
			cmd.addParameter("@P_ACPT_EST_DISB_DATE_02", pAcptEstDisbDate02);
			cmd.addParameter("@P_ACPT_EST_DISB_DATE_03", pAcptEstDisbDate03);
			cmd.addParameter("@P_ACPT_EST_DISB_DATE_04", pAcptEstDisbDate04);
			cmd.addParameter("@P_ACPT_EST_DISB_DATE_05", pAcptEstDisbDate05);
			cmd.addParameter("@P_ACPT_EST_DISB_DATE_06", pAcptEstDisbDate06);
			cmd.addParameter("@P_ACPT_EST_DISB_DATE_07", pAcptEstDisbDate07);
			cmd.addParameter("@P_ACPT_EST_DISB_DATE_08", pAcptEstDisbDate08);
			cmd.addParameter("@P_ACPT_EST_DISB_DATE_09", pAcptEstDisbDate09);
			cmd.addParameter("@P_ACPT_EST_DISB_DATE_10", pAcptEstDisbDate10);
			cmd.addParameter("@P_ACPT_EST_DISB_DATE_11", pAcptEstDisbDate11);
			cmd.addParameter("@P_ACPT_EST_DISB_DATE_12", pAcptEstDisbDate12);
			cmd.addParameter("@P_ACPT_EST_DISB_DATE_13", pAcptEstDisbDate13);
			cmd.addParameter("@P_ACPT_EST_DISB_DATE_14", pAcptEstDisbDate14);
			cmd.addParameter("@P_ACPT_EST_DISB_DATE_15", pAcptEstDisbDate15);
			cmd.addParameter("@P_ACPT_ENROLLMENT_DATE", pAcptEnrollmentDate);
			cmd.addParameter("@P_ACPT_LOW_COST_CDE", pAcptLowCostCde);
			cmd.addParameter("@P_ACPT_VER_STATUS", pAcptVerStatus);
			cmd.addParameter("@P_ACPT_PRISON_IND", pAcptPrisonInd);
			cmd.addParameter("@P_ACPT_SAR_TRAN_NO", pAcptSarTranNo);
			cmd.addParameter("@P_ACPT_PGI", pAcptPgi);
			cmd.addParameter("@P_ACPT_SEC_PGI_USED", pAcptSecPgiUsed);
			cmd.addParameter("@P_ACPT_ACAD_CAL", pAcptAcadCal);
			cmd.addParameter("@P_ACPT_PAYMENT_METHOD", pAcptPaymentMethod);
			cmd.addParameter("@P_ACPT_ATTEND_COST", pAcptAttendCost);
			cmd.addParameter("@P_ACPT_ENROLL_STATUS", pAcptEnrollStatus);
			cmd.addParameter("@P_ACPT_EXPECT_WKS", pAcptExpectWks);
			cmd.addParameter("@P_ACPT_WKS_IN_YR", pAcptWksInYr);
			cmd.addParameter("@P_ACPT_EXPECT_HRS", pAcptExpectHrs);
			cmd.addParameter("@P_ACPT_HRS_IN_YR", pAcptHrsInYr);
			cmd.addParameter("@P_SCH_PELL_GRANT", pSchPellGrant);
			cmd.addParameter("@P_PREV_ACPT_SAR_TRAN_NO", pPrevAcptSarTranNo);
			cmd.addParameter("@P_PREV_ACPT_EFC", pPrevAcptEfc);
			cmd.addParameter("@P_PREV_ACPT_SEC_EFC_CDE", pPrevAcptSecEfcCde);
			cmd.addParameter("@P_PREV_ACPT_ATTEND_COST", pPrevAcptAttendCost);
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
			cmd.addParameter("@P_LOCK_IND", pLockInd);
			cmd.addParameter("@P_LOW_TUITION_COST", pLowTuitionCost);
			cmd.addParameter("@P_INT_SEQ_NO", pIntSeqNo);
			cmd.addParameter("@P_ACPT_INT_SEQ_NO", pAcptIntSeqNo);
			cmd.addParameter("@P_CURRENT_SSN", pCurrentSsn);
			cmd.addParameter("@P_CURRENT_BIRTH_DATE", pCurrentBirthDate);
			cmd.addParameter("@P_CURRENT_LAST_NAME", pCurrentLastName);
			cmd.addParameter("@P_CURRENT_FIRST_NAME", pCurrentFirstName);
			cmd.addParameter("@P_CURRENT_MI", pCurrentMi);
			cmd.addParameter("@P_NEG_PENDING_AMT", pNegPendingAmt);
			cmd.addParameter("@P_SEC_EFC", pSecEfc);
			cmd.addParameter("@P_ACPT_CURRENT_SSN", pAcptCurrentSsn);
			cmd.addParameter("@P_ACPT_BIRTH_DATE", pAcptBirthDate);
			cmd.addParameter("@P_ACPT_LAST_NAME", pAcptLastName);
			cmd.addParameter("@P_ACPT_FIRST_NAME", pAcptFirstName);
			cmd.addParameter("@P_ACPT_MI", pAcptMi);
			cmd.addParameter("@P_DOCUMENT_ID", pDocumentId);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
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
			cmd.addParameter("@P_PERCENT_ELIG_USED", pPercentEligUsed);
			cmd.addParameter("@P_ADDL_ELIG_IND", pAddlEligInd);
			cmd.addParameter("@P_ACPT_ADDL_ELIG_IND", pAcptAddlEligInd);
			cmd.addParameter("@P_PELL_LEU", pPellLeu);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="PellOriginationsRecRow", dataSourceName="PELL_ORIGINATIONS_REC")
	public static class PellOriginationsRecRow
	{
		@DbRecordField(dataSourceName="R_AIDY_CODE")
		public NString RAidyCode;
		@DbRecordField(dataSourceName="R_PIDM")
		public NNumber RPidm;
		@DbRecordField(dataSourceName="R_CAMP_PELL_ID")
		public NString RCampPellId;
		@DbRecordField(dataSourceName="R_INST_PELL_ID")
		public NString RInstPellId;
		@DbRecordField(dataSourceName="R_ACAD_CAL")
		public NString RAcadCal;
		@DbRecordField(dataSourceName="R_DATE_SENT")
		public NDate RDateSent;
		@DbRecordField(dataSourceName="R_ATTEND_COST")
		public NNumber RAttendCost;
		@DbRecordField(dataSourceName="R_ENROLL_STATUS")
		public NString REnrollStatus;
		@DbRecordField(dataSourceName="R_EXPECT_HRS")
		public NNumber RExpectHrs;
		@DbRecordField(dataSourceName="R_HRS_IN_YR")
		public NNumber RHrsInYr;
		@DbRecordField(dataSourceName="R_AMT_PAID")
		public NNumber RAmtPaid;
		@DbRecordField(dataSourceName="R_AMT_DUE")
		public NNumber RAmtDue;
		@DbRecordField(dataSourceName="R_NBR_MTHS_PAY")
		public NNumber RNbrMthsPay;
		@DbRecordField(dataSourceName="R_INST_XREF")
		public NString RInstXref;
		@DbRecordField(dataSourceName="R_SECONDARY_PGI_USED")
		public NString RSecondaryPgiUsed;
		@DbRecordField(dataSourceName="R_PGI")
		public NNumber RPgi;
		@DbRecordField(dataSourceName="R_PRISON_IND")
		public NString RPrisonInd;
		@DbRecordField(dataSourceName="R_VER_STATUS")
		public NString RVerStatus;
		@DbRecordField(dataSourceName="R_SAR_SSN")
		public NString RSarSsn;
		@DbRecordField(dataSourceName="R_SAR_INIT")
		public NString RSarInit;
		@DbRecordField(dataSourceName="R_SAR_TRAN_NO")
		public NString RSarTranNo;
		@DbRecordField(dataSourceName="R_PAYMENT_METHOD")
		public NString RPaymentMethod;
		@DbRecordField(dataSourceName="R_EXPECT_WKS")
		public NNumber RExpectWks;
		@DbRecordField(dataSourceName="R_WKS_IN_YR")
		public NNumber RWksInYr;
		@DbRecordField(dataSourceName="R_ENROLLMENT_DATE")
		public NDate REnrollmentDate;
		@DbRecordField(dataSourceName="R_EST_DISB_DATE_01")
		public NDate REstDisbDate01;
		@DbRecordField(dataSourceName="R_EST_DISB_DATE_02")
		public NDate REstDisbDate02;
		@DbRecordField(dataSourceName="R_EST_DISB_DATE_03")
		public NDate REstDisbDate03;
		@DbRecordField(dataSourceName="R_EST_DISB_DATE_04")
		public NDate REstDisbDate04;
		@DbRecordField(dataSourceName="R_EST_DISB_DATE_05")
		public NDate REstDisbDate05;
		@DbRecordField(dataSourceName="R_EST_DISB_DATE_06")
		public NDate REstDisbDate06;
		@DbRecordField(dataSourceName="R_EST_DISB_DATE_07")
		public NDate REstDisbDate07;
		@DbRecordField(dataSourceName="R_EST_DISB_DATE_08")
		public NDate REstDisbDate08;
		@DbRecordField(dataSourceName="R_EST_DISB_DATE_09")
		public NDate REstDisbDate09;
		@DbRecordField(dataSourceName="R_EST_DISB_DATE_10")
		public NDate REstDisbDate10;
		@DbRecordField(dataSourceName="R_EST_DISB_DATE_11")
		public NDate REstDisbDate11;
		@DbRecordField(dataSourceName="R_EST_DISB_DATE_12")
		public NDate REstDisbDate12;
		@DbRecordField(dataSourceName="R_EST_DISB_DATE_13")
		public NDate REstDisbDate13;
		@DbRecordField(dataSourceName="R_EST_DISB_DATE_14")
		public NDate REstDisbDate14;
		@DbRecordField(dataSourceName="R_EST_DISB_DATE_15")
		public NDate REstDisbDate15;
		@DbRecordField(dataSourceName="R_LOW_COST_CDE")
		public NString RLowCostCde;
		@DbRecordField(dataSourceName="R_ORIG_BATCH_NO")
		public NString ROrigBatchNo;
		@DbRecordField(dataSourceName="R_ORIG_ID")
		public NString ROrigId;
		@DbRecordField(dataSourceName="R_STATUS_CDE")
		public NString RStatusCde;
		@DbRecordField(dataSourceName="R_ACPT_NBR_MTHS_PAY")
		public NNumber RAcptNbrMthsPay;
		@DbRecordField(dataSourceName="R_ACPT_AMT_DUE")
		public NNumber RAcptAmtDue;
		@DbRecordField(dataSourceName="R_ACPT_EST_DISB_DATE_01")
		public NDate RAcptEstDisbDate01;
		@DbRecordField(dataSourceName="R_ACPT_EST_DISB_DATE_02")
		public NDate RAcptEstDisbDate02;
		@DbRecordField(dataSourceName="R_ACPT_EST_DISB_DATE_03")
		public NDate RAcptEstDisbDate03;
		@DbRecordField(dataSourceName="R_ACPT_EST_DISB_DATE_04")
		public NDate RAcptEstDisbDate04;
		@DbRecordField(dataSourceName="R_ACPT_EST_DISB_DATE_05")
		public NDate RAcptEstDisbDate05;
		@DbRecordField(dataSourceName="R_ACPT_EST_DISB_DATE_06")
		public NDate RAcptEstDisbDate06;
		@DbRecordField(dataSourceName="R_ACPT_EST_DISB_DATE_07")
		public NDate RAcptEstDisbDate07;
		@DbRecordField(dataSourceName="R_ACPT_EST_DISB_DATE_08")
		public NDate RAcptEstDisbDate08;
		@DbRecordField(dataSourceName="R_ACPT_EST_DISB_DATE_09")
		public NDate RAcptEstDisbDate09;
		@DbRecordField(dataSourceName="R_ACPT_EST_DISB_DATE_10")
		public NDate RAcptEstDisbDate10;
		@DbRecordField(dataSourceName="R_ACPT_EST_DISB_DATE_11")
		public NDate RAcptEstDisbDate11;
		@DbRecordField(dataSourceName="R_ACPT_EST_DISB_DATE_12")
		public NDate RAcptEstDisbDate12;
		@DbRecordField(dataSourceName="R_ACPT_EST_DISB_DATE_13")
		public NDate RAcptEstDisbDate13;
		@DbRecordField(dataSourceName="R_ACPT_EST_DISB_DATE_14")
		public NDate RAcptEstDisbDate14;
		@DbRecordField(dataSourceName="R_ACPT_EST_DISB_DATE_15")
		public NDate RAcptEstDisbDate15;
		@DbRecordField(dataSourceName="R_ACPT_ENROLLMENT_DATE")
		public NDate RAcptEnrollmentDate;
		@DbRecordField(dataSourceName="R_ACPT_LOW_COST_CDE")
		public NString RAcptLowCostCde;
		@DbRecordField(dataSourceName="R_ACPT_VER_STATUS")
		public NString RAcptVerStatus;
		@DbRecordField(dataSourceName="R_ACPT_PRISON_IND")
		public NString RAcptPrisonInd;
		@DbRecordField(dataSourceName="R_ACPT_SAR_TRAN_NO")
		public NString RAcptSarTranNo;
		@DbRecordField(dataSourceName="R_ACPT_PGI")
		public NNumber RAcptPgi;
		@DbRecordField(dataSourceName="R_ACPT_SEC_PGI_USED")
		public NString RAcptSecPgiUsed;
		@DbRecordField(dataSourceName="R_ACPT_ACAD_CAL")
		public NString RAcptAcadCal;
		@DbRecordField(dataSourceName="R_ACPT_PAYMENT_METHOD")
		public NString RAcptPaymentMethod;
		@DbRecordField(dataSourceName="R_ACPT_ATTEND_COST")
		public NNumber RAcptAttendCost;
		@DbRecordField(dataSourceName="R_ACPT_ENROLL_STATUS")
		public NString RAcptEnrollStatus;
		@DbRecordField(dataSourceName="R_ACPT_EXPECT_WKS")
		public NNumber RAcptExpectWks;
		@DbRecordField(dataSourceName="R_ACPT_WKS_IN_YR")
		public NNumber RAcptWksInYr;
		@DbRecordField(dataSourceName="R_ACPT_EXPECT_HRS")
		public NNumber RAcptExpectHrs;
		@DbRecordField(dataSourceName="R_ACPT_HRS_IN_YR")
		public NNumber RAcptHrsInYr;
		@DbRecordField(dataSourceName="R_SCH_PELL_GRANT")
		public NNumber RSchPellGrant;
		@DbRecordField(dataSourceName="R_PREV_ACPT_SAR_TRAN_NO")
		public NString RPrevAcptSarTranNo;
		@DbRecordField(dataSourceName="R_PREV_ACPT_EFC")
		public NNumber RPrevAcptEfc;
		@DbRecordField(dataSourceName="R_PREV_ACPT_SEC_EFC_CDE")
		public NString RPrevAcptSecEfcCde;
		@DbRecordField(dataSourceName="R_PREV_ACPT_ATTEND_COST")
		public NNumber RPrevAcptAttendCost;
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
		@DbRecordField(dataSourceName="R_LOCK_IND")
		public NString RLockInd;
		@DbRecordField(dataSourceName="R_LOW_TUITION_COST")
		public NNumber RLowTuitionCost;
		@DbRecordField(dataSourceName="R_INT_SEQ_NO")
		public NNumber RIntSeqNo;
		@DbRecordField(dataSourceName="R_ACPT_INT_SEQ_NO")
		public NNumber RAcptIntSeqNo;
		@DbRecordField(dataSourceName="R_CURRENT_SSN")
		public NString RCurrentSsn;
		@DbRecordField(dataSourceName="R_CURRENT_BIRTH_DATE")
		public NDate RCurrentBirthDate;
		@DbRecordField(dataSourceName="R_CURRENT_LAST_NAME")
		public NString RCurrentLastName;
		@DbRecordField(dataSourceName="R_CURRENT_FIRST_NAME")
		public NString RCurrentFirstName;
		@DbRecordField(dataSourceName="R_CURRENT_MI")
		public NString RCurrentMi;
		@DbRecordField(dataSourceName="R_NEG_PENDING_AMT")
		public NNumber RNegPendingAmt;
		@DbRecordField(dataSourceName="R_SEC_EFC")
		public NNumber RSecEfc;
		@DbRecordField(dataSourceName="R_ACPT_CURRENT_SSN")
		public NString RAcptCurrentSsn;
		@DbRecordField(dataSourceName="R_ACPT_BIRTH_DATE")
		public NDate RAcptBirthDate;
		@DbRecordField(dataSourceName="R_ACPT_LAST_NAME")
		public NString RAcptLastName;
		@DbRecordField(dataSourceName="R_ACPT_FIRST_NAME")
		public NString RAcptFirstName;
		@DbRecordField(dataSourceName="R_ACPT_MI")
		public NString RAcptMi;
		@DbRecordField(dataSourceName="R_DOCUMENT_ID")
		public NString RDocumentId;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
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
		@DbRecordField(dataSourceName="R_PERCENT_ELIG_USED")
		public NNumber RPercentEligUsed;
		@DbRecordField(dataSourceName="R_ADDL_ELIG_IND")
		public NString RAddlEligInd;
		@DbRecordField(dataSourceName="R_ACPT_ADDL_ELIG_IND")
		public NString RAcptAddlEligInd;
		@DbRecordField(dataSourceName="R_PELL_LEU")
		public NNumber RPellLeu;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
