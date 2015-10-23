package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class TbMiscDetailRules {
		public static void pRegisterEntity(NNumber pOperationType,NString pPayDetailCode,NString pChargeDetailCode,NNumber pAmount,NString pDesc,NNumber pReceiptNumber,NString pUser,NNumber pTranNumber,NString pAcctFeedInd,NString pChargeCoas,NString pChargeAcci,NString pChargeFund,NString pChargeOrgn,NString pChargeAcct,NString pChargeProg,NString pChargeActv,NString pChargeLocn,NString pPayCoas,NString pPayAcci,NString pPayFund,NString pPayOrgn,NString pPayAcct,NString pPayProg,NString pPayActv,NString pPayLocn,NNumber pSessionNumber,NDate pCshrEndDate,NString pChargeAccount,NString pPayAccount,NString pPayRuclCode,NString pChargeRuclCode,NDate pTransDate,NString pDocumentNumber,NString pDrCrInd,NString pCurrCode,NNumber pForeignAmount,NDate pFeedDate,NString pFeedDocCode,NNumber pPidm,NString pCcrdCode,NDate pCardExpDate,NString pPaymentId,NString pCardAuthNumber,NString pMerchantId,NString pDataOrigin,NString pCreateSource,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_MISC_DETAIL_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_PAY_DETAIL_CODE", pPayDetailCode);
			cmd.addParameter("@P_CHARGE_DETAIL_CODE", pChargeDetailCode);
			cmd.addParameter("@P_AMOUNT", pAmount);
			cmd.addParameter("@P_DESC", pDesc);
			cmd.addParameter("@P_RECEIPT_NUMBER", pReceiptNumber);
			cmd.addParameter("@P_USER", pUser);
			cmd.addParameter("@P_TRAN_NUMBER", pTranNumber);
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
			cmd.addParameter("@P_FEED_DATE", pFeedDate);
			cmd.addParameter("@P_FEED_DOC_CODE", pFeedDocCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_CCRD_CODE", pCcrdCode);
			cmd.addParameter("@P_CARD_EXP_DATE", pCardExpDate);
			cmd.addParameter("@P_PAYMENT_ID", pPaymentId);
			cmd.addParameter("@P_CARD_AUTH_NUMBER", pCardAuthNumber);
			cmd.addParameter("@P_MERCHANT_ID", pMerchantId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_CREATE_SOURCE", pCreateSource);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidCreate() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_MISC_DETAIL_RULES.P_VALID_CREATE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pValidUpdate(Ref<TbMiscDetail.MiscDetailRecRow> lvValidationRecInout,TbMiscDetail.MiscDetailRecRow lvExistingRec) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_MISC_DETAIL_RULES.P_VALID_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter(DbTypes.createStructType("LV_VALIDATION_REC_INOUT", lvValidationRecInout.val, TbMiscDetail.MiscDetailRecRow.class, true));
			cmd.addParameter(DbTypes.createStructType("LV_EXISTING_REC", lvExistingRec, TbMiscDetail.MiscDetailRecRow.class ));
				
			cmd.execute();
			lvValidationRecInout.val = cmd.getParameterValue("@LV_VALIDATION_REC_INOUT", TbMiscDetail.MiscDetailRecRow.class);


		}
		
	
	
	
}
