package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class DmlSpriden {
		public static void pDelete(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DML_SPRIDEN.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pInsert() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DML_SPRIDEN.P_INSERT", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pUpdate() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DML_SPRIDEN.P_UPDATE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pUpdateToCurrentId(NNumber pPidm,NString pId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DML_SPRIDEN.P_UPDATE_TO_CURRENT_ID", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_ID", pId);
				
			cmd.execute();


		}
		
	
	
	
}
