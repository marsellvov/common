package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Pekfasg {
		public static NNumber fGetLevelRateCrse(NString pFlclCode,NString pSchdCode,NString pTermCode,NString pCampCode,NString pCollCode,NString pFcntCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PEKFASG.F_GET_LEVEL_RATE_CRSE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_FLCL_CODE", pFlclCode);
			cmd.addParameter("@P_SCHD_CODE", pSchdCode);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_CAMP_CODE", pCampCode);
			cmd.addParameter("@P_COLL_CODE", pCollCode);
			cmd.addParameter("@P_FCNT_CODE", pFcntCode);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fGetLevelRateNist(NString pFlclCode,NString pTermCode,NString pFcntCode,NString pNistCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PEKFASG.F_GET_LEVEL_RATE_NIST", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_FLCL_CODE", pFlclCode);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_FCNT_CODE", pFcntCode);
			cmd.addParameter("@P_NIST_CODE", pNistCode);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static DataCursor fGetSchedTypeSection(NString pCrn,NString pTermCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PEKFASG.F_GET_SCHED_TYPE_SECTION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_CRN", pCrn);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fGetScheduleRate(NString pCrn,NString pTermCode,NString pFcntCode,NString pSchdCode,NString pFlclCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PEKFASG.F_GET_SCHEDULE_RATE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_CRN", pCrn);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_FCNT_CODE", pFcntCode);
			cmd.addParameter("@P_SCHD_CODE", pSchdCode);
			cmd.addParameter("@P_FLCL_CODE", pFlclCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static NNumber fGetWorkloadInfo(NString pCrn,NString pTermCode,NString pCategory,NString pPtrmCode,NString pSubjCode,NString pCrseNumb,NNumber pWorkloadAdjust) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PEKFASG.F_GET_WORKLOAD_INFO", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_CRN", pCrn);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_CATEGORY", pCategory);
			cmd.addParameter("@P_PTRM_CODE", pPtrmCode);
			cmd.addParameter("@P_SUBJ_CODE", pSubjCode);
			cmd.addParameter("@P_CRSE_NUMB", pCrseNumb);
			cmd.addParameter("@P_WORKLOAD_ADJUST", pWorkloadAdjust);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static void pBackoutOverloadJob(NNumber pPidm,NString pTerm,NString pOverloadPosn,NString pOverloadSuff,NString pSource,NString pUserId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PEKFASG.P_BACKOUT_OVERLOAD_JOB", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM", pTerm);
			cmd.addParameter("@P_OVERLOAD_POSN", pOverloadPosn);
			cmd.addParameter("@P_OVERLOAD_SUFF", pOverloadSuff);
			cmd.addParameter("@P_SOURCE", pSource);
			cmd.addParameter("@P_USER_ID", pUserId);
				
			cmd.execute();


		}
		
//		public static void pCalcCrseCompensation(NNumber pPidm,NString pCrn,NString pTerm,NString pPtrmCode,NString pCategory,NString pFcnt,Ref<List<CrseRateTabtypeRow>> pRatetab,Ref<NString> pCrnRejected,NString pUserId) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PEKFASG.P_CALC_CRSE_COMPENSATION", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_PIDM", pPidm);
//			cmd.addParameter("@P_CRN", pCrn);
//			cmd.addParameter("@P_TERM", pTerm);
//			cmd.addParameter("@P_PTRM_CODE", pPtrmCode);
//			cmd.addParameter("@P_CATEGORY", pCategory);
//			cmd.addParameter("@P_FCNT", pFcnt);
//			// cmd.addParameter(DbTypes.getTableType("P_RATETAB", "", object.class));
//			cmd.addParameter("@P_CRN_REJECTED", NString.class);
//			cmd.addParameter("@P_USER_ID", pUserId);
//				
//			cmd.execute();
//			// pRatetab.val = cmd.getTableParameterValue("@P_RATETAB", object.class);
//			pCrnRejected.val = cmd.getParameterValue("@P_CRN_REJECTED", NString.class);
//
//
//		}
		
//		public static void pCalcNistCompensation(Ref<List<NistTabtypeRow>> pNisttab,Ref<NString> pNistRejected,NInteger i,NString pUserId) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PEKFASG.P_CALC_NIST_COMPENSATION", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("P_NISTTAB", "", pNisttab.val, object.class , true));
//			cmd.addParameter("@P_NIST_REJECTED", NString.class);
//			cmd.addParameter("@I", i);
//			cmd.addParameter("@P_USER_ID", pUserId);
//				
//			cmd.execute();
//			// pNisttab.val = cmd.getTableParameterValue("@P_NISTTAB", object.class);
//			pNistRejected.val = cmd.getParameterValue("@P_NIST_REJECTED", NString.class);
//
//
//		}
		
		public static void pChkActiveFaculty(NString pFcstCode,Ref<NString> pMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PEKFASG.P_CHK_ACTIVE_FACULTY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_FCST_CODE", pFcstCode);
			cmd.addParameter("@P_MSG_OUT", pMsgOut, true);
				
			cmd.execute();
			pMsgOut.val = cmd.getParameterValue("@P_MSG_OUT", NString.class);


		}
		
		public static void pChkValidPosn(NString pPosn,Ref<NString> pMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PEKFASG.P_CHK_VALID_POSN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_MSG_OUT", pMsgOut, true);
				
			cmd.execute();
			pMsgOut.val = cmd.getParameterValue("@P_MSG_OUT", NString.class);


		}
		
		public static void pCreatePerfjob(NNumber pPidm,NString pTerm,NString pPosn,NString pSuff,Ref<NDate> pJobEffectiveDate,NString pJcreCode,NNumber pFacultyCompensation,NString pOverloadJob,NString pUseCrnFoapals,NString pUserId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PEKFASG.P_CREATE_PERFJOB", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM", pTerm);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_SUFF", pSuff);
			cmd.addParameter("@P_JOB_EFFECTIVE_DATE", pJobEffectiveDate, true);
			cmd.addParameter("@P_JCRE_CODE", pJcreCode);
			cmd.addParameter("@P_FACULTY_COMPENSATION", pFacultyCompensation);
			cmd.addParameter("@P_OVERLOAD_JOB", pOverloadJob);
			cmd.addParameter("@P_USE_CRN_FOAPALS", pUseCrnFoapals);
			cmd.addParameter("@P_USER_ID", pUserId);
				
			cmd.execute();
			pJobEffectiveDate.val = cmd.getParameterValue("@P_JOB_EFFECTIVE_DATE", NDate.class);


		}
		
		public static void pCreatePerfjobOverload(NNumber pPidm,NString pTerm,NString pPosn,NString pSuff,Ref<NDate> pJobEffectiveDate,NString pJcreCode,NNumber pFacultyCompensation,NString pUserId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PEKFASG.P_CREATE_PERFJOB_OVERLOAD", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM", pTerm);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_SUFF", pSuff);
			cmd.addParameter("@P_JOB_EFFECTIVE_DATE", pJobEffectiveDate, true);
			cmd.addParameter("@P_JCRE_CODE", pJcreCode);
			cmd.addParameter("@P_FACULTY_COMPENSATION", pFacultyCompensation);
			cmd.addParameter("@P_USER_ID", pUserId);
				
			cmd.execute();
			pJobEffectiveDate.val = cmd.getParameterValue("@P_JOB_EFFECTIVE_DATE", NDate.class);


		}
		
		public static void pDeleteFacultyCompensations(NNumber pPidm,NString pTerm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PEKFASG.P_DELETE_FACULTY_COMPENSATIONS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM", pTerm);
				
			cmd.execute();


		}
		
		public static void pGetCourseInfo(NNumber pPidm,NString pTermCode,NString pCrn,NString pCategory,Ref<NNumber> pCredHrsOut,Ref<NNumber> pContactHrsOut,Ref<NNumber> pWorkloadOut,Ref<NNumber> pWorkloadIncrementOut,Ref<NNumber> pPercentResponseOut,Ref<NNumber> pPercentSessOut,Ref<NNumber> pEnrollmentOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PEKFASG.P_GET_COURSE_INFO", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_CRN", pCrn);
			cmd.addParameter("@P_CATEGORY", pCategory);
			cmd.addParameter("@P_CRED_HRS_OUT", NNumber.class);
			cmd.addParameter("@P_CONTACT_HRS_OUT", NNumber.class);
			cmd.addParameter("@P_WORKLOAD_OUT", NNumber.class);
			cmd.addParameter("@P_WORKLOAD_INCREMENT_OUT", NNumber.class);
			cmd.addParameter("@P_PERCENT_RESPONSE_OUT", NNumber.class);
			cmd.addParameter("@P_PERCENT_SESS_OUT", NNumber.class);
			cmd.addParameter("@P_ENROLLMENT_OUT", NNumber.class);
				
			cmd.execute();
			pCredHrsOut.val = cmd.getParameterValue("@P_CRED_HRS_OUT", NNumber.class);
			pContactHrsOut.val = cmd.getParameterValue("@P_CONTACT_HRS_OUT", NNumber.class);
			pWorkloadOut.val = cmd.getParameterValue("@P_WORKLOAD_OUT", NNumber.class);
			pWorkloadIncrementOut.val = cmd.getParameterValue("@P_WORKLOAD_INCREMENT_OUT", NNumber.class);
			pPercentResponseOut.val = cmd.getParameterValue("@P_PERCENT_RESPONSE_OUT", NNumber.class);
			pPercentSessOut.val = cmd.getParameterValue("@P_PERCENT_SESS_OUT", NNumber.class);
			pEnrollmentOut.val = cmd.getParameterValue("@P_ENROLLMENT_OUT", NNumber.class);


		}
		
