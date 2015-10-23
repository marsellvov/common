package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Rokwflb {
		public static NString fCheckAllAwards(NNumber pidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKWFLB.F_CHECK_ALL_AWARDS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PIDM", pidm);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fCheckCurrentAidyAward(NNumber pidm,NString termCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKWFLB.F_CHECK_CURRENT_AIDY_AWARD", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@TERM_CODE", termCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fCheckEndOfAidYear(NString aidyCode,NDate compDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKWFLB.F_CHECK_END_OF_AID_YEAR", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@AIDY_CODE", aidyCode);
			cmd.addParameter("@COMP_DATE", compDate);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fCheckEndOfPeriod(NString period,NDate compDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKWFLB.F_CHECK_END_OF_PERIOD", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PERIOD", period);
			cmd.addParameter("@COMP_DATE", compDate);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fCheckEndOfTerm(NString termCode,NDate compDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKWFLB.F_CHECK_END_OF_TERM", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@TERM_CODE", termCode);
			cmd.addParameter("@COMP_DATE", compDate);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fCheckForExitInterview(NNumber pidm,NString aidyCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKWFLB.F_CHECK_FOR_EXIT_INTERVIEW", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@AIDY_CODE", aidyCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fCheckFutureTermDisbursed(NNumber pidm,NString termCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKWFLB.F_CHECK_FUTURE_TERM_DISBURSED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@TERM_CODE", termCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fCheckTitleivLoans(NNumber pidm,NString termCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKWFLB.F_CHECK_TITLEIV_LOANS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@TERM_CODE", termCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fCheckUnpaidAwards(NNumber pidm,NString termCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKWFLB.F_CHECK_UNPAID_AWARDS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@TERM_CODE", termCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fCheckUnprocessedAid(NNumber pidm,NString termCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKWFLB.F_CHECK_UNPROCESSED_AID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@TERM_CODE", termCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fCheckWorkstudy(NNumber pidm,NString aidyCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKWFLB.F_CHECK_WORKSTUDY", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@AIDY_CODE", aidyCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fPeriodCurrentAidyAward(NNumber pidm,NString period) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKWFLB.F_PERIOD_CURRENT_AIDY_AWARD", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@PERIOD", period);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fPeriodFutureTermDisbursed(NNumber pidm,NString period) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKWFLB.F_PERIOD_FUTURE_TERM_DISBURSED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@PERIOD", period);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fPeriodTitleivLoans(NNumber pidm,NString period) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKWFLB.F_PERIOD_TITLEIV_LOANS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@PERIOD", period);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fPeriodUnpaidAwards(NNumber pidm,NString period) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKWFLB.F_PERIOD_UNPAID_AWARDS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@PERIOD", period);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fPeriodUnprocessedAid(NNumber pidm,NString period) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKWFLB.F_PERIOD_UNPROCESSED_AID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@PERIOD", period);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
	
	
	
}
