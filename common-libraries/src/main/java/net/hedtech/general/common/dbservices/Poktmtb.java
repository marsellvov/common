package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Poktmtb {
		public static void pCreateTimeBasedEvents(NString pDatabaseName,NString pProcessName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("POKTMTB.P_CREATE_TIME_BASED_EVENTS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DATABASE_NAME", pDatabaseName);
			cmd.addParameter("@P_PROCESS_NAME", pProcessName);
				
			cmd.execute();


		}
		
	
	
	
}
