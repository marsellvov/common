package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class PvMisEjWorkingRules {
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_MIS_EJ_WORKING_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NString pReportNo,NString pEbReportNo,NNumber pPidm,NString pGi01,NString pGi03,NString pId,NString pLastName,NString pFirstName,NString pMi,NString pEb00,NString pEj01,NString pEj02,NString pEj03,NNumber pEj04,NNumber pEj05,NNumber pEj08,NString pPosn,NString pSuff,NDate pJobsEffectiveDate,NString pCrn,NString pTermCode,NNumber pTermLenMult,NString pCategory,NString pMasaCode,NNumber pMasaPercent,NString pTopsCode,NString pFinalInd,NString pSourceType,NString pUserId,NString pDataOrigin,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_MIS_EJ_WORKING_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_REPORT_NO", pReportNo);
			cmd.addParameter("@P_EB_REPORT_NO", pEbReportNo);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_GI01", pGi01);
			cmd.addParameter("@P_GI03", pGi03);
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_LAST_NAME", pLastName);
			cmd.addParameter("@P_FIRST_NAME", pFirstName);
			cmd.addParameter("@P_MI", pMi);
			cmd.addParameter("@P_EB00", pEb00);
			cmd.addParameter("@P_EJ01", pEj01);
			cmd.addParameter("@P_EJ02", pEj02);
			cmd.addParameter("@P_EJ03", pEj03);
			cmd.addParameter("@P_EJ04", pEj04);
			cmd.addParameter("@P_EJ05", pEj05);
			cmd.addParameter("@P_EJ08", pEj08);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_SUFF", pSuff);
			cmd.addParameter("@P_JOBS_EFFECTIVE_DATE", pJobsEffectiveDate);
			cmd.addParameter("@P_CRN", pCrn);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_TERM_LEN_MULT", pTermLenMult);
			cmd.addParameter("@P_CATEGORY", pCategory);
			cmd.addParameter("@P_MASA_CODE", pMasaCode);
			cmd.addParameter("@P_MASA_PERCENT", pMasaPercent);
			cmd.addParameter("@P_TOPS_CODE", pTopsCode);
			cmd.addParameter("@P_FINAL_IND", pFinalInd);
			cmd.addParameter("@P_SOURCE_TYPE", pSourceType);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NString pReportNo,NString pEbReportNo,NNumber pPidm,NString pGi01,NString pGi03,NString pId,NString pLastName,NString pFirstName,NString pMi,NString pEb00,NString pEj01,NString pEj02,NString pEj03,NNumber pEj04,NNumber pEj05,NNumber pEj08,NString pPosn,NString pSuff,NDate pJobsEffectiveDate,NString pCrn,NString pTermCode,NNumber pTermLenMult,NString pCategory,NString pMasaCode,NNumber pMasaPercent,NString pTopsCode,NString pFinalInd,NString pSourceType,NString pUserId,NString pDataOrigin) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_MIS_EJ_WORKING_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_REPORT_NO", pReportNo);
			cmd.addParameter("@P_EB_REPORT_NO", pEbReportNo);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_GI01", pGi01);
			cmd.addParameter("@P_GI03", pGi03);
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_LAST_NAME", pLastName);
			cmd.addParameter("@P_FIRST_NAME", pFirstName);
			cmd.addParameter("@P_MI", pMi);
			cmd.addParameter("@P_EB00", pEb00);
			cmd.addParameter("@P_EJ01", pEj01);
			cmd.addParameter("@P_EJ02", pEj02);
			cmd.addParameter("@P_EJ03", pEj03);
			cmd.addParameter("@P_EJ04", pEj04);
			cmd.addParameter("@P_EJ05", pEj05);
			cmd.addParameter("@P_EJ08", pEj08);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_SUFF", pSuff);
			cmd.addParameter("@P_JOBS_EFFECTIVE_DATE", pJobsEffectiveDate);
			cmd.addParameter("@P_CRN", pCrn);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_TERM_LEN_MULT", pTermLenMult);
			cmd.addParameter("@P_CATEGORY", pCategory);
			cmd.addParameter("@P_MASA_CODE", pMasaCode);
			cmd.addParameter("@P_MASA_PERCENT", pMasaPercent);
			cmd.addParameter("@P_TOPS_CODE", pTopsCode);
			cmd.addParameter("@P_FINAL_IND", pFinalInd);
			cmd.addParameter("@P_SOURCE_TYPE", pSourceType);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
				
			cmd.execute();


		}
		
	
	
	
}
