package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class HtmldbMail {
		public static void background() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_MAIL.BACKGROUND", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pushQueue() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_MAIL.PUSH_QUEUE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pushQueueBackground() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_MAIL.PUSH_QUEUE_BACKGROUND", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void send() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_MAIL.SEND", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
//		public static void send() {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_MAIL.SEND", DbManager.getDataBaseFactory());
//			
//				
//			cmd.execute();
//
//
//		}
		
//		public static void send() {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_MAIL.SEND", DbManager.getDataBaseFactory());
//			
//				
//			cmd.execute();
//
//
//		}
		
//		public static void send() {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_MAIL.SEND", DbManager.getDataBaseFactory());
//			
//				
//			cmd.execute();
//
//
//		}
		
	
	
	
}
