package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Pekflac {
		public static NNumber fCalcCrseCompensation(NString pCalcMethod,NNumber pRate,NNumber pWorkload,NNumber pCreditHrs,NNumber pContactHrs,NNumber pHeadcount,NNumber pPercentResp,NNumber pPercentSess,NNumber pWorkloadIncr,NString pCalcIncremental) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PEKFLAC.F_CALC_CRSE_COMPENSATION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_CALC_METHOD", pCalcMethod);
			cmd.addParameter("@P_RATE", pRate);
			cmd.addParameter("@P_WORKLOAD", pWorkload);
			cmd.addParameter("@P_CREDIT_HRS", pCreditHrs);
			cmd.addParameter("@P_CONTACT_HRS", pContactHrs);
			cmd.addParameter("@P_HEADCOUNT", pHeadcount);
			cmd.addParameter("@P_PERCENT_RESP", pPercentResp);
			cmd.addParameter("@P_PERCENT_SESS", pPercentSess);
			cmd.addParameter("@P_WORKLOAD_INCR", pWorkloadIncr);
			cmd.addParameter("@P_CALC_INCREMENTAL", pCalcIncremental);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fCalcNistCompensation(NString pCalcMethod,NNumber pRate,NNumber pWorkload,NNumber pContactHrs) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PEKFLAC.F_CALC_NIST_COMPENSATION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_CALC_METHOD", pCalcMethod);
			cmd.addParameter("@P_RATE", pRate);
			cmd.addParameter("@P_WORKLOAD", pWorkload);
			cmd.addParameter("@P_CONTACT_HRS", pContactHrs);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fCalculatedWorkload(NNumber pWorkload,NNumber pWorkloadIncr,NNumber pPercentResponse) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PEKFLAC.F_CALCULATED_WORKLOAD", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_WORKLOAD", pWorkload);
			cmd.addParameter("@P_WORKLOAD_INCR", pWorkloadIncr);
			cmd.addParameter("@P_PERCENT_RESPONSE", pPercentResponse);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString fCheckCrseLoadChanges(NNumber pPidm,NString pTermCode,NString pCrn,NString pCategory) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PEKFLAC.F_CHECK_CRSE_LOAD_CHANGES", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_CRN", pCrn);
			cmd.addParameter("@P_CATEGORY", pCategory);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fCheckFulltimeFaculty(NString pTermCode,NString pFcntCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PEKFLAC.F_CHECK_FULLTIME_FACULTY", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_FCNT_CODE", pFcntCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fCheckJobLocked(NString pTermCode,NNumber pPidm,NString pPosn,NString pSuff,NDate pEffectiveDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PEKFLAC.F_CHECK_JOB_LOCKED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_SUFF", pSuff);
			cmd.addParameter("@P_EFFECTIVE_DATE", pEffectiveDate);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fCheckNistLoadChanges(NNumber pPidm,NString pTermCode,NString pNistCode,NString pCollCode,NString pDeptCode,NString pFcntCode,NString pPosn,NString pSuff) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PEKFLAC.F_CHECK_NIST_LOAD_CHANGES", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_NIST_CODE", pNistCode);
			cmd.addParameter("@P_COLL_CODE", pCollCode);
			cmd.addParameter("@P_DEPT_CODE", pDeptCode);
			cmd.addParameter("@P_FCNT_CODE", pFcntCode);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_SUFF", pSuff);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fCommentsExist(NNumber pPidm,NString pTerm,NString pRole) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PEKFLAC.F_COMMENTS_EXIST", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM", pTerm);
			cmd.addParameter("@P_ROLE", pRole);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber fCrseCompensation(NString pTermCode,NNumber pPidm,NString pCrn,NString pCategory) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PEKFLAC.F_CRSE_COMPENSATION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_CRN", pCrn);
			cmd.addParameter("@P_CATEGORY", pCategory);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fCrseIncremental(NString pTermCode,NNumber pPidm,NString pCrn,NString pCategory) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PEKFLAC.F_CRSE_INCREMENTAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_CRN", pCrn);
			cmd.addParameter("@P_CATEGORY", pCategory);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString fErrorExists(NNumber pPidm,NString pTerm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PEKFLAC.F_ERROR_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM", pTerm);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
//		public static List<CmntsTabtypeRow> fGetComments(NNumber pPidm,NString pTerm) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PEKFLAC.F_GET_COMMENTS", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<CmntsTabtypeRow>.class);
//			cmd.addParameter("@P_PIDM", pPidm);
//			cmd.addParameter("@P_TERM", pTerm);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<CmntsTabtypeRow>.class);
//
//		}
		
//		public static List<CmntsTabtypeRow> fGetFacultyComments(NNumber pPidm,NString pTerm) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PEKFLAC.F_GET_FACULTY_COMMENTS", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<CmntsTabtypeRow>.class);
//			cmd.addParameter("@P_PIDM", pPidm);
//			cmd.addParameter("@P_TERM", pTerm);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<CmntsTabtypeRow>.class);
//
//		}
		
		public static NString fGetNistDesc(NString pNistCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PEKFLAC.F_GET_NIST_DESC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_NIST_CODE", pNistCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetStvptrmDesc(NString pPtrmCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PEKFLAC.F_GET_STVPTRM_DESC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PTRM_CODE", pPtrmCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetSubjCrse(NString pTerm,NString pCrn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PEKFLAC.F_GET_SUBJ_CRSE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_TERM", pTerm);
			cmd.addParameter("@P_CRN", pCrn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber fJobCompensation(NString pTermCode,NNumber pPidm,NString pPosn,NString pSuff,NDate pEffDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PEKFLAC.F_JOB_COMPENSATION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_SUFF", pSuff);
			cmd.addParameter("@P_EFF_DATE", pEffDate);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static DataCursor fOpenContractTypesRc(NNumber pEmpPidm,NString pTermCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PEKFLAC.F_OPEN_CONTRACT_TYPES_RC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_EMP_PIDM", pEmpPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fOpenCrseAssignRc(NNumber pEmpPidm,NString pTermCode,NString pFcntCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PEKFLAC.F_OPEN_CRSE_ASSIGN_RC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_EMP_PIDM", pEmpPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_FCNT_CODE", pFcntCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fOpenNistAssignRc(NNumber pEmpPidm,NString pTermCode,NString pFcntCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PEKFLAC.F_OPEN_NIST_ASSIGN_RC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_EMP_PIDM", pEmpPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_FCNT_CODE", pFcntCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fOpenNistLevelsRc(NString pTermCode,NString pFcntCode,NString pNistCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PEKFLAC.F_OPEN_NIST_LEVELS_RC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_FCNT_CODE", pFcntCode);
			cmd.addParameter("@P_NIST_CODE", pNistCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fPtrflctRc(NString pFcntCode,NString pEffTerm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PEKFLAC.F_PTRFLCT_RC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_FCNT_CODE", pFcntCode);
			cmd.addParameter("@P_EFF_TERM", pEffTerm);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fSelectNbtfprm(NNumber pPidm,NString pLabel) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PEKFLAC.F_SELECT_NBTFPRM", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_LABEL", pLabel);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fSiaasgnNistCompData(NNumber pPidm,NString pTermCode,NString pNistCode,NString pCollCode,NString pDeptCode,NString pFcntCode,NString pPosn,NString pSuff) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PEKFLAC.F_SIAASGN_NIST_COMP_DATA", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_NIST_CODE", pNistCode);
			cmd.addParameter("@P_COLL_CODE", pCollCode);
			cmd.addParameter("@P_DEPT_CODE", pDeptCode);
			cmd.addParameter("@P_FCNT_CODE", pFcntCode);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_SUFF", pSuff);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCheckPosnExists(NString pPosn,Ref<NString> pErrorMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PEKFLAC.P_CHECK_POSN_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_ERROR_MSG_OUT", NString.class);
				
			cmd.execute();
			pErrorMsgOut.val = cmd.getParameterValue("@P_ERROR_MSG_OUT", NString.class);


		}
		
		public static void pDeleteNbtempf(NNumber pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PEKFLAC.P_DELETE_NBTEMPF", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();


		}
		
		public static void pDeleteNbtfprm(NNumber pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PEKFLAC.P_DELETE_NBTFPRM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();


		}
		
		public static void pDeleteNbtjobf(NNumber pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PEKFLAC.P_DELETE_NBTJOBF", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();


		}
		
		public static void pDeleteNbtorsf(NNumber pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PEKFLAC.P_DELETE_NBTORSF", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();


		}
		
		public static void pDeleteSelectedFilters(NNumber pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PEKFLAC.P_DELETE_SELECTED_FILTERS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();


		}
		
		public static void pGetCrseHrs(NString pTermCode,NNumber pPidm,NString pCrn,NString pCategory,Ref<NNumber> pCredHrs,Ref<NNumber> pContactHrs,NString pContractType) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PEKFLAC.P_GET_CRSE_HRS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_CRN", pCrn);
			cmd.addParameter("@P_CATEGORY", pCategory);
			cmd.addParameter("@P_CRED_HRS", NNumber.class);
			cmd.addParameter("@P_CONTACT_HRS", NNumber.class);
			cmd.addParameter("@P_CONTRACT_TYPE", pContractType);
				
			cmd.execute();
			pCredHrs.val = cmd.getParameterValue("@P_CRED_HRS", NNumber.class);
			pContactHrs.val = cmd.getParameterValue("@P_CONTACT_HRS", NNumber.class);


		}
		
		public static void pIncludeOverloadJobamt(NString pTermCode,NString pEmpPidm,NString pOverloadPosn,NString pOverloadSuff,Ref<NString> pOverloadExistsOut,Ref<NNumber> pCompensationOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PEKFLAC.P_INCLUDE_OVERLOAD_JOBAMT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_EMP_PIDM", pEmpPidm);
			cmd.addParameter("@P_OVERLOAD_POSN", pOverloadPosn);
			cmd.addParameter("@P_OVERLOAD_SUFF", pOverloadSuff);
			cmd.addParameter("@P_OVERLOAD_EXISTS_OUT", pOverloadExistsOut, true);
			cmd.addParameter("@P_COMPENSATION_OUT", pCompensationOut, true);
				
			cmd.execute();
			pOverloadExistsOut.val = cmd.getParameterValue("@P_OVERLOAD_EXISTS_OUT", NString.class);
			pCompensationOut.val = cmd.getParameterValue("@P_COMPENSATION_OUT", NNumber.class);


		}
		
		public static void pOpenInstrLevelsRc(NString pTermCode,NString pCampCode,NString pCollCode,NString pFcntCode,NString pSchdCode,Ref<DataCursor> pInstrLevelsRc) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PEKFLAC.P_OPEN_INSTR_LEVELS_RC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_CAMP_CODE", pCampCode);
			cmd.addParameter("@P_COLL_CODE", pCollCode);
			cmd.addParameter("@P_FCNT_CODE", pFcntCode);
			cmd.addParameter("@P_SCHD_CODE", pSchdCode);
			cmd.addParameter("@P_INSTR_LEVELS_RC", DataCursor.class);
				
			cmd.execute();
			pInstrLevelsRc.val = cmd.getParameterValue("@P_INSTR_LEVELS_RC", DataCursor.class);


		}
		
		public static void pUpdtPerfjobAnnSalary(NString pTermCode,NNumber pPidm,NString pPosn,NString pSuff,NDate pEffDate,NNumber pNewAnnSalary,Ref<NString> pMsgOut,NString pUserId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PEKFLAC.P_UPDT_PERFJOB_ANN_SALARY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_SUFF", pSuff);
			cmd.addParameter("@P_EFF_DATE", pEffDate);
			cmd.addParameter("@P_NEW_ANN_SALARY", pNewAnnSalary);
			cmd.addParameter("@P_MSG_OUT", pMsgOut, true);
			cmd.addParameter("@P_USER_ID", pUserId);
				
			cmd.execute();
			pMsgOut.val = cmd.getParameterValue("@P_MSG_OUT", NString.class);


		}
		
	
	
	@DbRecordType(id="CmntsRectypeRow", dataSourceName="CMNTS_RECTYPE")
	public static class CmntsRectypeRow
	{
		@DbRecordField(dataSourceName="R_COMMENTS")
		public NString RComments;
		@DbRecordField(dataSourceName="R_DATE")
		public NDate RDate;
		@DbRecordField(dataSourceName="R_USER")
		public NString RUser;
		@DbRecordField(dataSourceName="R_TYPE")
		public NString RType;
	}

	
	
}
