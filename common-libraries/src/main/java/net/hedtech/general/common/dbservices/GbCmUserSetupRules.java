package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class GbCmUserSetupRules {
		public static NString fValidateCmUser(NString pCmUserId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_CM_USER_SETUP_RULES.F_VALIDATE_CM_USER", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_CM_USER_ID", pCmUserId);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fValidateCmscCdeOption(NString pCmscOptionInd,NString pCmscCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_CM_USER_SETUP_RULES.F_VALIDATE_CMSC_CDE_OPTION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_CMSC_OPTION_IND", pCmscOptionInd);
			cmd.addParameter("@P_CMSC_CODE", pCmscCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_CM_USER_SETUP_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NString pCmUserId,NString pCmscOptionInd,NString pExcludeInd,NString pUserId,NString pCmscCode,NString pDataOrigin,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_CM_USER_SETUP_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_CM_USER_ID", pCmUserId);
			cmd.addParameter("@P_CMSC_OPTION_IND", pCmscOptionInd);
			cmd.addParameter("@P_EXCLUDE_IND", pExcludeInd);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_CMSC_CODE", pCmscCode);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NString pCmUserId,NString pCmscOptionInd,NString pExcludeInd,NString pUserId,NString pCmscCode,NString pDataOrigin) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_CM_USER_SETUP_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CM_USER_ID", pCmUserId);
			cmd.addParameter("@P_CMSC_OPTION_IND", pCmscOptionInd);
			cmd.addParameter("@P_EXCLUDE_IND", pExcludeInd);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_CMSC_CODE", pCmscCode);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
				
			cmd.execute();


		}
		
	
	
	
}
