package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class RbProjParmConfigRules {
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_PROJ_PARM_CONFIG_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NString pGroupName,NString pParameter,NString pActiveInd,NString pData,NString pDescription,NString pUserId,NString pDataOrigin,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_PROJ_PARM_CONFIG_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_GROUP_NAME", pGroupName);
			cmd.addParameter("@P_PARAMETER", pParameter);
			cmd.addParameter("@P_ACTIVE_IND", pActiveInd);
			cmd.addParameter("@P_DATA", pData);
			cmd.addParameter("@P_DESCRIPTION", pDescription);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NString pGroupName,NString pParameter,NString pActiveInd,NString pData,NString pDescription,NString pUserId,NString pDataOrigin) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_PROJ_PARM_CONFIG_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_GROUP_NAME", pGroupName);
			cmd.addParameter("@P_PARAMETER", pParameter);
			cmd.addParameter("@P_ACTIVE_IND", pActiveInd);
			cmd.addParameter("@P_DATA", pData);
			cmd.addParameter("@P_DESCRIPTION", pDescription);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
				
			cmd.execute();


		}
		
		public static void pValidateAll() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_PROJ_PARM_CONFIG_RULES.P_VALIDATE_ALL", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pValidateParameter(NString pGroupName,NString pParameter) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_PROJ_PARM_CONFIG_RULES.P_VALIDATE_PARAMETER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_GROUP_NAME", pGroupName);
			cmd.addParameter("@P_PARAMETER", pParameter);
				
			cmd.execute();


		}
		
	
	
	
}
