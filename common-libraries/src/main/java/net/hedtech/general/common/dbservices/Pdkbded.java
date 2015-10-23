package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Pdkbded {
		public static NString fActiveFlexExistsInd(NNumber pPidm,NString pBdcaCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PDKBDED.F_ACTIVE_FLEX_EXISTS_IND", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_BDCA_CODE", pBdcaCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fBdcaCodeExistsInd(NString pBdcaCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PDKBDED.F_BDCA_CODE_EXISTS_IND", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_BDCA_CODE", pBdcaCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fBdcaValidForBcatInd(NNumber pPidm,NString pBdcaCode,NDate pEffectiveDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PDKBDED.F_BDCA_VALID_FOR_BCAT_IND", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_BDCA_CODE", pBdcaCode);
			cmd.addParameter("@P_EFFECTIVE_DATE", pEffectiveDate);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fBdclCodeDefaultValue(NString pBdcaCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PDKBDED.F_BDCL_CODE_DEFAULT_VALUE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_BDCA_CODE", pBdcaCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fBdclCodeExistsInd(NString pBdclCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PDKBDED.F_BDCL_CODE_EXISTS_IND", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_BDCL_CODE", pBdclCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fBreaCodeExistsInd(NString pBreaCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PDKBDED.F_BREA_CODE_EXISTS_IND", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_BREA_CODE", pBreaCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NInteger fClaimPendingCount(NNumber pPidm,NString pBdcaCode,NDate pEffectiveDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PDKBDED.F_CLAIM_PENDING_COUNT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_BDCA_CODE", pBdcaCode);
			cmd.addParameter("@P_EFFECTIVE_DATE", pEffectiveDate);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fClaimPendingInd(NNumber pPidm,NString pBdcaCode,NDate pEffectiveDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PDKBDED.F_CLAIM_PENDING_IND", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_BDCA_CODE", pBdcaCode);
			cmd.addParameter("@P_EFFECTIVE_DATE", pEffectiveDate);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fDeductionHistoryExistsInd(NNumber pPidm,NString pBdcaCode,NDate pEffectiveDate,NDate pLastPaidDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PDKBDED.F_DEDUCTION_HISTORY_EXISTS_IND", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_BDCA_CODE", pBdcaCode);
			cmd.addParameter("@P_EFFECTIVE_DATE", pEffectiveDate);
			cmd.addParameter("@P_LAST_PAID_DATE", pLastPaidDate);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fEmployeePaidWithDednInd(NDate pLastPaidDate,NDate pEffectiveDate,NString pStatus) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PDKBDED.F_EMPLOYEE_PAID_WITH_DEDN_IND", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_LAST_PAID_DATE", pLastPaidDate);
			cmd.addParameter("@P_EFFECTIVE_DATE", pEffectiveDate);
			cmd.addParameter("@P_STATUS", pStatus);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fFlexSpendingAccountInd(NString pBdcaCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PDKBDED.F_FLEX_SPENDING_ACCOUNT_IND", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_BDCA_CODE", pBdcaCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
//		public static List<ListTabtypeRow> fList(NString pListName) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PDKBDED.F_LIST", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<ListTabtypeRow>.class);
//			cmd.addParameter("@P_LIST_NAME", pListName);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<ListTabtypeRow>.class);
//
//		}
		
		public static NString fPreclusionExistsInd(NNumber pPidm,NString pBdcaCode,NDate pEffDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PDKBDED.F_PRECLUSION_EXISTS_IND", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_BDCA_CODE", pBdcaCode);
			cmd.addParameter("@P_EFF_DATE", pEffDate);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fValidDecimalDigitsInd(NInteger pNumber,NNumber pAmount,NString pCalcRule) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PDKBDED.F_VALID_DECIMAL_DIGITS_IND", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_NUMBER", pNumber);
			cmd.addParameter("@P_AMOUNT", pAmount);
			cmd.addParameter("@P_CALC_RULE", pCalcRule);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fValidFilingStatusInd(NString pBdcaCode,NString pOptCode1) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PDKBDED.F_VALID_FILING_STATUS_IND", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_BDCA_CODE", pBdcaCode);
			cmd.addParameter("@P_OPT_CODE1", pOptCode1);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fValidPlanInd(NString pBdcaCode,NString pOptCode1,NDate pEffectiveDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PDKBDED.F_VALID_PLAN_IND", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_BDCA_CODE", pBdcaCode);
			cmd.addParameter("@P_OPT_CODE1", pOptCode1);
			cmd.addParameter("@P_EFFECTIVE_DATE", pEffectiveDate);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fW4DeductionInd(NString pBdtyCode,NString pTxcdCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PDKBDED.F_W4_DEDUCTION_IND", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_BDTY_CODE", pBdtyCode);
			cmd.addParameter("@P_TXCD_CODE", pTxcdCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
	
	
	
}
