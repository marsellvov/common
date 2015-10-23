package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Utrutp {
		public static void clearAllButLast(NString ownerIn,NString programIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTRUTP.CLEAR_ALL_BUT_LAST", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@OWNER_IN", ownerIn);
			cmd.addParameter("@PROGRAM_IN", programIn);
				
			cmd.execute();


		}
		
		public static void clearResults(NNumber runIdIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTRUTP.CLEAR_RESULTS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@RUN_ID_IN", runIdIn);
				
			cmd.execute();


		}
		
		public static void clearResults(NString ownerIn,NString programIn,NDate startFromIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTRUTP.CLEAR_RESULTS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@OWNER_IN", ownerIn);
			cmd.addParameter("@PROGRAM_IN", programIn);
			cmd.addParameter("@START_FROM_IN", startFromIn);
				
			cmd.execute();


		}
		
		public static void initiate(NNumber runIdIn,NNumber utpIdIn,NDate startOnIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTRUTP.INITIATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@RUN_ID_IN", runIdIn);
			cmd.addParameter("@UTP_ID_IN", utpIdIn);
			cmd.addParameter("@START_ON_IN", startOnIn);
				
			cmd.execute();


		}
		
		public static NString FlastRunStatus(NString ownerIn,NString programIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTRUTP.LAST_RUN_STATUS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@OWNER_IN", ownerIn);
			cmd.addParameter("@PROGRAM_IN", programIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void terminate(NNumber runIdIn,NNumber utpIdIn,NDate endOnIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTRUTP.TERMINATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@RUN_ID_IN", runIdIn);
			cmd.addParameter("@UTP_ID_IN", utpIdIn);
			cmd.addParameter("@END_ON_IN", endOnIn);
				
			cmd.execute();


		}
		
	
	
	
}
