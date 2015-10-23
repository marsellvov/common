package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class DbmsXdbAdmin {
		public static void createnoncekey() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDB_ADMIN.CREATENONCEKEY", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void createrepositoryxmlindex() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDB_ADMIN.CREATEREPOSITORYXMLINDEX", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void droprepositoryxmlindex() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDB_ADMIN.DROPREPOSITORYXMLINDEX", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void xmlindexaddpath(NString path,NBool recurse) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDB_ADMIN.XMLINDEXADDPATH", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PATH", path);
			cmd.addParameter("@RECURSE", recurse);
				
			cmd.execute();


		}
		
		public static void xmlindexremovepath(NString path,NBool recurse) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XDB_ADMIN.XMLINDEXREMOVEPATH", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PATH", path);
			cmd.addParameter("@RECURSE", recurse);
				
			cmd.execute();


		}
		
	
	
	
}
