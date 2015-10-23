package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class TbDetailCodeRules {
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_DETAIL_CODE_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NString pDetailCode,NString pDesc,NString pTypeInd,NString pPriority,NString pLikeTermInd,NString pDcatCode,NNumber pAmount,NString pTermCode,NDate pEffectiveDate,NString pRefundableInd,NString pReceiptInd,NString pRefundInd,NString pPaytCode,NString pPrebillPrintInd,NString pGlNosEnterable,NString pTaxtCode,NString pTbdcInd,NString pDetailCodeInd,NString pDetcActiveInd,NString pDirdInd,NString pTivInd,NString pInstChgInd,NString pLikeAidyInd,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_DETAIL_CODE_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_DETAIL_CODE", pDetailCode);
			cmd.addParameter("@P_DESC", pDesc);
			cmd.addParameter("@P_TYPE_IND", pTypeInd);
			cmd.addParameter("@P_PRIORITY", pPriority);
			cmd.addParameter("@P_LIKE_TERM_IND", pLikeTermInd);
			cmd.addParameter("@P_DCAT_CODE", pDcatCode);
			cmd.addParameter("@P_AMOUNT", pAmount);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_EFFECTIVE_DATE", pEffectiveDate);
			cmd.addParameter("@P_REFUNDABLE_IND", pRefundableInd);
			cmd.addParameter("@P_RECEIPT_IND", pReceiptInd);
			cmd.addParameter("@P_REFUND_IND", pRefundInd);
			cmd.addParameter("@P_PAYT_CODE", pPaytCode);
			cmd.addParameter("@P_PREBILL_PRINT_IND", pPrebillPrintInd);
			cmd.addParameter("@P_GL_NOS_ENTERABLE", pGlNosEnterable);
			cmd.addParameter("@P_TAXT_CODE", pTaxtCode);
			cmd.addParameter("@P_TBDC_IND", pTbdcInd);
			cmd.addParameter("@P_DETAIL_CODE_IND", pDetailCodeInd);
			cmd.addParameter("@P_DETC_ACTIVE_IND", pDetcActiveInd);
			cmd.addParameter("@P_DIRD_IND", pDirdInd);
			cmd.addParameter("@P_TIV_IND", pTivInd);
			cmd.addParameter("@P_INST_CHG_IND", pInstChgInd);
			cmd.addParameter("@P_LIKE_AIDY_IND", pLikeAidyInd);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NString pDetailCode,NString pDesc,NString pTypeInd,NString pPriority,NString pLikeTermInd,NString pDcatCode,NNumber pAmount,NString pTermCode,NDate pEffectiveDate,NString pRefundableInd,NString pReceiptInd,NString pRefundInd,NString pPaytCode,NString pPrebillPrintInd,NString pGlNosEnterable,NString pTaxtCode,NString pTbdcInd,NString pDetailCodeInd,NString pDetcActiveInd,NString pDirdInd,NString pTivInd,NString pInstChgInd,NString pLikeAidyInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_DETAIL_CODE_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DETAIL_CODE", pDetailCode);
			cmd.addParameter("@P_DESC", pDesc);
			cmd.addParameter("@P_TYPE_IND", pTypeInd);
			cmd.addParameter("@P_PRIORITY", pPriority);
			cmd.addParameter("@P_LIKE_TERM_IND", pLikeTermInd);
			cmd.addParameter("@P_DCAT_CODE", pDcatCode);
			cmd.addParameter("@P_AMOUNT", pAmount);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_EFFECTIVE_DATE", pEffectiveDate);
			cmd.addParameter("@P_REFUNDABLE_IND", pRefundableInd);
			cmd.addParameter("@P_RECEIPT_IND", pReceiptInd);
			cmd.addParameter("@P_REFUND_IND", pRefundInd);
			cmd.addParameter("@P_PAYT_CODE", pPaytCode);
			cmd.addParameter("@P_PREBILL_PRINT_IND", pPrebillPrintInd);
			cmd.addParameter("@P_GL_NOS_ENTERABLE", pGlNosEnterable);
			cmd.addParameter("@P_TAXT_CODE", pTaxtCode);
			cmd.addParameter("@P_TBDC_IND", pTbdcInd);
			cmd.addParameter("@P_DETAIL_CODE_IND", pDetailCodeInd);
			cmd.addParameter("@P_DETC_ACTIVE_IND", pDetcActiveInd);
			cmd.addParameter("@P_DIRD_IND", pDirdInd);
			cmd.addParameter("@P_TIV_IND", pTivInd);
			cmd.addParameter("@P_INST_CHG_IND", pInstChgInd);
			cmd.addParameter("@P_LIKE_AIDY_IND", pLikeAidyInd);
				
			cmd.execute();


		}
		
	
	
	
}
