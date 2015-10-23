package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class FvInvoiceItem {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FV_INVOICE_ITEM.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static void fConvertRectypeToRowtype() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FV_INVOICE_ITEM.F_CONVERT_RECTYPE_TO_ROWTYPE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static NString fExists(NString pInvhCode,NNumber pItem,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FV_INVOICE_ITEM.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_INVH_CODE", pInvhCode);
			cmd.addParameter("@P_ITEM", pItem);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fExistsData(NString pInvhCode,NNumber pItem,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FV_INVOICE_ITEM.F_EXISTS_DATA", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_INVH_CODE", pInvhCode);
			cmd.addParameter("@P_ITEM", pItem);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(InvoiceItemRecRow recOne,InvoiceItemRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FV_INVOICE_ITEM.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, InvoiceItemRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, InvoiceItemRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber fMaxItem(NString pInvhCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FV_INVOICE_ITEM.F_MAX_ITEM", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_INVH_CODE", pInvhCode);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fMaxVendInvItem(NString pInvhCode,NString pVendInvCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FV_INVOICE_ITEM.F_MAX_VEND_INV_ITEM", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_INVH_CODE", pInvhCode);
			cmd.addParameter("@P_VEND_INV_CODE", pVendInvCode);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static DataCursor fQueryAll(NString pInvhCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FV_INVOICE_ITEM.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_INVH_CODE", pInvhCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FV_INVOICE_ITEM.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NString pInvhCode,NNumber pItem) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FV_INVOICE_ITEM.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_INVH_CODE", pInvhCode);
			cmd.addParameter("@P_ITEM", pItem);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NString pInvhCode,NNumber pItem,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FV_INVOICE_ITEM.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_INVH_CODE", pInvhCode);
			cmd.addParameter("@P_ITEM", pItem);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static NString fQueryOneString(NString pInvhCode,NString pRowid,NString pSeparationChar) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FV_INVOICE_ITEM.F_QUERY_ONE_STRING", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_INVH_CODE", pInvhCode);
			cmd.addParameter("@P_ROWID", pRowid);
			cmd.addParameter("@P_SEPARATION_CHAR", pSeparationChar);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pCreate(NString pInvhCode,NString pPohdCode,NNumber pItem,NNumber pPoItem,NString pUserId,NString pCommCode,NString pCommDesc,NString pUomsCode,NString pAdjtCode,NDate pAdjtDate,NString pPartPmtInd,NNumber pInvdUnitPrice,NNumber pInvdQty,NNumber pAcceptQty,NNumber pAcceptUnitPrice,NNumber pDiscAmt,NNumber pTaxAmt,NNumber pApprQty,NNumber pApprUnitPrice,NString pTolOverrideInd,NString pHoldInd,NString pTtagNum,NNumber pAddlChrgAmt,NString pTgrpCode,NString pVendInvCode,NDate pVendInvDate,NNumber pVendInvItem,NString pDataOrigin,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FV_INVOICE_ITEM.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_INVH_CODE", pInvhCode);
			cmd.addParameter("@P_POHD_CODE", pPohdCode);
			cmd.addParameter("@P_ITEM", pItem);
			cmd.addParameter("@P_PO_ITEM", pPoItem);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_COMM_CODE", pCommCode);
			cmd.addParameter("@P_COMM_DESC", pCommDesc);
			cmd.addParameter("@P_UOMS_CODE", pUomsCode);
			cmd.addParameter("@P_ADJT_CODE", pAdjtCode);
			cmd.addParameter("@P_ADJT_DATE", pAdjtDate);
			cmd.addParameter("@P_PART_PMT_IND", pPartPmtInd);
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
			cmd.addParameter("@P_TTAG_NUM", pTtagNum);
			cmd.addParameter("@P_ADDL_CHRG_AMT", pAddlChrgAmt);
			cmd.addParameter("@P_TGRP_CODE", pTgrpCode);
			cmd.addParameter("@P_VEND_INV_CODE", pVendInvCode);
			cmd.addParameter("@P_VEND_INV_DATE", pVendInvDate);
			cmd.addParameter("@P_VEND_INV_ITEM", pVendInvItem);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pCreateItem(Ref<InvoiceItemRecRow> invoiceItemData) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FV_INVOICE_ITEM.P_CREATE_ITEM", DbManager.getDataBaseFactory());
			
			cmd.addParameter(DbTypes.createStructType("INVOICE_ITEM_DATA", invoiceItemData.val, InvoiceItemRecRow.class, true));
				
			cmd.execute();
			invoiceItemData.val = cmd.getParameterValue("@INVOICE_ITEM_DATA", InvoiceItemRecRow.class);


		}
		
		public static void pDelete(NString pInvhCode,NNumber pItem,NString pUserId,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FV_INVOICE_ITEM.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_INVH_CODE", pInvhCode);
			cmd.addParameter("@P_ITEM", pItem);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pDeleteInternal(NString pInvhCode,NString pDeleteAll) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FV_INVOICE_ITEM.P_DELETE_INTERNAL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_INVH_CODE", pInvhCode);
			cmd.addParameter("@P_DELETE_ALL", pDeleteAll);
				
			cmd.execute();


		}
		
		public static void pGetTotalAmts(NString pInvhCode,NString pSingleAcctInd,NNumber pItem,Ref<NNumber> pTotalApprAmt,Ref<NNumber> pTotalConvertApprAmt,Ref<NNumber> pTotalDiscAmt,Ref<NNumber> pTotalConvertDiscAmt,Ref<NNumber> pTotalAddlAmt,Ref<NNumber> pTotalConvertAddlAmt,Ref<NNumber> pTotalTaxAmt,Ref<NNumber> pTotalConvertTaxAmt) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FV_INVOICE_ITEM.P_GET_TOTAL_AMTS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_INVH_CODE", pInvhCode);
			cmd.addParameter("@P_SINGLE_ACCT_IND", pSingleAcctInd);
			cmd.addParameter("@P_ITEM", pItem);
			cmd.addParameter("@P_TOTAL_APPR_AMT", NNumber.class);
			cmd.addParameter("@P_TOTAL_CONVERT_APPR_AMT", NNumber.class);
			cmd.addParameter("@P_TOTAL_DISC_AMT", NNumber.class);
			cmd.addParameter("@P_TOTAL_CONVERT_DISC_AMT", NNumber.class);
			cmd.addParameter("@P_TOTAL_ADDL_AMT", NNumber.class);
			cmd.addParameter("@P_TOTAL_CONVERT_ADDL_AMT", NNumber.class);
			cmd.addParameter("@P_TOTAL_TAX_AMT", NNumber.class);
			cmd.addParameter("@P_TOTAL_CONVERT_TAX_AMT", NNumber.class);
				
			cmd.execute();
			pTotalApprAmt.val = cmd.getParameterValue("@P_TOTAL_APPR_AMT", NNumber.class);
			pTotalConvertApprAmt.val = cmd.getParameterValue("@P_TOTAL_CONVERT_APPR_AMT", NNumber.class);
			pTotalDiscAmt.val = cmd.getParameterValue("@P_TOTAL_DISC_AMT", NNumber.class);
			pTotalConvertDiscAmt.val = cmd.getParameterValue("@P_TOTAL_CONVERT_DISC_AMT", NNumber.class);
			pTotalAddlAmt.val = cmd.getParameterValue("@P_TOTAL_ADDL_AMT", NNumber.class);
			pTotalConvertAddlAmt.val = cmd.getParameterValue("@P_TOTAL_CONVERT_ADDL_AMT", NNumber.class);
			pTotalTaxAmt.val = cmd.getParameterValue("@P_TOTAL_TAX_AMT", NNumber.class);
			pTotalConvertTaxAmt.val = cmd.getParameterValue("@P_TOTAL_CONVERT_TAX_AMT", NNumber.class);


		}
		
		public static void pLock(NString pInvhCode,NNumber pItem,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FV_INVOICE_ITEM.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_INVH_CODE", pInvhCode);
			cmd.addParameter("@P_ITEM", pItem);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pMaintainFarvinv(NString pInvhCode,NString pUserId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FV_INVOICE_ITEM.P_MAINTAIN_FARVINV", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_INVH_CODE", pInvhCode);
			cmd.addParameter("@P_USER_ID", pUserId);
				
			cmd.execute();


		}
		
		public static void pUpdate(NString pInvhCode,NNumber pItem,NString pOpenPaidInd,NString pUserId,NString pCommCode,NString pCommDesc,NString pUomsCode,NString pAdjtCode,NDate pAdjtDate,NString pPartPmtInd,NNumber pPrevPaidQty,NNumber pInvdUnitPrice,NNumber pInvdQty,NNumber pAcceptQty,NNumber pAcceptUnitPrice,NNumber pDiscAmt,NNumber pTaxAmt,NNumber pApprQty,NNumber pApprUnitPrice,NString pTolOverrideInd,NString pHoldInd,NString pSuspInd,NString pTtagNum,NNumber pAddlChrgAmt,NNumber pConvertUnitPrice,NNumber pConvertDiscAmt,NNumber pConvertTaxAmt,NNumber pConvertAddlChrgAmt,NString pTgrpCode,NString pTagCapCode,NString pVendInvCode,NDate pVendInvDate,NNumber pVendInvItem,NNumber pOverrideTaxAmt,NString pDataOrigin,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FV_INVOICE_ITEM.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_INVH_CODE", pInvhCode);
			cmd.addParameter("@P_ITEM", pItem);
			cmd.addParameter("@P_OPEN_PAID_IND", pOpenPaidInd);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_COMM_CODE", pCommCode);
			cmd.addParameter("@P_COMM_DESC", pCommDesc);
			cmd.addParameter("@P_UOMS_CODE", pUomsCode);
			cmd.addParameter("@P_ADJT_CODE", pAdjtCode);
			cmd.addParameter("@P_ADJT_DATE", pAdjtDate);
			cmd.addParameter("@P_PART_PMT_IND", pPartPmtInd);
			cmd.addParameter("@P_PREV_PAID_QTY", pPrevPaidQty);
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
			cmd.addParameter("@P_OVERRIDE_TAX_AMT", pOverrideTaxAmt);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pUpdateInternal(NString pInvhCode,NNumber pItem,NString pPohdCode,NNumber pPoItem,NString pOpenPaidInd,NNumber pPrevPaidQty,NNumber pAcceptQty,NNumber pAcceptUnitPrice,NString pCheckNum,NString pBankCode,NString pUserId,NString pDataOrigin) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FV_INVOICE_ITEM.P_UPDATE_INTERNAL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_INVH_CODE", pInvhCode);
			cmd.addParameter("@P_ITEM", pItem);
			cmd.addParameter("@P_POHD_CODE", pPohdCode);
			cmd.addParameter("@P_PO_ITEM", pPoItem);
			cmd.addParameter("@P_OPEN_PAID_IND", pOpenPaidInd);
			cmd.addParameter("@P_PREV_PAID_QTY", pPrevPaidQty);
			cmd.addParameter("@P_ACCEPT_QTY", pAcceptQty);
			cmd.addParameter("@P_ACCEPT_UNIT_PRICE", pAcceptUnitPrice);
			cmd.addParameter("@P_CHECK_NUM", pCheckNum);
			cmd.addParameter("@P_BANK_CODE", pBankCode);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
				
			cmd.execute();


		}
		
		public static void pUpdateItem(Ref<InvoiceItemRecRow> invoiceItemData) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FV_INVOICE_ITEM.P_UPDATE_ITEM", DbManager.getDataBaseFactory());
			
			cmd.addParameter(DbTypes.createStructType("INVOICE_ITEM_DATA", invoiceItemData.val, InvoiceItemRecRow.class, true));
				
			cmd.execute();
			invoiceItemData.val = cmd.getParameterValue("@INVOICE_ITEM_DATA", InvoiceItemRecRow.class);


		}
		
	
	@DbRecordType(id="InvoiceItemRecRow", dataSourceName="INVOICE_ITEM_REC", needsInitialization=true)
	public static class InvoiceItemRecRow
	{
		@DbRecordField(dataSourceName="R_INVH_CODE")
		public NString RInvhCode;
		@DbRecordField(dataSourceName="R_POHD_CODE")
		public NString RPohdCode;
		@DbRecordField(dataSourceName="R_ITEM")
		public NNumber RItem;
		@DbRecordField(dataSourceName="R_PO_ITEM")
		public NNumber RPoItem;
		@DbRecordField(dataSourceName="R_OPEN_PAID_IND")
		public NString ROpenPaidInd;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_COMM_CODE")
		public NString RCommCode;
		@DbRecordField(dataSourceName="R_COMM_DESC")
		public NString RCommDesc;
		@DbRecordField(dataSourceName="R_UOMS_CODE")
		public NString RUomsCode;
		@DbRecordField(dataSourceName="R_ADJT_CODE")
		public NString RAdjtCode;
		@DbRecordField(dataSourceName="R_ADJT_DATE")
		public NDate RAdjtDate;
		@DbRecordField(dataSourceName="R_PART_PMT_IND")
		public NString RPartPmtInd;
		@DbRecordField(dataSourceName="R_PREV_PAID_QTY")
		public NNumber RPrevPaidQty;
		@DbRecordField(dataSourceName="R_RECVD_QTY")
		public NNumber RRecvdQty;
		@DbRecordField(dataSourceName="R_INVD_UNIT_PRICE")
		public NNumber RInvdUnitPrice;
		@DbRecordField(dataSourceName="R_INVD_QTY")
		public NNumber RInvdQty;
		@DbRecordField(dataSourceName="R_ACCEPT_QTY")
		public NNumber RAcceptQty;
		@DbRecordField(dataSourceName="R_ACCEPT_UNIT_PRICE")
		public NNumber RAcceptUnitPrice;
		@DbRecordField(dataSourceName="R_DISC_AMT")
		public NNumber RDiscAmt;
		@DbRecordField(dataSourceName="R_TAX_AMT")
		public NNumber RTaxAmt;
		@DbRecordField(dataSourceName="R_APPR_QTY")
		public NNumber RApprQty;
		@DbRecordField(dataSourceName="R_APPR_UNIT_PRICE")
		public NNumber RApprUnitPrice;
		@DbRecordField(dataSourceName="R_TOL_OVERRIDE_IND")
		public NString RTolOverrideInd;
		@DbRecordField(dataSourceName="R_HOLD_IND")
		public NString RHoldInd;
		@DbRecordField(dataSourceName="R_SUSP_IND")
		public NString RSuspInd;
		@DbRecordField(dataSourceName="R_TTAG_NUM")
		public NString RTtagNum;
		@DbRecordField(dataSourceName="R_ADDL_CHRG_AMT")
		public NNumber RAddlChrgAmt;
		@DbRecordField(dataSourceName="R_CONVERT_UNIT_PRICE")
		public NNumber RConvertUnitPrice;
		@DbRecordField(dataSourceName="R_CONVERT_DISC_AMT")
		public NNumber RConvertDiscAmt;
		@DbRecordField(dataSourceName="R_CONVERT_TAX_AMT")
		public NNumber RConvertTaxAmt;
		@DbRecordField(dataSourceName="R_CONVERT_ADDL_CHRG_AMT")
		public NNumber RConvertAddlChrgAmt;
		@DbRecordField(dataSourceName="R_TGRP_CODE")
		public NString RTgrpCode;
		@DbRecordField(dataSourceName="R_TAG_CAP_CODE")
		public NString RTagCapCode;
		@DbRecordField(dataSourceName="R_VEND_INV_CODE")
		public NString RVendInvCode;
		@DbRecordField(dataSourceName="R_VEND_INV_DATE")
		public NDate RVendInvDate;
		@DbRecordField(dataSourceName="R_VEND_INV_ITEM")
		public NNumber RVendInvItem;
		@DbRecordField(dataSourceName="R_PREV_AMT")
		public NNumber RPrevAmt;
		@DbRecordField(dataSourceName="R_DESC_CHGE_IND")
		public NString RDescChgeInd;
		@DbRecordField(dataSourceName="R_LAST_RCVR_IND")
		public NString RLastRcvrInd;
		@DbRecordField(dataSourceName="R_OVERRIDE_TAX_AMT")
		public NNumber ROverrideTaxAmt;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_CREATE_USER")
		public NString RCreateUser;
		@DbRecordField(dataSourceName="R_CREATE_DATE")
		public NDate RCreateDate;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