//		public static void pGetCrseAssignment(NNumber pPidm,NString pTerm,Ref<List<CrseTabtypeRow>> pCrsetabOut,List<EclsTabtypeRow> pEclstab,List<FcntTabtypeRow> pFcnttab,List<PtrmTabtypeRow> pPtrmtab,NString pUserId) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PEKFASG.P_GET_CRSE_ASSIGNMENT", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_PIDM", pPidm);
//			cmd.addParameter("@P_TERM", pTerm);
//			// cmd.addParameter(DbTypes.getTableType("P_CRSETAB_OUT", "", object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_ECLSTAB", "", pEclstab, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_FCNTTAB", "", pFcnttab, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_PTRMTAB", "", pPtrmtab, object.class));
//			cmd.addParameter("@P_USER_ID", pUserId);
//				
//			cmd.execute();
//			// pCrsetabOut.val = cmd.getTableParameterValue("@P_CRSETAB_OUT", object.class);
//
//
//		}
		
//		public static void pGetCrseAssignmentChanges(NNumber pPidm,NString pTerm,Ref<List<CrseTabtypeRow>> pCrsetabOut,List<EclsTabtypeRow> pEclstab,List<FcntTabtypeRow> pFcnttab,List<PtrmTabtypeRow> pPtrmtab,NString pUserId) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PEKFASG.P_GET_CRSE_ASSIGNMENT_CHANGES", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_PIDM", pPidm);
//			cmd.addParameter("@P_TERM", pTerm);
//			// cmd.addParameter(DbTypes.getTableType("P_CRSETAB_OUT", "", object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_ECLSTAB", "", pEclstab, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_FCNTTAB", "", pFcnttab, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_PTRMTAB", "", pPtrmtab, object.class));
//			cmd.addParameter("@P_USER_ID", pUserId);
//				
//			cmd.execute();
//			// pCrsetabOut.val = cmd.getTableParameterValue("@P_CRSETAB_OUT", object.class);
//
//
//		}
		
