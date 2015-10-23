package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class RbAlgorithmicRulesRules {
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_ALGORITHMIC_RULES_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NString pAidyCode,NString pAlgrCode,NNumber pSeqNo,NString pActiveInd,NString pValidatedInd,NString pSqlStatement,NNumber pMinAwardAmt,NNumber pMaxAwardAmt,NString pUserId,NString pDataOrigin,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_ALGORITHMIC_RULES_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_ALGR_CODE", pAlgrCode);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_ACTIVE_IND", pActiveInd);
			cmd.addParameter("@P_VALIDATED_IND", pValidatedInd);
			cmd.addParameter("@P_SQL_STATEMENT", pSqlStatement);
			cmd.addParameter("@P_MIN_AWARD_AMT", pMinAwardAmt);
			cmd.addParameter("@P_MAX_AWARD_AMT", pMaxAwardAmt);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NString pAidyCode,NString pAlgrCode,NNumber pSeqNo,NString pActiveInd,NString pValidatedInd,NString pSqlStatement,NNumber pMinAwardAmt,NNumber pMaxAwardAmt,NString pUserId,NString pDataOrigin) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_ALGORITHMIC_RULES_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_ALGR_CODE", pAlgrCode);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_ACTIVE_IND", pActiveInd);
			cmd.addParameter("@P_VALIDATED_IND", pValidatedInd);
			cmd.addParameter("@P_SQL_STATEMENT", pSqlStatement);
			cmd.addParameter("@P_MIN_AWARD_AMT", pMinAwardAmt);
			cmd.addParameter("@P_MAX_AWARD_AMT", pMaxAwardAmt);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
				
			cmd.execute();


		}
		
	
	
	
}
