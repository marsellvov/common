package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class FbInvoiceTaxRules {
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_INVOICE_TAX_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NString pInvhCode,NString pTratCode,NNumber pTaxAmt,NString pPayTaxTo,NNumber pItem,NNumber pSeqNum,NString pRuclCode,NNumber pPriorityNum,NNumber pTaxableAmt,NString pRebateInd,NNumber pConvertTaxAmt,NString pTratDescrip,NNumber pRebateAmt,NNumber pConvertRebateAmt,NNumber pRebatePercent,NString pCoasCodeRebate,NString pFundCodeRebate,NString pAcctCodeArRebate,NString pUserId,NString pDataOrigin,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_INVOICE_TAX_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INVH_CODE", pInvhCode);
			cmd.addParameter("@P_TRAT_CODE", pTratCode);
			cmd.addParameter("@P_TAX_AMT", pTaxAmt);
			cmd.addParameter("@P_PAY_TAX_TO", pPayTaxTo);
			cmd.addParameter("@P_ITEM", pItem);
			cmd.addParameter("@P_SEQ_NUM", pSeqNum);
			cmd.addParameter("@P_RUCL_CODE", pRuclCode);
			cmd.addParameter("@P_PRIORITY_NUM", pPriorityNum);
			cmd.addParameter("@P_TAXABLE_AMT", pTaxableAmt);
			cmd.addParameter("@P_REBATE_IND", pRebateInd);
			cmd.addParameter("@P_CONVERT_TAX_AMT", pConvertTaxAmt);
			cmd.addParameter("@P_TRAT_DESCRIP", pTratDescrip);
			cmd.addParameter("@P_REBATE_AMT", pRebateAmt);
			cmd.addParameter("@P_CONVERT_REBATE_AMT", pConvertRebateAmt);
			cmd.addParameter("@P_REBATE_PERCENT", pRebatePercent);
			cmd.addParameter("@P_COAS_CODE_REBATE", pCoasCodeRebate);
			cmd.addParameter("@P_FUND_CODE_REBATE", pFundCodeRebate);
			cmd.addParameter("@P_ACCT_CODE_AR_REBATE", pAcctCodeArRebate);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NString pInvhCode,NString pTratCode,NNumber pTaxAmt,NString pPayTaxTo,NNumber pItem,NNumber pSeqNum,NString pRuclCode,NNumber pPriorityNum,NNumber pTaxableAmt,NString pRebateInd,NNumber pConvertTaxAmt,NString pTratDescrip,NNumber pRebateAmt,NNumber pConvertRebateAmt,NNumber pRebatePercent,NString pCoasCodeRebate,NString pFundCodeRebate,NString pAcctCodeArRebate,NString pUserId,NString pDataOrigin) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_INVOICE_TAX_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_INVH_CODE", pInvhCode);
			cmd.addParameter("@P_TRAT_CODE", pTratCode);
			cmd.addParameter("@P_TAX_AMT", pTaxAmt);
			cmd.addParameter("@P_PAY_TAX_TO", pPayTaxTo);
			cmd.addParameter("@P_ITEM", pItem);
			cmd.addParameter("@P_SEQ_NUM", pSeqNum);
			cmd.addParameter("@P_RUCL_CODE", pRuclCode);
			cmd.addParameter("@P_PRIORITY_NUM", pPriorityNum);
			cmd.addParameter("@P_TAXABLE_AMT", pTaxableAmt);
			cmd.addParameter("@P_REBATE_IND", pRebateInd);
			cmd.addParameter("@P_CONVERT_TAX_AMT", pConvertTaxAmt);
			cmd.addParameter("@P_TRAT_DESCRIP", pTratDescrip);
			cmd.addParameter("@P_REBATE_AMT", pRebateAmt);
			cmd.addParameter("@P_CONVERT_REBATE_AMT", pConvertRebateAmt);
			cmd.addParameter("@P_REBATE_PERCENT", pRebatePercent);
			cmd.addParameter("@P_COAS_CODE_REBATE", pCoasCodeRebate);
			cmd.addParameter("@P_FUND_CODE_REBATE", pFundCodeRebate);
			cmd.addParameter("@P_ACCT_CODE_AR_REBATE", pAcctCodeArRebate);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
				
			cmd.execute();


		}
		
	
	
	
}