//		public static void pGetNistAssignment(NNumber pPidm,NString pTerm,Ref<List<NistTabtypeRow>> pNisttabOut,List<EclsTabtypeRow> pEclstab,List<FcntTabtypeRow> pFcnttab,NString pUserId) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PEKFASG.P_GET_NIST_ASSIGNMENT", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_PIDM", pPidm);
//			cmd.addParameter("@P_TERM", pTerm);
//			// cmd.addParameter(DbTypes.getTableType("P_NISTTAB_OUT", "", object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_ECLSTAB", "", pEclstab, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_FCNTTAB", "", pFcnttab, object.class));
//			cmd.addParameter("@P_USER_ID", pUserId);
//				
//			cmd.execute();
//			// pNisttabOut.val = cmd.getTableParameterValue("@P_NISTTAB_OUT", object.class);
//
//
//		}
		
//		public static void pGetNistAssignmentChanges(NNumber pPidm,NString pTerm,Ref<List<NistTabtypeRow>> pNisttabOut,List<EclsTabtypeRow> pEclstab,List<FcntTabtypeRow> pFcnttab,NString pUserId) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PEKFASG.P_GET_NIST_ASSIGNMENT_CHANGES", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_PIDM", pPidm);
//			cmd.addParameter("@P_TERM", pTerm);
//			// cmd.addParameter(DbTypes.getTableType("P_NISTTAB_OUT", "", object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_ECLSTAB", "", pEclstab, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_FCNTTAB", "", pFcnttab, object.class));
//			cmd.addParameter("@P_USER_ID", pUserId);
//				
//			cmd.execute();
//			// pNisttabOut.val = cmd.getTableParameterValue("@P_NISTTAB_OUT", object.class);
//
//
//		}
		
		public static void pParseApiErrors(NString pMsgText,NNumber pPidm,NString pTerm,NString pProcessWarnings,NString pApiKeyStr,NString pUserId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PEKFASG.P_PARSE_API_ERRORS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_MSG_TEXT", pMsgText);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM", pTerm);
			cmd.addParameter("@P_PROCESS_WARNINGS", pProcessWarnings);
			cmd.addParameter("@P_API_KEY_STR", pApiKeyStr);
			cmd.addParameter("@P_USER_ID", pUserId);
				
			cmd.execute();


		}
		
