package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class UtGbAddress {
		public static void utSetup() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UT_GB_ADDRESS.UT_SETUP", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void utTeardown() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UT_GB_ADDRESS.UT_TEARDOWN", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void utUnittest() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UT_GB_ADDRESS.UT_UNITTEST", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
	
	
	
}
