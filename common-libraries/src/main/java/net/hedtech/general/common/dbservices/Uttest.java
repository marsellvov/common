package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Uttest {
		public static void add(NNumber packageIn,NString testIn,NString descIn,NInteger seqIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTTEST.ADD", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PACKAGE_IN", packageIn);
			cmd.addParameter("@TEST_IN", testIn);
			cmd.addParameter("@DESC_IN", descIn);
			cmd.addParameter("@SEQ_IN", seqIn);
				
			cmd.execute();


		}
		
		public static void add(NString packageIn,NString testIn,NString descIn,NInteger seqIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTTEST.ADD", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PACKAGE_IN", packageIn);
			cmd.addParameter("@TEST_IN", testIn);
			cmd.addParameter("@DESC_IN", descIn);
			cmd.addParameter("@SEQ_IN", seqIn);
				
			cmd.execute();


		}
		
		public static NNumber FidFromName(NString nameIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTTEST.ID_FROM_NAME", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@NAME_IN", nameIn);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString FnameFromId(NNumber idIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTTEST.NAME_FROM_ID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@ID_IN", idIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void rem(NNumber packageIn,NString testIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTTEST.REM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PACKAGE_IN", packageIn);
			cmd.addParameter("@TEST_IN", testIn);
				
			cmd.execute();


		}
		
		public static void rem(NString packageIn,NString testIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTTEST.REM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PACKAGE_IN", packageIn);
			cmd.addParameter("@TEST_IN", testIn);
				
			cmd.execute();


		}
		
		public static void upd(NNumber packageIn,NString testIn,NDate startIn,NDate endIn,NBool successfulIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTTEST.UPD", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PACKAGE_IN", packageIn);
			cmd.addParameter("@TEST_IN", testIn);
			cmd.addParameter("@START_IN", startIn);
			cmd.addParameter("@END_IN", endIn);
			cmd.addParameter("@SUCCESSFUL_IN", successfulIn);
				
			cmd.execute();


		}
		
		public static void upd(NString packageIn,NString testIn,NDate startIn,NDate endIn,NBool successfulIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTTEST.UPD", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PACKAGE_IN", packageIn);
			cmd.addParameter("@TEST_IN", testIn);
			cmd.addParameter("@START_IN", startIn);
			cmd.addParameter("@END_IN", endIn);
			cmd.addParameter("@SUCCESSFUL_IN", successfulIn);
				
			cmd.execute();


		}
		
	
	
	
}
