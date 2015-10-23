package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class RbScholarshipDemoRules {
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_SCHOLARSHIP_DEMO_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NString pFundCode,NString pMultipleDonorInd,NString pRestrictedInd,NString pTuitionWaiverInd,NNumber pMaximumTerms,NString pSsrcCode,NString pMinEnrollment,NString pUserId,NString pDataOrigin,NString pDeptCode,NString pPrimaryUserName,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_SCHOLARSHIP_DEMO_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_MULTIPLE_DONOR_IND", pMultipleDonorInd);
			cmd.addParameter("@P_RESTRICTED_IND", pRestrictedInd);
			cmd.addParameter("@P_TUITION_WAIVER_IND", pTuitionWaiverInd);
			cmd.addParameter("@P_MAXIMUM_TERMS", pMaximumTerms);
			cmd.addParameter("@P_SSRC_CODE", pSsrcCode);
			cmd.addParameter("@P_MIN_ENROLLMENT", pMinEnrollment);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_DEPT_CODE", pDeptCode);
			cmd.addParameter("@P_PRIMARY_USER_NAME", pPrimaryUserName);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NString pFundCode,NString pMultipleDonorInd,NString pRestrictedInd,NString pTuitionWaiverInd,NNumber pMaximumTerms,NString pSsrcCode,NString pMinEnrollment,NString pUserId,NString pDataOrigin,NString pDeptCode,NString pPrimaryUserName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_SCHOLARSHIP_DEMO_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_MULTIPLE_DONOR_IND", pMultipleDonorInd);
			cmd.addParameter("@P_RESTRICTED_IND", pRestrictedInd);
			cmd.addParameter("@P_TUITION_WAIVER_IND", pTuitionWaiverInd);
			cmd.addParameter("@P_MAXIMUM_TERMS", pMaximumTerms);
			cmd.addParameter("@P_SSRC_CODE", pSsrcCode);
			cmd.addParameter("@P_MIN_ENROLLMENT", pMinEnrollment);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_DEPT_CODE", pDeptCode);
			cmd.addParameter("@P_PRIMARY_USER_NAME", pPrimaryUserName);
				
			cmd.execute();


		}
		
	
	
	
}
