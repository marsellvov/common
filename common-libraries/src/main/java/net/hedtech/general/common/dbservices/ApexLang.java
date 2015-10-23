package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class ApexLang {
		public static void lang() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APEX_LANG.LANG", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void message() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APEX_LANG.MESSAGE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void messageP() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APEX_LANG.MESSAGE_P", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
	
	
	
}
