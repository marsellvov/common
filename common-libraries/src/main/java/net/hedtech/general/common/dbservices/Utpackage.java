package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Utpackage {
		public static void add(NString suiteIn,NString packageIn,NBool samepackageIn,NString prefixIn,NString dirIn,NInteger seqIn,NString ownerIn,NBool addTestsIn,NBool testOverloadsIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTPACKAGE.ADD", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SUITE_IN", suiteIn);
			cmd.addParameter("@PACKAGE_IN", packageIn);
			cmd.addParameter("@SAMEPACKAGE_IN", samepackageIn);
			cmd.addParameter("@PREFIX_IN", prefixIn);
			cmd.addParameter("@DIR_IN", dirIn);
			cmd.addParameter("@SEQ_IN", seqIn);
			cmd.addParameter("@OWNER_IN", ownerIn);
			cmd.addParameter("@ADD_TESTS_IN", addTestsIn);
			cmd.addParameter("@TEST_OVERLOADS_IN", testOverloadsIn);
				
			cmd.execute();


		}
		
		public static void add(NNumber suiteIn,NString packageIn,NBool samepackageIn,NString prefixIn,NString dirIn,NInteger seqIn,NString ownerIn,NBool addTestsIn,NBool testOverloadsIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTPACKAGE.ADD", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SUITE_IN", suiteIn);
			cmd.addParameter("@PACKAGE_IN", packageIn);
			cmd.addParameter("@SAMEPACKAGE_IN", samepackageIn);
			cmd.addParameter("@PREFIX_IN", prefixIn);
			cmd.addParameter("@DIR_IN", dirIn);
			cmd.addParameter("@SEQ_IN", seqIn);
			cmd.addParameter("@OWNER_IN", ownerIn);
			cmd.addParameter("@ADD_TESTS_IN", addTestsIn);
			cmd.addParameter("@TEST_OVERLOADS_IN", testOverloadsIn);
				
			cmd.execute();


		}
		
		public static NNumber FidFromName(NString nameIn,NString ownerIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTPACKAGE.ID_FROM_NAME", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@NAME_IN", nameIn);
			cmd.addParameter("@OWNER_IN", ownerIn);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString FnameFromId(NNumber idIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTPACKAGE.NAME_FROM_ID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@ID_IN", idIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void rem(NString suiteIn,NString packageIn,NString ownerIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTPACKAGE.REM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SUITE_IN", suiteIn);
			cmd.addParameter("@PACKAGE_IN", packageIn);
			cmd.addParameter("@OWNER_IN", ownerIn);
				
			cmd.execute();


		}
		
		public static void rem(NNumber suiteIn,NString packageIn,NString ownerIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTPACKAGE.REM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SUITE_IN", suiteIn);
			cmd.addParameter("@PACKAGE_IN", packageIn);
			cmd.addParameter("@OWNER_IN", ownerIn);
				
			cmd.execute();


		}
		
		public static void upd(NString suiteIn,NString packageIn,NDate startIn,NDate endIn,NBool successfulIn,NString ownerIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTPACKAGE.UPD", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SUITE_IN", suiteIn);
			cmd.addParameter("@PACKAGE_IN", packageIn);
			cmd.addParameter("@START_IN", startIn);
			cmd.addParameter("@END_IN", endIn);
			cmd.addParameter("@SUCCESSFUL_IN", successfulIn);
			cmd.addParameter("@OWNER_IN", ownerIn);
				
			cmd.execute();


		}
		
		public static void upd(NNumber suiteIdIn,NString packageIn,NDate startIn,NDate endIn,NBool successfulIn,NString ownerIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTPACKAGE.UPD", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SUITE_ID_IN", suiteIdIn);
			cmd.addParameter("@PACKAGE_IN", packageIn);
			cmd.addParameter("@START_IN", startIn);
			cmd.addParameter("@END_IN", endIn);
			cmd.addParameter("@SUCCESSFUL_IN", successfulIn);
			cmd.addParameter("@OWNER_IN", ownerIn);
				
			cmd.execute();


		}
		
	
	
	
}
