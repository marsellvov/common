package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class RbPrdsCompRulesRules {
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_PRDS_COMP_RULES_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NString pAidyCode,NString pPbcpCode,NString pDefaultInd,NString pPellLtHalfInd,NString pDirectCostInd,NString pBcatCode,NString pLongDesc,NString pComment,NNumber pAmtDflt,NString pAbrcCodeDflt,NNumber pAmtPellDflt,NString pAbrcCodePellDflt,NString pUserId,NString pDataOrigin,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_PRDS_COMP_RULES_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PBCP_CODE", pPbcpCode);
			cmd.addParameter("@P_DEFAULT_IND", pDefaultInd);
			cmd.addParameter("@P_PELL_LT_HALF_IND", pPellLtHalfInd);
			cmd.addParameter("@P_DIRECT_COST_IND", pDirectCostInd);
			cmd.addParameter("@P_BCAT_CODE", pBcatCode);
			cmd.addParameter("@P_LONG_DESC", pLongDesc);
			cmd.addParameter("@P_COMMENT", pComment);
			cmd.addParameter("@P_AMT_DFLT", pAmtDflt);
			cmd.addParameter("@P_ABRC_CODE_DFLT", pAbrcCodeDflt);
			cmd.addParameter("@P_AMT_PELL_DFLT", pAmtPellDflt);
			cmd.addParameter("@P_ABRC_CODE_PELL_DFLT", pAbrcCodePellDflt);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NString pAidyCode,NString pPbcpCode,NString pDefaultInd,NString pPellLtHalfInd,NString pDirectCostInd,NString pBcatCode,NString pLongDesc,NString pComment,NNumber pAmtDflt,NString pAbrcCodeDflt,NNumber pAmtPellDflt,NString pAbrcCodePellDflt,NString pUserId,NString pDataOrigin) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_PRDS_COMP_RULES_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PBCP_CODE", pPbcpCode);
			cmd.addParameter("@P_DEFAULT_IND", pDefaultInd);
			cmd.addParameter("@P_PELL_LT_HALF_IND", pPellLtHalfInd);
			cmd.addParameter("@P_DIRECT_COST_IND", pDirectCostInd);
			cmd.addParameter("@P_BCAT_CODE", pBcatCode);
			cmd.addParameter("@P_LONG_DESC", pLongDesc);
			cmd.addParameter("@P_COMMENT", pComment);
			cmd.addParameter("@P_AMT_DFLT", pAmtDflt);
			cmd.addParameter("@P_ABRC_CODE_DFLT", pAbrcCodeDflt);
			cmd.addParameter("@P_AMT_PELL_DFLT", pAmtPellDflt);
			cmd.addParameter("@P_ABRC_CODE_PELL_DFLT", pAbrcCodePellDflt);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
				
			cmd.execute();


		}
		
	
	
	
}
