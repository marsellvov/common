package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class RokmiscRules {
		public static NString fAdjustedHrsInd() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKMISC_RULES.F_ADJUSTED_HRS_IND", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fBillingHrsInd() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKMISC_RULES.F_BILLING_HRS_IND", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber fCalcDisbHrs(NString pPeriod,NNumber pPidm,NString pAidyCode,NString pFedFundId,NString pAtypInd,NString pEnrrCode,NString pHrsOptionInd,NDate pAttendDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKMISC_RULES.F_CALC_DISB_HRS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_PERIOD", pPeriod);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_FED_FUND_ID", pFedFundId);
			cmd.addParameter("@P_ATYP_IND", pAtypInd);
			cmd.addParameter("@P_ENRR_CODE", pEnrrCode);
			cmd.addParameter("@P_HRS_OPTION_IND", pHrsOptionInd);
			cmd.addParameter("@P_ATTEND_DATE", pAttendDate);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fCalcHrs(NNumber pPidm,NString pTermCode,NString pHrsOptionInd,NString pRepCourseCheck,NString pCountWdAsRepeat,NString pCourseInPgrmCheck,NString pRemedialCourseCheck,NString pAttendVerifyCheck,NDate pAttendDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKMISC_RULES.F_CALC_HRS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_HRS_OPTION_IND", pHrsOptionInd);
			cmd.addParameter("@P_REP_COURSE_CHECK", pRepCourseCheck);
			cmd.addParameter("@P_COUNT_WD_AS_REPEAT", pCountWdAsRepeat);
			cmd.addParameter("@P_COURSE_IN_PGRM_CHECK", pCourseInPgrmCheck);
			cmd.addParameter("@P_REMEDIAL_COURSE_CHECK", pRemedialCourseCheck);
			cmd.addParameter("@P_ATTEND_VERIFY_CHECK", pAttendVerifyCheck);
			cmd.addParameter("@P_ATTEND_DATE", pAttendDate);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fCalcHrsUsingEnrr(NString pAidyCode,NString pTermCode,NNumber pPidm,NString pEnrrCode,NString pHrsOptionInd,NDate pAttendDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKMISC_RULES.F_CALC_HRS_USING_ENRR", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_ENRR_CODE", pEnrrCode);
			cmd.addParameter("@P_HRS_OPTION_IND", pHrsOptionInd);
			cmd.addParameter("@P_ATTEND_DATE", pAttendDate);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fCalcLoanHrs(NString pAidyCode,NString pPeriod,NNumber pPidm,NString pFundCode,NString pHrsOptionInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKMISC_RULES.F_CALC_LOAN_HRS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PERIOD", pPeriod);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_HRS_OPTION_IND", pHrsOptionInd);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fCalcPeriodHrs(NNumber pPidm,NString pPeriod,NString pHrsOptionInd,NString pRepCourseCheck,NString pCountWdAsRepeat,NString pCourseInPgrmCheck,NString pRemedialCourseCheck,NString pAttendVerifyCheck,NDate pAttendDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKMISC_RULES.F_CALC_PERIOD_HRS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_PERIOD", pPeriod);
			cmd.addParameter("@P_HRS_OPTION_IND", pHrsOptionInd);
			cmd.addParameter("@P_REP_COURSE_CHECK", pRepCourseCheck);
			cmd.addParameter("@P_COUNT_WD_AS_REPEAT", pCountWdAsRepeat);
			cmd.addParameter("@P_COURSE_IN_PGRM_CHECK", pCourseInPgrmCheck);
			cmd.addParameter("@P_REMEDIAL_COURSE_CHECK", pRemedialCourseCheck);
			cmd.addParameter("@P_ATTEND_VERIFY_CHECK", pAttendVerifyCheck);
			cmd.addParameter("@P_ATTEND_DATE", pAttendDate);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fCalcPeriodHrsUsingEnrr(NString pAidyCode,NString pPeriod,NNumber pPidm,NString pEnrrCode,NString pHrsOptionInd,NDate pAttendDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKMISC_RULES.F_CALC_PERIOD_HRS_USING_ENRR", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PERIOD", pPeriod);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_ENRR_CODE", pEnrrCode);
			cmd.addParameter("@P_HRS_OPTION_IND", pHrsOptionInd);
			cmd.addParameter("@P_ATTEND_DATE", pAttendDate);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fCalcRuleHrsNoRotsreg(NString pAidyCode,NNumber pPidm,NString pTermCode,NString pEnrrCode,NString pHrsOptionInd,NDate pAttendDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKMISC_RULES.F_CALC_RULE_HRS_NO_ROTSREG", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_ENRR_CODE", pEnrrCode);
			cmd.addParameter("@P_HRS_OPTION_IND", pHrsOptionInd);
			cmd.addParameter("@P_ATTEND_DATE", pAttendDate);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString fCreditHrsInd() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKMISC_RULES.F_CREDIT_HRS_IND", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pDispPeriodAttendFaHrs(NString pPeriod,NNumber pPidm,NDate pAttendDate,NString pEnrrCode,Ref<NNumber> pCreditHrOut,Ref<NNumber> pBillHrOut,Ref<NNumber> pAdjHrOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKMISC_RULES.P_DISP_PERIOD_ATTEND_FA_HRS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PERIOD", pPeriod);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_ATTEND_DATE", pAttendDate);
			cmd.addParameter("@P_ENRR_CODE", pEnrrCode);
			cmd.addParameter("@P_CREDIT_HR_OUT", NNumber.class);
			cmd.addParameter("@P_BILL_HR_OUT", NNumber.class);
			cmd.addParameter("@P_ADJ_HR_OUT", NNumber.class);
				
			cmd.execute();
			pCreditHrOut.val = cmd.getParameterValue("@P_CREDIT_HR_OUT", NNumber.class);
			pBillHrOut.val = cmd.getParameterValue("@P_BILL_HR_OUT", NNumber.class);
			pAdjHrOut.val = cmd.getParameterValue("@P_ADJ_HR_OUT", NNumber.class);


		}
		
		public static void pPopulateAll(NString pAidyCode,NNumber pPidm,NString pPeriod) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKMISC_RULES.P_POPULATE_ALL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_PERIOD", pPeriod);
				
			cmd.execute();


		}
		
		public static void pPopulateDisbursement(NString pAidyCode,NNumber pPidm,NString pPeriod,NNumber pOneUpNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKMISC_RULES.P_POPULATE_DISBURSEMENT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_PERIOD", pPeriod);
			cmd.addParameter("@P_ONE_UP_NO", pOneUpNo);
				
			cmd.execute();


		}
		
		public static void pPopulateGrants(NString pAidyCode,NNumber pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKMISC_RULES.P_POPULATE_GRANTS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();


		}
		
		public static void pPopulatePell(NString pAidyCode,NNumber pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKMISC_RULES.P_POPULATE_PELL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();


		}
		
		public static void pPopulateRoaenrl(NNumber pPidm,NString pAidyCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKMISC_RULES.P_POPULATE_ROAENRL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
				
			cmd.execute();


		}
		
		public static void pPopulateTerm(NString pAidyCode,NNumber pPidm,NString pTermCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKMISC_RULES.P_POPULATE_TERM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
				
			cmd.execute();


		}
		
	
	
	
}
