package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class GpStreamsUtil {
		public static void pConfigureRules(NString pProcessCodeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GP_STREAMS_UTIL.P_CONFIGURE_RULES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PROCESS_CODE_IN", pProcessCodeIn);
				
			cmd.execute();


		}
		
		public static void pCreateStreams(NString pProcessCodeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GP_STREAMS_UTIL.P_CREATE_STREAMS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PROCESS_CODE_IN", pProcessCodeIn);
				
			cmd.execute();


		}
		
		public static void pRemoveStreams(NString pProcessCodeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GP_STREAMS_UTIL.P_REMOVE_STREAMS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PROCESS_CODE_IN", pProcessCodeIn);
				
			cmd.execute();


		}
		
		public static void pStartApply(NString pProcessCodeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GP_STREAMS_UTIL.P_START_APPLY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PROCESS_CODE_IN", pProcessCodeIn);
				
			cmd.execute();


		}
		
		public static void pStartCapture(NString pProcessCodeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GP_STREAMS_UTIL.P_START_CAPTURE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PROCESS_CODE_IN", pProcessCodeIn);
				
			cmd.execute();


		}
		
		public static void pStopApply(NString pProcessCodeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GP_STREAMS_UTIL.P_STOP_APPLY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PROCESS_CODE_IN", pProcessCodeIn);
				
			cmd.execute();


		}
		
		public static void pStopCapture(NString pProcessCodeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GP_STREAMS_UTIL.P_STOP_CAPTURE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PROCESS_CODE_IN", pProcessCodeIn);
				
			cmd.execute();


		}
		
	
	
	
}
