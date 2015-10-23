package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class RpkShoppingSheet {
		public static NNumber fGetBudgetCategoryAmt(NString pAidyCode,NNumber pPidm,NString pSsBudgetCategory,NString pMethodInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RPK_SHOPPING_SHEET.F_GET_BUDGET_CATEGORY_AMT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SS_BUDGET_CATEGORY", pSsBudgetCategory);
			cmd.addParameter("@P_METHOD_IND", pMethodInd);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString fGetEffCampCode(NString pAidyCode,NNumber pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RPK_SHOPPING_SHEET.F_GET_EFF_CAMP_CODE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber fGetFundCategoryAwardAmt(NString pAidyCode,NNumber pPidm,NString pSsFundCategory) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RPK_SHOPPING_SHEET.F_GET_FUND_CATEGORY_AWARD_AMT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SS_FUND_CATEGORY", pSsFundCategory);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static DataCursor fGetPdfRef(NString pAidyCode,NNumber pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RPK_SHOPPING_SHEET.F_GET_PDF_REF", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pGetShoppingSheetData(NString pAidyCode,NNumber pPidm,Ref<NString> pCampNameOut,Ref<NString> pCampShortNameOut,Ref<NString> pCampAddress1Out,Ref<NString> pCampAddress2Out,Ref<NString> pCampAddress3Out,Ref<NString> pCampCityOut,Ref<NString> pCampStatCodeOut,Ref<NString> pCampZipOut,Ref<NString> pCampPhoneOut,Ref<NString> pCampEmailOut,Ref<NString> pCampWebLogoUrlOut,Ref<NString> pCampBatchLogoFileOut,Ref<NString> pCampCustomInfoOut,Ref<NNumber> pCampGradRate6yrOut,Ref<NString> pCampGradRateTextOut,Ref<NString> pCampGradRateInvIndOut,Ref<NNumber> pCampGradLowRateOut,Ref<NNumber> pCampGradMedRateOut,Ref<NNumber> pCampDefaultRateOut,Ref<NNumber> pCampDefaultRateCompOut,Ref<NString> pCampDefaultRateTextOut,Ref<NNumber> pCampFedMedianLoanAmtOut,Ref<NNumber> pCampFedLoanAmtYrOut,Ref<NNumber> pCampFedLoanAmtPmtOut,Ref<NString> pCampMedianBorrowTextOut,Ref<NString> pFormattedStudentNameOut,Ref<NString> pStudentIdOut,Ref<NNumber> pEstimatedCoaAmtOut,Ref<NNumber> pTuitionFeesAmtOut,Ref<NNumber> pHousingMealsAmtOut,Ref<NNumber> pBooksSuppliesAmtOut,Ref<NNumber> pTransportationAmtOut,Ref<NNumber> pOtherCostsAmtOut,Ref<NNumber> pTotalGrantsScholsAmtOut,Ref<NNumber> pNetCostsAmtOut,Ref<NNumber> pGrantsFromSchoolAmtOut,Ref<NNumber> pPellGrantAmtOut,Ref<NNumber> pGrantsFromStateAmtOut,Ref<NNumber> pOtherScholsAmtOut,Ref<NNumber> pWorkStudyAmtOut,Ref<NNumber> pPerkinsAmtOut,Ref<NNumber> pDirectSubAmtOut,Ref<NNumber> pDirectUnsubAmtOut,Ref<NNumber> pEfcAmtOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RPK_SHOPPING_SHEET.P_GET_SHOPPING_SHEET_DATA", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_CAMP_NAME_OUT", NString.class);
			cmd.addParameter("@P_CAMP_SHORT_NAME_OUT", NString.class);
			cmd.addParameter("@P_CAMP_ADDRESS_1_OUT", NString.class);
			cmd.addParameter("@P_CAMP_ADDRESS_2_OUT", NString.class);
			cmd.addParameter("@P_CAMP_ADDRESS_3_OUT", NString.class);
			cmd.addParameter("@P_CAMP_CITY_OUT", NString.class);
			cmd.addParameter("@P_CAMP_STAT_CODE_OUT", NString.class);
			cmd.addParameter("@P_CAMP_ZIP_OUT", NString.class);
			cmd.addParameter("@P_CAMP_PHONE_OUT", NString.class);
			cmd.addParameter("@P_CAMP_EMAIL_OUT", NString.class);
			cmd.addParameter("@P_CAMP_WEB_LOGO_URL_OUT", NString.class);
			cmd.addParameter("@P_CAMP_BATCH_LOGO_FILE_OUT", NString.class);
			cmd.addParameter("@P_CAMP_CUSTOM_INFO_OUT", NString.class);
			cmd.addParameter("@P_CAMP_GRAD_RATE_6YR_OUT", NNumber.class);
			cmd.addParameter("@P_CAMP_GRAD_RATE_TEXT_OUT", NString.class);
			cmd.addParameter("@P_CAMP_GRAD_RATE_INV_IND_OUT", NString.class);
			cmd.addParameter("@P_CAMP_GRAD_LOW_RATE_OUT", NNumber.class);
			cmd.addParameter("@P_CAMP_GRAD_MED_RATE_OUT", NNumber.class);
			cmd.addParameter("@P_CAMP_DEFAULT_RATE_OUT", NNumber.class);
			cmd.addParameter("@P_CAMP_DEFAULT_RATE_COMP_OUT", NNumber.class);
			cmd.addParameter("@P_CAMP_DEFAULT_RATE_TEXT_OUT", NString.class);
			cmd.addParameter("@P_CAMP_FED_MEDIAN_LOAN_AMT_OUT", NNumber.class);
			cmd.addParameter("@P_CAMP_FED_LOAN_AMT_YR_OUT", NNumber.class);
			cmd.addParameter("@P_CAMP_FED_LOAN_AMT_PMT_OUT", NNumber.class);
			cmd.addParameter("@P_CAMP_MEDIAN_BORROW_TEXT_OUT", NString.class);
			cmd.addParameter("@P_FORMATTED_STUDENT_NAME_OUT", NString.class);
			cmd.addParameter("@P_STUDENT_ID_OUT", NString.class);
			cmd.addParameter("@P_ESTIMATED_COA_AMT_OUT", NNumber.class);
			cmd.addParameter("@P_TUITION_FEES_AMT_OUT", NNumber.class);
			cmd.addParameter("@P_HOUSING_MEALS_AMT_OUT", NNumber.class);
			cmd.addParameter("@P_BOOKS_SUPPLIES_AMT_OUT", NNumber.class);
			cmd.addParameter("@P_TRANSPORTATION_AMT_OUT", NNumber.class);
			cmd.addParameter("@P_OTHER_COSTS_AMT_OUT", NNumber.class);
			cmd.addParameter("@P_TOTAL_GRANTS_SCHOLS_AMT_OUT", NNumber.class);
			cmd.addParameter("@P_NET_COSTS_AMT_OUT", NNumber.class);
			cmd.addParameter("@P_GRANTS_FROM_SCHOOL_AMT_OUT", NNumber.class);
			cmd.addParameter("@P_PELL_GRANT_AMT_OUT", NNumber.class);
			cmd.addParameter("@P_GRANTS_FROM_STATE_AMT_OUT", NNumber.class);
			cmd.addParameter("@P_OTHER_SCHOLS_AMT_OUT", NNumber.class);
			cmd.addParameter("@P_WORK_STUDY_AMT_OUT", NNumber.class);
			cmd.addParameter("@P_PERKINS_AMT_OUT", NNumber.class);
			cmd.addParameter("@P_DIRECT_SUB_AMT_OUT", NNumber.class);
			cmd.addParameter("@P_DIRECT_UNSUB_AMT_OUT", NNumber.class);
			cmd.addParameter("@P_EFC_AMT_OUT", NNumber.class);
				
			cmd.execute();
			pCampNameOut.val = cmd.getParameterValue("@P_CAMP_NAME_OUT", NString.class);
			pCampShortNameOut.val = cmd.getParameterValue("@P_CAMP_SHORT_NAME_OUT", NString.class);
			pCampAddress1Out.val = cmd.getParameterValue("@P_CAMP_ADDRESS_1_OUT", NString.class);
			pCampAddress2Out.val = cmd.getParameterValue("@P_CAMP_ADDRESS_2_OUT", NString.class);
			pCampAddress3Out.val = cmd.getParameterValue("@P_CAMP_ADDRESS_3_OUT", NString.class);
			pCampCityOut.val = cmd.getParameterValue("@P_CAMP_CITY_OUT", NString.class);
			pCampStatCodeOut.val = cmd.getParameterValue("@P_CAMP_STAT_CODE_OUT", NString.class);
			pCampZipOut.val = cmd.getParameterValue("@P_CAMP_ZIP_OUT", NString.class);
			pCampPhoneOut.val = cmd.getParameterValue("@P_CAMP_PHONE_OUT", NString.class);
			pCampEmailOut.val = cmd.getParameterValue("@P_CAMP_EMAIL_OUT", NString.class);
			pCampWebLogoUrlOut.val = cmd.getParameterValue("@P_CAMP_WEB_LOGO_URL_OUT", NString.class);
			pCampBatchLogoFileOut.val = cmd.getParameterValue("@P_CAMP_BATCH_LOGO_FILE_OUT", NString.class);
			pCampCustomInfoOut.val = cmd.getParameterValue("@P_CAMP_CUSTOM_INFO_OUT", NString.class);
			pCampGradRate6yrOut.val = cmd.getParameterValue("@P_CAMP_GRAD_RATE_6YR_OUT", NNumber.class);
			pCampGradRateTextOut.val = cmd.getParameterValue("@P_CAMP_GRAD_RATE_TEXT_OUT", NString.class);
			pCampGradRateInvIndOut.val = cmd.getParameterValue("@P_CAMP_GRAD_RATE_INV_IND_OUT", NString.class);
			pCampGradLowRateOut.val = cmd.getParameterValue("@P_CAMP_GRAD_LOW_RATE_OUT", NNumber.class);
			pCampGradMedRateOut.val = cmd.getParameterValue("@P_CAMP_GRAD_MED_RATE_OUT", NNumber.class);
			pCampDefaultRateOut.val = cmd.getParameterValue("@P_CAMP_DEFAULT_RATE_OUT", NNumber.class);
			pCampDefaultRateCompOut.val = cmd.getParameterValue("@P_CAMP_DEFAULT_RATE_COMP_OUT", NNumber.class);
			pCampDefaultRateTextOut.val = cmd.getParameterValue("@P_CAMP_DEFAULT_RATE_TEXT_OUT", NString.class);
			pCampFedMedianLoanAmtOut.val = cmd.getParameterValue("@P_CAMP_FED_MEDIAN_LOAN_AMT_OUT", NNumber.class);
			pCampFedLoanAmtYrOut.val = cmd.getParameterValue("@P_CAMP_FED_LOAN_AMT_YR_OUT", NNumber.class);
			pCampFedLoanAmtPmtOut.val = cmd.getParameterValue("@P_CAMP_FED_LOAN_AMT_PMT_OUT", NNumber.class);
			pCampMedianBorrowTextOut.val = cmd.getParameterValue("@P_CAMP_MEDIAN_BORROW_TEXT_OUT", NString.class);
			pFormattedStudentNameOut.val = cmd.getParameterValue("@P_FORMATTED_STUDENT_NAME_OUT", NString.class);
			pStudentIdOut.val = cmd.getParameterValue("@P_STUDENT_ID_OUT", NString.class);
			pEstimatedCoaAmtOut.val = cmd.getParameterValue("@P_ESTIMATED_COA_AMT_OUT", NNumber.class);
			pTuitionFeesAmtOut.val = cmd.getParameterValue("@P_TUITION_FEES_AMT_OUT", NNumber.class);
			pHousingMealsAmtOut.val = cmd.getParameterValue("@P_HOUSING_MEALS_AMT_OUT", NNumber.class);
			pBooksSuppliesAmtOut.val = cmd.getParameterValue("@P_BOOKS_SUPPLIES_AMT_OUT", NNumber.class);
			pTransportationAmtOut.val = cmd.getParameterValue("@P_TRANSPORTATION_AMT_OUT", NNumber.class);
			pOtherCostsAmtOut.val = cmd.getParameterValue("@P_OTHER_COSTS_AMT_OUT", NNumber.class);
			pTotalGrantsScholsAmtOut.val = cmd.getParameterValue("@P_TOTAL_GRANTS_SCHOLS_AMT_OUT", NNumber.class);
			pNetCostsAmtOut.val = cmd.getParameterValue("@P_NET_COSTS_AMT_OUT", NNumber.class);
			pGrantsFromSchoolAmtOut.val = cmd.getParameterValue("@P_GRANTS_FROM_SCHOOL_AMT_OUT", NNumber.class);
			pPellGrantAmtOut.val = cmd.getParameterValue("@P_PELL_GRANT_AMT_OUT", NNumber.class);
			pGrantsFromStateAmtOut.val = cmd.getParameterValue("@P_GRANTS_FROM_STATE_AMT_OUT", NNumber.class);
			pOtherScholsAmtOut.val = cmd.getParameterValue("@P_OTHER_SCHOLS_AMT_OUT", NNumber.class);
			pWorkStudyAmtOut.val = cmd.getParameterValue("@P_WORK_STUDY_AMT_OUT", NNumber.class);
			pPerkinsAmtOut.val = cmd.getParameterValue("@P_PERKINS_AMT_OUT", NNumber.class);
			pDirectSubAmtOut.val = cmd.getParameterValue("@P_DIRECT_SUB_AMT_OUT", NNumber.class);
			pDirectUnsubAmtOut.val = cmd.getParameterValue("@P_DIRECT_UNSUB_AMT_OUT", NNumber.class);
			pEfcAmtOut.val = cmd.getParameterValue("@P_EFC_AMT_OUT", NNumber.class);


		}
		
		public static void pPostLetrCode(NString pAidyCode,NNumber pPidm,NString pLetrCode,NString pLetrUpdateInd,NString pUserId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RPK_SHOPPING_SHEET.P_POST_LETR_CODE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_LETR_CODE", pLetrCode);
			cmd.addParameter("@P_LETR_UPDATE_IND", pLetrUpdateInd);
			cmd.addParameter("@P_USER_ID", pUserId);
				
			cmd.execute();


		}
		
	
	
	
}
