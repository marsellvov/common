package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class FvInvoice {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FV_INVOICE.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NString pCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FV_INVOICE.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_CODE", pCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fInvoiceHasPermTag(NString pInvCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FV_INVOICE.F_INVOICE_HAS_PERM_TAG", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_INV_CODE", pInvCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pCancel(NString pCode,NDate pCancelDate,NString pReestablishPayable,NString pCancelCode,NString pUserId,NString pDataOrigin,Ref<NString> pCancelMesgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FV_INVOICE.P_CANCEL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CODE", pCode);
			cmd.addParameter("@P_CANCEL_DATE", pCancelDate);
			cmd.addParameter("@P_REESTABLISH_PAYABLE", pReestablishPayable);
			cmd.addParameter("@P_CANCEL_CODE", pCancelCode);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_CANCEL_MESG_OUT", NString.class);
				
			cmd.execute();
			pCancelMesgOut.val = cmd.getParameterValue("@P_CANCEL_MESG_OUT", NString.class);


		}
		
		public static void pComplete(NString pCode,NString pUserId,NString pCompletionInd,Ref<NString> pSuccessMsgOut,Ref<NString> pErrorMsgOut,Ref<NString> pWarnMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FV_INVOICE.P_COMPLETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CODE", pCode);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_COMPLETION_IND", pCompletionInd);
			cmd.addParameter("@P_SUCCESS_MSG_OUT", NString.class);
			cmd.addParameter("@P_ERROR_MSG_OUT", NString.class);
			cmd.addParameter("@P_WARN_MSG_OUT", NString.class);
				
			cmd.execute();
			pSuccessMsgOut.val = cmd.getParameterValue("@P_SUCCESS_MSG_OUT", NString.class);
			pErrorMsgOut.val = cmd.getParameterValue("@P_ERROR_MSG_OUT", NString.class);
			pWarnMsgOut.val = cmd.getParameterValue("@P_WARN_MSG_OUT", NString.class);


		}
		
		public static void pCopy(NString pCodeFrom,Ref<NString> pCodeToInout,NString pUserIdTo,NDate pTransDateTo,NDate pInvoiceDateTo,NDate pPmtDueDateTo,NString pDataOriginTo,NString pInvoicePrefixTypeTo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FV_INVOICE.P_COPY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CODE_FROM", pCodeFrom);
			cmd.addParameter("@P_CODE_TO_INOUT", pCodeToInout, true);
			cmd.addParameter("@P_USER_ID_TO", pUserIdTo);
			cmd.addParameter("@P_TRANS_DATE_TO", pTransDateTo);
			cmd.addParameter("@P_INVOICE_DATE_TO", pInvoiceDateTo);
			cmd.addParameter("@P_PMT_DUE_DATE_TO", pPmtDueDateTo);
			cmd.addParameter("@P_DATA_ORIGIN_TO", pDataOriginTo);
			cmd.addParameter("@P_INVOICE_PREFIX_TYPE_TO", pInvoicePrefixTypeTo);
				
			cmd.execute();
			pCodeToInout.val = cmd.getParameterValue("@P_CODE_TO_INOUT", NString.class);


		}
		
		public static void pCopyAcctgVic(NString pInvhCode,NString pPohdCode,NNumber pItem,NNumber pPoItem,NString pUserId,NString pDataOrigin) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FV_INVOICE.P_COPY_ACCTG_VIC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_INVH_CODE", pInvhCode);
			cmd.addParameter("@P_POHD_CODE", pPohdCode);
			cmd.addParameter("@P_ITEM", pItem);
			cmd.addParameter("@P_PO_ITEM", pPoItem);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
				
			cmd.execute();


		}
		
		public static void pCopyEncItemAcctg(NString pInvoiceCode,NString pUserId,NString pDataOrigin) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FV_INVOICE.P_COPY_ENC_ITEM_ACCTG", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_INVOICE_CODE", pInvoiceCode);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
				
			cmd.execute();


		}
		
		public static void pCopyPoItemAcctg(NString pInvhCode,NString pVendInvCode,NDate pVendInvDate,NString pUserId,NString pDataOrigin,NNumber pItem) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FV_INVOICE.P_COPY_PO_ITEM_ACCTG", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_INVH_CODE", pInvhCode);
			cmd.addParameter("@P_VEND_INV_CODE", pVendInvCode);
			cmd.addParameter("@P_VEND_INV_DATE", pVendInvDate);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ITEM", pItem);
				
			cmd.execute();


		}
		
		public static void pCreateInvoiceFromEnc(Ref<NString> pInvoiceCodeInout,NString pInvoicePrefixType,NString pEncumbranceCode,NNumber pVendPidm,NString pUserId,NString pVendInvCode,NDate pInvoiceDate,NDate pPmtDueDate,NDate pTransDate,NString pCrMemoInd,NString pAtypCode,NNumber pAtypSeqNum,NString pBankCode,NString pOneTimeVendName,NString pOneTimeHouseNumber,NString pOneTimeVendAddr1,NString pOneTimeVendAddr2,NString pOneTimeVendAddr3,NString pOneTimeVendAddr4,NString pOneTimeVendCity,NString pOneTimeVendState,NString pOneTimeVendZip,NString pOneTimeVendNatn,NString pDataOrigin,Ref<NString> pErrorMessageOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FV_INVOICE.P_CREATE_INVOICE_FROM_ENC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_INVOICE_CODE_INOUT", pInvoiceCodeInout, true);
			cmd.addParameter("@P_INVOICE_PREFIX_TYPE", pInvoicePrefixType);
			cmd.addParameter("@P_ENCUMBRANCE_CODE", pEncumbranceCode);
			cmd.addParameter("@P_VEND_PIDM", pVendPidm);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_VEND_INV_CODE", pVendInvCode);
			cmd.addParameter("@P_INVOICE_DATE", pInvoiceDate);
			cmd.addParameter("@P_PMT_DUE_DATE", pPmtDueDate);
			cmd.addParameter("@P_TRANS_DATE", pTransDate);
			cmd.addParameter("@P_CR_MEMO_IND", pCrMemoInd);
			cmd.addParameter("@P_ATYP_CODE", pAtypCode);
			cmd.addParameter("@P_ATYP_SEQ_NUM", pAtypSeqNum);
			cmd.addParameter("@P_BANK_CODE", pBankCode);
			cmd.addParameter("@P_ONE_TIME_VEND_NAME", pOneTimeVendName);
			cmd.addParameter("@P_ONE_TIME_HOUSE_NUMBER", pOneTimeHouseNumber);
			cmd.addParameter("@P_ONE_TIME_VEND_ADDR1", pOneTimeVendAddr1);
			cmd.addParameter("@P_ONE_TIME_VEND_ADDR2", pOneTimeVendAddr2);
			cmd.addParameter("@P_ONE_TIME_VEND_ADDR3", pOneTimeVendAddr3);
			cmd.addParameter("@P_ONE_TIME_VEND_ADDR4", pOneTimeVendAddr4);
			cmd.addParameter("@P_ONE_TIME_VEND_CITY", pOneTimeVendCity);
			cmd.addParameter("@P_ONE_TIME_VEND_STATE", pOneTimeVendState);
			cmd.addParameter("@P_ONE_TIME_VEND_ZIP", pOneTimeVendZip);
			cmd.addParameter("@P_ONE_TIME_VEND_NATN", pOneTimeVendNatn);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ERROR_MESSAGE_OUT", NString.class);
				
			cmd.execute();
			pInvoiceCodeInout.val = cmd.getParameterValue("@P_INVOICE_CODE_INOUT", NString.class);
			pErrorMessageOut.val = cmd.getParameterValue("@P_ERROR_MESSAGE_OUT", NString.class);


		}
		
		public static void pCreateInvoiceFromPo(Ref<NString> pInvoiceCodeInout,NString pInvoicePrefixType,NString pPohdCode,NString pUserId,NString pVendInvCode,NDate pInvoiceDate,NDate pPmtDueDate,NDate pTransDate,NString pCrMemoInd,NString pBankCode,NString pDataOrigin,Ref<NString> pErrorMessageOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FV_INVOICE.P_CREATE_INVOICE_FROM_PO", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_INVOICE_CODE_INOUT", pInvoiceCodeInout, true);
			cmd.addParameter("@P_INVOICE_PREFIX_TYPE", pInvoicePrefixType);
			cmd.addParameter("@P_POHD_CODE", pPohdCode);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_VEND_INV_CODE", pVendInvCode);
			cmd.addParameter("@P_INVOICE_DATE", pInvoiceDate);
			cmd.addParameter("@P_PMT_DUE_DATE", pPmtDueDate);
			cmd.addParameter("@P_TRANS_DATE", pTransDate);
			cmd.addParameter("@P_CR_MEMO_IND", pCrMemoInd);
			cmd.addParameter("@P_BANK_CODE", pBankCode);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ERROR_MESSAGE_OUT", NString.class);
				
			cmd.execute();
			pInvoiceCodeInout.val = cmd.getParameterValue("@P_INVOICE_CODE_INOUT", NString.class);
			pErrorMessageOut.val = cmd.getParameterValue("@P_ERROR_MESSAGE_OUT", NString.class);


		}
		
		public static void pCreatePcardInvoices(NString pSystemId,NDate pFeedSweepDate,NDate pTransDate,NString pBankCode,NString pDataOrigin,Ref<NString> pSuccessMesgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FV_INVOICE.P_CREATE_PCARD_INVOICES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SYSTEM_ID", pSystemId);
			cmd.addParameter("@P_FEED_SWEEP_DATE", pFeedSweepDate);
			cmd.addParameter("@P_TRANS_DATE", pTransDate);
			cmd.addParameter("@P_BANK_CODE", pBankCode);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_SUCCESS_MESG_OUT", NString.class);
				
			cmd.execute();
			pSuccessMesgOut.val = cmd.getParameterValue("@P_SUCCESS_MESG_OUT", NString.class);


		}
		
		public static void pCreateRefundInvoices(NString pBankCode,NString pDataOrigin,Ref<NString> pSuccessMesgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FV_INVOICE.P_CREATE_REFUND_INVOICES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_BANK_CODE", pBankCode);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_SUCCESS_MESG_OUT", NString.class);
				
			cmd.execute();
			pSuccessMesgOut.val = cmd.getParameterValue("@P_SUCCESS_MESG_OUT", NString.class);


		}
		
		public static void pDelete(NString pCode,NString pUserId,Ref<NString> pDeleteMesgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FV_INVOICE.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CODE", pCode);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DELETE_MESG_OUT", NString.class);
				
			cmd.execute();
			pDeleteMesgOut.val = cmd.getParameterValue("@P_DELETE_MESG_OUT", NString.class);


		}
		
		public static void pDistribute(NString pInvoiceCode,NString pUserId,NNumber pItem) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FV_INVOICE.P_DISTRIBUTE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_INVOICE_CODE", pInvoiceCode);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_ITEM", pItem);
				
			cmd.execute();


		}
		
		public static void pProcessEditRulp(NString pRuclCode,NDate pTransDate,NString pDocNum,NNumber pSubmissionNumber,NNumber pItem,NNumber pSeqNum,NString pUserId,NString pReversalInd,Ref<NString> pFsyrCodeInOut,Ref<NNumber> pTransAmtInOut,Ref<NString> pDrCrIndInOut,Ref<NString> pAcciCodeInOut,Ref<NString> pCoasCodeInOut,Ref<NString> pFundCodeInOut,Ref<NString> pOrgnCodeInOut,Ref<NString> pAcctCodeInOut,Ref<NString> pProgCodeInOut,Ref<NString> pActvCodeInOut,Ref<NString> pLocnCodeInOut,Ref<NString> pBankCodeInOut,Ref<NNumber> pVendorPidmInOut,Ref<NString> pEncbNumInOut,Ref<NNumber> pEncdItemNumInOut,Ref<NNumber> pEncdSeqNumInOut,Ref<NString> pEncbActionIndInOut,Ref<NString> pPrjdCodeInOut,Ref<NString> pPostingPeriodInOut,Ref<NString> pCurrCodeInOut,Ref<List<FbCommon.ErrTabtypeRow>> pErrTabInOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FV_INVOICE.P_PROCESS_EDIT_RULP", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_RUCL_CODE", pRuclCode);
			cmd.addParameter("@P_TRANS_DATE", pTransDate);
			cmd.addParameter("@P_DOC_NUM", pDocNum);
			cmd.addParameter("@P_SUBMISSION_NUMBER", pSubmissionNumber);
			cmd.addParameter("@P_ITEM", pItem);
			cmd.addParameter("@P_SEQ_NUM", pSeqNum);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_REVERSAL_IND", pReversalInd);
			cmd.addParameter("@P_FSYR_CODE_IN_OUT", pFsyrCodeInOut, true);
			cmd.addParameter("@P_TRANS_AMT_IN_OUT", pTransAmtInOut, true);
			cmd.addParameter("@P_DR_CR_IND_IN_OUT", pDrCrIndInOut, true);
			cmd.addParameter("@P_ACCI_CODE_IN_OUT", pAcciCodeInOut, true);
			cmd.addParameter("@P_COAS_CODE_IN_OUT", pCoasCodeInOut, true);
			cmd.addParameter("@P_FUND_CODE_IN_OUT", pFundCodeInOut, true);
			cmd.addParameter("@P_ORGN_CODE_IN_OUT", pOrgnCodeInOut, true);
			cmd.addParameter("@P_ACCT_CODE_IN_OUT", pAcctCodeInOut, true);
			cmd.addParameter("@P_PROG_CODE_IN_OUT", pProgCodeInOut, true);
			cmd.addParameter("@P_ACTV_CODE_IN_OUT", pActvCodeInOut, true);
			cmd.addParameter("@P_LOCN_CODE_IN_OUT", pLocnCodeInOut, true);
			cmd.addParameter("@P_BANK_CODE_IN_OUT", pBankCodeInOut, true);
			cmd.addParameter("@P_VENDOR_PIDM_IN_OUT", pVendorPidmInOut, true);
			cmd.addParameter("@P_ENCB_NUM_IN_OUT", pEncbNumInOut, true);
			cmd.addParameter("@P_ENCD_ITEM_NUM_IN_OUT", pEncdItemNumInOut, true);
			cmd.addParameter("@P_ENCD_SEQ_NUM_IN_OUT", pEncdSeqNumInOut, true);
			cmd.addParameter("@P_ENCB_ACTION_IND_IN_OUT", pEncbActionIndInOut, true);
			cmd.addParameter("@P_PRJD_CODE_IN_OUT", pPrjdCodeInOut, true);
			cmd.addParameter("@P_POSTING_PERIOD_IN_OUT", pPostingPeriodInOut, true);
			cmd.addParameter("@P_CURR_CODE_IN_OUT", pCurrCodeInOut, true);
			// cmd.addParameter(DbTypes.getTableType("P_ERR_TAB_IN_OUT", "", pErrTabInOut.val, object.class , true));
				
			cmd.execute();
			pFsyrCodeInOut.val = cmd.getParameterValue("@P_FSYR_CODE_IN_OUT", NString.class);
			pTransAmtInOut.val = cmd.getParameterValue("@P_TRANS_AMT_IN_OUT", NNumber.class);
			pDrCrIndInOut.val = cmd.getParameterValue("@P_DR_CR_IND_IN_OUT", NString.class);
			pAcciCodeInOut.val = cmd.getParameterValue("@P_ACCI_CODE_IN_OUT", NString.class);
			pCoasCodeInOut.val = cmd.getParameterValue("@P_COAS_CODE_IN_OUT", NString.class);
			pFundCodeInOut.val = cmd.getParameterValue("@P_FUND_CODE_IN_OUT", NString.class);
			pOrgnCodeInOut.val = cmd.getParameterValue("@P_ORGN_CODE_IN_OUT", NString.class);
			pAcctCodeInOut.val = cmd.getParameterValue("@P_ACCT_CODE_IN_OUT", NString.class);
			pProgCodeInOut.val = cmd.getParameterValue("@P_PROG_CODE_IN_OUT", NString.class);
			pActvCodeInOut.val = cmd.getParameterValue("@P_ACTV_CODE_IN_OUT", NString.class);
			pLocnCodeInOut.val = cmd.getParameterValue("@P_LOCN_CODE_IN_OUT", NString.class);
			pBankCodeInOut.val = cmd.getParameterValue("@P_BANK_CODE_IN_OUT", NString.class);
			pVendorPidmInOut.val = cmd.getParameterValue("@P_VENDOR_PIDM_IN_OUT", NNumber.class);
			pEncbNumInOut.val = cmd.getParameterValue("@P_ENCB_NUM_IN_OUT", NString.class);
			pEncdItemNumInOut.val = cmd.getParameterValue("@P_ENCD_ITEM_NUM_IN_OUT", NNumber.class);
			pEncdSeqNumInOut.val = cmd.getParameterValue("@P_ENCD_SEQ_NUM_IN_OUT", NNumber.class);
			pEncbActionIndInOut.val = cmd.getParameterValue("@P_ENCB_ACTION_IND_IN_OUT", NString.class);
			pPrjdCodeInOut.val = cmd.getParameterValue("@P_PRJD_CODE_IN_OUT", NString.class);
			pPostingPeriodInOut.val = cmd.getParameterValue("@P_POSTING_PERIOD_IN_OUT", NString.class);
			pCurrCodeInOut.val = cmd.getParameterValue("@P_CURR_CODE_IN_OUT", NString.class);
			// pErrTabInOut.val = cmd.getTableParameterValue("@P_ERR_TAB_IN_OUT", object.class);


		}
		
		public static void pRegisterEntity(NString pCode,NNumber pOperationType) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FV_INVOICE.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CODE", pCode);
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
				
			cmd.execute();


		}
		
		public static void pUpdateFarinvaFarintx(NString pInvhCode,NDate pCancelDate,NString pCancelUserId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FV_INVOICE.P_UPDATE_FARINVA_FARINTX", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_INVH_CODE", pInvhCode);
			cmd.addParameter("@P_CANCEL_DATE", pCancelDate);
			cmd.addParameter("@P_CANCEL_USER_ID", pCancelUserId);
				
			cmd.execute();


		}
		
		public static void pValidateCancel(NString pCode,NDate pCancelDate,NString pReestablishPayable,NString pCancelCode,NString pUserId,Ref<NString> pErrorMesgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FV_INVOICE.P_VALIDATE_CANCEL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CODE", pCode);
			cmd.addParameter("@P_CANCEL_DATE", pCancelDate);
			cmd.addParameter("@P_REESTABLISH_PAYABLE", pReestablishPayable);
			cmd.addParameter("@P_CANCEL_CODE", pCancelCode);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_ERROR_MESG_OUT", NString.class);
				
			cmd.execute();
			pErrorMesgOut.val = cmd.getParameterValue("@P_ERROR_MESG_OUT", NString.class);


		}
		
		public static void pValidateCancelDate(NDate pTransDate,NDate pCancelDate,NString pCancelCode,Ref<NString> pErrorMesgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FV_INVOICE.P_VALIDATE_CANCEL_DATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TRANS_DATE", pTransDate);
			cmd.addParameter("@P_CANCEL_DATE", pCancelDate);
			cmd.addParameter("@P_CANCEL_CODE", pCancelCode);
			cmd.addParameter("@P_ERROR_MESG_OUT", NString.class);
				
			cmd.execute();
			pErrorMesgOut.val = cmd.getParameterValue("@P_ERROR_MESG_OUT", NString.class);


		}
		
	
	
	
}
