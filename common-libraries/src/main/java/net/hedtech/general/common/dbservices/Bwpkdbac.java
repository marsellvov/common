package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwpkdbac {
		public static NString fDispSumcovLink(NNumber pEmpPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDBAC.F_DISP_SUMCOV_LINK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_EMP_PIDM", pEmpPidm);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pBenefitbeginenddate(NNumber pidm,NString bdcaCode,NString enrollmentType,Ref<NDate> beginDateOut,Ref<NDate> endDateOut,Ref<NString> lvErrorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDBAC.P_BENEFITBEGINENDDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@BDCA_CODE", bdcaCode);
			cmd.addParameter("@ENROLLMENT_TYPE", enrollmentType);
			cmd.addParameter("@BEGIN_DATE_OUT", NDate.class);
			cmd.addParameter("@END_DATE_OUT", NDate.class);
			cmd.addParameter("@LV_ERROR_MSG", NString.class);
				
			cmd.execute();
			beginDateOut.val = cmd.getParameterValue("@BEGIN_DATE_OUT", NDate.class);
			endDateOut.val = cmd.getParameterValue("@END_DATE_OUT", NDate.class);
			lvErrorMsg.val = cmd.getParameterValue("@LV_ERROR_MSG", NString.class);


		}
		
		public static void pCoverageallocsummarybody(NNumber pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDBAC.P_COVERAGEALLOCSUMMARYBODY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();


		}
		
		public static void pDispreturnanchor(NNumber pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDBAC.P_DISPRETURNANCHOR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();


		}
		
