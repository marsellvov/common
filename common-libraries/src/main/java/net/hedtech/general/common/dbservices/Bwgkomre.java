package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwgkomre {
		public static void pPrintMessage() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWGKOMRE.P_PRINT_MESSAGE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pRacesurvey(NString pMenuInd,NString pRedirect,NString pRetLocation,NString pHoldMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWGKOMRE.P_RACESURVEY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_MENU_IND", pMenuInd);
			cmd.addParameter("@P_REDIRECT", pRedirect);
			cmd.addParameter("@P_RET_LOCATION", pRetLocation);
			cmd.addParameter("@P_HOLD_MSG", pHoldMsg);
				
			cmd.execute();


		}
		
//		public static void pRacesurveyconfirm(NString pgHispanic,NString pgNotHispanic,List<Twbklibs.Varchar2TabtypeRow> pgRace,NString pHoldMsg,NString btnselected) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWGKOMRE.P_RACESURVEYCONFIRM", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@PG_HISPANIC", pgHispanic);
//			cmd.addParameter("@PG_NOT_HISPANIC", pgNotHispanic);
//			// cmd.addParameter(DbTypes.getTableType("PG_RACE", "", pgRace, object.class));
//			cmd.addParameter("@P_HOLD_MSG", pHoldMsg);
//			cmd.addParameter("@BTNSELECTED", btnselected);
//				
//			cmd.execute();
//
//
//		}
		
		public static void pRacesurveyoptions(NString pHoldMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWGKOMRE.P_RACESURVEYOPTIONS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_HOLD_MSG", pHoldMsg);
				
			cmd.execute();


		}
		
		public static void pRacesurveyoptionssave(NString responseOption,NString pHoldMsg,NString btnselected) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWGKOMRE.P_RACESURVEYOPTIONSSAVE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@RESPONSE_OPTION", responseOption);
			cmd.addParameter("@P_HOLD_MSG", pHoldMsg);
			cmd.addParameter("@BTNSELECTED", btnselected);
				
			cmd.execute();


		}
//		
//		public static void pRacesurveysave(NString pHispanic,NString pNotHispanic,List<Twbklibs.Varchar2TabtypeRow> pRace,NString pHoldMsg,NString btnselected) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWGKOMRE.P_RACESURVEYSAVE", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_HISPANIC", pHispanic);
//			cmd.addParameter("@P_NOT_HISPANIC", pNotHispanic);
//			// cmd.addParameter(DbTypes.getTableType("P_RACE", "", pRace, object.class));
//			cmd.addParameter("@P_HOLD_MSG", pHoldMsg);
//			cmd.addParameter("@BTNSELECTED", btnselected);
//				
//			cmd.execute();
//
//
//		}
//		
//		public static void pRacesurveyselection(NString pHispanic,NString pNotHispanic,List<Twbklibs.Varchar2TabtypeRow> pRace,NString pHoldMsg) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWGKOMRE.P_RACESURVEYSELECTION", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_HISPANIC", pHispanic);
//			cmd.addParameter("@P_NOT_HISPANIC", pNotHispanic);
//			// cmd.addParameter(DbTypes.getTableType("P_RACE", "", pRace, object.class));
//			cmd.addParameter("@P_HOLD_MSG", pHoldMsg);
//				
//			cmd.execute();
//
//
//		}
//		
//		public static void pSelectethnicityrace(NString pHispanic,NString pNotHispanic,List<Twbklibs.Varchar2TabtypeRow> pRace,NString btnselected) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWGKOMRE.P_SELECTETHNICITYRACE", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_HISPANIC", pHispanic);
//			cmd.addParameter("@P_NOT_HISPANIC", pNotHispanic);
//			// cmd.addParameter(DbTypes.getTableType("P_RACE", "", pRace, object.class));
//			cmd.addParameter("@BTNSELECTED", btnselected);
//				
//			cmd.execute();
//
//
//		}
//		
//		public static void pUpdateethnicityrace(NString pgHispanic,NString pgNotHispanic,List<Twbklibs.Varchar2TabtypeRow> pgRace,NString btnselected) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWGKOMRE.P_UPDATEETHNICITYRACE", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@PG_HISPANIC", pgHispanic);
//			cmd.addParameter("@PG_NOT_HISPANIC", pgNotHispanic);
//			// cmd.addParameter(DbTypes.getTableType("PG_RACE", "", pgRace, object.class));
//			cmd.addParameter("@BTNSELECTED", btnselected);
//				
//			cmd.execute();
//
//
//		}
		
		public static void pViewethnicityrace() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWGKOMRE.P_VIEWETHNICITYRACE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
	
	
	
}
