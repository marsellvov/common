package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SbPhoneassignmentRules {
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_PHONEASSIGNMENT_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NNumber pPidm,NString pTermCode,NString pPrcdCode,NString pPhoneAccountNumber,NString pPhoneArea,NString pPhoneExt,NString pPhoneNumber,NDate pBeginDate,NDate pEndDate,NNumber pTotalDays,NNumber pTotalMonths,NNumber pTotalTerms,NString pPscdCode,NDate pPscdDate,NString pOnlOrBat,NString pArInd,NString pRollInd,NString pAssessNeeded,NString pDataOrigin,NString pUserId,NString pCtryCodePhone,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_PHONEASSIGNMENT_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_PRCD_CODE", pPrcdCode);
			cmd.addParameter("@P_PHONE_ACCOUNT_NUMBER", pPhoneAccountNumber);
			cmd.addParameter("@P_PHONE_AREA", pPhoneArea);
			cmd.addParameter("@P_PHONE_EXT", pPhoneExt);
			cmd.addParameter("@P_PHONE_NUMBER", pPhoneNumber);
			cmd.addParameter("@P_BEGIN_DATE", pBeginDate);
			cmd.addParameter("@P_END_DATE", pEndDate);
			cmd.addParameter("@P_TOTAL_DAYS", pTotalDays);
			cmd.addParameter("@P_TOTAL_MONTHS", pTotalMonths);
			cmd.addParameter("@P_TOTAL_TERMS", pTotalTerms);
			cmd.addParameter("@P_PSCD_CODE", pPscdCode);
			cmd.addParameter("@P_PSCD_DATE", pPscdDate);
			cmd.addParameter("@P_ONL_OR_BAT", pOnlOrBat);
			cmd.addParameter("@P_AR_IND", pArInd);
			cmd.addParameter("@P_ROLL_IND", pRollInd);
			cmd.addParameter("@P_ASSESS_NEEDED", pAssessNeeded);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_CTRY_CODE_PHONE", pCtryCodePhone);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NNumber pPidm,NString pTermCode,NString pPrcdCode,NString pPhoneAccountNumber,NString pPhoneArea,NString pPhoneExt,NString pPhoneNumber,NDate pBeginDate,NDate pEndDate,NNumber pTotalDays,NNumber pTotalMonths,NNumber pTotalTerms,NString pPscdCode,NDate pPscdDate,NString pOnlOrBat,NString pArInd,NString pRollInd,NString pAssessNeeded,NString pDataOrigin,NString pUserId,NString pCtryCodePhone) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_PHONEASSIGNMENT_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_PRCD_CODE", pPrcdCode);
			cmd.addParameter("@P_PHONE_ACCOUNT_NUMBER", pPhoneAccountNumber);
			cmd.addParameter("@P_PHONE_AREA", pPhoneArea);
			cmd.addParameter("@P_PHONE_EXT", pPhoneExt);
			cmd.addParameter("@P_PHONE_NUMBER", pPhoneNumber);
			cmd.addParameter("@P_BEGIN_DATE", pBeginDate);
			cmd.addParameter("@P_END_DATE", pEndDate);
			cmd.addParameter("@P_TOTAL_DAYS", pTotalDays);
			cmd.addParameter("@P_TOTAL_MONTHS", pTotalMonths);
			cmd.addParameter("@P_TOTAL_TERMS", pTotalTerms);
			cmd.addParameter("@P_PSCD_CODE", pPscdCode);
			cmd.addParameter("@P_PSCD_DATE", pPscdDate);
			cmd.addParameter("@P_ONL_OR_BAT", pOnlOrBat);
			cmd.addParameter("@P_AR_IND", pArInd);
			cmd.addParameter("@P_ROLL_IND", pRollInd);
			cmd.addParameter("@P_ASSESS_NEEDED", pAssessNeeded);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_CTRY_CODE_PHONE", pCtryCodePhone);
				
			cmd.execute();


		}
		
	
	
	
}
