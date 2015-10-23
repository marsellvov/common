package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class GkkbGkrxrotRules {
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKB_GKRXROT_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NString pXproCode,NString pTableName,NString pTableDesc,NString pRootNode,NString pUserId,NString pRootNodeNs,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKB_GKRXROT_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_XPRO_CODE", pXproCode);
			cmd.addParameter("@P_TABLE_NAME", pTableName);
			cmd.addParameter("@P_TABLE_DESC", pTableDesc);
			cmd.addParameter("@P_ROOT_NODE", pRootNode);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_ROOT_NODE_NS", pRootNodeNs);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NString pXproCode,NString pTableName,NString pTableDesc,NString pRootNode,NString pUserId,NString pRootNodeNs) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKB_GKRXROT_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_XPRO_CODE", pXproCode);
			cmd.addParameter("@P_TABLE_NAME", pTableName);
			cmd.addParameter("@P_TABLE_DESC", pTableDesc);
			cmd.addParameter("@P_ROOT_NODE", pRootNode);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_ROOT_NODE_NS", pRootNodeNs);
				
			cmd.execute();


		}
		
	
	
	
}
