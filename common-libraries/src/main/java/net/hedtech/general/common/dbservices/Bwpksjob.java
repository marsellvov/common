package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwpksjob {
		public static void csv(NString buttonselected,NString pExtract,NString pScenario) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKSJOB.CSV", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@BUTTONSELECTED", buttonselected);
			cmd.addParameter("@P_EXTRACT", pExtract);
			cmd.addParameter("@P_SCENARIO", pScenario);
				
			cmd.execute();


		}
		
		public static NNumber fCalcEstFyBudget(NNumber newAnnSalary,NNumber budgetFactor,NNumber oldAnnSalary) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKSJOB.F_CALC_EST_FY_BUDGET", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@NEW_ANN_SALARY", newAnnSalary);
			cmd.addParameter("@BUDGET_FACTOR", budgetFactor);
			cmd.addParameter("@OLD_ANN_SALARY", oldAnnSalary);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fCalcchgamtstepzero(NNumber rateIn,NNumber hrsPayIn,NNumber factorIn,NNumber annSalaryIn,NNumber roundMethodIn,NNumber chgAmtIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKSJOB.F_CALCCHGAMTSTEPZERO", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@RATE_IN", rateIn);
			cmd.addParameter("@HRS_PAY_IN", hrsPayIn);
			cmd.addParameter("@FACTOR_IN", factorIn);
			cmd.addParameter("@ANN_SALARY_IN", annSalaryIn);
			cmd.addParameter("@ROUND_METHOD_IN", roundMethodIn);
			cmd.addParameter("@CHG_AMT_IN", chgAmtIn);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString fCheckOrgnSplit(NNumber pidmIn,NString extract,NString scenario,NNumber splitRecNo,NString orgn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKSJOB.F_CHECK_ORGN_SPLIT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@EXTRACT", extract);
			cmd.addParameter("@SCENARIO", scenario);
			cmd.addParameter("@SPLIT_REC_NO", splitRecNo);
			cmd.addParameter("@ORGN", orgn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pDispdefaulthrs(NString extract,NString scenario,NNumber empfSeqNo,NNumber seqNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKSJOB.P_DISPDEFAULTHRS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@EXTRACT", extract);
			cmd.addParameter("@SCENARIO", scenario);
			cmd.addParameter("@EMPF_SEQ_NO", empfSeqNo);
			cmd.addParameter("@SEQ_NO", seqNo);
				
			cmd.execute();


		}
		
		public static void pDispjobcomments(NString extract,NString scenario,NString empfSeqno,NString jobfSeqno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKSJOB.P_DISPJOBCOMMENTS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@EXTRACT", extract);
			cmd.addParameter("@SCENARIO", scenario);
			cmd.addParameter("@EMPF_SEQNO", empfSeqno);
			cmd.addParameter("@JOBF_SEQNO", jobfSeqno);
				
			cmd.execute();


		}
		
		public static void pListbyemployee(NString extract,NString scenario,NString startNo,NString orgnCode,NString posn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKSJOB.P_LISTBYEMPLOYEE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@EXTRACT", extract);
			cmd.addParameter("@SCENARIO", scenario);
			cmd.addParameter("@START_NO", startNo);
			cmd.addParameter("@ORGN_CODE", orgnCode);
			cmd.addParameter("@POSN", posn);
				
			cmd.execute();


		}
		
		public static void pMasschangetable(NNumber dftRndOpt,NString empfSeqno,NString jobfSeqno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKSJOB.P_MASSCHANGETABLE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@DFT_RND_OPT", dftRndOpt);
			cmd.addParameter("@EMPF_SEQNO", empfSeqno);
			cmd.addParameter("@JOBF_SEQNO", jobfSeqno);
				
			cmd.execute();


		}
		
		public static void pModifyempdetl(NString extract,NString scenario,NString empfSeqno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKSJOB.P_MODIFYEMPDETL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@EXTRACT", extract);
			cmd.addParameter("@SCENARIO", scenario);
			cmd.addParameter("@EMPF_SEQNO", empfSeqno);
				
			cmd.execute();


		}
		
		public static void pModifyjobdetl(NString extract,NString scenario,NString empfSeqno,NString jobfSeqno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKSJOB.P_MODIFYJOBDETL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@EXTRACT", extract);
			cmd.addParameter("@SCENARIO", scenario);
			cmd.addParameter("@EMPF_SEQNO", empfSeqno);
			cmd.addParameter("@JOBF_SEQNO", jobfSeqno);
				
			cmd.execute();


		}
		
		public static void pUpdatedefaulthrs(NString extract,NString scenario,NNumber empfSeqNo,NNumber seqNo,NDate effDateProposed,NString hrsProposed,NString cancelDate,NString earnCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKSJOB.P_UPDATEDEFAULTHRS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@EXTRACT", extract);
			cmd.addParameter("@SCENARIO", scenario);
			cmd.addParameter("@EMPF_SEQ_NO", empfSeqNo);
			cmd.addParameter("@SEQ_NO", seqNo);
			cmd.addParameter("@EFF_DATE_PROPOSED", effDateProposed);
			cmd.addParameter("@HRS_PROPOSED", hrsProposed);
			cmd.addParameter("@CANCEL_DATE", cancelDate);
			cmd.addParameter("@EARN_CODE", earnCode);
				
			cmd.execute();


		}
		
//		public static void pUpdateempdetl(NString extract,NString scenario,NNumber empfSeqnoIn,NString roundFactor,NString hrlySalry,List<Twbklibs.Varchar2TabtypeRow> jcreCode,List<Twbklibs.Varchar2TabtypeRow> massPct,List<Twbklibs.Varchar2TabtypeRow> massAmt,List<Twbklibs.Varchar2TabtypeRow> posnKey,List<Twbklibs.Varchar2TabtypeRow> salbInd,List<Twbklibs.Varchar2TabtypeRow> fteProp,List<Twbklibs.Varchar2TabtypeRow> oldFteProp,List<Twbklibs.Varchar2TabtypeRow> apptProp,List<Twbklibs.Varchar2TabtypeRow> oldApptProp,NString totalUpdProrate,List<Twbklibs.Varchar2TabtypeRow> chgAmt1,List<Twbklibs.Varchar2TabtypeRow> chgPct1,List<Twbklibs.Varchar2TabtypeRow> chgAmt2,List<Twbklibs.Varchar2TabtypeRow> chgPct2,List<Twbklibs.Varchar2TabtypeRow> otherAmt,List<Twbklibs.Varchar2TabtypeRow> hrsPayProp,List<Twbklibs.Varchar2TabtypeRow> regRate,List<Twbklibs.Varchar2TabtypeRow> regRateProp,List<Twbklibs.Varchar2TabtypeRow> annSalProp,List<Twbklibs.Varchar2TabtypeRow> exclTotalsInd,List<Twbklibs.Varchar2TabtypeRow> hideInd,NString buttonselected) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKSJOB.P_UPDATEEMPDETL", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@EXTRACT", extract);
//			cmd.addParameter("@SCENARIO", scenario);
//			cmd.addParameter("@EMPF_SEQNO_IN", empfSeqnoIn);
//			cmd.addParameter("@ROUND_FACTOR", roundFactor);
//			cmd.addParameter("@HRLY_SALRY", hrlySalry);
//			// cmd.addParameter(DbTypes.getTableType("JCRE_CODE", "", jcreCode, object.class));
//			// cmd.addParameter(DbTypes.getTableType("MASS_PCT", "", massPct, object.class));
//			// cmd.addParameter(DbTypes.getTableType("MASS_AMT", "", massAmt, object.class));
//			// cmd.addParameter(DbTypes.getTableType("POSN_KEY", "", posnKey, object.class));
//			// cmd.addParameter(DbTypes.getTableType("SALB_IND", "", salbInd, object.class));
//			// cmd.addParameter(DbTypes.getTableType("FTE_PROP", "", fteProp, object.class));
//			// cmd.addParameter(DbTypes.getTableType("OLD_FTE_PROP", "", oldFteProp, object.class));
//			// cmd.addParameter(DbTypes.getTableType("APPT_PROP", "", apptProp, object.class));
//			// cmd.addParameter(DbTypes.getTableType("OLD_APPT_PROP", "", oldApptProp, object.class));
//			cmd.addParameter("@TOTAL_UPD_PRORATE", totalUpdProrate);
//			// cmd.addParameter(DbTypes.getTableType("CHG_AMT1", "", chgAmt1, object.class));
//			// cmd.addParameter(DbTypes.getTableType("CHG_PCT1", "", chgPct1, object.class));
//			// cmd.addParameter(DbTypes.getTableType("CHG_AMT2", "", chgAmt2, object.class));
//			// cmd.addParameter(DbTypes.getTableType("CHG_PCT2", "", chgPct2, object.class));
//			// cmd.addParameter(DbTypes.getTableType("OTHER_AMT", "", otherAmt, object.class));
//			// cmd.addParameter(DbTypes.getTableType("HRS_PAY_PROP", "", hrsPayProp, object.class));
//			// cmd.addParameter(DbTypes.getTableType("REG_RATE", "", regRate, object.class));
//			// cmd.addParameter(DbTypes.getTableType("REG_RATE_PROP", "", regRateProp, object.class));
//			// cmd.addParameter(DbTypes.getTableType("ANN_SAL_PROP", "", annSalProp, object.class));
//			// cmd.addParameter(DbTypes.getTableType("EXCL_TOTALS_IND", "", exclTotalsInd, object.class));
//			// cmd.addParameter(DbTypes.getTableType("HIDE_IND", "", hideInd, object.class));
//			cmd.addParameter("@BUTTONSELECTED", buttonselected);
//				
//			cmd.execute();
//
//
//		}
//		
//		public static void pUpdateemplist(NString extract,NString scenario,NString orgnCode,NString posn,NString roundFactor,NString hrlySalry,List<Twbklibs.Varchar2TabtypeRow> jcreCode,List<Twbklibs.Varchar2TabtypeRow> massPct,List<Twbklibs.Varchar2TabtypeRow> massAmt,NString startNo,List<Twbklibs.Varchar2TabtypeRow> empfSeqno,List<Twbklibs.Varchar2TabtypeRow> totFteAppt,List<Twbklibs.Varchar2TabtypeRow> oldChgAmt,List<Twbklibs.Varchar2TabtypeRow> unrndChgAmt,List<Twbklibs.Varchar2TabtypeRow> changeAmt,List<Twbklibs.Varchar2TabtypeRow> changePct,List<Twbklibs.Varchar2TabtypeRow> changeType,List<Twbklibs.Varchar2TabtypeRow> newAmt,NString buttonselected) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKSJOB.P_UPDATEEMPLIST", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@EXTRACT", extract);
//			cmd.addParameter("@SCENARIO", scenario);
//			cmd.addParameter("@ORGN_CODE", orgnCode);
//			cmd.addParameter("@POSN", posn);
//			cmd.addParameter("@ROUND_FACTOR", roundFactor);
//			cmd.addParameter("@HRLY_SALRY", hrlySalry);
//			// cmd.addParameter(DbTypes.getTableType("JCRE_CODE", "", jcreCode, object.class));
//			// cmd.addParameter(DbTypes.getTableType("MASS_PCT", "", massPct, object.class));
//			// cmd.addParameter(DbTypes.getTableType("MASS_AMT", "", massAmt, object.class));
//			cmd.addParameter("@START_NO", startNo);
//			// cmd.addParameter(DbTypes.getTableType("EMPF_SEQNO", "", empfSeqno, object.class));
//			// cmd.addParameter(DbTypes.getTableType("TOT_FTE_APPT", "", totFteAppt, object.class));
//			// cmd.addParameter(DbTypes.getTableType("OLD_CHG_AMT", "", oldChgAmt, object.class));
//			// cmd.addParameter(DbTypes.getTableType("UNRND_CHG_AMT", "", unrndChgAmt, object.class));
//			// cmd.addParameter(DbTypes.getTableType("CHANGE_AMT", "", changeAmt, object.class));
//			// cmd.addParameter(DbTypes.getTableType("CHANGE_PCT", "", changePct, object.class));
//			// cmd.addParameter(DbTypes.getTableType("CHANGE_TYPE", "", changeType, object.class));
//			// cmd.addParameter(DbTypes.getTableType("NEW_AMT", "", newAmt, object.class));
//			cmd.addParameter("@BUTTONSELECTED", buttonselected);
//				
//			cmd.execute();
//
//
//		}
		
		public static void pUpdatejobcomments(NString extract,NString scenario,NString empfSeqno,NString jobfSeqno,NString comments,NString buttonselected) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKSJOB.P_UPDATEJOBCOMMENTS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@EXTRACT", extract);
			cmd.addParameter("@SCENARIO", scenario);
			cmd.addParameter("@EMPF_SEQNO", empfSeqno);
			cmd.addParameter("@JOBF_SEQNO", jobfSeqno);
			cmd.addParameter("@COMMENTS", comments);
			cmd.addParameter("@BUTTONSELECTED", buttonselected);
				
			cmd.execute();


		}
		
//		public static void pUpdatejobdetl(NString extract,NString scenario,NNumber empfSeqno,NNumber jobfSeqno,NString roundFactor,NString hrlySalry,NString payFactor,List<Twbklibs.Varchar2TabtypeRow> jcreCode,List<Twbklibs.Varchar2TabtypeRow> massPct,List<Twbklibs.Varchar2TabtypeRow> massAmt,List<Twbklibs.Varchar2TabtypeRow> jcreInd,NString descProp,NString rate,NString regRateProp,NString annSalary,NString annSalaryProp,NString chgPctProp,NString chgAmtProp,NString oldApptProp,NString apptProp,NString appt,NString oldFteProp,NString fteProp,NString fte,NString hrsDayProp,NString hrsPayProp,NString salTableProp,NString salGradeProp,NString salStepProp,NString oldStep,NString factorProp,NString fyBudgProp,NString hideInd,NString exclTotalsInd,NString buttonselected) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKSJOB.P_UPDATEJOBDETL", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@EXTRACT", extract);
//			cmd.addParameter("@SCENARIO", scenario);
//			cmd.addParameter("@EMPF_SEQNO", empfSeqno);
//			cmd.addParameter("@JOBF_SEQNO", jobfSeqno);
//			cmd.addParameter("@ROUND_FACTOR", roundFactor);
//			cmd.addParameter("@HRLY_SALRY", hrlySalry);
//			cmd.addParameter("@PAY_FACTOR", payFactor);
//			// cmd.addParameter(DbTypes.getTableType("JCRE_CODE", "", jcreCode, object.class));
//			// cmd.addParameter(DbTypes.getTableType("MASS_PCT", "", massPct, object.class));
//			// cmd.addParameter(DbTypes.getTableType("MASS_AMT", "", massAmt, object.class));
//			// cmd.addParameter(DbTypes.getTableType("JCRE_IND", "", jcreInd, object.class));
//			cmd.addParameter("@DESC_PROP", descProp);
//			cmd.addParameter("@RATE", rate);
//			cmd.addParameter("@REG_RATE_PROP", regRateProp);
//			cmd.addParameter("@ANN_SALARY", annSalary);
//			cmd.addParameter("@ANN_SALARY_PROP", annSalaryProp);
//			cmd.addParameter("@CHG_PCT_PROP", chgPctProp);
//			cmd.addParameter("@CHG_AMT_PROP", chgAmtProp);
//			cmd.addParameter("@OLD_APPT_PROP", oldApptProp);
//			cmd.addParameter("@APPT_PROP", apptProp);
//			cmd.addParameter("@APPT", appt);
//			cmd.addParameter("@OLD_FTE_PROP", oldFteProp);
//			cmd.addParameter("@FTE_PROP", fteProp);
//			cmd.addParameter("@FTE", fte);
//			cmd.addParameter("@HRS_DAY_PROP", hrsDayProp);
//			cmd.addParameter("@HRS_PAY_PROP", hrsPayProp);
//			cmd.addParameter("@SAL_TABLE_PROP", salTableProp);
//			cmd.addParameter("@SAL_GRADE_PROP", salGradeProp);
//			cmd.addParameter("@SAL_STEP_PROP", salStepProp);
//			cmd.addParameter("@OLD_STEP", oldStep);
//			cmd.addParameter("@FACTOR_PROP", factorProp);
//			cmd.addParameter("@FY_BUDG_PROP", fyBudgProp);
//			cmd.addParameter("@HIDE_IND", hideInd);
//			cmd.addParameter("@EXCL_TOTALS_IND", exclTotalsInd);
//			cmd.addParameter("@BUTTONSELECTED", buttonselected);
//				
//			cmd.execute();
//
//
//		}
//		
//		public static void pUpdatemasslist(NString roundFactor,NString hrlySalry,List<Twbklibs.Varchar2TabtypeRow> jcreCode,List<Twbklibs.Varchar2TabtypeRow> pct,List<Twbklibs.Varchar2TabtypeRow> amt,NString empfSeqno,NString orgnCode,NString posn,NString totalProrate) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKSJOB.P_UPDATEMASSLIST", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@ROUND_FACTOR", roundFactor);
//			cmd.addParameter("@HRLY_SALRY", hrlySalry);
//			// cmd.addParameter(DbTypes.getTableType("JCRE_CODE", "", jcreCode, object.class));
//			// cmd.addParameter(DbTypes.getTableType("PCT", "", pct, object.class));
//			// cmd.addParameter(DbTypes.getTableType("AMT", "", amt, object.class));
//			cmd.addParameter("@EMPF_SEQNO", empfSeqno);
//			cmd.addParameter("@ORGN_CODE", orgnCode);
//			cmd.addParameter("@POSN", posn);
//			cmd.addParameter("@TOTAL_PRORATE", totalProrate);
//				
//			cmd.execute();
//
//
//		}
		
	
	
	
}
