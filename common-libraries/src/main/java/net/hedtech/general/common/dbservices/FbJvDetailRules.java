package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class FbJvDetailRules {
		
//	public static void pProcessEditRulp(NString pRuclCode,NDate pTransDate,NString pDocNum,NNumber pSubmissionNumber,NNumber pSeqNum,NString pUserId,NString pAutoJrnlId,NString pReversalInd,Ref<NString> pFsyrCodeInOut,Ref<NNumber> pTransAmtInOut,Ref<NString> pTransDescInOut,Ref<NString> pDrCrIndInOut,Ref<NString> pAcciCodeInOut,Ref<NString> pCoasCodeInOut,Ref<NString> pFundCodeInOut,Ref<NString> pOrgnCodeInOut,Ref<NString> pAcctCodeInOut,Ref<NString> pProgCodeInOut,Ref<NString> pActvCodeInOut,Ref<NString> pLocnCodeInOut,Ref<NString> pBankCodeInOut,Ref<NString> pDocRefNumInOut,Ref<NNumber> pVendorPidmInOut,Ref<NString> pEncbNumInOut,Ref<NNumber> pEncdItemNumInOut,Ref<NNumber> pEncdSeqNumInOut,Ref<NString> pEncbTypeInOut,Ref<NString> pBudDispnInOut,Ref<NString> pBudIdInOut,Ref<NString> pCmtTypeInOut,Ref<NNumber> pCmtPctInOut,Ref<NString> pDepNumInOut,Ref<NString> pEncbActionIndInOut,Ref<NString> pPrjdCodeInOut,Ref<NNumber> pDistPctInOut,Ref<NString> pPostingPeriodInOut,Ref<NString> pBudgetPeriodInOut,Ref<NString> pAccrualIndInOut,Ref<NString> pCurrCodeInOut,Ref<List<FbCommon.ErrTabtypeRow>> pErrTabInOut) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_JV_DETAIL_RULES.P_PROCESS_EDIT_RULP", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_RUCL_CODE", pRuclCode);
//			cmd.addParameter("@P_TRANS_DATE", pTransDate);
//			cmd.addParameter("@P_DOC_NUM", pDocNum);
//			cmd.addParameter("@P_SUBMISSION_NUMBER", pSubmissionNumber);
//			cmd.addParameter("@P_SEQ_NUM", pSeqNum);
//			cmd.addParameter("@P_USER_ID", pUserId);
//			cmd.addParameter("@P_AUTO_JRNL_ID", pAutoJrnlId);
//			cmd.addParameter("@P_REVERSAL_IND", pReversalInd);
//			cmd.addParameter("@P_FSYR_CODE_IN_OUT", pFsyrCodeInOut, true);
//			cmd.addParameter("@P_TRANS_AMT_IN_OUT", pTransAmtInOut, true);
//			cmd.addParameter("@P_TRANS_DESC_IN_OUT", pTransDescInOut, true);
//			cmd.addParameter("@P_DR_CR_IND_IN_OUT", pDrCrIndInOut, true);
//			cmd.addParameter("@P_ACCI_CODE_IN_OUT", pAcciCodeInOut, true);
//			cmd.addParameter("@P_COAS_CODE_IN_OUT", pCoasCodeInOut, true);
//			cmd.addParameter("@P_FUND_CODE_IN_OUT", pFundCodeInOut, true);
//			cmd.addParameter("@P_ORGN_CODE_IN_OUT", pOrgnCodeInOut, true);
//			cmd.addParameter("@P_ACCT_CODE_IN_OUT", pAcctCodeInOut, true);
//			cmd.addParameter("@P_PROG_CODE_IN_OUT", pProgCodeInOut, true);
//			cmd.addParameter("@P_ACTV_CODE_IN_OUT", pActvCodeInOut, true);
//			cmd.addParameter("@P_LOCN_CODE_IN_OUT", pLocnCodeInOut, true);
//			cmd.addParameter("@P_BANK_CODE_IN_OUT", pBankCodeInOut, true);
//			cmd.addParameter("@P_DOC_REF_NUM_IN_OUT", pDocRefNumInOut, true);
//			cmd.addParameter("@P_VENDOR_PIDM_IN_OUT", pVendorPidmInOut, true);
//			cmd.addParameter("@P_ENCB_NUM_IN_OUT", pEncbNumInOut, true);
//			cmd.addParameter("@P_ENCD_ITEM_NUM_IN_OUT", pEncdItemNumInOut, true);
//			cmd.addParameter("@P_ENCD_SEQ_NUM_IN_OUT", pEncdSeqNumInOut, true);
//			cmd.addParameter("@P_ENCB_TYPE_IN_OUT", pEncbTypeInOut, true);
//			cmd.addParameter("@P_BUD_DISPN_IN_OUT", pBudDispnInOut, true);
//			cmd.addParameter("@P_BUD_ID_IN_OUT", pBudIdInOut, true);
//			cmd.addParameter("@P_CMT_TYPE_IN_OUT", pCmtTypeInOut, true);
//			cmd.addParameter("@P_CMT_PCT_IN_OUT", pCmtPctInOut, true);
//			cmd.addParameter("@P_DEP_NUM_IN_OUT", pDepNumInOut, true);
//			cmd.addParameter("@P_ENCB_ACTION_IND_IN_OUT", pEncbActionIndInOut, true);
//			cmd.addParameter("@P_PRJD_CODE_IN_OUT", pPrjdCodeInOut, true);
//			cmd.addParameter("@P_DIST_PCT_IN_OUT", pDistPctInOut, true);
//			cmd.addParameter("@P_POSTING_PERIOD_IN_OUT", pPostingPeriodInOut, true);
//			cmd.addParameter("@P_BUDGET_PERIOD_IN_OUT", pBudgetPeriodInOut, true);
//			cmd.addParameter("@P_ACCRUAL_IND_IN_OUT", pAccrualIndInOut, true);
//			cmd.addParameter("@P_CURR_CODE_IN_OUT", pCurrCodeInOut, true);
//			// cmd.addParameter(DbTypes.getTableType("P_ERR_TAB_IN_OUT", "", pErrTabInOut.val, object.class , true));
//				
//			cmd.execute();
//			pFsyrCodeInOut.val = cmd.getParameterValue("@P_FSYR_CODE_IN_OUT", NString.class);
//			pTransAmtInOut.val = cmd.getParameterValue("@P_TRANS_AMT_IN_OUT", NNumber.class);
//			pTransDescInOut.val = cmd.getParameterValue("@P_TRANS_DESC_IN_OUT", NString.class);
//			pDrCrIndInOut.val = cmd.getParameterValue("@P_DR_CR_IND_IN_OUT", NString.class);
//			pAcciCodeInOut.val = cmd.getParameterValue("@P_ACCI_CODE_IN_OUT", NString.class);
//			pCoasCodeInOut.val = cmd.getParameterValue("@P_COAS_CODE_IN_OUT", NString.class);
//			pFundCodeInOut.val = cmd.getParameterValue("@P_FUND_CODE_IN_OUT", NString.class);
//			pOrgnCodeInOut.val = cmd.getParameterValue("@P_ORGN_CODE_IN_OUT", NString.class);
//			pAcctCodeInOut.val = cmd.getParameterValue("@P_ACCT_CODE_IN_OUT", NString.class);
//			pProgCodeInOut.val = cmd.getParameterValue("@P_PROG_CODE_IN_OUT", NString.class);
//			pActvCodeInOut.val = cmd.getParameterValue("@P_ACTV_CODE_IN_OUT", NString.class);
//			pLocnCodeInOut.val = cmd.getParameterValue("@P_LOCN_CODE_IN_OUT", NString.class);
//			pBankCodeInOut.val = cmd.getParameterValue("@P_BANK_CODE_IN_OUT", NString.class);
//			pDocRefNumInOut.val = cmd.getParameterValue("@P_DOC_REF_NUM_IN_OUT", NString.class);
//			pVendorPidmInOut.val = cmd.getParameterValue("@P_VENDOR_PIDM_IN_OUT", NNumber.class);
//			pEncbNumInOut.val = cmd.getParameterValue("@P_ENCB_NUM_IN_OUT", NString.class);
//			pEncdItemNumInOut.val = cmd.getParameterValue("@P_ENCD_ITEM_NUM_IN_OUT", NNumber.class);
//			pEncdSeqNumInOut.val = cmd.getParameterValue("@P_ENCD_SEQ_NUM_IN_OUT", NNumber.class);
//			pEncbTypeInOut.val = cmd.getParameterValue("@P_ENCB_TYPE_IN_OUT", NString.class);
//			pBudDispnInOut.val = cmd.getParameterValue("@P_BUD_DISPN_IN_OUT", NString.class);
//			pBudIdInOut.val = cmd.getParameterValue("@P_BUD_ID_IN_OUT", NString.class);
//			pCmtTypeInOut.val = cmd.getParameterValue("@P_CMT_TYPE_IN_OUT", NString.class);
//			pCmtPctInOut.val = cmd.getParameterValue("@P_CMT_PCT_IN_OUT", NNumber.class);
//			pDepNumInOut.val = cmd.getParameterValue("@P_DEP_NUM_IN_OUT", NString.class);
//			pEncbActionIndInOut.val = cmd.getParameterValue("@P_ENCB_ACTION_IND_IN_OUT", NString.class);
//			pPrjdCodeInOut.val = cmd.getParameterValue("@P_PRJD_CODE_IN_OUT", NString.class);
//			pDistPctInOut.val = cmd.getParameterValue("@P_DIST_PCT_IN_OUT", NNumber.class);
//			pPostingPeriodInOut.val = cmd.getParameterValue("@P_POSTING_PERIOD_IN_OUT", NString.class);
//			pBudgetPeriodInOut.val = cmd.getParameterValue("@P_BUDGET_PERIOD_IN_OUT", NString.class);
//			pAccrualIndInOut.val = cmd.getParameterValue("@P_ACCRUAL_IND_IN_OUT", NString.class);
//			pCurrCodeInOut.val = cmd.getParameterValue("@P_CURR_CODE_IN_OUT", NString.class);
//			// pErrTabInOut.val = cmd.getTableParameterValue("@P_ERR_TAB_IN_OUT", object.class);
//
//
//		}
		
//		public static void pValidCreate(FbJvDetail.JvDetailRecRow pDetailRecIn,Ref<FbJvDetail.JvDetailRecRow> pDetailRecOut,Ref<List<FbCommon.ErrTabtypeRow>> pErrTabOut,Ref<NString> pWarningOut,Ref<NString> pAbalSeverityOut) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_JV_DETAIL_RULES.P_VALID_CREATE", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter(DbTypes.createStructType("P_DETAIL_REC_IN", pDetailRecIn, FbJvDetail.JvDetailRecRow.class ));
//			cmd.addParameter(DbTypes.createStructType("P_DETAIL_REC_OUT", FbJvDetail.JvDetailRecRow.class));
//			// cmd.addParameter(DbTypes.getTableType("P_ERR_TAB_OUT", "", object.class));
//			cmd.addParameter("@P_WARNING_OUT", NString.class);
//			cmd.addParameter("@P_ABAL_SEVERITY_OUT", NString.class);
//				
//			cmd.execute();
//			pDetailRecOut.val = cmd.getParameterValue("@P_DETAIL_REC_OUT", FbJvDetail.JvDetailRecRow.class);
//			// pErrTabOut.val = cmd.getTableParameterValue("@P_ERR_TAB_OUT", object.class);
//			pWarningOut.val = cmd.getParameterValue("@P_WARNING_OUT", NString.class);
//			pAbalSeverityOut.val = cmd.getParameterValue("@P_ABAL_SEVERITY_OUT", NString.class);
//
//
//		}
		
//		public static void pValidUpdate(FbJvDetail.JvDetailRecRow pDetailRecIn,Ref<FbJvDetail.JvDetailRecRow> pDetailRecOut,Ref<List<FbCommon.ErrTabtypeRow>> pErrTabOut,Ref<NString> pWarningOut,Ref<NString> pAbalSeverityOut,NNumber pOldPct,NNumber pNewAmt) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_JV_DETAIL_RULES.P_VALID_UPDATE", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter(DbTypes.createStructType("P_DETAIL_REC_IN", pDetailRecIn, FbJvDetail.JvDetailRecRow.class ));
//			cmd.addParameter(DbTypes.createStructType("P_DETAIL_REC_OUT", FbJvDetail.JvDetailRecRow.class));
//			// cmd.addParameter(DbTypes.getTableType("P_ERR_TAB_OUT", "", object.class));
//			cmd.addParameter("@P_WARNING_OUT", NString.class);
//			cmd.addParameter("@P_ABAL_SEVERITY_OUT", NString.class);
//			cmd.addParameter("@P_OLD_PCT", pOldPct);
//			cmd.addParameter("@P_NEW_AMT", pNewAmt);
//				
//			cmd.execute();
//			pDetailRecOut.val = cmd.getParameterValue("@P_DETAIL_REC_OUT", FbJvDetail.JvDetailRecRow.class);
//			// pErrTabOut.val = cmd.getTableParameterValue("@P_ERR_TAB_OUT", object.class);
//			pWarningOut.val = cmd.getParameterValue("@P_WARNING_OUT", NString.class);
//			pAbalSeverityOut.val = cmd.getParameterValue("@P_ABAL_SEVERITY_OUT", NString.class);
//
//
//		}
		
	
	
	
}
