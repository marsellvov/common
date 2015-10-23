package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class RbFaAthContExemptRules {
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_FA_ATH_CONT_EXEMPT_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NNumber pPidm,NString pPeriod,NString pTermCode,NString pFaspCode,NString pTypeInd,NNumber pContractPidm,NNumber pContractExemptNumber,NNumber pReportedAmt,NString pIndividualLimitInd,NString pTeamLimitInd,NString pCoaLimitInd,NString pReviewedCode,NString pUserId,NString pDataOrigin,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_FA_ATH_CONT_EXEMPT_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_PERIOD", pPeriod);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_FASP_CODE", pFaspCode);
			cmd.addParameter("@P_TYPE_IND", pTypeInd);
			cmd.addParameter("@P_CONTRACT_PIDM", pContractPidm);
			cmd.addParameter("@P_CONTRACT_EXEMPT_NUMBER", pContractExemptNumber);
			cmd.addParameter("@P_REPORTED_AMT", pReportedAmt);
			cmd.addParameter("@P_INDIVIDUAL_LIMIT_IND", pIndividualLimitInd);
			cmd.addParameter("@P_TEAM_LIMIT_IND", pTeamLimitInd);
			cmd.addParameter("@P_COA_LIMIT_IND", pCoaLimitInd);
			cmd.addParameter("@P_REVIEWED_CODE", pReviewedCode);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NNumber pPidm,NString pPeriod,NString pTermCode,NString pFaspCode,NString pTypeInd,NNumber pContractPidm,NNumber pContractExemptNumber,NNumber pReportedAmt,NString pIndividualLimitInd,NString pTeamLimitInd,NString pCoaLimitInd,NString pReviewedCode,NString pUserId,NString pDataOrigin) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_FA_ATH_CONT_EXEMPT_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_PERIOD", pPeriod);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_FASP_CODE", pFaspCode);
			cmd.addParameter("@P_TYPE_IND", pTypeInd);
			cmd.addParameter("@P_CONTRACT_PIDM", pContractPidm);
			cmd.addParameter("@P_CONTRACT_EXEMPT_NUMBER", pContractExemptNumber);
			cmd.addParameter("@P_REPORTED_AMT", pReportedAmt);
			cmd.addParameter("@P_INDIVIDUAL_LIMIT_IND", pIndividualLimitInd);
			cmd.addParameter("@P_TEAM_LIMIT_IND", pTeamLimitInd);
			cmd.addParameter("@P_COA_LIMIT_IND", pCoaLimitInd);
			cmd.addParameter("@P_REVIEWED_CODE", pReviewedCode);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
				
			cmd.execute();


		}
		
	
	
	
}