//		public static void pModifyallocationbody(NNumber pPidm,NString pBdcaCode,NDate pEffDate,NString pPlanCode,List<Twbklibs.Varchar2TabtypeRow> pSeqNo,List<Twbklibs.Varchar2TabtypeRow> pPrimaryInd,List<Twbklibs.Varchar2TabtypeRow> pPrimaryAllocPct,List<Twbklibs.Varchar2TabtypeRow> pPrimaryAllocAmt,List<Twbklibs.Varchar2TabtypeRow> pContingentAllocPct,List<Twbklibs.Varchar2TabtypeRow> pContingentAllocAmt,List<Twbklibs.Varchar2TabtypeRow> pOpenEnrollInd,List<Twbklibs.Varchar2TabtypeRow> pName,List<Twbklibs.Varchar2TabtypeRow> pChangeable,NString pMessageExist,List<Twbklibs.Varchar2TabtypeRow> pMessage) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDBAC.P_MODIFYALLOCATIONBODY", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_PIDM", pPidm);
//			cmd.addParameter("@P_BDCA_CODE", pBdcaCode);
//			cmd.addParameter("@P_EFF_DATE", pEffDate);
//			cmd.addParameter("@P_PLAN_CODE", pPlanCode);
//			// cmd.addParameter(DbTypes.getTableType("P_SEQ_NO", "", pSeqNo, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_PRIMARY_IND", "", pPrimaryInd, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_PRIMARY_ALLOC_PCT", "", pPrimaryAllocPct, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_PRIMARY_ALLOC_AMT", "", pPrimaryAllocAmt, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_CONTINGENT_ALLOC_PCT", "", pContingentAllocPct, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_CONTINGENT_ALLOC_AMT", "", pContingentAllocAmt, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_OPEN_ENROLL_IND", "", pOpenEnrollInd, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_NAME", "", pName, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_CHANGEABLE", "", pChangeable, object.class));
//			cmd.addParameter("@P_MESSAGE_EXIST", pMessageExist);
//			// cmd.addParameter(DbTypes.getTableType("P_MESSAGE", "", pMessage, object.class));
//				
//			cmd.execute();
//
//
//		}
//		
//		public static void pModifycoveragebody(NNumber pPidm,NString pBdcaCode,NDate pEffDate,NString pPlanCode,List<Twbklibs.Varchar2TabtypeRow> pSeqNo,List<Twbklibs.Varchar2TabtypeRow> pBeginDate,List<Twbklibs.Varchar2TabtypeRow> pEndDate,List<Twbklibs.Varchar2TabtypeRow> pDreaCode,List<Twbklibs.Varchar2TabtypeRow> pOtherCov,List<Twbklibs.Varchar2TabtypeRow> pOpenEnrollInd,List<Twbklibs.Varchar2TabtypeRow> pMark,List<Twbklibs.Varchar2TabtypeRow> pName,List<Twbklibs.Varchar2TabtypeRow> pChangeable,List<Twbklibs.Varchar2TabtypeRow> pCovered,NString pMessageExist,List<Twbklibs.Varchar2TabtypeRow> pMessage) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDBAC.P_MODIFYCOVERAGEBODY", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_PIDM", pPidm);
//			cmd.addParameter("@P_BDCA_CODE", pBdcaCode);
//			cmd.addParameter("@P_EFF_DATE", pEffDate);
//			cmd.addParameter("@P_PLAN_CODE", pPlanCode);
//			// cmd.addParameter(DbTypes.getTableType("P_SEQ_NO", "", pSeqNo, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_BEGIN_DATE", "", pBeginDate, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_END_DATE", "", pEndDate, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_DREA_CODE", "", pDreaCode, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_OTHER_COV", "", pOtherCov, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_OPEN_ENROLL_IND", "", pOpenEnrollInd, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_MARK", "", pMark, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_NAME", "", pName, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_CHANGEABLE", "", pChangeable, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_COVERED", "", pCovered, object.class));
//			cmd.addParameter("@P_MESSAGE_EXIST", pMessageExist);
//			// cmd.addParameter(DbTypes.getTableType("P_MESSAGE", "", pMessage, object.class));
//				
//			cmd.execute();
//
//
//		}
		
		public static void pModifynamesbody(NNumber pPidm,NNumber pSeqNo,NNumber pBenePidm,NString pLastName,NString pFirstName,NString pMi,NString pBrelCode,NString pSexInd,NString pBirthDate,NString pCollegeInd,NString pSsn,NString pSurnamePrefix,NString pAddedDate,NString pActiveInd,NString pMemberType,NString pSpouseInd,NString pMaritalCode,NString pBeginDate,NString pEndDate,NString pDisableInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDBAC.P_MODIFYNAMESBODY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_BENE_PIDM", pBenePidm);
			cmd.addParameter("@P_LAST_NAME", pLastName);
			cmd.addParameter("@P_FIRST_NAME", pFirstName);
			cmd.addParameter("@P_MI", pMi);
			cmd.addParameter("@P_BREL_CODE", pBrelCode);
			cmd.addParameter("@P_SEX_IND", pSexInd);
			cmd.addParameter("@P_BIRTH_DATE", pBirthDate);
			cmd.addParameter("@P_COLLEGE_IND", pCollegeInd);
			cmd.addParameter("@P_SSN", pSsn);
			cmd.addParameter("@P_SURNAME_PREFIX", pSurnamePrefix);
			cmd.addParameter("@P_ADDED_DATE", pAddedDate);
			cmd.addParameter("@P_ACTIVE_IND", pActiveInd);
			cmd.addParameter("@P_MEMBER_TYPE", pMemberType);
			cmd.addParameter("@P_SPOUSE_IND", pSpouseInd);
			cmd.addParameter("@P_MARITAL_CODE", pMaritalCode);
			cmd.addParameter("@P_BEGIN_DATE", pBeginDate);
			cmd.addParameter("@P_END_DATE", pEndDate);
			cmd.addParameter("@P_DISABLE_IND", pDisableInd);
				
			cmd.execute();


		}
		
		public static void pNamesandbenefitsbody(NNumber pPidm,NString pReturnedLocation) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDBAC.P_NAMESANDBENEFITSBODY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_RETURNED_LOCATION", pReturnedLocation);
				
			cmd.execute();


		}
		
		public static void pPrintBenefitInfo(NNumber pPidm,NString pBdcaCode,NDate pBeginDate,NDate pEndDate,NString pEnrollmentType) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDBAC.P_PRINT_BENEFIT_INFO", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_BDCA_CODE", pBdcaCode);
			cmd.addParameter("@P_BEGIN_DATE", pBeginDate);
			cmd.addParameter("@P_END_DATE", pEndDate);
			cmd.addParameter("@P_ENROLLMENT_TYPE", pEnrollmentType);
				
			cmd.execute();


		}
		
