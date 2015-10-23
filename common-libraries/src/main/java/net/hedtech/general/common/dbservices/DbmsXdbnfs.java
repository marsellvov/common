package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class DbmsXdbnfs {
		public static void dumpNfsstats() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDBNFS.DUMP_NFSSTATS", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void resetNfsstats(NInteger skip,NInteger trace) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDBNFS.RESET_NFSSTATS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SKIP", skip);
			cmd.addParameter("@TRACE", trace);
				
			cmd.execute();


		}
		
	
	
	
}
