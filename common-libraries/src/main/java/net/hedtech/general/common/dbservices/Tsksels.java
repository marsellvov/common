package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Tsksels {
		public static NString fAuthDcatTbruprf(NString userIn,NString dcatCodeIn,NString detcTypeIn,NNumber amountIn,NString drCrIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TSKSELS.F_AUTH_DCAT_TBRUPRF", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@USER_IN", userIn);
			cmd.addParameter("@DCAT_CODE_IN", dcatCodeIn);
			cmd.addParameter("@DETC_TYPE_IN", detcTypeIn);
			cmd.addParameter("@AMOUNT_IN", amountIn);
			cmd.addParameter("@DR_CR_IN", drCrIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber fCalcControlBalance(NNumber controlBalanceIn,NString detlIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TSKSELS.F_CALC_CONTROL_BALANCE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@CONTROL_BALANCE_IN", controlBalanceIn);
			cmd.addParameter("@DETL_IN", detlIn);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fCalcTbraccdAmountCount(NNumber pidmIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TSKSELS.F_CALC_TBRACCD_AMOUNT_COUNT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@PIDM_IN", pidmIn);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fCalcTbraccdTotalAmount(NString termIn,NNumber pidmIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TSKSELS.F_CALC_TBRACCD_TOTAL_AMOUNT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@PIDM_IN", pidmIn);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fCalcTbrmemoTotalAmount(NString termIn,NNumber pidmIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TSKSELS.F_CALC_TBRMEMO_TOTAL_AMOUNT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@PIDM_IN", pidmIn);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString fCheckAidReview(NNumber pidmIn,NString termIn,NString aidyIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TSKSELS.F_CHECK_AID_REVIEW", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@AIDY_IN", aidyIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fCheckBillingHolds(NNumber pidmIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TSKSELS.F_CHECK_BILLING_HOLDS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PIDM_IN", pidmIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fCheckForTiv(NNumber pidmIn,NString termIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TSKSELS.F_CHECK_FOR_TIV", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@TERM_IN", termIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NBool fCheckTbrcrcpReceipt(NNumber receiptNumberIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TSKSELS.F_CHECK_TBRCRCP_RECEIPT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@RECEIPT_NUMBER_IN", receiptNumberIn);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NNumber fComputeMinCcPayment(NNumber currentTermCharges,NNumber currentTermCredits,NNumber totalDue) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TSKSELS.F_COMPUTE_MIN_CC_PAYMENT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@CURRENT_TERM_CHARGES", currentTermCharges);
			cmd.addParameter("@CURRENT_TERM_CREDITS", currentTermCredits);
			cmd.addParameter("@TOTAL_DUE", totalDue);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NDate fDateCtrlMonths(NString typeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TSKSELS.F_DATE_CTRL_MONTHS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NDate.class);
			cmd.addParameter("@TYPE_IN", typeIn);
				
			cmd.execute();

			return cmd.getReturnValue(NDate.class);

		}
		
		public static NNumber fGetCurrChrgPymnts(NNumber pidmIn,NString termCodeIn,NString typeIndIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TSKSELS.F_GET_CURR_CHRG_PYMNTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@TERM_CODE_IN", termCodeIn);
			cmd.addParameter("@TYPE_IND_IN", typeIndIn);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString fGetEnrlPeriod(NString pFaInstalledInd,NNumber pPidm,NString pTerm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TSKSELS.F_GET_ENRL_PERIOD", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_FA_INSTALLED_IND", pFaInstalledInd);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM", pTerm);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber fGetFutureCurrBalance(NNumber pidmIn,NString termCodeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TSKSELS.F_GET_FUTURE_CURR_BALANCE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@TERM_CODE_IN", termCodeIn);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fGetFutureOthrBalance(NNumber pidmIn,NString termCodeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TSKSELS.F_GET_FUTURE_OTHR_BALANCE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@TERM_CODE_IN", termCodeIn);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fGetOtherTermBalance(NNumber pidmIn,NString termCodeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TSKSELS.F_GET_OTHER_TERM_BALANCE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@TERM_CODE_IN", termCodeIn);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static void fGetTbbctrlRec() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TSKSELS.F_GET_TBBCTRL_REC", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void fGetTbbdetcRec() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TSKSELS.F_GET_TBBDETC_REC", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static NString fGetTbbdetcReceiptInd(NString detlIn,NString rcptIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TSKSELS.F_GET_TBBDETC_RECEIPT_IND", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@DETL_IN", detlIn);
			cmd.addParameter("@RCPT_IN", rcptIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void fGetTbbuprfRec() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TSKSELS.F_GET_TBBUPRF_REC", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static NString fGetTbraccdAcctFeedInd(NString termIn,NNumber pidmIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TSKSELS.F_GET_TBRACCD_ACCT_FEED_IND", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@PIDM_IN", pidmIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetTbraccdDetailCode(NString termIn,NNumber pidmIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TSKSELS.F_GET_TBRACCD_DETAIL_CODE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@PIDM_IN", pidmIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NDate fGetTbraccdEffectiveDate(NString termIn,NNumber pidmIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TSKSELS.F_GET_TBRACCD_EFFECTIVE_DATE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NDate.class);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@PIDM_IN", pidmIn);
				
			cmd.execute();

			return cmd.getReturnValue(NDate.class);

		}
		
		public static NNumber fGetTbraccdSesionNumb(NString termIn,NNumber pidmIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TSKSELS.F_GET_TBRACCD_SESION_NUMB", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@PIDM_IN", pidmIn);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString fGetTbraccdSrceCode(NString termIn,NNumber pidmIn,NString detailCodeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TSKSELS.F_GET_TBRACCD_SRCE_CODE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@DETAIL_CODE_IN", detailCodeIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber fGetTbraccdSumAmount(NNumber pidmIn,NString dcatCodeIn,NString termCodeIn,NString cpTypeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TSKSELS.F_GET_TBRACCD_SUM_AMOUNT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@DCAT_CODE_IN", dcatCodeIn);
			cmd.addParameter("@TERM_CODE_IN", termCodeIn);
			cmd.addParameter("@CP_TYPE_IN", cpTypeIn);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fGetTbraccdTranNumber(NNumber pidmIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TSKSELS.F_GET_TBRACCD_TRAN_NUMBER", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@PIDM_IN", pidmIn);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static void fGetTbrclctRec() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TSKSELS.F_GET_TBRCLCT_REC", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static NString fTbbcstuExists(NString termIn,NNumber pidmIn,NString waitForLockIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TSKSELS.F_TBBCSTU_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@WAIT_FOR_LOCK_IN", waitForLockIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fTbbestuExists(NString termIn,NNumber pidmIn,NString waitForLockIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TSKSELS.F_TBBESTU_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@WAIT_FOR_LOCK_IN", waitForLockIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fTbraccdCEExists(NNumber pidmIn,NString termIn,NString srceIn,NNumber xrefPidmIn,NNumber xrefNumberIn,NString xrefSrceIn,NString xrefDetlIn,NString xrefDcatIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TSKSELS.F_TBRACCD_C_E_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@SRCE_IN", srceIn);
			cmd.addParameter("@XREF_PIDM_IN", xrefPidmIn);
			cmd.addParameter("@XREF_NUMBER_IN", xrefNumberIn);
			cmd.addParameter("@XREF_SRCE_IN", xrefSrceIn);
			cmd.addParameter("@XREF_DETL_IN", xrefDetlIn);
			cmd.addParameter("@XREF_DCAT_IN", xrefDcatIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fTbraccdCredChk2Exists(NNumber tranIn,NNumber pidmIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TSKSELS.F_TBRACCD_CRED_CHK_2_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@TRAN_IN", tranIn);
			cmd.addParameter("@PIDM_IN", pidmIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fTbraccdCredChk3Exists(NString userIn,NNumber tranIn,NNumber pidmIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TSKSELS.F_TBRACCD_CRED_CHK_3_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@USER_IN", userIn);
			cmd.addParameter("@TRAN_IN", tranIn);
			cmd.addParameter("@PIDM_IN", pidmIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fTbrdepoAutoRelExists(NString termIn,NNumber pidmIn,NString waitForLockIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TSKSELS.F_TBRDEPO_AUTO_REL_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@WAIT_FOR_LOCK_IN", waitForLockIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber fTivWdExists(NNumber pidmIn,NString aidyIn,NString termIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TSKSELS.F_TIV_WD_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@AIDY_IN", aidyIn);
			cmd.addParameter("@TERM_IN", termIn);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString fValidAidyStatus(NString aidyIn,NString statusIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TSKSELS.F_VALID_AIDY_STATUS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@AIDY_IN", aidyIn);
			cmd.addParameter("@STATUS_IN", statusIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pGetTbruprfTypeInd(Ref<NBool> typeExistsInOut,Ref<NString> typeIndInOut,NString userIn,NString dcatIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TSKSELS.P_GET_TBRUPRF_TYPE_IND", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TYPE_EXISTS_IN_OUT", typeExistsInOut, true);
			cmd.addParameter("@TYPE_IND_IN_OUT", typeIndInOut, true);
			cmd.addParameter("@USER_IN", userIn);
			cmd.addParameter("@DCAT_IN", dcatIn);
				
			cmd.execute();
			typeExistsInOut.val = cmd.getParameterValue("@TYPE_EXISTS_IN_OUT", NBool.class);
			typeIndInOut.val = cmd.getParameterValue("@TYPE_IND_IN_OUT", NString.class);


		}
		
		public static void pGetTtvdcatRow(NString dcatCodeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TSKSELS.P_GET_TTVDCAT_ROW", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@DCAT_CODE_IN", dcatCodeIn);
				
			cmd.execute();


		}
		
	
	
	
}
