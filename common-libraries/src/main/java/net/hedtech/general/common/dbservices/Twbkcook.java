package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Twbkcook {
		public static void pMain(NString junk) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKCOOK.P_MAIN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@JUNK", junk);
				
			cmd.execute();


		}
		
		public static void pRandom() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKCOOK.P_RANDOM", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pRandomClear() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKCOOK.P_RANDOM_CLEAR", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pRandomDisplay() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKCOOK.P_RANDOM_DISPLAY", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pRandomSeed(NString pLogin) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKCOOK.P_RANDOM_SEED", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_LOGIN", pLogin);
				
			cmd.execute();


		}
		
		public static void pRandom1() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKCOOK.P_RANDOM1", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pRandom2() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKCOOK.P_RANDOM2", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTrace(NString inStr) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKCOOK.P_TRACE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@IN_STR", inStr);
				
			cmd.execute();


		}
		
		public static void pTraceAfter() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKCOOK.P_TRACE_AFTER", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTraceBefore() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKCOOK.P_TRACE_BEFORE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTraceClear(NString junk) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKCOOK.P_TRACE_CLEAR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@JUNK", junk);
				
			cmd.execute();


		}
		
		public static void pTraceDisplay(NString junk) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKCOOK.P_TRACE_DISPLAY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@JUNK", junk);
				
			cmd.execute();


		}
		
	
	
	
}
