package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwpkfcft {
		public static NString fCheckFulltimeFaculty(NString pTermCode,NNumber pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKFCFT.F_CHECK_FULLTIME_FACULTY", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fCheckParttimeFaculty(NString pTermCode,NNumber pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKFCFT.F_CHECK_PARTTIME_FACULTY", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
//		public static void pMovetooverloadSec(NString pgPidm,NString pgTerm,NString pgPosn,NString pgSuff,NString pAnnSal,List<Twbklibs.Varchar2TabtypeRow> pgWorkloadCurr,List<Twbklibs.Varchar2TabtypeRow> pWorkloadAdj,List<Twbklibs.Varchar2TabtypeRow> pgCreditCurr,List<Twbklibs.Varchar2TabtypeRow> pCreditAdj,List<Twbklibs.Varchar2TabtypeRow> pgContactCurr,List<Twbklibs.Varchar2TabtypeRow> pContactAdj,List<Twbklibs.Varchar2TabtypeRow> pgHeadcntCurr,List<Twbklibs.Varchar2TabtypeRow> pHeadcntAdj,List<Twbklibs.Varchar2TabtypeRow> pMoveOverload,List<Twbklibs.Varchar2TabtypeRow> pRate,List<Twbklibs.Varchar2TabtypeRow> pCalcMethod,List<Twbklibs.Varchar2TabtypeRow> pgCrn,List<Twbklibs.Varchar2TabtypeRow> pgCategory,NString pPosnOverload,NString pSuffOverload,NString pgOverloadPosntitle,NString btnselected,List<Twbklibs.Varchar2TabtypeRow> pMoveNoverload,List<Twbklibs.Varchar2TabtypeRow> pNistCode,List<Twbklibs.Varchar2TabtypeRow> pCollCode,List<Twbklibs.Varchar2TabtypeRow> pDeptCode,List<Twbklibs.Varchar2TabtypeRow> pNistWorkload,List<Twbklibs.Varchar2TabtypeRow> pWorkload,List<Twbklibs.Varchar2TabtypeRow> pCreditHrs,List<Twbklibs.Varchar2TabtypeRow> pContactHrs,List<Twbklibs.Varchar2TabtypeRow> pHeadCnt,List<Twbklibs.Varchar2TabtypeRow> pNrate,List<Twbklibs.Varchar2TabtypeRow> pNworkload,List<Twbklibs.Varchar2TabtypeRow> pNcontactHrs,NDate pEffDate,List<Twbklibs.Varchar2TabtypeRow> pSeqNo,List<Twbklibs.Varchar2TabtypeRow> pNworkloadAdj,List<Twbklibs.Varchar2TabtypeRow> pNweeklyHrs,List<Twbklibs.Varchar2TabtypeRow> pNcontactAdj,List<Twbklibs.Varchar2TabtypeRow> pCrnOver,List<Twbklibs.Varchar2TabtypeRow> pCatOver,List<Twbklibs.Varchar2TabtypeRow> pNcalcMethod,List<Twbklibs.Varchar2TabtypeRow> pPercent,List<Twbklibs.Varchar2TabtypeRow> pPercentSess,List<Twbklibs.Varchar2TabtypeRow> pNistOver,List<Twbklibs.Varchar2TabtypeRow> pSeqNoOver,List<Twbklibs.Varchar2TabtypeRow> pgPerfasgRowid,List<Twbklibs.Varchar2TabtypeRow> pgPerfnisRowid,NString pRecNo,NString pJobRec,NString cmnt,NString pGlobalUser,List<Twbklibs.Varchar2TabtypeRow> pRemoveOverload,List<Twbklibs.Varchar2TabtypeRow> pRemoveNoverload,List<Twbklibs.Varchar2TabtypeRow> pPerfisoRowid,List<Twbklibs.Varchar2TabtypeRow> pPerfnioRowid) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKFCFT.P_MOVETOOVERLOAD_SEC", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@PG_PIDM", pgPidm);
//			cmd.addParameter("@PG_TERM", pgTerm);
//			cmd.addParameter("@PG_POSN", pgPosn);
//			cmd.addParameter("@PG_SUFF", pgSuff);
//			cmd.addParameter("@P_ANN_SAL", pAnnSal);
//			// cmd.addParameter(DbTypes.getTableType("PG_WORKLOAD_CURR", "", pgWorkloadCurr, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_WORKLOAD_ADJ", "", pWorkloadAdj, object.class));
//			// cmd.addParameter(DbTypes.getTableType("PG_CREDIT_CURR", "", pgCreditCurr, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_CREDIT_ADJ", "", pCreditAdj, object.class));
//			// cmd.addParameter(DbTypes.getTableType("PG_CONTACT_CURR", "", pgContactCurr, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_CONTACT_ADJ", "", pContactAdj, object.class));
//			// cmd.addParameter(DbTypes.getTableType("PG_HEADCNT_CURR", "", pgHeadcntCurr, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_HEADCNT_ADJ", "", pHeadcntAdj, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_MOVE_OVERLOAD", "", pMoveOverload, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_RATE", "", pRate, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_CALC_METHOD", "", pCalcMethod, object.class));
//			// cmd.addParameter(DbTypes.getTableType("PG_CRN", "", pgCrn, object.class));
//			// cmd.addParameter(DbTypes.getTableType("PG_CATEGORY", "", pgCategory, object.class));
//			cmd.addParameter("@P_POSN_OVERLOAD", pPosnOverload);
//			cmd.addParameter("@P_SUFF_OVERLOAD", pSuffOverload);
//			cmd.addParameter("@PG_OVERLOAD_POSNTITLE", pgOverloadPosntitle);
//			cmd.addParameter("@BTNSELECTED", btnselected);
//			// cmd.addParameter(DbTypes.getTableType("P_MOVE_NOVERLOAD", "", pMoveNoverload, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_NIST_CODE", "", pNistCode, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_COLL_CODE", "", pCollCode, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_DEPT_CODE", "", pDeptCode, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_NIST_WORKLOAD", "", pNistWorkload, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_WORKLOAD", "", pWorkload, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_CREDIT_HRS", "", pCreditHrs, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_CONTACT_HRS", "", pContactHrs, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_HEAD_CNT", "", pHeadCnt, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_NRATE", "", pNrate, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_NWORKLOAD", "", pNworkload, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_NCONTACT_HRS", "", pNcontactHrs, object.class));
//			cmd.addParameter("@P_EFF_DATE", pEffDate);
//			// cmd.addParameter(DbTypes.getTableType("P_SEQ_NO", "", pSeqNo, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_NWORKLOAD_ADJ", "", pNworkloadAdj, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_NWEEKLY_HRS", "", pNweeklyHrs, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_NCONTACT_ADJ", "", pNcontactAdj, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_CRN_OVER", "", pCrnOver, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_CAT_OVER", "", pCatOver, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_NCALC_METHOD", "", pNcalcMethod, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_PERCENT", "", pPercent, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_PERCENT_SESS", "", pPercentSess, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_NIST_OVER", "", pNistOver, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_SEQ_NO_OVER", "", pSeqNoOver, object.class));
//			// cmd.addParameter(DbTypes.getTableType("PG_PERFASG_ROWID", "", pgPerfasgRowid, object.class));
//			// cmd.addParameter(DbTypes.getTableType("PG_PERFNIS_ROWID", "", pgPerfnisRowid, object.class));
//			cmd.addParameter("@P_REC_NO", pRecNo);
//			cmd.addParameter("@P_JOB_REC", pJobRec);
//			cmd.addParameter("@CMNT", cmnt);
//			cmd.addParameter("@P_GLOBAL_USER", pGlobalUser);
//			// cmd.addParameter(DbTypes.getTableType("P_REMOVE_OVERLOAD", "", pRemoveOverload, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_REMOVE_NOVERLOAD", "", pRemoveNoverload, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_PERFISO_ROWID", "", pPerfisoRowid, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_PERFNIO_ROWID", "", pPerfnioRowid, object.class));
//				
//			cmd.execute();
//
//
//		}
		
		public static void pPrintEmpInfo(NString pTerm,NString pEmpPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKFCFT.P_PRINT_EMP_INFO", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TERM", pTerm);
			cmd.addParameter("@P_EMP_PIDM", pEmpPidm);
				
			cmd.execute();


		}
		
		public static void pPrintJobsSelection(NString pgQuerydt,NString pgTerm,NNumber pgPidm,NString globalPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKFCFT.P_PRINT_JOBS_SELECTION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PG_QUERYDT", pgQuerydt);
			cmd.addParameter("@PG_TERM", pgTerm);
			cmd.addParameter("@PG_PIDM", pgPidm);
			cmd.addParameter("@GLOBAL_PIDM", globalPidm);
				
			cmd.execute();


		}
		
//		public static void pSalaryView(NString pUser,NString pgTerm,NString pgPidm,NString pgPosn,NString pgSuff,NNumber pRecNo,NNumber pJobRec,NString pAnnSal,List<Twbklibs.Varchar2TabtypeRow> pWorkloadAdj,List<Twbklibs.Varchar2TabtypeRow> pCreditAdj,List<Twbklibs.Varchar2TabtypeRow> pContactAdj,List<Twbklibs.Varchar2TabtypeRow> pHeadcntAdj,List<Twbklibs.Varchar2TabtypeRow> pNworkloadAdj,List<Twbklibs.Varchar2TabtypeRow> pNcontactAdj,NString pPosnOverload,NString pSuffOverload,List<Twbklibs.Varchar2TabtypeRow> pRate,List<Twbklibs.Varchar2TabtypeRow> pWorkload,List<Twbklibs.Varchar2TabtypeRow> pCreditHrs,List<Twbklibs.Varchar2TabtypeRow> pContactHrs,List<Twbklibs.Varchar2TabtypeRow> pHeadCnt,List<Twbklibs.Varchar2TabtypeRow> pNrate,List<Twbklibs.Varchar2TabtypeRow> pNworkload,List<Twbklibs.Varchar2TabtypeRow> pNcontactHrs,NString pGlobalPidm) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKFCFT.P_SALARY_VIEW", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_USER", pUser);
//			cmd.addParameter("@PG_TERM", pgTerm);
//			cmd.addParameter("@PG_PIDM", pgPidm);
//			cmd.addParameter("@PG_POSN", pgPosn);
//			cmd.addParameter("@PG_SUFF", pgSuff);
//			cmd.addParameter("@P_REC_NO", pRecNo);
//			cmd.addParameter("@P_JOB_REC", pJobRec);
//			cmd.addParameter("@P_ANN_SAL", pAnnSal);
//			// cmd.addParameter(DbTypes.getTableType("P_WORKLOAD_ADJ", "", pWorkloadAdj, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_CREDIT_ADJ", "", pCreditAdj, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_CONTACT_ADJ", "", pContactAdj, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_HEADCNT_ADJ", "", pHeadcntAdj, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_NWORKLOAD_ADJ", "", pNworkloadAdj, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_NCONTACT_ADJ", "", pNcontactAdj, object.class));
//			cmd.addParameter("@P_POSN_OVERLOAD", pPosnOverload);
//			cmd.addParameter("@P_SUFF_OVERLOAD", pSuffOverload);
//			// cmd.addParameter(DbTypes.getTableType("P_RATE", "", pRate, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_WORKLOAD", "", pWorkload, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_CREDIT_HRS", "", pCreditHrs, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_CONTACT_HRS", "", pContactHrs, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_HEAD_CNT", "", pHeadCnt, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_NRATE", "", pNrate, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_NWORKLOAD", "", pNworkload, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_NCONTACT_HRS", "", pNcontactHrs, object.class));
//			cmd.addParameter("@P_GLOBAL_PIDM", pGlobalPidm);
//				
//			cmd.execute();
//
//
//		}
		
		public static void pValidateJob(NString pgQuerydt,NString pgTerm,NNumber pgPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKFCFT.P_VALIDATE_JOB", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PG_QUERYDT", pgQuerydt);
			cmd.addParameter("@PG_TERM", pgTerm);
			cmd.addParameter("@PG_PIDM", pgPidm);
				
			cmd.execute();


		}
		
		public static void pViewWorkload(NString pgTerm,NNumber pgPidm,NString pgCrn,NString pgCategory) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKFCFT.P_VIEW_WORKLOAD", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PG_TERM", pgTerm);
			cmd.addParameter("@PG_PIDM", pgPidm);
			cmd.addParameter("@PG_CRN", pgCrn);
			cmd.addParameter("@PG_CATEGORY", pgCategory);
				
			cmd.execute();


		}
		
	
	
	
}
