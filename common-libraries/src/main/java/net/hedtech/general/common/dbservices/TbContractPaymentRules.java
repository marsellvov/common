package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class TbContractPaymentRules {
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_CONTRACT_PAYMENT_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NNumber pContPidm,NNumber pContTranNumber,NNumber pTranNumber,NNumber pStuPidm,NString pTermCode,NNumber pContractNumber,NNumber pAmount,NNumber pBalance,NNumber pRfndStdnAmt,NNumber pRfndContAmt,NString pNameProvided,NNumber pTranNumberPaid,NString pFinalInd,NString pRefundInd,NString pUserId,NString pCreateUser,NString pDataOrigin,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_CONTRACT_PAYMENT_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
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
			cmd.addParameter("@P_CREATE_USER", pCreateUser);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NNumber pContPidm,NNumber pContTranNumber,NNumber pTranNumber,NNumber pStuPidm,NString pTermCode,NNumber pContractNumber,NNumber pAmount,NNumber pBalance,NNumber pRfndStdnAmt,NNumber pRfndContAmt,NString pNameProvided,NNumber pTranNumberPaid,NString pFinalInd,NString pRefundInd,NString pUserId,NString pCreateUser,NString pDataOrigin,TbContractPayment.ContractPaymentRecRow pExistingRec) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_CONTRACT_PAYMENT_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
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
			cmd.addParameter("@P_CREATE_USER", pCreateUser);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter(DbTypes.createStructType("P_EXISTING_REC", pExistingRec, TbContractPayment.ContractPaymentRecRow.class ));
				
			cmd.execute();


		}
		
	
	
	
}
