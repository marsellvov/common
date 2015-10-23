package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class FbInvoiceItemRules {
		public static NString fCheckTolerance(NString pUserId,FbInvoiceItem.InvoiceItemRecRow pItemRec) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_INVOICE_ITEM_RULES.F_CHECK_TOLERANCE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter(DbTypes.createStructType("P_ITEM_REC", pItemRec, FbInvoiceItem.InvoiceItemRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetAcceptAmt(NString pPohdCode,NNumber pPoItem) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_INVOICE_ITEM_RULES.F_GET_ACCEPT_AMT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_POHD_CODE", pPohdCode);
			cmd.addParameter("@P_PO_ITEM", pPoItem);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetAcceptQty(NString pPohdCode,NNumber pPoItem) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_INVOICE_ITEM_RULES.F_GET_ACCEPT_QTY", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_POHD_CODE", pPohdCode);
			cmd.addParameter("@P_PO_ITEM", pPoItem);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetBoAmt(NString pInvhCode,NString pPohdCode,NNumber pPoItem) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_INVOICE_ITEM_RULES.F_GET_BO_AMT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_INVH_CODE", pInvhCode);
			cmd.addParameter("@P_POHD_CODE", pPohdCode);
			cmd.addParameter("@P_PO_ITEM", pPoItem);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetDiscAmt(NString pDiscCode,NNumber pQty,NNumber pAmt,NDate pInvoiceDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_INVOICE_ITEM_RULES.F_GET_DISC_AMT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_DISC_CODE", pDiscCode);
			cmd.addParameter("@P_QTY", pQty);
			cmd.addParameter("@P_AMT", pAmt);
			cmd.addParameter("@P_INVOICE_DATE", pInvoiceDate);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetEncdAmt(NString pEncdNum) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_INVOICE_ITEM_RULES.F_GET_ENCD_AMT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_ENCD_NUM", pEncdNum);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetLastRcvrInd(NString pPohdCode,NNumber pPoItem) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_INVOICE_ITEM_RULES.F_GET_LAST_RCVR_IND", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_POHD_CODE", pPohdCode);
			cmd.addParameter("@P_PO_ITEM", pPoItem);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetOrderedAmt(NString pPohdCode,NNumber pPoItem) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_INVOICE_ITEM_RULES.F_GET_ORDERED_AMT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_POHD_CODE", pPohdCode);
			cmd.addParameter("@P_PO_ITEM", pPoItem);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetOrderedQty(NString pPohdCode,NNumber pPoItem) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_INVOICE_ITEM_RULES.F_GET_ORDERED_QTY", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_POHD_CODE", pPohdCode);
			cmd.addParameter("@P_PO_ITEM", pPoItem);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetPrevAddlChrgAmt(NString pInvhCode,NString pPohdCode,NNumber pPoItem,NString pApprRequired) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_INVOICE_ITEM_RULES.F_GET_PREV_ADDL_CHRG_AMT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_INVH_CODE", pInvhCode);
			cmd.addParameter("@P_POHD_CODE", pPohdCode);
			cmd.addParameter("@P_PO_ITEM", pPoItem);
			cmd.addParameter("@P_APPR_REQUIRED", pApprRequired);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetPrevPaidAmt(NString pInvhCode,NString pPohdCode,NNumber pPoItem,NString pApprRequired) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_INVOICE_ITEM_RULES.F_GET_PREV_PAID_AMT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_INVH_CODE", pInvhCode);
			cmd.addParameter("@P_POHD_CODE", pPohdCode);
			cmd.addParameter("@P_PO_ITEM", pPoItem);
			cmd.addParameter("@P_APPR_REQUIRED", pApprRequired);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetPrevPaidQty(NString pInvhCode,NString pPohdCode,NNumber pPoItem,NString pApprRequired) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_INVOICE_ITEM_RULES.F_GET_PREV_PAID_QTY", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_INVH_CODE", pInvhCode);
			cmd.addParameter("@P_POHD_CODE", pPohdCode);
			cmd.addParameter("@P_PO_ITEM", pPoItem);
			cmd.addParameter("@P_APPR_REQUIRED", pApprRequired);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_INVOICE_ITEM_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NString pInvhCode,NString pPohdCode,NNumber pItem,NNumber pPoItem,NString pOpenPaidInd,NString pUserId,NString pCommCode,NString pCommDesc,NString pUomsCode,NString pAdjtCode,NDate pAdjtDate,NString pPartPmtInd,NNumber pPrevPaidQty,NNumber pRecvdQty,NNumber pInvdUnitPrice,NNumber pInvdQty,NNumber pAcceptQty,NNumber pAcceptUnitPrice,NNumber pDiscAmt,NNumber pTaxAmt,NNumber pApprQty,NNumber pApprUnitPrice,NString pTolOverrideInd,NString pHoldInd,NString pSuspInd,NString pTtagNum,NNumber pAddlChrgAmt,NNumber pConvertUnitPrice,NNumber pConvertDiscAmt,NNumber pConvertTaxAmt,NNumber pConvertAddlChrgAmt,NString pTgrpCode,NString pTagCapCode,NString pVendInvCode,NDate pVendInvDate,NNumber pVendInvItem,NNumber pPrevAmt,NString pDescChgeInd,NString pLastRcvrInd,NNumber pOverrideTaxAmt,NString pDataOrigin,NString pCreateUser,NDate pCreateDate,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_INVOICE_ITEM_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INVH_CODE", pInvhCode);
			cmd.addParameter("@P_POHD_CODE", pPohdCode);
			cmd.addParameter("@P_ITEM", pItem);
			cmd.addParameter("@P_PO_ITEM", pPoItem);
			cmd.addParameter("@P_OPEN_PAID_IND", pOpenPaidInd);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_COMM_CODE", pCommCode);
			cmd.addParameter("@P_COMM_DESC", pCommDesc);
			cmd.addParameter("@P_UOMS_CODE", pUomsCode);
			cmd.addParameter("@P_ADJT_CODE", pAdjtCode);
			cmd.addParameter("@P_ADJT_DATE", pAdjtDate);
			cmd.addParameter("@P_PART_PMT_IND", pPartPmtInd);
			cmd.addParameter("@P_PREV_PAID_QTY", pPrevPaidQty);
			cmd.addParameter("@P_RECVD_QTY", pRecvdQty);
			cmd.addParameter("@P_INVD_UNIT_PRICE", pInvdUnitPrice);
			cmd.addParameter("@P_INVD_QTY", pInvdQty);
			cmd.addParameter("@P_ACCEPT_QTY", pAcceptQty);
			cmd.addParameter("@P_ACCEPT_UNIT_PRICE", pAcceptUnitPrice);
			cmd.addParameter("@P_DISC_AMT", pDiscAmt);
			cmd.addParameter("@P_TAX_AMT", pTaxAmt);
			cmd.addParameter("@P_APPR_QTY", pApprQty);
			cmd.addParameter("@P_APPR_UNIT_PRICE", pApprUnitPrice);
			cmd.addParameter("@P_TOL_OVERRIDE_IND", pTolOverrideInd);
			cmd.addParameter("@P_HOLD_IND", pHoldInd);
			cmd.addParameter("@P_SUSP_IND", pSuspInd);
			cmd.addParameter("@P_TTAG_NUM", pTtagNum);
			cmd.addParameter("@P_ADDL_CHRG_AMT", pAddlChrgAmt);
			cmd.addParameter("@P_CONVERT_UNIT_PRICE", pConvertUnitPrice);
			cmd.addParameter("@P_CONVERT_DISC_AMT", pConvertDiscAmt);
			cmd.addParameter("@P_CONVERT_TAX_AMT", pConvertTaxAmt);
			cmd.addParameter("@P_CONVERT_ADDL_CHRG_AMT", pConvertAddlChrgAmt);
			cmd.addParameter("@P_TGRP_CODE", pTgrpCode);
			cmd.addParameter("@P_TAG_CAP_CODE", pTagCapCode);
			cmd.addParameter("@P_VEND_INV_CODE", pVendInvCode);
			cmd.addParameter("@P_VEND_INV_DATE", pVendInvDate);
			cmd.addParameter("@P_VEND_INV_ITEM", pVendInvItem);
			cmd.addParameter("@P_PREV_AMT", pPrevAmt);
			cmd.addParameter("@P_DESC_CHGE_IND", pDescChgeInd);
			cmd.addParameter("@P_LAST_RCVR_IND", pLastRcvrInd);
			cmd.addParameter("@P_OVERRIDE_TAX_AMT", pOverrideTaxAmt);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_CREATE_USER", pCreateUser);
			cmd.addParameter("@P_CREATE_DATE", pCreateDate);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidDelete(NString pInvhCode,NNumber pItem,NString pUserId,Ref<NString> pRowidInout,Ref<NString> pErrorMessageOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_INVOICE_ITEM_RULES.P_VALID_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_INVH_CODE", pInvhCode);
			cmd.addParameter("@P_ITEM", pItem);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
			cmd.addParameter("@P_ERROR_MESSAGE_OUT", NString.class);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);
			pErrorMessageOut.val = cmd.getParameterValue("@P_ERROR_MESSAGE_OUT", NString.class);


		}
		
		public static void pValidUpdate(Ref<FbInvoiceItem.InvoiceItemRecRow> pItemRecInout,FbInvoiceItem.InvoiceItemRecRow pExistingRec,Ref<NString> pErrorMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_INVOICE_ITEM_RULES.P_VALID_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter(DbTypes.createStructType("P_ITEM_REC_INOUT", pItemRecInout.val, FbInvoiceItem.InvoiceItemRecRow.class, true));
			cmd.addParameter(DbTypes.createStructType("P_EXISTING_REC", pExistingRec, FbInvoiceItem.InvoiceItemRecRow.class ));
			cmd.addParameter("@P_ERROR_MSG_OUT", NString.class);
				
			cmd.execute();
			pItemRecInout.val = cmd.getParameterValue("@P_ITEM_REC_INOUT", FbInvoiceItem.InvoiceItemRecRow.class);
			pErrorMsgOut.val = cmd.getParameterValue("@P_ERROR_MSG_OUT", NString.class);


		}
		
		public static void pValidate(Ref<FbInvoiceItem.InvoiceItemRecRow> pItemRecInout,FbInvoiceItem.InvoiceItemRecRow pExistingRec,NNumber pOperationType,Ref<NString> pErrorMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_INVOICE_ITEM_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter(DbTypes.createStructType("P_ITEM_REC_INOUT", pItemRecInout.val, FbInvoiceItem.InvoiceItemRecRow.class, true));
			cmd.addParameter(DbTypes.createStructType("P_EXISTING_REC", pExistingRec, FbInvoiceItem.InvoiceItemRecRow.class ));
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_ERROR_MSG_OUT", NString.class);
				
			cmd.execute();
			pItemRecInout.val = cmd.getParameterValue("@P_ITEM_REC_INOUT", FbInvoiceItem.InvoiceItemRecRow.class);
			pErrorMsgOut.val = cmd.getParameterValue("@P_ERROR_MSG_OUT", NString.class);


		}
		
		public static void pValidateMandatory(FbInvoiceItem.InvoiceItemRecRow pItemRec,Ref<NString> pErrorMsgInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_INVOICE_ITEM_RULES.P_VALIDATE_MANDATORY", DbManager.getDataBaseFactory());
			
			cmd.addParameter(DbTypes.createStructType("P_ITEM_REC", pItemRec, FbInvoiceItem.InvoiceItemRecRow.class ));
			cmd.addParameter("@P_ERROR_MSG_INOUT", pErrorMsgInout, true);
				
			cmd.execute();
			pErrorMsgInout.val = cmd.getParameterValue("@P_ERROR_MSG_INOUT", NString.class);


		}
		
	
	
	
}
