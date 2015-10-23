package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class RbGrantOrigination {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_GRANT_ORIGINATION.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NString pAidyCode,NNumber pPidm,NString pFundCode,NNumber pIntSeqNo,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_GRANT_ORIGINATION.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_INT_SEQ_NO", pIntSeqNo);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(GrantOriginationRecRow recOne,GrantOriginationRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_GRANT_ORIGINATION.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, GrantOriginationRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, GrantOriginationRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NString pAidyCode,NNumber pPidm,NString pFundCode,NNumber pIntSeqNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_GRANT_ORIGINATION.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_INT_SEQ_NO", pIntSeqNo);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_GRANT_ORIGINATION.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NString pAidyCode,NNumber pPidm,NString pFundCode,NNumber pIntSeqNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_GRANT_ORIGINATION.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_INT_SEQ_NO", pIntSeqNo);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NString pAidyCode,NNumber pPidm,NString pFundCode,NNumber pIntSeqNo,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_GRANT_ORIGINATION.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_INT_SEQ_NO", pIntSeqNo);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NString pAidyCode,NNumber pPidm,NString pFundCode,NNumber pIntSeqNo,NString pAwardId,NString pFedFundId,NString pGrantType,NString pCampPellId,NString pInstPellId,NString pYrInColl,NString pSarTranNo,NNumber pAwardAmount,NDate pEnrollmentDate,NString pLockInd,NString pConcurEnrollFlag,NString pUserId,NString pDataOrigin,NString pStatusCde,NDate pDateSent,NString pDocumentId,NString pAttendingId,NString pReportingId,NString pSourceId,NString pInstXref,NString pPayReasonCde,NString pHsProgramCode,NString pCipCode,NNumber pYtdAmtPaid,NNumber pNegPendingAmt,NNumber pAcptIntSeqNo,NString pAcptYrInColl,NString pAcptSarTranNo,NDate pAcptEnrollmentDate,NNumber pAcptAwardAmount,NString pAcptPayReasonCde,NString pAcptHsProgramCode,NString pAcptCipCode,NString pEditRej1,NString pEditRej2,NString pEditRej3,NString pEditRej4,NString pEditRej5,NString pEditField1,NString pEditField2,NString pEditField3,NString pEditField4,NString pEditField5,NString pEditValue1,NString pEditValue2,NString pEditValue3,NString pEditValue4,NString pEditValue5,NNumber pPercentEligUsed,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_GRANT_ORIGINATION.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_INT_SEQ_NO", pIntSeqNo);
			cmd.addParameter("@P_AWARD_ID", pAwardId);
			cmd.addParameter("@P_FED_FUND_ID", pFedFundId);
			cmd.addParameter("@P_GRANT_TYPE", pGrantType);
			cmd.addParameter("@P_CAMP_PELL_ID", pCampPellId);
			cmd.addParameter("@P_INST_PELL_ID", pInstPellId);
			cmd.addParameter("@P_YR_IN_COLL", pYrInColl);
			cmd.addParameter("@P_SAR_TRAN_NO", pSarTranNo);
			cmd.addParameter("@P_AWARD_AMOUNT", pAwardAmount);
			cmd.addParameter("@P_ENROLLMENT_DATE", pEnrollmentDate);
			cmd.addParameter("@P_LOCK_IND", pLockInd);
			cmd.addParameter("@P_CONCUR_ENROLL_FLAG", pConcurEnrollFlag);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_STATUS_CDE", pStatusCde);
			cmd.addParameter("@P_DATE_SENT", pDateSent);
			cmd.addParameter("@P_DOCUMENT_ID", pDocumentId);
			cmd.addParameter("@P_ATTENDING_ID", pAttendingId);
			cmd.addParameter("@P_REPORTING_ID", pReportingId);
			cmd.addParameter("@P_SOURCE_ID", pSourceId);
			cmd.addParameter("@P_INST_XREF", pInstXref);
			cmd.addParameter("@P_PAY_REASON_CDE", pPayReasonCde);
			cmd.addParameter("@P_HS_PROGRAM_CODE", pHsProgramCode);
			cmd.addParameter("@P_CIP_CODE", pCipCode);
			cmd.addParameter("@P_YTD_AMT_PAID", pYtdAmtPaid);
			cmd.addParameter("@P_NEG_PENDING_AMT", pNegPendingAmt);
			cmd.addParameter("@P_ACPT_INT_SEQ_NO", pAcptIntSeqNo);
			cmd.addParameter("@P_ACPT_YR_IN_COLL", pAcptYrInColl);
			cmd.addParameter("@P_ACPT_SAR_TRAN_NO", pAcptSarTranNo);
			cmd.addParameter("@P_ACPT_ENROLLMENT_DATE", pAcptEnrollmentDate);
			cmd.addParameter("@P_ACPT_AWARD_AMOUNT", pAcptAwardAmount);
			cmd.addParameter("@P_ACPT_PAY_REASON_CDE", pAcptPayReasonCde);
			cmd.addParameter("@P_ACPT_HS_PROGRAM_CODE", pAcptHsProgramCode);
			cmd.addParameter("@P_ACPT_CIP_CODE", pAcptCipCode);
			cmd.addParameter("@P_EDIT_REJ_1", pEditRej1);
			cmd.addParameter("@P_EDIT_REJ_2", pEditRej2);
			cmd.addParameter("@P_EDIT_REJ_3", pEditRej3);
			cmd.addParameter("@P_EDIT_REJ_4", pEditRej4);
			cmd.addParameter("@P_EDIT_REJ_5", pEditRej5);
			cmd.addParameter("@P_EDIT_FIELD_1", pEditField1);
			cmd.addParameter("@P_EDIT_FIELD_2", pEditField2);
			cmd.addParameter("@P_EDIT_FIELD_3", pEditField3);
			cmd.addParameter("@P_EDIT_FIELD_4", pEditField4);
			cmd.addParameter("@P_EDIT_FIELD_5", pEditField5);
			cmd.addParameter("@P_EDIT_VALUE_1", pEditValue1);
			cmd.addParameter("@P_EDIT_VALUE_2", pEditValue2);
			cmd.addParameter("@P_EDIT_VALUE_3", pEditValue3);
			cmd.addParameter("@P_EDIT_VALUE_4", pEditValue4);
			cmd.addParameter("@P_EDIT_VALUE_5", pEditValue5);
			cmd.addParameter("@P_PERCENT_ELIG_USED", pPercentEligUsed);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NString pAidyCode,NNumber pPidm,NString pFundCode,NNumber pIntSeqNo,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_GRANT_ORIGINATION.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_INT_SEQ_NO", pIntSeqNo);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NString pAidyCode,NNumber pPidm,NString pFundCode,NNumber pIntSeqNo,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_GRANT_ORIGINATION.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_INT_SEQ_NO", pIntSeqNo);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NString pAidyCode,NNumber pPidm,NString pFundCode,NNumber pIntSeqNo,NString pAwardId,NString pFedFundId,NString pGrantType,NString pCampPellId,NString pInstPellId,NString pYrInColl,NString pSarTranNo,NNumber pAwardAmount,NDate pEnrollmentDate,NString pLockInd,NString pConcurEnrollFlag,NString pUserId,NString pDataOrigin,NString pStatusCde,NDate pDateSent,NString pDocumentId,NString pAttendingId,NString pReportingId,NString pSourceId,NString pInstXref,NString pPayReasonCde,NString pHsProgramCode,NString pCipCode,NNumber pYtdAmtPaid,NNumber pNegPendingAmt,NNumber pAcptIntSeqNo,NString pAcptYrInColl,NString pAcptSarTranNo,NDate pAcptEnrollmentDate,NNumber pAcptAwardAmount,NString pAcptPayReasonCde,NString pAcptHsProgramCode,NString pAcptCipCode,NString pEditRej1,NString pEditRej2,NString pEditRej3,NString pEditRej4,NString pEditRej5,NString pEditField1,NString pEditField2,NString pEditField3,NString pEditField4,NString pEditField5,NString pEditValue1,NString pEditValue2,NString pEditValue3,NString pEditValue4,NString pEditValue5,NNumber pPercentEligUsed,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_GRANT_ORIGINATION.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_INT_SEQ_NO", pIntSeqNo);
			cmd.addParameter("@P_AWARD_ID", pAwardId);
			cmd.addParameter("@P_FED_FUND_ID", pFedFundId);
			cmd.addParameter("@P_GRANT_TYPE", pGrantType);
			cmd.addParameter("@P_CAMP_PELL_ID", pCampPellId);
			cmd.addParameter("@P_INST_PELL_ID", pInstPellId);
			cmd.addParameter("@P_YR_IN_COLL", pYrInColl);
			cmd.addParameter("@P_SAR_TRAN_NO", pSarTranNo);
			cmd.addParameter("@P_AWARD_AMOUNT", pAwardAmount);
			cmd.addParameter("@P_ENROLLMENT_DATE", pEnrollmentDate);
			cmd.addParameter("@P_LOCK_IND", pLockInd);
			cmd.addParameter("@P_CONCUR_ENROLL_FLAG", pConcurEnrollFlag);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_STATUS_CDE", pStatusCde);
			cmd.addParameter("@P_DATE_SENT", pDateSent);
			cmd.addParameter("@P_DOCUMENT_ID", pDocumentId);
			cmd.addParameter("@P_ATTENDING_ID", pAttendingId);
			cmd.addParameter("@P_REPORTING_ID", pReportingId);
			cmd.addParameter("@P_SOURCE_ID", pSourceId);
			cmd.addParameter("@P_INST_XREF", pInstXref);
			cmd.addParameter("@P_PAY_REASON_CDE", pPayReasonCde);
			cmd.addParameter("@P_HS_PROGRAM_CODE", pHsProgramCode);
			cmd.addParameter("@P_CIP_CODE", pCipCode);
			cmd.addParameter("@P_YTD_AMT_PAID", pYtdAmtPaid);
			cmd.addParameter("@P_NEG_PENDING_AMT", pNegPendingAmt);
			cmd.addParameter("@P_ACPT_INT_SEQ_NO", pAcptIntSeqNo);
			cmd.addParameter("@P_ACPT_YR_IN_COLL", pAcptYrInColl);
			cmd.addParameter("@P_ACPT_SAR_TRAN_NO", pAcptSarTranNo);
			cmd.addParameter("@P_ACPT_ENROLLMENT_DATE", pAcptEnrollmentDate);
			cmd.addParameter("@P_ACPT_AWARD_AMOUNT", pAcptAwardAmount);
			cmd.addParameter("@P_ACPT_PAY_REASON_CDE", pAcptPayReasonCde);
			cmd.addParameter("@P_ACPT_HS_PROGRAM_CODE", pAcptHsProgramCode);
			cmd.addParameter("@P_ACPT_CIP_CODE", pAcptCipCode);
			cmd.addParameter("@P_EDIT_REJ_1", pEditRej1);
			cmd.addParameter("@P_EDIT_REJ_2", pEditRej2);
			cmd.addParameter("@P_EDIT_REJ_3", pEditRej3);
			cmd.addParameter("@P_EDIT_REJ_4", pEditRej4);
			cmd.addParameter("@P_EDIT_REJ_5", pEditRej5);
			cmd.addParameter("@P_EDIT_FIELD_1", pEditField1);
			cmd.addParameter("@P_EDIT_FIELD_2", pEditField2);
			cmd.addParameter("@P_EDIT_FIELD_3", pEditField3);
			cmd.addParameter("@P_EDIT_FIELD_4", pEditField4);
			cmd.addParameter("@P_EDIT_FIELD_5", pEditField5);
			cmd.addParameter("@P_EDIT_VALUE_1", pEditValue1);
			cmd.addParameter("@P_EDIT_VALUE_2", pEditValue2);
			cmd.addParameter("@P_EDIT_VALUE_3", pEditValue3);
			cmd.addParameter("@P_EDIT_VALUE_4", pEditValue4);
			cmd.addParameter("@P_EDIT_VALUE_5", pEditValue5);
			cmd.addParameter("@P_PERCENT_ELIG_USED", pPercentEligUsed);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="GrantOriginationRecRow", dataSourceName="GRANT_ORIGINATION_REC")
	public static class GrantOriginationRecRow
	{
		@DbRecordField(dataSourceName="R_AIDY_CODE")
		public NString RAidyCode;
		@DbRecordField(dataSourceName="R_PIDM")
		public NNumber RPidm;
		@DbRecordField(dataSourceName="R_FUND_CODE")
		public NString RFundCode;
		@DbRecordField(dataSourceName="R_INT_SEQ_NO")
		public NNumber RIntSeqNo;
		@DbRecordField(dataSourceName="R_AWARD_ID")
		public NString RAwardId;
		@DbRecordField(dataSourceName="R_FED_FUND_ID")
		public NString RFedFundId;
		@DbRecordField(dataSourceName="R_GRANT_TYPE")
		public NString RGrantType;
		@DbRecordField(dataSourceName="R_CAMP_PELL_ID")
		public NString RCampPellId;
		@DbRecordField(dataSourceName="R_INST_PELL_ID")
		public NString RInstPellId;
		@DbRecordField(dataSourceName="R_YR_IN_COLL")
		public NString RYrInColl;
		@DbRecordField(dataSourceName="R_SAR_TRAN_NO")
		public NString RSarTranNo;
		@DbRecordField(dataSourceName="R_AWARD_AMOUNT")
		public NNumber RAwardAmount;
		@DbRecordField(dataSourceName="R_ENROLLMENT_DATE")
		public NDate REnrollmentDate;
		@DbRecordField(dataSourceName="R_LOCK_IND")
		public NString RLockInd;
		@DbRecordField(dataSourceName="R_CONCUR_ENROLL_FLAG")
		public NString RConcurEnrollFlag;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_STATUS_CDE")
		public NString RStatusCde;
		@DbRecordField(dataSourceName="R_DATE_SENT")
		public NDate RDateSent;
		@DbRecordField(dataSourceName="R_DOCUMENT_ID")
		public NString RDocumentId;
		@DbRecordField(dataSourceName="R_ATTENDING_ID")
		public NString RAttendingId;
		@DbRecordField(dataSourceName="R_REPORTING_ID")
		public NString RReportingId;
		@DbRecordField(dataSourceName="R_SOURCE_ID")
		public NString RSourceId;
		@DbRecordField(dataSourceName="R_INST_XREF")
		public NString RInstXref;
		@DbRecordField(dataSourceName="R_PAY_REASON_CDE")
		public NString RPayReasonCde;
		@DbRecordField(dataSourceName="R_HS_PROGRAM_CODE")
		public NString RHsProgramCode;
		@DbRecordField(dataSourceName="R_CIP_CODE")
		public NString RCipCode;
		@DbRecordField(dataSourceName="R_YTD_AMT_PAID")
		public NNumber RYtdAmtPaid;
		@DbRecordField(dataSourceName="R_NEG_PENDING_AMT")
		public NNumber RNegPendingAmt;
		@DbRecordField(dataSourceName="R_ACPT_INT_SEQ_NO")
		public NNumber RAcptIntSeqNo;
		@DbRecordField(dataSourceName="R_ACPT_YR_IN_COLL")
		public NString RAcptYrInColl;
		@DbRecordField(dataSourceName="R_ACPT_SAR_TRAN_NO")
		public NString RAcptSarTranNo;
		@DbRecordField(dataSourceName="R_ACPT_ENROLLMENT_DATE")
		public NDate RAcptEnrollmentDate;
		@DbRecordField(dataSourceName="R_ACPT_AWARD_AMOUNT")
		public NNumber RAcptAwardAmount;
		@DbRecordField(dataSourceName="R_ACPT_PAY_REASON_CDE")
		public NString RAcptPayReasonCde;
		@DbRecordField(dataSourceName="R_ACPT_HS_PROGRAM_CODE")
		public NString RAcptHsProgramCode;
		@DbRecordField(dataSourceName="R_ACPT_CIP_CODE")
		public NString RAcptCipCode;
		@DbRecordField(dataSourceName="R_EDIT_REJ_1")
		public NString REditRej1;
		@DbRecordField(dataSourceName="R_EDIT_REJ_2")
		public NString REditRej2;
		@DbRecordField(dataSourceName="R_EDIT_REJ_3")
		public NString REditRej3;
		@DbRecordField(dataSourceName="R_EDIT_REJ_4")
		public NString REditRej4;
		@DbRecordField(dataSourceName="R_EDIT_REJ_5")
		public NString REditRej5;
		@DbRecordField(dataSourceName="R_EDIT_FIELD_1")
		public NString REditField1;
		@DbRecordField(dataSourceName="R_EDIT_FIELD_2")
		public NString REditField2;
		@DbRecordField(dataSourceName="R_EDIT_FIELD_3")
		public NString REditField3;
		@DbRecordField(dataSourceName="R_EDIT_FIELD_4")
		public NString REditField4;
		@DbRecordField(dataSourceName="R_EDIT_FIELD_5")
		public NString REditField5;
		@DbRecordField(dataSourceName="R_EDIT_VALUE_1")
		public NString REditValue1;
		@DbRecordField(dataSourceName="R_EDIT_VALUE_2")
		public NString REditValue2;
		@DbRecordField(dataSourceName="R_EDIT_VALUE_3")
		public NString REditValue3;
		@DbRecordField(dataSourceName="R_EDIT_VALUE_4")
		public NString REditValue4;
		@DbRecordField(dataSourceName="R_EDIT_VALUE_5")
		public NString REditValue5;
		@DbRecordField(dataSourceName="R_PERCENT_ELIG_USED")
		public NNumber RPercentEligUsed;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
