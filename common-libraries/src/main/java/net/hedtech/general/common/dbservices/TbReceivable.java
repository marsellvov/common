package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class TbReceivable {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_RECEIVABLE.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NNumber pPidm,NNumber pTranNumber,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_RECEIVABLE.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TRAN_NUMBER", pTranNumber);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(ReceivableRecRow recOne,ReceivableRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_RECEIVABLE.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, ReceivableRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, ReceivableRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber fMaxTranNumber(NNumber pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_RECEIVABLE.F_MAX_TRAN_NUMBER", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static DataCursor fQueryAll(NNumber pPidm,NString pTermCode,NString pDetailCode,NString pDcatCode,NDate pBillDate,NString pSrceCode,NString pInvoiceNumber,NString pFeedDocCode,NNumber pTaxReptYear) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_RECEIVABLE.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_DETAIL_CODE", pDetailCode);
			cmd.addParameter("@P_DCAT_CODE", pDcatCode);
			cmd.addParameter("@P_BILL_DATE", pBillDate);
			cmd.addParameter("@P_SRCE_CODE", pSrceCode);
			cmd.addParameter("@P_INVOICE_NUMBER", pInvoiceNumber);
			cmd.addParameter("@P_FEED_DOC_CODE", pFeedDocCode);
			cmd.addParameter("@P_TAX_REPT_YEAR", pTaxReptYear);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_RECEIVABLE.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryCashier(NString pUser,NNumber pSessionNumber,NDate pCshrEndDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_RECEIVABLE.F_QUERY_CASHIER", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_USER", pUser);
			cmd.addParameter("@P_SESSION_NUMBER", pSessionNumber);
			cmd.addParameter("@P_CSHR_END_DATE", pCshrEndDate);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NNumber pPidm,NNumber pTranNumber) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_RECEIVABLE.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TRAN_NUMBER", pTranNumber);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NNumber pPidm,NNumber pTranNumber,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_RECEIVABLE.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TRAN_NUMBER", pTranNumber);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static NNumber fSumBalance(NNumber pPidm,NNumber pTranNumber,NString pTermCode,NString pDetailCode,NString pDcatCode,NDate pBillDate,NString pSrceCode,NNumber pTranNumberPaid,NString pInvoiceNumber,NString pInvNumberPaid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_RECEIVABLE.F_SUM_BALANCE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TRAN_NUMBER", pTranNumber);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_DETAIL_CODE", pDetailCode);
			cmd.addParameter("@P_DCAT_CODE", pDcatCode);
			cmd.addParameter("@P_BILL_DATE", pBillDate);
			cmd.addParameter("@P_SRCE_CODE", pSrceCode);
			cmd.addParameter("@P_TRAN_NUMBER_PAID", pTranNumberPaid);
			cmd.addParameter("@P_INVOICE_NUMBER", pInvoiceNumber);
			cmd.addParameter("@P_INV_NUMBER_PAID", pInvNumberPaid);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fSumNetAmount(NNumber pPidm,NString pTermCode,NString pDetailCode,NString pDcatCode,NDate pBillDate,NString pSrceCode,NString pInvoiceNumber,NString pInvNumberPaid,NDate pAsOfDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_RECEIVABLE.F_SUM_NET_AMOUNT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_DETAIL_CODE", pDetailCode);
			cmd.addParameter("@P_DCAT_CODE", pDcatCode);
			cmd.addParameter("@P_BILL_DATE", pBillDate);
			cmd.addParameter("@P_SRCE_CODE", pSrceCode);
			cmd.addParameter("@P_INVOICE_NUMBER", pInvoiceNumber);
			cmd.addParameter("@P_INV_NUMBER_PAID", pInvNumberPaid);
			cmd.addParameter("@P_AS_OF_DATE", pAsOfDate);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static void pAdjustBalance(NNumber pPidm,NNumber pTranNumber,NNumber pAdjustAmount) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_RECEIVABLE.P_ADJUST_BALANCE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TRAN_NUMBER", pTranNumber);
			cmd.addParameter("@P_ADJUST_AMOUNT", pAdjustAmount);
				
			cmd.execute();


		}
		
		public static void pCreate(NNumber pPidm,NString pTermCode,NString pDetailCode,NString pUser,NDate pEntryDate,NNumber pAmount,NDate pEffectiveDate,NDate pBillDate,NDate pDueDate,NString pDesc,NNumber pReceiptNumber,NNumber pTranNumberPaid,NNumber pCrossrefPidm,NNumber pCrossrefNumber,NString pCrossrefDetailCode,NString pSrceCode,NString pAcctFeedInd,NNumber pSessionNumber,NDate pCshrEndDate,NString pCrn,NString pCrossrefSrceCode,NString pLocMdt,NNumber pLocMdtSeq,NNumber pRate,NNumber pUnits,NString pDocumentNumber,NDate pTransDate,NString pPaymentId,NString pInvoiceNumber,NDate pStatementDate,NString pInvNumberPaid,NString pCurrCode,NNumber pExchangeDiff,NNumber pForeignAmount,NString pLateDcatCode,NString pAtypCode,NNumber pAtypSeqno,NString pCardTypeVr,NDate pCardExpDateVr,NString pCardAuthNumberVr,NString pCrossrefDcatCode,NString pOrigChgInd,NString pCcrdCode,NString pMerchantId,NString pDataOrigin,NString pCpdtInd,NString pOverrideHold,NString pAidyCode,NNumber pStspKeySequence,NString pPeriod,Ref<NNumber> pTranNumberOut,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_RECEIVABLE.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_DETAIL_CODE", pDetailCode);
			cmd.addParameter("@P_USER", pUser);
			cmd.addParameter("@P_ENTRY_DATE", pEntryDate);
			cmd.addParameter("@P_AMOUNT", pAmount);
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
			cmd.addParameter("@P_ATYP_CODE", pAtypCode);
			cmd.addParameter("@P_ATYP_SEQNO", pAtypSeqno);
			cmd.addParameter("@P_CARD_TYPE_VR", pCardTypeVr);
			cmd.addParameter("@P_CARD_EXP_DATE_VR", pCardExpDateVr);
			cmd.addParameter("@P_CARD_AUTH_NUMBER_VR", pCardAuthNumberVr);
			cmd.addParameter("@P_CROSSREF_DCAT_CODE", pCrossrefDcatCode);
			cmd.addParameter("@P_ORIG_CHG_IND", pOrigChgInd);
			cmd.addParameter("@P_CCRD_CODE", pCcrdCode);
			cmd.addParameter("@P_MERCHANT_ID", pMerchantId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_CPDT_IND", pCpdtInd);
			cmd.addParameter("@P_OVERRIDE_HOLD", pOverrideHold);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_STSP_KEY_SEQUENCE", pStspKeySequence);
			cmd.addParameter("@P_PERIOD", pPeriod);
			cmd.addParameter("@P_TRAN_NUMBER_OUT", NNumber.class);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pTranNumberOut.val = cmd.getParameterValue("@P_TRAN_NUMBER_OUT", NNumber.class);
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NNumber pPidm,NNumber pTranNumber,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_RECEIVABLE.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TRAN_NUMBER", pTranNumber);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NNumber pPidm,NNumber pTranNumber,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_RECEIVABLE.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TRAN_NUMBER", pTranNumber);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NNumber pPidm,NNumber pTranNumber,NNumber pBalance,NDate pEffectiveDate,NDate pBillDate,NDate pDueDate,NString pDesc,NNumber pTranNumberPaid,NString pAcctFeedInd,NNumber pSessionNumber,NDate pCshrEndDate,NString pDocumentNumber,NDate pTransDate,NString pPaymentId,NString pInvoiceNumber,NDate pStatementDate,NString pInvNumberPaid,NDate pFeedDate,NString pFeedDocCode,NString pAtypCode,NNumber pAtypSeqno,NString pOrigChgInd,NNumber pTaxReptYear,NString pTaxReptBox,NNumber pTaxAmount,NString pTaxFutureInd,NString pDataOrigin,NString pCpdtInd,NString pRowid,NString pAidyCode,NNumber pStspKeySequence,NString pPeriod) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_RECEIVABLE.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TRAN_NUMBER", pTranNumber);
			cmd.addParameter("@P_BALANCE", pBalance);
			cmd.addParameter("@P_EFFECTIVE_DATE", pEffectiveDate);
			cmd.addParameter("@P_BILL_DATE", pBillDate);
			cmd.addParameter("@P_DUE_DATE", pDueDate);
			cmd.addParameter("@P_DESC", pDesc);
			cmd.addParameter("@P_TRAN_NUMBER_PAID", pTranNumberPaid);
			cmd.addParameter("@P_ACCT_FEED_IND", pAcctFeedInd);
			cmd.addParameter("@P_SESSION_NUMBER", pSessionNumber);
			cmd.addParameter("@P_CSHR_END_DATE", pCshrEndDate);
			cmd.addParameter("@P_DOCUMENT_NUMBER", pDocumentNumber);
			cmd.addParameter("@P_TRANS_DATE", pTransDate);
			cmd.addParameter("@P_PAYMENT_ID", pPaymentId);
			cmd.addParameter("@P_INVOICE_NUMBER", pInvoiceNumber);
			cmd.addParameter("@P_STATEMENT_DATE", pStatementDate);
			cmd.addParameter("@P_INV_NUMBER_PAID", pInvNumberPaid);
			cmd.addParameter("@P_FEED_DATE", pFeedDate);
			cmd.addParameter("@P_FEED_DOC_CODE", pFeedDocCode);
			cmd.addParameter("@P_ATYP_CODE", pAtypCode);
			cmd.addParameter("@P_ATYP_SEQNO", pAtypSeqno);
			cmd.addParameter("@P_ORIG_CHG_IND", pOrigChgInd);
			cmd.addParameter("@P_TAX_REPT_YEAR", pTaxReptYear);
			cmd.addParameter("@P_TAX_REPT_BOX", pTaxReptBox);
			cmd.addParameter("@P_TAX_AMOUNT", pTaxAmount);
			cmd.addParameter("@P_TAX_FUTURE_IND", pTaxFutureInd);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_CPDT_IND", pCpdtInd);
			cmd.addParameter("@P_ROWID", pRowid);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_STSP_KEY_SEQUENCE", pStspKeySequence);
			cmd.addParameter("@P_PERIOD", pPeriod);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="ReceivableRecRow", dataSourceName="RECEIVABLE_REC")
	public static class ReceivableRecRow
	{
		@DbRecordField(dataSourceName="R_PIDM")
		public NNumber RPidm;
		@DbRecordField(dataSourceName="R_TRAN_NUMBER")
		public NNumber RTranNumber;
		@DbRecordField(dataSourceName="R_TERM_CODE")
		public NString RTermCode;
		@DbRecordField(dataSourceName="R_DETAIL_CODE")
		public NString RDetailCode;
		@DbRecordField(dataSourceName="R_USER")
		public NString RUser;
		@DbRecordField(dataSourceName="R_ENTRY_DATE")
		public NDate REntryDate;
		@DbRecordField(dataSourceName="R_AMOUNT")
		public NNumber RAmount;
		@DbRecordField(dataSourceName="R_BALANCE")
		public NNumber RBalance;
		@DbRecordField(dataSourceName="R_EFFECTIVE_DATE")
		public NDate REffectiveDate;
		@DbRecordField(dataSourceName="R_BILL_DATE")
		public NDate RBillDate;
		@DbRecordField(dataSourceName="R_DUE_DATE")
		public NDate RDueDate;
		@DbRecordField(dataSourceName="R_DESC")
		public NString RDesc;
		@DbRecordField(dataSourceName="R_RECEIPT_NUMBER")
		public NNumber RReceiptNumber;
		@DbRecordField(dataSourceName="R_TRAN_NUMBER_PAID")
		public NNumber RTranNumberPaid;
		@DbRecordField(dataSourceName="R_CROSSREF_PIDM")
		public NNumber RCrossrefPidm;
		@DbRecordField(dataSourceName="R_CROSSREF_NUMBER")
		public NNumber RCrossrefNumber;
		@DbRecordField(dataSourceName="R_CROSSREF_DETAIL_CODE")
		public NString RCrossrefDetailCode;
		@DbRecordField(dataSourceName="R_SRCE_CODE")
		public NString RSrceCode;
		@DbRecordField(dataSourceName="R_ACCT_FEED_IND")
		public NString RAcctFeedInd;
		@DbRecordField(dataSourceName="R_SESSION_NUMBER")
		public NNumber RSessionNumber;
		@DbRecordField(dataSourceName="R_CSHR_END_DATE")
		public NDate RCshrEndDate;
		@DbRecordField(dataSourceName="R_CRN")
		public NString RCrn;
		@DbRecordField(dataSourceName="R_CROSSREF_SRCE_CODE")
		public NString RCrossrefSrceCode;
		@DbRecordField(dataSourceName="R_LOC_MDT")
		public NString RLocMdt;
		@DbRecordField(dataSourceName="R_LOC_MDT_SEQ")
		public NNumber RLocMdtSeq;
		@DbRecordField(dataSourceName="R_RATE")
		public NNumber RRate;
		@DbRecordField(dataSourceName="R_UNITS")
		public NNumber RUnits;
		@DbRecordField(dataSourceName="R_DOCUMENT_NUMBER")
		public NString RDocumentNumber;
		@DbRecordField(dataSourceName="R_TRANS_DATE")
		public NDate RTransDate;
		@DbRecordField(dataSourceName="R_PAYMENT_ID")
		public NString RPaymentId;
		@DbRecordField(dataSourceName="R_INVOICE_NUMBER")
		public NString RInvoiceNumber;
		@DbRecordField(dataSourceName="R_STATEMENT_DATE")
		public NDate RStatementDate;
		@DbRecordField(dataSourceName="R_INV_NUMBER_PAID")
		public NString RInvNumberPaid;
		@DbRecordField(dataSourceName="R_CURR_CODE")
		public NString RCurrCode;
		@DbRecordField(dataSourceName="R_EXCHANGE_DIFF")
		public NNumber RExchangeDiff;
		@DbRecordField(dataSourceName="R_FOREIGN_AMOUNT")
		public NNumber RForeignAmount;
		@DbRecordField(dataSourceName="R_LATE_DCAT_CODE")
		public NString RLateDcatCode;
		@DbRecordField(dataSourceName="R_FEED_DATE")
		public NDate RFeedDate;
		@DbRecordField(dataSourceName="R_FEED_DOC_CODE")
		public NString RFeedDocCode;
		@DbRecordField(dataSourceName="R_ATYP_CODE")
		public NString RAtypCode;
		@DbRecordField(dataSourceName="R_ATYP_SEQNO")
		public NNumber RAtypSeqno;
		@DbRecordField(dataSourceName="R_CARD_TYPE_VR")
		public NString RCardTypeVr;
		@DbRecordField(dataSourceName="R_CARD_EXP_DATE_VR")
		public NDate RCardExpDateVr;
		@DbRecordField(dataSourceName="R_CARD_AUTH_NUMBER_VR")
		public NString RCardAuthNumberVr;
		@DbRecordField(dataSourceName="R_CROSSREF_DCAT_CODE")
		public NString RCrossrefDcatCode;
		@DbRecordField(dataSourceName="R_ORIG_CHG_IND")
		public NString ROrigChgInd;
		@DbRecordField(dataSourceName="R_CCRD_CODE")
		public NString RCcrdCode;
		@DbRecordField(dataSourceName="R_MERCHANT_ID")
		public NString RMerchantId;
		@DbRecordField(dataSourceName="R_TAX_REPT_YEAR")
		public NNumber RTaxReptYear;
		@DbRecordField(dataSourceName="R_TAX_REPT_BOX")
		public NString RTaxReptBox;
		@DbRecordField(dataSourceName="R_TAX_AMOUNT")
		public NNumber RTaxAmount;
		@DbRecordField(dataSourceName="R_TAX_FUTURE_IND")
		public NString RTaxFutureInd;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_CREATE_SOURCE")
		public NString RCreateSource;
		@DbRecordField(dataSourceName="R_CPDT_IND")
		public NString RCpdtInd;
		@DbRecordField(dataSourceName="R_AIDY_CODE")
		public NString RAidyCode;
		@DbRecordField(dataSourceName="R_STSP_KEY_SEQUENCE")
		public NNumber RStspKeySequence;
		@DbRecordField(dataSourceName="R_PERIOD")
		public NString RPeriod;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
