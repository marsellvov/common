package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class GkkbGkrxmapRules {
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKB_GKRXMAP_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NString pXrotXproCode,NString pXrotTableName,NString pColumnName,NString pColumnDesc,NNumber pColumnLength,NString pColumnNullable,NString pValueType,NString pValue,NString pParentNode,NString pIspopulate,NString pUserId,NString pColumnDatatype,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKB_GKRXMAP_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_XROT_XPRO_CODE", pXrotXproCode);
			cmd.addParameter("@P_XROT_TABLE_NAME", pXrotTableName);
			cmd.addParameter("@P_COLUMN_NAME", pColumnName);
			cmd.addParameter("@P_COLUMN_DESC", pColumnDesc);
			cmd.addParameter("@P_COLUMN_LENGTH", pColumnLength);
			cmd.addParameter("@P_COLUMN_NULLABLE", pColumnNullable);
			cmd.addParameter("@P_VALUE_TYPE", pValueType);
			cmd.addParameter("@P_VALUE", pValue);
			cmd.addParameter("@P_PARENT_NODE", pParentNode);
			cmd.addParameter("@P_ISPOPULATE", pIspopulate);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_COLUMN_DATATYPE", pColumnDatatype);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NString pXrotXproCode,NString pXrotTableName,NString pColumnName,NString pColumnDesc,NNumber pColumnLength,NString pColumnNullable,NString pValueType,NString pValue,NString pParentNode,NString pIspopulate,NString pUserId,NString pColumnDatatype) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKB_GKRXMAP_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_XROT_XPRO_CODE", pXrotXproCode);
			cmd.addParameter("@P_XROT_TABLE_NAME", pXrotTableName);
			cmd.addParameter("@P_COLUMN_NAME", pColumnName);
			cmd.addParameter("@P_COLUMN_DESC", pColumnDesc);
			cmd.addParameter("@P_COLUMN_LENGTH", pColumnLength);
			cmd.addParameter("@P_COLUMN_NULLABLE", pColumnNullable);
			cmd.addParameter("@P_VALUE_TYPE", pValueType);
			cmd.addParameter("@P_VALUE", pValue);
			cmd.addParameter("@P_PARENT_NODE", pParentNode);
			cmd.addParameter("@P_ISPOPULATE", pIspopulate);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_COLUMN_DATATYPE", pColumnDatatype);
				
			cmd.execute();


		}
		
	
	
	
}