//		public static void pStartFacultyCompensation(NNumber pPidm,NString pTermCode,NString pJcreCode,NString pProcessMode,List<EclsTabtypeRow> pEclstab,List<FcntTabtypeRow> pFcnttab,List<PtrmTabtypeRow> pPtrmtab,NString pUserId) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PEKFASG.P_START_FACULTY_COMPENSATION", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_PIDM", pPidm);
//			cmd.addParameter("@P_TERM_CODE", pTermCode);
//			cmd.addParameter("@P_JCRE_CODE", pJcreCode);
//			cmd.addParameter("@P_PROCESS_MODE", pProcessMode);
//			// cmd.addParameter(DbTypes.getTableType("P_ECLSTAB", "", pEclstab, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_FCNTTAB", "", pFcnttab, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_PTRMTAB", "", pPtrmtab, object.class));
//			cmd.addParameter("@P_USER_ID", pUserId);
//				
//			cmd.execute();
//
//
//		}
		
		public static void pWriteError(NNumber pPidm,NString pTerm,NString pMessage,NString pProcessWarnings,NString pUserId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PEKFASG.P_WRITE_ERROR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM", pTerm);
			cmd.addParameter("@P_MESSAGE", pMessage);
			cmd.addParameter("@P_PROCESS_WARNINGS", pProcessWarnings);
			cmd.addParameter("@P_USER_ID", pUserId);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="CrseAssignmentRectypeRow", dataSourceName="CRSE_ASSIGNMENT_RECTYPE")
	public static class CrseAssignmentRectypeRow
	{
		@DbRecordField(dataSourceName="R_PIDM")
		public NNumber RPidm;
		@DbRecordField(dataSourceName="R_TERM_CODE")
		public NString RTermCode;
		@DbRecordField(dataSourceName="R_CRN")
		public NString RCrn;
		@DbRecordField(dataSourceName="R_CATEGORY")
		public NString RCategory;
		@DbRecordField(dataSourceName="R_FCNT_CODE")
		public NString RFcntCode;
		@DbRecordField(dataSourceName="R_POSN")
		public NString RPosn;
		@DbRecordField(dataSourceName="R_SUFF")
		public NString RSuff;
		@DbRecordField(dataSourceName="R_SUBJ_CODE")
		public NString RSubjCode;
		@DbRecordField(dataSourceName="R_CRSE_NUMB")
		public NString RCrseNumb;
		@DbRecordField(dataSourceName="R_CRSE_TITLE")
		public NString RCrseTitle;
		@DbRecordField(dataSourceName="R_CRSE_SECTION")
		public NString RCrseSection;
		@DbRecordField(dataSourceName="R_COLL_CODE")
		public NString RCollCode;
		@DbRecordField(dataSourceName="R_CAMP_CODE")
		public NString RCampCode;
		@DbRecordField(dataSourceName="R_PTRM_CODE")
		public NString RPtrmCode;
		@DbRecordField(dataSourceName="R_ENRL")
		public NNumber REnrl;
	}

	
	@DbRecordType(id="CrseRateRectypeRow", dataSourceName="CRSE_RATE_RECTYPE")
	public static class CrseRateRectypeRow
	{
		@DbRecordField(dataSourceName="R_CRN")
		public NString RCrn;
		@DbRecordField(dataSourceName="R_TERM_CODE")
		public NString RTermCode;
		@DbRecordField(dataSourceName="R_SCHD_CODE")
		public NString RSchdCode;
		@DbRecordField(dataSourceName="R_RATE_DEFINED")
		public NString RRateDefined;
		@DbRecordField(dataSourceName="R_RATE")
		public NNumber RRate;
		@DbRecordField(dataSourceName="R_CALC_METHOD")
		public NString RCalcMethod;
		@DbRecordField(dataSourceName="R_SESS_CREDITS")
		public NNumber RSessCredits;
		@DbRecordField(dataSourceName="R_CONTACT_HRS")
		public NNumber RContactHrs;
		@DbRecordField(dataSourceName="R_COMPENSATION_AMT")
		public NNumber RCompensationAmt;
	}

	
	@DbRecordType(id="NistAssignmentRectypeRow", dataSourceName="NIST_ASSIGNMENT_RECTYPE")
	public static class NistAssignmentRectypeRow
	{
		@DbRecordField(dataSourceName="R_PIDM")
		public NNumber RPidm;
		@DbRecordField(dataSourceName="R_TERM_CODE")
		public NString RTermCode;
		@DbRecordField(dataSourceName="R_NIST_CODE")
		public NString RNistCode;
		@DbRecordField(dataSourceName="R_COLL_CODE")
		public NString RCollCode;
		@DbRecordField(dataSourceName="R_DEPT_CODE")
		public NString RDeptCode;
		@DbRecordField(dataSourceName="R_FCNT_CODE")
		public NString RFcntCode;
		@DbRecordField(dataSourceName="R_POSN")
		public NString RPosn;
		@DbRecordField(dataSourceName="R_SUFF")
		public NString RSuff;
		@DbRecordField(dataSourceName="R_WORKLOAD")
		public NNumber RWorkload;
		@DbRecordField(dataSourceName="R_WEEKLY_HRS")
		public NNumber RWeeklyHrs;
		@DbRecordField(dataSourceName="R_CALC_METHOD")
		public NString RCalcMethod;
		@DbRecordField(dataSourceName="R_RATE")
		public NNumber RRate;
		@DbRecordField(dataSourceName="R_COMPENSATION_AMT")
		public NNumber RCompensationAmt;
	}

	
	
}
