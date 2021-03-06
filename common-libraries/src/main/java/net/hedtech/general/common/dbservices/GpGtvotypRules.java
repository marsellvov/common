package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class GpGtvotypRules {
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GP_GTVOTYP_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NString pSystCode,NString pCode,NString pDesc,NString pDataType,NString pSystemLevelCde,NString pOptionDefault,NString pSystemReqInd,NString pUserId,NDate pCreateDate,NString pCreateUser,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GP_GTVOTYP_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_SYST_CODE", pSystCode);
			cmd.addParameter("@P_CODE", pCode);
			cmd.addParameter("@P_DESC", pDesc);
			cmd.addParameter("@P_DATA_TYPE", pDataType);
			cmd.addParameter("@P_SYSTEM_LEVEL_CDE", pSystemLevelCde);
			cmd.addParameter("@P_OPTION_DEFAULT", pOptionDefault);
			cmd.addParameter("@P_SYSTEM_REQ_IND", pSystemReqInd);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_CREATE_DATE", pCreateDate);
			cmd.addParameter("@P_CREATE_USER", pCreateUser);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NString pSystCode,NString pCode,NString pDesc,NString pDataType,NString pSystemLevelCde,NString pOptionDefault,NString pSystemReqInd,NString pUserId,NDate pCreateDate,NString pCreateUser) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GP_GTVOTYP_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SYST_CODE", pSystCode);
			cmd.addParameter("@P_CODE", pCode);
			cmd.addParameter("@P_DESC", pDesc);
			cmd.addParameter("@P_DATA_TYPE", pDataType);
			cmd.addParameter("@P_SYSTEM_LEVEL_CDE", pSystemLevelCde);
			cmd.addParameter("@P_OPTION_DEFAULT", pOptionDefault);
			cmd.addParameter("@P_SYSTEM_REQ_IND", pSystemReqInd);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_CREATE_DATE", pCreateDate);
			cmd.addParameter("@P_CREATE_USER", pCreateUser);
				
			cmd.execute();


		}
		
	
	
	
}
