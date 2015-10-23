package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class FbChartOfAccountsRules {
		public static void pPopulateGlobals(NString pRowid,NString newOrOld) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_CHART_OF_ACCOUNTS_RULES.P_POPULATE_GLOBALS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ROWID", pRowid);
			cmd.addParameter("@NEW_OR_OLD", newOrOld);
				
			cmd.execute();


		}
		
		public static void pPublishSync(NString pOperationType,NString pCoasCode,NString pTitle,NDate pEffDate,NString pStatusInd,Ref<NString> pMessageExists) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_CHART_OF_ACCOUNTS_RULES.P_PUBLISH_SYNC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_COAS_CODE", pCoasCode);
			cmd.addParameter("@P_TITLE", pTitle);
			cmd.addParameter("@P_EFF_DATE", pEffDate);
			cmd.addParameter("@P_STATUS_IND", pStatusInd);
			cmd.addParameter("@P_MESSAGE_EXISTS", NString.class);
				
			cmd.execute();
			pMessageExists.val = cmd.getParameterValue("@P_MESSAGE_EXISTS", NString.class);


		}
		
		public static void pPublishSync(NString pOperationType,Ref<NString> pMessageExists) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_CHART_OF_ACCOUNTS_RULES.P_PUBLISH_SYNC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_MESSAGE_EXISTS", NString.class);
				
			cmd.execute();
			pMessageExists.val = cmd.getParameterValue("@P_MESSAGE_EXISTS", NString.class);


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NString pCoasCode,NString pTitle,NDate pEffDate,NString pStatusInd,NDate pActivityDate,NString pUserId,NDate pNchgDate,NString pCalStartMonth,NString pCalStartDay,NString pCalEndMonth,NString pCalEndDay,NString pMethOfAcctg,NString pBavlKeyFund,NString pBavlKeyOrgn,NString pBavlKeyAcct,NString pBavlKeyProg,NString pBavlPeriod,NString pBavlSeverity,NString pRuclCodeRollEnc,NString pCommitType,NString pBudgetRoll,NString pBudgetDisposition,NNumber pBudgetRollPercent,NString pRuclCodeBudgCf,NString pBudgCfType,NString pBudgClassification,NNumber pBudgCfPercent,NString pRuclCodeCloseOp,NString pRollEncInd,NString pRollPoInd,NString pRollMemoResInd,NString pRollReqInd,NString pRollLaborEncInd,NString pRollWoInd,NDate pTermDate,NString pAcctCodeFundDueTo,NString pAcctCodeFundDueFrm,NString pAcctCodeFundBal,NString pAcctCodeAccrualAp,NString pAcctCodeAccrualAr,NNumber pCurrentYearIncome,NString pAcctCodeTrfIncome,NString pOrgnCodeTrfIncome,NString pProgCodeTrfIncome,NNumber pPyRetainedIncome,NString pAcctCodeTrfRiPy,NString pOrgnCodeTrfRiPy,NString pProgCodeTrfRiPy,NNumber pRealGl,NString pAcctCodeTrfRgl,NString pOrgnCodeTrfRgl,NString pProgCodeTrfRgl,NNumber pRealGlPy,NString pAcctCodeTrfRglPy,NString pOrgnCodeTrfRglPy,NString pProgCodeTrfRglPy,NString pFundAttributeInd,NString pOrgnAttributeInd,NString pAcctAttributeInd,NString pProgAttributeInd,NString pActvAttributeInd,NString pLocnAttributeInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_CHART_OF_ACCOUNTS_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_COAS_CODE", pCoasCode);
			cmd.addParameter("@P_TITLE", pTitle);
			cmd.addParameter("@P_EFF_DATE", pEffDate);
			cmd.addParameter("@P_STATUS_IND", pStatusInd);
			cmd.addParameter("@P_ACTIVITY_DATE", pActivityDate);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_NCHG_DATE", pNchgDate);
			cmd.addParameter("@P_CAL_START_MONTH", pCalStartMonth);
			cmd.addParameter("@P_CAL_START_DAY", pCalStartDay);
			cmd.addParameter("@P_CAL_END_MONTH", pCalEndMonth);
			cmd.addParameter("@P_CAL_END_DAY", pCalEndDay);
			cmd.addParameter("@P_METH_OF_ACCTG", pMethOfAcctg);
			cmd.addParameter("@P_BAVL_KEY_FUND", pBavlKeyFund);
			cmd.addParameter("@P_BAVL_KEY_ORGN", pBavlKeyOrgn);
			cmd.addParameter("@P_BAVL_KEY_ACCT", pBavlKeyAcct);
			cmd.addParameter("@P_BAVL_KEY_PROG", pBavlKeyProg);
			cmd.addParameter("@P_BAVL_PERIOD", pBavlPeriod);
			cmd.addParameter("@P_BAVL_SEVERITY", pBavlSeverity);
			cmd.addParameter("@P_RUCL_CODE_ROLL_ENC", pRuclCodeRollEnc);
			cmd.addParameter("@P_COMMIT_TYPE", pCommitType);
			cmd.addParameter("@P_BUDGET_ROLL", pBudgetRoll);
			cmd.addParameter("@P_BUDGET_DISPOSITION", pBudgetDisposition);
			cmd.addParameter("@P_BUDGET_ROLL_PERCENT", pBudgetRollPercent);
			cmd.addParameter("@P_RUCL_CODE_BUDG_CF", pRuclCodeBudgCf);
			cmd.addParameter("@P_BUDG_CF_TYPE", pBudgCfType);
			cmd.addParameter("@P_BUDG_CLASSIFICATION", pBudgClassification);
			cmd.addParameter("@P_BUDG_CF_PERCENT", pBudgCfPercent);
			cmd.addParameter("@P_RUCL_CODE_CLOSE_OP", pRuclCodeCloseOp);
			cmd.addParameter("@P_ROLL_ENC_IND", pRollEncInd);
			cmd.addParameter("@P_ROLL_PO_IND", pRollPoInd);
			cmd.addParameter("@P_ROLL_MEMO_RES_IND", pRollMemoResInd);
			cmd.addParameter("@P_ROLL_REQ_IND", pRollReqInd);
			cmd.addParameter("@P_ROLL_LABOR_ENC_IND", pRollLaborEncInd);
			cmd.addParameter("@P_ROLL_WO_IND", pRollWoInd);
			cmd.addParameter("@P_TERM_DATE", pTermDate);
			cmd.addParameter("@P_ACCT_CODE_FUND_DUE_TO", pAcctCodeFundDueTo);
			cmd.addParameter("@P_ACCT_CODE_FUND_DUE_FRM", pAcctCodeFundDueFrm);
			cmd.addParameter("@P_ACCT_CODE_FUND_BAL", pAcctCodeFundBal);
			cmd.addParameter("@P_ACCT_CODE_ACCRUAL_AP", pAcctCodeAccrualAp);
			cmd.addParameter("@P_ACCT_CODE_ACCRUAL_AR", pAcctCodeAccrualAr);
			cmd.addParameter("@P_CURRENT_YEAR_INCOME", pCurrentYearIncome);
			cmd.addParameter("@P_ACCT_CODE_TRF_INCOME", pAcctCodeTrfIncome);
			cmd.addParameter("@P_ORGN_CODE_TRF_INCOME", pOrgnCodeTrfIncome);
			cmd.addParameter("@P_PROG_CODE_TRF_INCOME", pProgCodeTrfIncome);
			cmd.addParameter("@P_PY_RETAINED_INCOME", pPyRetainedIncome);
			cmd.addParameter("@P_ACCT_CODE_TRF_RI_PY", pAcctCodeTrfRiPy);
			cmd.addParameter("@P_ORGN_CODE_TRF_RI_PY", pOrgnCodeTrfRiPy);
			cmd.addParameter("@P_PROG_CODE_TRF_RI_PY", pProgCodeTrfRiPy);
			cmd.addParameter("@P_REAL_GL", pRealGl);
			cmd.addParameter("@P_ACCT_CODE_TRF_RGL", pAcctCodeTrfRgl);
			cmd.addParameter("@P_ORGN_CODE_TRF_RGL", pOrgnCodeTrfRgl);
			cmd.addParameter("@P_PROG_CODE_TRF_RGL", pProgCodeTrfRgl);
			cmd.addParameter("@P_REAL_GL_PY", pRealGlPy);
			cmd.addParameter("@P_ACCT_CODE_TRF_RGL_PY", pAcctCodeTrfRglPy);
			cmd.addParameter("@P_ORGN_CODE_TRF_RGL_PY", pOrgnCodeTrfRglPy);
			cmd.addParameter("@P_PROG_CODE_TRF_RGL_PY", pProgCodeTrfRglPy);
			cmd.addParameter("@P_FUND_ATTRIBUTE_IND", pFundAttributeInd);
			cmd.addParameter("@P_ORGN_ATTRIBUTE_IND", pOrgnAttributeInd);
			cmd.addParameter("@P_ACCT_ATTRIBUTE_IND", pAcctAttributeInd);
			cmd.addParameter("@P_PROG_ATTRIBUTE_IND", pProgAttributeInd);
			cmd.addParameter("@P_ACTV_ATTRIBUTE_IND", pActvAttributeInd);
			cmd.addParameter("@P_LOCN_ATTRIBUTE_IND", pLocnAttributeInd);
				
			cmd.execute();


		}
		
		public static void pSetGlobalsNull() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_CHART_OF_ACCOUNTS_RULES.P_SET_GLOBALS_NULL", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pValidate() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_CHART_OF_ACCOUNTS_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
	
	
	
}
