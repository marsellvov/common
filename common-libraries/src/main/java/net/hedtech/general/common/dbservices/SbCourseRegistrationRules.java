package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SbCourseRegistrationRules {
		public static NString fParentExists(NNumber pPidm,NString pTermCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_COURSE_REGISTRATION_RULES.F_PARENT_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_COURSE_REGISTRATION_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NString pTermCode,NNumber pPidm,NString pCrn,NNumber pClassSortKey,NNumber pRegSeq,NString pPtrmCode,NString pRstsCode,NDate pRstsDate,NString pErrorFlag,NString pRmsgCde,NString pMessage,NNumber pBillHr,NNumber pWaivHr,NNumber pCreditHr,NNumber pBillHrHold,NNumber pCreditHrHold,NString pGmodCode,NString pGrdeCode,NString pGrdeCodeMid,NDate pGrdeDate,NString pDuplOver,NString pLinkOver,NString pCorqOver,NString pPreqOver,NString pTimeOver,NString pCapcOver,NString pLevlOver,NString pCollOver,NString pMajrOver,NString pClasOver,NString pApprOver,NString pApprReceivedInd,NDate pAddDate,NString pLevlCode,NString pCampCode,NString pReservedKey,NNumber pAttendHr,NString pReptOver,NString pRpthOver,NString pTestOver,NString pCampOver,NString pUser,NString pDegcOver,NString pProgOver,NDate pLastAttend,NString pGcmtCode,NString pDataOrigin,NDate pAssessActivityDate,NString pDeptOver,NString pAttsOver,NString pChrtOver,NNumber pWlPriority,NString pWlPriorityOrig,NString pGrdeCodeIncmpFinal,NDate pIncompleteExtDate,NString pMexcOver,NNumber pStspKeySequence,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_COURSE_REGISTRATION_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_CRN", pCrn);
			cmd.addParameter("@P_CLASS_SORT_KEY", pClassSortKey);
			cmd.addParameter("@P_REG_SEQ", pRegSeq);
			cmd.addParameter("@P_PTRM_CODE", pPtrmCode);
			cmd.addParameter("@P_RSTS_CODE", pRstsCode);
			cmd.addParameter("@P_RSTS_DATE", pRstsDate);
			cmd.addParameter("@P_ERROR_FLAG", pErrorFlag);
			cmd.addParameter("@P_RMSG_CDE", pRmsgCde);
			cmd.addParameter("@P_MESSAGE", pMessage);
			cmd.addParameter("@P_BILL_HR", pBillHr);
			cmd.addParameter("@P_WAIV_HR", pWaivHr);
			cmd.addParameter("@P_CREDIT_HR", pCreditHr);
			cmd.addParameter("@P_BILL_HR_HOLD", pBillHrHold);
			cmd.addParameter("@P_CREDIT_HR_HOLD", pCreditHrHold);
			cmd.addParameter("@P_GMOD_CODE", pGmodCode);
			cmd.addParameter("@P_GRDE_CODE", pGrdeCode);
			cmd.addParameter("@P_GRDE_CODE_MID", pGrdeCodeMid);
			cmd.addParameter("@P_GRDE_DATE", pGrdeDate);
			cmd.addParameter("@P_DUPL_OVER", pDuplOver);
			cmd.addParameter("@P_LINK_OVER", pLinkOver);
			cmd.addParameter("@P_CORQ_OVER", pCorqOver);
			cmd.addParameter("@P_PREQ_OVER", pPreqOver);
			cmd.addParameter("@P_TIME_OVER", pTimeOver);
			cmd.addParameter("@P_CAPC_OVER", pCapcOver);
			cmd.addParameter("@P_LEVL_OVER", pLevlOver);
			cmd.addParameter("@P_COLL_OVER", pCollOver);
			cmd.addParameter("@P_MAJR_OVER", pMajrOver);
			cmd.addParameter("@P_CLAS_OVER", pClasOver);
			cmd.addParameter("@P_APPR_OVER", pApprOver);
			cmd.addParameter("@P_APPR_RECEIVED_IND", pApprReceivedInd);
			cmd.addParameter("@P_ADD_DATE", pAddDate);
			cmd.addParameter("@P_LEVL_CODE", pLevlCode);
			cmd.addParameter("@P_CAMP_CODE", pCampCode);
			cmd.addParameter("@P_RESERVED_KEY", pReservedKey);
			cmd.addParameter("@P_ATTEND_HR", pAttendHr);
			cmd.addParameter("@P_REPT_OVER", pReptOver);
			cmd.addParameter("@P_RPTH_OVER", pRpthOver);
			cmd.addParameter("@P_TEST_OVER", pTestOver);
			cmd.addParameter("@P_CAMP_OVER", pCampOver);
			cmd.addParameter("@P_USER", pUser);
			cmd.addParameter("@P_DEGC_OVER", pDegcOver);
			cmd.addParameter("@P_PROG_OVER", pProgOver);
			cmd.addParameter("@P_LAST_ATTEND", pLastAttend);
			cmd.addParameter("@P_GCMT_CODE", pGcmtCode);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ASSESS_ACTIVITY_DATE", pAssessActivityDate);
			cmd.addParameter("@P_DEPT_OVER", pDeptOver);
			cmd.addParameter("@P_ATTS_OVER", pAttsOver);
			cmd.addParameter("@P_CHRT_OVER", pChrtOver);
			cmd.addParameter("@P_WL_PRIORITY", pWlPriority);
			cmd.addParameter("@P_WL_PRIORITY_ORIG", pWlPriorityOrig);
			cmd.addParameter("@P_GRDE_CODE_INCMP_FINAL", pGrdeCodeIncmpFinal);
			cmd.addParameter("@P_INCOMPLETE_EXT_DATE", pIncompleteExtDate);
			cmd.addParameter("@P_MEXC_OVER", pMexcOver);
			cmd.addParameter("@P_STSP_KEY_SEQUENCE", pStspKeySequence);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NString pTermCode,NNumber pPidm,NString pCrn,NNumber pClassSortKey,NNumber pRegSeq,NString pPtrmCode,NString pRstsCode,NDate pRstsDate,NString pErrorFlag,NString pRmsgCde,NString pMessage,NNumber pBillHr,NNumber pWaivHr,NNumber pCreditHr,NNumber pBillHrHold,NNumber pCreditHrHold,NString pGmodCode,NString pGrdeCode,NString pGrdeCodeMid,NDate pGrdeDate,NString pDuplOver,NString pLinkOver,NString pCorqOver,NString pPreqOver,NString pTimeOver,NString pCapcOver,NString pLevlOver,NString pCollOver,NString pMajrOver,NString pClasOver,NString pApprOver,NString pApprReceivedInd,NDate pAddDate,NString pLevlCode,NString pCampCode,NString pReservedKey,NNumber pAttendHr,NString pReptOver,NString pRpthOver,NString pTestOver,NString pCampOver,NString pUser,NString pDegcOver,NString pProgOver,NDate pLastAttend,NString pGcmtCode,NString pDataOrigin,NDate pAssessActivityDate,NString pDeptOver,NString pAttsOver,NString pChrtOver,NNumber pWlPriority,NString pWlPriorityOrig,NString pGrdeCodeIncmpFinal,NDate pIncompleteExtDate,NString pMexcOver,NNumber pStspKeySequence) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_COURSE_REGISTRATION_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_CRN", pCrn);
			cmd.addParameter("@P_CLASS_SORT_KEY", pClassSortKey);
			cmd.addParameter("@P_REG_SEQ", pRegSeq);
			cmd.addParameter("@P_PTRM_CODE", pPtrmCode);
			cmd.addParameter("@P_RSTS_CODE", pRstsCode);
			cmd.addParameter("@P_RSTS_DATE", pRstsDate);
			cmd.addParameter("@P_ERROR_FLAG", pErrorFlag);
			cmd.addParameter("@P_RMSG_CDE", pRmsgCde);
			cmd.addParameter("@P_MESSAGE", pMessage);
			cmd.addParameter("@P_BILL_HR", pBillHr);
			cmd.addParameter("@P_WAIV_HR", pWaivHr);
			cmd.addParameter("@P_CREDIT_HR", pCreditHr);
			cmd.addParameter("@P_BILL_HR_HOLD", pBillHrHold);
			cmd.addParameter("@P_CREDIT_HR_HOLD", pCreditHrHold);
			cmd.addParameter("@P_GMOD_CODE", pGmodCode);
			cmd.addParameter("@P_GRDE_CODE", pGrdeCode);
			cmd.addParameter("@P_GRDE_CODE_MID", pGrdeCodeMid);
			cmd.addParameter("@P_GRDE_DATE", pGrdeDate);
			cmd.addParameter("@P_DUPL_OVER", pDuplOver);
			cmd.addParameter("@P_LINK_OVER", pLinkOver);
			cmd.addParameter("@P_CORQ_OVER", pCorqOver);
			cmd.addParameter("@P_PREQ_OVER", pPreqOver);
			cmd.addParameter("@P_TIME_OVER", pTimeOver);
			cmd.addParameter("@P_CAPC_OVER", pCapcOver);
			cmd.addParameter("@P_LEVL_OVER", pLevlOver);
			cmd.addParameter("@P_COLL_OVER", pCollOver);
			cmd.addParameter("@P_MAJR_OVER", pMajrOver);
			cmd.addParameter("@P_CLAS_OVER", pClasOver);
			cmd.addParameter("@P_APPR_OVER", pApprOver);
			cmd.addParameter("@P_APPR_RECEIVED_IND", pApprReceivedInd);
			cmd.addParameter("@P_ADD_DATE", pAddDate);
			cmd.addParameter("@P_LEVL_CODE", pLevlCode);
			cmd.addParameter("@P_CAMP_CODE", pCampCode);
			cmd.addParameter("@P_RESERVED_KEY", pReservedKey);
			cmd.addParameter("@P_ATTEND_HR", pAttendHr);
			cmd.addParameter("@P_REPT_OVER", pReptOver);
			cmd.addParameter("@P_RPTH_OVER", pRpthOver);
			cmd.addParameter("@P_TEST_OVER", pTestOver);
			cmd.addParameter("@P_CAMP_OVER", pCampOver);
			cmd.addParameter("@P_USER", pUser);
			cmd.addParameter("@P_DEGC_OVER", pDegcOver);
			cmd.addParameter("@P_PROG_OVER", pProgOver);
			cmd.addParameter("@P_LAST_ATTEND", pLastAttend);
			cmd.addParameter("@P_GCMT_CODE", pGcmtCode);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ASSESS_ACTIVITY_DATE", pAssessActivityDate);
			cmd.addParameter("@P_DEPT_OVER", pDeptOver);
			cmd.addParameter("@P_ATTS_OVER", pAttsOver);
			cmd.addParameter("@P_CHRT_OVER", pChrtOver);
			cmd.addParameter("@P_WL_PRIORITY", pWlPriority);
			cmd.addParameter("@P_WL_PRIORITY_ORIG", pWlPriorityOrig);
			cmd.addParameter("@P_GRDE_CODE_INCMP_FINAL", pGrdeCodeIncmpFinal);
			cmd.addParameter("@P_INCOMPLETE_EXT_DATE", pIncompleteExtDate);
			cmd.addParameter("@P_MEXC_OVER", pMexcOver);
			cmd.addParameter("@P_STSP_KEY_SEQUENCE", pStspKeySequence);
				
			cmd.execute();


		}
		
	
	
	
}
