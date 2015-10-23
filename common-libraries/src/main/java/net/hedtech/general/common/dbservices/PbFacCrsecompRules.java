package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class PbFacCrsecompRules {
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_FAC_CRSECOMP_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NString pTermCode,NNumber pPidm,NString pCrn,NString pCategory,NString pSchdCode,NNumber pRate,NString pCalcMethod,NString pUserId,NString pDataOrigin,NString pFlclCode,NNumber pCreditHrSess,NNumber pHrsWeek,NNumber pCompensationAmount,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_FAC_CRSECOMP_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_CRN", pCrn);
			cmd.addParameter("@P_CATEGORY", pCategory);
			cmd.addParameter("@P_SCHD_CODE", pSchdCode);
			cmd.addParameter("@P_RATE", pRate);
			cmd.addParameter("@P_CALC_METHOD", pCalcMethod);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_FLCL_CODE", pFlclCode);
			cmd.addParameter("@P_CREDIT_HR_SESS", pCreditHrSess);
			cmd.addParameter("@P_HRS_WEEK", pHrsWeek);
			cmd.addParameter("@P_COMPENSATION_AMOUNT", pCompensationAmount);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NString pTermCode,NNumber pPidm,NString pCrn,NString pCategory,NString pSchdCode,NNumber pRate,NString pCalcMethod,NString pUserId,NString pDataOrigin,NString pFlclCode,NNumber pCreditHrSess,NNumber pHrsWeek,NNumber pCompensationAmount) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_FAC_CRSECOMP_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_CRN", pCrn);
			cmd.addParameter("@P_CATEGORY", pCategory);
			cmd.addParameter("@P_SCHD_CODE", pSchdCode);
			cmd.addParameter("@P_RATE", pRate);
			cmd.addParameter("@P_CALC_METHOD", pCalcMethod);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_FLCL_CODE", pFlclCode);
			cmd.addParameter("@P_CREDIT_HR_SESS", pCreditHrSess);
			cmd.addParameter("@P_HRS_WEEK", pHrsWeek);
			cmd.addParameter("@P_COMPENSATION_AMOUNT", pCompensationAmount);
				
			cmd.execute();


		}
		
	
	
	
}
