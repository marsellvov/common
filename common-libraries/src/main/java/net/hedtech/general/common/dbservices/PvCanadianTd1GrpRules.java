package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class PvCanadianTd1GrpRules {
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_CANADIAN_TD1_GRP_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NString pCode,NString pDesc,NString pTxcdCode,NDate pEffectiveDate,NString pNonResidentInd,NString pLessIncomeInd,NString pActiveInd,NString pPreferredAtypCode,NString pExemptRuleCode,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_CANADIAN_TD1_GRP_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_CODE", pCode);
			cmd.addParameter("@P_DESC", pDesc);
			cmd.addParameter("@P_TXCD_CODE", pTxcdCode);
			cmd.addParameter("@P_EFFECTIVE_DATE", pEffectiveDate);
			cmd.addParameter("@P_NON_RESIDENT_IND", pNonResidentInd);
			cmd.addParameter("@P_LESS_INCOME_IND", pLessIncomeInd);
			cmd.addParameter("@P_ACTIVE_IND", pActiveInd);
			cmd.addParameter("@P_PREFERRED_ATYP_CODE", pPreferredAtypCode);
			cmd.addParameter("@P_EXEMPT_RULE_CODE", pExemptRuleCode);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NString pCode,NString pDesc,NString pTxcdCode,NDate pEffectiveDate,NString pNonResidentInd,NString pLessIncomeInd,NString pActiveInd,NString pPreferredAtypCode,NString pExemptRuleCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_CANADIAN_TD1_GRP_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CODE", pCode);
			cmd.addParameter("@P_DESC", pDesc);
			cmd.addParameter("@P_TXCD_CODE", pTxcdCode);
			cmd.addParameter("@P_EFFECTIVE_DATE", pEffectiveDate);
			cmd.addParameter("@P_NON_RESIDENT_IND", pNonResidentInd);
			cmd.addParameter("@P_LESS_INCOME_IND", pLessIncomeInd);
			cmd.addParameter("@P_ACTIVE_IND", pActiveInd);
			cmd.addParameter("@P_PREFERRED_ATYP_CODE", pPreferredAtypCode);
			cmd.addParameter("@P_EXEMPT_RULE_CODE", pExemptRuleCode);
				
			cmd.execute();


		}
		
	
	
	
}
