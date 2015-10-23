package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class ApexSiteAdminPrivs {
		public static void createException() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APEX_SITE_ADMIN_PRIVS.CREATE_EXCEPTION", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void removeException() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APEX_SITE_ADMIN_PRIVS.REMOVE_EXCEPTION", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void removeSchemaExceptions() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APEX_SITE_ADMIN_PRIVS.REMOVE_SCHEMA_EXCEPTIONS", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void removeWorkspaceExceptions() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APEX_SITE_ADMIN_PRIVS.REMOVE_WORKSPACE_EXCEPTIONS", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void report() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APEX_SITE_ADMIN_PRIVS.REPORT", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void restrictSchema() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APEX_SITE_ADMIN_PRIVS.RESTRICT_SCHEMA", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void unrestrictSchema() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APEX_SITE_ADMIN_PRIVS.UNRESTRICT_SCHEMA", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
	
	
	
}
