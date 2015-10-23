package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Uttestcase {
		public static void add(NNumber testIn,NString testcaseIn,NString descIn,NInteger seqIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTTESTCASE.ADD", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TEST_IN", testIn);
			cmd.addParameter("@TESTCASE_IN", testcaseIn);
			cmd.addParameter("@DESC_IN", descIn);
			cmd.addParameter("@SEQ_IN", seqIn);
				
			cmd.execute();


		}
		
		public static void add(NString testIn,NString testcaseIn,NString descIn,NInteger seqIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTTESTCASE.ADD", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TEST_IN", testIn);
			cmd.addParameter("@TESTCASE_IN", testcaseIn);
			cmd.addParameter("@DESC_IN", descIn);
			cmd.addParameter("@SEQ_IN", seqIn);
				
			cmd.execute();


		}
		
		public static NNumber FidFromName(NString nameIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTTESTCASE.ID_FROM_NAME", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@NAME_IN", nameIn);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString FnameFromId(NNumber idIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTTESTCASE.NAME_FROM_ID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@ID_IN", idIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void rem(NNumber testIn,NString testcaseIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTTESTCASE.REM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TEST_IN", testIn);
			cmd.addParameter("@TESTCASE_IN", testcaseIn);
				
			cmd.execute();


		}
		
		public static void rem(NString testIn,NString testcaseIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTTESTCASE.REM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TEST_IN", testIn);
			cmd.addParameter("@TESTCASE_IN", testcaseIn);
				
			cmd.execute();


		}
		
		public static void upd(NNumber testIn,NString testcaseIn,NDate startIn,NDate endIn,NBool successfulIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTTESTCASE.UPD", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TEST_IN", testIn);
			cmd.addParameter("@TESTCASE_IN", testcaseIn);
			cmd.addParameter("@START_IN", startIn);
			cmd.addParameter("@END_IN", endIn);
			cmd.addParameter("@SUCCESSFUL_IN", successfulIn);
				
			cmd.execute();


		}
		
		public static void upd(NString testIn,NString testcaseIn,NDate startIn,NDate endIn,NBool successfulIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTTESTCASE.UPD", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TEST_IN", testIn);
			cmd.addParameter("@TESTCASE_IN", testcaseIn);
			cmd.addParameter("@START_IN", startIn);
			cmd.addParameter("@END_IN", endIn);
			cmd.addParameter("@SUCCESSFUL_IN", successfulIn);
				
			cmd.execute();


		}
		
	
	
	
}
