package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class WwvFlowDml {
		public static void deleteRow(NString pTableOwner,NString pTableName,NString pRowid,NString pAltRowid,NString pRowid2,NString pAltRowid2) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_DML.DELETE_ROW", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TABLE_OWNER", pTableOwner);
			cmd.addParameter("@P_TABLE_NAME", pTableName);
			cmd.addParameter("@P_ROWID", pRowid);
			cmd.addParameter("@P_ALT_ROWID", pAltRowid);
			cmd.addParameter("@P_ROWID2", pRowid2);
			cmd.addParameter("@P_ALT_ROWID2", pAltRowid2);
				
			cmd.execute();


		}
		
		public static void fetchRow(NString pTableOwner,NString pTableName,NString pRowid,NString pAltRowid,NString pRowid2,NString pAltRowid2,NString pComputeChecksum,NString pDmlFetchMode,NString pLock) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_DML.FETCH_ROW", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TABLE_OWNER", pTableOwner);
			cmd.addParameter("@P_TABLE_NAME", pTableName);
			cmd.addParameter("@P_ROWID", pRowid);
			cmd.addParameter("@P_ALT_ROWID", pAltRowid);
			cmd.addParameter("@P_ROWID2", pRowid2);
			cmd.addParameter("@P_ALT_ROWID2", pAltRowid2);
			cmd.addParameter("@P_COMPUTE_CHECKSUM", pComputeChecksum);
			cmd.addParameter("@P_DML_FETCH_MODE", pDmlFetchMode);
			cmd.addParameter("@P_LOCK", pLock);
				
			cmd.execute();


		}
		
		public static NString fetchRowMd5Checksum(NString pTableOwner,NString pTableName,NString pRowid,NString pAltRowid,NString pRowid2,NString pAltRowid2,NString pLock) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_DML.FETCH_ROW_MD5_CHECKSUM", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_TABLE_OWNER", pTableOwner);
			cmd.addParameter("@P_TABLE_NAME", pTableName);
			cmd.addParameter("@P_ROWID", pRowid);
			cmd.addParameter("@P_ALT_ROWID", pAltRowid);
			cmd.addParameter("@P_ROWID2", pRowid2);
			cmd.addParameter("@P_ALT_ROWID2", pAltRowid2);
			cmd.addParameter("@P_LOCK", pLock);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FgetColumn(NString pColumnName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_DML.GET_COLUMN", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_COLUMN_NAME", pColumnName);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void insertRow(NString pTableOwner,NString pTableName,NString pAltRowid,NString pAltRowid2,NString pReturnItem1Name,NString pReturnItem2Name) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_DML.INSERT_ROW", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TABLE_OWNER", pTableOwner);
			cmd.addParameter("@P_TABLE_NAME", pTableName);
			cmd.addParameter("@P_ALT_ROWID", pAltRowid);
			cmd.addParameter("@P_ALT_ROWID2", pAltRowid2);
			cmd.addParameter("@P_RETURN_ITEM1_NAME", pReturnItem1Name);
			cmd.addParameter("@P_RETURN_ITEM2_NAME", pReturnItem2Name);
				
			cmd.execute();


		}
		
		public static void process(NString pAction,NString pTableOwner,NString pTableName,NString pRowid,NString pAltRowid,NString pRowid2,NString pAltRowid2,NString pAllowedActions,NString pReturnItem1Name,NString pReturnItem2Name) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_DML.PROCESS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ACTION", pAction);
			cmd.addParameter("@P_TABLE_OWNER", pTableOwner);
			cmd.addParameter("@P_TABLE_NAME", pTableName);
			cmd.addParameter("@P_ROWID", pRowid);
			cmd.addParameter("@P_ALT_ROWID", pAltRowid);
			cmd.addParameter("@P_ROWID2", pRowid2);
			cmd.addParameter("@P_ALT_ROWID2", pAltRowid2);
			cmd.addParameter("@P_ALLOWED_ACTIONS", pAllowedActions);
			cmd.addParameter("@P_RETURN_ITEM1_NAME", pReturnItem1Name);
			cmd.addParameter("@P_RETURN_ITEM2_NAME", pReturnItem2Name);
				
			cmd.execute();


		}
		
		public static void updateRow(NString pTableOwner,NString pTableName,NString pRowid,NString pAltRowid,NString pRowid2,NString pAltRowid2) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_DML.UPDATE_ROW", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TABLE_OWNER", pTableOwner);
			cmd.addParameter("@P_TABLE_NAME", pTableName);
			cmd.addParameter("@P_ROWID", pRowid);
			cmd.addParameter("@P_ALT_ROWID", pAltRowid);
			cmd.addParameter("@P_ROWID2", pRowid2);
			cmd.addParameter("@P_ALT_ROWID2", pAltRowid2);
				
			cmd.execute();


		}
		
	
	
	
}
