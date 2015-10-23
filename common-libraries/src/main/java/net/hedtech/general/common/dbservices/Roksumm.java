package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Roksumm {
		public static void pGetCmntInd(NNumber pidm,Ref<NString> displayCmntInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKSUMM.P_GET_CMNT_IND", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@DISPLAY_CMNT_IND", NString.class);
				
			cmd.execute();
			displayCmntInd.val = cmd.getParameterValue("@DISPLAY_CMNT_IND", NString.class);


		}
		
		public static void pGetDisbInd(NString aidyCode,NNumber pidm,Ref<NString> displayDisbInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKSUMM.P_GET_DISB_IND", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@AIDY_CODE", aidyCode);
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@DISPLAY_DISB_IND", NString.class);
				
			cmd.execute();
			displayDisbInd.val = cmd.getParameterValue("@DISPLAY_DISB_IND", NString.class);


		}
		
		public static void pGetFm(NString aidyCode,NNumber pidm,Ref<NString> dependInd,Ref<NString> displaySc,Ref<NString> displayPc,Ref<NString> displayTfc) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKSUMM.P_GET_FM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@AIDY_CODE", aidyCode);
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@DEPEND_IND", NString.class);
			cmd.addParameter("@DISPLAY_SC", NString.class);
			cmd.addParameter("@DISPLAY_PC", NString.class);
			cmd.addParameter("@DISPLAY_TFC", NString.class);
				
			cmd.execute();
			dependInd.val = cmd.getParameterValue("@DEPEND_IND", NString.class);
			displaySc.val = cmd.getParameterValue("@DISPLAY_SC", NString.class);
			displayPc.val = cmd.getParameterValue("@DISPLAY_PC", NString.class);
			displayTfc.val = cmd.getParameterValue("@DISPLAY_TFC", NString.class);


		}
		
		public static void pGetHoldInd(NString aidyCode,NNumber pidm,Ref<NString> displayHoldInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKSUMM.P_GET_HOLD_IND", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@AIDY_CODE", aidyCode);
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@DISPLAY_HOLD_IND", NString.class);
				
			cmd.execute();
			displayHoldInd.val = cmd.getParameterValue("@DISPLAY_HOLD_IND", NString.class);


		}
		
		public static void pGetIm(NString aidyCode,NNumber pidm,Ref<NString> dependInd,Ref<NString> displayScIm,Ref<NString> displayPcIm,Ref<NString> displayEfcIm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKSUMM.P_GET_IM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@AIDY_CODE", aidyCode);
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@DEPEND_IND", NString.class);
			cmd.addParameter("@DISPLAY_SC_IM", NString.class);
			cmd.addParameter("@DISPLAY_PC_IM", NString.class);
			cmd.addParameter("@DISPLAY_EFC_IM", NString.class);
				
			cmd.execute();
			dependInd.val = cmd.getParameterValue("@DEPEND_IND", NString.class);
			displayScIm.val = cmd.getParameterValue("@DISPLAY_SC_IM", NString.class);
			displayPcIm.val = cmd.getParameterValue("@DISPLAY_PC_IM", NString.class);
			displayEfcIm.val = cmd.getParameterValue("@DISPLAY_EFC_IM", NString.class);


		}
		
		public static void pGetLockInd(NString aidyCode,NNumber pidm,Ref<NString> displayLockInd,Ref<NString> displayImLockInd,Ref<NString> displayTrckInd,Ref<NString> displayPckgInd,Ref<NString> displayRecalcNaInd,Ref<NString> displayFmBatchLock,Ref<NString> displayImBatchLock) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKSUMM.P_GET_LOCK_IND", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@AIDY_CODE", aidyCode);
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@DISPLAY_LOCK_IND", NString.class);
			cmd.addParameter("@DISPLAY_IM_LOCK_IND", NString.class);
			cmd.addParameter("@DISPLAY_TRCK_IND", NString.class);
			cmd.addParameter("@DISPLAY_PCKG_IND", NString.class);
			cmd.addParameter("@DISPLAY_RECALC_NA_IND", NString.class);
			cmd.addParameter("@DISPLAY_FM_BATCH_LOCK", NString.class);
			cmd.addParameter("@DISPLAY_IM_BATCH_LOCK", NString.class);
				
			cmd.execute();
			displayLockInd.val = cmd.getParameterValue("@DISPLAY_LOCK_IND", NString.class);
			displayImLockInd.val = cmd.getParameterValue("@DISPLAY_IM_LOCK_IND", NString.class);
			displayTrckInd.val = cmd.getParameterValue("@DISPLAY_TRCK_IND", NString.class);
			displayPckgInd.val = cmd.getParameterValue("@DISPLAY_PCKG_IND", NString.class);
			displayRecalcNaInd.val = cmd.getParameterValue("@DISPLAY_RECALC_NA_IND", NString.class);
			displayFmBatchLock.val = cmd.getParameterValue("@DISPLAY_FM_BATCH_LOCK", NString.class);
			displayImBatchLock.val = cmd.getParameterValue("@DISPLAY_IM_BATCH_LOCK", NString.class);


		}
		
		public static void pGetNewStatusSummary(NNumber pPidm,NString pAidyCode,Ref<NNumber> pBudgetAmountOut,Ref<NNumber> pFmBudgetAmtOut,Ref<NString> pFmScOut,Ref<NString> pFmPcOut,Ref<NNumber> pFmEfcOut,Ref<NNumber> pPellBudgetAmtOut,Ref<NNumber> pPellAwardOut,Ref<NNumber> pImBudgetAmtOut,Ref<NString> pImScOut,Ref<NString> pImPcOut,Ref<NNumber> pImEfcOut,Ref<NString> pFmLockIndOut,Ref<NString> pImLockIndOut,Ref<NString> pTrckIndOut,Ref<NString> pPckgIndOut,Ref<NString> pDisbIndOut,Ref<NString> pRecalcNaIndOut,Ref<NString> pFmBatchLockOut,Ref<NString> pImBatchLockOut,Ref<NString> pHoldIndOut,Ref<NString> pOverrideIndOut,Ref<NString> pDependIndOut,Ref<NString> pVerifyIndOut,Ref<NString> pCommentIndOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKSUMM.P_GET_NEW_STATUS_SUMMARY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_BUDGET_AMOUNT_OUT", NNumber.class);
			cmd.addParameter("@P_FM_BUDGET_AMT_OUT", NNumber.class);
			cmd.addParameter("@P_FM_SC_OUT", NString.class);
			cmd.addParameter("@P_FM_PC_OUT", NString.class);
			cmd.addParameter("@P_FM_EFC_OUT", NNumber.class);
			cmd.addParameter("@P_PELL_BUDGET_AMT_OUT", NNumber.class);
			cmd.addParameter("@P_PELL_AWARD_OUT", NNumber.class);
			cmd.addParameter("@P_IM_BUDGET_AMT_OUT", NNumber.class);
			cmd.addParameter("@P_IM_SC_OUT", NString.class);
			cmd.addParameter("@P_IM_PC_OUT", NString.class);
			cmd.addParameter("@P_IM_EFC_OUT", NNumber.class);
			cmd.addParameter("@P_FM_LOCK_IND_OUT", NString.class);
			cmd.addParameter("@P_IM_LOCK_IND_OUT", NString.class);
			cmd.addParameter("@P_TRCK_IND_OUT", NString.class);
			cmd.addParameter("@P_PCKG_IND_OUT", NString.class);
			cmd.addParameter("@P_DISB_IND_OUT", NString.class);
			cmd.addParameter("@P_RECALC_NA_IND_OUT", NString.class);
			cmd.addParameter("@P_FM_BATCH_LOCK_OUT", NString.class);
			cmd.addParameter("@P_IM_BATCH_LOCK_OUT", NString.class);
			cmd.addParameter("@P_HOLD_IND_OUT", NString.class);
			cmd.addParameter("@P_OVERRIDE_IND_OUT", NString.class);
			cmd.addParameter("@P_DEPEND_IND_OUT", NString.class);
			cmd.addParameter("@P_VERIFY_IND_OUT", NString.class);
			cmd.addParameter("@P_COMMENT_IND_OUT", NString.class);
				
			cmd.execute();
			pBudgetAmountOut.val = cmd.getParameterValue("@P_BUDGET_AMOUNT_OUT", NNumber.class);
			pFmBudgetAmtOut.val = cmd.getParameterValue("@P_FM_BUDGET_AMT_OUT", NNumber.class);
			pFmScOut.val = cmd.getParameterValue("@P_FM_SC_OUT", NString.class);
			pFmPcOut.val = cmd.getParameterValue("@P_FM_PC_OUT", NString.class);
			pFmEfcOut.val = cmd.getParameterValue("@P_FM_EFC_OUT", NNumber.class);
			pPellBudgetAmtOut.val = cmd.getParameterValue("@P_PELL_BUDGET_AMT_OUT", NNumber.class);
			pPellAwardOut.val = cmd.getParameterValue("@P_PELL_AWARD_OUT", NNumber.class);
			pImBudgetAmtOut.val = cmd.getParameterValue("@P_IM_BUDGET_AMT_OUT", NNumber.class);
			pImScOut.val = cmd.getParameterValue("@P_IM_SC_OUT", NString.class);
			pImPcOut.val = cmd.getParameterValue("@P_IM_PC_OUT", NString.class);
			pImEfcOut.val = cmd.getParameterValue("@P_IM_EFC_OUT", NNumber.class);
			pFmLockIndOut.val = cmd.getParameterValue("@P_FM_LOCK_IND_OUT", NString.class);
			pImLockIndOut.val = cmd.getParameterValue("@P_IM_LOCK_IND_OUT", NString.class);
			pTrckIndOut.val = cmd.getParameterValue("@P_TRCK_IND_OUT", NString.class);
			pPckgIndOut.val = cmd.getParameterValue("@P_PCKG_IND_OUT", NString.class);
			pDisbIndOut.val = cmd.getParameterValue("@P_DISB_IND_OUT", NString.class);
			pRecalcNaIndOut.val = cmd.getParameterValue("@P_RECALC_NA_IND_OUT", NString.class);
			pFmBatchLockOut.val = cmd.getParameterValue("@P_FM_BATCH_LOCK_OUT", NString.class);
			pImBatchLockOut.val = cmd.getParameterValue("@P_IM_BATCH_LOCK_OUT", NString.class);
			pHoldIndOut.val = cmd.getParameterValue("@P_HOLD_IND_OUT", NString.class);
			pOverrideIndOut.val = cmd.getParameterValue("@P_OVERRIDE_IND_OUT", NString.class);
			pDependIndOut.val = cmd.getParameterValue("@P_DEPEND_IND_OUT", NString.class);
			pVerifyIndOut.val = cmd.getParameterValue("@P_VERIFY_IND_OUT", NString.class);
			pCommentIndOut.val = cmd.getParameterValue("@P_COMMENT_IND_OUT", NString.class);


		}
		
		public static void pGetOverideInd(NString aidyCode,NNumber pidm,Ref<NString> displayOvrdInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKSUMM.P_GET_OVERIDE_IND", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@AIDY_CODE", aidyCode);
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@DISPLAY_OVRD_IND", NString.class);
				
			cmd.execute();
			displayOvrdInd.val = cmd.getParameterValue("@DISPLAY_OVRD_IND", NString.class);


		}
		
		public static void pGetStatusSummary(NString aidyCde,NNumber pidmX,Ref<NNumber> budgetX,Ref<NString> tfcIndX,Ref<NString> dependIndX,Ref<NString> displayScX,Ref<NString> displayPcX,Ref<NString> displayTfcX,Ref<NString> displayScImX,Ref<NString> displayPcImX,Ref<NString> displayEfcImX,Ref<NNumber> displayPellAwardX,Ref<NString> displayOvrdIndX,Ref<NString> displayLockIndX,Ref<NString> displayImLockIndX,Ref<NString> displayTrckIndX,Ref<NString> displayPckgIndX,Ref<NString> displayRecalcNaIndX,Ref<NString> displayFmBatchLockX,Ref<NString> displayImBatchLockX,Ref<NString> displayHoldIndX,Ref<NString> displayCmntIndX,Ref<NString> displayDisbIndX,Ref<NString> displayVerifyIndX) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKSUMM.P_GET_STATUS_SUMMARY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@AIDY_CDE", aidyCde);
			cmd.addParameter("@PIDM_X", pidmX);
			cmd.addParameter("@BUDGET_X", NNumber.class);
			cmd.addParameter("@TFC_IND_X", NString.class);
			cmd.addParameter("@DEPEND_IND_X", NString.class);
			cmd.addParameter("@DISPLAY_SC_X", NString.class);
			cmd.addParameter("@DISPLAY_PC_X", NString.class);
			cmd.addParameter("@DISPLAY_TFC_X", NString.class);
			cmd.addParameter("@DISPLAY_SC_IM_X", NString.class);
			cmd.addParameter("@DISPLAY_PC_IM_X", NString.class);
			cmd.addParameter("@DISPLAY_EFC_IM_X", NString.class);
			cmd.addParameter("@DISPLAY_PELL_AWARD_X", NNumber.class);
			cmd.addParameter("@DISPLAY_OVRD_IND_X", NString.class);
			cmd.addParameter("@DISPLAY_LOCK_IND_X", NString.class);
			cmd.addParameter("@DISPLAY_IM_LOCK_IND_X", NString.class);
			cmd.addParameter("@DISPLAY_TRCK_IND_X", NString.class);
			cmd.addParameter("@DISPLAY_PCKG_IND_X", NString.class);
			cmd.addParameter("@DISPLAY_RECALC_NA_IND_X", NString.class);
			cmd.addParameter("@DISPLAY_FM_BATCH_LOCK_X", NString.class);
			cmd.addParameter("@DISPLAY_IM_BATCH_LOCK_X", NString.class);
			cmd.addParameter("@DISPLAY_HOLD_IND_X", NString.class);
			cmd.addParameter("@DISPLAY_CMNT_IND_X", NString.class);
			cmd.addParameter("@DISPLAY_DISB_IND_X", NString.class);
			cmd.addParameter("@DISPLAY_VERIFY_IND_X", NString.class);
				
			cmd.execute();
			budgetX.val = cmd.getParameterValue("@BUDGET_X", NNumber.class);
			tfcIndX.val = cmd.getParameterValue("@TFC_IND_X", NString.class);
			dependIndX.val = cmd.getParameterValue("@DEPEND_IND_X", NString.class);
			displayScX.val = cmd.getParameterValue("@DISPLAY_SC_X", NString.class);
			displayPcX.val = cmd.getParameterValue("@DISPLAY_PC_X", NString.class);
			displayTfcX.val = cmd.getParameterValue("@DISPLAY_TFC_X", NString.class);
			displayScImX.val = cmd.getParameterValue("@DISPLAY_SC_IM_X", NString.class);
			displayPcImX.val = cmd.getParameterValue("@DISPLAY_PC_IM_X", NString.class);
			displayEfcImX.val = cmd.getParameterValue("@DISPLAY_EFC_IM_X", NString.class);
			displayPellAwardX.val = cmd.getParameterValue("@DISPLAY_PELL_AWARD_X", NNumber.class);
			displayOvrdIndX.val = cmd.getParameterValue("@DISPLAY_OVRD_IND_X", NString.class);
			displayLockIndX.val = cmd.getParameterValue("@DISPLAY_LOCK_IND_X", NString.class);
			displayImLockIndX.val = cmd.getParameterValue("@DISPLAY_IM_LOCK_IND_X", NString.class);
			displayTrckIndX.val = cmd.getParameterValue("@DISPLAY_TRCK_IND_X", NString.class);
			displayPckgIndX.val = cmd.getParameterValue("@DISPLAY_PCKG_IND_X", NString.class);
			displayRecalcNaIndX.val = cmd.getParameterValue("@DISPLAY_RECALC_NA_IND_X", NString.class);
			displayFmBatchLockX.val = cmd.getParameterValue("@DISPLAY_FM_BATCH_LOCK_X", NString.class);
			displayImBatchLockX.val = cmd.getParameterValue("@DISPLAY_IM_BATCH_LOCK_X", NString.class);
			displayHoldIndX.val = cmd.getParameterValue("@DISPLAY_HOLD_IND_X", NString.class);
			displayCmntIndX.val = cmd.getParameterValue("@DISPLAY_CMNT_IND_X", NString.class);
			displayDisbIndX.val = cmd.getParameterValue("@DISPLAY_DISB_IND_X", NString.class);
			displayVerifyIndX.val = cmd.getParameterValue("@DISPLAY_VERIFY_IND_X", NString.class);


		}
		
		public static void pGetVerifyInd(NString aidyCode,NNumber pidm,Ref<NString> displayVerifyInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKSUMM.P_GET_VERIFY_IND", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@AIDY_CODE", aidyCode);
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@DISPLAY_VERIFY_IND", NString.class);
				
			cmd.execute();
			displayVerifyInd.val = cmd.getParameterValue("@DISPLAY_VERIFY_IND", NString.class);


		}
		
	
	
	
}
