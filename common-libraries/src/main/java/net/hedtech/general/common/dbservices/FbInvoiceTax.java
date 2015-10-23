package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class FbInvoiceTax {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_INVOICE_TAX.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NNumber fCalcBaseTaxAmt(NDate pTransDate,NString pTgrpCode,NNumber pVendPidm,NNumber pApprQty,NNumber pApprUnitPrice,NNumber pDiscAmt,NNumber pAddlChrgAmt,NString pCurrCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_INVOICE_TAX.F_CALC_BASE_TAX_AMT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_TRANS_DATE", pTransDate);
			cmd.addParameter("@P_TGRP_CODE", pTgrpCode);
			cmd.addParameter("@P_VEND_PIDM", pVendPidm);
			cmd.addParameter("@P_APPR_QTY", pApprQty);
			cmd.addParameter("@P_APPR_UNIT_PRICE", pApprUnitPrice);
			cmd.addParameter("@P_DISC_AMT", pDiscAmt);
			cmd.addParameter("@P_ADDL_CHRG_AMT", pAddlChrgAmt);
			cmd.addParameter("@P_CURR_CODE", pCurrCode);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString fExists(NString pInvhCode,NString pTratCode,NNumber pItem,NNumber pSeqNum,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_INVOICE_TAX.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_INVH_CODE", pInvhCode);
			cmd.addParameter("@P_TRAT_CODE", pTratCode);
			cmd.addParameter("@P_ITEM", pItem);
			cmd.addParameter("@P_SEQ_NUM", pSeqNum);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NBool fExistsData(NString pInvhCode,NString pTratCode,NNumber pItem,NNumber pSeqNum,NString pRowid,Ref<InvoiceTaxRecRow> pInvtaxRecOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_INVOICE_TAX.F_EXISTS_DATA", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@P_INVH_CODE", pInvhCode);
			cmd.addParameter("@P_TRAT_CODE", pTratCode);
			cmd.addParameter("@P_ITEM", pItem);
			cmd.addParameter("@P_SEQ_NUM", pSeqNum);
			cmd.addParameter("@P_ROWID", pRowid);
			cmd.addParameter(DbTypes.createStructType("P_INVTAX_REC_OUT", pInvtaxRecOut.val, InvoiceTaxRecRow.class));
				
			cmd.execute();
			pInvtaxRecOut.val = cmd.getParameterValue("@P_INVTAX_REC_OUT", InvoiceTaxRecRow.class);

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NNumber fGetTaxRebate(NString pInvhCode,NNumber pItem) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_INVOICE_TAX.F_GET_TAX_REBATE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_INVH_CODE", pInvhCode);
			cmd.addParameter("@P_ITEM", pItem);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fGetTaxRebate(NString pInvhCode,NNumber pItem,NNumber pSeqNum) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_INVOICE_TAX.F_GET_TAX_REBATE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_INVH_CODE", pInvhCode);
			cmd.addParameter("@P_ITEM", pItem);
			cmd.addParameter("@P_SEQ_NUM", pSeqNum);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString fIsequal(InvoiceTaxRecRow recOne,InvoiceTaxRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_INVOICE_TAX.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, InvoiceTaxRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, InvoiceTaxRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NString pInvhCode,NString pTratCode,NString pPayTaxTo,NNumber pItem,NNumber pSeqNum,NString pRuclCode,NNumber pPriorityNum,NString pRebateInd,NString pUserId,NString pDataOrigin) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_INVOICE_TAX.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_INVH_CODE", pInvhCode);
			cmd.addParameter("@P_TRAT_CODE", pTratCode);
			cmd.addParameter("@P_PAY_TAX_TO", pPayTaxTo);
			cmd.addParameter("@P_ITEM", pItem);
			cmd.addParameter("@P_SEQ_NUM", pSeqNum);
			cmd.addParameter("@P_RUCL_CODE", pRuclCode);
			cmd.addParameter("@P_PRIORITY_NUM", pPriorityNum);
			cmd.addParameter("@P_REBATE_IND", pRebateInd);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_INVOICE_TAX.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NString pInvhCode,NString pTratCode,NNumber pItem,NNumber pSeqNum) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_INVOICE_TAX.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_INVH_CODE", pInvhCode);
			cmd.addParameter("@P_TRAT_CODE", pTratCode);
			cmd.addParameter("@P_ITEM", pItem);
			cmd.addParameter("@P_SEQ_NUM", pSeqNum);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NString pInvhCode,NString pTratCode,NNumber pTaxAmt,NString pPayTaxTo,NNumber pItem,NNumber pSeqNum,NString pRuclCode,NNumber pPriorityNum,NNumber pTaxableAmt,NString pRebateInd,NNumber pConvertTaxAmt,NString pTratDescrip,NNumber pRebateAmt,NNumber pConvertRebateAmt,NNumber pRebatePercent,NString pCoasCodeRebate,NString pFundCodeRebate,NString pAcctCodeArRebate,NString pUserId,NString pDataOrigin,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_INVOICE_TAX.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
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
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static InvoiceTaxRecRow fQueryOneRec(NString pInvhCodeIn,NString pTratCodeIn,NNumber pItemIn,NNumber pSeqNumIn,NString pRowidIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_INVOICE_TAX.F_QUERY_ONE_REC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DbTypes.createStructType(InvoiceTaxRecRow.class));
			cmd.addParameter("@P_INVH_CODE_IN", pInvhCodeIn);
			cmd.addParameter("@P_TRAT_CODE_IN", pTratCodeIn);
			cmd.addParameter("@P_ITEM_IN", pItemIn);
			cmd.addParameter("@P_SEQ_NUM_IN", pSeqNumIn);
			cmd.addParameter("@P_ROWID_IN", pRowidIn);
				
			cmd.execute();

			return cmd.getReturnValue(InvoiceTaxRecRow.class);

		}
		
		public static NString fQueryOneString(NString pInvhCode,NString pTratCode,NNumber pItem,NNumber pSeqNum,NString pRowid,NString pSeparationChar) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_INVOICE_TAX.F_QUERY_ONE_STRING", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_INVH_CODE", pInvhCode);
			cmd.addParameter("@P_TRAT_CODE", pTratCode);
			cmd.addParameter("@P_ITEM", pItem);
			cmd.addParameter("@P_SEQ_NUM", pSeqNum);
			cmd.addParameter("@P_ROWID", pRowid);
			cmd.addParameter("@P_SEPARATION_CHAR", pSeparationChar);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pCalcAndCreate(NString pInvhCode,NNumber pItem,NString pTgrpCode,NString pCurrCode,NDate pTransDate,NNumber pVendPidm,NNumber pApprQty,NNumber pApprUnitPrice,NNumber pDiscAmt,NNumber pAddlChrgAmt,NNumber pOverrideTaxAmt,NString pUserId,NString pDataOrigin,Ref<NNumber> pTaxAmtOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_INVOICE_TAX.P_CALC_AND_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_INVH_CODE", pInvhCode);
			cmd.addParameter("@P_ITEM", pItem);
			cmd.addParameter("@P_TGRP_CODE", pTgrpCode);
			cmd.addParameter("@P_CURR_CODE", pCurrCode);
			cmd.addParameter("@P_TRANS_DATE", pTransDate);
			cmd.addParameter("@P_VEND_PIDM", pVendPidm);
			cmd.addParameter("@P_APPR_QTY", pApprQty);
			cmd.addParameter("@P_APPR_UNIT_PRICE", pApprUnitPrice);
			cmd.addParameter("@P_DISC_AMT", pDiscAmt);
			cmd.addParameter("@P_ADDL_CHRG_AMT", pAddlChrgAmt);
			cmd.addParameter("@P_OVERRIDE_TAX_AMT", pOverrideTaxAmt);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_TAX_AMT_OUT", NNumber.class);
				
			cmd.execute();
			pTaxAmtOut.val = cmd.getParameterValue("@P_TAX_AMT_OUT", NNumber.class);


		}
		
		public static void pCreate(NString pInvhCode,NString pTratCode,NNumber pTaxAmt,NString pPayTaxTo,NNumber pItem,NNumber pSeqNum,NString pRuclCode,NNumber pPriorityNum,NNumber pTaxableAmt,NString pRebateInd,NNumber pConvertTaxAmt,NString pTratDescrip,NNumber pRebateAmt,NNumber pConvertRebateAmt,NNumber pRebatePercent,NString pCoasCodeRebate,NString pFundCodeRebate,NString pAcctCodeArRebate,NString pUserId,NString pDataOrigin,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_INVOICE_TAX.P_CREATE", DbManager.getDataBaseFactory());
			
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
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pCreateBySequence(NString pInvhCode,NNumber pItem,NNumber pSeqNum,NString pUserId,NString pDataOrigin) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_INVOICE_TAX.P_CREATE_BY_SEQUENCE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_INVH_CODE", pInvhCode);
			cmd.addParameter("@P_ITEM", pItem);
			cmd.addParameter("@P_SEQ_NUM", pSeqNum);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
				
			cmd.execute();


		}
		
		public static void pCreateBySequence(FbInvoiceAcctg.InvoiceAcctgRecRow pAcctgRec) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_INVOICE_TAX.P_CREATE_BY_SEQUENCE", DbManager.getDataBaseFactory());
			
			cmd.addParameter(DbTypes.createStructType("P_ACCTG_REC", pAcctgRec, FbInvoiceAcctg.InvoiceAcctgRecRow.class ));
				
			cmd.execute();


		}
		
		public static void pDelete(NString pInvhCode,NString pTratCode,NNumber pTaxAmt,NString pPayTaxTo,NNumber pItem,NNumber pSeqNum,NString pRuclCode,NNumber pPriorityNum,NNumber pTaxableAmt,NString pRebateInd,NNumber pConvertTaxAmt,NString pTratDescrip,NNumber pRebateAmt,NNumber pConvertRebateAmt,NNumber pRebatePercent,NString pCoasCodeRebate,NString pFundCodeRebate,NString pAcctCodeArRebate,NString pUserId,NString pDataOrigin,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_INVOICE_TAX.P_DELETE", DbManager.getDataBaseFactory());
			
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
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pDeleteByItem(NString pInvhCode,NNumber pItem) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_INVOICE_TAX.P_DELETE_BY_ITEM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_INVH_CODE", pInvhCode);
			cmd.addParameter("@P_ITEM", pItem);
				
			cmd.execute();


		}
		
		public static void pDeleteBySequence(NString pInvhCode,NNumber pItem,NNumber pSeqNum) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_INVOICE_TAX.P_DELETE_BY_SEQUENCE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_INVH_CODE", pInvhCode);
			cmd.addParameter("@P_ITEM", pItem);
			cmd.addParameter("@P_SEQ_NUM", pSeqNum);
				
			cmd.execute();


		}
		
		public static void pDeleteInternal(NString pInvhCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_INVOICE_TAX.P_DELETE_INTERNAL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_INVH_CODE", pInvhCode);
				
			cmd.execute();


		}
		
		public static void pLock(Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_INVOICE_TAX.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NString pInvhCode,NString pTratCode,NNumber pTaxAmt,NString pPayTaxTo,NNumber pItem,NNumber pSeqNum,NString pRuclCode,NNumber pPriorityNum,NNumber pTaxableAmt,NString pRebateInd,NNumber pConvertTaxAmt,NString pTratDescrip,NNumber pRebateAmt,NNumber pConvertRebateAmt,NNumber pRebatePercent,NString pCoasCodeRebate,NString pFundCodeRebate,NString pAcctCodeArRebate,NString pUserId,NString pDataOrigin,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_INVOICE_TAX.P_UPDATE", DbManager.getDataBaseFactory());
			
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
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pUpdateByItem(NString pInvhCode,NNumber pItem,NNumber pTaxAmt,NNumber pOverrideTaxAmt,NString pUserId,NString pDataOrigin) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_INVOICE_TAX.P_UPDATE_BY_ITEM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_INVH_CODE", pInvhCode);
			cmd.addParameter("@P_ITEM", pItem);
			cmd.addParameter("@P_TAX_AMT", pTaxAmt);
			cmd.addParameter("@P_OVERRIDE_TAX_AMT", pOverrideTaxAmt);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="InvoiceTaxRecRow", dataSourceName="INVOICE_TAX_REC")
	public static class InvoiceTaxRecRow
	{
		@DbRecordField(dataSourceName="R_INVH_CODE")
		public NString RInvhCode;
		@DbRecordField(dataSourceName="R_TRAT_CODE")
		public NString RTratCode;
		@DbRecordField(dataSourceName="R_TAX_AMT")
		public NNumber RTaxAmt;
		@DbRecordField(dataSourceName="R_PAY_TAX_TO")
		public NString RPayTaxTo;
		@DbRecordField(dataSourceName="R_ITEM")
		public NNumber RItem;
		@DbRecordField(dataSourceName="R_SEQ_NUM")
		public NNumber RSeqNum;
		@DbRecordField(dataSourceName="R_RUCL_CODE")
		public NString RRuclCode;
		@DbRecordField(dataSourceName="R_PRIORITY_NUM")
		public NNumber RPriorityNum;
		@DbRecordField(dataSourceName="R_TAXABLE_AMT")
		public NNumber RTaxableAmt;
		@DbRecordField(dataSourceName="R_REBATE_IND")
		public NString RRebateInd;
		@DbRecordField(dataSourceName="R_CONVERT_TAX_AMT")
		public NNumber RConvertTaxAmt;
		@DbRecordField(dataSourceName="R_TRAT_DESCRIP")
		public NString RTratDescrip;
		@DbRecordField(dataSourceName="R_REBATE_AMT")
		public NNumber RRebateAmt;
		@DbRecordField(dataSourceName="R_CONVERT_REBATE_AMT")
		public NNumber RConvertRebateAmt;
		@DbRecordField(dataSourceName="R_REBATE_PERCENT")
		public NNumber RRebatePercent;
		@DbRecordField(dataSourceName="R_COAS_CODE_REBATE")
		public NString RCoasCodeRebate;
		@DbRecordField(dataSourceName="R_FUND_CODE_REBATE")
		public NString RFundCodeRebate;
		@DbRecordField(dataSourceName="R_ACCT_CODE_AR_REBATE")
		public NString RAcctCodeArRebate;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
