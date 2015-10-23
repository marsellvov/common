package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class WwvFlowAudit {
		public static void auditAction(NString pTableName,NString pAction,NNumber pTablePk) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_AUDIT.AUDIT_ACTION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TABLE_NAME", pTableName);
			cmd.addParameter("@P_ACTION", pAction);
			cmd.addParameter("@P_TABLE_PK", pTablePk);
				
			cmd.execute();


		}
		
		public static void removeAuditTrail(NNumber pFlowId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_AUDIT.REMOVE_AUDIT_TRAIL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_FLOW_ID", pFlowId);
				
			cmd.execute();


		}
		
	
	
	
}
