package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class GbDisplaycolumnsRules {
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_DISPLAYCOLUMNS_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NString pObjsCode,NString pBlockName,NString pColumnName,NString pSysReqInd,NString pDataTypeCde,NNumber pDataLength,NString pUserId,NString pQueryColumn,NNumber pNumericPrecision,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_DISPLAYCOLUMNS_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_OBJS_CODE", pObjsCode);
			cmd.addParameter("@P_BLOCK_NAME", pBlockName);
			cmd.addParameter("@P_COLUMN_NAME", pColumnName);
			cmd.addParameter("@P_SYS_REQ_IND", pSysReqInd);
			cmd.addParameter("@P_DATA_TYPE_CDE", pDataTypeCde);
			cmd.addParameter("@P_DATA_LENGTH", pDataLength);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_QUERY_COLUMN", pQueryColumn);
			cmd.addParameter("@P_NUMERIC_PRECISION", pNumericPrecision);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NString pObjsCode,NString pBlockName,NString pColumnName,NString pSysReqInd,NString pDataTypeCde,NNumber pDataLength,NString pUserId,NString pQueryColumn,NNumber pNumericPrecision) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_DISPLAYCOLUMNS_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OBJS_CODE", pObjsCode);
			cmd.addParameter("@P_BLOCK_NAME", pBlockName);
			cmd.addParameter("@P_COLUMN_NAME", pColumnName);
			cmd.addParameter("@P_SYS_REQ_IND", pSysReqInd);
			cmd.addParameter("@P_DATA_TYPE_CDE", pDataTypeCde);
			cmd.addParameter("@P_DATA_LENGTH", pDataLength);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_QUERY_COLUMN", pQueryColumn);
			cmd.addParameter("@P_NUMERIC_PRECISION", pNumericPrecision);
				
			cmd.execute();


		}
		
	
	
	
}
