package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwpkfcal {
		public static void pChoosejob(NString pTerm,NString pPidm,NString pQuerydt) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKFCAL.P_CHOOSEJOB", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TERM", pTerm);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_QUERYDT", pQuerydt);
				
			cmd.execute();


		}
		
		public static void pChoosejobdriver(NString pgQuerydt,NString pTerm,NString pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKFCAL.P_CHOOSEJOBDRIVER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PG_QUERYDT", pgQuerydt);
			cmd.addParameter("@P_TERM", pTerm);
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();


		}
//		
//		public static void pCrsecalculationdetl(NString pEmpPidm,NString pTermCode,NString pCrn,NString pCategory,List<Twbklibs.Varchar2TabtypeRow> pSchRate,List<Twbklibs.Varchar2TabtypeRow> pSchCalcMethod,List<Twbklibs.Varchar2TabtypeRow> pIncrFlicCode,List<Twbklibs.Varchar2TabtypeRow> pIncrCalcMethod,List<Twbklibs.Varchar2TabtypeRow> pIncrRate,List<Twbklibs.Varchar2TabtypeRow> pIncrPercent,List<Twbklibs.Varchar2TabtypeRow> pIncrCompCreditHrs,List<Twbklibs.Varchar2TabtypeRow> pIncrCompHrsWeek,List<Twbklibs.Varchar2TabtypeRow> pIncrCompEnrl,List<Twbklibs.Varchar2TabtypeRow> pIncrCompWorkload,List<Twbklibs.Varchar2TabtypeRow> pIncrCompensationAmount,List<Twbklibs.Varchar2TabtypeRow> pSchSchdCode,List<Twbklibs.Varchar2TabtypeRow> pSchFlclCode,List<Twbklibs.Varchar2TabtypeRow> pSchCreditHrSess,List<Twbklibs.Varchar2TabtypeRow> pSchHrsWeek,List<Twbklibs.Varchar2TabtypeRow> pSchCompensationAmount,List<Twbklibs.Varchar2TabtypeRow> pIncrRowid,List<Twbklibs.Varchar2TabtypeRow> pIncrRemove) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKFCAL.P_CRSECALCULATIONDETL", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_EMP_PIDM", pEmpPidm);
//			cmd.addParameter("@P_TERM_CODE", pTermCode);
//			cmd.addParameter("@P_CRN", pCrn);
//			cmd.addParameter("@P_CATEGORY", pCategory);
//			// cmd.addParameter(DbTypes.getTableType("P_SCH_RATE", "", pSchRate, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_SCH_CALC_METHOD", "", pSchCalcMethod, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_INCR_FLIC_CODE", "", pIncrFlicCode, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_INCR_CALC_METHOD", "", pIncrCalcMethod, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_INCR_RATE", "", pIncrRate, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_INCR_PERCENT", "", pIncrPercent, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_INCR_COMP_CREDIT_HRS", "", pIncrCompCreditHrs, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_INCR_COMP_HRS_WEEK", "", pIncrCompHrsWeek, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_INCR_COMP_ENRL", "", pIncrCompEnrl, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_INCR_COMP_WORKLOAD", "", pIncrCompWorkload, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_INCR_COMPENSATION_AMOUNT", "", pIncrCompensationAmount, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_SCH_SCHD_CODE", "", pSchSchdCode, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_SCH_FLCL_CODE", "", pSchFlclCode, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_SCH_CREDIT_HR_SESS", "", pSchCreditHrSess, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_SCH_HRS_WEEK", "", pSchHrsWeek, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_SCH_COMPENSATION_AMOUNT", "", pSchCompensationAmount, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_INCR_ROWID", "", pIncrRowid, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_INCR_REMOVE", "", pIncrRemove, object.class));
//				
//			cmd.execute();
//
//
//		}
//		
//		public static void pCrsecompensation(NString pTerm,NString pEmpPidm,NString pRecNum,List<Twbklibs.Varchar2TabtypeRow> pgFlclCode,List<Twbklibs.Varchar2TabtypeRow> pgRate,List<Twbklibs.Varchar2TabtypeRow> pgCalcMethod,NString cmnt,NString btnselected) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKFCAL.P_CRSECOMPENSATION", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_TERM", pTerm);
//			cmd.addParameter("@P_EMP_PIDM", pEmpPidm);
//			cmd.addParameter("@P_REC_NUM", pRecNum);
//			// cmd.addParameter(DbTypes.getTableType("PG_FLCL_CODE", "", pgFlclCode, object.class));
//			// cmd.addParameter(DbTypes.getTableType("PG_RATE", "", pgRate, object.class));
//			// cmd.addParameter(DbTypes.getTableType("PG_CALC_METHOD", "", pgCalcMethod, object.class));
//			cmd.addParameter("@CMNT", cmnt);
//			cmd.addParameter("@BTNSELECTED", btnselected);
//				
//			cmd.execute();
//
//
//		}
//		
		public static void pDispworkload(NString pgTerm,NString pgPidm,NString pgCrn,NString pgCategory) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKFCAL.P_DISPWORKLOAD", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PG_TERM", pgTerm);
			cmd.addParameter("@PG_PIDM", pgPidm);
			cmd.addParameter("@PG_CRN", pgCrn);
			cmd.addParameter("@PG_CATEGORY", pgCategory);
				
			cmd.execute();


		}
		
