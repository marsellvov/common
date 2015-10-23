package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class PbExperienceRules {
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_EXPERIENCE_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NNumber pPidm,NString pPosnTitle,NString pEmtyCode,NString pEmprName,NDate pStartDate,NDate pEndDate,NNumber pCurrSalary,NNumber pCurrHourly,NString pReasonLeft,NNumber pEmpsSupervise,NString pSuperName,NString pCtryCodeSuperPhone,NString pSuperPhoneArea,NString pSuperPhoneNumber,NString pSuperPhoneExt,NString pContactInd,NString pSuperComment,NString pPosnDuties,NString pStatCode,NString pNatnCode,NString pUserId,NString pDataOrigin,NDate pHireActStartDate,NString pHireVerifRecInd,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_EXPERIENCE_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_POSN_TITLE", pPosnTitle);
			cmd.addParameter("@P_EMTY_CODE", pEmtyCode);
			cmd.addParameter("@P_EMPR_NAME", pEmprName);
			cmd.addParameter("@P_START_DATE", pStartDate);
			cmd.addParameter("@P_END_DATE", pEndDate);
			cmd.addParameter("@P_CURR_SALARY", pCurrSalary);
			cmd.addParameter("@P_CURR_HOURLY", pCurrHourly);
			cmd.addParameter("@P_REASON_LEFT", pReasonLeft);
			cmd.addParameter("@P_EMPS_SUPERVISE", pEmpsSupervise);
			cmd.addParameter("@P_SUPER_NAME", pSuperName);
			cmd.addParameter("@P_CTRY_CODE_SUPER_PHONE", pCtryCodeSuperPhone);
			cmd.addParameter("@P_SUPER_PHONE_AREA", pSuperPhoneArea);
			cmd.addParameter("@P_SUPER_PHONE_NUMBER", pSuperPhoneNumber);
			cmd.addParameter("@P_SUPER_PHONE_EXT", pSuperPhoneExt);
			cmd.addParameter("@P_CONTACT_IND", pContactInd);
			cmd.addParameter("@P_SUPER_COMMENT", pSuperComment);
			cmd.addParameter("@P_POSN_DUTIES", pPosnDuties);
			cmd.addParameter("@P_STAT_CODE", pStatCode);
			cmd.addParameter("@P_NATN_CODE", pNatnCode);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_HIRE_ACT_START_DATE", pHireActStartDate);
			cmd.addParameter("@P_HIRE_VERIF_REC_IND", pHireVerifRecInd);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NNumber pPidm,NString pPosnTitle,NString pEmtyCode,NString pEmprName,NDate pStartDate,NDate pEndDate,NNumber pCurrSalary,NNumber pCurrHourly,NString pReasonLeft,NNumber pEmpsSupervise,NString pSuperName,NString pCtryCodeSuperPhone,NString pSuperPhoneArea,NString pSuperPhoneNumber,NString pSuperPhoneExt,NString pContactInd,NString pSuperComment,NString pPosnDuties,NString pStatCode,NString pNatnCode,NString pUserId,NString pDataOrigin,NDate pHireActStartDate,NString pHireVerifRecInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_EXPERIENCE_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_POSN_TITLE", pPosnTitle);
			cmd.addParameter("@P_EMTY_CODE", pEmtyCode);
			cmd.addParameter("@P_EMPR_NAME", pEmprName);
			cmd.addParameter("@P_START_DATE", pStartDate);
			cmd.addParameter("@P_END_DATE", pEndDate);
			cmd.addParameter("@P_CURR_SALARY", pCurrSalary);
			cmd.addParameter("@P_CURR_HOURLY", pCurrHourly);
			cmd.addParameter("@P_REASON_LEFT", pReasonLeft);
			cmd.addParameter("@P_EMPS_SUPERVISE", pEmpsSupervise);
			cmd.addParameter("@P_SUPER_NAME", pSuperName);
			cmd.addParameter("@P_CTRY_CODE_SUPER_PHONE", pCtryCodeSuperPhone);
			cmd.addParameter("@P_SUPER_PHONE_AREA", pSuperPhoneArea);
			cmd.addParameter("@P_SUPER_PHONE_NUMBER", pSuperPhoneNumber);
			cmd.addParameter("@P_SUPER_PHONE_EXT", pSuperPhoneExt);
			cmd.addParameter("@P_CONTACT_IND", pContactInd);
			cmd.addParameter("@P_SUPER_COMMENT", pSuperComment);
			cmd.addParameter("@P_POSN_DUTIES", pPosnDuties);
			cmd.addParameter("@P_STAT_CODE", pStatCode);
			cmd.addParameter("@P_NATN_CODE", pNatnCode);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_HIRE_ACT_START_DATE", pHireActStartDate);
			cmd.addParameter("@P_HIRE_VERIF_REC_IND", pHireVerifRecInd);
				
			cmd.execute();


		}
		
	
	
	
}
