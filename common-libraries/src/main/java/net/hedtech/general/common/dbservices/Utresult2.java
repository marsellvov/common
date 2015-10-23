package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Utresult2 {
		public static void report(NNumber outcomeIn,NString descriptionIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTRESULT2.REPORT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@OUTCOME_IN", outcomeIn);
			cmd.addParameter("@DESCRIPTION_IN", descriptionIn);
				
			cmd.execute();


		}
		
		public static void report(NNumber outcomeIn,NBool testFailedIn,NString descriptionIn,NBool registerIn,NBool showresultsIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTRESULT2.REPORT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@OUTCOME_IN", outcomeIn);
			cmd.addParameter("@TEST_FAILED_IN", testFailedIn);
			cmd.addParameter("@DESCRIPTION_IN", descriptionIn);
			cmd.addParameter("@REGISTER_IN", registerIn);
			cmd.addParameter("@SHOWRESULTS_IN", showresultsIn);
				
			cmd.execute();


		}
		
		public static DataCursor FresultsDetails(NNumber runIdIn,NString showFailuresOnlyIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTRESULT2.RESULTS_DETAILS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@RUN_ID_IN", runIdIn);
			cmd.addParameter("@SHOW_FAILURES_ONLY_IN", showFailuresOnlyIn);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor FresultsHeaders(NString schemaIn,NString programIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTRESULT2.RESULTS_HEADERS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@SCHEMA_IN", schemaIn);
			cmd.addParameter("@PROGRAM_IN", programIn);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static NString FrunStatus(NNumber runnumIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTRESULT2.RUN_STATUS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@RUNNUM_IN", runnumIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NBool FrunSucceeded(NNumber runnumIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTRESULT2.RUN_SUCCEEDED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@RUNNUM_IN", runnumIn);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NString FunittestStatus(NNumber runnumIn,NNumber unittestIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTRESULT2.UNITTEST_STATUS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@RUNNUM_IN", runnumIn);
			cmd.addParameter("@UNITTEST_IN", unittestIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NBool FunittestSucceeded(NNumber runnumIn,NNumber unittestIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTRESULT2.UNITTEST_SUCCEEDED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@RUNNUM_IN", runnumIn);
			cmd.addParameter("@UNITTEST_IN", unittestIn);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NString FutpStatus(NNumber runnumIn,NNumber utpIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTRESULT2.UTP_STATUS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@RUNNUM_IN", runnumIn);
			cmd.addParameter("@UTP_IN", utpIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NBool FutpSucceeded(NNumber runnumIn,NNumber utpIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTRESULT2.UTP_SUCCEEDED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@RUNNUM_IN", runnumIn);
			cmd.addParameter("@UTP_IN", utpIn);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
	
	
	
}
