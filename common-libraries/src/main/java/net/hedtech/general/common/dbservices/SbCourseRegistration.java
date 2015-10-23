package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SbCourseRegistration {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_COURSE_REGISTRATION.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NString pTermCode,NNumber pPidm,NString pCrn,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_COURSE_REGISTRATION.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_CRN", pCrn);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fFinalGradeExists(NString pTermCode,NNumber pPidm,NString pCrn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_COURSE_REGISTRATION.F_FINAL_GRADE_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_CRN", pCrn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(CourseRegistrationRecRow recOne,CourseRegistrationRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_COURSE_REGISTRATION.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, CourseRegistrationRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, CourseRegistrationRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fMidtermGradeExists(NString pTermCode,NNumber pPidm,NString pCrn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_COURSE_REGISTRATION.F_MIDTERM_GRADE_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_CRN", pCrn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NString pTermCode,NNumber pPidm,NString pCrn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_COURSE_REGISTRATION.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_CRN", pCrn);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_COURSE_REGISTRATION.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NString pTermCode,NNumber pPidm,NString pCrn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_COURSE_REGISTRATION.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_CRN", pCrn);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NString pTermCode,NNumber pPidm,NString pCrn,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_COURSE_REGISTRATION.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_CRN", pCrn);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NString pTermCode,NNumber pPidm,NString pCrn,NNumber pClassSortKey,NNumber pRegSeq,NString pPtrmCode,NString pRstsCode,NDate pRstsDate,NString pErrorFlag,NString pRmsgCde,NString pMessage,NNumber pBillHr,NNumber pWaivHr,NNumber pCreditHr,NNumber pBillHrHold,NNumber pCreditHrHold,NString pGmodCode,NString pGrdeCode,NString pGrdeCodeMid,NDate pGrdeDate,NString pDuplOver,NString pLinkOver,NString pCorqOver,NString pPreqOver,NString pTimeOver,NString pCapcOver,NString pLevlOver,NString pCollOver,NString pMajrOver,NString pClasOver,NString pApprOver,NString pApprReceivedInd,NDate pAddDate,NString pLevlCode,NString pCampCode,NString pReservedKey,NNumber pAttendHr,NString pReptOver,NString pRpthOver,NString pTestOver,NString pCampOver,NString pUser,NString pDegcOver,NString pProgOver,NDate pLastAttend,NString pGcmtCode,NString pDataOrigin,NDate pAssessActivityDate,NString pDeptOver,NString pAttsOver,NString pChrtOver,NNumber pWlPriority,NString pWlPriorityOrig,NString pGrdeCodeIncmpFinal,NDate pIncompleteExtDate,NString pMexcOver,NNumber pStspKeySequence,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_COURSE_REGISTRATION.P_CREATE", DbManager.getDataBaseFactory());
			
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
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NString pTermCode,NNumber pPidm,NString pCrn,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_COURSE_REGISTRATION.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_CRN", pCrn);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NString pTermCode,NNumber pPidm,NString pCrn,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_COURSE_REGISTRATION.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_CRN", pCrn);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NString pTermCode,NNumber pPidm,NString pCrn,NNumber pClassSortKey,NNumber pRegSeq,NString pPtrmCode,NString pRstsCode,NDate pRstsDate,NString pErrorFlag,NString pRmsgCde,NString pMessage,NNumber pBillHr,NNumber pWaivHr,NNumber pCreditHr,NNumber pBillHrHold,NNumber pCreditHrHold,NString pGmodCode,NString pGrdeCode,NString pGrdeCodeMid,NDate pGrdeDate,NString pDuplOver,NString pLinkOver,NString pCorqOver,NString pPreqOver,NString pTimeOver,NString pCapcOver,NString pLevlOver,NString pCollOver,NString pMajrOver,NString pClasOver,NString pApprOver,NString pApprReceivedInd,NDate pAddDate,NString pLevlCode,NString pCampCode,NString pReservedKey,NNumber pAttendHr,NString pReptOver,NString pRpthOver,NString pTestOver,NString pCampOver,NString pUser,NString pDegcOver,NString pProgOver,NDate pLastAttend,NString pGcmtCode,NString pDataOrigin,NDate pAssessActivityDate,NString pDeptOver,NString pAttsOver,NString pChrtOver,NNumber pWlPriority,NString pWlPriorityOrig,NString pGrdeCodeIncmpFinal,NDate pIncompleteExtDate,NString pMexcOver,NNumber pStspKeySequence,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_COURSE_REGISTRATION.P_UPDATE", DbManager.getDataBaseFactory());
			
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
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="CourseRegistrationRecRow", dataSourceName="COURSE_REGISTRATION_REC")
	public static class CourseRegistrationRecRow
	{
		@DbRecordField(dataSourceName="R_TERM_CODE")
		public NString RTermCode;
		@DbRecordField(dataSourceName="R_PIDM")
		public NNumber RPidm;
		@DbRecordField(dataSourceName="R_CRN")
		public NString RCrn;
		@DbRecordField(dataSourceName="R_CLASS_SORT_KEY")
		public NNumber RClassSortKey;
		@DbRecordField(dataSourceName="R_REG_SEQ")
		public NNumber RRegSeq;
		@DbRecordField(dataSourceName="R_PTRM_CODE")
		public NString RPtrmCode;
		@DbRecordField(dataSourceName="R_RSTS_CODE")
		public NString RRstsCode;
		@DbRecordField(dataSourceName="R_RSTS_DATE")
		public NDate RRstsDate;
		@DbRecordField(dataSourceName="R_ERROR_FLAG")
		public NString RErrorFlag;
		@DbRecordField(dataSourceName="R_RMSG_CDE")
		public NString RRmsgCde;
		@DbRecordField(dataSourceName="R_MESSAGE")
		public NString RMessage;
		@DbRecordField(dataSourceName="R_BILL_HR")
		public NNumber RBillHr;
		@DbRecordField(dataSourceName="R_WAIV_HR")
		public NNumber RWaivHr;
		@DbRecordField(dataSourceName="R_CREDIT_HR")
		public NNumber RCreditHr;
		@DbRecordField(dataSourceName="R_BILL_HR_HOLD")
		public NNumber RBillHrHold;
		@DbRecordField(dataSourceName="R_CREDIT_HR_HOLD")
		public NNumber RCreditHrHold;
		@DbRecordField(dataSourceName="R_GMOD_CODE")
		public NString RGmodCode;
		@DbRecordField(dataSourceName="R_GRDE_CODE")
		public NString RGrdeCode;
		@DbRecordField(dataSourceName="R_GRDE_CODE_MID")
		public NString RGrdeCodeMid;
		@DbRecordField(dataSourceName="R_GRDE_DATE")
		public NDate RGrdeDate;
		@DbRecordField(dataSourceName="R_DUPL_OVER")
		public NString RDuplOver;
		@DbRecordField(dataSourceName="R_LINK_OVER")
		public NString RLinkOver;
		@DbRecordField(dataSourceName="R_CORQ_OVER")
		public NString RCorqOver;
		@DbRecordField(dataSourceName="R_PREQ_OVER")
		public NString RPreqOver;
		@DbRecordField(dataSourceName="R_TIME_OVER")
		public NString RTimeOver;
		@DbRecordField(dataSourceName="R_CAPC_OVER")
		public NString RCapcOver;
		@DbRecordField(dataSourceName="R_LEVL_OVER")
		public NString RLevlOver;
		@DbRecordField(dataSourceName="R_COLL_OVER")
		public NString RCollOver;
		@DbRecordField(dataSourceName="R_MAJR_OVER")
		public NString RMajrOver;
		@DbRecordField(dataSourceName="R_CLAS_OVER")
		public NString RClasOver;
		@DbRecordField(dataSourceName="R_APPR_OVER")
		public NString RApprOver;
		@DbRecordField(dataSourceName="R_APPR_RECEIVED_IND")
		public NString RApprReceivedInd;
		@DbRecordField(dataSourceName="R_ADD_DATE")
		public NDate RAddDate;
		@DbRecordField(dataSourceName="R_LEVL_CODE")
		public NString RLevlCode;
		@DbRecordField(dataSourceName="R_CAMP_CODE")
		public NString RCampCode;
		@DbRecordField(dataSourceName="R_RESERVED_KEY")
		public NString RReservedKey;
		@DbRecordField(dataSourceName="R_ATTEND_HR")
		public NNumber RAttendHr;
		@DbRecordField(dataSourceName="R_REPT_OVER")
		public NString RReptOver;
		@DbRecordField(dataSourceName="R_RPTH_OVER")
		public NString RRpthOver;
		@DbRecordField(dataSourceName="R_TEST_OVER")
		public NString RTestOver;
		@DbRecordField(dataSourceName="R_CAMP_OVER")
		public NString RCampOver;
		@DbRecordField(dataSourceName="R_USER")
		public NString RUser;
		@DbRecordField(dataSourceName="R_DEGC_OVER")
		public NString RDegcOver;
		@DbRecordField(dataSourceName="R_PROG_OVER")
		public NString RProgOver;
		@DbRecordField(dataSourceName="R_LAST_ATTEND")
		public NDate RLastAttend;
		@DbRecordField(dataSourceName="R_GCMT_CODE")
		public NString RGcmtCode;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_ASSESS_ACTIVITY_DATE")
		public NDate RAssessActivityDate;
		@DbRecordField(dataSourceName="R_DEPT_OVER")
		public NString RDeptOver;
		@DbRecordField(dataSourceName="R_ATTS_OVER")
		public NString RAttsOver;
		@DbRecordField(dataSourceName="R_CHRT_OVER")
		public NString RChrtOver;
		@DbRecordField(dataSourceName="R_WL_PRIORITY")
		public NNumber RWlPriority;
		@DbRecordField(dataSourceName="R_WL_PRIORITY_ORIG")
		public NString RWlPriorityOrig;
		@DbRecordField(dataSourceName="R_GRDE_CODE_INCMP_FINAL")
		public NString RGrdeCodeIncmpFinal;
		@DbRecordField(dataSourceName="R_INCOMPLETE_EXT_DATE")
		public NDate RIncompleteExtDate;
		@DbRecordField(dataSourceName="R_MEXC_OVER")
		public NString RMexcOver;
		@DbRecordField(dataSourceName="R_STSP_KEY_SEQUENCE")
		public NNumber RStspKeySequence;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
