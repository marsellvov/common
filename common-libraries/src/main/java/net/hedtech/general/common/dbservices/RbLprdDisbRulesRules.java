package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class RbLprdDisbRulesRules {
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_LPRD_DISB_RULES_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NString pLoanPeriod,NDate pDisburseDate,NString pPeriod,NNumber pLoanPct,NNumber pMemoExpDays,NDate pPnDisbDate,NString pUserId,NString pDataOrigin,NString pTermCode,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_LPRD_DISB_RULES_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_LOAN_PERIOD", pLoanPeriod);
			cmd.addParameter("@P_DISBURSE_DATE", pDisburseDate);
			cmd.addParameter("@P_PERIOD", pPeriod);
			cmd.addParameter("@P_LOAN_PCT", pLoanPct);
			cmd.addParameter("@P_MEMO_EXP_DAYS", pMemoExpDays);
			cmd.addParameter("@P_PN_DISB_DATE", pPnDisbDate);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NString pLoanPeriod,NDate pDisburseDate,NString pPeriod,NNumber pLoanPct,NNumber pMemoExpDays,NDate pPnDisbDate,NString pUserId,NString pDataOrigin,NString pTermCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_LPRD_DISB_RULES_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_LOAN_PERIOD", pLoanPeriod);
			cmd.addParameter("@P_DISBURSE_DATE", pDisburseDate);
			cmd.addParameter("@P_PERIOD", pPeriod);
			cmd.addParameter("@P_LOAN_PCT", pLoanPct);
			cmd.addParameter("@P_MEMO_EXP_DAYS", pMemoExpDays);
			cmd.addParameter("@P_PN_DISB_DATE", pPnDisbDate);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
				
			cmd.execute();


		}
		
	
	
	
}
