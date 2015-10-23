package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Rpkawrd {
		public static NString fCreateLoanWhenAccepted(NString pAidyCode,NString pFundCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RPKAWRD.F_CREATE_LOAN_WHEN_ACCEPTED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fFundIsPell(NString pFundCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RPKAWRD.F_FUND_IS_PELL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static FundRecRow fGetFundData(NString pAidyCode,NString pFundCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RPKAWRD.F_GET_FUND_DATA", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DbTypes.createStructType(FundRecRow.class));
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
				
			cmd.execute();

			return cmd.getReturnValue(FundRecRow.class);

		}
		
		public static NDate fGetOfferExpDate(NString pAidyCode,NDate pOfferDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RPKAWRD.F_GET_OFFER_EXP_DATE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NDate.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_OFFER_DATE", pOfferDate);
				
			cmd.execute();

			return cmd.getReturnValue(NDate.class);

		}
		
		public static void pAddLoanApplicationRecord(NString pAidyCode,NNumber pPidm,NString pFundCode,NString pAprdCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RPKAWRD.P_ADD_LOAN_APPLICATION_RECORD", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_APRD_CODE", pAprdCode);
				
			cmd.execute();


		}
		
		public static void pAddPromNote(NString pAidyCode,NNumber pPidm,NString pFundCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RPKAWRD.P_ADD_PROM_NOTE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
				
			cmd.execute();


		}
		
		public static void pCalcFundTotals(NString pAidyCode,NString pFundCode,Ref<NNumber> pOrigOfferNoOut,Ref<NNumber> pOrigOfferAmtOut,Ref<NNumber> pOfferNoOut,Ref<NNumber> pOfferAmtOut,Ref<NNumber> pAcceptNoOut,Ref<NNumber> pAcceptAmtOut,Ref<NNumber> pDeclineNoOut,Ref<NNumber> pDeclineAmtOut,Ref<NNumber> pCancelNoOut,Ref<NNumber> pCancelAmtOut,Ref<NNumber> pAuthorizeNoOut,Ref<NNumber> pAuthorizeAmtOut,Ref<NNumber> pMemoNoOut,Ref<NNumber> pMemoAmtOut,Ref<NNumber> pPaidNoOut,Ref<NNumber> pPaidAmtOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RPKAWRD.P_CALC_FUND_TOTALS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_ORIG_OFFER_NO_OUT", NNumber.class);
			cmd.addParameter("@P_ORIG_OFFER_AMT_OUT", NNumber.class);
			cmd.addParameter("@P_OFFER_NO_OUT", NNumber.class);
			cmd.addParameter("@P_OFFER_AMT_OUT", NNumber.class);
			cmd.addParameter("@P_ACCEPT_NO_OUT", NNumber.class);
			cmd.addParameter("@P_ACCEPT_AMT_OUT", NNumber.class);
			cmd.addParameter("@P_DECLINE_NO_OUT", NNumber.class);
			cmd.addParameter("@P_DECLINE_AMT_OUT", NNumber.class);
			cmd.addParameter("@P_CANCEL_NO_OUT", NNumber.class);
			cmd.addParameter("@P_CANCEL_AMT_OUT", NNumber.class);
			cmd.addParameter("@P_AUTHORIZE_NO_OUT", NNumber.class);
			cmd.addParameter("@P_AUTHORIZE_AMT_OUT", NNumber.class);
			cmd.addParameter("@P_MEMO_NO_OUT", NNumber.class);
			cmd.addParameter("@P_MEMO_AMT_OUT", NNumber.class);
			cmd.addParameter("@P_PAID_NO_OUT", NNumber.class);
			cmd.addParameter("@P_PAID_AMT_OUT", NNumber.class);
				
			cmd.execute();
			pOrigOfferNoOut.val = cmd.getParameterValue("@P_ORIG_OFFER_NO_OUT", NNumber.class);
			pOrigOfferAmtOut.val = cmd.getParameterValue("@P_ORIG_OFFER_AMT_OUT", NNumber.class);
			pOfferNoOut.val = cmd.getParameterValue("@P_OFFER_NO_OUT", NNumber.class);
			pOfferAmtOut.val = cmd.getParameterValue("@P_OFFER_AMT_OUT", NNumber.class);
			pAcceptNoOut.val = cmd.getParameterValue("@P_ACCEPT_NO_OUT", NNumber.class);
			pAcceptAmtOut.val = cmd.getParameterValue("@P_ACCEPT_AMT_OUT", NNumber.class);
			pDeclineNoOut.val = cmd.getParameterValue("@P_DECLINE_NO_OUT", NNumber.class);
			pDeclineAmtOut.val = cmd.getParameterValue("@P_DECLINE_AMT_OUT", NNumber.class);
			pCancelNoOut.val = cmd.getParameterValue("@P_CANCEL_NO_OUT", NNumber.class);
			pCancelAmtOut.val = cmd.getParameterValue("@P_CANCEL_AMT_OUT", NNumber.class);
			pAuthorizeNoOut.val = cmd.getParameterValue("@P_AUTHORIZE_NO_OUT", NNumber.class);
			pAuthorizeAmtOut.val = cmd.getParameterValue("@P_AUTHORIZE_AMT_OUT", NNumber.class);
			pMemoNoOut.val = cmd.getParameterValue("@P_MEMO_NO_OUT", NNumber.class);
			pMemoAmtOut.val = cmd.getParameterValue("@P_MEMO_AMT_OUT", NNumber.class);
			pPaidNoOut.val = cmd.getParameterValue("@P_PAID_NO_OUT", NNumber.class);
			pPaidAmtOut.val = cmd.getParameterValue("@P_PAID_AMT_OUT", NNumber.class);


		}
		
		public static void pDeletePromNote(NString pAidyCode,NNumber pPidm,NString pFundCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RPKAWRD.P_DELETE_PROM_NOTE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
				
			cmd.execute();


		}
		
		public static void pGetUnmetNeed(NString pAidyCode,NNumber pPidm,NString pSimulateSw,Ref<NNumber> pBudgetAmtOut,Ref<NNumber> pResourceAmtOut,Ref<NNumber> pReplaceEfcAmtOut,Ref<NNumber> pReduceNeedAmtOut,Ref<NString> pEfcIndOut,Ref<NNumber> pEfcAmtOut,Ref<NNumber> pFmBudgetAmountOut,Ref<NNumber> pFmDirectCostOut,Ref<NNumber> pFmEfcAmtOut,Ref<NNumber> pGrossNeedOut,Ref<NNumber> pExcessEfcAmtOut,Ref<NNumber> pUnmetNeedOut,Ref<NNumber> pImBudgetAmountOut,Ref<NNumber> pImDirectCostOut,Ref<NNumber> pImEfcAmtOut,Ref<NNumber> pImGrossNeedOut,Ref<NNumber> pImExcessEfcAmtOut,Ref<NNumber> pImUnmetNeedOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RPKAWRD.P_GET_UNMET_NEED", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SIMULATE_SW", pSimulateSw);
			cmd.addParameter("@P_BUDGET_AMT_OUT", NNumber.class);
			cmd.addParameter("@P_RESOURCE_AMT_OUT", NNumber.class);
			cmd.addParameter("@P_REPLACE_EFC_AMT_OUT", NNumber.class);
			cmd.addParameter("@P_REDUCE_NEED_AMT_OUT", NNumber.class);
			cmd.addParameter("@P_EFC_IND_OUT", NString.class);
			cmd.addParameter("@P_EFC_AMT_OUT", NNumber.class);
			cmd.addParameter("@P_FM_BUDGET_AMOUNT_OUT", NNumber.class);
			cmd.addParameter("@P_FM_DIRECT_COST_OUT", NNumber.class);
			cmd.addParameter("@P_FM_EFC_AMT_OUT", NNumber.class);
			cmd.addParameter("@P_GROSS_NEED_OUT", NNumber.class);
			cmd.addParameter("@P_EXCESS_EFC_AMT_OUT", NNumber.class);
			cmd.addParameter("@P_UNMET_NEED_OUT", NNumber.class);
			cmd.addParameter("@P_IM_BUDGET_AMOUNT_OUT", NNumber.class);
			cmd.addParameter("@P_IM_DIRECT_COST_OUT", NNumber.class);
			cmd.addParameter("@P_IM_EFC_AMT_OUT", NNumber.class);
			cmd.addParameter("@P_IM_GROSS_NEED_OUT", NNumber.class);
			cmd.addParameter("@P_IM_EXCESS_EFC_AMT_OUT", NNumber.class);
			cmd.addParameter("@P_IM_UNMET_NEED_OUT", NNumber.class);
				
			cmd.execute();
			pBudgetAmtOut.val = cmd.getParameterValue("@P_BUDGET_AMT_OUT", NNumber.class);
			pResourceAmtOut.val = cmd.getParameterValue("@P_RESOURCE_AMT_OUT", NNumber.class);
			pReplaceEfcAmtOut.val = cmd.getParameterValue("@P_REPLACE_EFC_AMT_OUT", NNumber.class);
			pReduceNeedAmtOut.val = cmd.getParameterValue("@P_REDUCE_NEED_AMT_OUT", NNumber.class);
			pEfcIndOut.val = cmd.getParameterValue("@P_EFC_IND_OUT", NString.class);
			pEfcAmtOut.val = cmd.getParameterValue("@P_EFC_AMT_OUT", NNumber.class);
			pFmBudgetAmountOut.val = cmd.getParameterValue("@P_FM_BUDGET_AMOUNT_OUT", NNumber.class);
			pFmDirectCostOut.val = cmd.getParameterValue("@P_FM_DIRECT_COST_OUT", NNumber.class);
			pFmEfcAmtOut.val = cmd.getParameterValue("@P_FM_EFC_AMT_OUT", NNumber.class);
			pGrossNeedOut.val = cmd.getParameterValue("@P_GROSS_NEED_OUT", NNumber.class);
			pExcessEfcAmtOut.val = cmd.getParameterValue("@P_EXCESS_EFC_AMT_OUT", NNumber.class);
			pUnmetNeedOut.val = cmd.getParameterValue("@P_UNMET_NEED_OUT", NNumber.class);
			pImBudgetAmountOut.val = cmd.getParameterValue("@P_IM_BUDGET_AMOUNT_OUT", NNumber.class);
			pImDirectCostOut.val = cmd.getParameterValue("@P_IM_DIRECT_COST_OUT", NNumber.class);
			pImEfcAmtOut.val = cmd.getParameterValue("@P_IM_EFC_AMT_OUT", NNumber.class);
			pImGrossNeedOut.val = cmd.getParameterValue("@P_IM_GROSS_NEED_OUT", NNumber.class);
			pImExcessEfcAmtOut.val = cmd.getParameterValue("@P_IM_EXCESS_EFC_AMT_OUT", NNumber.class);
			pImUnmetNeedOut.val = cmd.getParameterValue("@P_IM_UNMET_NEED_OUT", NNumber.class);


		}
		
		public static void pMaintainAwardAmounts(NString pAidyCode,NString pOrigAwardStatus,NNumber pOrigOfferAmt,NDate pOrigOfferDate,NNumber pOrigAcceptAmt,NDate pOrigAcceptDate,NString pNewAwardStatus,Ref<NNumber> pNewOfferAmtInout,Ref<NDate> pNewOfferDateInout,Ref<NDate> pNewOfferExpDateInout,Ref<NNumber> pNewAcceptAmtInout,Ref<NDate> pNewAcceptDateInout,Ref<NNumber> pNewCancelAmtInout,Ref<NDate> pNewCancelDateInout,Ref<NNumber> pNewDeclineAmtInout,Ref<NDate> pNewDeclineDateInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RPKAWRD.P_MAINTAIN_AWARD_AMOUNTS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_ORIG_AWARD_STATUS", pOrigAwardStatus);
			cmd.addParameter("@P_ORIG_OFFER_AMT", pOrigOfferAmt);
			cmd.addParameter("@P_ORIG_OFFER_DATE", pOrigOfferDate);
			cmd.addParameter("@P_ORIG_ACCEPT_AMT", pOrigAcceptAmt);
			cmd.addParameter("@P_ORIG_ACCEPT_DATE", pOrigAcceptDate);
			cmd.addParameter("@P_NEW_AWARD_STATUS", pNewAwardStatus);
			cmd.addParameter("@P_NEW_OFFER_AMT_INOUT", pNewOfferAmtInout, true);
			cmd.addParameter("@P_NEW_OFFER_DATE_INOUT", pNewOfferDateInout, true);
			cmd.addParameter("@P_NEW_OFFER_EXP_DATE_INOUT", pNewOfferExpDateInout, true);
			cmd.addParameter("@P_NEW_ACCEPT_AMT_INOUT", pNewAcceptAmtInout, true);
			cmd.addParameter("@P_NEW_ACCEPT_DATE_INOUT", pNewAcceptDateInout, true);
			cmd.addParameter("@P_NEW_CANCEL_AMT_INOUT", pNewCancelAmtInout, true);
			cmd.addParameter("@P_NEW_CANCEL_DATE_INOUT", pNewCancelDateInout, true);
			cmd.addParameter("@P_NEW_DECLINE_AMT_INOUT", pNewDeclineAmtInout, true);
			cmd.addParameter("@P_NEW_DECLINE_DATE_INOUT", pNewDeclineDateInout, true);
				
			cmd.execute();
			pNewOfferAmtInout.val = cmd.getParameterValue("@P_NEW_OFFER_AMT_INOUT", NNumber.class);
			pNewOfferDateInout.val = cmd.getParameterValue("@P_NEW_OFFER_DATE_INOUT", NDate.class);
			pNewOfferExpDateInout.val = cmd.getParameterValue("@P_NEW_OFFER_EXP_DATE_INOUT", NDate.class);
			pNewAcceptAmtInout.val = cmd.getParameterValue("@P_NEW_ACCEPT_AMT_INOUT", NNumber.class);
			pNewAcceptDateInout.val = cmd.getParameterValue("@P_NEW_ACCEPT_DATE_INOUT", NDate.class);
			pNewCancelAmtInout.val = cmd.getParameterValue("@P_NEW_CANCEL_AMT_INOUT", NNumber.class);
			pNewCancelDateInout.val = cmd.getParameterValue("@P_NEW_CANCEL_DATE_INOUT", NDate.class);
			pNewDeclineAmtInout.val = cmd.getParameterValue("@P_NEW_DECLINE_AMT_INOUT", NNumber.class);
			pNewDeclineDateInout.val = cmd.getParameterValue("@P_NEW_DECLINE_DATE_INOUT", NDate.class);


		}
		
		public static void pMaintainAwardTotals(Ref<RbAward.AwardRecRow> pAwardRecInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RPKAWRD.P_MAINTAIN_AWARD_TOTALS", DbManager.getDataBaseFactory());
			
			cmd.addParameter(DbTypes.createStructType("P_AWARD_REC_INOUT", pAwardRecInout.val, RbAward.AwardRecRow.class, true));
				
			cmd.execute();
			pAwardRecInout.val = cmd.getParameterValue("@P_AWARD_REC_INOUT", RbAward.AwardRecRow.class);


		}
		
		public static void pMaintainFundTotals(RbAward.AwardRecRow pNewAwardRec,RbAward.AwardRecRow pOldAwardRec,NString pInsufficientSw,NNumber pInsufficientAmt,NString pCreateSw,Ref<FundRecRow> pFundRecInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RPKAWRD.P_MAINTAIN_FUND_TOTALS", DbManager.getDataBaseFactory());
			
			cmd.addParameter(DbTypes.createStructType("P_NEW_AWARD_REC", pNewAwardRec, RbAward.AwardRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("P_OLD_AWARD_REC", pOldAwardRec, RbAward.AwardRecRow.class ));
			cmd.addParameter("@P_INSUFFICIENT_SW", pInsufficientSw);
			cmd.addParameter("@P_INSUFFICIENT_AMT", pInsufficientAmt);
			cmd.addParameter("@P_CREATE_SW", pCreateSw);
			cmd.addParameter(DbTypes.createStructType("P_FUND_REC_INOUT", pFundRecInout.val, FundRecRow.class, true));
				
			cmd.execute();
			pFundRecInout.val = cmd.getParameterValue("@P_FUND_REC_INOUT", FundRecRow.class);


		}
		
		public static void pUpdatePromNote(NString pAidyCode,NNumber pPidm,NString pFundCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RPKAWRD.P_UPDATE_PROM_NOTE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
				
			cmd.execute();


		}
		
		public static void pUpdateRfraspc(FundRecRow pFundRec) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RPKAWRD.P_UPDATE_RFRASPC", DbManager.getDataBaseFactory());
			
			cmd.addParameter(DbTypes.createStructType("P_FUND_REC", pFundRec, FundRecRow.class ));
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="FundRecRow", dataSourceName="FUND_REC")
	public static class FundRecRow
	{
		@DbRecordField(dataSourceName="R_AIDY_CODE")
		public NString RAidyCode;
		@DbRecordField(dataSourceName="R_FUND_CODE")
		public NString RFundCode;
		@DbRecordField(dataSourceName="R_AUTO_SCHED_IND")
		public NString RAutoSchedInd;
		@DbRecordField(dataSourceName="R_DISBURSE_IND")
		public NString RDisburseInd;
		@DbRecordField(dataSourceName="R_ROUND_SCHED_IND")
		public NString RRoundSchedInd;
		@DbRecordField(dataSourceName="R_LOAN_PROCESS_IND")
		public NString RLoanProcessInd;
		@DbRecordField(dataSourceName="R_INSUFFICIENT_NO")
		public NNumber RInsufficientNo;
		@DbRecordField(dataSourceName="R_INSUFFICIENT_AMT")
		public NNumber RInsufficientAmt;
		@DbRecordField(dataSourceName="R_ORIG_OFFER_NO")
		public NNumber ROrigOfferNo;
		@DbRecordField(dataSourceName="R_ORIG_OFFER_AMT")
		public NNumber ROrigOfferAmt;
		@DbRecordField(dataSourceName="R_OFFER_NO")
		public NNumber ROfferNo;
		@DbRecordField(dataSourceName="R_OFFER_AMT")
		public NNumber ROfferAmt;
		@DbRecordField(dataSourceName="R_ACCEPT_NO")
		public NNumber RAcceptNo;
		@DbRecordField(dataSourceName="R_ACCEPT_AMT")
		public NNumber RAcceptAmt;
		@DbRecordField(dataSourceName="R_DECLINE_NO")
		public NNumber RDeclineNo;
		@DbRecordField(dataSourceName="R_DECLINE_AMT")
		public NNumber RDeclineAmt;
		@DbRecordField(dataSourceName="R_CANCEL_NO")
		public NNumber RCancelNo;
		@DbRecordField(dataSourceName="R_CANCEL_AMT")
		public NNumber RCancelAmt;
		@DbRecordField(dataSourceName="R_AUTHORIZE_NO")
		public NNumber RAuthorizeNo;
		@DbRecordField(dataSourceName="R_AUTHORIZE_AMT")
		public NNumber RAuthorizeAmt;
		@DbRecordField(dataSourceName="R_MEMO_NO")
		public NNumber RMemoNo;
		@DbRecordField(dataSourceName="R_MEMO_AMT")
		public NNumber RMemoAmt;
		@DbRecordField(dataSourceName="R_PAID_NO")
		public NNumber RPaidNo;
		@DbRecordField(dataSourceName="R_PAID_AMT")
		public NNumber RPaidAmt;
		@DbRecordField(dataSourceName="R_LOAN_FEE_PCT")
		public NNumber RLoanFeePct;
		@DbRecordField(dataSourceName="R_PROM_REQ_IND")
		public NString RPromReqInd;
		@DbRecordField(dataSourceName="R_AWD_CHG_LTR_IND")
		public NString RAwdChgLtrInd;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
