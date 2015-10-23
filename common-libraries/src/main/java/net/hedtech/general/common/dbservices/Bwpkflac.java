package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwpkflac {
		public static void pChooseempfilters(NString termCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKFLAC.P_CHOOSEEMPFILTERS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM_CODE", termCode);
				
			cmd.execute();


		}
		
		public static void pChoosefilters(NString pTerm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKFLAC.P_CHOOSEFILTERS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TERM", pTerm);
				
			cmd.execute();


		}
		
		public static void pDispempsearchresults(NString termCode,NString lastName,NString firstName,NString emplId,NString recNo,NString startNo,NString buttonselected) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKFLAC.P_DISPEMPSEARCHRESULTS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM_CODE", termCode);
			cmd.addParameter("@LAST_NAME", lastName);
			cmd.addParameter("@FIRST_NAME", firstName);
			cmd.addParameter("@EMPL_ID", emplId);
			cmd.addParameter("@REC_NO", recNo);
			cmd.addParameter("@START_NO", startNo);
			cmd.addParameter("@BUTTONSELECTED", buttonselected);
				
			cmd.execute();


		}
		
		public static void pFilterbyorgn(NString pTerm,NString pOrgn,NString pCoasCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKFLAC.P_FILTERBYORGN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TERM", pTerm);
			cmd.addParameter("@P_ORGN", pOrgn);
			cmd.addParameter("@P_COAS_CODE", pCoasCode);
				
			cmd.execute();


		}
		
//		public static void pFilterdriver(NString pgTerm,List<Twbklibs.Varchar2TabtypeRow> pgPtrm,List<Twbklibs.Varchar2TabtypeRow> pgCamp,List<Twbklibs.Varchar2TabtypeRow> pgColl,List<Twbklibs.Varchar2TabtypeRow> pgOrgn,NString pgInclSuborg,NString pgRecNo,NString pgInclNist,NString btnselected) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKFLAC.P_FILTERDRIVER", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@PG_TERM", pgTerm);
//			// cmd.addParameter(DbTypes.getTableType("PG_PTRM", "", pgPtrm, object.class));
//			// cmd.addParameter(DbTypes.getTableType("PG_CAMP", "", pgCamp, object.class));
//			// cmd.addParameter(DbTypes.getTableType("PG_COLL", "", pgColl, object.class));
//			// cmd.addParameter(DbTypes.getTableType("PG_ORGN", "", pgOrgn, object.class));
//			cmd.addParameter("@PG_INCL_SUBORG", pgInclSuborg);
//			cmd.addParameter("@PG_REC_NO", pgRecNo);
//			cmd.addParameter("@PG_INCL_NIST", pgInclNist);
//			cmd.addParameter("@BTNSELECTED", btnselected);
//				
//			cmd.execute();
//
//
//		}
//		
		public static void pPrintAccessDenied() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKFLAC.P_PRINT_ACCESS_DENIED", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
	
	
	
}
