package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class TmDblink {
		public static NString Fappldbhost() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TM_DBLINK.APPLDBHOST", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString Flinkpw() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TM_DBLINK.LINKPW", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void linkto(NString usr,NString passwd,NString dbname) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TM_DBLINK.LINKTO", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@USR", usr);
			cmd.addParameter("@PASSWD", passwd);
			cmd.addParameter("@DBNAME", dbname);
				
			cmd.execute();


		}
		
		public static NString Flinkuser() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TM_DBLINK.LINKUSER", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void unlinkdb() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TM_DBLINK.UNLINKDB", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
	
	
	
}
