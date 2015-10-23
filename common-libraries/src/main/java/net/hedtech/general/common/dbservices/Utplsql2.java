package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Utplsql2 {
		public static NNumber FcurrentOutcome() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTPLSQL2.CURRENT_OUTCOME", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber FcurrentSuite() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTPLSQL2.CURRENT_SUITE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber FcurrentTestcase() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTPLSQL2.CURRENT_TESTCASE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber FcurrentUnittest() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTPLSQL2.CURRENT_UNITTEST", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber FcurrentUtp() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTPLSQL2.CURRENT_UTP", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static void moveAheadTcRunnum() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTPLSQL2.MOVE_AHEAD_TC_RUNNUM", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void notrc() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTPLSQL2.NOTRC", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static NNumber Frunnum() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTPLSQL2.RUNNUM", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static void setCurrentOutcome(NNumber outcomeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTPLSQL2.SET_CURRENT_OUTCOME", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@OUTCOME_IN", outcomeIn);
				
			cmd.execute();


		}
		
		public static void setCurrentSuite(NNumber suiteIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTPLSQL2.SET_CURRENT_SUITE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SUITE_IN", suiteIn);
				
			cmd.execute();


		}
		
		public static void setCurrentTestcase(NNumber testcaseIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTPLSQL2.SET_CURRENT_TESTCASE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TESTCASE_IN", testcaseIn);
				
			cmd.execute();


		}
		
		public static void setCurrentUnittest(NNumber unittestIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTPLSQL2.SET_CURRENT_UNITTEST", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@UNITTEST_IN", unittestIn);
				
			cmd.execute();


		}
		
		public static void setCurrentUtp(NNumber utpIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTPLSQL2.SET_CURRENT_UTP", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@UTP_IN", utpIn);
				
			cmd.execute();


		}
		
		public static void setRunnum() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTPLSQL2.SET_RUNNUM", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static NInteger FtcRunnum() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTPLSQL2.TC_RUNNUM", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static void test(NString programIn,NString ownerIn,NBool showResultsIn,NString namingModeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTPLSQL2.TEST", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PROGRAM_IN", programIn);
			cmd.addParameter("@OWNER_IN", ownerIn);
			cmd.addParameter("@SHOW_RESULTS_IN", showResultsIn);
			cmd.addParameter("@NAMING_MODE_IN", namingModeIn);
				
			cmd.execute();


		}
		
		public static void testsuite(NString suiteIn,NBool showResultsIn,NString namingModeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTPLSQL2.TESTSUITE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SUITE_IN", suiteIn);
			cmd.addParameter("@SHOW_RESULTS_IN", showResultsIn);
			cmd.addParameter("@NAMING_MODE_IN", namingModeIn);
				
			cmd.execute();


		}
		
		public static NBool Ftracing() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTPLSQL2.TRACING", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static void trc() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTPLSQL2.TRC", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
	
	
	
}
