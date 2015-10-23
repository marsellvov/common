package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Sfkwdrl {
		public static NDate fCalMidpoint(NString termIn,NDate startDateIn,NDate endDateIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKWDRL.F_CAL_MIDPOINT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NDate.class);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@START_DATE_IN", startDateIn);
			cmd.addParameter("@END_DATE_IN", endDateIn);
				
			cmd.execute();

			return cmd.getReturnValue(NDate.class);

		}
		
		public static NNumber fCalcattenddays(NNumber pidmIn,NString termIn,NDate startDateIn,NDate wdrlDateIn,NNumber leaveDaysIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKWDRL.F_CALCATTENDDAYS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@START_DATE_IN", startDateIn);
			cmd.addParameter("@WDRL_DATE_IN", wdrlDateIn);
			cmd.addParameter("@LEAVE_DAYS_IN", leaveDaysIn);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fCalcenrldays(NNumber pidmIn,NString termIn,NDate startDateIn,NDate endDateIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKWDRL.F_CALCENRLDAYS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@START_DATE_IN", startDateIn);
			cmd.addParameter("@END_DATE_IN", endDateIn);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NBool fCheckOlrEnrl(NNumber pidmIn,NString termIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKWDRL.F_CHECK_OLR_ENRL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@TERM_IN", termIn);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NNumber fCountattendbreakdays(NNumber pidmIn,NString termIn,NDate startDateIn,NDate wdrlDateIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKWDRL.F_COUNTATTENDBREAKDAYS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@START_DATE_IN", startDateIn);
			cmd.addParameter("@WDRL_DATE_IN", wdrlDateIn);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fCountbreakdays(NString termIn,NDate fromDateIn,NDate toDateIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKWDRL.F_COUNTBREAKDAYS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@FROM_DATE_IN", fromDateIn);
			cmd.addParameter("@TO_DATE_IN", toDateIn);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fCountenrlbreakdays(NNumber pidmIn,NString termIn,NDate startDateIn,NDate endDateIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKWDRL.F_COUNTENRLBREAKDAYS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@START_DATE_IN", startDateIn);
			cmd.addParameter("@END_DATE_IN", endDateIn);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NDate fPerioddate(NNumber pidmIn,NString termIn,NString typeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKWDRL.F_PERIODDATE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NDate.class);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@TYPE_IN", typeIn);
				
			cmd.execute();

			return cmd.getReturnValue(NDate.class);

		}
		
		public static NNumber fTivWdExists(NNumber pidmIn,NString aidyIn,NString termIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKWDRL.F_TIV_WD_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@AIDY_IN", aidyIn);
			cmd.addParameter("@TERM_IN", termIn);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fWdExists(NNumber pidmIn,NString aidyIn,NString termIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKWDRL.F_WD_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@AIDY_IN", aidyIn);
			cmd.addParameter("@TERM_IN", termIn);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static void pCalccharges(NNumber pidmIn,NString termIn,Ref<NNumber> origChgs,Ref<NNumber> nonOrigChgs,Ref<NNumber> netInstChgs) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKWDRL.P_CALCCHARGES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@ORIG_CHGS", NNumber.class);
			cmd.addParameter("@NON_ORIG_CHGS", NNumber.class);
			cmd.addParameter("@NET_INST_CHGS", NNumber.class);
				
			cmd.execute();
			origChgs.val = cmd.getParameterValue("@ORIG_CHGS", NNumber.class);
			nonOrigChgs.val = cmd.getParameterValue("@NON_ORIG_CHGS", NNumber.class);
			netInstChgs.val = cmd.getParameterValue("@NET_INST_CHGS", NNumber.class);


		}
		
		public static void pGetOlrDates(NNumber pidmIn,NString termIn,Ref<NDate> startDateout,Ref<NDate> endDateout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKWDRL.P_GET_OLR_DATES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@START_DATEOUT", NDate.class);
			cmd.addParameter("@END_DATEOUT", NDate.class);
				
			cmd.execute();
			startDateout.val = cmd.getParameterValue("@START_DATEOUT", NDate.class);
			endDateout.val = cmd.getParameterValue("@END_DATEOUT", NDate.class);


		}
		
	
	
	
}
