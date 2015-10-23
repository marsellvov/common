package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Utsuite {
		public static void add(NString nameIn,NString descIn,NBool remIfExistsIn,NString perMethodSetupIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTSUITE.ADD", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@NAME_IN", nameIn);
			cmd.addParameter("@DESC_IN", descIn);
			cmd.addParameter("@REM_IF_EXISTS_IN", remIfExistsIn);
			cmd.addParameter("@PER_METHOD_SETUP_IN", perMethodSetupIn);
				
			cmd.execute();


		}
		
		public static NNumber FidFromName(NString nameIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTSUITE.ID_FROM_NAME", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@NAME_IN", nameIn);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString FnameFromId(NNumber idIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTSUITE.NAME_FROM_ID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@ID_IN", idIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void onerow() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTSUITE.ONEROW", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void rem(NString nameIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTSUITE.REM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@NAME_IN", nameIn);
				
			cmd.execute();


		}
		
		public static void rem(NNumber idIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTSUITE.REM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@ID_IN", idIn);
				
			cmd.execute();


		}
		
		public static void showSuites(NString nameLikeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTSUITE.SHOW_SUITES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@NAME_LIKE_IN", nameLikeIn);
				
			cmd.execute();


		}
		
		public static DataCursor Fsuites(NString nameLikeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTSUITE.SUITES", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@NAME_LIKE_IN", nameLikeIn);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void upd(NString nameIn,NDate startIn,NDate endIn,NBool successfulIn,NString perMethodSetupIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTSUITE.UPD", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@NAME_IN", nameIn);
			cmd.addParameter("@START_IN", startIn);
			cmd.addParameter("@END_IN", endIn);
			cmd.addParameter("@SUCCESSFUL_IN", successfulIn);
			cmd.addParameter("@PER_METHOD_SETUP_IN", perMethodSetupIn);
				
			cmd.execute();


		}
		
		public static void upd(NNumber idIn,NDate startIn,NDate endIn,NBool successfulIn,NString perMethodSetupIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTSUITE.UPD", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@ID_IN", idIn);
			cmd.addParameter("@START_IN", startIn);
			cmd.addParameter("@END_IN", endIn);
			cmd.addParameter("@SUCCESSFUL_IN", successfulIn);
			cmd.addParameter("@PER_METHOD_SETUP_IN", perMethodSetupIn);
				
			cmd.execute();


		}
		
	
	
	
}
