package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class FbInvoiceAcctgRules {
		public static NString fGetCommitmentType(NString pPohdCode,NNumber pPoItem,NNumber pSeqNum) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_INVOICE_ACCTG_RULES.F_GET_COMMITMENT_TYPE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_POHD_CODE", pPohdCode);
			cmd.addParameter("@P_PO_ITEM", pPoItem);
			cmd.addParameter("@P_SEQ_NUM", pSeqNum);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetLiquidationType(NString pPohdCode,NString pPartPmtInd,NString pSingleAcctgInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_INVOICE_ACCTG_RULES.F_GET_LIQUIDATION_TYPE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_POHD_CODE", pPohdCode);
			cmd.addParameter("@P_PART_PMT_IND", pPartPmtInd);
			cmd.addParameter("@P_SINGLE_ACCTG_IND", pSingleAcctgInd);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_INVOICE_ACCTG_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NString pInvhCode,NString pPohdCode,NNumber pItem,NNumber pPoItem,NNumber pSeqNum,NString pUserId,NString pFsyrCode,NString pPeriod,NString pEoyAccrStatusInd,NString pRuclCode,NString pDiscRuclCode,NString pTaxRuclCode,NString pAddlRuclCode,NString pCoasCode,NString pAcciCode,NString pFundCode,NString pOrgnCode,NString pAcctCode,NString pProgCode,NString pActvCode,NString pLocnCode,NString pBankCode,NNumber pInvdAmt,NNumber pDiscAmt,NNumber pTaxAmt,NNumber pAddlChrgAmt,NNumber pApprAmt,NNumber pPrevPaidAmt,NString pNsfOverrideInd,NNumber pItypSeqCode,NString pProjCode,NString pSuspInd,NString pNsfSuspInd,NString pPartialLiqInd,NString pApprInd,NString pOpenPaidInd,NNumber pConvertAmt,NNumber pConvertDiscAmt,NNumber pConvertTaxAmt,NNumber pConvertAddlChrgAmt,NNumber pApprAmtPct,NNumber pDiscAmtPct,NNumber pAddlAmtPct,NNumber pTaxAmtPct,NNumber pCapAmt,NString pDataOrigin,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_INVOICE_ACCTG_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INVH_CODE", pInvhCode);
			cmd.addParameter("@P_POHD_CODE", pPohdCode);
			cmd.addParameter("@P_ITEM", pItem);
			cmd.addParameter("@P_PO_ITEM", pPoItem);
			cmd.addParameter("@P_SEQ_NUM", pSeqNum);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_FSYR_CODE", pFsyrCode);
			cmd.addParameter("@P_PERIOD", pPeriod);
			cmd.addParameter("@P_EOY_ACCR_STATUS_IND", pEoyAccrStatusInd);
			cmd.addParameter("@P_RUCL_CODE", pRuclCode);
			cmd.addParameter("@P_DISC_RUCL_CODE", pDiscRuclCode);
			cmd.addParameter("@P_TAX_RUCL_CODE", pTaxRuclCode);
			cmd.addParameter("@P_ADDL_RUCL_CODE", pAddlRuclCode);
			cmd.addParameter("@P_COAS_CODE", pCoasCode);
			cmd.addParameter("@P_ACCI_CODE", pAcciCode);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_ORGN_CODE", pOrgnCode);
			cmd.addParameter("@P_ACCT_CODE", pAcctCode);
			cmd.addParameter("@P_PROG_CODE", pProgCode);
			cmd.addParameter("@P_ACTV_CODE", pActvCode);
			cmd.addParameter("@P_LOCN_CODE", pLocnCode);
			cmd.addParameter("@P_BANK_CODE", pBankCode);
			cmd.addParameter("@P_INVD_AMT", pInvdAmt);
			cmd.addParameter("@P_DISC_AMT", pDiscAmt);
			cmd.addParameter("@P_TAX_AMT", pTaxAmt);
			cmd.addParameter("@P_ADDL_CHRG_AMT", pAddlChrgAmt);
			cmd.addParameter("@P_APPR_AMT", pApprAmt);
			cmd.addParameter("@P_PREV_PAID_AMT", pPrevPaidAmt);
			cmd.addParameter("@P_NSF_OVERRIDE_IND", pNsfOverrideInd);
			cmd.addParameter("@P_ITYP_SEQ_CODE", pItypSeqCode);
			cmd.addParameter("@P_PROJ_CODE", pProjCode);
			cmd.addParameter("@P_SUSP_IND", pSuspInd);
			cmd.addParameter("@P_NSF_SUSP_IND", pNsfSuspInd);
			cmd.addParameter("@P_PARTIAL_LIQ_IND", pPartialLiqInd);
			cmd.addParameter("@P_APPR_IND", pApprInd);
			cmd.addParameter("@P_OPEN_PAID_IND", pOpenPaidInd);
			cmd.addParameter("@P_CONVERT_AMT", pConvertAmt);
			cmd.addParameter("@P_CONVERT_DISC_AMT", pConvertDiscAmt);
			cmd.addParameter("@P_CONVERT_TAX_AMT", pConvertTaxAmt);
			cmd.addParameter("@P_CONVERT_ADDL_CHRG_AMT", pConvertAddlChrgAmt);
			cmd.addParameter("@P_APPR_AMT_PCT", pApprAmtPct);
			cmd.addParameter("@P_DISC_AMT_PCT", pDiscAmtPct);
			cmd.addParameter("@P_ADDL_AMT_PCT", pAddlAmtPct);
			cmd.addParameter("@P_TAX_AMT_PCT", pTaxAmtPct);
			cmd.addParameter("@P_CAP_AMT", pCapAmt);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidCreate(FbInvoiceAcctg.InvoiceAcctgRecRow pAcctgIn,Ref<FbInvoiceAcctg.InvoiceAcctgRecRow> pAcctgOut,Ref<NString> pErrorMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_INVOICE_ACCTG_RULES.P_VALID_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter(DbTypes.createStructType("P_ACCTG_IN", pAcctgIn, FbInvoiceAcctg.InvoiceAcctgRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("P_ACCTG_OUT", pAcctgOut.val, FbInvoiceAcctg.InvoiceAcctgRecRow.class));
			cmd.addParameter("@P_ERROR_MSG_OUT", NString.class);
				
			cmd.execute();
			pAcctgOut.val = cmd.getParameterValue("@P_ACCTG_OUT", FbInvoiceAcctg.InvoiceAcctgRecRow.class);
			pErrorMsgOut.val = cmd.getParameterValue("@P_ERROR_MSG_OUT", NString.class);


		}
		
		public static void pValidDelete(NString pInvhCode,NNumber pItem,NNumber pSeqNum,NString pUserId,Ref<NString> pRowidInout,Ref<NString> pErrorMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_INVOICE_ACCTG_RULES.P_VALID_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_INVH_CODE", pInvhCode);
			cmd.addParameter("@P_ITEM", pItem);
			cmd.addParameter("@P_SEQ_NUM", pSeqNum);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
			cmd.addParameter("@P_ERROR_MSG_OUT", NString.class);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);
			pErrorMsgOut.val = cmd.getParameterValue("@P_ERROR_MSG_OUT", NString.class);


		}
		
		public static void pValidUpdate(Ref<FbInvoiceAcctg.InvoiceAcctgRecRow> pAcctgRecInout,FbInvoiceAcctg.InvoiceAcctgRecRow pExistingRec,Ref<NString> pErrorMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_INVOICE_ACCTG_RULES.P_VALID_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter(DbTypes.createStructType("P_ACCTG_REC_INOUT", pAcctgRecInout.val, FbInvoiceAcctg.InvoiceAcctgRecRow.class, true));
			cmd.addParameter(DbTypes.createStructType("P_EXISTING_REC", pExistingRec, FbInvoiceAcctg.InvoiceAcctgRecRow.class ));
			cmd.addParameter("@P_ERROR_MSG_OUT", NString.class);
				
			cmd.execute();
			pAcctgRecInout.val = cmd.getParameterValue("@P_ACCTG_REC_INOUT", FbInvoiceAcctg.InvoiceAcctgRecRow.class);
			pErrorMsgOut.val = cmd.getParameterValue("@P_ERROR_MSG_OUT", NString.class);


		}
		
		public static void pValidateMandatory(NString pInvhCode,NNumber pItem,NNumber pSeqNum,NString pUserId,NString pRuclCode,NString pSuspInd,NString pNsfSuspInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_INVOICE_ACCTG_RULES.P_VALIDATE_MANDATORY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_INVH_CODE", pInvhCode);
			cmd.addParameter("@P_ITEM", pItem);
			cmd.addParameter("@P_SEQ_NUM", pSeqNum);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_RUCL_CODE", pRuclCode);
			cmd.addParameter("@P_SUSP_IND", pSuspInd);
			cmd.addParameter("@P_NSF_SUSP_IND", pNsfSuspInd);
				
			cmd.execute();


		}
		
	
	
	
}
