package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class ApexPlsqlJob {
		public static void jobsAreEnabled() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APEX_PLSQL_JOB.JOBS_ARE_ENABLED", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void purgeProcess() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APEX_PLSQL_JOB.PURGE_PROCESS", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void submitProcess() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APEX_PLSQL_JOB.SUBMIT_PROCESS", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void timeElapsed() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APEX_PLSQL_JOB.TIME_ELAPSED", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void updateJobStatus() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APEX_PLSQL_JOB.UPDATE_JOB_STATUS", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
	
	
	
}
