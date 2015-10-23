package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class PbFacCrsassignRules {
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_FAC_CRSASSIGN_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NString pTermCode,NNumber pPidm,NString pCrn,NString pCategory,NString pCampCode,NString pCollCode,NString pFcntCode,NString pPosn,NString pSuff,NDate pJobEffectiveDate,NNumber pPercentResponse,NNumber pPercentSess,NNumber pTotalCreditHrSess,NNumber pTotalHrsWeek,NNumber pWorkload,NNumber pEnrl,NString pUserId,NString pDataOrigin,NString pPtrmCode,NNumber pWorkloadIncr,NNumber pRevisedCreditHrs,NNumber pRevisedHrsWeek,NNumber pRevisedWorkload,NNumber pRevisedEnrl,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_FAC_CRSASSIGN_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_CRN", pCrn);
			cmd.addParameter("@P_CATEGORY", pCategory);
			cmd.addParameter("@P_CAMP_CODE", pCampCode);
			cmd.addParameter("@P_COLL_CODE", pCollCode);
			cmd.addParameter("@P_FCNT_CODE", pFcntCode);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_SUFF", pSuff);
			cmd.addParameter("@P_JOB_EFFECTIVE_DATE", pJobEffectiveDate);
			cmd.addParameter("@P_PERCENT_RESPONSE", pPercentResponse);
			cmd.addParameter("@P_PERCENT_SESS", pPercentSess);
			cmd.addParameter("@P_TOTAL_CREDIT_HR_SESS", pTotalCreditHrSess);
			cmd.addParameter("@P_TOTAL_HRS_WEEK", pTotalHrsWeek);
			cmd.addParameter("@P_WORKLOAD", pWorkload);
			cmd.addParameter("@P_ENRL", pEnrl);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_PTRM_CODE", pPtrmCode);
			cmd.addParameter("@P_WORKLOAD_INCR", pWorkloadIncr);
			cmd.addParameter("@P_REVISED_CREDIT_HRS", pRevisedCreditHrs);
			cmd.addParameter("@P_REVISED_HRS_WEEK", pRevisedHrsWeek);
			cmd.addParameter("@P_REVISED_WORKLOAD", pRevisedWorkload);
			cmd.addParameter("@P_REVISED_ENRL", pRevisedEnrl);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NString pTermCode,NNumber pPidm,NString pCrn,NString pCategory,NString pCampCode,NString pCollCode,NString pFcntCode,NString pPosn,NString pSuff,NDate pJobEffectiveDate,NNumber pPercentResponse,NNumber pPercentSess,NNumber pTotalCreditHrSess,NNumber pTotalHrsWeek,NNumber pWorkload,NNumber pEnrl,NString pUserId,NString pDataOrigin,NString pPtrmCode,NNumber pWorkloadIncr,NNumber pRevisedCreditHrs,NNumber pRevisedHrsWeek,NNumber pRevisedWorkload,NNumber pRevisedEnrl) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_FAC_CRSASSIGN_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_CRN", pCrn);
			cmd.addParameter("@P_CATEGORY", pCategory);
			cmd.addParameter("@P_CAMP_CODE", pCampCode);
			cmd.addParameter("@P_COLL_CODE", pCollCode);
			cmd.addParameter("@P_FCNT_CODE", pFcntCode);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_SUFF", pSuff);
			cmd.addParameter("@P_JOB_EFFECTIVE_DATE", pJobEffectiveDate);
			cmd.addParameter("@P_PERCENT_RESPONSE", pPercentResponse);
			cmd.addParameter("@P_PERCENT_SESS", pPercentSess);
			cmd.addParameter("@P_TOTAL_CREDIT_HR_SESS", pTotalCreditHrSess);
			cmd.addParameter("@P_TOTAL_HRS_WEEK", pTotalHrsWeek);
			cmd.addParameter("@P_WORKLOAD", pWorkload);
			cmd.addParameter("@P_ENRL", pEnrl);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_PTRM_CODE", pPtrmCode);
			cmd.addParameter("@P_WORKLOAD_INCR", pWorkloadIncr);
			cmd.addParameter("@P_REVISED_CREDIT_HRS", pRevisedCreditHrs);
			cmd.addParameter("@P_REVISED_HRS_WEEK", pRevisedHrsWeek);
			cmd.addParameter("@P_REVISED_WORKLOAD", pRevisedWorkload);
			cmd.addParameter("@P_REVISED_ENRL", pRevisedEnrl);
				
			cmd.execute();


		}
		
	
	
	
}
