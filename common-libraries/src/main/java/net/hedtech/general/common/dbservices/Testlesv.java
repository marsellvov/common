package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Testlesv {
		public static void displayEnv() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TESTLESV.DISPLAY_ENV", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pDebug(NString dbugParm,NString dbugValue,NString dbugWeb) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TESTLESV.P_DEBUG", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@DBUG_PARM", dbugParm);
			cmd.addParameter("@DBUG_VALUE", dbugValue);
			cmd.addParameter("@DBUG_WEB", dbugWeb);
				
			cmd.execute();


		}
		
		public static void pTest() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TESTLESV.P_TEST", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTestsubmit(NString fname,NString lname) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TESTLESV.P_TESTSUBMIT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@FNAME", fname);
			cmd.addParameter("@LNAME", lname);
				
			cmd.execute();


		}
		
	
	
	
}