//		public static void pUpdateallocationbody(NNumber pPidm,NString pBdcaCode,NDate pEffDate,NString pPlanCode,List<Twbklibs.Varchar2TabtypeRow> pSeqNo,List<Twbklibs.Varchar2TabtypeRow> pPrimaryInd,List<Twbklibs.Varchar2TabtypeRow> pPrimaryAllocPct,List<Twbklibs.Varchar2TabtypeRow> pPrimaryAllocAmt,List<Twbklibs.Varchar2TabtypeRow> pContingentAllocPct,List<Twbklibs.Varchar2TabtypeRow> pContingentAllocAmt,List<Twbklibs.Varchar2TabtypeRow> pOpenEnrollInd,List<Twbklibs.Varchar2TabtypeRow> pName,List<Twbklibs.Varchar2TabtypeRow> pChangeable) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDBAC.P_UPDATEALLOCATIONBODY", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_PIDM", pPidm);
//			cmd.addParameter("@P_BDCA_CODE", pBdcaCode);
//			cmd.addParameter("@P_EFF_DATE", pEffDate);
//			cmd.addParameter("@P_PLAN_CODE", pPlanCode);
//			// cmd.addParameter(DbTypes.getTableType("P_SEQ_NO", "", pSeqNo, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_PRIMARY_IND", "", pPrimaryInd, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_PRIMARY_ALLOC_PCT", "", pPrimaryAllocPct, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_PRIMARY_ALLOC_AMT", "", pPrimaryAllocAmt, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_CONTINGENT_ALLOC_PCT", "", pContingentAllocPct, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_CONTINGENT_ALLOC_AMT", "", pContingentAllocAmt, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_OPEN_ENROLL_IND", "", pOpenEnrollInd, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_NAME", "", pName, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_CHANGEABLE", "", pChangeable, object.class));
//				
//			cmd.execute();
//
//
//		}
//		
//		public static void pUpdatecoveragebody(NNumber pPidm,NString pBdcaCode,NDate pEffDate,NString pPlanCode,List<Twbklibs.Varchar2TabtypeRow> pSeqNo,List<Twbklibs.Varchar2TabtypeRow> pBeginDate,List<Twbklibs.Varchar2TabtypeRow> pEndDate,List<Twbklibs.Varchar2TabtypeRow> pDreaCode,List<Twbklibs.Varchar2TabtypeRow> pOtherCov,List<Twbklibs.Varchar2TabtypeRow> pOpenEnrollInd,List<Twbklibs.Varchar2TabtypeRow> pMark,List<Twbklibs.Varchar2TabtypeRow> pName,List<Twbklibs.Varchar2TabtypeRow> pChangeable,List<Twbklibs.Varchar2TabtypeRow> pCovered) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDBAC.P_UPDATECOVERAGEBODY", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_PIDM", pPidm);
//			cmd.addParameter("@P_BDCA_CODE", pBdcaCode);
//			cmd.addParameter("@P_EFF_DATE", pEffDate);
//			cmd.addParameter("@P_PLAN_CODE", pPlanCode);
//			// cmd.addParameter(DbTypes.getTableType("P_SEQ_NO", "", pSeqNo, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_BEGIN_DATE", "", pBeginDate, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_END_DATE", "", pEndDate, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_DREA_CODE", "", pDreaCode, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_OTHER_COV", "", pOtherCov, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_OPEN_ENROLL_IND", "", pOpenEnrollInd, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_MARK", "", pMark, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_NAME", "", pName, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_CHANGEABLE", "", pChangeable, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_COVERED", "", pCovered, object.class));
//				
//			cmd.execute();
//
//
//		}
		
		public static void pUpdatenamebody(NNumber pPidm,NNumber pSeqNo,NNumber pBenePidm,NString pLastName,NString pFirstName,NString pMi,NString pBrelCode,NString pSexInd,NString pBirthDate,NString pCollegeInd,NString pSsn,NString pRemove,NString pSurnamePrefix,NString pAddedDate,NString pActiveInd,NString pMemberType,NString pSpouseInd,NString pMaritalCode,NString pBeginDate,NString pEndDate,NString pDisableInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDBAC.P_UPDATENAMEBODY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_BENE_PIDM", pBenePidm);
			cmd.addParameter("@P_LAST_NAME", pLastName);
			cmd.addParameter("@P_FIRST_NAME", pFirstName);
			cmd.addParameter("@P_MI", pMi);
			cmd.addParameter("@P_BREL_CODE", pBrelCode);
			cmd.addParameter("@P_SEX_IND", pSexInd);
			cmd.addParameter("@P_BIRTH_DATE", pBirthDate);
			cmd.addParameter("@P_COLLEGE_IND", pCollegeInd);
			cmd.addParameter("@P_SSN", pSsn);
			cmd.addParameter("@P_REMOVE", pRemove);
			cmd.addParameter("@P_SURNAME_PREFIX", pSurnamePrefix);
			cmd.addParameter("@P_ADDED_DATE", pAddedDate);
			cmd.addParameter("@P_ACTIVE_IND", pActiveInd);
			cmd.addParameter("@P_MEMBER_TYPE", pMemberType);
			cmd.addParameter("@P_SPOUSE_IND", pSpouseInd);
			cmd.addParameter("@P_MARITAL_CODE", pMaritalCode);
			cmd.addParameter("@P_BEGIN_DATE", pBeginDate);
			cmd.addParameter("@P_END_DATE", pEndDate);
			cmd.addParameter("@P_DISABLE_IND", pDisableInd);
				
			cmd.execute();


		}
		
	
	
	
}
