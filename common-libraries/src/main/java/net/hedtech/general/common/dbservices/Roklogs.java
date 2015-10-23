package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Roklogs {
		public static NString fGetUserId(NNumber pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKLOGS.F_GET_USER_ID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NBool fTableEligible(NString pTableName,NString pAction) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKLOGS.F_TABLE_ELIGIBLE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@P_TABLE_NAME", pTableName);
			cmd.addParameter("@P_ACTION", pAction);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static void pClearUserId(NNumber pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKLOGS.P_CLEAR_USER_ID", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();


		}
		
		public static void pInitializeEntry() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKLOGS.P_INITIALIZE_ENTRY", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pInsertRorlogd() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKLOGS.P_INSERT_RORLOGD", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pInsertRorlogm() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKLOGS.P_INSERT_RORLOGM", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pSetAllColumns(NString pTableName,NString pActionInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKLOGS.P_SET_ALL_COLUMNS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TABLE_NAME", pTableName);
			cmd.addParameter("@P_ACTION_IND", pActionInd);
				
			cmd.execute();


		}
		
		public static void pSetUserId(NNumber pPidm,NString pUserId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKLOGS.P_SET_USER_ID", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_USER_ID", pUserId);
				
			cmd.execute();


		}
		
	
	
	
}
