package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Shkmods {
		public static void pInsertShrattc() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKMODS.P_INSERT_SHRATTC", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pInsertShrchrt() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKMODS.P_INSERT_SHRCHRT", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pInsertShrgcol() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKMODS.P_INSERT_SHRGCOL", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pInsertShrgpac() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKMODS.P_INSERT_SHRGPAC", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pInsertShrgpal() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKMODS.P_INSERT_SHRGPAL", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pInsertShrinst() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKMODS.P_INSERT_SHRINST", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pInsertShrinstFromSirasgn(NString termIn,NString crnIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKMODS.P_INSERT_SHRINST_FROM_SIRASGN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@CRN_IN", crnIn);
				
			cmd.execute();


		}
		
		public static void pInsertShrlgpa() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKMODS.P_INSERT_SHRLGPA", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pInsertShrtckd() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKMODS.P_INSERT_SHRTCKD", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pInsertShrtckg() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKMODS.P_INSERT_SHRTCKG", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pInsertShrtckl() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKMODS.P_INSERT_SHRTCKL", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pInsertShrtckn() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKMODS.P_INSERT_SHRTCKN", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pInsertShrtgpa() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKMODS.P_INSERT_SHRTGPA", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pInsertShrttrm() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKMODS.P_INSERT_SHRTTRM", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pInsertSotprnt() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKMODS.P_INSERT_SOTPRNT", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pUpdateShrgpal() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKMODS.P_UPDATE_SHRGPAL", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pUpdateShrlgpa() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKMODS.P_UPDATE_SHRLGPA", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pUpdateShrttrm() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKMODS.P_UPDATE_SHRTTRM", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
	
	
	
}
