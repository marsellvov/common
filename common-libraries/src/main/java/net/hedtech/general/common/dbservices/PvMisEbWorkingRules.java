package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class PvMisEbWorkingRules {
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_MIS_EB_WORKING_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NString pReportNo,NNumber pPidm,NString pDistrictIdentifier,NString pTermIdentifier,NString pId,NString pLastName,NString pFirstName,NString pMi,NString pIdentifier,NString pIdentifierStatus,NDate pBirthDate,NString pGender,NString pCitizenInd,NString pDisabilityStatus,NString pEmplEe06Occupation,NString pEmplClassification,NString pEmplStatus,NString pEmplContrDuration,NNumber pAnnualSalary,NNumber pAddlCompensation,NString pMultEthnCde,NString pFinalInd,NString pUserId,NString pDataOrigin,NDate pReportStartDate,NDate pReportEndDate,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_MIS_EB_WORKING_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_REPORT_NO", pReportNo);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_DISTRICT_IDENTIFIER", pDistrictIdentifier);
			cmd.addParameter("@P_TERM_IDENTIFIER", pTermIdentifier);
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_LAST_NAME", pLastName);
			cmd.addParameter("@P_FIRST_NAME", pFirstName);
			cmd.addParameter("@P_MI", pMi);
			cmd.addParameter("@P_IDENTIFIER", pIdentifier);
			cmd.addParameter("@P_IDENTIFIER_STATUS", pIdentifierStatus);
			cmd.addParameter("@P_BIRTH_DATE", pBirthDate);
			cmd.addParameter("@P_GENDER", pGender);
			cmd.addParameter("@P_CITIZEN_IND", pCitizenInd);
			cmd.addParameter("@P_DISABILITY_STATUS", pDisabilityStatus);
			cmd.addParameter("@P_EMPL_EE06_OCCUPATION", pEmplEe06Occupation);
			cmd.addParameter("@P_EMPL_CLASSIFICATION", pEmplClassification);
			cmd.addParameter("@P_EMPL_STATUS", pEmplStatus);
			cmd.addParameter("@P_EMPL_CONTR_DURATION", pEmplContrDuration);
			cmd.addParameter("@P_ANNUAL_SALARY", pAnnualSalary);
			cmd.addParameter("@P_ADDL_COMPENSATION", pAddlCompensation);
			cmd.addParameter("@P_MULT_ETHN_CDE", pMultEthnCde);
			cmd.addParameter("@P_FINAL_IND", pFinalInd);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_REPORT_START_DATE", pReportStartDate);
			cmd.addParameter("@P_REPORT_END_DATE", pReportEndDate);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NString pReportNo,NNumber pPidm,NString pDistrictIdentifier,NString pTermIdentifier,NString pId,NString pLastName,NString pFirstName,NString pMi,NString pIdentifier,NString pIdentifierStatus,NDate pBirthDate,NString pGender,NString pCitizenInd,NString pDisabilityStatus,NString pEmplEe06Occupation,NString pEmplClassification,NString pEmplStatus,NString pEmplContrDuration,NNumber pAnnualSalary,NNumber pAddlCompensation,NString pMultEthnCde,NString pFinalInd,NString pUserId,NString pDataOrigin,NDate pReportStartDate,NDate pReportEndDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_MIS_EB_WORKING_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_REPORT_NO", pReportNo);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_DISTRICT_IDENTIFIER", pDistrictIdentifier);
			cmd.addParameter("@P_TERM_IDENTIFIER", pTermIdentifier);
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_LAST_NAME", pLastName);
			cmd.addParameter("@P_FIRST_NAME", pFirstName);
			cmd.addParameter("@P_MI", pMi);
			cmd.addParameter("@P_IDENTIFIER", pIdentifier);
			cmd.addParameter("@P_IDENTIFIER_STATUS", pIdentifierStatus);
			cmd.addParameter("@P_BIRTH_DATE", pBirthDate);
			cmd.addParameter("@P_GENDER", pGender);
			cmd.addParameter("@P_CITIZEN_IND", pCitizenInd);
			cmd.addParameter("@P_DISABILITY_STATUS", pDisabilityStatus);
			cmd.addParameter("@P_EMPL_EE06_OCCUPATION", pEmplEe06Occupation);
			cmd.addParameter("@P_EMPL_CLASSIFICATION", pEmplClassification);
			cmd.addParameter("@P_EMPL_STATUS", pEmplStatus);
			cmd.addParameter("@P_EMPL_CONTR_DURATION", pEmplContrDuration);
			cmd.addParameter("@P_ANNUAL_SALARY", pAnnualSalary);
			cmd.addParameter("@P_ADDL_COMPENSATION", pAddlCompensation);
			cmd.addParameter("@P_MULT_ETHN_CDE", pMultEthnCde);
			cmd.addParameter("@P_FINAL_IND", pFinalInd);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_REPORT_START_DATE", pReportStartDate);
			cmd.addParameter("@P_REPORT_END_DATE", pReportEndDate);
				
			cmd.execute();


		}
		
	
	
	
}
