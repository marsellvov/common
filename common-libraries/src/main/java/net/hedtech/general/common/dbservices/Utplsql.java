package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Utplsql {
		public static void addtest(NString packageIn,NString nameIn,NString prefixIn,NInteger iterationsIn,NBool overrideIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTPLSQL.ADDTEST", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PACKAGE_IN", packageIn);
			cmd.addParameter("@NAME_IN", nameIn);
			cmd.addParameter("@PREFIX_IN", prefixIn);
			cmd.addParameter("@ITERATIONS_IN", iterationsIn);
			cmd.addParameter("@OVERRIDE_IN", overrideIn);
				
			cmd.execute();


		}
		
		public static void addtest(NString nameIn,NString prefixIn,NInteger iterationsIn,NBool overrideIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTPLSQL.ADDTEST", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@NAME_IN", nameIn);
			cmd.addParameter("@PREFIX_IN", prefixIn);
			cmd.addParameter("@ITERATIONS_IN", iterationsIn);
			cmd.addParameter("@OVERRIDE_IN", overrideIn);
				
			cmd.execute();


		}
		
		public static NString Fbool2vc(NBool _bool) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTPLSQL.BOOL2VC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@BOOL", _bool);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString Fcurrpkg() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTPLSQL.CURRPKG", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NBool Fifelse(NBool boolIn,NBool tvalIn,NBool fvalIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTPLSQL.IFELSE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@BOOL_IN", boolIn);
			cmd.addParameter("@TVAL_IN", tvalIn);
			cmd.addParameter("@FVAL_IN", fvalIn);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NDate Fifelse(NBool boolIn,NDate tvalIn,NDate fvalIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTPLSQL.IFELSE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NDate.class);
			cmd.addParameter("@BOOL_IN", boolIn);
			cmd.addParameter("@TVAL_IN", tvalIn);
			cmd.addParameter("@FVAL_IN", fvalIn);
				
			cmd.execute();

			return cmd.getReturnValue(NDate.class);

		}
		
		public static NNumber Fifelse(NBool boolIn,NNumber tvalIn,NNumber fvalIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTPLSQL.IFELSE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@BOOL_IN", boolIn);
			cmd.addParameter("@TVAL_IN", tvalIn);
			cmd.addParameter("@FVAL_IN", fvalIn);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString Fifelse(NBool boolIn,NString tvalIn,NString fvalIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTPLSQL.IFELSE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@BOOL_IN", boolIn);
			cmd.addParameter("@TVAL_IN", tvalIn);
			cmd.addParameter("@FVAL_IN", fvalIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NBool Fispackage(NString progIn,NString schIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTPLSQL.ISPACKAGE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@PROG_IN", progIn);
			cmd.addParameter("@SCH_IN", schIn);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static void notrc() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTPLSQL.NOTRC", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void passdata(NString dataIn,NString delimIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTPLSQL.PASSDATA", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@DATA_IN", dataIn);
			cmd.addParameter("@DELIM_IN", delimIn);
				
			cmd.execute();


		}
		
		public static NString Fpkgname(NString packageIn,NBool samepackageIn,NString prefixIn,NBool ispkgIn,NString ownerIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTPLSQL.PKGNAME", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PACKAGE_IN", packageIn);
			cmd.addParameter("@SAMEPACKAGE_IN", samepackageIn);
			cmd.addParameter("@PREFIX_IN", prefixIn);
			cmd.addParameter("@ISPKG_IN", ispkgIn);
			cmd.addParameter("@OWNER_IN", ownerIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString Fpkgname(NString packageIn,NBool samepackageIn,NString prefixIn,NString ownerIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTPLSQL.PKGNAME", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PACKAGE_IN", packageIn);
			cmd.addParameter("@SAMEPACKAGE_IN", samepackageIn);
			cmd.addParameter("@PREFIX_IN", prefixIn);
			cmd.addParameter("@OWNER_IN", ownerIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString Fprogname(NString programIn,NBool samepackageIn,NString prefixIn,NBool ispkgIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTPLSQL.PROGNAME", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PROGRAM_IN", programIn);
			cmd.addParameter("@SAMEPACKAGE_IN", samepackageIn);
			cmd.addParameter("@PREFIX_IN", prefixIn);
			cmd.addParameter("@ISPKG_IN", ispkgIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString Fprogname(NString programIn,NBool samepackageIn,NString prefixIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTPLSQL.PROGNAME", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PROGRAM_IN", programIn);
			cmd.addParameter("@SAMEPACKAGE_IN", samepackageIn);
			cmd.addParameter("@PREFIX_IN", prefixIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void run(NString testpackageIn,NString prefixIn,NString suiteIn,NString ownerIn,NBool resetResultsIn,NBool fromSuiteIn,NString subprogramIn,NBool perMethodSetupIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTPLSQL.RUN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TESTPACKAGE_IN", testpackageIn);
			cmd.addParameter("@PREFIX_IN", prefixIn);
			cmd.addParameter("@SUITE_IN", suiteIn);
			cmd.addParameter("@OWNER_IN", ownerIn);
			cmd.addParameter("@RESET_RESULTS_IN", resetResultsIn);
			cmd.addParameter("@FROM_SUITE_IN", fromSuiteIn);
			cmd.addParameter("@SUBPROGRAM_IN", subprogramIn);
			cmd.addParameter("@PER_METHOD_SETUP_IN", perMethodSetupIn);
				
			cmd.execute();


		}
		
		public static void runsuite(NString suiteIn,NBool resetResultsIn,NBool perMethodSetupIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTPLSQL.RUNSUITE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SUITE_IN", suiteIn);
			cmd.addParameter("@RESET_RESULTS_IN", resetResultsIn);
			cmd.addParameter("@PER_METHOD_SETUP_IN", perMethodSetupIn);
				
			cmd.execute();


		}
		
		public static NInteger Fseqval(NString tabIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTPLSQL.SEQVAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
			cmd.addParameter("@TAB_IN", tabIn);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static void setcase(NString caseIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTPLSQL.SETCASE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@CASE_IN", caseIn);
				
			cmd.execute();


		}
		
		public static void setdata(NString dirIn,NString fileIn,NString delimIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTPLSQL.SETDATA", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@DIR_IN", dirIn);
			cmd.addParameter("@FILE_IN", fileIn);
			cmd.addParameter("@DELIM_IN", delimIn);
				
			cmd.execute();


		}
		
		public static void test(NString packageIn,NBool samepackageIn,NString prefixIn,NBool recompileIn,NString dirIn,NString suiteIn,NString ownerIn,NBool resetResultsIn,NBool fromSuiteIn,NString subprogramIn,NBool perMethodSetupIn,NString overridePackageIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTPLSQL.TEST", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PACKAGE_IN", packageIn);
			cmd.addParameter("@SAMEPACKAGE_IN", samepackageIn);
			cmd.addParameter("@PREFIX_IN", prefixIn);
			cmd.addParameter("@RECOMPILE_IN", recompileIn);
			cmd.addParameter("@DIR_IN", dirIn);
			cmd.addParameter("@SUITE_IN", suiteIn);
			cmd.addParameter("@OWNER_IN", ownerIn);
			cmd.addParameter("@RESET_RESULTS_IN", resetResultsIn);
			cmd.addParameter("@FROM_SUITE_IN", fromSuiteIn);
			cmd.addParameter("@SUBPROGRAM_IN", subprogramIn);
			cmd.addParameter("@PER_METHOD_SETUP_IN", perMethodSetupIn);
			cmd.addParameter("@OVERRIDE_PACKAGE_IN", overridePackageIn);
				
			cmd.execute();


		}
		
		public static void testsuite(NString suiteIn,NBool recompileIn,NBool resetResultsIn,NBool perMethodSetupIn,NBool overridePackageIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTPLSQL.TESTSUITE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SUITE_IN", suiteIn);
			cmd.addParameter("@RECOMPILE_IN", recompileIn);
			cmd.addParameter("@RESET_RESULTS_IN", resetResultsIn);
			cmd.addParameter("@PER_METHOD_SETUP_IN", perMethodSetupIn);
			cmd.addParameter("@OVERRIDE_PACKAGE_IN", overridePackageIn);
				
			cmd.execute();


		}
		
		public static NBool Ftracing() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTPLSQL.TRACING", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static void trc() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTPLSQL.TRC", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static NBool Fvc2bool(NString vc) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTPLSQL.VC2BOOL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@VC", vc);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NString Fversion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTPLSQL.VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
	
	
	
}
