package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Utroutcome {
		public static void clearAllButLast(NString ownerIn,NString programIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTROUTCOME.CLEAR_ALL_BUT_LAST", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@OWNER_IN", ownerIn);
			cmd.addParameter("@PROGRAM_IN", programIn);
				
			cmd.execute();


		}
		
		public static void clearResults(NNumber runIdIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTROUTCOME.CLEAR_RESULTS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@RUN_ID_IN", runIdIn);
				
			cmd.execute();


		}
		
		public static void clearResults(NString ownerIn,NString programIn,NDate startFromIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTROUTCOME.CLEAR_RESULTS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@OWNER_IN", ownerIn);
			cmd.addParameter("@PROGRAM_IN", programIn);
			cmd.addParameter("@START_FROM_IN", startFromIn);
				
			cmd.execute();


		}
		
		public static void initiate(NNumber runIdIn,NNumber outcomeIdIn,NDate startOnIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTROUTCOME.INITIATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@RUN_ID_IN", runIdIn);
			cmd.addParameter("@OUTCOME_ID_IN", outcomeIdIn);
			cmd.addParameter("@START_ON_IN", startOnIn);
				
			cmd.execute();


		}
		
		public static NNumber FnextV1Id(NNumber runIdIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTROUTCOME.NEXT_V1_ID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@RUN_ID_IN", runIdIn);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static void record(NNumber runIdIn,NInteger tcRunIdIn,NNumber outcomeIdIn,NBool testFailedIn,NString descriptionIn,NDate endOnIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTROUTCOME.RECORD", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@RUN_ID_IN", runIdIn);
			cmd.addParameter("@TC_RUN_ID_IN", tcRunIdIn);
			cmd.addParameter("@OUTCOME_ID_IN", outcomeIdIn);
			cmd.addParameter("@TEST_FAILED_IN", testFailedIn);
			cmd.addParameter("@DESCRIPTION_IN", descriptionIn);
			cmd.addParameter("@END_ON_IN", endOnIn);
				
			cmd.execute();


		}
		
	
	
	
}
