package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class RbCreditHourRulesRules {
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_CREDIT_HOUR_RULES_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NString pAidyCode,NString pLevlCode,NString pPeriod,NNumber pFullTimeCrHrs,NNumber p3quarterCrHrs,NNumber pHalfTimeCrHrs,NString pUserId,NString pDataOrigin,NString pTermCode,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_CREDIT_HOUR_RULES_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_LEVL_CODE", pLevlCode);
			cmd.addParameter("@P_PERIOD", pPeriod);
			cmd.addParameter("@P_FULL_TIME_CR_HRS", pFullTimeCrHrs);
			cmd.addParameter("@P_3QUARTER_CR_HRS", p3quarterCrHrs);
			cmd.addParameter("@P_HALF_TIME_CR_HRS", pHalfTimeCrHrs);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NString pAidyCode,NString pLevlCode,NString pPeriod,NNumber pFullTimeCrHrs,NNumber p3quarterCrHrs,NNumber pHalfTimeCrHrs,NString pUserId,NString pDataOrigin,NString pTermCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_CREDIT_HOUR_RULES_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_LEVL_CODE", pLevlCode);
			cmd.addParameter("@P_PERIOD", pPeriod);
			cmd.addParameter("@P_FULL_TIME_CR_HRS", pFullTimeCrHrs);
			cmd.addParameter("@P_3QUARTER_CR_HRS", p3quarterCrHrs);
			cmd.addParameter("@P_HALF_TIME_CR_HRS", pHalfTimeCrHrs);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
				
			cmd.execute();


		}
		
	
	
	
}
