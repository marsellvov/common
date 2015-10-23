package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwpkfcpt {
		public static NNumber fGetJobAnnSal(NNumber pPidm,NString pTermCode,NString pPosn,NString pSuff,NDate pEffectiveDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKFCPT.F_GET_JOB_ANN_SAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_SUFF", pSuff);
			cmd.addParameter("@P_EFFECTIVE_DATE", pEffectiveDate);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static void pJscriptgetfacbaserates(NString pFrmmainName,NString pFrmdummyName,NString pFlclCodeMainName,NString pFlclCodeDummyName,NString pSchNistCodeMainName,NString pSchNistCodeDummyName,NString pRateMainName,NString pRateDummyName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKFCPT.P_JSCRIPTGETFACBASERATES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_FRMMAIN_NAME", pFrmmainName);
			cmd.addParameter("@P_FRMDUMMY_NAME", pFrmdummyName);
			cmd.addParameter("@P_FLCL_CODE_MAIN_NAME", pFlclCodeMainName);
			cmd.addParameter("@P_FLCL_CODE_DUMMY_NAME", pFlclCodeDummyName);
			cmd.addParameter("@P_SCH_NIST_CODE_MAIN_NAME", pSchNistCodeMainName);
			cmd.addParameter("@P_SCH_NIST_CODE_DUMMY_NAME", pSchNistCodeDummyName);
			cmd.addParameter("@P_RATE_MAIN_NAME", pRateMainName);
			cmd.addParameter("@P_RATE_DUMMY_NAME", pRateDummyName);
				
			cmd.execute();


		}
		
//		public static void pPrintCrseCalcDetl(NNumber pEmpPidm,NString pTermCode,NString pCrn,NString pCategory,NNumber pGlobalPidm,List<Twbklibs.Varchar2TabtypeRow> pSchRate,List<Twbklibs.Varchar2TabtypeRow> pSchCalcMethod,List<Twbklibs.Varchar2TabtypeRow> pIncrFlicCode,List<Twbklibs.Varchar2TabtypeRow> pIncrCalcMethod,List<Twbklibs.Varchar2TabtypeRow> pIncrRate,List<Twbklibs.Varchar2TabtypeRow> pIncrPercent,List<Twbklibs.Varchar2TabtypeRow> pIncrCompCreditHrs,List<Twbklibs.Varchar2TabtypeRow> pIncrCompHrsWeek,List<Twbklibs.Varchar2TabtypeRow> pIncrCompEnrl,List<Twbklibs.Varchar2TabtypeRow> pIncrCompWorkload,List<Twbklibs.Varchar2TabtypeRow> pIncrCompensationAmount,List<Twbklibs.Varchar2TabtypeRow> pSchSchdCode,List<Twbklibs.Varchar2TabtypeRow> pSchFlclCode,List<Twbklibs.Varchar2TabtypeRow> pSchCreditHrSess,List<Twbklibs.Varchar2TabtypeRow> pSchHrsWeek,List<Twbklibs.Varchar2TabtypeRow> pSchCompensationAmount,List<Twbklibs.Varchar2TabtypeRow> pIncrRowid,List<Twbklibs.Varchar2TabtypeRow> pIncrRemove) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKFCPT.P_PRINT_CRSE_CALC_DETL", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_EMP_PIDM", pEmpPidm);
//			cmd.addParameter("@P_TERM_CODE", pTermCode);
//			cmd.addParameter("@P_CRN", pCrn);
//			cmd.addParameter("@P_CATEGORY", pCategory);
//			cmd.addParameter("@P_GLOBAL_PIDM", pGlobalPidm);
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
//		public static void pUpdtCrseCalcDetl(NNumber pEmpPidm,NString pTermCode,NString pCrn,NString pCategory,NNumber pGlobalPidm,List<Twbklibs.Varchar2TabtypeRow> pSchRate,List<Twbklibs.Varchar2TabtypeRow> pSchCalcMethod,List<Twbklibs.Varchar2TabtypeRow> pIncrFlicCode,List<Twbklibs.Varchar2TabtypeRow> pIncrCalcMethod,List<Twbklibs.Varchar2TabtypeRow> pIncrRate,List<Twbklibs.Varchar2TabtypeRow> pIncrPercent,List<Twbklibs.Varchar2TabtypeRow> pIncrCompCreditHrs,List<Twbklibs.Varchar2TabtypeRow> pIncrCompHrsWeek,List<Twbklibs.Varchar2TabtypeRow> pIncrCompEnrl,List<Twbklibs.Varchar2TabtypeRow> pIncrCompWorkload,List<Twbklibs.Varchar2TabtypeRow> pIncrCompensationAmount,List<Twbklibs.Varchar2TabtypeRow> pSchSchdCode,List<Twbklibs.Varchar2TabtypeRow> pSchFlclCode,List<Twbklibs.Varchar2TabtypeRow> pSchCreditHrSess,List<Twbklibs.Varchar2TabtypeRow> pSchHrsWeek,List<Twbklibs.Varchar2TabtypeRow> pSchCompensationAmount,List<Twbklibs.Varchar2TabtypeRow> pIncrRowid,List<Twbklibs.Varchar2TabtypeRow> pIncrRemove,List<Twbklibs.Varchar2TabtypeRow> pSchWorkload,List<Twbklibs.Varchar2TabtypeRow> pSchEnroll,List<Twbklibs.Varchar2TabtypeRow> pSchPctResponse,List<Twbklibs.Varchar2TabtypeRow> pSchPctSess,List<Twbklibs.Varchar2TabtypeRow> pSchWorkloadIncr,List<Twbklibs.Varchar2TabtypeRow> pIncrWorkloadIncr) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKFCPT.P_UPDT_CRSE_CALC_DETL", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_EMP_PIDM", pEmpPidm);
//			cmd.addParameter("@P_TERM_CODE", pTermCode);
//			cmd.addParameter("@P_CRN", pCrn);
//			cmd.addParameter("@P_CATEGORY", pCategory);
//			cmd.addParameter("@P_GLOBAL_PIDM", pGlobalPidm);
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
//			// cmd.addParameter(DbTypes.getTableType("P_SCH_WORKLOAD", "", pSchWorkload, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_SCH_ENROLL", "", pSchEnroll, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_SCH_PCT_RESPONSE", "", pSchPctResponse, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_SCH_PCT_SESS", "", pSchPctSess, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_SCH_WORKLOAD_INCR", "", pSchWorkloadIncr, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_INCR_WORKLOAD_INCR", "", pIncrWorkloadIncr, object.class));
//				
//			cmd.execute();
//
//
//		}
//		
//	
	
	
}
