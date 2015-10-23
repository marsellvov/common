package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Utreport {
		public static void afterErrors(NNumber runId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTREPORT.AFTER_ERRORS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@RUN_ID", runId);
				
			cmd.execute();


		}
		
		public static void afterResults(NNumber runId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTREPORT.AFTER_RESULTS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@RUN_ID", runId);
				
			cmd.execute();


		}
		
		public static void beforeErrors(NNumber runId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTREPORT.BEFORE_ERRORS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@RUN_ID", runId);
				
			cmd.execute();


		}
		
		public static void beforeResults(NNumber runId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTREPORT.BEFORE_RESULTS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@RUN_ID", runId);
				
			cmd.execute();


		}
		
		public static void close() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTREPORT.CLOSE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void open() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTREPORT.OPEN", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pl(NString str) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTREPORT.PL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@STR", str);
				
			cmd.execute();


		}
		
		public static void pl(NBool _bool) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTREPORT.PL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@BOOL", _bool);
				
			cmd.execute();


		}
		
		public static void showError() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTREPORT.SHOW_ERROR", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void showFailure() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTREPORT.SHOW_FAILURE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void showResult() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTREPORT.SHOW_RESULT", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void use(NString reporter) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTREPORT.USE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@REPORTER", reporter);
				
			cmd.execute();


		}
		
		public static NString F_using() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTREPORT.USING", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
	
	
	
}
