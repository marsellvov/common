package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class TbReceivableRules {
		public static NString fValidApplyBy(NNumber pPidm,NNumber pTpayNumber,NString pInvPaid,NString pInvoiceNumber,NNumber pApplyAmount) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_RECEIVABLE_RULES.F_VALID_APPLY_BY", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TPAY_NUMBER", pTpayNumber);
			cmd.addParameter("@P_INV_PAID", pInvPaid);
			cmd.addParameter("@P_INVOICE_NUMBER", pInvoiceNumber);
			cmd.addParameter("@P_APPLY_AMOUNT", pApplyAmount);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fValidInvoice(NNumber pPidm,NString pInvoiceNumber) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_RECEIVABLE_RULES.F_VALID_INVOICE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_INVOICE_NUMBER", pInvoiceNumber);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pCurrConvExch(NNumber pPidm,NString pCurrCode,NNumber pForeignAmount,NDate pCurrTransDate,NNumber pTranNumberPaid,NString pInvNumberPaid,Ref<NNumber> pConvAmountOut,Ref<NNumber> pExchangeDiffOut,Ref<NString> pErrorOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_RECEIVABLE_RULES.P_CURR_CONV_EXCH", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_CURR_CODE", pCurrCode);
			cmd.addParameter("@P_FOREIGN_AMOUNT", pForeignAmount);
			cmd.addParameter("@P_CURR_TRANS_DATE", pCurrTransDate);
			cmd.addParameter("@P_TRAN_NUMBER_PAID", pTranNumberPaid);
			cmd.addParameter("@P_INV_NUMBER_PAID", pInvNumberPaid);
			cmd.addParameter("@P_CONV_AMOUNT_OUT", NNumber.class);
			cmd.addParameter("@P_EXCHANGE_DIFF_OUT", NNumber.class);
			cmd.addParameter("@P_ERROR_OUT", NString.class);
				
			cmd.execute();
			pConvAmountOut.val = cmd.getParameterValue("@P_CONV_AMOUNT_OUT", NNumber.class);
			pExchangeDiffOut.val = cmd.getParameterValue("@P_EXCHANGE_DIFF_OUT", NNumber.class);
			pErrorOut.val = cmd.getParameterValue("@P_ERROR_OUT", NString.class);


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_RECEIVABLE_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NNumber pPidm,NNumber pTranNumber,NString pTermCode,NString pDetailCode,NString pDcatCode,NString pUser,NDate pEntryDate,NNumber pAmount,NNumber pBalance,NDate pEffectiveDate,NDate pBillDate,NDate pDueDate,NString pDesc,NNumber pReceiptNumber,NNumber pTranNumberPaid,NNumber pCrossrefPidm,NNumber pCrossrefNumber,NString pCrossrefDetailCode,NString pSrceCode,NString pAcctFeedInd,NNumber pSessionNumber,NDate pCshrEndDate,NString pCrn,NString pCrossrefSrceCode,NString pLocMdt,NNumber pLocMdtSeq,NNumber pRate,NNumber pUnits,NString pDocumentNumber,NDate pTransDate,NString pPaymentId,NString pInvoiceNumber,NDate pStatementDate,NString pInvNumberPaid,NString pCurrCode,NNumber pExchangeDiff,NNumber pForeignAmount,NString pLateDcatCode,NDate pFeedDate,NString pFeedDocCode,NString pAtypCode,NNumber pAtypSeqno,NString pCardTypeVr,NDate pCardExpDateVr,NString pCardAuthNumberVr,NString pCrossrefDcatCode,NString pOrigChgInd,NString pCcrdCode,NString pMerchantId,NNumber pTaxReptYear,NString pTaxReptBox,NNumber pTaxAmount,NString pTaxFutureInd,NString pDataOrigin,NString pCreateSource,NString pCpdtInd,NString pAidyCode,NNumber pStspKeySequence,NString pPeriod,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_RECEIVABLE_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TRAN_NUMBER", pTranNumber);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_DETAIL_CODE", pDetailCode);
			cmd.addParameter("@P_DCAT_CODE", pDcatCode);
			cmd.addParameter("@P_USER", pUser);
			cmd.addParameter("@P_ENTRY_DATE", pEntryDate);
			cmd.addParameter("@P_AMOUNT", pAmount);
			cmd.addParameter("@P_BALANCE", pBalance);
			cmd.addParameter("@P_EFFECTIVE_DATE", pEffectiveDate);
			cmd.addParameter("@P_BILL_DATE", pBillDate);
			cmd.addParameter("@P_DUE_DATE", pDueDate);
			cmd.addParameter("@P_DESC", pDesc);
			cmd.addParameter("@P_RECEIPT_NUMBER", pReceiptNumber);
			cmd.addParameter("@P_TRAN_NUMBER_PAID", pTranNumberPaid);
			cmd.addParameter("@P_CROSSREF_PIDM", pCrossrefPidm);
			cmd.addParameter("@P_CROSSREF_NUMBER", pCrossrefNumber);
			cmd.addParameter("@P_CROSSREF_DETAIL_CODE", pCrossrefDetailCode);
			cmd.addParameter("@P_SRCE_CODE", pSrceCode);
			cmd.addParameter("@P_ACCT_FEED_IND", pAcctFeedInd);
			cmd.addParameter("@P_SESSION_NUMBER", pSessionNumber);
			cmd.addParameter("@P_CSHR_END_DATE", pCshrEndDate);
			cmd.addParameter("@P_CRN", pCrn);
			cmd.addParameter("@P_CROSSREF_SRCE_CODE", pCrossrefSrceCode);
			cmd.addParameter("@P_LOC_MDT", pLocMdt);
			cmd.addParameter("@P_LOC_MDT_SEQ", pLocMdtSeq);
			cmd.addParameter("@P_RATE", pRate);
			cmd.addParameter("@P_UNITS", pUnits);
			cmd.addParameter("@P_DOCUMENT_NUMBER", pDocumentNumber);
			cmd.addParameter("@P_TRANS_DATE", pTransDate);
			cmd.addParameter("@P_PAYMENT_ID", pPaymentId);
			cmd.addParameter("@P_INVOICE_NUMBER", pInvoiceNumber);
			cmd.addParameter("@P_STATEMENT_DATE", pStatementDate);
			cmd.addParameter("@P_INV_NUMBER_PAID", pInvNumberPaid);
			cmd.addParameter("@P_CURR_CODE", pCurrCode);
			cmd.addParameter("@P_EXCHANGE_DIFF", pExchangeDiff);
			cmd.addParameter("@P_FOREIGN_AMOUNT", pForeignAmount);
			cmd.addParameter("@P_LATE_DCAT_CODE", pLateDcatCode);
			cmd.addParameter("@P_FEED_DATE", pFeedDate);
			cmd.addParameter("@P_FEED_DOC_CODE", pFeedDocCode);
			cmd.addParameter("@P_ATYP_CODE", pAtypCode);
			cmd.addParameter("@P_ATYP_SEQNO", pAtypSeqno);
			cmd.addParameter("@P_CARD_TYPE_VR", pCardTypeVr);
			cmd.addParameter("@P_CARD_EXP_DATE_VR", pCardExpDateVr);
			cmd.addParameter("@P_CARD_AUTH_NUMBER_VR", pCardAuthNumberVr);
			cmd.addParameter("@P_CROSSREF_DCAT_CODE", pCrossrefDcatCode);
			cmd.addParameter("@P_ORIG_CHG_IND", pOrigChgInd);
			cmd.addParameter("@P_CCRD_CODE", pCcrdCode);
			cmd.addParameter("@P_MERCHANT_ID", pMerchantId);
			cmd.addParameter("@P_TAX_REPT_YEAR", pTaxReptYear);
			cmd.addParameter("@P_TAX_REPT_BOX", pTaxReptBox);
			cmd.addParameter("@P_TAX_AMOUNT", pTaxAmount);
			cmd.addParameter("@P_TAX_FUTURE_IND", pTaxFutureInd);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_CREATE_SOURCE", pCreateSource);
			cmd.addParameter("@P_CPDT_IND", pCpdtInd);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_STSP_KEY_SEQUENCE", pStspKeySequence);
			cmd.addParameter("@P_PERIOD", pPeriod);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidCreate() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_RECEIVABLE_RULES.P_VALID_CREATE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pValidUpdate(Ref<TbReceivable.ReceivableRecRow> lvValidationRecInout,TbReceivable.ReceivableRecRow lvExistingRec,Ref<NString> lvDcatCodeOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_RECEIVABLE_RULES.P_VALID_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter(DbTypes.createStructType("LV_VALIDATION_REC_INOUT", lvValidationRecInout.val, TbReceivable.ReceivableRecRow.class, true));
			cmd.addParameter(DbTypes.createStructType("LV_EXISTING_REC", lvExistingRec, TbReceivable.ReceivableRecRow.class ));
			cmd.addParameter("@LV_DCAT_CODE_OUT", NString.class);
				
			cmd.execute();
			lvValidationRecInout.val = cmd.getParameterValue("@LV_VALIDATION_REC_INOUT", TbReceivable.ReceivableRecRow.class);
			lvDcatCodeOut.val = cmd.getParameterValue("@LV_DCAT_CODE_OUT", NString.class);


		}
		
	
	
	
}
