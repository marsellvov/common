package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Twbkurol {
//		public static void pSaveuserroles(NString userPidm,List<Twbklibs.Varchar2TabtypeRow> roleTableIn,NString numRolesIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKUROL.P_SAVEUSERROLES", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@USER_PIDM", userPidm);
//			// cmd.addParameter(DbTypes.getTableType("ROLE_TABLE_IN", "", roleTableIn, object.class));
//			cmd.addParameter("@NUM_ROLES_IN", numRolesIn);
//				
//			cmd.execute();
//
//
//		}
		
		public static void pSelectuser(NString returnCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKUROL.P_SELECTUSER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@RETURN_CODE", returnCode);
				
			cmd.execute();


		}
		
		public static void pUpdateuserroles(NString userId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKUROL.P_UPDATEUSERROLES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@USER_ID", userId);
				
			cmd.execute();


		}
		
	
	
	
}
