package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwgkorac {
		public static NString fString(NString pStringName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWGKORAC.F_STRING", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_STRING_NAME", pStringName);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pDispExistingMre(NNumber pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWGKORAC.P_DISP_EXISTING_MRE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();


		}
		
		public static void pDispResponseOptions(NString pHoldMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWGKORAC.P_DISP_RESPONSE_OPTIONS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_HOLD_MSG", pHoldMsg);
				
			cmd.execute();


		}
		
//		public static void pDispSelectedMre(NString pHispanic,NString pNotHispanic,List<Twbklibs.Varchar2TabtypeRow> pRace,NString pHoldMsg) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWGKORAC.P_DISP_SELECTED_MRE", DbManager.getDataBaseFactory());
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
		
		public static void pPrintEthnicity(NNumber pPidm,NString pgHispanic,NString pgNotHispanic) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWGKORAC.P_PRINT_ETHNICITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@PG_HISPANIC", pgHispanic);
			cmd.addParameter("@PG_NOT_HISPANIC", pgNotHispanic);
				
			cmd.execute();


		}
		
//		public static void pPrintMre(NNumber pPidm,NString pgHispanic,NString pgNotHispanic,List<Twbklibs.Varchar2TabtypeRow> pgRace) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWGKORAC.P_PRINT_MRE", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_PIDM", pPidm);
//			cmd.addParameter("@PG_HISPANIC", pgHispanic);
//			cmd.addParameter("@PG_NOT_HISPANIC", pgNotHispanic);
//			// cmd.addParameter(DbTypes.getTableType("PG_RACE", "", pgRace, object.class));
//				
//			cmd.execute();
//
//
//		}
//		
//		public static void pPrintMreSurvey(NNumber pPidm,NString pgHispanic,NString pgNotHispanic,List<Twbklibs.Varchar2TabtypeRow> pgRace,NString pHoldMsg) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWGKORAC.P_PRINT_MRE_SURVEY", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_PIDM", pPidm);
//			cmd.addParameter("@PG_HISPANIC", pgHispanic);
//			cmd.addParameter("@PG_NOT_HISPANIC", pgNotHispanic);
//			// cmd.addParameter(DbTypes.getTableType("PG_RACE", "", pgRace, object.class));
//			cmd.addParameter("@P_HOLD_MSG", pHoldMsg);
//				
//			cmd.execute();
//
//
//		}
//		
//		public static void pSaveMre(NNumber pPidm,NString pHispanic,NString pNotHispanic,List<Twbklibs.Varchar2TabtypeRow> pRace,NString pFromPage,NString pHoldMsg) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWGKORAC.P_SAVE_MRE", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_PIDM", pPidm);
//			cmd.addParameter("@P_HISPANIC", pHispanic);
//			cmd.addParameter("@P_NOT_HISPANIC", pNotHispanic);
//			// cmd.addParameter(DbTypes.getTableType("P_RACE", "", pRace, object.class));
//			cmd.addParameter("@P_FROM_PAGE", pFromPage);
//			cmd.addParameter("@P_HOLD_MSG", pHoldMsg);
//				
//			cmd.execute();
//
//
//		}
		
		public static void pSaveResponseOptions(NNumber pPidm,NString responseOption,NString pHoldMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWGKORAC.P_SAVE_RESPONSE_OPTIONS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@RESPONSE_OPTION", responseOption);
			cmd.addParameter("@P_HOLD_MSG", pHoldMsg);
				
			cmd.execute();


		}
		
//		public static void pSurveyDriver(NNumber pPidm,NString pgHispanic,NString pgNotHispanic,List<Twbklibs.Varchar2TabtypeRow> pgRace,NString pHoldMsg) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWGKORAC.P_SURVEY_DRIVER", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_PIDM", pPidm);
//			cmd.addParameter("@PG_HISPANIC", pgHispanic);
//			cmd.addParameter("@PG_NOT_HISPANIC", pgNotHispanic);
//			// cmd.addParameter(DbTypes.getTableType("PG_RACE", "", pgRace, object.class));
//			cmd.addParameter("@P_HOLD_MSG", pHoldMsg);
//				
//			cmd.execute();
//
//
//		}
//		
//	
	
	
}
