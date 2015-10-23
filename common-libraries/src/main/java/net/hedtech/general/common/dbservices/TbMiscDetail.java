package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class TbMiscDetail {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_MISC_DETAIL.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NString pUser,NNumber pTranNumber,NNumber pReceiptNumber,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_MISC_DETAIL.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_USER", pUser);
			cmd.addParameter("@P_TRAN_NUMBER", pTranNumber);
			cmd.addParameter("@P_RECEIPT_NUMBER", pReceiptNumber);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(MiscDetailRecRow recOne,MiscDetailRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_MISC_DETAIL.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, MiscDetailRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, MiscDetailRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber fMaxTranNumber(NNumber pReceiptNumber) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_MISC_DETAIL.F_MAX_TRAN_NUMBER", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_RECEIPT_NUMBER", pReceiptNumber);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static DataCursor fQueryAll(NString pUser,NNumber pTranNumber,NNumber pReceiptNumber,NString pDocumentNumber) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_MISC_DETAIL.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_USER", pUser);
			cmd.addParameter("@P_TRAN_NUMBER", pTranNumber);
			cmd.addParameter("@P_RECEIPT_NUMBER", pReceiptNumber);
			cmd.addParameter("@P_DOCUMENT_NUMBER", pDocumentNumber);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_MISC_DETAIL.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryCashier(NString pUser,NNumber pSessionNumber,NDate pCshrEndDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_MISC_DETAIL.F_QUERY_CASHIER", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_USER", pUser);
			cmd.addParameter("@P_SESSION_NUMBER", pSessionNumber);
			cmd.addParameter("@P_CSHR_END_DATE", pCshrEndDate);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NString pUser,NNumber pTranNumber,NNumber pReceiptNumber) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_MISC_DETAIL.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_USER", pUser);
			cmd.addParameter("@P_TRAN_NUMBER", pTranNumber);
			cmd.addParameter("@P_RECEIPT_NUMBER", pReceiptNumber);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NString pUser,NNumber pTranNumber,NNumber pReceiptNumber,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_MISC_DETAIL.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_USER", pUser);
			cmd.addParameter("@P_TRAN_NUMBER", pTranNumber);
			cmd.addParameter("@P_RECEIPT_NUMBER", pReceiptNumber);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static NNumber fTotalByDrCr(NNumber pReceiptNumber,NString pDrCrInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_MISC_DETAIL.F_TOTAL_BY_DR_CR", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_RECEIPT_NUMBER", pReceiptNumber);
			cmd.addParameter("@P_DR_CR_IND", pDrCrInd);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static void pCreate(NString pPayDetailCode,NString pChargeDetailCode,NNumber pAmount,NString pDesc,NNumber pReceiptNumber,NString pUser,NString pAcctFeedInd,NString pChargeCoas,NString pChargeAcci,NString pChargeFund,NString pChargeOrgn,NString pChargeAcct,NString pChargeProg,NString pChargeActv,NString pChargeLocn,NString pPayCoas,NString pPayAcci,NString pPayFund,NString pPayOrgn,NString pPayAcct,NString pPayProg,NString pPayActv,NString pPayLocn,NNumber pSessionNumber,NDate pCshrEndDate,NString pChargeAccount,NString pPayAccount,NString pPayRuclCode,NString pChargeRuclCode,NDate pTransDate,NString pDocumentNumber,NString pDrCrInd,NString pCurrCode,NNumber pForeignAmount,NNumber pPidm,NString pCcrdCode,NDate pCardExpDate,NString pPaymentId,NString pCardAuthNumber,NString pMerchantId,NString pDataOrigin,Ref<NNumber> pTranNumberOut,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_MISC_DETAIL.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PAY_DETAIL_CODE", pPayDetailCode);
			cmd.addParameter("@P_CHARGE_DETAIL_CODE", pChargeDetailCode);
			cmd.addParameter("@P_AMOUNT", pAmount);
			cmd.addParameter("@P_DESC", pDesc);
			cmd.addParameter("@P_RECEIPT_NUMBER", pReceiptNumber);
			cmd.addParameter("@P_USER", pUser);
			cmd.addParameter("@P_ACCT_FEED_IND", pAcctFeedInd);
			cmd.addParameter("@P_CHARGE_COAS", pChargeCoas);
			cmd.addParameter("@P_CHARGE_ACCI", pChargeAcci);
			cmd.addParameter("@P_CHARGE_FUND", pChargeFund);
			cmd.addParameter("@P_CHARGE_ORGN", pChargeOrgn);
			cmd.addParameter("@P_CHARGE_ACCT", pChargeAcct);
			cmd.addParameter("@P_CHARGE_PROG", pChargeProg);
			cmd.addParameter("@P_CHARGE_ACTV", pChargeActv);
			cmd.addParameter("@P_CHARGE_LOCN", pChargeLocn);
			cmd.addParameter("@P_PAY_COAS", pPayCoas);
			cmd.addParameter("@P_PAY_ACCI", pPayAcci);
			cmd.addParameter("@P_PAY_FUND", pPayFund);
			cmd.addParameter("@P_PAY_ORGN", pPayOrgn);
			cmd.addParameter("@P_PAY_ACCT", pPayAcct);
			cmd.addParameter("@P_PAY_PROG", pPayProg);
			cmd.addParameter("@P_PAY_ACTV", pPayActv);
			cmd.addParameter("@P_PAY_LOCN", pPayLocn);
			cmd.addParameter("@P_SESSION_NUMBER", pSessionNumber);
			cmd.addParameter("@P_CSHR_END_DATE", pCshrEndDate);
			cmd.addParameter("@P_CHARGE_ACCOUNT", pChargeAccount);
			cmd.addParameter("@P_PAY_ACCOUNT", pPayAccount);
			cmd.addParameter("@P_PAY_RUCL_CODE", pPayRuclCode);
			cmd.addParameter("@P_CHARGE_RUCL_CODE", pChargeRuclCode);
			cmd.addParameter("@P_TRANS_DATE", pTransDate);
			cmd.addParameter("@P_DOCUMENT_NUMBER", pDocumentNumber);
			cmd.addParameter("@P_DR_CR_IND", pDrCrInd);
			cmd.addParameter("@P_CURR_CODE", pCurrCode);
			cmd.addParameter("@P_FOREIGN_AMOUNT", pForeignAmount);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_CCRD_CODE", pCcrdCode);
			cmd.addParameter("@P_CARD_EXP_DATE", pCardExpDate);
			cmd.addParameter("@P_PAYMENT_ID", pPaymentId);
			cmd.addParameter("@P_CARD_AUTH_NUMBER", pCardAuthNumber);
			cmd.addParameter("@P_MERCHANT_ID", pMerchantId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_TRAN_NUMBER_OUT", NNumber.class);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pTranNumberOut.val = cmd.getParameterValue("@P_TRAN_NUMBER_OUT", NNumber.class);
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pLock(NString pUser,NNumber pTranNumber,NNumber pReceiptNumber,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_MISC_DETAIL.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_USER", pUser);
			cmd.addParameter("@P_TRAN_NUMBER", pTranNumber);
			cmd.addParameter("@P_RECEIPT_NUMBER", pReceiptNumber);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NString pDesc,NNumber pReceiptNumber,NString pUser,NNumber pTranNumber,NString pAcctFeedInd,NNumber pSessionNumber,NDate pCshrEndDate,NDate pFeedDate,NString pFeedDocCode,NString pPaymentId,NString pDataOrigin,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_MISC_DETAIL.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DESC", pDesc);
			cmd.addParameter("@P_RECEIPT_NUMBER", pReceiptNumber);
			cmd.addParameter("@P_USER", pUser);
			cmd.addParameter("@P_TRAN_NUMBER", pTranNumber);
			cmd.addParameter("@P_ACCT_FEED_IND", pAcctFeedInd);
			cmd.addParameter("@P_SESSION_NUMBER", pSessionNumber);
			cmd.addParameter("@P_CSHR_END_DATE", pCshrEndDate);
			cmd.addParameter("@P_FEED_DATE", pFeedDate);
			cmd.addParameter("@P_FEED_DOC_CODE", pFeedDocCode);
			cmd.addParameter("@P_PAYMENT_ID", pPaymentId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="MiscDetailRecRow", dataSourceName="MISC_DETAIL_REC")
	public static class MiscDetailRecRow
	{
		@DbRecordField(dataSourceName="R_PAY_DETAIL_CODE")
		public NString RPayDetailCode;
		@DbRecordField(dataSourceName="R_CHARGE_DETAIL_CODE")
		public NString RChargeDetailCode;
		@DbRecordField(dataSourceName="R_AMOUNT")
		public NNumber RAmount;
		@DbRecordField(dataSourceName="R_DESC")
		public NString RDesc;
		@DbRecordField(dataSourceName="R_RECEIPT_NUMBER")
		public NNumber RReceiptNumber;
		@DbRecordField(dataSourceName="R_USER")
		public NString RUser;
		@DbRecordField(dataSourceName="R_TRAN_NUMBER")
		public NNumber RTranNumber;
		@DbRecordField(dataSourceName="R_ACCT_FEED_IND")
		public NString RAcctFeedInd;
		@DbRecordField(dataSourceName="R_CHARGE_COAS")
		public NString RChargeCoas;
		@DbRecordField(dataSourceName="R_CHARGE_ACCI")
		public NString RChargeAcci;
		@DbRecordField(dataSourceName="R_CHARGE_FUND")
		public NString RChargeFund;
		@DbRecordField(dataSourceName="R_CHARGE_ORGN")
		public NString RChargeOrgn;
		@DbRecordField(dataSourceName="R_CHARGE_ACCT")
		public NString RChargeAcct;
		@DbRecordField(dataSourceName="R_CHARGE_PROG")
		public NString RChargeProg;
		@DbRecordField(dataSourceName="R_CHARGE_ACTV")
		public NString RChargeActv;
		@DbRecordField(dataSourceName="R_CHARGE_LOCN")
		public NString RChargeLocn;
		@DbRecordField(dataSourceName="R_PAY_COAS")
		public NString RPayCoas;
		@DbRecordField(dataSourceName="R_PAY_ACCI")
		public NString RPayAcci;
		@DbRecordField(dataSourceName="R_PAY_FUND")
		public NString RPayFund;
		@DbRecordField(dataSourceName="R_PAY_ORGN")
		public NString RPayOrgn;
		@DbRecordField(dataSourceName="R_PAY_ACCT")
		public NString RPayAcct;
		@DbRecordField(dataSourceName="R_PAY_PROG")
		public NString RPayProg;
		@DbRecordField(dataSourceName="R_PAY_ACTV")
		public NString RPayActv;
		@DbRecordField(dataSourceName="R_PAY_LOCN")
		public NString RPayLocn;
		@DbRecordField(dataSourceName="R_SESSION_NUMBER")
		public NNumber RSessionNumber;
		@DbRecordField(dataSourceName="R_CSHR_END_DATE")
		public NDate RCshrEndDate;
		@DbRecordField(dataSourceName="R_CHARGE_ACCOUNT")
		public NString RChargeAccount;
		@DbRecordField(dataSourceName="R_PAY_ACCOUNT")
		public NString RPayAccount;
		@DbRecordField(dataSourceName="R_PAY_RUCL_CODE")
		public NString RPayRuclCode;
		@DbRecordField(dataSourceName="R_CHARGE_RUCL_CODE")
		public NString RChargeRuclCode;
		@DbRecordField(dataSourceName="R_TRANS_DATE")
		public NDate RTransDate;
		@DbRecordField(dataSourceName="R_DOCUMENT_NUMBER")
		public NString RDocumentNumber;
		@DbRecordField(dataSourceName="R_DR_CR_IND")
		public NString RDrCrInd;
		@DbRecordField(dataSourceName="R_CURR_CODE")
		public NString RCurrCode;
		@DbRecordField(dataSourceName="R_FOREIGN_AMOUNT")
		public NNumber RForeignAmount;
		@DbRecordField(dataSourceName="R_FEED_DATE")
		public NDate RFeedDate;
		@DbRecordField(dataSourceName="R_FEED_DOC_CODE")
		public NString RFeedDocCode;
		@DbRecordField(dataSourceName="R_PIDM")
		public NNumber RPidm;
		@DbRecordField(dataSourceName="R_CCRD_CODE")
		public NString RCcrdCode;
		@DbRecordField(dataSourceName="R_CARD_EXP_DATE")
		public NDate RCardExpDate;
		@DbRecordField(dataSourceName="R_PAYMENT_ID")
		public NString RPaymentId;
		@DbRecordField(dataSourceName="R_CARD_AUTH_NUMBER")
		public NString RCardAuthNumber;
		@DbRecordField(dataSourceName="R_MERCHANT_ID")
		public NString RMerchantId;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_CREATE_SOURCE")
		public NString RCreateSource;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