//		public static void pSalarycompensation(NString pTerm,NString pPidm,NString pRecNo,NString pJobRec,NString pgPosn,NString pgSuff,NString pAnnSal,List<Twbklibs.Varchar2TabtypeRow> pWorkloadAdj,List<Twbklibs.Varchar2TabtypeRow> pCreditAdj,List<Twbklibs.Varchar2TabtypeRow> pContactAdj,List<Twbklibs.Varchar2TabtypeRow> pHeadcntAdj,List<Twbklibs.Varchar2TabtypeRow> pNworkloadAdj,List<Twbklibs.Varchar2TabtypeRow> pNcontactAdj,NString pPosnOverload,NString pSuffOverload,List<Twbklibs.Varchar2TabtypeRow> pRate,List<Twbklibs.Varchar2TabtypeRow> pWorkload,List<Twbklibs.Varchar2TabtypeRow> pCreditHrs,List<Twbklibs.Varchar2TabtypeRow> pContactHrs,List<Twbklibs.Varchar2TabtypeRow> pHeadCnt,List<Twbklibs.Varchar2TabtypeRow> pNrate,List<Twbklibs.Varchar2TabtypeRow> pNworkload,List<Twbklibs.Varchar2TabtypeRow> pNcontactHrs,NString btnselected) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKFCAL.P_SALARYCOMPENSATION", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_TERM", pTerm);
//			cmd.addParameter("@P_PIDM", pPidm);
//			cmd.addParameter("@P_REC_NO", pRecNo);
//			cmd.addParameter("@P_JOB_REC", pJobRec);
//			cmd.addParameter("@PG_POSN", pgPosn);
//			cmd.addParameter("@PG_SUFF", pgSuff);
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
//			cmd.addParameter("@BTNSELECTED", btnselected);
//				
//			cmd.execute();
//
//
//		}
		
		public static void pSetTabDriver(NString pViewType,NString pTerm,NString pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKFCAL.P_SET_TAB_DRIVER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_VIEW_TYPE", pViewType);
			cmd.addParameter("@P_TERM", pTerm);
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();


		}
		
