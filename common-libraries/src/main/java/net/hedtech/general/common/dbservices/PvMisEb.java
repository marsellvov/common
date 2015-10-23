package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class PvMisEb {
		public static NNumber fAddlCompensation(NNumber pPidm,NDate pReportEndDate,NString pTermCode,NString pReportDomainInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_MIS_EB.F_ADDL_COMPENSATION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_REPORT_END_DATE", pReportEndDate);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_REPORT_DOMAIN_IND", pReportDomainInd);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fAnnualSalary(NNumber pPidm,NDate pReportEndDate,NDate pTermEndDate,NString pReportDomainInd,NString pEgrpCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_MIS_EB.F_ANNUAL_SALARY", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_REPORT_END_DATE", pReportEndDate);
			cmd.addParameter("@P_TERM_END_DATE", pTermEndDate);
			cmd.addParameter("@P_REPORT_DOMAIN_IND", pReportDomainInd);
			cmd.addParameter("@P_EGRP_CODE", pEgrpCode);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString fCitizenInd(NString pStrOfCitzCodes,NString pCitzCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_MIS_EB.F_CITIZEN_IND", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_STR_OF_CITZ_CODES", pStrOfCitzCodes);
			cmd.addParameter("@P_CITZ_CODE", pCitzCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fDistrictIdentifier() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_MIS_EB.F_DISTRICT_IDENTIFIER", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fEmplContrDuration(NString pEclsCode,NString pStatus,NString pContractStatus) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_MIS_EB.F_EMPL_CONTR_DURATION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_ECLS_CODE", pEclsCode);
			cmd.addParameter("@P_STATUS", pStatus);
			cmd.addParameter("@P_CONTRACT_STATUS", pContractStatus);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fEmplDisabilityStatus(NString pDisbInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_MIS_EB.F_EMPL_DISABILITY_STATUS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_DISB_IND", pDisbInd);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fEmplEe06Occupation(NString pPosn,NString pStatus,NString pContractStatus) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_MIS_EB.F_EMPL_EE06_OCCUPATION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_STATUS", pStatus);
			cmd.addParameter("@P_CONTRACT_STATUS", pContractStatus);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fEmplEmploymentStatus(NString pJcreCode,NString pContractStatus) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_MIS_EB.F_EMPL_EMPLOYMENT_STATUS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_JCRE_CODE", pJcreCode);
			cmd.addParameter("@P_CONTRACT_STATUS", pContractStatus);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fExclEmployeeGroup(NString pStrOfEgrpCodes,NString pEgrpCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_MIS_EB.F_EXCL_EMPLOYEE_GROUP", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_STR_OF_EGRP_CODES", pStrOfEgrpCodes);
			cmd.addParameter("@P_EGRP_CODE", pEgrpCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pGetElements(NString pReportDomainInd,NString pTermIdentifier,NString pReportNo,NString pTermCode,NString pFinalInd,NString pStrOfEgrpCodes,NString pStrOfCitzCodes,NDate pReportStartDate,NDate pReportEndDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_MIS_EB.P_GET_ELEMENTS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_REPORT_DOMAIN_IND", pReportDomainInd);
			cmd.addParameter("@P_TERM_IDENTIFIER", pTermIdentifier);
			cmd.addParameter("@P_REPORT_NO", pReportNo);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_FINAL_IND", pFinalInd);
			cmd.addParameter("@P_STR_OF_EGRP_CODES", pStrOfEgrpCodes);
			cmd.addParameter("@P_STR_OF_CITZ_CODES", pStrOfCitzCodes);
			cmd.addParameter("@P_REPORT_START_DATE", pReportStartDate);
			cmd.addParameter("@P_REPORT_END_DATE", pReportEndDate);
				
			cmd.execute();


		}
		
		public static void pGetElements(NString pReportDomainInd,NString pTermIdentifier,NString pReportNo,NString pTermCode,NString pFinalInd,NString pStrOfEgrpCodes,NString pStrOfCitzCodes,NString pReportStartDate,NString pReportEndDate,NString pReportDateFmt) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_MIS_EB.P_GET_ELEMENTS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_REPORT_DOMAIN_IND", pReportDomainInd);
			cmd.addParameter("@P_TERM_IDENTIFIER", pTermIdentifier);
			cmd.addParameter("@P_REPORT_NO", pReportNo);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_FINAL_IND", pFinalInd);
			cmd.addParameter("@P_STR_OF_EGRP_CODES", pStrOfEgrpCodes);
			cmd.addParameter("@P_STR_OF_CITZ_CODES", pStrOfCitzCodes);
			cmd.addParameter("@P_REPORT_START_DATE", pReportStartDate);
			cmd.addParameter("@P_REPORT_END_DATE", pReportEndDate);
			cmd.addParameter("@P_REPORT_DATE_FMT", pReportDateFmt);
				
			cmd.execute();


		}
		
	
	
	
}
