package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SbAthleticTransferRules {
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_ATHLETIC_TRANSFER_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NNumber pPidm,NString pTransEligibleInd,NString pResReqInd,NString pMetCreditYrInd,NString pUserId,NNumber pTransQualityPoints,NNumber pTransGpa,NNumber pTransTermsAttended,NNumber pTransHoursAttempted,NNumber pTransHoursEarned,NDate pTransAcceptDate,NString pSatrCode,NString pSarxCode,NString pDataOrigin,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_ATHLETIC_TRANSFER_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TRANS_ELIGIBLE_IND", pTransEligibleInd);
			cmd.addParameter("@P_RES_REQ_IND", pResReqInd);
			cmd.addParameter("@P_MET_CREDIT_YR_IND", pMetCreditYrInd);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_TRANS_QUALITY_POINTS", pTransQualityPoints);
			cmd.addParameter("@P_TRANS_GPA", pTransGpa);
			cmd.addParameter("@P_TRANS_TERMS_ATTENDED", pTransTermsAttended);
			cmd.addParameter("@P_TRANS_HOURS_ATTEMPTED", pTransHoursAttempted);
			cmd.addParameter("@P_TRANS_HOURS_EARNED", pTransHoursEarned);
			cmd.addParameter("@P_TRANS_ACCEPT_DATE", pTransAcceptDate);
			cmd.addParameter("@P_SATR_CODE", pSatrCode);
			cmd.addParameter("@P_SARX_CODE", pSarxCode);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NNumber pPidm,NString pTransEligibleInd,NString pResReqInd,NString pMetCreditYrInd,NString pUserId,NNumber pTransQualityPoints,NNumber pTransGpa,NNumber pTransTermsAttended,NNumber pTransHoursAttempted,NNumber pTransHoursEarned,NDate pTransAcceptDate,NString pSatrCode,NString pSarxCode,NString pDataOrigin) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_ATHLETIC_TRANSFER_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TRANS_ELIGIBLE_IND", pTransEligibleInd);
			cmd.addParameter("@P_RES_REQ_IND", pResReqInd);
			cmd.addParameter("@P_MET_CREDIT_YR_IND", pMetCreditYrInd);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_TRANS_QUALITY_POINTS", pTransQualityPoints);
			cmd.addParameter("@P_TRANS_GPA", pTransGpa);
			cmd.addParameter("@P_TRANS_TERMS_ATTENDED", pTransTermsAttended);
			cmd.addParameter("@P_TRANS_HOURS_ATTEMPTED", pTransHoursAttempted);
			cmd.addParameter("@P_TRANS_HOURS_EARNED", pTransHoursEarned);
			cmd.addParameter("@P_TRANS_ACCEPT_DATE", pTransAcceptDate);
			cmd.addParameter("@P_SATR_CODE", pSatrCode);
			cmd.addParameter("@P_SARX_CODE", pSarxCode);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
				
			cmd.execute();


		}
		
	
	
	
}
