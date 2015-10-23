package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class PvCashBalanceBpRules {
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_CASH_BALANCE_BP_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NNumber pPidm,NString pYear,NString pPictCode,NNumber pPayno,NNumber pSeqNo,NString pFiscalYear,NString pReportNo,NString pSsn,NString pLastName,NString pFirstName,NString pMi,NNumber pEligibleGrossAmt,NNumber pEmplAmt,NNumber pEmprAmt,NString pCountyCode,NString pDistrictCode,NDate pServiceDate,NString pReportedData,NString pPhrpensExists,NString pUserId,NString pDataOrigin,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_CASH_BALANCE_BP_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_YEAR", pYear);
			cmd.addParameter("@P_PICT_CODE", pPictCode);
			cmd.addParameter("@P_PAYNO", pPayno);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_FISCAL_YEAR", pFiscalYear);
			cmd.addParameter("@P_REPORT_NO", pReportNo);
			cmd.addParameter("@P_SSN", pSsn);
			cmd.addParameter("@P_LAST_NAME", pLastName);
			cmd.addParameter("@P_FIRST_NAME", pFirstName);
			cmd.addParameter("@P_MI", pMi);
			cmd.addParameter("@P_ELIGIBLE_GROSS_AMT", pEligibleGrossAmt);
			cmd.addParameter("@P_EMPL_AMT", pEmplAmt);
			cmd.addParameter("@P_EMPR_AMT", pEmprAmt);
			cmd.addParameter("@P_COUNTY_CODE", pCountyCode);
			cmd.addParameter("@P_DISTRICT_CODE", pDistrictCode);
			cmd.addParameter("@P_SERVICE_DATE", pServiceDate);
			cmd.addParameter("@P_REPORTED_DATA", pReportedData);
			cmd.addParameter("@P_PHRPENS_EXISTS", pPhrpensExists);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NNumber pPidm,NString pYear,NString pPictCode,NNumber pPayno,NNumber pSeqNo,NString pFiscalYear,NString pReportNo,NString pSsn,NString pLastName,NString pFirstName,NString pMi,NNumber pEligibleGrossAmt,NNumber pEmplAmt,NNumber pEmprAmt,NString pCountyCode,NString pDistrictCode,NDate pServiceDate,NString pReportedData,NString pPhrpensExists,NString pUserId,NString pDataOrigin) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_CASH_BALANCE_BP_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_YEAR", pYear);
			cmd.addParameter("@P_PICT_CODE", pPictCode);
			cmd.addParameter("@P_PAYNO", pPayno);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_FISCAL_YEAR", pFiscalYear);
			cmd.addParameter("@P_REPORT_NO", pReportNo);
			cmd.addParameter("@P_SSN", pSsn);
			cmd.addParameter("@P_LAST_NAME", pLastName);
			cmd.addParameter("@P_FIRST_NAME", pFirstName);
			cmd.addParameter("@P_MI", pMi);
			cmd.addParameter("@P_ELIGIBLE_GROSS_AMT", pEligibleGrossAmt);
			cmd.addParameter("@P_EMPL_AMT", pEmplAmt);
			cmd.addParameter("@P_EMPR_AMT", pEmprAmt);
			cmd.addParameter("@P_COUNTY_CODE", pCountyCode);
			cmd.addParameter("@P_DISTRICT_CODE", pDistrictCode);
			cmd.addParameter("@P_SERVICE_DATE", pServiceDate);
			cmd.addParameter("@P_REPORTED_DATA", pReportedData);
			cmd.addParameter("@P_PHRPENS_EXISTS", pPhrpensExists);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
				
			cmd.execute();


		}
		
	
	
	
}
