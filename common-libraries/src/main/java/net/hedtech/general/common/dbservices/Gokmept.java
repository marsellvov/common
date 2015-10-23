package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Gokmept {
		public static void pAddVpdiToPkUk(NString pOwner,NString pTableName,NString pMigrateVpdi,NString pAuditOnly) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKMEPT.P_ADD_VPDI_TO_PK_UK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OWNER", pOwner);
			cmd.addParameter("@P_TABLE_NAME", pTableName);
			cmd.addParameter("@P_MIGRATE_VPDI", pMigrateVpdi);
			cmd.addParameter("@P_AUDIT_ONLY", pAuditOnly);
				
			cmd.execute();


		}
		
		public static void pCopyTable(NString pTable,NString pSeedVpdi,NString pMessages) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKMEPT.P_COPY_TABLE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TABLE", pTable);
			cmd.addParameter("@P_SEED_VPDI", pSeedVpdi);
			cmd.addParameter("@P_MESSAGES", pMessages);
				
			cmd.execute();


		}
		
		public static void pListVpdCounts(NString pTable,NString pMessages) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKMEPT.P_LIST_VPD_COUNTS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TABLE", pTable);
			cmd.addParameter("@P_MESSAGES", pMessages);
				
			cmd.execute();


		}
		
		public static void pVpdTableColumn(NString pOwner,NString pTableName,NString pSeedDataInst,NString pAuditOnly) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKMEPT.P_VPD_TABLE_COLUMN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OWNER", pOwner);
			cmd.addParameter("@P_TABLE_NAME", pTableName);
			cmd.addParameter("@P_SEED_DATA_INST", pSeedDataInst);
			cmd.addParameter("@P_AUDIT_ONLY", pAuditOnly);
				
			cmd.execute();


		}
		
		public static void pVpdTableIndex(NString pOwner,NString pTableName,NString pAuditOnly,NString pMigrateVpdi) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKMEPT.P_VPD_TABLE_INDEX", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OWNER", pOwner);
			cmd.addParameter("@P_TABLE_NAME", pTableName);
			cmd.addParameter("@P_AUDIT_ONLY", pAuditOnly);
			cmd.addParameter("@P_MIGRATE_VPDI", pMigrateVpdi);
				
			cmd.execute();


		}
		
	
	
	
}
