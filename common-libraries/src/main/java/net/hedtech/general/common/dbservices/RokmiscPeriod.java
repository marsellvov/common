package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class RokmiscPeriod {
		public static NNumber fCalcAttendStudAdjHrs(NString pPeriod,NNumber pPidm,NDate pAttendDate,NString pRepeatInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKMISC_PERIOD.F_CALC_ATTEND_STUD_ADJ_HRS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_PERIOD", pPeriod);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_ATTEND_DATE", pAttendDate);
			cmd.addParameter("@P_REPEAT_IND", pRepeatInd);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fCalcAttendStudBillHrs(NString pPeriod,NNumber pPidm,NDate pAttendDate,NString pRepeatInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKMISC_PERIOD.F_CALC_ATTEND_STUD_BILL_HRS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_PERIOD", pPeriod);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_ATTEND_DATE", pAttendDate);
			cmd.addParameter("@P_REPEAT_IND", pRepeatInd);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fCalcAttendStudCreditHrs(NString pPeriod,NNumber pPidm,NDate pAttendDate,NString pRepeatInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKMISC_PERIOD.F_CALC_ATTEND_STUD_CREDIT_HRS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_PERIOD", pPeriod);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_ATTEND_DATE", pAttendDate);
			cmd.addParameter("@P_REPEAT_IND", pRepeatInd);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fCalcEarnedHours(NString pPeriod,NNumber pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKMISC_PERIOD.F_CALC_EARNED_HOURS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_PERIOD", pPeriod);
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fCalcExitAdjHrs(NString pPeriod,NNumber pPidm,NString pEnrrCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKMISC_PERIOD.F_CALC_EXIT_ADJ_HRS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_PERIOD", pPeriod);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_ENRR_CODE", pEnrrCode);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fCalcFaAdjHrs(NString pPeriod,NNumber pPidm,NString pEnrrCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKMISC_PERIOD.F_CALC_FA_ADJ_HRS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_PERIOD", pPeriod);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_ENRR_CODE", pEnrrCode);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fCalcFaBillHrs(NString pPeriod,NNumber pPidm,NString pEnrrCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKMISC_PERIOD.F_CALC_FA_BILL_HRS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_PERIOD", pPeriod);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_ENRR_CODE", pEnrrCode);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fCalcFaCreditHrs(NString pPeriod,NNumber pPidm,NString pEnrrCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKMISC_PERIOD.F_CALC_FA_CREDIT_HRS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_PERIOD", pPeriod);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_ENRR_CODE", pEnrrCode);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fCalcStudAdjHrs(NString pPeriod,NNumber pPidm,NString pRepeatInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKMISC_PERIOD.F_CALC_STUD_ADJ_HRS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_PERIOD", pPeriod);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_REPEAT_IND", pRepeatInd);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fCalcStudBillHrs(NString pPeriod,NNumber pPidm,NString pRepeatInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKMISC_PERIOD.F_CALC_STUD_BILL_HRS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_PERIOD", pPeriod);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_REPEAT_IND", pRepeatInd);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fCalcStudCreditHrs(NString pPeriod,NNumber pPidm,NString pRepeatInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKMISC_PERIOD.F_CALC_STUD_CREDIT_HRS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_PERIOD", pPeriod);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_REPEAT_IND", pRepeatInd);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NDate fGetFaFirstAttendDate(NString pPeriod,NNumber pPidm,NString pEnrrCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKMISC_PERIOD.F_GET_FA_FIRST_ATTEND_DATE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NDate.class);
			cmd.addParameter("@P_PERIOD", pPeriod);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_ENRR_CODE", pEnrrCode);
				
			cmd.execute();

			return cmd.getReturnValue(NDate.class);

		}
		
		public static NString fGetOlrCourseExists(NString pPeriod,NNumber pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKMISC_PERIOD.F_GET_OLR_COURSE_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PERIOD", pPeriod);
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetStcrArInd(NString pPeriod,NNumber pPidm,NString pAidyCode,NString pEnrrCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKMISC_PERIOD.F_GET_STCR_AR_IND", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PERIOD", pPeriod);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_ENRR_CODE", pEnrrCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NDate fGetStudFirstAttendDate(NString pPeriod,NNumber pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKMISC_PERIOD.F_GET_STUD_FIRST_ATTEND_DATE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NDate.class);
			cmd.addParameter("@P_PERIOD", pPeriod);
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();

			return cmd.getReturnValue(NDate.class);

		}
		
		public static void pReschedFundTermDisburse(NString pPeriod,NString pAidyCode,NNumber pPidm,NString pFundCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKMISC_PERIOD.P_RESCHED_FUND_TERM_DISBURSE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PERIOD", pPeriod);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
				
			cmd.execute();


		}
		
		public static void pReschedFundYearDisburse(NString pAidyCode,NNumber pPidm,NString pFundCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKMISC_PERIOD.P_RESCHED_FUND_YEAR_DISBURSE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
				
			cmd.execute();


		}
		
		public static void pReschedTermDisburse(NString pPeriod,NString pAidyCode,NNumber pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKMISC_PERIOD.P_RESCHED_TERM_DISBURSE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PERIOD", pPeriod);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();


		}
		
		public static void pReschedYearDisburse(NString pAidyCode,NNumber pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKMISC_PERIOD.P_RESCHED_YEAR_DISBURSE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();


		}
		
	
	
	
}
