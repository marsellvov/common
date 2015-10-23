package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class FbRequisitionRules {
		public static void pRegisterAcctgEntity(NNumber pOperationId,NString pReqhCode,NNumber pItem,NNumber pSeqNum,NDate pActivityDate,NString pUserId,NNumber pPct,NNumber pAmt,NString pFsyrCode,NString pPeriod,NString pRuclCode,NString pCoasCode,NString pAcciCode,NString pFundCode,NString pOrgnCode,NString pAcctCode,NString pProgCode,NString pActvCode,NString pLocnCode,NString pSuspInd,NString pNsfSuspInd,NString pCancelInd,NDate pCancelDate,NString pProjCode,NString pApprInd,NString pNsfOverrideInd,NString pAbalInd,NNumber pConvertedAmt,NString pClosedInd,NNumber pDiscAmt,NNumber pTaxAmt,NNumber pAddlChrgAmt,NNumber pConvertDiscAmt,NNumber pConvertTaxAmt,NNumber pConvertAddlChrgAmt,NNumber pDiscAmtPct,NNumber pAddlAmtPct,NNumber pTaxAmtPct,NString pDiscRuclCode,NString pTaxRuclCode,NString pAddlRuclCode,NString pRuclCodeLiq) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_REQUISITION_RULES.P_REGISTER_ACCTG_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_ID", pOperationId);
			cmd.addParameter("@P_REQH_CODE", pReqhCode);
			cmd.addParameter("@P_ITEM", pItem);
			cmd.addParameter("@P_SEQ_NUM", pSeqNum);
			cmd.addParameter("@P_ACTIVITY_DATE", pActivityDate);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_PCT", pPct);
			cmd.addParameter("@P_AMT", pAmt);
			cmd.addParameter("@P_FSYR_CODE", pFsyrCode);
			cmd.addParameter("@P_PERIOD", pPeriod);
			cmd.addParameter("@P_RUCL_CODE", pRuclCode);
			cmd.addParameter("@P_COAS_CODE", pCoasCode);
			cmd.addParameter("@P_ACCI_CODE", pAcciCode);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_ORGN_CODE", pOrgnCode);
			cmd.addParameter("@P_ACCT_CODE", pAcctCode);
			cmd.addParameter("@P_PROG_CODE", pProgCode);
			cmd.addParameter("@P_ACTV_CODE", pActvCode);
			cmd.addParameter("@P_LOCN_CODE", pLocnCode);
			cmd.addParameter("@P_SUSP_IND", pSuspInd);
			cmd.addParameter("@P_NSF_SUSP_IND", pNsfSuspInd);
			cmd.addParameter("@P_CANCEL_IND", pCancelInd);
			cmd.addParameter("@P_CANCEL_DATE", pCancelDate);
			cmd.addParameter("@P_PROJ_CODE", pProjCode);
			cmd.addParameter("@P_APPR_IND", pApprInd);
			cmd.addParameter("@P_NSF_OVERRIDE_IND", pNsfOverrideInd);
			cmd.addParameter("@P_ABAL_IND", pAbalInd);
			cmd.addParameter("@P_CONVERTED_AMT", pConvertedAmt);
			cmd.addParameter("@P_CLOSED_IND", pClosedInd);
			cmd.addParameter("@P_DISC_AMT", pDiscAmt);
			cmd.addParameter("@P_TAX_AMT", pTaxAmt);
			cmd.addParameter("@P_ADDL_CHRG_AMT", pAddlChrgAmt);
			cmd.addParameter("@P_CONVERT_DISC_AMT", pConvertDiscAmt);
			cmd.addParameter("@P_CONVERT_TAX_AMT", pConvertTaxAmt);
			cmd.addParameter("@P_CONVERT_ADDL_CHRG_AMT", pConvertAddlChrgAmt);
			cmd.addParameter("@P_DISC_AMT_PCT", pDiscAmtPct);
			cmd.addParameter("@P_ADDL_AMT_PCT", pAddlAmtPct);
			cmd.addParameter("@P_TAX_AMT_PCT", pTaxAmtPct);
			cmd.addParameter("@P_DISC_RUCL_CODE", pDiscRuclCode);
			cmd.addParameter("@P_TAX_RUCL_CODE", pTaxRuclCode);
			cmd.addParameter("@P_ADDL_RUCL_CODE", pAddlRuclCode);
			cmd.addParameter("@P_RUCL_CODE_LIQ", pRuclCodeLiq);
				
			cmd.execute();


		}
		
		public static void pRegisterHeaderEntity(NNumber pOperationId,NString pCode,NString pDocRefCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_REQUISITION_RULES.P_REGISTER_HEADER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_ID", pOperationId);
			cmd.addParameter("@P_CODE", pCode);
			cmd.addParameter("@P_DOC_REF_CODE", pDocRefCode);
				
			cmd.execute();


		}
		
		public static void pRegisterHeaderEntity(NNumber pOperationId,NString pCode,NDate pActivityDate,NString pUserId,NDate pReqhDate,NDate pTransDate,NString pName,NString pPhoneArea,NString pPhoneNum,NString pPhoneExt,NNumber pVendPidm,NString pAtypCode,NNumber pAtypSeqNum,NString pCoasCode,NString pOrgnCode,NDate pReqdDate,NString pCompleteInd,NString pPrintInd,NString pEncumbInd,NString pSuspInd,NString pCancelInd,NDate pCancelDate,NDate pPostDate,NString pApprInd,NString pTextInd,NString pEditDeferInd,NString pRecommVendName,NString pCurrCode,NString pNsfOnOffInd,NString pSingleAcctgInd,NString pClosedInd,NString pShipCode,NString pRqstTypeInd,NString pInventoryReqInd,NString pCrsnCode,NString pDeliveryComment,NString pEmailAddr,NString pFaxArea,NString pFaxNumber,NString pFaxExt,NString pAttentionTo,NString pVendorContact,NString pDiscCode,NString pVendEmailAddr,NString pCopiedFrom,NString pTgrpCode,NDate pReqPrintDate,NDate pClosedDate,NString pMatchRequired,NString pOriginCode,NString pDocRefCode,NString pStatus,NString pStatusMessage,NString pCtryCodePhone,NString pCtryCodeFax) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_REQUISITION_RULES.P_REGISTER_HEADER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_ID", pOperationId);
			cmd.addParameter("@P_CODE", pCode);
			cmd.addParameter("@P_ACTIVITY_DATE", pActivityDate);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_REQH_DATE", pReqhDate);
			cmd.addParameter("@P_TRANS_DATE", pTransDate);
			cmd.addParameter("@P_NAME", pName);
			cmd.addParameter("@P_PHONE_AREA", pPhoneArea);
			cmd.addParameter("@P_PHONE_NUM", pPhoneNum);
			cmd.addParameter("@P_PHONE_EXT", pPhoneExt);
			cmd.addParameter("@P_VEND_PIDM", pVendPidm);
			cmd.addParameter("@P_ATYP_CODE", pAtypCode);
			cmd.addParameter("@P_ATYP_SEQ_NUM", pAtypSeqNum);
			cmd.addParameter("@P_COAS_CODE", pCoasCode);
			cmd.addParameter("@P_ORGN_CODE", pOrgnCode);
			cmd.addParameter("@P_REQD_DATE", pReqdDate);
			cmd.addParameter("@P_COMPLETE_IND", pCompleteInd);
			cmd.addParameter("@P_PRINT_IND", pPrintInd);
			cmd.addParameter("@P_ENCUMB_IND", pEncumbInd);
			cmd.addParameter("@P_SUSP_IND", pSuspInd);
			cmd.addParameter("@P_CANCEL_IND", pCancelInd);
			cmd.addParameter("@P_CANCEL_DATE", pCancelDate);
			cmd.addParameter("@P_POST_DATE", pPostDate);
			cmd.addParameter("@P_APPR_IND", pApprInd);
			cmd.addParameter("@P_TEXT_IND", pTextInd);
			cmd.addParameter("@P_EDIT_DEFER_IND", pEditDeferInd);
			cmd.addParameter("@P_RECOMM_VEND_NAME", pRecommVendName);
			cmd.addParameter("@P_CURR_CODE", pCurrCode);
			cmd.addParameter("@P_NSF_ON_OFF_IND", pNsfOnOffInd);
			cmd.addParameter("@P_SINGLE_ACCTG_IND", pSingleAcctgInd);
			cmd.addParameter("@P_CLOSED_IND", pClosedInd);
			cmd.addParameter("@P_SHIP_CODE", pShipCode);
			cmd.addParameter("@P_RQST_TYPE_IND", pRqstTypeInd);
			cmd.addParameter("@P_INVENTORY_REQ_IND", pInventoryReqInd);
			cmd.addParameter("@P_CRSN_CODE", pCrsnCode);
			cmd.addParameter("@P_DELIVERY_COMMENT", pDeliveryComment);
			cmd.addParameter("@P_EMAIL_ADDR", pEmailAddr);
			cmd.addParameter("@P_FAX_AREA", pFaxArea);
			cmd.addParameter("@P_FAX_NUMBER", pFaxNumber);
			cmd.addParameter("@P_FAX_EXT", pFaxExt);
			cmd.addParameter("@P_ATTENTION_TO", pAttentionTo);
			cmd.addParameter("@P_VENDOR_CONTACT", pVendorContact);
			cmd.addParameter("@P_DISC_CODE", pDiscCode);
			cmd.addParameter("@P_VEND_EMAIL_ADDR", pVendEmailAddr);
			cmd.addParameter("@P_COPIED_FROM", pCopiedFrom);
			cmd.addParameter("@P_TGRP_CODE", pTgrpCode);
			cmd.addParameter("@P_REQ_PRINT_DATE", pReqPrintDate);
			cmd.addParameter("@P_CLOSED_DATE", pClosedDate);
			cmd.addParameter("@P_MATCH_REQUIRED", pMatchRequired);
			cmd.addParameter("@P_ORIGIN_CODE", pOriginCode);
			cmd.addParameter("@P_DOC_REF_CODE", pDocRefCode);
			cmd.addParameter("@P_STATUS", pStatus);
			cmd.addParameter("@P_STATUS_MESSAGE", pStatusMessage);
			cmd.addParameter("@P_CTRY_CODE_PHONE", pCtryCodePhone);
			cmd.addParameter("@P_CTRY_CODE_FAX", pCtryCodeFax);
				
			cmd.execute();


		}
		
		public static void pRegisterItemEntity(NNumber pOperationId,NString pReqhCode,NNumber pItem,NDate pActivityDate,NString pUserId,NString pCommCode,NString pCommDesc,NString pCoasCode,NString pOrgnCode,NString pBuyrCode,NNumber pQty,NString pUomsCode,NNumber pUnitPrice,NString pAgreCode,NDate pReqdDate,NString pShipCode,NNumber pVendPidm,NString pVendRefNum,NString pProjCode,NString pPohdCode,NNumber pPohdItem,NString pBidsCode,NString pCompleteInd,NString pSuspInd,NString pCancelInd,NDate pCancelDate,NString pClosedInd,NDate pPostDate,NString pTextUsage,NString pAtypCode,NNumber pAtypSeqNum,NString pRecommVendName,NString pCurrCode,NNumber pConvertedUnitPrice,NNumber pDiscAmt,NNumber pTaxAmt,NNumber pAddlChrgAmt,NNumber pConvertDiscAmt,NNumber pConvertTaxAmt,NNumber pConvertAddlChrgAmt,NString pTgrpCode,NNumber pAmt,NString pDescChgeInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_REQUISITION_RULES.P_REGISTER_ITEM_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_ID", pOperationId);
			cmd.addParameter("@P_REQH_CODE", pReqhCode);
			cmd.addParameter("@P_ITEM", pItem);
			cmd.addParameter("@P_ACTIVITY_DATE", pActivityDate);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_COMM_CODE", pCommCode);
			cmd.addParameter("@P_COMM_DESC", pCommDesc);
			cmd.addParameter("@P_COAS_CODE", pCoasCode);
			cmd.addParameter("@P_ORGN_CODE", pOrgnCode);
			cmd.addParameter("@P_BUYR_CODE", pBuyrCode);
			cmd.addParameter("@P_QTY", pQty);
			cmd.addParameter("@P_UOMS_CODE", pUomsCode);
			cmd.addParameter("@P_UNIT_PRICE", pUnitPrice);
			cmd.addParameter("@P_AGRE_CODE", pAgreCode);
			cmd.addParameter("@P_REQD_DATE", pReqdDate);
			cmd.addParameter("@P_SHIP_CODE", pShipCode);
			cmd.addParameter("@P_VEND_PIDM", pVendPidm);
			cmd.addParameter("@P_VEND_REF_NUM", pVendRefNum);
			cmd.addParameter("@P_PROJ_CODE", pProjCode);
			cmd.addParameter("@P_POHD_CODE", pPohdCode);
			cmd.addParameter("@P_POHD_ITEM", pPohdItem);
			cmd.addParameter("@P_BIDS_CODE", pBidsCode);
			cmd.addParameter("@P_COMPLETE_IND", pCompleteInd);
			cmd.addParameter("@P_SUSP_IND", pSuspInd);
			cmd.addParameter("@P_CANCEL_IND", pCancelInd);
			cmd.addParameter("@P_CANCEL_DATE", pCancelDate);
			cmd.addParameter("@P_CLOSED_IND", pClosedInd);
			cmd.addParameter("@P_POST_DATE", pPostDate);
			cmd.addParameter("@P_TEXT_USAGE", pTextUsage);
			cmd.addParameter("@P_ATYP_CODE", pAtypCode);
			cmd.addParameter("@P_ATYP_SEQ_NUM", pAtypSeqNum);
			cmd.addParameter("@P_RECOMM_VEND_NAME", pRecommVendName);
			cmd.addParameter("@P_CURR_CODE", pCurrCode);
			cmd.addParameter("@P_CONVERTED_UNIT_PRICE", pConvertedUnitPrice);
			cmd.addParameter("@P_DISC_AMT", pDiscAmt);
			cmd.addParameter("@P_TAX_AMT", pTaxAmt);
			cmd.addParameter("@P_ADDL_CHRG_AMT", pAddlChrgAmt);
			cmd.addParameter("@P_CONVERT_DISC_AMT", pConvertDiscAmt);
			cmd.addParameter("@P_CONVERT_TAX_AMT", pConvertTaxAmt);
			cmd.addParameter("@P_CONVERT_ADDL_CHRG_AMT", pConvertAddlChrgAmt);
			cmd.addParameter("@P_TGRP_CODE", pTgrpCode);
			cmd.addParameter("@P_AMT", pAmt);
			cmd.addParameter("@P_DESC_CHGE_IND", pDescChgeInd);
				
			cmd.execute();


		}
		
		public static void pRegisterReqn(NString reqCode,NString reqDocRef,NString action) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_REQUISITION_RULES.P_REGISTER_REQN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@REQ_CODE", reqCode);
			cmd.addParameter("@REQ_DOC_REF", reqDocRef);
			cmd.addParameter("@ACTION", action);
				
			cmd.execute();


		}
		
		public static void pRegisterReqn(DataCursor fpbreqhCursor,DataCursor fprreqdCursor,DataCursor fprreqaCursor,NString action) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_REQUISITION_RULES.P_REGISTER_REQN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@FPBREQH_CURSOR", DataCursor.class);
			cmd.addParameter("@FPRREQD_CURSOR", DataCursor.class);
			cmd.addParameter("@FPRREQA_CURSOR", DataCursor.class);
			cmd.addParameter("@ACTION", action);
				
			cmd.execute();


		}
		
	
	
	
}
