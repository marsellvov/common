package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class TbContractPayment {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_CONTRACT_PAYMENT.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NNumber pContPidm,NNumber pContTranNumber,NNumber pTranNumber,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_CONTRACT_PAYMENT.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_CONT_PIDM", pContPidm);
			cmd.addParameter("@P_CONT_TRAN_NUMBER", pContTranNumber);
			cmd.addParameter("@P_TRAN_NUMBER", pTranNumber);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fExistsStudent(NNumber pStuPidm,NNumber pContPidm,NString pTermCode,NNumber pContractNumber,NNumber pContTranNumber) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_CONTRACT_PAYMENT.F_EXISTS_STUDENT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_STU_PIDM", pStuPidm);
			cmd.addParameter("@P_CONT_PIDM", pContPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_CONTRACT_NUMBER", pContractNumber);
			cmd.addParameter("@P_CONT_TRAN_NUMBER", pContTranNumber);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(ContractPaymentRecRow recOne,ContractPaymentRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_CONTRACT_PAYMENT.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, ContractPaymentRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, ContractPaymentRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber fMaxTranNumber(NNumber pContPidm,NNumber pContTranNumber) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_CONTRACT_PAYMENT.F_MAX_TRAN_NUMBER", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_CONT_PIDM", pContPidm);
			cmd.addParameter("@P_CONT_TRAN_NUMBER", pContTranNumber);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static DataCursor fQueryAll(NNumber pContPidm,NNumber pContTranNumber,NNumber pStuPidm,NNumber pContractNumber,NString pTermCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_CONTRACT_PAYMENT.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_CONT_PIDM", pContPidm);
			cmd.addParameter("@P_CONT_TRAN_NUMBER", pContTranNumber);
			cmd.addParameter("@P_STU_PIDM", pStuPidm);
			cmd.addParameter("@P_CONTRACT_NUMBER", pContractNumber);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_CONTRACT_PAYMENT.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NNumber pContPidm,NNumber pContTranNumber,NNumber pTranNumber) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_CONTRACT_PAYMENT.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_CONT_PIDM", pContPidm);
			cmd.addParameter("@P_CONT_TRAN_NUMBER", pContTranNumber);
			cmd.addParameter("@P_TRAN_NUMBER", pTranNumber);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NNumber pContPidm,NNumber pContTranNumber,NNumber pTranNumber,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_CONTRACT_PAYMENT.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_CONT_PIDM", pContPidm);
			cmd.addParameter("@P_CONT_TRAN_NUMBER", pContTranNumber);
			cmd.addParameter("@P_TRAN_NUMBER", pTranNumber);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static NNumber fSumAmount(NNumber pContPidm,NNumber pContTranNumber) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_CONTRACT_PAYMENT.F_SUM_AMOUNT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_CONT_PIDM", pContPidm);
			cmd.addParameter("@P_CONT_TRAN_NUMBER", pContTranNumber);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fSumBalance(NNumber pContPidm,NNumber pContTranNumber) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_CONTRACT_PAYMENT.F_SUM_BALANCE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_CONT_PIDM", pContPidm);
			cmd.addParameter("@P_CONT_TRAN_NUMBER", pContTranNumber);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static void pAdjustBalance(NNumber pContPidm,NNumber pContTranNumber,NNumber pTranNumber,NNumber pAdjustAmount) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_CONTRACT_PAYMENT.P_ADJUST_BALANCE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CONT_PIDM", pContPidm);
			cmd.addParameter("@P_CONT_TRAN_NUMBER", pContTranNumber);
			cmd.addParameter("@P_TRAN_NUMBER", pTranNumber);
			cmd.addParameter("@P_ADJUST_AMOUNT", pAdjustAmount);
				
			cmd.execute();


		}
		
		public static void pCreate(NNumber pContPidm,NNumber pContTranNumber,NNumber pStuPidm,NString pTermCode,NNumber pContractNumber,NNumber pAmount,NNumber pBalance,NNumber pRfndStdnAmt,NNumber pRfndContAmt,NString pNameProvided,NNumber pTranNumberPaid,NString pFinalInd,NString pRefundInd,NString pUserId,NString pDataOrigin,Ref<NNumber> pTranNumberOut,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_CONTRACT_PAYMENT.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CONT_PIDM", pContPidm);
			cmd.addParameter("@P_CONT_TRAN_NUMBER", pContTranNumber);
			cmd.addParameter("@P_STU_PIDM", pStuPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_CONTRACT_NUMBER", pContractNumber);
			cmd.addParameter("@P_AMOUNT", pAmount);
			cmd.addParameter("@P_BALANCE", pBalance);
			cmd.addParameter("@P_RFND_STDN_AMT", pRfndStdnAmt);
			cmd.addParameter("@P_RFND_CONT_AMT", pRfndContAmt);
			cmd.addParameter("@P_NAME_PROVIDED", pNameProvided);
			cmd.addParameter("@P_TRAN_NUMBER_PAID", pTranNumberPaid);
			cmd.addParameter("@P_FINAL_IND", pFinalInd);
			cmd.addParameter("@P_REFUND_IND", pRefundInd);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_TRAN_NUMBER_OUT", NNumber.class);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pTranNumberOut.val = cmd.getParameterValue("@P_TRAN_NUMBER_OUT", NNumber.class);
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NNumber pContPidm,NNumber pContTranNumber,NNumber pTranNumber,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_CONTRACT_PAYMENT.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CONT_PIDM", pContPidm);
			cmd.addParameter("@P_CONT_TRAN_NUMBER", pContTranNumber);
			cmd.addParameter("@P_TRAN_NUMBER", pTranNumber);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pDeleteAll(NNumber pContPidm,NNumber pContTranNumber) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_CONTRACT_PAYMENT.P_DELETE_ALL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CONT_PIDM", pContPidm);
			cmd.addParameter("@P_CONT_TRAN_NUMBER", pContTranNumber);
				
			cmd.execute();


		}
		
		public static void pLock(NNumber pContPidm,NNumber pContTranNumber,NNumber pTranNumber,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_CONTRACT_PAYMENT.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CONT_PIDM", pContPidm);
			cmd.addParameter("@P_CONT_TRAN_NUMBER", pContTranNumber);
			cmd.addParameter("@P_TRAN_NUMBER", pTranNumber);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pOverpayToContract(NNumber pContPidm,NNumber pContTranNumber,NNumber pTranNumber,NString pDetailCode,NString pDesc,NNumber pAmount,NString pUserId,NString pDataOrigin) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_CONTRACT_PAYMENT.P_OVERPAY_TO_CONTRACT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CONT_PIDM", pContPidm);
			cmd.addParameter("@P_CONT_TRAN_NUMBER", pContTranNumber);
			cmd.addParameter("@P_TRAN_NUMBER", pTranNumber);
			cmd.addParameter("@P_DETAIL_CODE", pDetailCode);
			cmd.addParameter("@P_DESC", pDesc);
			cmd.addParameter("@P_AMOUNT", pAmount);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
				
			cmd.execute();


		}
		
		public static void pOverpayToStudent(NNumber pContPidm,NNumber pContTranNumber,NNumber pTranNumber,NString pDetailCode,NString pDesc,NNumber pAmount,NString pUserId,NString pDataOrigin) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_CONTRACT_PAYMENT.P_OVERPAY_TO_STUDENT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CONT_PIDM", pContPidm);
			cmd.addParameter("@P_CONT_TRAN_NUMBER", pContTranNumber);
			cmd.addParameter("@P_TRAN_NUMBER", pTranNumber);
			cmd.addParameter("@P_DETAIL_CODE", pDetailCode);
			cmd.addParameter("@P_DESC", pDesc);
			cmd.addParameter("@P_AMOUNT", pAmount);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
				
			cmd.execute();


		}
		
		public static void pUpdate(NNumber pContPidm,NNumber pContTranNumber,NNumber pTranNumber,NNumber pStuPidm,NString pTermCode,NNumber pContractNumber,NNumber pAmount,NNumber pBalance,NNumber pRfndStdnAmt,NNumber pRfndContAmt,NString pNameProvided,NNumber pTranNumberPaid,NString pFinalInd,NString pRefundInd,NString pUserId,NString pDataOrigin,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_CONTRACT_PAYMENT.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CONT_PIDM", pContPidm);
			cmd.addParameter("@P_CONT_TRAN_NUMBER", pContTranNumber);
			cmd.addParameter("@P_TRAN_NUMBER", pTranNumber);
			cmd.addParameter("@P_STU_PIDM", pStuPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_CONTRACT_NUMBER", pContractNumber);
			cmd.addParameter("@P_AMOUNT", pAmount);
			cmd.addParameter("@P_BALANCE", pBalance);
			cmd.addParameter("@P_RFND_STDN_AMT", pRfndStdnAmt);
			cmd.addParameter("@P_RFND_CONT_AMT", pRfndContAmt);
			cmd.addParameter("@P_NAME_PROVIDED", pNameProvided);
			cmd.addParameter("@P_TRAN_NUMBER_PAID", pTranNumberPaid);
			cmd.addParameter("@P_FINAL_IND", pFinalInd);
			cmd.addParameter("@P_REFUND_IND", pRefundInd);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="ContractPaymentRecRow", dataSourceName="CONTRACT_PAYMENT_REC")
	public static class ContractPaymentRecRow
	{
		@DbRecordField(dataSourceName="R_CONT_PIDM")
		public NNumber RContPidm;
		@DbRecordField(dataSourceName="R_CONT_TRAN_NUMBER")
		public NNumber RContTranNumber;
		@DbRecordField(dataSourceName="R_TRAN_NUMBER")
		public NNumber RTranNumber;
		@DbRecordField(dataSourceName="R_STU_PIDM")
		public NNumber RStuPidm;
		@DbRecordField(dataSourceName="R_TERM_CODE")
		public NString RTermCode;
		@DbRecordField(dataSourceName="R_CONTRACT_NUMBER")
		public NNumber RContractNumber;
		@DbRecordField(dataSourceName="R_AMOUNT")
		public NNumber RAmount;
		@DbRecordField(dataSourceName="R_BALANCE")
		public NNumber RBalance;
		@DbRecordField(dataSourceName="R_RFND_STDN_AMT")
		public NNumber RRfndStdnAmt;
		@DbRecordField(dataSourceName="R_RFND_CONT_AMT")
		public NNumber RRfndContAmt;
		@DbRecordField(dataSourceName="R_NAME_PROVIDED")
		public NString RNameProvided;
		@DbRecordField(dataSourceName="R_TRAN_NUMBER_PAID")
		public NNumber RTranNumberPaid;
		@DbRecordField(dataSourceName="R_FINAL_IND")
		public NString RFinalInd;
		@DbRecordField(dataSourceName="R_REFUND_IND")
		public NString RRefundInd;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_CREATE_USER")
		public NString RCreateUser;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
