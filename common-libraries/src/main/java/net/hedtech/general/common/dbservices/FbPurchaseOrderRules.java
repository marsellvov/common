package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class FbPurchaseOrderRules {
		public static void pRegisterAcctgEntity(NNumber pOperationId,NString pCode,NNumber pChangeSeqNum,NNumber pItem,NNumber pSeqNum) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_PURCHASE_ORDER_RULES.P_REGISTER_ACCTG_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_ID", pOperationId);
			cmd.addParameter("@P_CODE", pCode);
			cmd.addParameter("@P_CHANGE_SEQ_NUM", pChangeSeqNum);
			cmd.addParameter("@P_ITEM", pItem);
			cmd.addParameter("@P_SEQ_NUM", pSeqNum);
				
			cmd.execute();


		}
		
		public static void pRegisterAcctgEntity(NNumber pOperationId,NString pPohdCode,NNumber pChangeSeqNum,NNumber pItem,NNumber pSeqNum,NDate pActivityDate,NString pUserId,NNumber pAmt,NNumber pDiscAmt,NNumber pTaxAmt,NNumber pAddlChrgAmt,NString pFsyrCode,NString pPeriod,NString pRuclCodePo,NString pDiscRuclCode,NString pTaxRuclCode,NString pAddlRuclCode,NString pRuclCodeLiq,NString pCoasCode,NString pAcciCode,NString pFundCode,NString pOrgnCode,NString pAcctCode,NString pProgCode,NString pActvCode,NString pLocnCode,NString pProjCode,NString pSuspInd,NString pNsfSuspInd,NDate pPostDate,NString pApprInd,NString pNsfOverrideInd,NString pClosedInd,NNumber pConvertAmt,NNumber pConvertDiscAmt,NNumber pConvertTaxAmt,NNumber pConvertAddlChrgAmt,NNumber pApprAmtPct,NNumber pDiscAmtPct,NNumber pAddlAmtPct,NNumber pTaxAmtPct) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_PURCHASE_ORDER_RULES.P_REGISTER_ACCTG_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_ID", pOperationId);
			cmd.addParameter("@P_POHD_CODE", pPohdCode);
			cmd.addParameter("@P_CHANGE_SEQ_NUM", pChangeSeqNum);
			cmd.addParameter("@P_ITEM", pItem);
			cmd.addParameter("@P_SEQ_NUM", pSeqNum);
			cmd.addParameter("@P_ACTIVITY_DATE", pActivityDate);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_AMT", pAmt);
			cmd.addParameter("@P_DISC_AMT", pDiscAmt);
			cmd.addParameter("@P_TAX_AMT", pTaxAmt);
			cmd.addParameter("@P_ADDL_CHRG_AMT", pAddlChrgAmt);
			cmd.addParameter("@P_FSYR_CODE", pFsyrCode);
			cmd.addParameter("@P_PERIOD", pPeriod);
			cmd.addParameter("@P_RUCL_CODE_PO", pRuclCodePo);
			cmd.addParameter("@P_DISC_RUCL_CODE", pDiscRuclCode);
			cmd.addParameter("@P_TAX_RUCL_CODE", pTaxRuclCode);
			cmd.addParameter("@P_ADDL_RUCL_CODE", pAddlRuclCode);
			cmd.addParameter("@P_RUCL_CODE_LIQ", pRuclCodeLiq);
			cmd.addParameter("@P_COAS_CODE", pCoasCode);
			cmd.addParameter("@P_ACCI_CODE", pAcciCode);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_ORGN_CODE", pOrgnCode);
			cmd.addParameter("@P_ACCT_CODE", pAcctCode);
			cmd.addParameter("@P_PROG_CODE", pProgCode);
			cmd.addParameter("@P_ACTV_CODE", pActvCode);
			cmd.addParameter("@P_LOCN_CODE", pLocnCode);
			cmd.addParameter("@P_PROJ_CODE", pProjCode);
			cmd.addParameter("@P_SUSP_IND", pSuspInd);
			cmd.addParameter("@P_NSF_SUSP_IND", pNsfSuspInd);
			cmd.addParameter("@P_POST_DATE", pPostDate);
			cmd.addParameter("@P_APPR_IND", pApprInd);
			cmd.addParameter("@P_NSF_OVERRIDE_IND", pNsfOverrideInd);
			cmd.addParameter("@P_CLOSED_IND", pClosedInd);
			cmd.addParameter("@P_CONVERT_AMT", pConvertAmt);
			cmd.addParameter("@P_CONVERT_DISC_AMT", pConvertDiscAmt);
			cmd.addParameter("@P_CONVERT_TAX_AMT", pConvertTaxAmt);
			cmd.addParameter("@P_CONVERT_ADDL_CHRG_AMT", pConvertAddlChrgAmt);
			cmd.addParameter("@P_APPR_AMT_PCT", pApprAmtPct);
			cmd.addParameter("@P_DISC_AMT_PCT", pDiscAmtPct);
			cmd.addParameter("@P_ADDL_AMT_PCT", pAddlAmtPct);
			cmd.addParameter("@P_TAX_AMT_PCT", pTaxAmtPct);
				
			cmd.execute();


		}
		
		public static void pRegisterHeaderEntity(NNumber pOperationId,NString pCode,NString pDocRefCode,NNumber pChangeSeqNum) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_PURCHASE_ORDER_RULES.P_REGISTER_HEADER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_ID", pOperationId);
			cmd.addParameter("@P_CODE", pCode);
			cmd.addParameter("@P_DOC_REF_CODE", pDocRefCode);
			cmd.addParameter("@P_CHANGE_SEQ_NUM", pChangeSeqNum);
				
			cmd.execute();


		}
		
		public static void pRegisterHeaderEntity(NNumber pOperationId,NString pCode,NNumber pChangeSeqNum,NDate pActivityDate,NString pUserId,NDate pPoDate,NDate pTransDate,NString pBlanketCode,NString pBlanketInd,NDate pBlanketTermDate,NString pClosedInd,NString pCompleteInd,NString pPrintInd,NDate pPoPrintedDate,NNumber pVendPidm,NString pAtypCode,NNumber pAtypSeqNum,NString pBuyrCode,NDate pReqdDate,NString pCoasCode,NString pOrgnCode,NString pShipCode,NString pTratCode,NString pFobCode,NString pDiscCode,NString pTextInd,NString pClauseInd,NNumber pCarrierPidm,NString pTrskCode,NString pPmntCode,NString pPrtAck,NDate pAckDate,NString pApprInd,NString pRushInd,NDate pRexpDate,NNumber pAddlChrgAmt,NNumber pRushAmt,NString pSuspInd,NString pSuspIndAddl,NString pCancelInd,NDate pCancelDate,NDate pPostDate,NString pReqBidInd,NString pEditDeferInd,NString pPclsCode,NString pTgrpCode,NString pRecommVendName,NString pCurrCode,NString pDisbAgentInd,NString pNsfOnOffInd,NString pInventoryPoInd,NString pSingleAcctgInd,NString pDocCntrlInd,NString pTeleCode,NString pCrsnCode,NString pDeliveryComment,NString pEmailAddr,NString pFaxArea,NString pFaxNumber,NString pFaxExt,NString pAttentionTo,NString pVendorContact,NString pPoTypeInd,NString pVendEmailAddr,NString pName,NString pPhoneArea,NString pPhoneNum,NString pPhoneExt,NString pCopiedFrom,NDate pClosedDate,NString pFtrmCode,NString pEdiInd,NString pMatchRequired,NString pOriginCode,NString pDocRefCode,NString pPoStatus,NString pStatusMessage,NString pCtryCodePhone,NString pCtryCodeFax) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_PURCHASE_ORDER_RULES.P_REGISTER_HEADER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_ID", pOperationId);
			cmd.addParameter("@P_CODE", pCode);
			cmd.addParameter("@P_CHANGE_SEQ_NUM", pChangeSeqNum);
			cmd.addParameter("@P_ACTIVITY_DATE", pActivityDate);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_PO_DATE", pPoDate);
			cmd.addParameter("@P_TRANS_DATE", pTransDate);
			cmd.addParameter("@P_BLANKET_CODE", pBlanketCode);
			cmd.addParameter("@P_BLANKET_IND", pBlanketInd);
			cmd.addParameter("@P_BLANKET_TERM_DATE", pBlanketTermDate);
			cmd.addParameter("@P_CLOSED_IND", pClosedInd);
			cmd.addParameter("@P_COMPLETE_IND", pCompleteInd);
			cmd.addParameter("@P_PRINT_IND", pPrintInd);
			cmd.addParameter("@P_PO_PRINTED_DATE", pPoPrintedDate);
			cmd.addParameter("@P_VEND_PIDM", pVendPidm);
			cmd.addParameter("@P_ATYP_CODE", pAtypCode);
			cmd.addParameter("@P_ATYP_SEQ_NUM", pAtypSeqNum);
			cmd.addParameter("@P_BUYR_CODE", pBuyrCode);
			cmd.addParameter("@P_REQD_DATE", pReqdDate);
			cmd.addParameter("@P_COAS_CODE", pCoasCode);
			cmd.addParameter("@P_ORGN_CODE", pOrgnCode);
			cmd.addParameter("@P_SHIP_CODE", pShipCode);
			cmd.addParameter("@P_TRAT_CODE", pTratCode);
			cmd.addParameter("@P_FOB_CODE", pFobCode);
			cmd.addParameter("@P_DISC_CODE", pDiscCode);
			cmd.addParameter("@P_TEXT_IND", pTextInd);
			cmd.addParameter("@P_CLAUSE_IND", pClauseInd);
			cmd.addParameter("@P_CARRIER_PIDM", pCarrierPidm);
			cmd.addParameter("@P_TRSK_CODE", pTrskCode);
			cmd.addParameter("@P_PMNT_CODE", pPmntCode);
			cmd.addParameter("@P_PRT_ACK", pPrtAck);
			cmd.addParameter("@P_ACK_DATE", pAckDate);
			cmd.addParameter("@P_APPR_IND", pApprInd);
			cmd.addParameter("@P_RUSH_IND", pRushInd);
			cmd.addParameter("@P_REXP_DATE", pRexpDate);
			cmd.addParameter("@P_ADDL_CHRG_AMT", pAddlChrgAmt);
			cmd.addParameter("@P_RUSH_AMT", pRushAmt);
			cmd.addParameter("@P_SUSP_IND", pSuspInd);
			cmd.addParameter("@P_SUSP_IND_ADDL", pSuspIndAddl);
			cmd.addParameter("@P_CANCEL_IND", pCancelInd);
			cmd.addParameter("@P_CANCEL_DATE", pCancelDate);
			cmd.addParameter("@P_POST_DATE", pPostDate);
			cmd.addParameter("@P_REQ_BID_IND", pReqBidInd);
			cmd.addParameter("@P_EDIT_DEFER_IND", pEditDeferInd);
			cmd.addParameter("@P_PCLS_CODE", pPclsCode);
			cmd.addParameter("@P_TGRP_CODE", pTgrpCode);
			cmd.addParameter("@P_RECOMM_VEND_NAME", pRecommVendName);
			cmd.addParameter("@P_CURR_CODE", pCurrCode);
			cmd.addParameter("@P_DISB_AGENT_IND", pDisbAgentInd);
			cmd.addParameter("@P_NSF_ON_OFF_IND", pNsfOnOffInd);
			cmd.addParameter("@P_INVENTORY_PO_IND", pInventoryPoInd);
			cmd.addParameter("@P_SINGLE_ACCTG_IND", pSingleAcctgInd);
			cmd.addParameter("@P_DOC_CNTRL_IND", pDocCntrlInd);
			cmd.addParameter("@P_TELE_CODE", pTeleCode);
			cmd.addParameter("@P_CRSN_CODE", pCrsnCode);
			cmd.addParameter("@P_DELIVERY_COMMENT", pDeliveryComment);
			cmd.addParameter("@P_EMAIL_ADDR", pEmailAddr);
			cmd.addParameter("@P_FAX_AREA", pFaxArea);
			cmd.addParameter("@P_FAX_NUMBER", pFaxNumber);
			cmd.addParameter("@P_FAX_EXT", pFaxExt);
			cmd.addParameter("@P_ATTENTION_TO", pAttentionTo);
			cmd.addParameter("@P_VENDOR_CONTACT", pVendorContact);
			cmd.addParameter("@P_PO_TYPE_IND", pPoTypeInd);
			cmd.addParameter("@P_VEND_EMAIL_ADDR", pVendEmailAddr);
			cmd.addParameter("@P_NAME", pName);
			cmd.addParameter("@P_PHONE_AREA", pPhoneArea);
			cmd.addParameter("@P_PHONE_NUM", pPhoneNum);
			cmd.addParameter("@P_PHONE_EXT", pPhoneExt);
			cmd.addParameter("@P_COPIED_FROM", pCopiedFrom);
			cmd.addParameter("@P_CLOSED_DATE", pClosedDate);
			cmd.addParameter("@P_FTRM_CODE", pFtrmCode);
			cmd.addParameter("@P_EDI_IND", pEdiInd);
			cmd.addParameter("@P_MATCH_REQUIRED", pMatchRequired);
			cmd.addParameter("@P_ORIGIN_CODE", pOriginCode);
			cmd.addParameter("@P_DOC_REF_CODE", pDocRefCode);
			cmd.addParameter("@P_PO_STATUS", pPoStatus);
			cmd.addParameter("@P_STATUS_MESSAGE", pStatusMessage);
			cmd.addParameter("@P_CTRY_CODE_PHONE", pCtryCodePhone);
			cmd.addParameter("@P_CTRY_CODE_FAX", pCtryCodeFax);
				
			cmd.execute();


		}
		
		public static void pRegisterItemEntity(NNumber pOperationId,NString pCode,NNumber pChangeSeqNum,NNumber pItem) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_PURCHASE_ORDER_RULES.P_REGISTER_ITEM_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_ID", pOperationId);
			cmd.addParameter("@P_CODE", pCode);
			cmd.addParameter("@P_CHANGE_SEQ_NUM", pChangeSeqNum);
			cmd.addParameter("@P_ITEM", pItem);
				
			cmd.execute();


		}
		
		public static void pRegisterItemEntity(NNumber pOperationId,NString pPohdCode,NNumber pChangeSeqNum,NDate pActivityDate,NString pUserId,NNumber pItem,NString pCommCode,NString pCommDesc,NString pUomsCode,NNumber pUnitPrice,NNumber pLiqAmt,NNumber pQty,NNumber pDiscAmt,NNumber pTaxAmt,NString pVendRefNum,NString pAgreCode,NString pSuspInd,NString pClosedInd,NString pCancelInd,NDate pCancelDate,NString pTtagNum,NString pTextUsage,NNumber pAddlChrgAmt,NNumber pConvertUnitPrice,NNumber pConvertDiscAmt,NNumber pConvertTaxAmt,NNumber pConvertAddlChrgAmt,NString pTgrpCode,NNumber pExtAmt,NNumber pBoRemainBal,NString pDescChgeInd,NString pShipCode,NDate pReqdDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_PURCHASE_ORDER_RULES.P_REGISTER_ITEM_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_ID", pOperationId);
			cmd.addParameter("@P_POHD_CODE", pPohdCode);
			cmd.addParameter("@P_CHANGE_SEQ_NUM", pChangeSeqNum);
			cmd.addParameter("@P_ACTIVITY_DATE", pActivityDate);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_ITEM", pItem);
			cmd.addParameter("@P_COMM_CODE", pCommCode);
			cmd.addParameter("@P_COMM_DESC", pCommDesc);
			cmd.addParameter("@P_UOMS_CODE", pUomsCode);
			cmd.addParameter("@P_UNIT_PRICE", pUnitPrice);
			cmd.addParameter("@P_LIQ_AMT", pLiqAmt);
			cmd.addParameter("@P_QTY", pQty);
			cmd.addParameter("@P_DISC_AMT", pDiscAmt);
			cmd.addParameter("@P_TAX_AMT", pTaxAmt);
			cmd.addParameter("@P_VEND_REF_NUM", pVendRefNum);
			cmd.addParameter("@P_AGRE_CODE", pAgreCode);
			cmd.addParameter("@P_SUSP_IND", pSuspInd);
			cmd.addParameter("@P_CLOSED_IND", pClosedInd);
			cmd.addParameter("@P_CANCEL_IND", pCancelInd);
			cmd.addParameter("@P_CANCEL_DATE", pCancelDate);
			cmd.addParameter("@P_TTAG_NUM", pTtagNum);
			cmd.addParameter("@P_TEXT_USAGE", pTextUsage);
			cmd.addParameter("@P_ADDL_CHRG_AMT", pAddlChrgAmt);
			cmd.addParameter("@P_CONVERT_UNIT_PRICE", pConvertUnitPrice);
			cmd.addParameter("@P_CONVERT_DISC_AMT", pConvertDiscAmt);
			cmd.addParameter("@P_CONVERT_TAX_AMT", pConvertTaxAmt);
			cmd.addParameter("@P_CONVERT_ADDL_CHRG_AMT", pConvertAddlChrgAmt);
			cmd.addParameter("@P_TGRP_CODE", pTgrpCode);
			cmd.addParameter("@P_EXT_AMT", pExtAmt);
			cmd.addParameter("@P_BO_REMAIN_BAL", pBoRemainBal);
			cmd.addParameter("@P_DESC_CHGE_IND", pDescChgeInd);
			cmd.addParameter("@P_SHIP_CODE", pShipCode);
			cmd.addParameter("@P_REQD_DATE", pReqdDate);
				
			cmd.execute();


		}
		
		public static void pRegisterPo(NString poCode,NString poDocRef,NNumber poChgSeq,NString action) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_PURCHASE_ORDER_RULES.P_REGISTER_PO", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PO_CODE", poCode);
			cmd.addParameter("@PO_DOC_REF", poDocRef);
			cmd.addParameter("@PO_CHG_SEQ", poChgSeq);
			cmd.addParameter("@ACTION", action);
				
			cmd.execute();


		}
		
		public static void pRegisterPo(DataCursor fpbpohdCursor,DataCursor fprpodtCursor,DataCursor fprpodaCursor,NString action) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_PURCHASE_ORDER_RULES.P_REGISTER_PO", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@FPBPOHD_CURSOR", DataCursor.class);
			cmd.addParameter("@FPRPODT_CURSOR", DataCursor.class);
			cmd.addParameter("@FPRPODA_CURSOR", DataCursor.class);
			cmd.addParameter("@ACTION", action);
				
			cmd.execute();


		}
		
	
	
	
}
