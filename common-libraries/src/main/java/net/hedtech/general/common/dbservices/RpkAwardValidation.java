package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class RpkAwardValidation {
		public static void pValidateAward(NString pAidyCode,NNumber pPidm,NString pFundCode,NNumber pAwardAmt,NNumber pOrigAwardAmt,NString pUnmetNeedOvrdeInd,NString pReplaceTfcOvrdeInd,NString pTreqOvrdeInd,NString pFedLimitOvrdeInd,NString pFundLimitOvrdeInd,NString pOverrideYrInColl,NString pOverrideNoPell,NString pOverrideFundRule,NString pSimulateSw) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RPK_AWARD_VALIDATION.P_VALIDATE_AWARD", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_AWARD_AMT", pAwardAmt);
			cmd.addParameter("@P_ORIG_AWARD_AMT", pOrigAwardAmt);
			cmd.addParameter("@P_UNMET_NEED_OVRDE_IND", pUnmetNeedOvrdeInd);
			cmd.addParameter("@P_REPLACE_TFC_OVRDE_IND", pReplaceTfcOvrdeInd);
			cmd.addParameter("@P_TREQ_OVRDE_IND", pTreqOvrdeInd);
			cmd.addParameter("@P_FED_LIMIT_OVRDE_IND", pFedLimitOvrdeInd);
			cmd.addParameter("@P_FUND_LIMIT_OVRDE_IND", pFundLimitOvrdeInd);
			cmd.addParameter("@P_OVERRIDE_YR_IN_COLL", pOverrideYrInColl);
			cmd.addParameter("@P_OVERRIDE_NO_PELL", pOverrideNoPell);
			cmd.addParameter("@P_OVERRIDE_FUND_RULE", pOverrideFundRule);
			cmd.addParameter("@P_SIMULATE_SW", pSimulateSw);
				
			cmd.execute();


		}
		
		public static void pValidatePackageAward(NString pAidyCode,NNumber pPidm,NString pFundCode,NNumber pAwardAmt,NNumber pOrigAwardAmt,NString pUnmetNeedOvrdeInd,NString pReplaceTfcOvrdeInd,NString pTreqOvrdeInd,NString pFedLimitOvrdeInd,NString pFundLimitOvrdeInd,NString pOverrideYrInColl,NString pOverrideNoPell,NString pOverrideFundRule,NString pPgrpCode,NNumber pPriority,NString pPgrpMinAwardInd,NNumber pBudgetAmt,NNumber pResourceAmt,NNumber pReduceNeedAmt,NNumber pReplaceEfcAmt,NNumber pEfcAmt,NNumber pUnmetNeed,NString pLoadInd,NString pSimulateSw,Ref<NString> pUnmetNeedErrIndOut,Ref<NString> pLoanMaxErrIndOut,Ref<NString> pCumLimitErrIndOut,Ref<NString> pMaxLimitErrIndOut,Ref<NString> pInsufficientSwOut,Ref<NNumber> pMaxAnnualLimitOut,Ref<NNumber> pHoldRemainAmtOut,Ref<NNumber> pReduceAwardAmtOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RPK_AWARD_VALIDATION.P_VALIDATE_PACKAGE_AWARD", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_AWARD_AMT", pAwardAmt);
			cmd.addParameter("@P_ORIG_AWARD_AMT", pOrigAwardAmt);
			cmd.addParameter("@P_UNMET_NEED_OVRDE_IND", pUnmetNeedOvrdeInd);
			cmd.addParameter("@P_REPLACE_TFC_OVRDE_IND", pReplaceTfcOvrdeInd);
			cmd.addParameter("@P_TREQ_OVRDE_IND", pTreqOvrdeInd);
			cmd.addParameter("@P_FED_LIMIT_OVRDE_IND", pFedLimitOvrdeInd);
			cmd.addParameter("@P_FUND_LIMIT_OVRDE_IND", pFundLimitOvrdeInd);
			cmd.addParameter("@P_OVERRIDE_YR_IN_COLL", pOverrideYrInColl);
			cmd.addParameter("@P_OVERRIDE_NO_PELL", pOverrideNoPell);
			cmd.addParameter("@P_OVERRIDE_FUND_RULE", pOverrideFundRule);
			cmd.addParameter("@P_PGRP_CODE", pPgrpCode);
			cmd.addParameter("@P_PRIORITY", pPriority);
			cmd.addParameter("@P_PGRP_MIN_AWARD_IND", pPgrpMinAwardInd);
			cmd.addParameter("@P_BUDGET_AMT", pBudgetAmt);
			cmd.addParameter("@P_RESOURCE_AMT", pResourceAmt);
			cmd.addParameter("@P_REDUCE_NEED_AMT", pReduceNeedAmt);
			cmd.addParameter("@P_REPLACE_EFC_AMT", pReplaceEfcAmt);
			cmd.addParameter("@P_EFC_AMT", pEfcAmt);
			cmd.addParameter("@P_UNMET_NEED", pUnmetNeed);
			cmd.addParameter("@P_LOAD_IND", pLoadInd);
			cmd.addParameter("@P_SIMULATE_SW", pSimulateSw);
			cmd.addParameter("@P_UNMET_NEED_ERR_IND_OUT", NString.class);
			cmd.addParameter("@P_LOAN_MAX_ERR_IND_OUT", NString.class);
			cmd.addParameter("@P_CUM_LIMIT_ERR_IND_OUT", NString.class);
			cmd.addParameter("@P_MAX_LIMIT_ERR_IND_OUT", NString.class);
			cmd.addParameter("@P_INSUFFICIENT_SW_OUT", NString.class);
			cmd.addParameter("@P_MAX_ANNUAL_LIMIT_OUT", NNumber.class);
			cmd.addParameter("@P_HOLD_REMAIN_AMT_OUT", NNumber.class);
			cmd.addParameter("@P_REDUCE_AWARD_AMT_OUT", NNumber.class);
				
			cmd.execute();
			pUnmetNeedErrIndOut.val = cmd.getParameterValue("@P_UNMET_NEED_ERR_IND_OUT", NString.class);
			pLoanMaxErrIndOut.val = cmd.getParameterValue("@P_LOAN_MAX_ERR_IND_OUT", NString.class);
			pCumLimitErrIndOut.val = cmd.getParameterValue("@P_CUM_LIMIT_ERR_IND_OUT", NString.class);
			pMaxLimitErrIndOut.val = cmd.getParameterValue("@P_MAX_LIMIT_ERR_IND_OUT", NString.class);
			pInsufficientSwOut.val = cmd.getParameterValue("@P_INSUFFICIENT_SW_OUT", NString.class);
			pMaxAnnualLimitOut.val = cmd.getParameterValue("@P_MAX_ANNUAL_LIMIT_OUT", NNumber.class);
			pHoldRemainAmtOut.val = cmd.getParameterValue("@P_HOLD_REMAIN_AMT_OUT", NNumber.class);
			pReduceAwardAmtOut.val = cmd.getParameterValue("@P_REDUCE_AWARD_AMT_OUT", NNumber.class);


		}
		
	
	
	
}
