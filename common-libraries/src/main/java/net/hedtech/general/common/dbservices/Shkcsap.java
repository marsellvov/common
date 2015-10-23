package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Shkcsap {
		public static void pInsertShrsapp() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKCSAP.P_INSERT_SHRSAPP", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pInsertShrsarj() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKCSAP.P_INSERT_SHRSARJ", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pProcessSap(NNumber pPidm,NNumber pRequestNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKCSAP.P_PROCESS_SAP", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_REQUEST_NO", pRequestNo);
				
			cmd.execute();


		}
		
	
	
	
}
