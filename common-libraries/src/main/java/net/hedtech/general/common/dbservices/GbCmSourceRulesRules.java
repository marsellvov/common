package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class GbCmSourceRulesRules {
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_CM_SOURCE_RULES_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NString pCmscCode,NString pOnlineMatchInd,NString pEntityCde,NString pUserId,NString pAtypCode,NString pTeleCode,NString pEmalCode,NString pDataOrigin,NString pTransposeDateInd,NString pTransposeNameInd,NString pAliasWildcardInd,NString pLengthOverrideInd,NString pApiFailureInd,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_CM_SOURCE_RULES_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_CMSC_CODE", pCmscCode);
			cmd.addParameter("@P_ONLINE_MATCH_IND", pOnlineMatchInd);
			cmd.addParameter("@P_ENTITY_CDE", pEntityCde);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_ATYP_CODE", pAtypCode);
			cmd.addParameter("@P_TELE_CODE", pTeleCode);
			cmd.addParameter("@P_EMAL_CODE", pEmalCode);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_TRANSPOSE_DATE_IND", pTransposeDateInd);
			cmd.addParameter("@P_TRANSPOSE_NAME_IND", pTransposeNameInd);
			cmd.addParameter("@P_ALIAS_WILDCARD_IND", pAliasWildcardInd);
			cmd.addParameter("@P_LENGTH_OVERRIDE_IND", pLengthOverrideInd);
			cmd.addParameter("@P_API_FAILURE_IND", pApiFailureInd);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NString pCmscCode,NString pOnlineMatchInd,NString pEntityCde,NString pUserId,NString pAtypCode,NString pTeleCode,NString pEmalCode,NString pDataOrigin,NString pTransposeDateInd,NString pTransposeNameInd,NString pAliasWildcardInd,NString pLengthOverrideInd,NString pApiFailureInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_CM_SOURCE_RULES_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CMSC_CODE", pCmscCode);
			cmd.addParameter("@P_ONLINE_MATCH_IND", pOnlineMatchInd);
			cmd.addParameter("@P_ENTITY_CDE", pEntityCde);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_ATYP_CODE", pAtypCode);
			cmd.addParameter("@P_TELE_CODE", pTeleCode);
			cmd.addParameter("@P_EMAL_CODE", pEmalCode);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_TRANSPOSE_DATE_IND", pTransposeDateInd);
			cmd.addParameter("@P_TRANSPOSE_NAME_IND", pTransposeNameInd);
			cmd.addParameter("@P_ALIAS_WILDCARD_IND", pAliasWildcardInd);
			cmd.addParameter("@P_LENGTH_OVERRIDE_IND", pLengthOverrideInd);
			cmd.addParameter("@P_API_FAILURE_IND", pApiFailureInd);
				
			cmd.execute();


		}
		
	
	
	
}
