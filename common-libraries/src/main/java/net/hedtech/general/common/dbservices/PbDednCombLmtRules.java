package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class PbDednCombLmtRules {
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_DEDN_COMB_LMT_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NString pCode,NString pDesc,NString pUserId,NString pDataOrigin,NNumber pEmplLimit,NNumber pEmprLimit,NNumber pEmplEmprLimit,NNumber pMaxGross,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_DEDN_COMB_LMT_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_CODE", pCode);
			cmd.addParameter("@P_DESC", pDesc);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_EMPL_LIMIT", pEmplLimit);
			cmd.addParameter("@P_EMPR_LIMIT", pEmprLimit);
			cmd.addParameter("@P_EMPL_EMPR_LIMIT", pEmplEmprLimit);
			cmd.addParameter("@P_MAX_GROSS", pMaxGross);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NString pCode,NString pDesc,NString pUserId,NString pDataOrigin,NNumber pEmplLimit,NNumber pEmprLimit,NNumber pEmplEmprLimit,NNumber pMaxGross) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_DEDN_COMB_LMT_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CODE", pCode);
			cmd.addParameter("@P_DESC", pDesc);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_EMPL_LIMIT", pEmplLimit);
			cmd.addParameter("@P_EMPR_LIMIT", pEmprLimit);
			cmd.addParameter("@P_EMPL_EMPR_LIMIT", pEmplEmprLimit);
			cmd.addParameter("@P_MAX_GROSS", pMaxGross);
				
			cmd.execute();


		}
		
	
	
	
}
