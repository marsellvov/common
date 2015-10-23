package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class RbSsCampusRules {
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_SS_CAMPUS_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NString pAidyCode,NString pCampCode,NString pName,NString pShortName,NString pAddressLine1,NString pAddressLine2,NString pAddressLine3,NString pCity,NString pStatCode,NString pZip,NString pPhone,NString pEmail,NString pWebLogoUrl,NString pBatchLogoFile,NString pCustomInfo,NNumber pGradRate6yr,NNumber pDefaultRate,NNumber pDefaultRateComp,NNumber pFedMedianLoanAmt,NNumber pFedMedianLoanYr,NNumber pFedLoanPmtAmt,NString pUserId,NString pDataOrigin,NString pInstitutionGroup,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_SS_CAMPUS_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_CAMP_CODE", pCampCode);
			cmd.addParameter("@P_NAME", pName);
			cmd.addParameter("@P_SHORT_NAME", pShortName);
			cmd.addParameter("@P_ADDRESS_LINE_1", pAddressLine1);
			cmd.addParameter("@P_ADDRESS_LINE_2", pAddressLine2);
			cmd.addParameter("@P_ADDRESS_LINE_3", pAddressLine3);
			cmd.addParameter("@P_CITY", pCity);
			cmd.addParameter("@P_STAT_CODE", pStatCode);
			cmd.addParameter("@P_ZIP", pZip);
			cmd.addParameter("@P_PHONE", pPhone);
			cmd.addParameter("@P_EMAIL", pEmail);
			cmd.addParameter("@P_WEB_LOGO_URL", pWebLogoUrl);
			cmd.addParameter("@P_BATCH_LOGO_FILE", pBatchLogoFile);
			cmd.addParameter("@P_CUSTOM_INFO", pCustomInfo);
			cmd.addParameter("@P_GRAD_RATE_6YR", pGradRate6yr);
			cmd.addParameter("@P_DEFAULT_RATE", pDefaultRate);
			cmd.addParameter("@P_DEFAULT_RATE_COMP", pDefaultRateComp);
			cmd.addParameter("@P_FED_MEDIAN_LOAN_AMT", pFedMedianLoanAmt);
			cmd.addParameter("@P_FED_MEDIAN_LOAN_YR", pFedMedianLoanYr);
			cmd.addParameter("@P_FED_LOAN_PMT_AMT", pFedLoanPmtAmt);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_INSTITUTION_GROUP", pInstitutionGroup);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NString pAidyCode,NString pCampCode,NString pName,NString pShortName,NString pAddressLine1,NString pAddressLine2,NString pAddressLine3,NString pCity,NString pStatCode,NString pZip,NString pPhone,NString pEmail,NString pWebLogoUrl,NString pBatchLogoFile,NString pCustomInfo,NNumber pGradRate6yr,NNumber pDefaultRate,NNumber pDefaultRateComp,NNumber pFedMedianLoanAmt,NNumber pFedMedianLoanYr,NNumber pFedLoanPmtAmt,NString pUserId,NString pDataOrigin,NString pInstitutionGroup) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_SS_CAMPUS_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_CAMP_CODE", pCampCode);
			cmd.addParameter("@P_NAME", pName);
			cmd.addParameter("@P_SHORT_NAME", pShortName);
			cmd.addParameter("@P_ADDRESS_LINE_1", pAddressLine1);
			cmd.addParameter("@P_ADDRESS_LINE_2", pAddressLine2);
			cmd.addParameter("@P_ADDRESS_LINE_3", pAddressLine3);
			cmd.addParameter("@P_CITY", pCity);
			cmd.addParameter("@P_STAT_CODE", pStatCode);
			cmd.addParameter("@P_ZIP", pZip);
			cmd.addParameter("@P_PHONE", pPhone);
			cmd.addParameter("@P_EMAIL", pEmail);
			cmd.addParameter("@P_WEB_LOGO_URL", pWebLogoUrl);
			cmd.addParameter("@P_BATCH_LOGO_FILE", pBatchLogoFile);
			cmd.addParameter("@P_CUSTOM_INFO", pCustomInfo);
			cmd.addParameter("@P_GRAD_RATE_6YR", pGradRate6yr);
			cmd.addParameter("@P_DEFAULT_RATE", pDefaultRate);
			cmd.addParameter("@P_DEFAULT_RATE_COMP", pDefaultRateComp);
			cmd.addParameter("@P_FED_MEDIAN_LOAN_AMT", pFedMedianLoanAmt);
			cmd.addParameter("@P_FED_MEDIAN_LOAN_YR", pFedMedianLoanYr);
			cmd.addParameter("@P_FED_LOAN_PMT_AMT", pFedLoanPmtAmt);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_INSTITUTION_GROUP", pInstitutionGroup);
				
			cmd.execute();


		}
		
	
	
	
}
