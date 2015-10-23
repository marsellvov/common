package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class TbDeposit {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_DEPOSIT.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NNumber pPidm,NNumber pTranNumber,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_DEPOSIT.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TRAN_NUMBER", pTranNumber);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(DepositRecRow recOne,DepositRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_DEPOSIT.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, DepositRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, DepositRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber fMaxTranNumber(NNumber pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_DEPOSIT.F_MAX_TRAN_NUMBER", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static DataCursor fQueryAll(NNumber pPidm,NNumber pTranNumber,NString pTermCode,NString pDetailCodeDeposit,NString pDepositType) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_DEPOSIT.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TRAN_NUMBER", pTranNumber);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_DETAIL_CODE_DEPOSIT", pDetailCodeDeposit);
			cmd.addParameter("@P_DEPOSIT_TYPE", pDepositType);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_DEPOSIT.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryCashier(NString pUser,NNumber pSessionNumber,NDate pCshrEndDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_DEPOSIT.F_QUERY_CASHIER", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_USER", pUser);
			cmd.addParameter("@P_SESSION_NUMBER", pSessionNumber);
			cmd.addParameter("@P_CSHR_END_DATE", pCshrEndDate);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NNumber pPidm,NNumber pTranNumber) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_DEPOSIT.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TRAN_NUMBER", pTranNumber);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NNumber pPidm,NNumber pTranNumber,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_DEPOSIT.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TRAN_NUMBER", pTranNumber);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQuerySumDeposit(NNumber pPidm,NString pDepositType,NString pTermCode,NString pDetailCodeDeposit) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_DEPOSIT.F_QUERY_SUM_DEPOSIT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_DEPOSIT_TYPE", pDepositType);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_DETAIL_CODE_DEPOSIT", pDetailCodeDeposit);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static NString fTbrdepoAutoRelExists(NString pTerm,NNumber pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_DEPOSIT.F_TBRDEPO_AUTO_REL_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_TERM", pTerm);
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pCreate(NNumber pPidm,NString pTermCode,NString pDetailCodeDeposit,NString pDesc,NNumber pAmount,NString pDetailCodePayment,NString pAutoReleaseInd,NString pAcctFeedInd,NString pUser,NDate pEntryDate,NNumber pReceiptNumber,NNumber pMinAmount,NDate pExpirationDate,NDate pReleaseDate,NDate pEffectiveDate,NNumber pSessionNumber,NDate pCshrEndDate,NString pCurrCode,NDate pTransDate,NNumber pForeignAmount,NString pAtypCode,NNumber pAtypSeqno,NString pDataOrigin,NString pDocumentNumber,NString pOverrideHold,Ref<NNumber> pTranNumberOut,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_DEPOSIT.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_DETAIL_CODE_DEPOSIT", pDetailCodeDeposit);
			cmd.addParameter("@P_DESC", pDesc);
			cmd.addParameter("@P_AMOUNT", pAmount);
			cmd.addParameter("@P_DETAIL_CODE_PAYMENT", pDetailCodePayment);
			cmd.addParameter("@P_AUTO_RELEASE_IND", pAutoReleaseInd);
			cmd.addParameter("@P_ACCT_FEED_IND", pAcctFeedInd);
			cmd.addParameter("@P_USER", pUser);
			cmd.addParameter("@P_ENTRY_DATE", pEntryDate);
			cmd.addParameter("@P_RECEIPT_NUMBER", pReceiptNumber);
			cmd.addParameter("@P_MIN_AMOUNT", pMinAmount);
			cmd.addParameter("@P_EXPIRATION_DATE", pExpirationDate);
			cmd.addParameter("@P_RELEASE_DATE", pReleaseDate);
			cmd.addParameter("@P_EFFECTIVE_DATE", pEffectiveDate);
			cmd.addParameter("@P_SESSION_NUMBER", pSessionNumber);
			cmd.addParameter("@P_CSHR_END_DATE", pCshrEndDate);
			cmd.addParameter("@P_CURR_CODE", pCurrCode);
			cmd.addParameter("@P_TRANS_DATE", pTransDate);
			cmd.addParameter("@P_FOREIGN_AMOUNT", pForeignAmount);
			cmd.addParameter("@P_ATYP_CODE", pAtypCode);
			cmd.addParameter("@P_ATYP_SEQNO", pAtypSeqno);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_DOCUMENT_NUMBER", pDocumentNumber);
			cmd.addParameter("@P_OVERRIDE_HOLD", pOverrideHold);
			cmd.addParameter("@P_TRAN_NUMBER_OUT", NNumber.class);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pTranNumberOut.val = cmd.getParameterValue("@P_TRAN_NUMBER_OUT", NNumber.class);
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NNumber pPidm,NNumber pTranNumber,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_DEPOSIT.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TRAN_NUMBER", pTranNumber);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NNumber pPidm,NNumber pTranNumber,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_DEPOSIT.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TRAN_NUMBER", pTranNumber);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pRelease(NNumber pPidm,NNumber pTranNumber,NString pTermCode,NString pDetailCodeDeposit,NString pDepositType,NString pUser,NNumber pReceiptNumber,NDate pEffectiveDate,NNumber pSessionNumber,NDate pCshrEndDate,NNumber pReleaseAmount,NString pReleaseMode,NString pRunMode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_DEPOSIT.P_RELEASE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TRAN_NUMBER", pTranNumber);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_DETAIL_CODE_DEPOSIT", pDetailCodeDeposit);
			cmd.addParameter("@P_DEPOSIT_TYPE", pDepositType);
			cmd.addParameter("@P_USER", pUser);
			cmd.addParameter("@P_RECEIPT_NUMBER", pReceiptNumber);
			cmd.addParameter("@P_EFFECTIVE_DATE", pEffectiveDate);
			cmd.addParameter("@P_SESSION_NUMBER", pSessionNumber);
			cmd.addParameter("@P_CSHR_END_DATE", pCshrEndDate);
			cmd.addParameter("@P_RELEASE_AMOUNT", pReleaseAmount);
			cmd.addParameter("@P_RELEASE_MODE", pReleaseMode);
			cmd.addParameter("@P_RUN_MODE", pRunMode);
				
			cmd.execute();


		}
		
		public static void pRelease(NNumber pPidm,NNumber pTranNumber,NString pTermCode,NString pDetailCodeDeposit,NString pDepositType,NString pUser,NNumber pReceiptNumber,NDate pEffectiveDate,NNumber pSessionNumber,NDate pCshrEndDate,NNumber pReleaseAmount,NString pReleaseMode,NString pRunMode,Ref<NNumber> pAmtReleasedOut,Ref<NNumber> pAmtRemainOut,Ref<NString> pReleaseMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_DEPOSIT.P_RELEASE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TRAN_NUMBER", pTranNumber);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_DETAIL_CODE_DEPOSIT", pDetailCodeDeposit);
			cmd.addParameter("@P_DEPOSIT_TYPE", pDepositType);
			cmd.addParameter("@P_USER", pUser);
			cmd.addParameter("@P_RECEIPT_NUMBER", pReceiptNumber);
			cmd.addParameter("@P_EFFECTIVE_DATE", pEffectiveDate);
			cmd.addParameter("@P_SESSION_NUMBER", pSessionNumber);
			cmd.addParameter("@P_CSHR_END_DATE", pCshrEndDate);
			cmd.addParameter("@P_RELEASE_AMOUNT", pReleaseAmount);
			cmd.addParameter("@P_RELEASE_MODE", pReleaseMode);
			cmd.addParameter("@P_RUN_MODE", pRunMode);
			cmd.addParameter("@P_AMT_RELEASED_OUT", NNumber.class);
			cmd.addParameter("@P_AMT_REMAIN_OUT", NNumber.class);
			cmd.addParameter("@P_RELEASE_MSG_OUT", NString.class);
				
			cmd.execute();
			pAmtReleasedOut.val = cmd.getParameterValue("@P_AMT_RELEASED_OUT", NNumber.class);
			pAmtRemainOut.val = cmd.getParameterValue("@P_AMT_REMAIN_OUT", NNumber.class);
			pReleaseMsgOut.val = cmd.getParameterValue("@P_RELEASE_MSG_OUT", NString.class);


		}
		
		public static void pUpdate(NNumber pPidm,NNumber pTranNumber,NString pDesc,NString pAutoReleaseInd,NString pAcctFeedInd,NNumber pMinAmount,NDate pExpirationDate,NDate pReleaseDate,NDate pEffectiveDate,NNumber pSessionNumber,NDate pCshrEndDate,NDate pFeedDate,NString pFeedDocCode,NString pAtypCode,NNumber pAtypSeqno,NString pDataOrigin,NString pDocumentNumber,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_DEPOSIT.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TRAN_NUMBER", pTranNumber);
			cmd.addParameter("@P_DESC", pDesc);
			cmd.addParameter("@P_AUTO_RELEASE_IND", pAutoReleaseInd);
			cmd.addParameter("@P_ACCT_FEED_IND", pAcctFeedInd);
			cmd.addParameter("@P_MIN_AMOUNT", pMinAmount);
			cmd.addParameter("@P_EXPIRATION_DATE", pExpirationDate);
			cmd.addParameter("@P_RELEASE_DATE", pReleaseDate);
			cmd.addParameter("@P_EFFECTIVE_DATE", pEffectiveDate);
			cmd.addParameter("@P_SESSION_NUMBER", pSessionNumber);
			cmd.addParameter("@P_CSHR_END_DATE", pCshrEndDate);
			cmd.addParameter("@P_FEED_DATE", pFeedDate);
			cmd.addParameter("@P_FEED_DOC_CODE", pFeedDocCode);
			cmd.addParameter("@P_ATYP_CODE", pAtypCode);
			cmd.addParameter("@P_ATYP_SEQNO", pAtypSeqno);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_DOCUMENT_NUMBER", pDocumentNumber);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="DepositRecRow", dataSourceName="DEPOSIT_REC")
	public static class DepositRecRow
	{
		@DbRecordField(dataSourceName="R_PIDM")
		public NNumber RPidm;
		@DbRecordField(dataSourceName="R_TRAN_NUMBER")
		public NNumber RTranNumber;
		@DbRecordField(dataSourceName="R_TERM_CODE")
		public NString RTermCode;
		@DbRecordField(dataSourceName="R_DETAIL_CODE_DEPOSIT")
		public NString RDetailCodeDeposit;
		@DbRecordField(dataSourceName="R_DESC")
		public NString RDesc;
		@DbRecordField(dataSourceName="R_AMOUNT")
		public NNumber RAmount;
		@DbRecordField(dataSourceName="R_DETAIL_CODE_PAYMENT")
		public NString RDetailCodePayment;
		@DbRecordField(dataSourceName="R_AUTO_RELEASE_IND")
		public NString RAutoReleaseInd;
		@DbRecordField(dataSourceName="R_ACCT_FEED_IND")
		public NString RAcctFeedInd;
		@DbRecordField(dataSourceName="R_USER")
		public NString RUser;
		@DbRecordField(dataSourceName="R_ENTRY_DATE")
		public NDate REntryDate;
		@DbRecordField(dataSourceName="R_RECEIPT_NUMBER")
		public NNumber RReceiptNumber;
		@DbRecordField(dataSourceName="R_MIN_AMOUNT")
		public NNumber RMinAmount;
		@DbRecordField(dataSourceName="R_EXPIRATION_DATE")
		public NDate RExpirationDate;
		@DbRecordField(dataSourceName="R_RELEASE_DATE")
		public NDate RReleaseDate;
		@DbRecordField(dataSourceName="R_EFFECTIVE_DATE")
		public NDate REffectiveDate;
		@DbRecordField(dataSourceName="R_SESSION_NUMBER")
		public NNumber RSessionNumber;
		@DbRecordField(dataSourceName="R_CSHR_END_DATE")
		public NDate RCshrEndDate;
		@DbRecordField(dataSourceName="R_CURR_CODE")
		public NString RCurrCode;
		@DbRecordField(dataSourceName="R_TRANS_DATE")
		public NDate RTransDate;
		@DbRecordField(dataSourceName="R_FOREIGN_AMOUNT")
		public NNumber RForeignAmount;
		@DbRecordField(dataSourceName="R_FEED_DATE")
		public NDate RFeedDate;
		@DbRecordField(dataSourceName="R_FEED_DOC_CODE")
		public NString RFeedDocCode;
		@DbRecordField(dataSourceName="R_ATYP_CODE")
		public NString RAtypCode;
		@DbRecordField(dataSourceName="R_ATYP_SEQNO")
		public NNumber RAtypSeqno;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_CREATE_SOURCE")
		public NString RCreateSource;
		@DbRecordField(dataSourceName="R_DOCUMENT_NUMBER")
		public NString RDocumentNumber;
		@DbRecordField(dataSourceName="R_BALANCE")
		public NNumber RBalance;
		@DbRecordField(dataSourceName="R_DEPOSIT_TYPE")
		public NString RDepositType;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	@DbRecordType(id="DepositSumRecRow", dataSourceName="DEPOSIT_SUM_REC")
	public static class DepositSumRecRow
	{
		@DbRecordField(dataSourceName="R_PIDM")
		public NNumber RPidm;
		@DbRecordField(dataSourceName="R_DEPOSIT_TYPE")
		public NString RDepositType;
		@DbRecordField(dataSourceName="R_TERM_CODE")
		public NString RTermCode;
		@DbRecordField(dataSourceName="R_DETAIL_CODE_DEPOSIT")
		public NString RDetailCodeDeposit;
		@DbRecordField(dataSourceName="R_DESC")
		public NString RDesc;
		@DbRecordField(dataSourceName="R_AMOUNT")
		public NNumber RAmount;
		@DbRecordField(dataSourceName="R_BALANCE")
		public NNumber RBalance;
	}

	
	
}
