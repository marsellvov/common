package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class PbW2FederalRules {
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_W2_FEDERAL_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NNumber pYear,NNumber pQuarter,NString pEmprCode,NNumber pPidm,NNumber pSeqNo,NString pStatus,NString pUserId,NString pStatutoryEmployeeInd,NString pRetirementPlanInd,NString pThirdPartySickInd,NString pEmplSsn,NString pEmplLastName,NString pEmplFirstName,NString pEmplMi,NString pEmplSuffix,NString pDataOrigin,NNumber pControlNumber,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_W2_FEDERAL_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_YEAR", pYear);
			cmd.addParameter("@P_QUARTER", pQuarter);
			cmd.addParameter("@P_EMPR_CODE", pEmprCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_STATUS", pStatus);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_STATUTORY_EMPLOYEE_IND", pStatutoryEmployeeInd);
			cmd.addParameter("@P_RETIREMENT_PLAN_IND", pRetirementPlanInd);
			cmd.addParameter("@P_THIRD_PARTY_SICK_IND", pThirdPartySickInd);
			cmd.addParameter("@P_EMPL_SSN", pEmplSsn);
			cmd.addParameter("@P_EMPL_LAST_NAME", pEmplLastName);
			cmd.addParameter("@P_EMPL_FIRST_NAME", pEmplFirstName);
			cmd.addParameter("@P_EMPL_MI", pEmplMi);
			cmd.addParameter("@P_EMPL_SUFFIX", pEmplSuffix);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_CONTROL_NUMBER", pControlNumber);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NString pOperationType,NNumber pYear,NNumber pQuarter,NString pEmprCode,NNumber pPidm,NNumber pSeqNo,NString pStatus,NString pUserId,NString pStatutoryEmployeeInd,NString pRetirementPlanInd,NString pThirdPartySickInd,NString pEmplSsn,NString pEmplLastName,NString pEmplFirstName,NString pEmplMi,NString pEmplSuffix,NString pDataOrigin,NNumber pControlNumber) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_W2_FEDERAL_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_YEAR", pYear);
			cmd.addParameter("@P_QUARTER", pQuarter);
			cmd.addParameter("@P_EMPR_CODE", pEmprCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_STATUS", pStatus);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_STATUTORY_EMPLOYEE_IND", pStatutoryEmployeeInd);
			cmd.addParameter("@P_RETIREMENT_PLAN_IND", pRetirementPlanInd);
			cmd.addParameter("@P_THIRD_PARTY_SICK_IND", pThirdPartySickInd);
			cmd.addParameter("@P_EMPL_SSN", pEmplSsn);
			cmd.addParameter("@P_EMPL_LAST_NAME", pEmplLastName);
			cmd.addParameter("@P_EMPL_FIRST_NAME", pEmplFirstName);
			cmd.addParameter("@P_EMPL_MI", pEmplMi);
			cmd.addParameter("@P_EMPL_SUFFIX", pEmplSuffix);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_CONTROL_NUMBER", pControlNumber);
				
			cmd.execute();


		}
		
	
	
	
}
