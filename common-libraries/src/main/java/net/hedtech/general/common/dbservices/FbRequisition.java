package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class FbRequisition {
		
//		public static List<StringNtRow> fCompleteReq(NString pCode) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_REQUISITION.F_COMPLETE_REQ", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<StringNtRow>.class);
//			cmd.addParameter("@P_CODE", pCode);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<StringNtRow>.class);
//
//		}
		
		public static NString fCurrentVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_REQUISITION.F_CURRENT_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NBool fDocRefCodeExists(NString pDocRefCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_REQUISITION.F_DOC_REF_CODE_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@P_DOC_REF_CODE", pDocRefCode);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NString fDocumentRefCodeExists(NString pDocRefCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_REQUISITION.F_DOCUMENT_REF_CODE_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_DOC_REF_CODE", pDocRefCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NBool fExistsAccounting(NString pReqhCode,NNumber pItem,NNumber pSeqNum) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_REQUISITION.F_EXISTS_ACCOUNTING", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@P_REQH_CODE", pReqhCode);
			cmd.addParameter("@P_ITEM", pItem);
			cmd.addParameter("@P_SEQ_NUM", pSeqNum);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fExistsHeader(NString pCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_REQUISITION.F_EXISTS_HEADER", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@P_CODE", pCode);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fExistsItem(NString pReqhCode,NNumber pItem) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_REQUISITION.F_EXISTS_ITEM", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@P_REQH_CODE", pReqhCode);
			cmd.addParameter("@P_ITEM", pItem);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NString fGetCancelMesg() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_REQUISITION.F_GET_CANCEL_MESG", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetDocCode(NString pDocRefCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_REQUISITION.F_GET_DOC_CODE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_DOC_REF_CODE", pDocRefCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetDocRefCode(NString pCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_REQUISITION.F_GET_DOC_REF_CODE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_CODE", pCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetStatusCode(NString whichStatus) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_REQUISITION.F_GET_STATUS_CODE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@WHICH_STATUS", whichStatus);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fGetTaxAmtsAndBudgAuth(NString pCode,NNumber pChangeSeqNum) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_REQUISITION.F_GET_TAX_AMTS_AND_BUDG_AUTH", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_CODE", pCode);
			cmd.addParameter("@P_CHANGE_SEQ_NUM", pChangeSeqNum);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static NString fIsEprocReq(NString pCode,NString action) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_REQUISITION.F_IS_EPROC_REQ", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_CODE", pCode);
			cmd.addParameter("@ACTION", action);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAllAccounting(NString pReqhCode,NNumber pItem) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_REQUISITION.F_QUERY_ALL_ACCOUNTING", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_REQH_CODE", pReqhCode);
			cmd.addParameter("@P_ITEM", pItem);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryAllItem(NString pReqhCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_REQUISITION.F_QUERY_ALL_ITEM", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_REQH_CODE", pReqhCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneAccounting(NString pReqhCode,NNumber pItem,NNumber pSeqNum) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_REQUISITION.F_QUERY_ONE_ACCOUNTING", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_REQH_CODE", pReqhCode);
			cmd.addParameter("@P_ITEM", pItem);
			cmd.addParameter("@P_SEQ_NUM", pSeqNum);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneHeader(NString pCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_REQUISITION.F_QUERY_ONE_HEADER", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_CODE", pCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneItem(NString pReqhCode,NNumber pItem) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_REQUISITION.F_QUERY_ONE_ITEM", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_REQH_CODE", pReqhCode);
			cmd.addParameter("@P_ITEM", pItem);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static NBool fReqPosted(NString pCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_REQUISITION.F_REQ_POSTED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@P_CODE", pCode);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NString fReqStatus(NString pCode,NString pDocRefCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_REQUISITION.F_REQ_STATUS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_CODE", pCode);
			cmd.addParameter("@P_DOC_REF_CODE", pDocRefCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pCreateAccounting(NString pReqhCode,NNumber pItem,NNumber pSeqNum,NDate pActivityDate,NString pUserId,NNumber pPct,NNumber pAmt,NString pFsyrCode,NString pPeriod,NString pRuclCode,NString pCoasCode,NString pAcciCode,NString pFundCode,NString pOrgnCode,NString pAcctCode,NString pProgCode,NString pActvCode,NString pLocnCode,NString pSuspInd,NString pNsfSuspInd,NString pCancelInd,NDate pCancelDate,NString pProjCode,NString pApprInd,NString pNsfOverrideInd,NString pAbalInd,NNumber pConvertedAmt,NString pClosedInd,NNumber pDiscAmt,NNumber pTaxAmt,NNumber pAddlChrgAmt,NNumber pConvertDiscAmt,NNumber pConvertTaxAmt,NNumber pConvertAddlChrgAmt,NNumber pDiscAmtPct,NNumber pAddlAmtPct,NNumber pTaxAmtPct,NString pDiscRuclCode,NString pTaxRuclCode,NString pAddlRuclCode,NString pRuclCodeLiq,Ref<NString> pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_REQUISITION.P_CREATE_ACCOUNTING", DbManager.getDataBaseFactory());
			
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
			cmd.addParameter("@P_ROWID", NString.class);
				
			cmd.execute();
			pRowid.val = cmd.getParameterValue("@P_ROWID", NString.class);


		}
		
		public static void pCreateHeader(Ref<NString> pCode,NDate pActivityDate,NString pUserId,NDate pReqhDate,NDate pTransDate,NString pName,NString pPhoneArea,NString pPhoneNum,NString pPhoneExt,NNumber pVendPidm,NString pAtypCode,NNumber pAtypSeqNum,NString pCoasCode,NString pOrgnCode,NDate pReqdDate,NString pCompleteInd,NString pPrintInd,NString pEncumbInd,NString pSuspInd,NString pCancelInd,NDate pCancelDate,NDate pPostDate,NString pApprInd,NString pTextInd,NString pEditDeferInd,NString pRecommVendName,NString pCurrCode,NString pNsfOnOffInd,NString pSingleAcctgInd,NString pClosedInd,NString pShipCode,NString pRqstTypeInd,NString pInventoryReqInd,NString pCrsnCode,NString pDeliveryComment,NString pEmailAddr,NString pFaxArea,NString pFaxNumber,NString pFaxExt,NString pAttentionTo,NString pVendorContact,NString pDiscCode,NString pVendEmailAddr,NString pCopiedFrom,NString pTgrpCode,NDate pReqPrintDate,NDate pClosedDate,NString pMatchRequired,NString pOriginCode,NString pDocRefCode,NString pPrintText,NString pNoprintText,NString pCtryCodePhone,NString pCtryCodeFax,Ref<NString> pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_REQUISITION.P_CREATE_HEADER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CODE", pCode, true);
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
			cmd.addParameter("@P_PRINT_TEXT", pPrintText);
			cmd.addParameter("@P_NOPRINT_TEXT", pNoprintText);
			cmd.addParameter("@P_CTRY_CODE_PHONE", pCtryCodePhone);
			cmd.addParameter("@P_CTRY_CODE_FAX", pCtryCodeFax);
			cmd.addParameter("@P_ROWID", NString.class);
				
			cmd.execute();
			pCode.val = cmd.getParameterValue("@P_CODE", NString.class);
			pRowid.val = cmd.getParameterValue("@P_ROWID", NString.class);


		}
		
		public static void pCreateItem(NString pReqhCode,NNumber pItem,NDate pActivityDate,NString pUserId,NString pCommCode,NString pCommDesc,NString pCoasCode,NString pOrgnCode,NString pBuyrCode,NNumber pQty,NString pUomsCode,NNumber pUnitPrice,NString pAgreCode,NDate pReqdDate,NString pShipCode,NNumber pVendPidm,NString pVendRefNum,NString pProjCode,NString pPohdCode,NNumber pPohdItem,NString pBidsCode,NString pCompleteInd,NString pSuspInd,NString pCancelInd,NDate pCancelDate,NString pClosedInd,NDate pPostDate,NString pTextUsage,NString pAtypCode,NNumber pAtypSeqNum,NString pRecommVendName,NString pCurrCode,NNumber pConvertedUnitPrice,NNumber pDiscAmt,NNumber pTaxAmt,NNumber pAddlChrgAmt,NNumber pConvertDiscAmt,NNumber pConvertTaxAmt,NNumber pConvertAddlChrgAmt,NString pTgrpCode,NNumber pAmt,NString pDescChgeInd,NString pPrintText,NString pNoprintText,Ref<NString> pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_REQUISITION.P_CREATE_ITEM", DbManager.getDataBaseFactory());
			
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
			cmd.addParameter("@P_PRINT_TEXT", pPrintText);
			cmd.addParameter("@P_NOPRINT_TEXT", pNoprintText);
			cmd.addParameter("@P_ROWID", NString.class);
				
			cmd.execute();
			pRowid.val = cmd.getParameterValue("@P_ROWID", NString.class);


		}
		
		public static void pDeleteAccounting(NString pReqhCode,NNumber pItem,NNumber pSeqNum,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_REQUISITION.P_DELETE_ACCOUNTING", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_REQH_CODE", pReqhCode);
			cmd.addParameter("@P_ITEM", pItem);
			cmd.addParameter("@P_SEQ_NUM", pSeqNum);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pDeleteHeader(NString pCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_REQUISITION.P_DELETE_HEADER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CODE", pCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pDeleteItem(NString pReqhCode,NNumber pItem,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_REQUISITION.P_DELETE_ITEM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_REQH_CODE", pReqhCode);
			cmd.addParameter("@P_ITEM", pItem);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLockAccounting(NString pReqhCode,NNumber pItem,NNumber pSeqNum,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_REQUISITION.P_LOCK_ACCOUNTING", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_REQH_CODE", pReqhCode);
			cmd.addParameter("@P_ITEM", pItem);
			cmd.addParameter("@P_SEQ_NUM", pSeqNum);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLockHeader(NString pCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_REQUISITION.P_LOCK_HEADER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CODE", pCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLockItem(NString pReqhCode,NNumber pItem,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_REQUISITION.P_LOCK_ITEM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_REQH_CODE", pReqhCode);
			cmd.addParameter("@P_ITEM", pItem);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pUpdateAccounting(NString pReqhCode,NNumber pItem,NNumber pSeqNum,NDate pActivityDate,NString pUserId,NNumber pPct,NNumber pAmt,NString pFsyrCode,NString pPeriod,NString pRuclCode,NString pCoasCode,NString pAcciCode,NString pFundCode,NString pOrgnCode,NString pAcctCode,NString pProgCode,NString pActvCode,NString pLocnCode,NString pSuspInd,NString pNsfSuspInd,NString pCancelInd,NDate pCancelDate,NString pProjCode,NString pApprInd,NString pNsfOverrideInd,NString pAbalInd,NNumber pConvertedAmt,NString pClosedInd,NNumber pDiscAmt,NNumber pTaxAmt,NNumber pAddlChrgAmt,NNumber pConvertDiscAmt,NNumber pConvertTaxAmt,NNumber pConvertAddlChrgAmt,NNumber pDiscAmtPct,NNumber pAddlAmtPct,NNumber pTaxAmtPct,NString pDiscRuclCode,NString pTaxRuclCode,NString pAddlRuclCode,NString pRuclCodeLiq,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_REQUISITION.P_UPDATE_ACCOUNTING", DbManager.getDataBaseFactory());
			
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
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pUpdateHeader(NString pCode,NDate pActivityDate,NString pUserId,NDate pReqhDate,NDate pTransDate,NString pName,NString pPhoneArea,NString pPhoneNum,NString pPhoneExt,NNumber pVendPidm,NString pAtypCode,NNumber pAtypSeqNum,NString pCoasCode,NString pOrgnCode,NDate pReqdDate,NString pCompleteInd,NString pPrintInd,NString pEncumbInd,NString pSuspInd,NString pCancelInd,NDate pCancelDate,NDate pPostDate,NString pApprInd,NString pTextInd,NString pEditDeferInd,NString pRecommVendName,NString pCurrCode,NString pNsfOnOffInd,NString pSingleAcctgInd,NString pClosedInd,NString pShipCode,NString pRqstTypeInd,NString pInventoryReqInd,NString pCrsnCode,NString pDeliveryComment,NString pEmailAddr,NString pFaxArea,NString pFaxNumber,NString pFaxExt,NString pAttentionTo,NString pVendorContact,NString pDiscCode,NString pVendEmailAddr,NString pCopiedFrom,NString pTgrpCode,NDate pReqPrintDate,NDate pClosedDate,NString pMatchRequired,NString pOriginCode,NString pDocRefCode,NString pStatus,NString pStatusMessage,NString pCtryCodePhone,NString pCtryCodeFax,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_REQUISITION.P_UPDATE_HEADER", DbManager.getDataBaseFactory());
			
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
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pUpdateHeaderStatus(NString pCode,NString pStatus,NString pStatusMessage) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_REQUISITION.P_UPDATE_HEADER_STATUS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CODE", pCode);
			cmd.addParameter("@P_STATUS", pStatus);
			cmd.addParameter("@P_STATUS_MESSAGE", pStatusMessage);
				
			cmd.execute();


		}
		
		public static void pUpdateItem(NString pReqhCode,NNumber pItem,NDate pActivityDate,NString pUserId,NString pCommCode,NString pCommDesc,NString pCoasCode,NString pOrgnCode,NString pBuyrCode,NNumber pQty,NString pUomsCode,NNumber pUnitPrice,NString pAgreCode,NDate pReqdDate,NString pShipCode,NNumber pVendPidm,NString pVendRefNum,NString pProjCode,NString pPohdCode,NNumber pPohdItem,NString pBidsCode,NString pCompleteInd,NString pSuspInd,NString pCancelInd,NDate pCancelDate,NString pClosedInd,NDate pPostDate,NString pTextUsage,NString pAtypCode,NNumber pAtypSeqNum,NString pRecommVendName,NString pCurrCode,NNumber pConvertedUnitPrice,NNumber pDiscAmt,NNumber pTaxAmt,NNumber pAddlChrgAmt,NNumber pConvertDiscAmt,NNumber pConvertTaxAmt,NNumber pConvertAddlChrgAmt,NString pTgrpCode,NNumber pAmt,NString pDescChgeInd,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_REQUISITION.P_UPDATE_ITEM", DbManager.getDataBaseFactory());
			
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
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pValidateAccounting(NString pReqhCode,NNumber pItem,NNumber pSeqNum,NDate pActivityDate,NString pUserId,NNumber pPct,NNumber pAmt,NString pFsyrCode,NString pPeriod,NString pRuclCode,NString pCoasCode,NString pAcciCode,NString pFundCode,NString pOrgnCode,NString pAcctCode,NString pProgCode,NString pActvCode,NString pLocnCode,NString pSuspInd,NString pNsfSuspInd,NString pCancelInd,NDate pCancelDate,NString pProjCode,NString pApprInd,NString pNsfOverrideInd,NString pAbalInd,NNumber pConvertedAmt,NString pClosedInd,NNumber pDiscAmt,NNumber pTaxAmt,NNumber pAddlChrgAmt,NNumber pConvertDiscAmt,NNumber pConvertTaxAmt,NNumber pConvertAddlChrgAmt,NNumber pDiscAmtPct,NNumber pAddlAmtPct,NNumber pTaxAmtPct,NString pDiscRuclCode,NString pTaxRuclCode,NString pAddlRuclCode,NString pRuclCodeLiq) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_REQUISITION.P_VALIDATE_ACCOUNTING", DbManager.getDataBaseFactory());
			
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
		
		public static void pValidateHeader(NString pCode,NDate pActivityDate,NString pUserId,NDate pReqhDate,NDate pTransDate,NString pName,NString pPhoneArea,NString pPhoneNum,NString pPhoneExt,NNumber pVendPidm,NString pAtypCode,NNumber pAtypSeqNum,NString pCoasCode,NString pOrgnCode,NDate pReqdDate,NString pCompleteInd,NString pPrintInd,NString pEncumbInd,NString pSuspInd,NString pCancelInd,NDate pCancelDate,NDate pPostDate,NString pApprInd,NString pTextInd,NString pEditDeferInd,NString pRecommVendName,NString pCurrCode,NString pNsfOnOffInd,NString pSingleAcctgInd,NString pClosedInd,NString pShipCode,NString pRqstTypeInd,NString pInventoryReqInd,NString pCrsnCode,NString pDeliveryComment,NString pEmailAddr,NString pFaxArea,NString pFaxNumber,NString pFaxExt,NString pAttentionTo,NString pVendorContact,NString pDiscCode,NString pVendEmailAddr,NString pCopiedFrom,NString pTgrpCode,NDate pReqPrintDate,NDate pClosedDate,NString pMatchRequired,NString pOriginCode,NString pDocRefCode,NString pStatus,NString pCtryCodePhone,NString pCtryCodeFax) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_REQUISITION.P_VALIDATE_HEADER", DbManager.getDataBaseFactory());
			
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
			cmd.addParameter("@P_CTRY_CODE_PHONE", pCtryCodePhone);
			cmd.addParameter("@P_CTRY_CODE_FAX", pCtryCodeFax);
				
			cmd.execute();


		}
		
		public static void pValidateItem(NString pReqhCode,NNumber pItem,NDate pActivityDate,NString pUserId,NString pCommCode,NString pCommDesc,NString pCoasCode,NString pOrgnCode,NString pBuyrCode,NNumber pQty,NString pUomsCode,NNumber pUnitPrice,NString pAgreCode,NDate pReqdDate,NString pShipCode,NNumber pVendPidm,NString pVendRefNum,NString pProjCode,NString pPohdCode,NNumber pPohdItem,NString pBidsCode,NString pCompleteInd,NString pSuspInd,NString pCancelInd,NDate pCancelDate,NString pClosedInd,NDate pPostDate,NString pTextUsage,NString pAtypCode,NNumber pAtypSeqNum,NString pRecommVendName,NString pCurrCode,NNumber pConvertedUnitPrice,NNumber pDiscAmt,NNumber pTaxAmt,NNumber pAddlChrgAmt,NNumber pConvertDiscAmt,NNumber pConvertTaxAmt,NNumber pConvertAddlChrgAmt,NString pTgrpCode,NNumber pAmt,NString pDescChgeInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_REQUISITION.P_VALIDATE_ITEM", DbManager.getDataBaseFactory());
			
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
		
	
	
	@DbRecordType(id="ReqHeaderRecRow", dataSourceName="REQ_HEADER_REC")
	public static class ReqHeaderRecRow
	{
		@DbRecordField(dataSourceName="CODE")
		public NString Code;
		@DbRecordField(dataSourceName="ACTIVITY_DATE")
		public NDate ActivityDate;
		@DbRecordField(dataSourceName="USER_ID")
		public NString UserId;
		@DbRecordField(dataSourceName="REQH_DATE")
		public NDate ReqhDate;
		@DbRecordField(dataSourceName="TRANS_DATE")
		public NDate TransDate;
		@DbRecordField(dataSourceName="NAME")
		public NString _Name;
		@DbRecordField(dataSourceName="PHONE_AREA")
		public NString PhoneArea;
		@DbRecordField(dataSourceName="PHONE_NUM")
		public NString PhoneNum;
		@DbRecordField(dataSourceName="PHONE_EXT")
		public NString PhoneExt;
		@DbRecordField(dataSourceName="VEND_PIDM")
		public NNumber VendPidm;
		@DbRecordField(dataSourceName="ATYP_CODE")
		public NString AtypCode;
		@DbRecordField(dataSourceName="ATYP_SEQ_NUM")
		public NNumber AtypSeqNum;
		@DbRecordField(dataSourceName="COAS_CODE")
		public NString CoasCode;
		@DbRecordField(dataSourceName="ORGN_CODE")
		public NString OrgnCode;
		@DbRecordField(dataSourceName="REQD_DATE")
		public NDate ReqdDate;
		@DbRecordField(dataSourceName="COMPLETE_IND")
		public NString CompleteInd;
		@DbRecordField(dataSourceName="PRINT_IND")
		public NString PrintInd;
		@DbRecordField(dataSourceName="ENCUMB_IND")
		public NString EncumbInd;
		@DbRecordField(dataSourceName="SUSP_IND")
		public NString SuspInd;
		@DbRecordField(dataSourceName="CANCEL_IND")
		public NString CancelInd;
		@DbRecordField(dataSourceName="CANCEL_DATE")
		public NDate CancelDate;
		@DbRecordField(dataSourceName="POST_DATE")
		public NDate PostDate;
		@DbRecordField(dataSourceName="APPR_IND")
		public NString ApprInd;
		@DbRecordField(dataSourceName="TEXT_IND")
		public NString TextInd;
		@DbRecordField(dataSourceName="EDIT_DEFER_IND")
		public NString EditDeferInd;
		@DbRecordField(dataSourceName="RECOMM_VEND_NAME")
		public NString RecommVendName;
		@DbRecordField(dataSourceName="CURR_CODE")
		public NString CurrCode;
		@DbRecordField(dataSourceName="NSF_ON_OFF_IND")
		public NString NsfOnOffInd;
		@DbRecordField(dataSourceName="SINGLE_ACCTG_IND")
		public NString SingleAcctgInd;
		@DbRecordField(dataSourceName="CLOSED_IND")
		public NString ClosedInd;
		@DbRecordField(dataSourceName="SHIP_CODE")
		public NString ShipCode;
		@DbRecordField(dataSourceName="RQST_TYPE_IND")
		public NString RqstTypeInd;
		@DbRecordField(dataSourceName="INVENTORY_REQ_IND")
		public NString InventoryReqInd;
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
		@DbRecordField(dataSourceName="DISC_CODE")
		public NString DiscCode;
		@DbRecordField(dataSourceName="VEND_EMAIL_ADDR")
		public NString VendEmailAddr;
		@DbRecordField(dataSourceName="COPIED_FROM")
		public NString CopiedFrom;
		@DbRecordField(dataSourceName="TGRP_CODE")
		public NString TgrpCode;
		@DbRecordField(dataSourceName="REQ_PRINT_DATE")
		public NDate ReqPrintDate;
		@DbRecordField(dataSourceName="CLOSED_DATE")
		public NDate ClosedDate;
		@DbRecordField(dataSourceName="MATCH_REQUIRED")
		public NString MatchRequired;
		@DbRecordField(dataSourceName="ORIGIN_CODE")
		public NString OriginCode;
		@DbRecordField(dataSourceName="DOC_REF_CODE")
		public NString DocRefCode;
		@DbRecordField(dataSourceName="STATUS")
		public NString Status;
		@DbRecordField(dataSourceName="CTRY_CODE_PHONE")
		public NString CtryCodePhone;
		@DbRecordField(dataSourceName="CTRY_CODE_FAX")
		public NString CtryCodeFax;
		@DbRecordField(dataSourceName="INTERNAL_RECORD_ID")
		public NString InternalRecordId;
	}

	
	@DbRecordType(id="ReqnAccountingRecRow", dataSourceName="REQN_ACCOUNTING_REC")
	public static class ReqnAccountingRecRow
	{
		@DbRecordField(dataSourceName="REQH_CODE")
		public NString ReqhCode;
		@DbRecordField(dataSourceName="ITEM")
		public NNumber Item;
		@DbRecordField(dataSourceName="SEQ_NUM")
		public NNumber SeqNum;
		@DbRecordField(dataSourceName="ACTIVITY_DATE")
		public NDate ActivityDate;
		@DbRecordField(dataSourceName="USER_ID")
		public NString UserId;
		@DbRecordField(dataSourceName="PCT")
		public NNumber Pct;
		@DbRecordField(dataSourceName="AMT")
		public NNumber Amt;
		@DbRecordField(dataSourceName="FSYR_CODE")
		public NString FsyrCode;
		@DbRecordField(dataSourceName="PERIOD")
		public NString Period;
		@DbRecordField(dataSourceName="RUCL_CODE")
		public NString RuclCode;
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
		@DbRecordField(dataSourceName="SUSP_IND")
		public NString SuspInd;
		@DbRecordField(dataSourceName="NSF_SUSP_IND")
		public NString NsfSuspInd;
		@DbRecordField(dataSourceName="CANCEL_IND")
		public NString CancelInd;
		@DbRecordField(dataSourceName="CANCEL_DATE")
		public NDate CancelDate;
		@DbRecordField(dataSourceName="PROJ_CODE")
		public NString ProjCode;
		@DbRecordField(dataSourceName="APPR_IND")
		public NString ApprInd;
		@DbRecordField(dataSourceName="NSF_OVERRIDE_IND")
		public NString NsfOverrideInd;
		@DbRecordField(dataSourceName="ABAL_IND")
		public NString AbalInd;
		@DbRecordField(dataSourceName="CONVERTED_AMT")
		public NNumber ConvertedAmt;
		@DbRecordField(dataSourceName="CLOSED_IND")
		public NString ClosedInd;
		@DbRecordField(dataSourceName="DISC_AMT")
		public NNumber DiscAmt;
		@DbRecordField(dataSourceName="TAX_AMT")
		public NNumber TaxAmt;
		@DbRecordField(dataSourceName="ADDL_CHRG_AMT")
		public NNumber AddlChrgAmt;
		@DbRecordField(dataSourceName="CONVERT_DISC_AMT")
		public NNumber ConvertDiscAmt;
		@DbRecordField(dataSourceName="CONVERT_TAX_AMT")
		public NNumber ConvertTaxAmt;
		@DbRecordField(dataSourceName="CONVERT_ADDL_CHRG_AMT")
		public NNumber ConvertAddlChrgAmt;
		@DbRecordField(dataSourceName="DISC_AMT_PCT")
		public NNumber DiscAmtPct;
		@DbRecordField(dataSourceName="ADDL_AMT_PCT")
		public NNumber AddlAmtPct;
		@DbRecordField(dataSourceName="TAX_AMT_PCT")
		public NNumber TaxAmtPct;
		@DbRecordField(dataSourceName="DISC_RUCL_CODE")
		public NString DiscRuclCode;
		@DbRecordField(dataSourceName="TAX_RUCL_CODE")
		public NString TaxRuclCode;
		@DbRecordField(dataSourceName="ADDL_RUCL_CODE")
		public NString AddlRuclCode;
		@DbRecordField(dataSourceName="RUCL_CODE_LIQ")
		public NString RuclCodeLiq;
		@DbRecordField(dataSourceName="INTERNAL_RECORD_ID")
		public NString InternalRecordId;
	}

	
	@DbRecordType(id="ReqnItemRecRow", dataSourceName="REQN_ITEM_REC")
	public static class ReqnItemRecRow
	{
		@DbRecordField(dataSourceName="REQH_CODE")
		public NString ReqhCode;
		@DbRecordField(dataSourceName="ITEM")
		public NNumber Item;
		@DbRecordField(dataSourceName="ACTIVITY_DATE")
		public NDate ActivityDate;
		@DbRecordField(dataSourceName="USER_ID")
		public NString UserId;
		@DbRecordField(dataSourceName="COMM_CODE")
		public NString CommCode;
		@DbRecordField(dataSourceName="COMM_DESC")
		public NString CommDesc;
		@DbRecordField(dataSourceName="COAS_CODE")
		public NString CoasCode;
		@DbRecordField(dataSourceName="ORGN_CODE")
		public NString OrgnCode;
		@DbRecordField(dataSourceName="BUYR_CODE")
		public NString BuyrCode;
		@DbRecordField(dataSourceName="QTY")
		public NNumber Qty;
		@DbRecordField(dataSourceName="UOMS_CODE")
		public NString UomsCode;
		@DbRecordField(dataSourceName="UNIT_PRICE")
		public NNumber UnitPrice;
		@DbRecordField(dataSourceName="AGRE_CODE")
		public NString AgreCode;
		@DbRecordField(dataSourceName="REQD_DATE")
		public NDate ReqdDate;
		@DbRecordField(dataSourceName="SHIP_CODE")
		public NString ShipCode;
		@DbRecordField(dataSourceName="VEND_PIDM")
		public NNumber VendPidm;
		@DbRecordField(dataSourceName="VEND_REF_NUM")
		public NString VendRefNum;
		@DbRecordField(dataSourceName="PROJ_CODE")
		public NString ProjCode;
		@DbRecordField(dataSourceName="POHD_CODE")
		public NString PohdCode;
		@DbRecordField(dataSourceName="POHD_ITEM")
		public NNumber PohdItem;
		@DbRecordField(dataSourceName="BIDS_CODE")
		public NString BidsCode;
		@DbRecordField(dataSourceName="COMPLETE_IND")
		public NString CompleteInd;
		@DbRecordField(dataSourceName="SUSP_IND")
		public NString SuspInd;
		@DbRecordField(dataSourceName="CANCEL_IND")
		public NString CancelInd;
		@DbRecordField(dataSourceName="CANCEL_DATE")
		public NDate CancelDate;
		@DbRecordField(dataSourceName="CLOSED_IND")
		public NString ClosedInd;
		@DbRecordField(dataSourceName="POST_DATE")
		public NDate PostDate;
		@DbRecordField(dataSourceName="TEXT_USAGE")
		public NString TextUsage;
		@DbRecordField(dataSourceName="ATYP_CODE")
		public NString AtypCode;
		@DbRecordField(dataSourceName="ATYP_SEQ_NUM")
		public NNumber AtypSeqNum;
		@DbRecordField(dataSourceName="RECOMM_VEND_NAME")
		public NString RecommVendName;
		@DbRecordField(dataSourceName="CURR_CODE")
		public NString CurrCode;
		@DbRecordField(dataSourceName="CONVERTED_UNIT_PRICE")
		public NNumber ConvertedUnitPrice;
		@DbRecordField(dataSourceName="DISC_AMT")
		public NNumber DiscAmt;
		@DbRecordField(dataSourceName="TAX_AMT")
		public NNumber TaxAmt;
		@DbRecordField(dataSourceName="ADDL_CHRG_AMT")
		public NNumber AddlChrgAmt;
		@DbRecordField(dataSourceName="CONVERT_DISC_AMT")
		public NNumber ConvertDiscAmt;
		@DbRecordField(dataSourceName="CONVERT_TAX_AMT")
		public NNumber ConvertTaxAmt;
		@DbRecordField(dataSourceName="CONVERT_ADDL_CHRG_AMT")
		public NNumber ConvertAddlChrgAmt;
		@DbRecordField(dataSourceName="TGRP_CODE")
		public NString TgrpCode;
		@DbRecordField(dataSourceName="AMT")
		public NNumber Amt;
		@DbRecordField(dataSourceName="DESC_CHGE_IND")
		public NString DescChgeInd;
		@DbRecordField(dataSourceName="INTERNAL_RECORD_ID")
		public NString InternalRecordId;
	}

	
	
}
