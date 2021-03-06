package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class RbDegreeRulesRules {
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_DEGREE_RULES_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NString pAidyCode,NString pDegcCode,NString pUserId,NString pDataOrigin,NString pAcgEligibleInd,NString pSmartEligibleInd,NString pDegcCodeComment,NString pTeachEligibleInd,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_DEGREE_RULES_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_DEGC_CODE", pDegcCode);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ACG_ELIGIBLE_IND", pAcgEligibleInd);
			cmd.addParameter("@P_SMART_ELIGIBLE_IND", pSmartEligibleInd);
			cmd.addParameter("@P_DEGC_CODE_COMMENT", pDegcCodeComment);
			cmd.addParameter("@P_TEACH_ELIGIBLE_IND", pTeachEligibleInd);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NString pAidyCode,NString pDegcCode,NString pUserId,NString pDataOrigin,NString pAcgEligibleInd,NString pSmartEligibleInd,NString pDegcCodeComment,NString pTeachEligibleInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_DEGREE_RULES_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_DEGC_CODE", pDegcCode);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ACG_ELIGIBLE_IND", pAcgEligibleInd);
			cmd.addParameter("@P_SMART_ELIGIBLE_IND", pSmartEligibleInd);
			cmd.addParameter("@P_DEGC_CODE_COMMENT", pDegcCodeComment);
			cmd.addParameter("@P_TEACH_ELIGIBLE_IND", pTeachEligibleInd);
				
			cmd.execute();


		}
		
	
	
	
}
