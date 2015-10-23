package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Rfkdefa {
		public static void pDefaultAwardSchedule(NString pAidyCode,NString pAprdCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RFKDEFA.P_DEFAULT_AWARD_SCHEDULE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_APRD_CODE", pAprdCode);
				
			cmd.execute();


		}
		
		public static void pDefaultDisbSchedule(NString pAidyCode,NString pAprdCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RFKDEFA.P_DEFAULT_DISB_SCHEDULE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_APRD_CODE", pAprdCode);
				
			cmd.execute();


		}
		
		public static void pDeleteAwardSchedule(NString pAidyCode,NString pAprdCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RFKDEFA.P_DELETE_AWARD_SCHEDULE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_APRD_CODE", pAprdCode);
				
			cmd.execute();


		}
		
		public static void pDeleteDisbSchedule(NString pAidyCode,NString pAprdCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RFKDEFA.P_DELETE_DISB_SCHEDULE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_APRD_CODE", pAprdCode);
				
			cmd.execute();


		}
		
		public static void pFinalizeAwardSchedule(NString pAidyCode,NString pAprdCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RFKDEFA.P_FINALIZE_AWARD_SCHEDULE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_APRD_CODE", pAprdCode);
				
			cmd.execute();


		}
		
		public static void pFinalizeDisbSchedule(NString pAidyCode,NString pAprdCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RFKDEFA.P_FINALIZE_DISB_SCHEDULE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_APRD_CODE", pAprdCode);
				
			cmd.execute();


		}
		
		public static void pFinalizeSchedules(NString pAidyCode,NString pAprdCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RFKDEFA.P_FINALIZE_SCHEDULES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_APRD_CODE", pAprdCode);
				
			cmd.execute();


		}
		
	
	
	
}
