package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class UtUtoutput {
		public static void utCount() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UT_UTOUTPUT.UT_COUNT", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void utExtract() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UT_UTOUTPUT.UT_EXTRACT", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void utNextline() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UT_UTOUTPUT.UT_NEXTLINE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void utReplace() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UT_UTOUTPUT.UT_REPLACE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void utSaving() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UT_UTOUTPUT.UT_SAVING", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void utSetup() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UT_UTOUTPUT.UT_SETUP", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void utTeardown() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UT_UTOUTPUT.UT_TEARDOWN", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
	
	
	
}
