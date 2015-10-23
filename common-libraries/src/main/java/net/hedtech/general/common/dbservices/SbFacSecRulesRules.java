package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SbFacSecRulesRules {
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_FAC_SEC_RULES_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NString pProcCode,NString pRoleCde,NString pActiveInd,NString pAllAccessInd,NString pPinControlInd,NString pRelationshipInd,NString pPrimaryInd,NString pAttrTypeCheckInd,NString pUserId,NString pDataOrigin,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_FAC_SEC_RULES_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_PROC_CODE", pProcCode);
			cmd.addParameter("@P_ROLE_CDE", pRoleCde);
			cmd.addParameter("@P_ACTIVE_IND", pActiveInd);
			cmd.addParameter("@P_ALL_ACCESS_IND", pAllAccessInd);
			cmd.addParameter("@P_PIN_CONTROL_IND", pPinControlInd);
			cmd.addParameter("@P_RELATIONSHIP_IND", pRelationshipInd);
			cmd.addParameter("@P_PRIMARY_IND", pPrimaryInd);
			cmd.addParameter("@P_ATTR_TYPE_CHECK_IND", pAttrTypeCheckInd);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NString pProcCode,NString pRoleCde,NString pActiveInd,NString pAllAccessInd,NString pPinControlInd,NString pRelationshipInd,NString pPrimaryInd,NString pAttrTypeCheckInd,NString pUserId,NString pDataOrigin) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_FAC_SEC_RULES_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PROC_CODE", pProcCode);
			cmd.addParameter("@P_ROLE_CDE", pRoleCde);
			cmd.addParameter("@P_ACTIVE_IND", pActiveInd);
			cmd.addParameter("@P_ALL_ACCESS_IND", pAllAccessInd);
			cmd.addParameter("@P_PIN_CONTROL_IND", pPinControlInd);
			cmd.addParameter("@P_RELATIONSHIP_IND", pRelationshipInd);
			cmd.addParameter("@P_PRIMARY_IND", pPrimaryInd);
			cmd.addParameter("@P_ATTR_TYPE_CHECK_IND", pAttrTypeCheckInd);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
				
			cmd.execute();


		}
		
	
	
	
}