//		public static void pUpdatecrsecalculationdetl(List<Twbklibs.Varchar2TabtypeRow> pgSchRate,List<Twbklibs.Varchar2TabtypeRow> pgSchCalcMethod,List<Twbklibs.Varchar2TabtypeRow> pgIncrFlicCode,List<Twbklibs.Varchar2TabtypeRow> pgIncrCalcMethod,List<Twbklibs.Varchar2TabtypeRow> pgIncrRate,List<Twbklibs.Varchar2TabtypeRow> pgIncrPercent,List<Twbklibs.Varchar2TabtypeRow> pgIncrCompCreditHrs,List<Twbklibs.Varchar2TabtypeRow> pgIncrCompHrsWeek,List<Twbklibs.Varchar2TabtypeRow> pgIncrCompEnrl,List<Twbklibs.Varchar2TabtypeRow> pgIncrCompWorkload,List<Twbklibs.Varchar2TabtypeRow> pgIncrCompensationAmount,List<Twbklibs.Varchar2TabtypeRow> pgSchSchdCode,List<Twbklibs.Varchar2TabtypeRow> pgSchFlclCode,List<Twbklibs.Varchar2TabtypeRow> pgSchCreditHrSess,List<Twbklibs.Varchar2TabtypeRow> pgSchHrsWeek,List<Twbklibs.Varchar2TabtypeRow> pgSchCompensationAmount,List<Twbklibs.Varchar2TabtypeRow> pgIncrRowid,List<Twbklibs.Varchar2TabtypeRow> pgIncrRemove,List<Twbklibs.Varchar2TabtypeRow> pgSchWorkload,List<Twbklibs.Varchar2TabtypeRow> pgSchEnroll,List<Twbklibs.Varchar2TabtypeRow> pgSchPctResponse,List<Twbklibs.Varchar2TabtypeRow> pgSchPctSess,List<Twbklibs.Varchar2TabtypeRow> pgSchWorkloadIncr,List<Twbklibs.Varchar2TabtypeRow> pgIncrWorkloadIncr,NString btnselected) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKFCAL.P_UPDATECRSECALCULATIONDETL", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("PG_SCH_RATE", "", pgSchRate, object.class));
//			// cmd.addParameter(DbTypes.getTableType("PG_SCH_CALC_METHOD", "", pgSchCalcMethod, object.class));
//			// cmd.addParameter(DbTypes.getTableType("PG_INCR_FLIC_CODE", "", pgIncrFlicCode, object.class));
//			// cmd.addParameter(DbTypes.getTableType("PG_INCR_CALC_METHOD", "", pgIncrCalcMethod, object.class));
//			// cmd.addParameter(DbTypes.getTableType("PG_INCR_RATE", "", pgIncrRate, object.class));
//			// cmd.addParameter(DbTypes.getTableType("PG_INCR_PERCENT", "", pgIncrPercent, object.class));
//			// cmd.addParameter(DbTypes.getTableType("PG_INCR_COMP_CREDIT_HRS", "", pgIncrCompCreditHrs, object.class));
//			// cmd.addParameter(DbTypes.getTableType("PG_INCR_COMP_HRS_WEEK", "", pgIncrCompHrsWeek, object.class));
//			// cmd.addParameter(DbTypes.getTableType("PG_INCR_COMP_ENRL", "", pgIncrCompEnrl, object.class));
//			// cmd.addParameter(DbTypes.getTableType("PG_INCR_COMP_WORKLOAD", "", pgIncrCompWorkload, object.class));
//			// cmd.addParameter(DbTypes.getTableType("PG_INCR_COMPENSATION_AMOUNT", "", pgIncrCompensationAmount, object.class));
//			// cmd.addParameter(DbTypes.getTableType("PG_SCH_SCHD_CODE", "", pgSchSchdCode, object.class));
//			// cmd.addParameter(DbTypes.getTableType("PG_SCH_FLCL_CODE", "", pgSchFlclCode, object.class));
//			// cmd.addParameter(DbTypes.getTableType("PG_SCH_CREDIT_HR_SESS", "", pgSchCreditHrSess, object.class));
//			// cmd.addParameter(DbTypes.getTableType("PG_SCH_HRS_WEEK", "", pgSchHrsWeek, object.class));
//			// cmd.addParameter(DbTypes.getTableType("PG_SCH_COMPENSATION_AMOUNT", "", pgSchCompensationAmount, object.class));
//			// cmd.addParameter(DbTypes.getTableType("PG_INCR_ROWID", "", pgIncrRowid, object.class));
//			// cmd.addParameter(DbTypes.getTableType("PG_INCR_REMOVE", "", pgIncrRemove, object.class));
//			// cmd.addParameter(DbTypes.getTableType("PG_SCH_WORKLOAD", "", pgSchWorkload, object.class));
//			// cmd.addParameter(DbTypes.getTableType("PG_SCH_ENROLL", "", pgSchEnroll, object.class));
//			// cmd.addParameter(DbTypes.getTableType("PG_SCH_PCT_RESPONSE", "", pgSchPctResponse, object.class));
//			// cmd.addParameter(DbTypes.getTableType("PG_SCH_PCT_SESS", "", pgSchPctSess, object.class));
//			// cmd.addParameter(DbTypes.getTableType("PG_SCH_WORKLOAD_INCR", "", pgSchWorkloadIncr, object.class));
//			// cmd.addParameter(DbTypes.getTableType("PG_INCR_WORKLOAD_INCR", "", pgIncrWorkloadIncr, object.class));
//			cmd.addParameter("@BTNSELECTED", btnselected);
//				
//			cmd.execute();
//
//
//		}
//		
//		public static void pUpdatecrsecompensation(NString pRecNum,List<Twbklibs.Varchar2TabtypeRow> pgFlclCode,List<Twbklibs.Varchar2TabtypeRow> pgNistCode,List<Twbklibs.Varchar2TabtypeRow> pgSeqNo,List<Twbklibs.Varchar2TabtypeRow> pgRate,List<Twbklibs.Varchar2TabtypeRow> pgCalcMethod,List<Twbklibs.Varchar2TabtypeRow> pgPosnJob,List<Twbklibs.Varchar2TabtypeRow> pgSuffJob,List<Twbklibs.Varchar2TabtypeRow> pgEffDate,List<Twbklibs.Varchar2TabtypeRow> pgTotalCompensation,NString cmnt,NString pgUserId,List<Twbklibs.Varchar2TabtypeRow> pgWorkload,List<Twbklibs.Varchar2TabtypeRow> pgWeeklyHrs) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKFCAL.P_UPDATECRSECOMPENSATION", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_REC_NUM", pRecNum);
//			// cmd.addParameter(DbTypes.getTableType("PG_FLCL_CODE", "", pgFlclCode, object.class));
//			// cmd.addParameter(DbTypes.getTableType("PG_NIST_CODE", "", pgNistCode, object.class));
//			// cmd.addParameter(DbTypes.getTableType("PG_SEQ_NO", "", pgSeqNo, object.class));
//			// cmd.addParameter(DbTypes.getTableType("PG_RATE", "", pgRate, object.class));
//			// cmd.addParameter(DbTypes.getTableType("PG_CALC_METHOD", "", pgCalcMethod, object.class));
//			// cmd.addParameter(DbTypes.getTableType("PG_POSN_JOB", "", pgPosnJob, object.class));
//			// cmd.addParameter(DbTypes.getTableType("PG_SUFF_JOB", "", pgSuffJob, object.class));
//			// cmd.addParameter(DbTypes.getTableType("PG_EFF_DATE", "", pgEffDate, object.class));
//			// cmd.addParameter(DbTypes.getTableType("PG_TOTAL_COMPENSATION", "", pgTotalCompensation, object.class));
//			cmd.addParameter("@CMNT", cmnt);
//			cmd.addParameter("@PG_USER_ID", pgUserId);
//			// cmd.addParameter(DbTypes.getTableType("PG_WORKLOAD", "", pgWorkload, object.class));
//			// cmd.addParameter(DbTypes.getTableType("PG_WEEKLY_HRS", "", pgWeeklyHrs, object.class));
//				
//			cmd.execute();
//
//
//		}
//		
//		public static void pUpdatesalarycompensation(NString pgPidm,NString pgTerm,NString pgPosn,NString pgSuff,NString pAnnSal,List<Twbklibs.Varchar2TabtypeRow> pgWorkloadCurr,List<Twbklibs.Varchar2TabtypeRow> pWorkloadAdj,List<Twbklibs.Varchar2TabtypeRow> pgCreditCurr,List<Twbklibs.Varchar2TabtypeRow> pCreditAdj,List<Twbklibs.Varchar2TabtypeRow> pgContactCurr,List<Twbklibs.Varchar2TabtypeRow> pContactAdj,List<Twbklibs.Varchar2TabtypeRow> pgHeadcntCurr,List<Twbklibs.Varchar2TabtypeRow> pHeadcntAdj,NString pgOverloadPosntitle,List<Twbklibs.Varchar2TabtypeRow> pMoveOverload,List<Twbklibs.Varchar2TabtypeRow> pRate,List<Twbklibs.Varchar2TabtypeRow> pCalcMethod,List<Twbklibs.Varchar2TabtypeRow> pgCrn,List<Twbklibs.Varchar2TabtypeRow> pgCategory,NString pPosn,NString pSuff,NString btnselected,List<Twbklibs.Varchar2TabtypeRow> pMoveNoverload,List<Twbklibs.Varchar2TabtypeRow> pNistCode,List<Twbklibs.Varchar2TabtypeRow> pCollCode,List<Twbklibs.Varchar2TabtypeRow> pDeptCode,List<Twbklibs.Varchar2TabtypeRow> pNistWorkload,List<Twbklibs.Varchar2TabtypeRow> pWorkload,List<Twbklibs.Varchar2TabtypeRow> pCreditHrs,List<Twbklibs.Varchar2TabtypeRow> pContactHrs,List<Twbklibs.Varchar2TabtypeRow> pHeadCnt,List<Twbklibs.Varchar2TabtypeRow> pNrate,List<Twbklibs.Varchar2TabtypeRow> pNworkload,List<Twbklibs.Varchar2TabtypeRow> pNcontactHrs,NString pEffDate,List<Twbklibs.Varchar2TabtypeRow> pSeqNo,List<Twbklibs.Varchar2TabtypeRow> pNworkloadCurr,List<Twbklibs.Varchar2TabtypeRow> pNworkloadAdj,List<Twbklibs.Varchar2TabtypeRow> pNweeklyHrs,List<Twbklibs.Varchar2TabtypeRow> pNcontactAdj,List<Twbklibs.Varchar2TabtypeRow> pCrnOver,List<Twbklibs.Varchar2TabtypeRow> pCatOver,List<Twbklibs.Varchar2TabtypeRow> pNcalcMethod,List<Twbklibs.Varchar2TabtypeRow> pPercent,List<Twbklibs.Varchar2TabtypeRow> pPercentSess,List<Twbklibs.Varchar2TabtypeRow> pNistOver,List<Twbklibs.Varchar2TabtypeRow> pSeqNoOver,List<Twbklibs.Varchar2TabtypeRow> pgPerfasgRowid,List<Twbklibs.Varchar2TabtypeRow> pgPerfnisRowid,NString pRecNo,NString pJobRec,NString cmnt,NString pGlobalUser,List<Twbklibs.Varchar2TabtypeRow> pRemoveOverload,List<Twbklibs.Varchar2TabtypeRow> pRemoveNoverload,List<Twbklibs.Varchar2TabtypeRow> pPerfisoRowid,List<Twbklibs.Varchar2TabtypeRow> pPerfnioRowid) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKFCAL.P_UPDATESALARYCOMPENSATION", DbManager.getDataBaseFactory());
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
//			cmd.addParameter("@PG_OVERLOAD_POSNTITLE", pgOverloadPosntitle);
//			// cmd.addParameter(DbTypes.getTableType("P_MOVE_OVERLOAD", "", pMoveOverload, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_RATE", "", pRate, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_CALC_METHOD", "", pCalcMethod, object.class));
//			// cmd.addParameter(DbTypes.getTableType("PG_CRN", "", pgCrn, object.class));
//			// cmd.addParameter(DbTypes.getTableType("PG_CATEGORY", "", pgCategory, object.class));
//			cmd.addParameter("@P_POSN", pPosn);
//			cmd.addParameter("@P_SUFF", pSuff);
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
//			// cmd.addParameter(DbTypes.getTableType("P_NWORKLOAD_CURR", "", pNworkloadCurr, object.class));
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
		
	
	
	
}
