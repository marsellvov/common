package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwakadvs {
		public static void pFindAnAdvisor() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWAKADVS.P_FIND_AN_ADVISOR", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pInsertAdvisor(NNumber newYear,NString actcCode,NString dottCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWAKADVS.P_INSERT_ADVISOR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@NEW_YEAR", newYear);
			cmd.addParameter("@ACTC_CODE", actcCode);
			cmd.addParameter("@DOTT_CODE", dottCode);
				
			cmd.execute();


		}
		
		public static void pMakeMeAnAdvisor() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWAKADVS.P_MAKE_ME_AN_ADVISOR", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pNextsearchresults(NString srchRowid,NString srchClassYear,NString srchDegcCode,NString srchMajrCode,NString srchActcCode,NString srchDottCode,NString srchSiccCode,NString srchCity,NString srchStatCode,NNumber howMany,NString ehisRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWAKADVS.P_NEXTSEARCHRESULTS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SRCH_ROWID", srchRowid);
			cmd.addParameter("@SRCH_CLASS_YEAR", srchClassYear);
			cmd.addParameter("@SRCH_DEGC_CODE", srchDegcCode);
			cmd.addParameter("@SRCH_MAJR_CODE", srchMajrCode);
			cmd.addParameter("@SRCH_ACTC_CODE", srchActcCode);
			cmd.addParameter("@SRCH_DOTT_CODE", srchDottCode);
			cmd.addParameter("@SRCH_SICC_CODE", srchSiccCode);
			cmd.addParameter("@SRCH_CITY", srchCity);
			cmd.addParameter("@SRCH_STAT_CODE", srchStatCode);
			cmd.addParameter("@HOW_MANY", howMany);
			cmd.addParameter("@EHIS_ROWID", ehisRowid);
				
			cmd.execute();


		}
		
		public static void pSearchresults(NString srchRowid,NString srchClassYear,NString srchDegcCode,NString srchMajrCode,NString srchActcCode,NString srchDottCode,NString srchSiccCode,NString srchCity,NString srchStatCode,NNumber howMany,NString ehisRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWAKADVS.P_SEARCHRESULTS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SRCH_ROWID", srchRowid);
			cmd.addParameter("@SRCH_CLASS_YEAR", srchClassYear);
			cmd.addParameter("@SRCH_DEGC_CODE", srchDegcCode);
			cmd.addParameter("@SRCH_MAJR_CODE", srchMajrCode);
			cmd.addParameter("@SRCH_ACTC_CODE", srchActcCode);
			cmd.addParameter("@SRCH_DOTT_CODE", srchDottCode);
			cmd.addParameter("@SRCH_SICC_CODE", srchSiccCode);
			cmd.addParameter("@SRCH_CITY", srchCity);
			cmd.addParameter("@SRCH_STAT_CODE", srchStatCode);
			cmd.addParameter("@HOW_MANY", howMany);
			cmd.addParameter("@EHIS_ROWID", ehisRowid);
				
			cmd.execute();


		}
		
		public static void pShowAdvisorYears() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWAKADVS.P_SHOW_ADVISOR_YEARS", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
	
	
	
}
