package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class DbmsXdbPrint {
		public static void clearprintmode(NNumber pflag) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDB_PRINT.CLEARPRINTMODE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PFLAG", pflag);
				
			cmd.execute();


		}
		
		public static void setprintmode(NNumber pflag) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDB_PRINT.SETPRINTMODE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PFLAG", pflag);
				
			cmd.execute();


		}
		
		public static void setprintmode(NNumber pflag,NNumber indent) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDB_PRINT.SETPRINTMODE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PFLAG", pflag);
			cmd.addParameter("@INDENT", indent);
				
			cmd.execute();


		}
		
	
	
	
}
