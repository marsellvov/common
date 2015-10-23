package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Cwm2OlapManager {
		public static void beginLog(NString pDirectory,NString pFile,NString pAppend) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_MANAGER.BEGIN_LOG", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DIRECTORY", pDirectory);
			cmd.addParameter("@P_FILE", pFile);
			cmd.addParameter("@P_APPEND", pAppend);
				
			cmd.execute();


		}
		
		public static void endLog() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_MANAGER.END_LOG", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void logMessage(NString pMessageName,NString pInsertText1,NString pInsertText2,NString pInsertText3,NString pInsertText4,NString pInsertText5) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_MANAGER.LOG_MESSAGE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_MESSAGE_NAME", pMessageName);
			cmd.addParameter("@P_INSERT_TEXT1", pInsertText1);
			cmd.addParameter("@P_INSERT_TEXT2", pInsertText2);
			cmd.addParameter("@P_INSERT_TEXT3", pInsertText3);
			cmd.addParameter("@P_INSERT_TEXT4", pInsertText4);
			cmd.addParameter("@P_INSERT_TEXT5", pInsertText5);
				
			cmd.execute();


		}
		
		public static void logMessageForced(NString pMessageName,NString pInsertText1,NString pInsertText2,NString pInsertText3,NString pInsertText4,NString pInsertText5) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_MANAGER.LOG_MESSAGE_FORCED", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_MESSAGE_NAME", pMessageName);
			cmd.addParameter("@P_INSERT_TEXT1", pInsertText1);
			cmd.addParameter("@P_INSERT_TEXT2", pInsertText2);
			cmd.addParameter("@P_INSERT_TEXT3", pInsertText3);
			cmd.addParameter("@P_INSERT_TEXT4", pInsertText4);
			cmd.addParameter("@P_INSERT_TEXT5", pInsertText5);
				
			cmd.execute();


		}
		
		public static void logNote(NString pMessage) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_MANAGER.LOG_NOTE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_MESSAGE", pMessage);
				
			cmd.execute();


		}
		
		public static void logNoteForced(NString pMessage) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_MANAGER.LOG_NOTE_FORCED", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_MESSAGE", pMessage);
				
			cmd.execute();


		}
		
		public static void logRawMessages() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_MANAGER.LOG_RAW_MESSAGES", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void setEchoOff() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_MANAGER.SET_ECHO_OFF", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void setEchoOn() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_MANAGER.SET_ECHO_ON", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
	
	
	
}
