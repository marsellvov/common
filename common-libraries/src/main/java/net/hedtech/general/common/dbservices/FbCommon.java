package net.hedtech.general.common.dbservices;

import java.util.*;

import net.hedtech.general.common.dbservices.dbtypes.GxrdirdRow;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class FbCommon {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_COMMON.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NBool fCheckRunInProgress() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_COMMON.F_CHECK_RUN_IN_PROGRESS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NString fGetBaseCurrency() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_COMMON.F_GET_BASE_CURRENCY", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetGjbprunValue(NString pGjbprunJob,NNumber pGjbprunOneUpNo,NString pGjbprunNumber) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_COMMON.F_GET_GJBPRUN_VALUE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_GJBPRUN_JOB", pGjbprunJob);
			cmd.addParameter("@P_GJBPRUN_ONE_UP_NO", pGjbprunOneUpNo);
			cmd.addParameter("@P_GJBPRUN_NUMBER", pGjbprunNumber);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static GxrdirdRow fGetVendDirectDeposit(NNumber pVendPidm,NString pAtypCode,NNumber pAtypSeqNum) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_COMMON.F_GET_VEND_DIRECT_DEPOSIT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(GxrdirdRow.class);
			cmd.addParameter("@P_VEND_PIDM", pVendPidm);
			cmd.addParameter("@P_ATYP_CODE", pAtypCode);
			cmd.addParameter("@P_ATYP_SEQ_NUM", pAtypSeqNum);
				
			cmd.execute();
			
			return cmd.getReturnValue(GxrdirdRow.class);


		}
		
		public static NString fGetVendorApAchStatus(NNumber pVendPidm,NString pAtypCode,NNumber pAtypSeqNum) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_COMMON.F_GET_VENDOR_AP_ACH_STATUS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_VEND_PIDM", pVendPidm);
			cmd.addParameter("@P_ATYP_CODE", pAtypCode);
			cmd.addParameter("@P_ATYP_SEQ_NUM", pAtypSeqNum);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsBankCodeValid(NString pBankCode,NDate pTransDate,NString pCoasCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_COMMON.F_IS_BANK_CODE_VALID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_BANK_CODE", pBankCode);
			cmd.addParameter("@P_TRANS_DATE", pTransDate);
			cmd.addParameter("@P_COAS_CODE", pCoasCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsDocPosted(NString pDocCode,NNumber pDocSeqCode,NNumber pItemNum,NNumber pSeqNum,NNumber pSubmissionNumber,NString pReversalInd,NNumber pSerialNum) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_COMMON.F_IS_DOC_POSTED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_DOC_CODE", pDocCode);
			cmd.addParameter("@P_DOC_SEQ_CODE", pDocSeqCode);
			cmd.addParameter("@P_ITEM_NUM", pItemNum);
			cmd.addParameter("@P_SEQ_NUM", pSeqNum);
			cmd.addParameter("@P_SUBMISSION_NUMBER", pSubmissionNumber);
			cmd.addParameter("@P_REVERSAL_IND", pReversalInd);
			cmd.addParameter("@P_SERIAL_NUM", pSerialNum);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsEncRolled(NString pCoasCode,NString pFsyrCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_COMMON.F_IS_ENC_ROLLED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_COAS_CODE", pCoasCode);
			cmd.addParameter("@P_FSYR_CODE", pFsyrCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fSetUnspecified(NString pOldValue,NString pNewValue) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_COMMON.F_SET_UNSPECIFIED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_OLD_VALUE", pOldValue);
			cmd.addParameter("@P_NEW_VALUE", pNewValue);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber fSetUnspecified(NNumber pOldValue,NNumber pNewValue) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_COMMON.F_SET_UNSPECIFIED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_OLD_VALUE", pOldValue);
			cmd.addParameter("@P_NEW_VALUE", pNewValue);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NDate fSetUnspecified(NDate pOldValue,NDate pNewValue) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_COMMON.F_SET_UNSPECIFIED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NDate.class);
			cmd.addParameter("@P_OLD_VALUE", pOldValue);
			cmd.addParameter("@P_NEW_VALUE", pNewValue);
				
			cmd.execute();

			return cmd.getReturnValue(NDate.class);

		}
		
		public static void pCalcConvertAmts(NNumber pUnitPrice,NNumber pDiscAmt,NNumber pAddlAmt,NNumber pTaxAmt,Ref<NNumber> pConvertUnitPrice,Ref<NNumber> pConvertDiscAmt,Ref<NNumber> pConvertAddlAmt,Ref<NNumber> pConvertTaxAmt,NString pCurrCode,NDate pTransDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_COMMON.P_CALC_CONVERT_AMTS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_UNIT_PRICE", pUnitPrice);
			cmd.addParameter("@P_DISC_AMT", pDiscAmt);
			cmd.addParameter("@P_ADDL_AMT", pAddlAmt);
			cmd.addParameter("@P_TAX_AMT", pTaxAmt);
			cmd.addParameter("@P_CONVERT_UNIT_PRICE", NNumber.class);
			cmd.addParameter("@P_CONVERT_DISC_AMT", NNumber.class);
			cmd.addParameter("@P_CONVERT_ADDL_AMT", NNumber.class);
			cmd.addParameter("@P_CONVERT_TAX_AMT", NNumber.class);
			cmd.addParameter("@P_CURR_CODE", pCurrCode);
			cmd.addParameter("@P_TRANS_DATE", pTransDate);
				
			cmd.execute();
			pConvertUnitPrice.val = cmd.getParameterValue("@P_CONVERT_UNIT_PRICE", NNumber.class);
			pConvertDiscAmt.val = cmd.getParameterValue("@P_CONVERT_DISC_AMT", NNumber.class);
			pConvertAddlAmt.val = cmd.getParameterValue("@P_CONVERT_ADDL_AMT", NNumber.class);
			pConvertTaxAmt.val = cmd.getParameterValue("@P_CONVERT_TAX_AMT", NNumber.class);


		}
		
		public static void pCalcPctAmt(Ref<NNumber> pPct,Ref<NNumber> pAmt,Ref<NString> pErrorOut,NNumber pTotalAmt,NNumber pRoundPctTo,NNumber pRoundAmtTo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_COMMON.P_CALC_PCT_AMT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PCT", pPct, true);
			cmd.addParameter("@P_AMT", pAmt, true);
			cmd.addParameter("@P_ERROR_OUT", NString.class);
			cmd.addParameter("@P_TOTAL_AMT", pTotalAmt);
			cmd.addParameter("@P_ROUND_PCT_TO", pRoundPctTo);
			cmd.addParameter("@P_ROUND_AMT_TO", pRoundAmtTo);
				
			cmd.execute();
			pPct.val = cmd.getParameterValue("@P_PCT", NNumber.class);
			pAmt.val = cmd.getParameterValue("@P_AMT", NNumber.class);
			pErrorOut.val = cmd.getParameterValue("@P_ERROR_OUT", NString.class);


		}
		
		public static void pCalcPctAmt(Ref<NNumber> pApprPct,Ref<NNumber> pApprAmt,Ref<NNumber> pDiscPct,Ref<NNumber> pDiscAmt,Ref<NNumber> pAddlPct,Ref<NNumber> pAddlAmt,Ref<NNumber> pTaxPct,Ref<NNumber> pTaxAmt,Ref<NString> pErrorOut,NNumber pTotalAppr,NNumber pTotalDisc,NNumber pTotalAddl,NNumber pTotalTax,NNumber pRoundPctTo,NNumber pRoundAmtTo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_COMMON.P_CALC_PCT_AMT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_APPR_PCT", pApprPct, true);
			cmd.addParameter("@P_APPR_AMT", pApprAmt, true);
			cmd.addParameter("@P_DISC_PCT", pDiscPct, true);
			cmd.addParameter("@P_DISC_AMT", pDiscAmt, true);
			cmd.addParameter("@P_ADDL_PCT", pAddlPct, true);
			cmd.addParameter("@P_ADDL_AMT", pAddlAmt, true);
			cmd.addParameter("@P_TAX_PCT", pTaxPct, true);
			cmd.addParameter("@P_TAX_AMT", pTaxAmt, true);
			cmd.addParameter("@P_ERROR_OUT", NString.class);
			cmd.addParameter("@P_TOTAL_APPR", pTotalAppr);
			cmd.addParameter("@P_TOTAL_DISC", pTotalDisc);
			cmd.addParameter("@P_TOTAL_ADDL", pTotalAddl);
			cmd.addParameter("@P_TOTAL_TAX", pTotalTax);
			cmd.addParameter("@P_ROUND_PCT_TO", pRoundPctTo);
			cmd.addParameter("@P_ROUND_AMT_TO", pRoundAmtTo);
				
			cmd.execute();
			pApprPct.val = cmd.getParameterValue("@P_APPR_PCT", NNumber.class);
			pApprAmt.val = cmd.getParameterValue("@P_APPR_AMT", NNumber.class);
			pDiscPct.val = cmd.getParameterValue("@P_DISC_PCT", NNumber.class);
			pDiscAmt.val = cmd.getParameterValue("@P_DISC_AMT", NNumber.class);
			pAddlPct.val = cmd.getParameterValue("@P_ADDL_PCT", NNumber.class);
			pAddlAmt.val = cmd.getParameterValue("@P_ADDL_AMT", NNumber.class);
			pTaxPct.val = cmd.getParameterValue("@P_TAX_PCT", NNumber.class);
			pTaxAmt.val = cmd.getParameterValue("@P_TAX_AMT", NNumber.class);
			pErrorOut.val = cmd.getParameterValue("@P_ERROR_OUT", NString.class);


		}
		
//		public static void pRaiseError(List<ErrTabtypeRow> pErrTab) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_COMMON.P_RAISE_ERROR", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("P_ERR_TAB", "", pErrTab, object.class));
//				
//			cmd.execute();
//
//
//		}
		
	
	
	@DbRecordType(id="ErrRectypeRow", dataSourceName="ERR_RECTYPE")
	public static class ErrRectypeRow
	{
		@DbRecordField(dataSourceName="R_EDIT_FIELD")
		public NString REditField;
		@DbRecordField(dataSourceName="R_EDIT_SEQ_NUM")
		public NNumber REditSeqNum;
		@DbRecordField(dataSourceName="R_EDIT_CODE")
		public NString REditCode;
		@DbRecordField(dataSourceName="R_ERR_DESC")
		public NString RErrDesc;
		@DbRecordField(dataSourceName="R_ERROR_MESSAGE")
		public NString RErrorMessage;
	}

	
	@DbRecordType(id="FinanceRectypeRow", dataSourceName="FINANCE_RECTYPE")
	public static class FinanceRectypeRow
	{
		@DbRecordField(dataSourceName="R_RUCL_CODE")
		public NString RRuclCode;
		@DbRecordField(dataSourceName="R_EFF_DATE")
		public NDate REffDate;
		@DbRecordField(dataSourceName="R_ACCI_CODE")
		public NString RAcciCode;
		@DbRecordField(dataSourceName="R_ACCRUAL_IND")
		public NString RAccrualInd;
		@DbRecordField(dataSourceName="R_ACCT_CODE")
		public NString RAcctCode;
		@DbRecordField(dataSourceName="R_ACTIVITY_DATE")
		public NDate RActivityDate;
		@DbRecordField(dataSourceName="R_ACTV_CODE")
		public NString RActvCode;
		@DbRecordField(dataSourceName="R_AUTO_JRNL_ID")
		public NString RAutoJrnlId;
		@DbRecordField(dataSourceName="R_BANK_CODE")
		public NString RBankCode;
		@DbRecordField(dataSourceName="R_BUDGET_PERIOD")
		public NString RBudgetPeriod;
		@DbRecordField(dataSourceName="R_BUD_DISPN")
		public NString RBudDispn;
		@DbRecordField(dataSourceName="R_BUD_ID")
		public NString RBudId;
		@DbRecordField(dataSourceName="R_CHECK_USER_AUTH")
		public NString RCheckUserAuth;
		@DbRecordField(dataSourceName="R_CMT_PCT")
		public NNumber RCmtPct;
		@DbRecordField(dataSourceName="R_CMT_TYPE")
		public NString RCmtType;
		@DbRecordField(dataSourceName="R_COAS_CODE")
		public NString RCoasCode;
		@DbRecordField(dataSourceName="R_CURR_CODE")
		public NString RCurrCode;
		@DbRecordField(dataSourceName="R_DEP_NUM")
		public NString RDepNum;
		@DbRecordField(dataSourceName="R_DIST_PCT")
		public NNumber RDistPct;
		@DbRecordField(dataSourceName="R_DOC_CODE")
		public NString RDocCode;
		@DbRecordField(dataSourceName="R_DOC_SEQ_CODE")
		public NNumber RDocSeqCode;
		@DbRecordField(dataSourceName="R_DOC_REF_NUM")
		public NString RDocRefNum;
		@DbRecordField(dataSourceName="R_DR_CR_IND")
		public NString RDrCrInd;
		@DbRecordField(dataSourceName="R_ENCB_ACTION_IND")
		public NString REncbActionInd;
		@DbRecordField(dataSourceName="R_ENCB_NUM")
		public NString REncbNum;
		@DbRecordField(dataSourceName="R_ENCB_TYPE")
		public NString REncbType;
		@DbRecordField(dataSourceName="R_ENCD_ITEM_NUM")
		public NNumber REncdItemNum;
		@DbRecordField(dataSourceName="R_ENCD_SEQ_NUM")
		public NNumber REncdSeqNum;
		@DbRecordField(dataSourceName="R_FSYR_CODE")
		public NString RFsyrCode;
		@DbRecordField(dataSourceName="R_FUND_CODE")
		public NString RFundCode;
		@DbRecordField(dataSourceName="R_ITEM_NUM")
		public NNumber RItemNum;
		@DbRecordField(dataSourceName="R_LOCN_CODE")
		public NString RLocnCode;
		@DbRecordField(dataSourceName="R_ORGN_CODE")
		public NString ROrgnCode;
		@DbRecordField(dataSourceName="R_POSTING_PERIOD")
		public NString RPostingPeriod;
		@DbRecordField(dataSourceName="R_PRJD_CODE")
		public NString RPrjdCode;
		@DbRecordField(dataSourceName="R_PROG_CODE")
		public NString RProgCode;
		@DbRecordField(dataSourceName="R_REVERSAL_IND")
		public NString RReversalInd;
		@DbRecordField(dataSourceName="R_SEQ_NUM")
		public NNumber RSeqNum;
		@DbRecordField(dataSourceName="R_STATUS_IND")
		public NString RStatusInd;
		@DbRecordField(dataSourceName="R_SUBMISSION_NUMBER")
		public NNumber RSubmissionNumber;
		@DbRecordField(dataSourceName="R_TRANS_AMT")
		public NNumber RTransAmt;
		@DbRecordField(dataSourceName="R_TRANS_DATE")
		public NDate RTransDate;
		@DbRecordField(dataSourceName="R_TRANS_DESC")
		public NString RTransDesc;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_VENDOR_PIDM")
		public NNumber RVendorPidm;
	}

	
	
}
