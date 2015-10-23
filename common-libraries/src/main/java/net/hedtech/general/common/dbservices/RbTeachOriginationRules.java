package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class RbTeachOriginationRules {
		public static NString fParentExists(NString pAidyCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_TEACH_ORIGINATION_RULES.F_PARENT_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_TEACH_ORIGINATION_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NString pAidyCode,NNumber pPidm,NString pFundCode,NNumber pIntSeqNo,NString pAwardId,NString pFedFundId,NString pGrantType,NString pCampOpeid,NString pCampOpeidBranch,NString pInstOpeid,NString pInstOpeidBranch,NString pYrInColl,NString pSarTranNo,NNumber pAwardAmount,NDate pEnrollmentDate,NString pLockInd,NString pConcurEnrollFlag,NString pStatusCde,NDate pDateSent,NString pDocumentId,NString pAttendingId,NString pReportingId,NString pSourceId,NString pTeachExpertInd,NNumber pYtdAmtPaid,NNumber pNegPendingAmt,NNumber pPercentEligUsed,NNumber pAcptIntSeqNo,NString pAcptYrInColl,NString pAcptSarTranNo,NDate pAcptEnrollmentDate,NNumber pAcptAwardAmount,NString pAcptTeachExpertInd,NString pEditRej1,NString pEditRej2,NString pEditRej3,NString pEditRej4,NString pEditRej5,NString pEditField1,NString pEditField2,NString pEditField3,NString pEditField4,NString pEditField5,NString pEditValue1,NString pEditValue2,NString pEditValue3,NString pEditValue4,NString pEditValue5,NNumber pBookAmt,NDate pBookDate,NString pBookDocumentId,NString pUserId,NString pDataOrigin,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_TEACH_ORIGINATION_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_INT_SEQ_NO", pIntSeqNo);
			cmd.addParameter("@P_AWARD_ID", pAwardId);
			cmd.addParameter("@P_FED_FUND_ID", pFedFundId);
			cmd.addParameter("@P_GRANT_TYPE", pGrantType);
			cmd.addParameter("@P_CAMP_OPEID", pCampOpeid);
			cmd.addParameter("@P_CAMP_OPEID_BRANCH", pCampOpeidBranch);
			cmd.addParameter("@P_INST_OPEID", pInstOpeid);
			cmd.addParameter("@P_INST_OPEID_BRANCH", pInstOpeidBranch);
			cmd.addParameter("@P_YR_IN_COLL", pYrInColl);
			cmd.addParameter("@P_SAR_TRAN_NO", pSarTranNo);
			cmd.addParameter("@P_AWARD_AMOUNT", pAwardAmount);
			cmd.addParameter("@P_ENROLLMENT_DATE", pEnrollmentDate);
			cmd.addParameter("@P_LOCK_IND", pLockInd);
			cmd.addParameter("@P_CONCUR_ENROLL_FLAG", pConcurEnrollFlag);
			cmd.addParameter("@P_STATUS_CDE", pStatusCde);
			cmd.addParameter("@P_DATE_SENT", pDateSent);
			cmd.addParameter("@P_DOCUMENT_ID", pDocumentId);
			cmd.addParameter("@P_ATTENDING_ID", pAttendingId);
			cmd.addParameter("@P_REPORTING_ID", pReportingId);
			cmd.addParameter("@P_SOURCE_ID", pSourceId);
			cmd.addParameter("@P_TEACH_EXPERT_IND", pTeachExpertInd);
			cmd.addParameter("@P_YTD_AMT_PAID", pYtdAmtPaid);
			cmd.addParameter("@P_NEG_PENDING_AMT", pNegPendingAmt);
			cmd.addParameter("@P_PERCENT_ELIG_USED", pPercentEligUsed);
			cmd.addParameter("@P_ACPT_INT_SEQ_NO", pAcptIntSeqNo);
			cmd.addParameter("@P_ACPT_YR_IN_COLL", pAcptYrInColl);
			cmd.addParameter("@P_ACPT_SAR_TRAN_NO", pAcptSarTranNo);
			cmd.addParameter("@P_ACPT_ENROLLMENT_DATE", pAcptEnrollmentDate);
			cmd.addParameter("@P_ACPT_AWARD_AMOUNT", pAcptAwardAmount);
			cmd.addParameter("@P_ACPT_TEACH_EXPERT_IND", pAcptTeachExpertInd);
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
			cmd.addParameter("@P_BOOK_AMT", pBookAmt);
			cmd.addParameter("@P_BOOK_DATE", pBookDate);
			cmd.addParameter("@P_BOOK_DOCUMENT_ID", pBookDocumentId);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NString pAidyCode,NNumber pPidm,NString pFundCode,NNumber pIntSeqNo,NString pAwardId,NString pFedFundId,NString pGrantType,NString pCampOpeid,NString pCampOpeidBranch,NString pInstOpeid,NString pInstOpeidBranch,NString pYrInColl,NString pSarTranNo,NNumber pAwardAmount,NDate pEnrollmentDate,NString pLockInd,NString pConcurEnrollFlag,NString pStatusCde,NDate pDateSent,NString pDocumentId,NString pAttendingId,NString pReportingId,NString pSourceId,NString pTeachExpertInd,NNumber pYtdAmtPaid,NNumber pNegPendingAmt,NNumber pPercentEligUsed,NNumber pAcptIntSeqNo,NString pAcptYrInColl,NString pAcptSarTranNo,NDate pAcptEnrollmentDate,NNumber pAcptAwardAmount,NString pAcptTeachExpertInd,NString pEditRej1,NString pEditRej2,NString pEditRej3,NString pEditRej4,NString pEditRej5,NString pEditField1,NString pEditField2,NString pEditField3,NString pEditField4,NString pEditField5,NString pEditValue1,NString pEditValue2,NString pEditValue3,NString pEditValue4,NString pEditValue5,NNumber pBookAmt,NDate pBookDate,NString pBookDocumentId,NString pUserId,NString pDataOrigin) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_TEACH_ORIGINATION_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_INT_SEQ_NO", pIntSeqNo);
			cmd.addParameter("@P_AWARD_ID", pAwardId);
			cmd.addParameter("@P_FED_FUND_ID", pFedFundId);
			cmd.addParameter("@P_GRANT_TYPE", pGrantType);
			cmd.addParameter("@P_CAMP_OPEID", pCampOpeid);
			cmd.addParameter("@P_CAMP_OPEID_BRANCH", pCampOpeidBranch);
			cmd.addParameter("@P_INST_OPEID", pInstOpeid);
			cmd.addParameter("@P_INST_OPEID_BRANCH", pInstOpeidBranch);
			cmd.addParameter("@P_YR_IN_COLL", pYrInColl);
			cmd.addParameter("@P_SAR_TRAN_NO", pSarTranNo);
			cmd.addParameter("@P_AWARD_AMOUNT", pAwardAmount);
			cmd.addParameter("@P_ENROLLMENT_DATE", pEnrollmentDate);
			cmd.addParameter("@P_LOCK_IND", pLockInd);
			cmd.addParameter("@P_CONCUR_ENROLL_FLAG", pConcurEnrollFlag);
			cmd.addParameter("@P_STATUS_CDE", pStatusCde);
			cmd.addParameter("@P_DATE_SENT", pDateSent);
			cmd.addParameter("@P_DOCUMENT_ID", pDocumentId);
			cmd.addParameter("@P_ATTENDING_ID", pAttendingId);
			cmd.addParameter("@P_REPORTING_ID", pReportingId);
			cmd.addParameter("@P_SOURCE_ID", pSourceId);
			cmd.addParameter("@P_TEACH_EXPERT_IND", pTeachExpertInd);
			cmd.addParameter("@P_YTD_AMT_PAID", pYtdAmtPaid);
			cmd.addParameter("@P_NEG_PENDING_AMT", pNegPendingAmt);
			cmd.addParameter("@P_PERCENT_ELIG_USED", pPercentEligUsed);
			cmd.addParameter("@P_ACPT_INT_SEQ_NO", pAcptIntSeqNo);
			cmd.addParameter("@P_ACPT_YR_IN_COLL", pAcptYrInColl);
			cmd.addParameter("@P_ACPT_SAR_TRAN_NO", pAcptSarTranNo);
			cmd.addParameter("@P_ACPT_ENROLLMENT_DATE", pAcptEnrollmentDate);
			cmd.addParameter("@P_ACPT_AWARD_AMOUNT", pAcptAwardAmount);
			cmd.addParameter("@P_ACPT_TEACH_EXPERT_IND", pAcptTeachExpertInd);
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
			cmd.addParameter("@P_BOOK_AMT", pBookAmt);
			cmd.addParameter("@P_BOOK_DATE", pBookDate);
			cmd.addParameter("@P_BOOK_DOCUMENT_ID", pBookDocumentId);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
				
			cmd.execute();


		}
		
	
	
	
}
