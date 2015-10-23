package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwpksmex {
//		public static void pCheckextractlist(List<Twbklibs.Varchar2TabtypeRow> extractscenarioselected,List<Twbklibs.Varchar2TabtypeRow> coaorgnselected,NString inclSuborg,NString recNo,NString buttonselected) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKSMEX.P_CHECKEXTRACTLIST", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("EXTRACTSCENARIOSELECTED", "", extractscenarioselected, object.class));
//			// cmd.addParameter(DbTypes.getTableType("COAORGNSELECTED", "", coaorgnselected, object.class));
//			cmd.addParameter("@INCL_SUBORG", inclSuborg);
//			cmd.addParameter("@REC_NO", recNo);
//			cmd.addParameter("@BUTTONSELECTED", buttonselected);
//				
//			cmd.execute();
//
//
//		}
		
		public static void pDispmultipleemployee(NNumber startNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKSMEX.P_DISPMULTIPLEEMPLOYEE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@START_NO", startNo);
				
			cmd.execute();


		}
		
		public static void pDispmultipleemployeepost(NNumber startNo,NNumber endNo,NString buttonselected) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKSMEX.P_DISPMULTIPLEEMPLOYEEPOST", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@START_NO", startNo);
			cmd.addParameter("@END_NO", endNo);
			cmd.addParameter("@BUTTONSELECTED", buttonselected);
				
			cmd.execute();


		}
		
		public static void pDispmultiplepositions(NNumber startNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKSMEX.P_DISPMULTIPLEPOSITIONS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@START_NO", startNo);
				
			cmd.execute();


		}
		
		public static void pDispmultiplepositionspost(NNumber startNo,NNumber endNo,NString buttonselected) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKSMEX.P_DISPMULTIPLEPOSITIONSPOST", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@START_NO", startNo);
			cmd.addParameter("@END_NO", endNo);
			cmd.addParameter("@BUTTONSELECTED", buttonselected);
				
			cmd.execute();


		}
		
		public static void pDispsumtotals(NString organization,NString coa) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKSMEX.P_DISPSUMTOTALS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@ORGANIZATION", organization);
			cmd.addParameter("@COA", coa);
				
			cmd.execute();


		}
		
		public static void pPrintemployee(NString organization,NString extractId,NString scenario,NNumber seqno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKSMEX.P_PRINTEMPLOYEE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@ORGANIZATION", organization);
			cmd.addParameter("@EXTRACT_ID", extractId);
			cmd.addParameter("@SCENARIO", scenario);
			cmd.addParameter("@SEQNO", seqno);
				
			cmd.execute();


		}
		
		public static void pPrintorganization(NString organization,NString extractId,NString scenario,NString predOrgn,NString inclSuborg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKSMEX.P_PRINTORGANIZATION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@ORGANIZATION", organization);
			cmd.addParameter("@EXTRACT_ID", extractId);
			cmd.addParameter("@SCENARIO", scenario);
			cmd.addParameter("@PRED_ORGN", predOrgn);
			cmd.addParameter("@INCL_SUBORG", inclSuborg);
				
			cmd.execute();


		}
		
		public static void pPrintposition(NString organization,NString extractId,NString scenario,NNumber seqno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKSMEX.P_PRINTPOSITION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@ORGANIZATION", organization);
			cmd.addParameter("@EXTRACT_ID", extractId);
			cmd.addParameter("@SCENARIO", scenario);
			cmd.addParameter("@SEQNO", seqno);
				
			cmd.execute();


		}
		
//		public static void pViewextracts(List<Twbklibs.Varchar2TabtypeRow> extractscenarioselected,List<Twbklibs.Varchar2TabtypeRow> coaorgnselected,NString inclSuborg) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKSMEX.P_VIEWEXTRACTS", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("EXTRACTSCENARIOSELECTED", "", extractscenarioselected, object.class));
//			// cmd.addParameter(DbTypes.getTableType("COAORGNSELECTED", "", coaorgnselected, object.class));
//			cmd.addParameter("@INCL_SUBORG", inclSuborg);
//				
//			cmd.execute();
//
//
//		}
//		
//	
	
	
}
