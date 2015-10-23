package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class RbMiscParameterRules {
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_MISC_PARAMETER_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NString pParameter,NString pKey,NString pSourceInd,NString pData,NString pSystemReqInd,NString pDataOrigin,NString pUserId,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_MISC_PARAMETER_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_PARAMETER", pParameter);
			cmd.addParameter("@P_KEY", pKey);
			cmd.addParameter("@P_SOURCE_IND", pSourceInd);
			cmd.addParameter("@P_DATA", pData);
			cmd.addParameter("@P_SYSTEM_REQ_IND", pSystemReqInd);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NString pParameter,NString pKey,NString pSourceInd,NString pData,NString pSystemReqInd,NString pDataOrigin,NString pUserId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_MISC_PARAMETER_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PARAMETER", pParameter);
			cmd.addParameter("@P_KEY", pKey);
			cmd.addParameter("@P_SOURCE_IND", pSourceInd);
			cmd.addParameter("@P_DATA", pData);
			cmd.addParameter("@P_SYSTEM_REQ_IND", pSystemReqInd);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_USER_ID", pUserId);
				
			cmd.execute();


		}
		
	
	
	
}
