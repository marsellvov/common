package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Sakchkb {
		public static void pIntlInschecklist(NNumber pidm,NString applRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SAKCHKB.P_INTL_INSCHECKLIST", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@APPL_ROWID", applRowid);
				
			cmd.execute();


		}
		
		public static void pIntlUpdchecklist(NNumber pidm,NString applRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SAKCHKB.P_INTL_UPDCHECKLIST", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@APPL_ROWID", applRowid);
				
			cmd.execute();


		}
		
		public static void pIntlUpdcomment(NNumber pidm,NString applRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SAKCHKB.P_INTL_UPDCOMMENT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@APPL_ROWID", applRowid);
				
			cmd.execute();


		}
		
		public static void pNewappchecklist(NNumber pidm,NString term,NNumber applno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SAKCHKB.P_NEWAPPCHECKLIST", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@TERM", term);
			cmd.addParameter("@APPLNO", applno);
				
			cmd.execute();


		}
		
		public static void pSarchkbInschecklist(NNumber pidm,NString term,NNumber applno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SAKCHKB.P_SARCHKB_INSCHECKLIST", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@TERM", term);
			cmd.addParameter("@APPLNO", applno);
				
			cmd.execute();


		}
		
		public static void pSorhschInschecklist(NNumber pidm,NString applRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SAKCHKB.P_SORHSCH_INSCHECKLIST", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@APPL_ROWID", applRowid);
				
			cmd.execute();


		}
		
		public static void pSorhschUpdchecklist(NNumber pidm,NString applRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SAKCHKB.P_SORHSCH_UPDCHECKLIST", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@APPL_ROWID", applRowid);
				
			cmd.execute();


		}
		
		public static void pSorhschUpdcomment(NNumber pidm,NString applRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SAKCHKB.P_SORHSCH_UPDCOMMENT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@APPL_ROWID", applRowid);
				
			cmd.execute();


		}
		
		public static void pSorpcolInschecklist(NNumber pidm,NString applRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SAKCHKB.P_SORPCOL_INSCHECKLIST", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@APPL_ROWID", applRowid);
				
			cmd.execute();


		}
		
		public static void pSorpcolUpdchecklist(NNumber pidm,NString applRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SAKCHKB.P_SORPCOL_UPDCHECKLIST", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@APPL_ROWID", applRowid);
				
			cmd.execute();


		}
		
		public static void pSorpcolUpdcomment(NNumber pidm,NString applRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SAKCHKB.P_SORPCOL_UPDCOMMENT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@APPL_ROWID", applRowid);
				
			cmd.execute();


		}
		
		public static void pSortestInschecklist(NNumber pidm,NString applRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SAKCHKB.P_SORTEST_INSCHECKLIST", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@APPL_ROWID", applRowid);
				
			cmd.execute();


		}
		
		public static void pSortestUpdchecklist(NNumber pidm,NString applRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SAKCHKB.P_SORTEST_UPDCHECKLIST", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@APPL_ROWID", applRowid);
				
			cmd.execute();


		}
		
		public static void pUpdappchecklist(NNumber pidm,NString term,NNumber applno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SAKCHKB.P_UPDAPPCHECKLIST", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@TERM", term);
			cmd.addParameter("@APPLNO", applno);
				
			cmd.execute();


		}
		
		public static void pUpdappstatus(NNumber pidm,NString applRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SAKCHKB.P_UPDAPPSTATUS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@APPL_ROWID", applRowid);
				
			cmd.execute();


		}
		
		public static void pUpdatestatus(NNumber pidm,NNumber applno,NString term,NString status,NDate statusDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SAKCHKB.P_UPDATESTATUS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@APPLNO", applno);
			cmd.addParameter("@TERM", term);
			cmd.addParameter("@STATUS", status);
			cmd.addParameter("@STATUS_DATE", statusDate);
				
			cmd.execute();


		}
		
	
	
	
}
