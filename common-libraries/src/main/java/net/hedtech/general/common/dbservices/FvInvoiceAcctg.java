package net.hedtech.general.common.dbservices;

import java.util.*;

import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbTableType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class FvInvoiceAcctg {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FV_INVOICE_ACCTG.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static void fConvertRectypeToRowtype() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FV_INVOICE_ACCTG.F_CONVERT_RECTYPE_TO_ROWTYPE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static NString fExists(NString pInvhCode,NNumber pItem,NNumber pSeqNum,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FV_INVOICE_ACCTG.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_INVH_CODE", pInvhCode);
			cmd.addParameter("@P_ITEM", pItem);
			cmd.addParameter("@P_SEQ_NUM", pSeqNum);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fExistsDoclevelAcctg(NString pInvhCode,NString pPohdCode,NNumber pSeqNum,NString pCoasCode,NString pAcciCode,NString pFundCode,NString pOrgnCode,NString pAcctCode,NString pProgCode,NString pActvCode,NString pLocnCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FV_INVOICE_ACCTG.F_EXISTS_DOCLEVEL_ACCTG", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_INVH_CODE", pInvhCode);
			cmd.addParameter("@P_POHD_CODE", pPohdCode);
			cmd.addParameter("@P_SEQ_NUM", pSeqNum);
			cmd.addParameter("@P_COAS_CODE", pCoasCode);
			cmd.addParameter("@P_ACCI_CODE", pAcciCode);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_ORGN_CODE", pOrgnCode);
			cmd.addParameter("@P_ACCT_CODE", pAcctCode);
			cmd.addParameter("@P_PROG_CODE", pProgCode);
			cmd.addParameter("@P_ACTV_CODE", pActvCode);
			cmd.addParameter("@P_LOCN_CODE", pLocnCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber fGetMaxSeqNum(NString pInvhCode,NNumber pItem) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FV_INVOICE_ACCTG.F_GET_MAX_SEQ_NUM", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_INVH_CODE", pInvhCode);
			cmd.addParameter("@P_ITEM", pItem);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString fIsequal(InvoiceAcctgRecRow recOne,InvoiceAcctgRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FV_INVOICE_ACCTG.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, InvoiceAcctgRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, InvoiceAcctgRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static Cursor fQueryAll(NString pInvhCode,NNumber pItem,NNumber pSeqNum) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FV_INVOICE_ACCTG.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_INVH_CODE", pInvhCode);
			cmd.addParameter("@P_ITEM", pItem);
			cmd.addParameter("@P_SEQ_NUM", pSeqNum);
				
			cmd.execute();

			return cmd.getReturnValue(Cursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FV_INVOICE_ACCTG.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NString pInvhCode,NNumber pItem,NNumber pSeqNum) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FV_INVOICE_ACCTG.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_INVH_CODE", pInvhCode);
			cmd.addParameter("@P_ITEM", pItem);
			cmd.addParameter("@P_SEQ_NUM", pSeqNum);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NString pInvhCode,NNumber pItem,NNumber pSeqNum,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FV_INVOICE_ACCTG.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_INVH_CODE", pInvhCode);
			cmd.addParameter("@P_ITEM", pItem);
			cmd.addParameter("@P_SEQ_NUM", pSeqNum);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NString pInvhCode,NString pPohdCode,NNumber pItem,NNumber pPoItem,NNumber pSeqNum,NString pUserId,NString pRuclCode,NString pDiscRuclCode,NString pTaxRuclCode,NString pAddlRuclCode,NString pCoasCode,NString pAcciCode,NString pFundCode,NString pOrgnCode,NString pAcctCode,NString pProgCode,NString pActvCode,NString pLocnCode,NString pBankCode,NNumber pDiscAmt,NNumber pTaxAmt,NNumber pAddlChrgAmt,NNumber pApprAmt,NString pNsfOverrideInd,NNumber pItypSeqCode,NString pProjCode,NString pSuspInd,NString pNsfSuspInd,NNumber pApprAmtPct,NNumber pDiscAmtPct,NNumber pAddlAmtPct,NNumber pTaxAmtPct,NString pDataOrigin,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FV_INVOICE_ACCTG.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_INVH_CODE", pInvhCode);
			cmd.addParameter("@P_POHD_CODE", pPohdCode);
			cmd.addParameter("@P_ITEM", pItem);
			cmd.addParameter("@P_PO_ITEM", pPoItem);
			cmd.addParameter("@P_SEQ_NUM", pSeqNum);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_RUCL_CODE", pRuclCode);
			cmd.addParameter("@P_DISC_RUCL_CODE", pDiscRuclCode);
			cmd.addParameter("@P_TAX_RUCL_CODE", pTaxRuclCode);
			cmd.addParameter("@P_ADDL_RUCL_CODE", pAddlRuclCode);
			cmd.addParameter("@P_COAS_CODE", pCoasCode);
			cmd.addParameter("@P_ACCI_CODE", pAcciCode);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_ORGN_CODE", pOrgnCode);
			cmd.addParameter("@P_ACCT_CODE", pAcctCode);
			cmd.addParameter("@P_PROG_CODE", pProgCode);
			cmd.addParameter("@P_ACTV_CODE", pActvCode);
			cmd.addParameter("@P_LOCN_CODE", pLocnCode);
			cmd.addParameter("@P_BANK_CODE", pBankCode);
			cmd.addParameter("@P_DISC_AMT", pDiscAmt);
			cmd.addParameter("@P_TAX_AMT", pTaxAmt);
			cmd.addParameter("@P_ADDL_CHRG_AMT", pAddlChrgAmt);
			cmd.addParameter("@P_APPR_AMT", pApprAmt);
			cmd.addParameter("@P_NSF_OVERRIDE_IND", pNsfOverrideInd);
			cmd.addParameter("@P_ITYP_SEQ_CODE", pItypSeqCode);
			cmd.addParameter("@P_PROJ_CODE", pProjCode);
			cmd.addParameter("@P_SUSP_IND", pSuspInd);
			cmd.addParameter("@P_NSF_SUSP_IND", pNsfSuspInd);
			cmd.addParameter("@P_APPR_AMT_PCT", pApprAmtPct);
			cmd.addParameter("@P_DISC_AMT_PCT", pDiscAmtPct);
			cmd.addParameter("@P_ADDL_AMT_PCT", pAddlAmtPct);
			cmd.addParameter("@P_TAX_AMT_PCT", pTaxAmtPct);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pCreateAccounting(Ref<InvoiceAcctgRecRow> pInvAcctgRec) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FV_INVOICE_ACCTG.P_CREATE_ACCOUNTING", DbManager.getDataBaseFactory());
			
			cmd.addParameter(DbTypes.createStructType("P_INV_ACCTG_REC", pInvAcctgRec.val, InvoiceAcctgRecRow.class, true));
				
			cmd.execute();
			pInvAcctgRec.val = cmd.getParameterValue("@P_INV_ACCTG_REC", InvoiceAcctgRecRow.class);


		}
		
		public static void pDelete(NString pInvhCode,NNumber pItem,NNumber pSeqNum,NString pUserId,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FV_INVOICE_ACCTG.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_INVH_CODE", pInvhCode);
			cmd.addParameter("@P_ITEM", pItem);
			cmd.addParameter("@P_SEQ_NUM", pSeqNum);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pDeleteInternal(NString pInvhCode,NNumber pItem) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FV_INVOICE_ACCTG.P_DELETE_INTERNAL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_INVH_CODE", pInvhCode);
			cmd.addParameter("@P_ITEM", pItem);
				
			cmd.execute();


		}
		
		public static void pDoInvNsf(NString pInvhCode,NNumber pSubmissionNumber,Ref<NString> pAbalIndInout,Ref<NString> pAbalMessageInout,NString pUserId,NString pDataOrigin) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FV_INVOICE_ACCTG.P_DO_INV_NSF", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_INVH_CODE", pInvhCode);
			cmd.addParameter("@P_SUBMISSION_NUMBER", pSubmissionNumber);
			cmd.addParameter("@P_ABAL_IND_INOUT", pAbalIndInout, true);
			cmd.addParameter("@P_ABAL_MESSAGE_INOUT", pAbalMessageInout, true);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
				
			cmd.execute();
			pAbalIndInout.val = cmd.getParameterValue("@P_ABAL_IND_INOUT", NString.class);
			pAbalMessageInout.val = cmd.getParameterValue("@P_ABAL_MESSAGE_INOUT", NString.class);


		}
		
		public static void pLock(NString pInvhCode,NNumber pItem,NNumber pSeqNum,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FV_INVOICE_ACCTG.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_INVH_CODE", pInvhCode);
			cmd.addParameter("@P_ITEM", pItem);
			cmd.addParameter("@P_SEQ_NUM", pSeqNum);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NString pInvhCode,NString pPohdCode,NNumber pItem,NNumber pPoItem,NNumber pSeqNum,NString pUserId,NString pFsyrCode,NString pPeriod,NString pEoyAccrStatusInd,NString pRuclCode,NString pDiscRuclCode,NString pTaxRuclCode,NString pAddlRuclCode,NString pCoasCode,NString pAcciCode,NString pFundCode,NString pOrgnCode,NString pAcctCode,NString pProgCode,NString pActvCode,NString pLocnCode,NString pBankCode,NNumber pInvdAmt,NNumber pDiscAmt,NNumber pTaxAmt,NNumber pAddlChrgAmt,NNumber pApprAmt,NNumber pPrevPaidAmt,NString pNsfOverrideInd,NNumber pItypSeqCode,NString pProjCode,NString pSuspInd,NString pNsfSuspInd,NString pPartialLiqInd,NString pApprInd,NString pOpenPaidInd,NNumber pConvertAmt,NNumber pConvertDiscAmt,NNumber pConvertTaxAmt,NNumber pConvertAddlChrgAmt,NNumber pApprAmtPct,NNumber pDiscAmtPct,NNumber pAddlAmtPct,NNumber pTaxAmtPct,NNumber pCapAmt,NString pDataOrigin,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FV_INVOICE_ACCTG.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_INVH_CODE", pInvhCode);
			cmd.addParameter("@P_POHD_CODE", pPohdCode);
			cmd.addParameter("@P_ITEM", pItem);
			cmd.addParameter("@P_PO_ITEM", pPoItem);
			cmd.addParameter("@P_SEQ_NUM", pSeqNum);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_FSYR_CODE", pFsyrCode);
			cmd.addParameter("@P_PERIOD", pPeriod);
			cmd.addParameter("@P_EOY_ACCR_STATUS_IND", pEoyAccrStatusInd);
			cmd.addParameter("@P_RUCL_CODE", pRuclCode);
			cmd.addParameter("@P_DISC_RUCL_CODE", pDiscRuclCode);
			cmd.addParameter("@P_TAX_RUCL_CODE", pTaxRuclCode);
			cmd.addParameter("@P_ADDL_RUCL_CODE", pAddlRuclCode);
			cmd.addParameter("@P_COAS_CODE", pCoasCode);
			cmd.addParameter("@P_ACCI_CODE", pAcciCode);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_ORGN_CODE", pOrgnCode);
			cmd.addParameter("@P_ACCT_CODE", pAcctCode);
			cmd.addParameter("@P_PROG_CODE", pProgCode);
			cmd.addParameter("@P_ACTV_CODE", pActvCode);
			cmd.addParameter("@P_LOCN_CODE", pLocnCode);
			cmd.addParameter("@P_BANK_CODE", pBankCode);
			cmd.addParameter("@P_INVD_AMT", pInvdAmt);
			cmd.addParameter("@P_DISC_AMT", pDiscAmt);
			cmd.addParameter("@P_TAX_AMT", pTaxAmt);
			cmd.addParameter("@P_ADDL_CHRG_AMT", pAddlChrgAmt);
			cmd.addParameter("@P_APPR_AMT", pApprAmt);
			cmd.addParameter("@P_PREV_PAID_AMT", pPrevPaidAmt);
			cmd.addParameter("@P_NSF_OVERRIDE_IND", pNsfOverrideInd);
			cmd.addParameter("@P_ITYP_SEQ_CODE", pItypSeqCode);
			cmd.addParameter("@P_PROJ_CODE", pProjCode);
			cmd.addParameter("@P_SUSP_IND", pSuspInd);
			cmd.addParameter("@P_NSF_SUSP_IND", pNsfSuspInd);
			cmd.addParameter("@P_PARTIAL_LIQ_IND", pPartialLiqInd);
			cmd.addParameter("@P_APPR_IND", pApprInd);
			cmd.addParameter("@P_OPEN_PAID_IND", pOpenPaidInd);
			cmd.addParameter("@P_CONVERT_AMT", pConvertAmt);
			cmd.addParameter("@P_CONVERT_DISC_AMT", pConvertDiscAmt);
			cmd.addParameter("@P_CONVERT_TAX_AMT", pConvertTaxAmt);
			cmd.addParameter("@P_CONVERT_ADDL_CHRG_AMT", pConvertAddlChrgAmt);
			cmd.addParameter("@P_APPR_AMT_PCT", pApprAmtPct);
			cmd.addParameter("@P_DISC_AMT_PCT", pDiscAmtPct);
			cmd.addParameter("@P_ADDL_AMT_PCT", pAddlAmtPct);
			cmd.addParameter("@P_TAX_AMT_PCT", pTaxAmtPct);
			cmd.addParameter("@P_CAP_AMT", pCapAmt);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pUpdateInternal(NString pInvhCode,NNumber pItem,NNumber pSeqNum,NString pApprInd,NString pOpenPaidInd,NString pSuspInd,NString pNsfSuspInd,NString pEoyAccrStatusInd,NNumber pPrevPaidAmt,NString pFsyrCode,NString pPeriod,NString pBankCode,NString pCheckNum,NDate pSubmissionDate,NDate pCheckDate,NDate pActivityDate,NString pUserId,NString pDataOrigin) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FV_INVOICE_ACCTG.P_UPDATE_INTERNAL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_INVH_CODE", pInvhCode);
			cmd.addParameter("@P_ITEM", pItem);
			cmd.addParameter("@P_SEQ_NUM", pSeqNum);
			cmd.addParameter("@P_APPR_IND", pApprInd);
			cmd.addParameter("@P_OPEN_PAID_IND", pOpenPaidInd);
			cmd.addParameter("@P_SUSP_IND", pSuspInd);
			cmd.addParameter("@P_NSF_SUSP_IND", pNsfSuspInd);
			cmd.addParameter("@P_EOY_ACCR_STATUS_IND", pEoyAccrStatusInd);
			cmd.addParameter("@P_PREV_PAID_AMT", pPrevPaidAmt);
			cmd.addParameter("@P_FSYR_CODE", pFsyrCode);
			cmd.addParameter("@P_PERIOD", pPeriod);
			cmd.addParameter("@P_BANK_CODE", pBankCode);
			cmd.addParameter("@P_CHECK_NUM", pCheckNum);
			cmd.addParameter("@P_SUBMISSION_DATE", pSubmissionDate);
			cmd.addParameter("@P_CHECK_DATE", pCheckDate);
			cmd.addParameter("@P_ACTIVITY_DATE", pActivityDate);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
				
			cmd.execute();


		}

		
	@DbTableType(id="InvoiceAcctgRecTable", dataSourceName="FV_INVOICE_ACCTG.INVOICE_ACCTG_TAB", indexed=true)
	public static class InvoiceAcctgRecTable extends Table<InvoiceAcctgRecRow> {
	}	
	
	@DbRecordType(id="InvoiceAcctgRecRow", dataSourceName="INVOICE_ACCTG_REC", needsInitialization=true)
	public static class InvoiceAcctgRecRow
	{
		public InvoiceAcctgRecRow() {
			// TODO Auto-generated constructor stub
		}
			
		@DbRecordField(dataSourceName="R_INVH_CODE")
		public NString RInvhCode;
		@DbRecordField(dataSourceName="R_POHD_CODE")
		public NString RPohdCode;
		@DbRecordField(dataSourceName="R_ITEM")
		public NNumber RItem;
		@DbRecordField(dataSourceName="R_PO_ITEM")
		public NNumber RPoItem;
		@DbRecordField(dataSourceName="R_SEQ_NUM")
		public NNumber RSeqNum;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_FSYR_CODE")
		public NString RFsyrCode;
		@DbRecordField(dataSourceName="R_PERIOD")
		public NString RPeriod;
		@DbRecordField(dataSourceName="R_EOY_ACCR_STATUS_IND")
		public NString REoyAccrStatusInd;
		@DbRecordField(dataSourceName="R_RUCL_CODE")
		public NString RRuclCode;
		@DbRecordField(dataSourceName="R_DISC_RUCL_CODE")
		public NString RDiscRuclCode;
		@DbRecordField(dataSourceName="R_TAX_RUCL_CODE")
		public NString RTaxRuclCode;
		@DbRecordField(dataSourceName="R_ADDL_RUCL_CODE")
		public NString RAddlRuclCode;
		@DbRecordField(dataSourceName="R_COAS_CODE")
		public NString RCoasCode;
		@DbRecordField(dataSourceName="R_ACCI_CODE")
		public NString RAcciCode;
		@DbRecordField(dataSourceName="R_FUND_CODE")
		public NString RFundCode;
		@DbRecordField(dataSourceName="R_ORGN_CODE")
		public NString ROrgnCode;
		@DbRecordField(dataSourceName="R_ACCT_CODE")
		public NString RAcctCode;
		@DbRecordField(dataSourceName="R_PROG_CODE")
		public NString RProgCode;
		@DbRecordField(dataSourceName="R_ACTV_CODE")
		public NString RActvCode;
		@DbRecordField(dataSourceName="R_LOCN_CODE")
		public NString RLocnCode;
		@DbRecordField(dataSourceName="R_BANK_CODE")
		public NString RBankCode;
		@DbRecordField(dataSourceName="R_INVD_AMT")
		public NNumber RInvdAmt;
		@DbRecordField(dataSourceName="R_DISC_AMT")
		public NNumber RDiscAmt;
		@DbRecordField(dataSourceName="R_TAX_AMT")
		public NNumber RTaxAmt;
		@DbRecordField(dataSourceName="R_ADDL_CHRG_AMT")
		public NNumber RAddlChrgAmt;
		@DbRecordField(dataSourceName="R_APPR_AMT")
		public NNumber RApprAmt;
		@DbRecordField(dataSourceName="R_PREV_PAID_AMT")
		public NNumber RPrevPaidAmt;
		@DbRecordField(dataSourceName="R_NSF_OVERRIDE_IND")
		public NString RNsfOverrideInd;
		@DbRecordField(dataSourceName="R_ITYP_SEQ_CODE")
		public NNumber RItypSeqCode;
		@DbRecordField(dataSourceName="R_PROJ_CODE")
		public NString RProjCode;
		@DbRecordField(dataSourceName="R_SUSP_IND")
		public NString RSuspInd;
		@DbRecordField(dataSourceName="R_NSF_SUSP_IND")
		public NString RNsfSuspInd;
		@DbRecordField(dataSourceName="R_PARTIAL_LIQ_IND")
		public NString RPartialLiqInd;
		@DbRecordField(dataSourceName="R_APPR_IND")
		public NString RApprInd;
		@DbRecordField(dataSourceName="R_OPEN_PAID_IND")
		public NString ROpenPaidInd;
		@DbRecordField(dataSourceName="R_CONVERT_AMT")
		public NNumber RConvertAmt;
		@DbRecordField(dataSourceName="R_CONVERT_DISC_AMT")
		public NNumber RConvertDiscAmt;
		@DbRecordField(dataSourceName="R_CONVERT_TAX_AMT")
		public NNumber RConvertTaxAmt;
		@DbRecordField(dataSourceName="R_CONVERT_ADDL_CHRG_AMT")
		public NNumber RConvertAddlChrgAmt;
		@DbRecordField(dataSourceName="R_APPR_AMT_PCT")
		public NNumber RApprAmtPct;
		@DbRecordField(dataSourceName="R_DISC_AMT_PCT")
		public NNumber RDiscAmtPct;
		@DbRecordField(dataSourceName="R_ADDL_AMT_PCT")
		public NNumber RAddlAmtPct;
		@DbRecordField(dataSourceName="R_TAX_AMT_PCT")
		public NNumber RTaxAmtPct;
		@DbRecordField(dataSourceName="R_CAP_AMT")
		public NNumber RCapAmt;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_CREATE_USER")
		public NString RCreateUser;
		@DbRecordField(dataSourceName="R_CREATE_DATE")
		public NDate RCreateDate;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
		
		public InvoiceAcctgRecRow(Row row) {
			// TODO Auto-generated constructor stub
		}
	}

	
	
}
