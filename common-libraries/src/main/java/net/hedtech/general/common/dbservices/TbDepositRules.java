package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class TbDepositRules {
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_DEPOSIT_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NNumber pPidm,NNumber pTranNumber,NString pTermCode,NString pDetailCodeDeposit,NString pDesc,NNumber pAmount,NString pDetailCodePayment,NString pAutoReleaseInd,NString pAcctFeedInd,NString pUser,NDate pEntryDate,NNumber pReceiptNumber,NNumber pMinAmount,NDate pExpirationDate,NDate pReleaseDate,NDate pEffectiveDate,NNumber pSessionNumber,NDate pCshrEndDate,NString pCurrCode,NDate pTransDate,NNumber pForeignAmount,NDate pFeedDate,NString pFeedDocCode,NString pAtypCode,NNumber pAtypSeqno,NString pDataOrigin,NString pCreateSource,NString pDocumentNumber,NNumber pBalance,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_DEPOSIT_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TRAN_NUMBER", pTranNumber);
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
			cmd.addParameter("@P_FEED_DATE", pFeedDate);
			cmd.addParameter("@P_FEED_DOC_CODE", pFeedDocCode);
			cmd.addParameter("@P_ATYP_CODE", pAtypCode);
			cmd.addParameter("@P_ATYP_SEQNO", pAtypSeqno);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_CREATE_SOURCE", pCreateSource);
			cmd.addParameter("@P_DOCUMENT_NUMBER", pDocumentNumber);
			cmd.addParameter("@P_BALANCE", pBalance);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidCreate() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_DEPOSIT_RULES.P_VALID_CREATE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pValidUpdate(Ref<TbDeposit.DepositRecRow> lvValidationRecInout,TbDeposit.DepositRecRow lvExistingRec) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_DEPOSIT_RULES.P_VALID_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter(DbTypes.createStructType("LV_VALIDATION_REC_INOUT", lvValidationRecInout.val, TbDeposit.DepositRecRow.class, true));
			cmd.addParameter(DbTypes.createStructType("LV_EXISTING_REC", lvExistingRec, TbDeposit.DepositRecRow.class ));
				
			cmd.execute();
			lvValidationRecInout.val = cmd.getParameterValue("@LV_VALIDATION_REC_INOUT", TbDeposit.DepositRecRow.class);


		}
		
		public static void pValidate() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_DEPOSIT_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
	
	
	
}
