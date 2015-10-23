package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwlkoffh {
		public static void pDisplayOfficeHours(NString termIn,NString crnIn,NString nameIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWLKOFFH.P_DISPLAY_OFFICE_HOURS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@CRN_IN", crnIn);
			cmd.addParameter("@NAME_IN", nameIn);
				
			cmd.execute();


		}
		
		public static void pFacOfficeHours(NString term,NString crn,NString msgIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWLKOFFH.P_FAC_OFFICE_HOURS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM", term);
			cmd.addParameter("@CRN", crn);
			cmd.addParameter("@MSG_IN", msgIn);
				
			cmd.execute();


		}
		
//		public static void pFacOfficeHrsPost(NString termIn,NString crnIn,List<OwaUtil.IdentArrRow> selFromTime,List<OwaUtil.IdentArrRow> selToTime,List<OwaUtil.IdentArrRow> selDayMon,List<OwaUtil.IdentArrRow> selDayTue,List<OwaUtil.IdentArrRow> selDayWed,List<OwaUtil.IdentArrRow> selDayThu,List<OwaUtil.IdentArrRow> selDayFri,List<OwaUtil.IdentArrRow> selDaySat,List<OwaUtil.IdentArrRow> selDaySun,List<OwaUtil.IdentArrRow> selPhoneCode,List<OwaUtil.VcArrRow> selLoc,List<OwaUtil.IdentArrRow> selFromDate,List<OwaUtil.IdentArrRow> selToDate,List<OwaUtil.IdentArrRow> selDisplay,NString selCopy,NNumber numRows) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWLKOFFH.P_FAC_OFFICE_HRS_POST", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@TERM_IN", termIn);
//			cmd.addParameter("@CRN_IN", crnIn);
//			// cmd.addParameter(DbTypes.getTableType("SEL_FROM_TIME", "", selFromTime, object.class));
//			// cmd.addParameter(DbTypes.getTableType("SEL_TO_TIME", "", selToTime, object.class));
//			// cmd.addParameter(DbTypes.getTableType("SEL_DAY_MON", "", selDayMon, object.class));
//			// cmd.addParameter(DbTypes.getTableType("SEL_DAY_TUE", "", selDayTue, object.class));
//			// cmd.addParameter(DbTypes.getTableType("SEL_DAY_WED", "", selDayWed, object.class));
//			// cmd.addParameter(DbTypes.getTableType("SEL_DAY_THU", "", selDayThu, object.class));
//			// cmd.addParameter(DbTypes.getTableType("SEL_DAY_FRI", "", selDayFri, object.class));
//			// cmd.addParameter(DbTypes.getTableType("SEL_DAY_SAT", "", selDaySat, object.class));
//			// cmd.addParameter(DbTypes.getTableType("SEL_DAY_SUN", "", selDaySun, object.class));
//			// cmd.addParameter(DbTypes.getTableType("SEL_PHONE_CODE", "", selPhoneCode, object.class));
//			// cmd.addParameter(DbTypes.getTableType("SEL_LOC", "", selLoc, object.class));
//			// cmd.addParameter(DbTypes.getTableType("SEL_FROM_DATE", "", selFromDate, object.class));
//			// cmd.addParameter(DbTypes.getTableType("SEL_TO_DATE", "", selToDate, object.class));
//			// cmd.addParameter(DbTypes.getTableType("SEL_DISPLAY", "", selDisplay, object.class));
//			cmd.addParameter("@SEL_COPY", selCopy);
//			cmd.addParameter("@NUM_ROWS", numRows);
//				
//			cmd.execute();
//
//
//		}
//		
		public static void pSelOfficeHours(NNumber numRows,NString termIn,NString crnIn,NDate fromDateIn,NDate toDateIn,NString fromTimeIn,NString toTimeIn,NString displayIn,NString locIn,NString phoneCodeIn,NString sunDayIn,NString monDayIn,NString tueDayIn,NString wedDayIn,NString thuDayIn,NString friDayIn,NString satDayIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWLKOFFH.P_SEL_OFFICE_HOURS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@NUM_ROWS", numRows);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@CRN_IN", crnIn);
			cmd.addParameter("@FROM_DATE_IN", fromDateIn);
			cmd.addParameter("@TO_DATE_IN", toDateIn);
			cmd.addParameter("@FROM_TIME_IN", fromTimeIn);
			cmd.addParameter("@TO_TIME_IN", toTimeIn);
			cmd.addParameter("@DISPLAY_IN", displayIn);
			cmd.addParameter("@LOC_IN", locIn);
			cmd.addParameter("@PHONE_CODE_IN", phoneCodeIn);
			cmd.addParameter("@SUN_DAY_IN", sunDayIn);
			cmd.addParameter("@MON_DAY_IN", monDayIn);
			cmd.addParameter("@TUE_DAY_IN", tueDayIn);
			cmd.addParameter("@WED_DAY_IN", wedDayIn);
			cmd.addParameter("@THU_DAY_IN", thuDayIn);
			cmd.addParameter("@FRI_DAY_IN", friDayIn);
			cmd.addParameter("@SAT_DAY_IN", satDayIn);
				
			cmd.execute();


		}
		
	
	
	
}
