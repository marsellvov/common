package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class FbPurchaseOrder {
		public static NString fChangeOrderInProcess(NString pCode,NNumber pChangeSeqNum) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_PURCHASE_ORDER.F_CHANGE_ORDER_IN_PROCESS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_CODE", pCode);
			cmd.addParameter("@P_CHANGE_SEQ_NUM", pChangeSeqNum);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
//		public static List<StringNtRow> fCompleteOrder(NString pCode,NNumber pChangeSeqNum) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_PURCHASE_ORDER.F_COMPLETE_ORDER", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<StringNtRow>.class);
//			cmd.addParameter("@P_CODE", pCode);
//			cmd.addParameter("@P_CHANGE_SEQ_NUM", pChangeSeqNum);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<StringNtRow>.class);
//
//		}
		
		public static NString fCurrentVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_PURCHASE_ORDER.F_CURRENT_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NBool fDocCodeExists(NString pDocCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_PURCHASE_ORDER.F_DOC_CODE_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@P_DOC_CODE", pDocCode);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fDocRefCodeExists(NString pDocRefCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_PURCHASE_ORDER.F_DOC_REF_CODE_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@P_DOC_REF_CODE", pDocRefCode);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NString fDocumentRefCodeExists(NString pDocRefCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_PURCHASE_ORDER.F_DOCUMENT_REF_CODE_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_DOC_REF_CODE", pDocRefCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NBool fExistsAccounting(NString pPohdCode,NNumber pItem,NNumber pSeqNum,NNumber pChangeSeqNum) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_PURCHASE_ORDER.F_EXISTS_ACCOUNTING", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@P_POHD_CODE", pPohdCode);
			cmd.addParameter("@P_ITEM", pItem);
			cmd.addParameter("@P_SEQ_NUM", pSeqNum);
			cmd.addParameter("@P_CHANGE_SEQ_NUM", pChangeSeqNum);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fExistsHeader(NString pCode,NNumber pChangeSeqNum) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_PURCHASE_ORDER.F_EXISTS_HEADER", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@P_CODE", pCode);
			cmd.addParameter("@P_CHANGE_SEQ_NUM", pChangeSeqNum);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fExistsItem(NString pPohdCode,NNumber pItem,NNumber pChangeSeqNum) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_PURCHASE_ORDER.F_EXISTS_ITEM", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@P_POHD_CODE", pPohdCode);
			cmd.addParameter("@P_ITEM", pItem);
			cmd.addParameter("@P_CHANGE_SEQ_NUM", pChangeSeqNum);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NString fGetCancelMesg() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_PURCHASE_ORDER.F_GET_CANCEL_MESG", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetDocCode(NString pDocRefCode,NNumber pChangeSeqNum) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_PURCHASE_ORDER.F_GET_DOC_CODE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_DOC_REF_CODE", pDocRefCode);
			cmd.addParameter("@P_CHANGE_SEQ_NUM", pChangeSeqNum);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetDocRefCode(NString pCode,NNumber pChangeSeqNum) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_PURCHASE_ORDER.F_GET_DOC_REF_CODE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_CODE", pCode);
			cmd.addParameter("@P_CHANGE_SEQ_NUM", pChangeSeqNum);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetStatusCode(NString whichStatus) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_PURCHASE_ORDER.F_GET_STATUS_CODE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@WHICH_STATUS", whichStatus);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fGetTaxAmtsAndBudgAuth(NString pCode,NNumber pChangeSeqNum) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_PURCHASE_ORDER.F_GET_TAX_AMTS_AND_BUDG_AUTH", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_CODE", pCode);
			cmd.addParameter("@P_CHANGE_SEQ_NUM", pChangeSeqNum);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static NString fIsCoAcceptable(NString pCode,NNumber pChangeSeqNum) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_PURCHASE_ORDER.F_IS_CO_ACCEPTABLE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_CODE", pCode);
			cmd.addParameter("@P_CHANGE_SEQ_NUM", pChangeSeqNum);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsEprocPo(NString pCode,NString action) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_PURCHASE_ORDER.F_IS_EPROC_PO", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_CODE", pCode);
			cmd.addParameter("@ACTION", action);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsPoInventory(NString pCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_PURCHASE_ORDER.F_IS_PO_INVENTORY", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_CODE", pCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NBool fPoPosted(NString pCode,NNumber pChangeSeqNum) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_PURCHASE_ORDER.F_PO_POSTED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@P_CODE", pCode);
			cmd.addParameter("@P_CHANGE_SEQ_NUM", pChangeSeqNum);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NString fPoStatus(NString pCode,NString pDocRefCode,NNumber pChangeSeqNum) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_PURCHASE_ORDER.F_PO_STATUS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_CODE", pCode);
			cmd.addParameter("@P_DOC_REF_CODE", pDocRefCode);
			cmd.addParameter("@P_CHANGE_SEQ_NUM", pChangeSeqNum);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAllAccounting(NString pPohdCode,NNumber pItem,NNumber pChangeSeqNum) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_PURCHASE_ORDER.F_QUERY_ALL_ACCOUNTING", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_POHD_CODE", pPohdCode);
			cmd.addParameter("@P_ITEM", pItem);
			cmd.addParameter("@P_CHANGE_SEQ_NUM", pChangeSeqNum);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryAllHeader(NString pCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_PURCHASE_ORDER.F_QUERY_ALL_HEADER", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_CODE", pCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryAllItem(NString pPohdCode,NNumber pChangeSeqNum) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_PURCHASE_ORDER.F_QUERY_ALL_ITEM", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_POHD_CODE", pPohdCode);
			cmd.addParameter("@P_CHANGE_SEQ_NUM", pChangeSeqNum);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneAccounting(NString pPohdCode,NNumber pItem,NNumber pSeqNum,NNumber pChangeSeqNum) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_PURCHASE_ORDER.F_QUERY_ONE_ACCOUNTING", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_POHD_CODE", pPohdCode);
			cmd.addParameter("@P_ITEM", pItem);
			cmd.addParameter("@P_SEQ_NUM", pSeqNum);
			cmd.addParameter("@P_CHANGE_SEQ_NUM", pChangeSeqNum);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneHeader(NString pCode,NNumber pChangeSeqNum) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_PURCHASE_ORDER.F_QUERY_ONE_HEADER", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_CODE", pCode);
			cmd.addParameter("@P_CHANGE_SEQ_NUM", pChangeSeqNum);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneItem(NString pPohdCode,NNumber pItem,NNumber pChangeSeqNum) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_PURCHASE_ORDER.F_QUERY_ONE_ITEM", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_POHD_CODE", pPohdCode);
			cmd.addParameter("@P_ITEM", pItem);
			cmd.addParameter("@P_CHANGE_SEQ_NUM", pChangeSeqNum);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOpenAccounting(NString pPohdCode,NNumber pItem) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_PURCHASE_ORDER.F_QUERY_OPEN_ACCOUNTING", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_POHD_CODE", pPohdCode);
			cmd.addParameter("@P_ITEM", pItem);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOpenItems(NString pPohdCode,NNumber pChangeSeqNum) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_PURCHASE_ORDER.F_QUERY_OPEN_ITEMS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_POHD_CODE", pPohdCode);
			cmd.addParameter("@P_CHANGE_SEQ_NUM", pChangeSeqNum);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreateAccounting(NString pPohdCode,NNumber pChangeSeqNum,NNumber pItem,NNumber pSeqNum,NNumber pAmt,NNumber pDiscAmt,NNumber pTaxAmt,NNumber pAddlChrgAmt,NString pCoasCode,NString pAcciCode,NString pFundCode,NString pOrgnCode,NString pAcctCode,NString pProgCode,NString pActvCode,NString pLocnCode,NString pProjCode,NString pNsfOverrideInd,NNumber pApprAmtPct,NNumber pDiscAmtPct,NNumber pAddlAmtPct,NNumber pTaxAmtPct,NDate pActivityDate,NString pUserId,NString pFsyrCode,NString pPeriod,NString pRuclCodePo,NString pDiscRuclCode,NString pTaxRuclCode,NString pAddlRuclCode,NString pRuclCodeLiq,NString pSuspInd,NString pNsfSuspInd,NDate pPostDate,NString pApprInd,NString pClosedInd,NNumber pConvertAmt,NNumber pConvertDiscAmt,NNumber pConvertTaxAmt,NNumber pConvertAddlChrgAmt,NString pDataChanged,Ref<NString> pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_PURCHASE_ORDER.P_CREATE_ACCOUNTING", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_POHD_CODE", pPohdCode);
			cmd.addParameter("@P_CHANGE_SEQ_NUM", pChangeSeqNum);
			cmd.addParameter("@P_ITEM", pItem);
			cmd.addParameter("@P_SEQ_NUM", pSeqNum);
			cmd.addParameter("@P_AMT", pAmt);
			cmd.addParameter("@P_DISC_AMT", pDiscAmt);
			cmd.addParameter("@P_TAX_AMT", pTaxAmt);
			cmd.addParameter("@P_ADDL_CHRG_AMT", pAddlChrgAmt);
			cmd.addParameter("@P_COAS_CODE", pCoasCode);
			cmd.addParameter("@P_ACCI_CODE", pAcciCode);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_ORGN_CODE", pOrgnCode);
			cmd.addParameter("@P_ACCT_CODE", pAcctCode);
			cmd.addParameter("@P_PROG_CODE", pProgCode);
			cmd.addParameter("@P_ACTV_CODE", pActvCode);
			cmd.addParameter("@P_LOCN_CODE", pLocnCode);
			cmd.addParameter("@P_PROJ_CODE", pProjCode);
			cmd.addParameter("@P_NSF_OVERRIDE_IND", pNsfOverrideInd);
			cmd.addParameter("@P_APPR_AMT_PCT", pApprAmtPct);
			cmd.addParameter("@P_DISC_AMT_PCT", pDiscAmtPct);
			cmd.addParameter("@P_ADDL_AMT_PCT", pAddlAmtPct);
			cmd.addParameter("@P_TAX_AMT_PCT", pTaxAmtPct);
			cmd.addParameter("@P_ACTIVITY_DATE", pActivityDate);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_FSYR_CODE", pFsyrCode);
			cmd.addParameter("@P_PERIOD", pPeriod);
			cmd.addParameter("@P_RUCL_CODE_PO", pRuclCodePo);
			cmd.addParameter("@P_DISC_RUCL_CODE", pDiscRuclCode);
			cmd.addParameter("@P_TAX_RUCL_CODE", pTaxRuclCode);
			cmd.addParameter("@P_ADDL_RUCL_CODE", pAddlRuclCode);
			cmd.addParameter("@P_RUCL_CODE_LIQ", pRuclCodeLiq);
			cmd.addParameter("@P_SUSP_IND", pSuspInd);
			cmd.addParameter("@P_NSF_SUSP_IND", pNsfSuspInd);
			cmd.addParameter("@P_POST_DATE", pPostDate);
			cmd.addParameter("@P_APPR_IND", pApprInd);
			cmd.addParameter("@P_CLOSED_IND", pClosedInd);
			cmd.addParameter("@P_CONVERT_AMT", pConvertAmt);
			cmd.addParameter("@P_CONVERT_DISC_AMT", pConvertDiscAmt);
			cmd.addParameter("@P_CONVERT_TAX_AMT", pConvertTaxAmt);
			cmd.addParameter("@P_CONVERT_ADDL_CHRG_AMT", pConvertAddlChrgAmt);
			cmd.addParameter("@P_DATA_CHANGED", pDataChanged);
			cmd.addParameter("@P_ROWID", NString.class);
				
			cmd.execute();
			pRowid.val = cmd.getParameterValue("@P_ROWID", NString.class);


		}
		
		public static void pCreateHeader(Ref<NString> pCode,Ref<NNumber> pChangeSeqNum,NString pUserId,NDate pPoDate,NDate pTransDate,NNumber pVendorPidm,NString pAtypCode,NNumber pAtypSeqNum,NString pBuyrCode,NDate pReqdDate,NString pCoasCode,NString pOrgnCode,NString pShipCode,NString pDiscCode,NString pPrintText,NString pNoprintText,NString pTgrpCode,NString pCurrCode,NString pSingleAcctgInd,NString pEmailAddr,NString pFaxArea,NString pFaxNumber,NString pFaxExt,NString pAttentionTo,NString pVendorContact,NString pDeliveryComment,NString pVendEmailAddr,NString pName,NString pPhoneArea,NString pPhoneNum,NString pPhoneExt,NString pEdiInd,NString pFtrmCode,NString pOriginCode,NString pPoTypeInd,NString pDocRefCode,NString pBlanketCode,NString pBlanketInd,NDate pBlanketTermDate,NString pClosedInd,NString pCompleteInd,NString pPrintInd,NDate pPoPrintedDate,NString pTratCode,NString pFobCode,NString pTextInd,NString pClauseInd,NNumber pCarrierPidm,NString pTrskCode,NString pPmntCode,NString pPrtAck,NDate pAckDate,NString pApprInd,NString pRushInd,NDate pRexpDate,NNumber pAddlChrgAmt,NNumber pRushAmt,NString pSuspInd,NString pSuspIndAddl,NString pCancelInd,NDate pCancelDate,NDate pPostDate,NString pReqBidInd,NString pEditDeferInd,NString pPclsCode,NString pRecommVendName,NString pDisbAgentInd,NString pNsfOnOffInd,NString pInventoryPoInd,NString pDocCntrlInd,NString pTeleCode,NString pCrsnCode,NString pCopiedFrom,NDate pClosedDate,NString pMatchRequired,NString pCtryCodePhone,NString pCtryCodeFax,Ref<NString> pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_PURCHASE_ORDER.P_CREATE_HEADER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CODE", pCode, true);
			cmd.addParameter("@P_CHANGE_SEQ_NUM", pChangeSeqNum, true);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_PO_DATE", pPoDate);
			cmd.addParameter("@P_TRANS_DATE", pTransDate);
			cmd.addParameter("@P_VENDOR_PIDM", pVendorPidm);
			cmd.addParameter("@P_ATYP_CODE", pAtypCode);
			cmd.addParameter("@P_ATYP_SEQ_NUM", pAtypSeqNum);
			cmd.addParameter("@P_BUYR_CODE", pBuyrCode);
			cmd.addParameter("@P_REQD_DATE", pReqdDate);
			cmd.addParameter("@P_COAS_CODE", pCoasCode);
			cmd.addParameter("@P_ORGN_CODE", pOrgnCode);
			cmd.addParameter("@P_SHIP_CODE", pShipCode);
			cmd.addParameter("@P_DISC_CODE", pDiscCode);
			cmd.addParameter("@P_PRINT_TEXT", pPrintText);
			cmd.addParameter("@P_NOPRINT_TEXT", pNoprintText);
			cmd.addParameter("@P_TGRP_CODE", pTgrpCode);
			cmd.addParameter("@P_CURR_CODE", pCurrCode);
			cmd.addParameter("@P_SINGLE_ACCTG_IND", pSingleAcctgInd);
			cmd.addParameter("@P_EMAIL_ADDR", pEmailAddr);
			cmd.addParameter("@P_FAX_AREA", pFaxArea);
			cmd.addParameter("@P_FAX_NUMBER", pFaxNumber);
			cmd.addParameter("@P_FAX_EXT", pFaxExt);
			cmd.addParameter("@P_ATTENTION_TO", pAttentionTo);
			cmd.addParameter("@P_VENDOR_CONTACT", pVendorContact);
			cmd.addParameter("@P_DELIVERY_COMMENT", pDeliveryComment);
			cmd.addParameter("@P_VEND_EMAIL_ADDR", pVendEmailAddr);
			cmd.addParameter("@P_NAME", pName);
			cmd.addParameter("@P_PHONE_AREA", pPhoneArea);
			cmd.addParameter("@P_PHONE_NUM", pPhoneNum);
			cmd.addParameter("@P_PHONE_EXT", pPhoneExt);
			cmd.addParameter("@P_EDI_IND", pEdiInd);
			cmd.addParameter("@P_FTRM_CODE", pFtrmCode);
			cmd.addParameter("@P_ORIGIN_CODE", pOriginCode);
			cmd.addParameter("@P_PO_TYPE_IND", pPoTypeInd);
			cmd.addParameter("@P_DOC_REF_CODE", pDocRefCode);
			cmd.addParameter("@P_BLANKET_CODE", pBlanketCode);
			cmd.addParameter("@P_BLANKET_IND", pBlanketInd);
			cmd.addParameter("@P_BLANKET_TERM_DATE", pBlanketTermDate);
			cmd.addParameter("@P_CLOSED_IND", pClosedInd);
			cmd.addParameter("@P_COMPLETE_IND", pCompleteInd);
			cmd.addParameter("@P_PRINT_IND", pPrintInd);
			cmd.addParameter("@P_PO_PRINTED_DATE", pPoPrintedDate);
			cmd.addParameter("@P_TRAT_CODE", pTratCode);
			cmd.addParameter("@P_FOB_CODE", pFobCode);
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
			cmd.addParameter("@P_RECOMM_VEND_NAME", pRecommVendName);
			cmd.addParameter("@P_DISB_AGENT_IND", pDisbAgentInd);
			cmd.addParameter("@P_NSF_ON_OFF_IND", pNsfOnOffInd);
			cmd.addParameter("@P_INVENTORY_PO_IND", pInventoryPoInd);
			cmd.addParameter("@P_DOC_CNTRL_IND", pDocCntrlInd);
			cmd.addParameter("@P_TELE_CODE", pTeleCode);
			cmd.addParameter("@P_CRSN_CODE", pCrsnCode);
			cmd.addParameter("@P_COPIED_FROM", pCopiedFrom);
			cmd.addParameter("@P_CLOSED_DATE", pClosedDate);
			cmd.addParameter("@P_MATCH_REQUIRED", pMatchRequired);
			cmd.addParameter("@P_CTRY_CODE_PHONE", pCtryCodePhone);
			cmd.addParameter("@P_CTRY_CODE_FAX", pCtryCodeFax);
			cmd.addParameter("@P_ROWID", NString.class);
				
			cmd.execute();
			pCode.val = cmd.getParameterValue("@P_CODE", NString.class);
			pChangeSeqNum.val = cmd.getParameterValue("@P_CHANGE_SEQ_NUM", NNumber.class);
			pRowid.val = cmd.getParameterValue("@P_ROWID", NString.class);


		}
		
		public static void pCreateItem(NString pPohdCode,NNumber pChangeSeqNum,NNumber pItem,NString pCommCode,NString pCommDesc,NString pUomsCode,NNumber pUnitPrice,NNumber pQty,NNumber pDiscAmt,NNumber pTaxAmt,NNumber pAddlChrgAmt,NString pTgrpCode,NString pShipCode,NDate pReqdDate,NString pPrintText,NString pNoprintText,NNumber pLiqAmt,NString pVendRefNum,NString pAgreCode,NString pSuspInd,NString pClosedInd,NString pCancelInd,NDate pCancelDate,NString pTtagNum,NString pTextUsage,NNumber pConvertUnitPrice,NNumber pConvertDiscAmt,NNumber pConvertTaxAmt,NNumber pConvertAddlChrgAmt,NNumber pExtAmt,NNumber pBoRemainBal,NString pDescChgeInd,NString pDataChanged,Ref<NString> pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_PURCHASE_ORDER.P_CREATE_ITEM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_POHD_CODE", pPohdCode);
			cmd.addParameter("@P_CHANGE_SEQ_NUM", pChangeSeqNum);
			cmd.addParameter("@P_ITEM", pItem);
			cmd.addParameter("@P_COMM_CODE", pCommCode);
			cmd.addParameter("@P_COMM_DESC", pCommDesc);
			cmd.addParameter("@P_UOMS_CODE", pUomsCode);
			cmd.addParameter("@P_UNIT_PRICE", pUnitPrice);
			cmd.addParameter("@P_QTY", pQty);
			cmd.addParameter("@P_DISC_AMT", pDiscAmt);
			cmd.addParameter("@P_TAX_AMT", pTaxAmt);
			cmd.addParameter("@P_ADDL_CHRG_AMT", pAddlChrgAmt);
			cmd.addParameter("@P_TGRP_CODE", pTgrpCode);
			cmd.addParameter("@P_SHIP_CODE", pShipCode);
			cmd.addParameter("@P_REQD_DATE", pReqdDate);
			cmd.addParameter("@P_PRINT_TEXT", pPrintText);
			cmd.addParameter("@P_NOPRINT_TEXT", pNoprintText);
			cmd.addParameter("@P_LIQ_AMT", pLiqAmt);
			cmd.addParameter("@P_VEND_REF_NUM", pVendRefNum);
			cmd.addParameter("@P_AGRE_CODE", pAgreCode);
			cmd.addParameter("@P_SUSP_IND", pSuspInd);
			cmd.addParameter("@P_CLOSED_IND", pClosedInd);
			cmd.addParameter("@P_CANCEL_IND", pCancelInd);
			cmd.addParameter("@P_CANCEL_DATE", pCancelDate);
			cmd.addParameter("@P_TTAG_NUM", pTtagNum);
			cmd.addParameter("@P_TEXT_USAGE", pTextUsage);
			cmd.addParameter("@P_CONVERT_UNIT_PRICE", pConvertUnitPrice);
			cmd.addParameter("@P_CONVERT_DISC_AMT", pConvertDiscAmt);
			cmd.addParameter("@P_CONVERT_TAX_AMT", pConvertTaxAmt);
			cmd.addParameter("@P_CONVERT_ADDL_CHRG_AMT", pConvertAddlChrgAmt);
			cmd.addParameter("@P_EXT_AMT", pExtAmt);
			cmd.addParameter("@P_BO_REMAIN_BAL", pBoRemainBal);
			cmd.addParameter("@P_DESC_CHGE_IND", pDescChgeInd);
			cmd.addParameter("@P_DATA_CHANGED", pDataChanged);
			cmd.addParameter("@P_ROWID", NString.class);
				
			cmd.execute();
			pRowid.val = cmd.getParameterValue("@P_ROWID", NString.class);


		}
		
		public static void pDeleteAccounting(NString pPohdCode,NNumber pItem,NNumber pSeqNum,NNumber pChangeSeqNum,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_PURCHASE_ORDER.P_DELETE_ACCOUNTING", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_POHD_CODE", pPohdCode);
			cmd.addParameter("@P_ITEM", pItem);
			cmd.addParameter("@P_SEQ_NUM", pSeqNum);
			cmd.addParameter("@P_CHANGE_SEQ_NUM", pChangeSeqNum);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pDeleteHeader(NString pCode,NNumber pChangeSeqNum,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_PURCHASE_ORDER.P_DELETE_HEADER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CODE", pCode);
			cmd.addParameter("@P_CHANGE_SEQ_NUM", pChangeSeqNum);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pDeleteItem(NString pPohdCode,NNumber pItem,NNumber pChangeSeqNum,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_PURCHASE_ORDER.P_DELETE_ITEM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_POHD_CODE", pPohdCode);
			cmd.addParameter("@P_ITEM", pItem);
			cmd.addParameter("@P_CHANGE_SEQ_NUM", pChangeSeqNum);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLockAccounting(NString pPohdCode,NNumber pItem,NNumber pSeqNum,NNumber pChangeSeqNum,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_PURCHASE_ORDER.P_LOCK_ACCOUNTING", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_POHD_CODE", pPohdCode);
			cmd.addParameter("@P_ITEM", pItem);
			cmd.addParameter("@P_SEQ_NUM", pSeqNum);
			cmd.addParameter("@P_CHANGE_SEQ_NUM", pChangeSeqNum);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLockHeader(NString pCode,NNumber pChangeSeqNum,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_PURCHASE_ORDER.P_LOCK_HEADER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CODE", pCode);
			cmd.addParameter("@P_CHANGE_SEQ_NUM", pChangeSeqNum);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLockItem(NString pPohdCode,NNumber pItem,NNumber pChangeSeqNum,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_PURCHASE_ORDER.P_LOCK_ITEM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_POHD_CODE", pPohdCode);
			cmd.addParameter("@P_ITEM", pItem);
			cmd.addParameter("@P_CHANGE_SEQ_NUM", pChangeSeqNum);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pUpdateAccounting(NString pPohdCode,NNumber pChangeSeqNum,NNumber pItem,NNumber pSeqNum,NDate pActivityDate,NString pUserId,NNumber pAmt,NNumber pDiscAmt,NNumber pTaxAmt,NNumber pAddlChrgAmt,NString pFsyrCode,NString pPeriod,NString pRuclCodePo,NString pDiscRuclCode,NString pTaxRuclCode,NString pAddlRuclCode,NString pRuclCodeLiq,NString pCoasCode,NString pAcciCode,NString pFundCode,NString pOrgnCode,NString pAcctCode,NString pProgCode,NString pActvCode,NString pLocnCode,NString pProjCode,NString pSuspInd,NString pNsfSuspInd,NDate pPostDate,NString pApprInd,NString pNsfOverrideInd,NString pClosedInd,NNumber pConvertAmt,NNumber pConvertDiscAmt,NNumber pConvertTaxAmt,NNumber pConvertAddlChrgAmt,NNumber pApprAmtPct,NNumber pDiscAmtPct,NNumber pAddlAmtPct,NNumber pTaxAmtPct,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_PURCHASE_ORDER.P_UPDATE_ACCOUNTING", DbManager.getDataBaseFactory());
			
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
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pUpdateHeader(NString pCode,NNumber pChangeSeqNum,NDate pActivityDate,NString pUserId,NDate pPoDate,NDate pTransDate,NString pBlanketCode,NString pBlanketInd,NDate pBlanketTermDate,NString pClosedInd,NString pCompleteInd,NString pPrintInd,NDate pPoPrintedDate,NNumber pVendPidm,NString pAtypCode,NNumber pAtypSeqNum,NString pBuyrCode,NDate pReqdDate,NString pCoasCode,NString pOrgnCode,NString pShipCode,NString pTratCode,NString pFobCode,NString pDiscCode,NString pTextInd,NString pClauseInd,NNumber pCarrierPidm,NString pTrskCode,NString pPmntCode,NString pPrtAck,NDate pAckDate,NString pApprInd,NString pRushInd,NDate pRexpDate,NNumber pAddlChrgAmt,NNumber pRushAmt,NString pSuspInd,NString pSuspIndAddl,NString pCancelInd,NDate pCancelDate,NDate pPostDate,NString pReqBidInd,NString pEditDeferInd,NString pPclsCode,NString pTgrpCode,NString pRecommVendName,NString pCurrCode,NString pDisbAgentInd,NString pNsfOnOffInd,NString pInventoryPoInd,NString pSingleAcctgInd,NString pDocCntrlInd,NString pTeleCode,NString pCrsnCode,NString pDeliveryComment,NString pEmailAddr,NString pFaxArea,NString pFaxNumber,NString pFaxExt,NString pAttentionTo,NString pVendorContact,NString pPoTypeInd,NString pVendEmailAddr,NString pName,NString pPhoneArea,NString pPhoneNum,NString pPhoneExt,NString pCopiedFrom,NDate pClosedDate,NString pFtrmCode,NString pEdiInd,NString pMatchRequired,NString pOriginCode,NString pDocRefCode,NString pPoStatus,NString pStatusMessage,NString pCtryCodePhone,NString pCtryCodeFax,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_PURCHASE_ORDER.P_UPDATE_HEADER", DbManager.getDataBaseFactory());
			
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
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pUpdateHeaderStatus(NString pCode,NNumber pChangeSeqNum,NString pPoStatus,NString pStatusMessage) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_PURCHASE_ORDER.P_UPDATE_HEADER_STATUS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CODE", pCode);
			cmd.addParameter("@P_CHANGE_SEQ_NUM", pChangeSeqNum);
			cmd.addParameter("@P_PO_STATUS", pPoStatus);
			cmd.addParameter("@P_STATUS_MESSAGE", pStatusMessage);
				
			cmd.execute();


		}
		
		public static void pUpdateItem(NString pPohdCode,NNumber pChangeSeqNum,NDate pActivityDate,NString pUserId,NNumber pItem,NString pCommCode,NString pCommDesc,NString pUomsCode,NNumber pUnitPrice,NNumber pLiqAmt,NNumber pQty,NNumber pDiscAmt,NNumber pTaxAmt,NString pVendRefNum,NString pAgreCode,NString pSuspInd,NString pClosedInd,NString pCancelInd,NDate pCancelDate,NString pTtagNum,NString pTextUsage,NNumber pAddlChrgAmt,NNumber pConvertUnitPrice,NNumber pConvertDiscAmt,NNumber pConvertTaxAmt,NNumber pConvertAddlChrgAmt,NString pTgrpCode,NNumber pExtAmt,NNumber pBoRemainBal,NString pDescChgeInd,NString pShipCode,NDate pReqdDate,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_PURCHASE_ORDER.P_UPDATE_ITEM", DbManager.getDataBaseFactory());
			
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
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pValidateAccounting(NString pPohdCode,NNumber pChangeSeqNum,NNumber pItem,NNumber pSeqNum,NDate pActivityDate,NString pUserId,NNumber pAmt,NNumber pDiscAmt,NNumber pTaxAmt,NNumber pAddlChrgAmt,NString pFsyrCode,NString pPeriod,NString pRuclCodePo,NString pDiscRuclCode,NString pTaxRuclCode,NString pAddlRuclCode,NString pRuclCodeLiq,NString pCoasCode,NString pAcciCode,NString pFundCode,NString pOrgnCode,NString pAcctCode,NString pProgCode,NString pActvCode,NString pLocnCode,NString pProjCode,NString pSuspInd,NString pNsfSuspInd,NDate pPostDate,NString pApprInd,NString pNsfOverrideInd,NString pClosedInd,NNumber pConvertAmt,NNumber pConvertDiscAmt,NNumber pConvertTaxAmt,NNumber pConvertAddlChrgAmt,NNumber pApprAmtPct,NNumber pDiscAmtPct,NNumber pAddlAmtPct,NNumber pTaxAmtPct) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_PURCHASE_ORDER.P_VALIDATE_ACCOUNTING", DbManager.getDataBaseFactory());
			
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
		
		public static void pValidateHeader(NString pCode,NNumber pChangeSeqNum,NDate pActivityDate,NString pUserId,NDate pPoDate,NDate pTransDate,NString pBlanketCode,NString pBlanketInd,NDate pBlanketTermDate,NString pClosedInd,NString pCompleteInd,NString pPrintInd,NDate pPoPrintedDate,NNumber pVendPidm,NString pAtypCode,NNumber pAtypSeqNum,NString pBuyrCode,NDate pReqdDate,NString pCoasCode,NString pOrgnCode,NString pShipCode,NString pTratCode,NString pFobCode,NString pDiscCode,NString pTextInd,NString pClauseInd,NNumber pCarrierPidm,NString pTrskCode,NString pPmntCode,NString pPrtAck,NDate pAckDate,NString pApprInd,NString pRushInd,NDate pRexpDate,NNumber pAddlChrgAmt,NNumber pRushAmt,NString pSuspInd,NString pSuspIndAddl,NString pCancelInd,NDate pCancelDate,NDate pPostDate,NString pReqBidInd,NString pEditDeferInd,NString pPclsCode,NString pTgrpCode,NString pRecommVendName,NString pCurrCode,NString pDisbAgentInd,NString pNsfOnOffInd,NString pInventoryPoInd,NString pSingleAcctgInd,NString pDocCntrlInd,NString pTeleCode,NString pCrsnCode,NString pDeliveryComment,NString pEmailAddr,NString pFaxArea,NString pFaxNumber,NString pFaxExt,NString pAttentionTo,NString pVendorContact,NString pPoTypeInd,NString pVendEmailAddr,NString pName,NString pPhoneArea,NString pPhoneNum,NString pPhoneExt,NString pCopiedFrom,NDate pClosedDate,NString pFtrmCode,NString pEdiInd,NString pMatchRequired,NString pOriginCode,NString pDocRefCode,NString pPoStatus,NString pCtryCodePhone,NString pCtryCodeFax) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_PURCHASE_ORDER.P_VALIDATE_HEADER", DbManager.getDataBaseFactory());
			
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
			cmd.addParameter("@P_CTRY_CODE_PHONE", pCtryCodePhone);
			cmd.addParameter("@P_CTRY_CODE_FAX", pCtryCodeFax);
				
			cmd.execute();


		}
		
		public static void pValidateItem(NString pPohdCode,NNumber pChangeSeqNum,NDate pActivityDate,NString pUserId,NNumber pItem,NString pCommCode,NString pCommDesc,NString pUomsCode,NNumber pUnitPrice,NNumber pLiqAmt,NNumber pQty,NNumber pDiscAmt,NNumber pTaxAmt,NString pVendRefNum,NString pAgreCode,NString pSuspInd,NString pClosedInd,NString pCancelInd,NDate pCancelDate,NString pTtagNum,NString pTextUsage,NNumber pAddlChrgAmt,NNumber pConvertUnitPrice,NNumber pConvertDiscAmt,NNumber pConvertTaxAmt,NNumber pConvertAddlChrgAmt,NString pTgrpCode,NNumber pExtAmt,NNumber pBoRemainBal,NString pDescChgeInd,NString pShipCode,NDate pReqdDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_PURCHASE_ORDER.P_VALIDATE_ITEM", DbManager.getDataBaseFactory());
			
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
		
	
	
	@DbRecordType(id="OrderAccountingRecRow", dataSourceName="ORDER_ACCOUNTING_REC")
	public static class OrderAccountingRecRow
	{
		@DbRecordField(dataSourceName="POHD_CODE")
		public NString PohdCode;
		@DbRecordField(dataSourceName="CHANGE_SEQ_NUM")
		public NNumber ChangeSeqNum;
		@DbRecordField(dataSourceName="ITEM")
		public NNumber Item;
		@DbRecordField(dataSourceName="SEQ_NUM")
		public NNumber SeqNum;
		@DbRecordField(dataSourceName="ACTIVITY_DATE")
		public NDate ActivityDate;
		@DbRecordField(dataSourceName="USER_ID")
		public NString UserId;
		@DbRecordField(dataSourceName="AMT")
		public NNumber Amt;
		@DbRecordField(dataSourceName="DISC_AMT")
		public NNumber DiscAmt;
		@DbRecordField(dataSourceName="TAX_AMT")
		public NNumber TaxAmt;
		@DbRecordField(dataSourceName="ADDL_CHRG_AMT")
		public NNumber AddlChrgAmt;
		@DbRecordField(dataSourceName="FSYR_CODE")
		public NString FsyrCode;
		@DbRecordField(dataSourceName="PERIOD")
		public NString Period;
		@DbRecordField(dataSourceName="RUCL_CODE_PO")
		public NString RuclCodePo;
		@DbRecordField(dataSourceName="DISC_RUCL_CODE")
		public NString DiscRuclCode;
		@DbRecordField(dataSourceName="TAX_RUCL_CODE")
		public NString TaxRuclCode;
		@DbRecordField(dataSourceName="ADDL_RUCL_CODE")
		public NString AddlRuclCode;
		@DbRecordField(dataSourceName="RUCL_CODE_LIQ")
		public NString RuclCodeLiq;
		@DbRecordField(dataSourceName="COAS_CODE")
		public NString CoasCode;
		@DbRecordField(dataSourceName="ACCI_CODE")
		public NString AcciCode;
		@DbRecordField(dataSourceName="FUND_CODE")
		public NString FundCode;
		@DbRecordField(dataSourceName="ORGN_CODE")
		public NString OrgnCode;
		@DbRecordField(dataSourceName="ACCT_CODE")
		public NString AcctCode;
		@DbRecordField(dataSourceName="PROG_CODE")
		public NString ProgCode;
		@DbRecordField(dataSourceName="ACTV_CODE")
		public NString ActvCode;
		@DbRecordField(dataSourceName="LOCN_CODE")
		public NString LocnCode;
		@DbRecordField(dataSourceName="PROJ_CODE")
		public NString ProjCode;
		@DbRecordField(dataSourceName="SUSP_IND")
		public NString SuspInd;
		@DbRecordField(dataSourceName="NSF_SUSP_IND")
		public NString NsfSuspInd;
		@DbRecordField(dataSourceName="POST_DATE")
		public NDate PostDate;
		@DbRecordField(dataSourceName="APPR_IND")
		public NString ApprInd;
		@DbRecordField(dataSourceName="NSF_OVERRIDE_IND")
		public NString NsfOverrideInd;
		@DbRecordField(dataSourceName="CLOSED_IND")
		public NString ClosedInd;
		@DbRecordField(dataSourceName="CONVERT_AMT")
		public NNumber ConvertAmt;
		@DbRecordField(dataSourceName="CONVERT_DISC_AMT")
		public NNumber ConvertDiscAmt;
		@DbRecordField(dataSourceName="CONVERT_TAX_AMT")
		public NNumber ConvertTaxAmt;
		@DbRecordField(dataSourceName="CONVERT_ADDL_CHRG_AMT")
		public NNumber ConvertAddlChrgAmt;
		@DbRecordField(dataSourceName="APPR_AMT_PCT")
		public NNumber ApprAmtPct;
		@DbRecordField(dataSourceName="DISC_AMT_PCT")
		public NNumber DiscAmtPct;
		@DbRecordField(dataSourceName="ADDL_AMT_PCT")
		public NNumber AddlAmtPct;
		@DbRecordField(dataSourceName="TAX_AMT_PCT")
		public NNumber TaxAmtPct;
		@DbRecordField(dataSourceName="INTERNAL_RECORD_ID")
		public NString InternalRecordId;
	}

	
	@DbRecordType(id="OrderHeaderRecRow", dataSourceName="ORDER_HEADER_REC")
	public static class OrderHeaderRecRow
	{
		@DbRecordField(dataSourceName="CODE")
		public NString Code;
		@DbRecordField(dataSourceName="CHANGE_SEQ_NUM")
		public NNumber ChangeSeqNum;
		@DbRecordField(dataSourceName="ACTIVITY_DATE")
		public NDate ActivityDate;
		@DbRecordField(dataSourceName="USER_ID")
		public NString UserId;
		@DbRecordField(dataSourceName="PO_DATE")
		public NDate PoDate;
		@DbRecordField(dataSourceName="TRANS_DATE")
		public NDate TransDate;
		@DbRecordField(dataSourceName="BLANKET_CODE")
		public NString BlanketCode;
		@DbRecordField(dataSourceName="BLANKET_IND")
		public NString BlanketInd;
		@DbRecordField(dataSourceName="BLANKET_TERM_DATE")
		public NDate BlanketTermDate;
		@DbRecordField(dataSourceName="CLOSED_IND")
		public NString ClosedInd;
		@DbRecordField(dataSourceName="COMPLETE_IND")
		public NString CompleteInd;
		@DbRecordField(dataSourceName="PRINT_IND")
		public NString PrintInd;
		@DbRecordField(dataSourceName="PO_PRINTED_DATE")
		public NDate PoPrintedDate;
		@DbRecordField(dataSourceName="VEND_PIDM")
		public NNumber VendPidm;
		@DbRecordField(dataSourceName="ATYP_CODE")
		public NString AtypCode;
		@DbRecordField(dataSourceName="ATYP_SEQ_NUM")
		public NNumber AtypSeqNum;
		@DbRecordField(dataSourceName="BUYR_CODE")
		public NString BuyrCode;
		@DbRecordField(dataSourceName="REQD_DATE")
		public NDate ReqdDate;
		@DbRecordField(dataSourceName="COAS_CODE")
		public NString CoasCode;
		@DbRecordField(dataSourceName="ORGN_CODE")
		public NString OrgnCode;
		@DbRecordField(dataSourceName="SHIP_CODE")
		public NString ShipCode;
		@DbRecordField(dataSourceName="TRAT_CODE")
		public NString TratCode;
		@DbRecordField(dataSourceName="FOB_CODE")
		public NString FobCode;
		@DbRecordField(dataSourceName="DISC_CODE")
		public NString DiscCode;
		@DbRecordField(dataSourceName="TEXT_IND")
		public NString TextInd;
		@DbRecordField(dataSourceName="CLAUSE_IND")
		public NString ClauseInd;
		@DbRecordField(dataSourceName="CARRIER_PIDM")
		public NNumber CarrierPidm;
		@DbRecordField(dataSourceName="TRSK_CODE")
		public NString TrskCode;
		@DbRecordField(dataSourceName="PMNT_CODE")
		public NString PmntCode;
		@DbRecordField(dataSourceName="PRT_ACK")
		public NString PrtAck;
		@DbRecordField(dataSourceName="ACK_DATE")
		public NDate AckDate;
		@DbRecordField(dataSourceName="APPR_IND")
		public NString ApprInd;
		@DbRecordField(dataSourceName="RUSH_IND")
		public NString RushInd;
		@DbRecordField(dataSourceName="REXP_DATE")
		public NDate RexpDate;
		@DbRecordField(dataSourceName="ADDL_CHRG_AMT")
		public NNumber AddlChrgAmt;
		@DbRecordField(dataSourceName="RUSH_AMT")
		public NNumber RushAmt;
		@DbRecordField(dataSourceName="SUSP_IND")
		public NString SuspInd;
		@DbRecordField(dataSourceName="SUSP_IND_ADDL")
		public NString SuspIndAddl;
		@DbRecordField(dataSourceName="CANCEL_IND")
		public NString CancelInd;
		@DbRecordField(dataSourceName="CANCEL_DATE")
		public NDate CancelDate;
		@DbRecordField(dataSourceName="POST_DATE")
		public NDate PostDate;
		@DbRecordField(dataSourceName="REQ_BID_IND")
		public NString ReqBidInd;
		@DbRecordField(dataSourceName="EDIT_DEFER_IND")
		public NString EditDeferInd;
		@DbRecordField(dataSourceName="PCLS_CODE")
		public NString PclsCode;
		@DbRecordField(dataSourceName="TGRP_CODE")
		public NString TgrpCode;
		@DbRecordField(dataSourceName="RECOMM_VEND_NAME")
		public NString RecommVendName;
		@DbRecordField(dataSourceName="CURR_CODE")
		public NString CurrCode;
		@DbRecordField(dataSourceName="DISB_AGENT_IND")
		public NString DisbAgentInd;
		@DbRecordField(dataSourceName="NSF_ON_OFF_IND")
		public NString NsfOnOffInd;
		@DbRecordField(dataSourceName="INVENTORY_PO_IND")
		public NString InventoryPoInd;
		@DbRecordField(dataSourceName="SINGLE_ACCTG_IND")
		public NString SingleAcctgInd;
		@DbRecordField(dataSourceName="DOC_CNTRL_IND")
		public NString DocCntrlInd;
		@DbRecordField(dataSourceName="TELE_CODE")
		public NString TeleCode;
		@DbRecordField(dataSourceName="CRSN_CODE")
		public NString CrsnCode;
		@DbRecordField(dataSourceName="DELIVERY_COMMENT")
		public NString DeliveryComment;
		@DbRecordField(dataSourceName="EMAIL_ADDR")
		public NString EmailAddr;
		@DbRecordField(dataSourceName="FAX_AREA")
		public NString FaxArea;
		@DbRecordField(dataSourceName="FAX_NUMBER")
		public NString FaxNumber;
		@DbRecordField(dataSourceName="FAX_EXT")
		public NString FaxExt;
		@DbRecordField(dataSourceName="ATTENTION_TO")
		public NString AttentionTo;
		@DbRecordField(dataSourceName="VENDOR_CONTACT")
		public NString VendorContact;
		@DbRecordField(dataSourceName="PO_TYPE_IND")
		public NString PoTypeInd;
		@DbRecordField(dataSourceName="VEND_EMAIL_ADDR")
		public NString VendEmailAddr;
		@DbRecordField(dataSourceName="NAME")
		public NString _Name;
		@DbRecordField(dataSourceName="PHONE_AREA")
		public NString PhoneArea;
		@DbRecordField(dataSourceName="PHONE_NUM")
		public NString PhoneNum;
		@DbRecordField(dataSourceName="PHONE_EXT")
		public NString PhoneExt;
		@DbRecordField(dataSourceName="COPIED_FROM")
		public NString CopiedFrom;
		@DbRecordField(dataSourceName="CLOSED_DATE")
		public NDate ClosedDate;
		@DbRecordField(dataSourceName="FTRM_CODE")
		public NString FtrmCode;
		@DbRecordField(dataSourceName="EDI_IND")
		public NString EdiInd;
		@DbRecordField(dataSourceName="MATCH_REQUIRED")
		public NString MatchRequired;
		@DbRecordField(dataSourceName="ORIGIN_CODE")
		public NString OriginCode;
		@DbRecordField(dataSourceName="DOC_REF_CODE")
		public NString DocRefCode;
		@DbRecordField(dataSourceName="PO_STATUS")
		public NString PoStatus;
		@DbRecordField(dataSourceName="CTRY_CODE_PHONE")
		public NString CtryCodePhone;
		@DbRecordField(dataSourceName="CTRY_CODE_FAX")
		public NString CtryCodeFax;
		@DbRecordField(dataSourceName="INTERNAL_RECORD_ID")
		public NString InternalRecordId;
	}

	
	@DbRecordType(id="OrderItemRecRow", dataSourceName="ORDER_ITEM_REC")
	public static class OrderItemRecRow
	{
		@DbRecordField(dataSourceName="POHD_CODE")
		public NString PohdCode;
		@DbRecordField(dataSourceName="CHANGE_SEQ_NUM")
		public NNumber ChangeSeqNum;
		@DbRecordField(dataSourceName="ACTIVITY_DATE")
		public NDate ActivityDate;
		@DbRecordField(dataSourceName="USER_ID")
		public NString UserId;
		@DbRecordField(dataSourceName="ITEM")
		public NNumber Item;
		@DbRecordField(dataSourceName="COMM_CODE")
		public NString CommCode;
		@DbRecordField(dataSourceName="COMM_DESC")
		public NString CommDesc;
		@DbRecordField(dataSourceName="UOMS_CODE")
		public NString UomsCode;
		@DbRecordField(dataSourceName="UNIT_PRICE")
		public NNumber UnitPrice;
		@DbRecordField(dataSourceName="LIQ_AMT")
		public NNumber LiqAmt;
		@DbRecordField(dataSourceName="QTY")
		public NNumber Qty;
		@DbRecordField(dataSourceName="DISC_AMT")
		public NNumber DiscAmt;
		@DbRecordField(dataSourceName="TAX_AMT")
		public NNumber TaxAmt;
		@DbRecordField(dataSourceName="VEND_REF_NUM")
		public NString VendRefNum;
		@DbRecordField(dataSourceName="AGRE_CODE")
		public NString AgreCode;
		@DbRecordField(dataSourceName="SUSP_IND")
		public NString SuspInd;
		@DbRecordField(dataSourceName="CLOSED_IND")
		public NString ClosedInd;
		@DbRecordField(dataSourceName="CANCEL_IND")
		public NString CancelInd;
		@DbRecordField(dataSourceName="CANCEL_DATE")
		public NDate CancelDate;
		@DbRecordField(dataSourceName="TTAG_NUM")
		public NString TtagNum;
		@DbRecordField(dataSourceName="TEXT_USAGE")
		public NString TextUsage;
		@DbRecordField(dataSourceName="ADDL_CHRG_AMT")
		public NNumber AddlChrgAmt;
		@DbRecordField(dataSourceName="CONVERT_UNIT_PRICE")
		public NNumber ConvertUnitPrice;
		@DbRecordField(dataSourceName="CONVERT_DISC_AMT")
		public NNumber ConvertDiscAmt;
		@DbRecordField(dataSourceName="CONVERT_TAX_AMT")
		public NNumber ConvertTaxAmt;
		@DbRecordField(dataSourceName="CONVERT_ADDL_CHRG_AMT")
		public NNumber ConvertAddlChrgAmt;
		@DbRecordField(dataSourceName="TGRP_CODE")
		public NString TgrpCode;
		@DbRecordField(dataSourceName="EXT_AMT")
		public NNumber ExtAmt;
		@DbRecordField(dataSourceName="BO_REMAIN_BAL")
		public NNumber BoRemainBal;
		@DbRecordField(dataSourceName="DESC_CHGE_IND")
		public NString DescChgeInd;
		@DbRecordField(dataSourceName="SHIP_CODE")
		public NString ShipCode;
		@DbRecordField(dataSourceName="REQD_DATE")
		public NDate ReqdDate;
		@DbRecordField(dataSourceName="INTERNAL_RECORD_ID")
		public NString InternalRecordId;
	}

	
	
}
