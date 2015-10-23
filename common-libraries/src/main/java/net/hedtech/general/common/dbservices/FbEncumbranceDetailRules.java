package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class FbEncumbranceDetailRules {
//		public static void pProcessEditRulp(NString pRuclCode,NDate pTransDate,NString pNum,NString pType,NNumber pSubmissionNumber,NNumber pItem,NNumber pSeqNum,NString pUserId,Ref<NString> pFsyrCodeInOut,Ref<NNumber> pPendAmtInOut,Ref<NString> pDrCrIndInOut,Ref<NString> pAcciCodeInOut,Ref<NString> pCoasCodeInOut,Ref<NString> pFundCodeInOut,Ref<NString> pOrgnCodeInOut,Ref<NString> pAcctCodeInOut,Ref<NString> pProgCodeInOut,Ref<NString> pActvCodeInOut,Ref<NString> pLocnCodeInOut,Ref<NString> pCmtTypeInOut,Ref<NNumber> pCmtPctInOut,Ref<NString> pPrjdCodeInOut,Ref<NNumber> pDistPctInOut,Ref<NString> pPostingPeriodInOut,Ref<List<FbCommon.ErrTabtypeRow>> pErrTabInOut) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_ENCUMBRANCE_DETAIL_RULES.P_PROCESS_EDIT_RULP", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_RUCL_CODE", pRuclCode);
//			cmd.addParameter("@P_TRANS_DATE", pTransDate);
//			cmd.addParameter("@P_NUM", pNum);
//			cmd.addParameter("@P_TYPE", pType);
//			cmd.addParameter("@P_SUBMISSION_NUMBER", pSubmissionNumber);
//			cmd.addParameter("@P_ITEM", pItem);
//			cmd.addParameter("@P_SEQ_NUM", pSeqNum);
//			cmd.addParameter("@P_USER_ID", pUserId);
//			cmd.addParameter("@P_FSYR_CODE_IN_OUT", pFsyrCodeInOut, true);
//			cmd.addParameter("@P_PEND_AMT_IN_OUT", pPendAmtInOut, true);
//			cmd.addParameter("@P_DR_CR_IND_IN_OUT", pDrCrIndInOut, true);
//			cmd.addParameter("@P_ACCI_CODE_IN_OUT", pAcciCodeInOut, true);
//			cmd.addParameter("@P_COAS_CODE_IN_OUT", pCoasCodeInOut, true);
//			cmd.addParameter("@P_FUND_CODE_IN_OUT", pFundCodeInOut, true);
//			cmd.addParameter("@P_ORGN_CODE_IN_OUT", pOrgnCodeInOut, true);
//			cmd.addParameter("@P_ACCT_CODE_IN_OUT", pAcctCodeInOut, true);
//			cmd.addParameter("@P_PROG_CODE_IN_OUT", pProgCodeInOut, true);
//			cmd.addParameter("@P_ACTV_CODE_IN_OUT", pActvCodeInOut, true);
//			cmd.addParameter("@P_LOCN_CODE_IN_OUT", pLocnCodeInOut, true);
//			cmd.addParameter("@P_CMT_TYPE_IN_OUT", pCmtTypeInOut, true);
//			cmd.addParameter("@P_CMT_PCT_IN_OUT", pCmtPctInOut, true);
//			cmd.addParameter("@P_PRJD_CODE_IN_OUT", pPrjdCodeInOut, true);
//			cmd.addParameter("@P_DIST_PCT_IN_OUT", pDistPctInOut, true);
//			cmd.addParameter("@P_POSTING_PERIOD_IN_OUT", pPostingPeriodInOut, true);
//			// cmd.addParameter(DbTypes.getTableType("P_ERR_TAB_IN_OUT", "", pErrTabInOut.val, object.class , true));
//				
//			cmd.execute();
//			pFsyrCodeInOut.val = cmd.getParameterValue("@P_FSYR_CODE_IN_OUT", NString.class);
//			pPendAmtInOut.val = cmd.getParameterValue("@P_PEND_AMT_IN_OUT", NNumber.class);
//			pDrCrIndInOut.val = cmd.getParameterValue("@P_DR_CR_IND_IN_OUT", NString.class);
//			pAcciCodeInOut.val = cmd.getParameterValue("@P_ACCI_CODE_IN_OUT", NString.class);
//			pCoasCodeInOut.val = cmd.getParameterValue("@P_COAS_CODE_IN_OUT", NString.class);
//			pFundCodeInOut.val = cmd.getParameterValue("@P_FUND_CODE_IN_OUT", NString.class);
//			pOrgnCodeInOut.val = cmd.getParameterValue("@P_ORGN_CODE_IN_OUT", NString.class);
//			pAcctCodeInOut.val = cmd.getParameterValue("@P_ACCT_CODE_IN_OUT", NString.class);
//			pProgCodeInOut.val = cmd.getParameterValue("@P_PROG_CODE_IN_OUT", NString.class);
//			pActvCodeInOut.val = cmd.getParameterValue("@P_ACTV_CODE_IN_OUT", NString.class);
//			pLocnCodeInOut.val = cmd.getParameterValue("@P_LOCN_CODE_IN_OUT", NString.class);
//			pCmtTypeInOut.val = cmd.getParameterValue("@P_CMT_TYPE_IN_OUT", NString.class);
//			pCmtPctInOut.val = cmd.getParameterValue("@P_CMT_PCT_IN_OUT", NNumber.class);
//			pPrjdCodeInOut.val = cmd.getParameterValue("@P_PRJD_CODE_IN_OUT", NString.class);
//			pDistPctInOut.val = cmd.getParameterValue("@P_DIST_PCT_IN_OUT", NNumber.class);
//			pPostingPeriodInOut.val = cmd.getParameterValue("@P_POSTING_PERIOD_IN_OUT", NString.class);
//			// pErrTabInOut.val = cmd.getTableParameterValue("@P_ERR_TAB_IN_OUT", object.class);
//
//
//		}
		
//		public static void pValidCreate(FbEncumbranceDetail.EncumbranceDetailRecRow pDetailRecIn,NString pContextIn,Ref<FbEncumbranceDetail.EncumbranceDetailRecRow> pDetailRecOut,Ref<List<FbCommon.ErrTabtypeRow>> pErrTabOut,Ref<NString> pWarningOut,Ref<NString> pAbalSeverityOut) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_ENCUMBRANCE_DETAIL_RULES.P_VALID_CREATE", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter(DbTypes.createStructType("P_DETAIL_REC_IN", pDetailRecIn, FbEncumbranceDetail.EncumbranceDetailRecRow.class ));
//			cmd.addParameter("@P_CONTEXT_IN", pContextIn);
//			cmd.addParameter(DbTypes.createStructType("P_DETAIL_REC_OUT", FbEncumbranceDetail.EncumbranceDetailRecRow.class));
//			// cmd.addParameter(DbTypes.getTableType("P_ERR_TAB_OUT", "", object.class));
//			cmd.addParameter("@P_WARNING_OUT", NString.class);
//			cmd.addParameter("@P_ABAL_SEVERITY_OUT", NString.class);
//				
//			cmd.execute();
//			pDetailRecOut.val = cmd.getParameterValue("@P_DETAIL_REC_OUT", FbEncumbranceDetail.EncumbranceDetailRecRow.class);
//			// pErrTabOut.val = cmd.getTableParameterValue("@P_ERR_TAB_OUT", object.class);
//			pWarningOut.val = cmd.getParameterValue("@P_WARNING_OUT", NString.class);
//			pAbalSeverityOut.val = cmd.getParameterValue("@P_ABAL_SEVERITY_OUT", NString.class);
//
//
//		}
		
//		public static void pValidUpdate(FbEncumbranceDetail.EncumbranceDetailRecRow pDetailRecIn,Ref<FbEncumbranceDetail.EncumbranceDetailRecRow> pDetailRecOut,FbEncumbranceDetail.EncumbranceDetailRecRow pOriginalRec,Ref<List<FbCommon.ErrTabtypeRow>> pErrTabOut,Ref<NString> pWarningOut,Ref<NString> pAbalSeverityOut,NNumber pOldPct,NNumber pNewAmt) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_ENCUMBRANCE_DETAIL_RULES.P_VALID_UPDATE", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter(DbTypes.createStructType("P_DETAIL_REC_IN", pDetailRecIn, FbEncumbranceDetail.EncumbranceDetailRecRow.class ));
//			cmd.addParameter(DbTypes.createStructType("P_DETAIL_REC_OUT", FbEncumbranceDetail.EncumbranceDetailRecRow.class));
//			cmd.addParameter(DbTypes.createStructType("P_ORIGINAL_REC", pOriginalRec, FbEncumbranceDetail.EncumbranceDetailRecRow.class ));
//			// cmd.addParameter(DbTypes.getTableType("P_ERR_TAB_OUT", "", object.class));
//			cmd.addParameter("@P_WARNING_OUT", NString.class);
//			cmd.addParameter("@P_ABAL_SEVERITY_OUT", NString.class);
//			cmd.addParameter("@P_OLD_PCT", pOldPct);
//			cmd.addParameter("@P_NEW_AMT", pNewAmt);
//				
//			cmd.execute();
//			pDetailRecOut.val = cmd.getParameterValue("@P_DETAIL_REC_OUT", FbEncumbranceDetail.EncumbranceDetailRecRow.class);
//			// pErrTabOut.val = cmd.getTableParameterValue("@P_ERR_TAB_OUT", object.class);
//			pWarningOut.val = cmd.getParameterValue("@P_WARNING_OUT", NString.class);
//			pAbalSeverityOut.val = cmd.getParameterValue("@P_ABAL_SEVERITY_OUT", NString.class);
//
//
//		}
		
	
	
	
}
