package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Rokmisc {
		public static NNumber fCalcAttendFaAdjHrs(NString pTermCode,NNumber pPidm,NDate pAttendDate,NString pEnrrCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKMISC.F_CALC_ATTEND_FA_ADJ_HRS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_ATTEND_DATE", pAttendDate);
			cmd.addParameter("@P_ENRR_CODE", pEnrrCode);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fCalcAttendFaBillHrs(NString pTermCode,NNumber pPidm,NDate pAttendDate,NString pEnrrCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKMISC.F_CALC_ATTEND_FA_BILL_HRS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_ATTEND_DATE", pAttendDate);
			cmd.addParameter("@P_ENRR_CODE", pEnrrCode);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fCalcAttendFaCreditHrs(NString pTermCode,NNumber pPidm,NDate pAttendDate,NString pEnrrCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKMISC.F_CALC_ATTEND_FA_CREDIT_HRS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_ATTEND_DATE", pAttendDate);
			cmd.addParameter("@P_ENRR_CODE", pEnrrCode);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fCalcAttendStudAdjHrs(NString pTermCode,NNumber pPidm,NDate pAttendDate,NString pRepeatInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKMISC.F_CALC_ATTEND_STUD_ADJ_HRS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_ATTEND_DATE", pAttendDate);
			cmd.addParameter("@P_REPEAT_IND", pRepeatInd);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fCalcAttendStudBillHrs(NString pTermCode,NNumber pPidm,NDate pAttendDate,NString pRepeatInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKMISC.F_CALC_ATTEND_STUD_BILL_HRS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_ATTEND_DATE", pAttendDate);
			cmd.addParameter("@P_REPEAT_IND", pRepeatInd);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fCalcAttendStudCreditHrs(NString pTermCode,NNumber pPidm,NDate pAttendDate,NString pRepeatInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKMISC.F_CALC_ATTEND_STUD_CREDIT_HRS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_ATTEND_DATE", pAttendDate);
			cmd.addParameter("@P_REPEAT_IND", pRepeatInd);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fCalcEarnedHours(NString pTermCode,NNumber pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKMISC.F_CALC_EARNED_HOURS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fCalcStudAdjHrs(NString pTermCode,NNumber pPidm,NString pRepeatInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKMISC.F_CALC_STUD_ADJ_HRS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_REPEAT_IND", pRepeatInd);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fCalcStudBillHrs(NString pTermCode,NNumber pPidm,NString pRepeatInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKMISC.F_CALC_STUD_BILL_HRS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_REPEAT_IND", pRepeatInd);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fCalcStudCreditHrs(NString pTermCode,NNumber pPidm,NString pRepeatInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKMISC.F_CALC_STUD_CREDIT_HRS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_REPEAT_IND", pRepeatInd);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NDate fGetFaFirstAttendDate(NString pTermCode,NNumber pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKMISC.F_GET_FA_FIRST_ATTEND_DATE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NDate.class);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();

			return cmd.getReturnValue(NDate.class);

		}
		
		public static NString fGetOlrCourseExists(NString pTermCode,NNumber pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKMISC.F_GET_OLR_COURSE_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NDate fGetStudFirstAttendDate(NString pTermCode,NNumber pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKMISC.F_GET_STUD_FIRST_ATTEND_DATE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NDate.class);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();

			return cmd.getReturnValue(NDate.class);

		}
		
		public static NDate fGetValidScheduleDate(NString pAidyCode,NNumber pPidm,NString pTermCode,NString pFundCode,NDate pSchedDate,NDate pCurrSchedDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKMISC.F_GET_VALID_SCHEDULE_DATE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NDate.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_SCHED_DATE", pSchedDate);
			cmd.addParameter("@P_CURR_SCHED_DATE", pCurrSchedDate);
				
			cmd.execute();

			return cmd.getReturnValue(NDate.class);

		}
		
		public static void pReschedFundTermDisburse(NString pTermCode,NNumber pPidm,NString pFundCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKMISC.P_RESCHED_FUND_TERM_DISBURSE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
				
			cmd.execute();


		}
		
		public static void pReschedFundYearDisburse(NString pAidyCode,NNumber pPidm,NString pFundCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKMISC.P_RESCHED_FUND_YEAR_DISBURSE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
				
			cmd.execute();


		}
		
		public static void pReschedTermDisburse(NString pTermCode,NNumber pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKMISC.P_RESCHED_TERM_DISBURSE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();


		}
		
		public static void pReschedYearDisburse(NString pAidyCode,NNumber pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKMISC.P_RESCHED_YEAR_DISBURSE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();


		}
		
	
	
	
}
