package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class CtxOutput {
		public static void addEvent(NNumber event_) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_OUTPUT.ADD_EVENT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@EVENT", event_);
				
			cmd.execute();


		}
		
		public static void addTrace(NInteger traceId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_OUTPUT.ADD_TRACE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TRACE_ID", traceId);
				
			cmd.execute();


		}
		
		public static void disableQueryStats(NString indexname) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_OUTPUT.DISABLE_QUERY_STATS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@INDEXNAME", indexname);
				
			cmd.execute();


		}
		
		public static void enableQueryStats(NString indexname) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_OUTPUT.ENABLE_QUERY_STATS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@INDEXNAME", indexname);
				
			cmd.execute();


		}
		
		public static void endLog() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_OUTPUT.END_LOG", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void endQueryLog() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_OUTPUT.END_QUERY_LOG", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static NNumber FgetTraceValue(NInteger traceId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_OUTPUT.GET_TRACE_VALUE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@TRACE_ID", traceId);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static void logTraces() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_OUTPUT.LOG_TRACES", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static NString Flogfilename() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_OUTPUT.LOGFILENAME", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void removeEvent(NNumber event_) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_OUTPUT.REMOVE_EVENT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@EVENT", event_);
				
			cmd.execute();


		}
		
		public static void removeTrace(NInteger traceId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_OUTPUT.REMOVE_TRACE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TRACE_ID", traceId);
				
			cmd.execute();


		}
		
		public static void resetTrace(NInteger traceId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_OUTPUT.RESET_TRACE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TRACE_ID", traceId);
				
			cmd.execute();


		}
		
		public static void startLog(NString logfile,NBool overwrite) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_OUTPUT.START_LOG", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@LOGFILE", logfile);
			cmd.addParameter("@OVERWRITE", overwrite);
				
			cmd.execute();


		}
		
		public static void startQueryLog(NString logfile,NBool overwrite) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_OUTPUT.START_QUERY_LOG", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@LOGFILE", logfile);
			cmd.addParameter("@OVERWRITE", overwrite);
				
			cmd.execute();


		}
		
	
	
	
}
