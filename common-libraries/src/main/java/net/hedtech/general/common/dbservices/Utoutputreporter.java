package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Utoutputreporter {
		public static void afterErrors(NNumber runId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTOUTPUTREPORTER.AFTER_ERRORS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@RUN_ID", runId);
				
			cmd.execute();


		}
		
		public static void afterResults(NNumber runId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTOUTPUTREPORTER.AFTER_RESULTS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@RUN_ID", runId);
				
			cmd.execute();


		}
		
		public static void beforeErrors(NNumber runId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTOUTPUTREPORTER.BEFORE_ERRORS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@RUN_ID", runId);
				
			cmd.execute();


		}
		
		public static void beforeResults(NNumber runId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTOUTPUTREPORTER.BEFORE_RESULTS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@RUN_ID", runId);
				
			cmd.execute();


		}
		
		public static void close() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTOUTPUTREPORTER.CLOSE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void open() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTOUTPUTREPORTER.OPEN", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pl(NString str) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTOUTPUTREPORTER.PL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@STR", str);
				
			cmd.execute();


		}
		
		public static void showError() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTOUTPUTREPORTER.SHOW_ERROR", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void showFailure() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTOUTPUTREPORTER.SHOW_FAILURE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void showResult() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTOUTPUTREPORTER.SHOW_RESULT", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
	
	
	
}
