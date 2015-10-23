package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class FbJvDetail {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_JV_DETAIL.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static void fEntityToRow() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_JV_DETAIL.F_ENTITY_TO_ROW", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static NString fExists(NString pDocNum,NNumber pSubmissionNumber,NNumber pSeqNum,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_JV_DETAIL.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_DOC_NUM", pDocNum);
			cmd.addParameter("@P_SUBMISSION_NUMBER", pSubmissionNumber);
			cmd.addParameter("@P_SEQ_NUM", pSeqNum);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber fGetIntConstant(NString pNameIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_JV_DETAIL.F_GET_INT_CONSTANT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_NAME_IN", pNameIn);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fGetMaxSeq(NString pDocNum,NNumber pSubNum) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_JV_DETAIL.F_GET_MAX_SEQ", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_DOC_NUM", pDocNum);
			cmd.addParameter("@P_SUB_NUM", pSubNum);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString fIsequal(JvDetailRecRow recOne,JvDetailRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_JV_DETAIL.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, JvDetailRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, JvDetailRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NString pDocNum,NNumber pSubmissionNumber) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_JV_DETAIL.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_DOC_NUM", pDocNum);
			cmd.addParameter("@P_SUBMISSION_NUMBER", pSubmissionNumber);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_JV_DETAIL.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NString pDocNum,NNumber pSubmissionNumber,NNumber pSeqNum) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_JV_DETAIL.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_DOC_NUM", pDocNum);
			cmd.addParameter("@P_SUBMISSION_NUMBER", pSubmissionNumber);
			cmd.addParameter("@P_SEQ_NUM", pSeqNum);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NString pDocNum,NNumber pSubmissionNumber,NNumber pSeqNum,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_JV_DETAIL.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_DOC_NUM", pDocNum);
			cmd.addParameter("@P_SUBMISSION_NUMBER", pSubmissionNumber);
			cmd.addParameter("@P_SEQ_NUM", pSeqNum);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static NString fSumTransAmt(NString pDocNum,NNumber pSubmissionNumber) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_JV_DETAIL.F_SUM_TRANS_AMT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_DOC_NUM", pDocNum);
			cmd.addParameter("@P_SUBMISSION_NUMBER", pSubmissionNumber);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fValidDistribution(NString pDocNum,NNumber pSubmissionNumber) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_JV_DETAIL.F_VALID_DISTRIBUTION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_DOC_NUM", pDocNum);
			cmd.addParameter("@P_SUBMISSION_NUMBER", pSubmissionNumber);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pCreate(NString pDocNum,NNumber pSubmissionNumber,NNumber pSeqNum,NString pUserId,NString pRuclCode,NNumber pTransAmt,NString pTransDesc,NString pDrCrInd,NString pFsyrCode,NString pAcciCode,NString pCoasCode,NString pFundCode,NString pOrgnCode,NString pAcctCode,NString pProgCode,NString pActvCode,NString pLocnCode,NString pBankCode,NString pDocRefNum,NNumber pVendorPidm,NString pEncbNum,NNumber pEncdItemNum,NNumber pEncdSeqNum,NString pEncbType,NString pBudDispn,NString pBudId,NString pCmtType,NNumber pCmtPct,NString pDepNum,NString pEncbActionInd,NString pPrjdCode,NString pAcctCodeCash,NNumber pDistPct,NString pPostingPeriod,NString pBudgetPeriod,NString pAccrualInd,Ref<NString> pStatusInOut,NString pAbalOverride,NString pApprInd,NString pCurrCode,NNumber pConvertedAmt,NDate pGiftDate,NNumber pEmcUnits,NString pDataOrigin,Ref<NString> pWarningOut,Ref<NString> pAbalSeverityOut,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_JV_DETAIL.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DOC_NUM", pDocNum);
			cmd.addParameter("@P_SUBMISSION_NUMBER", pSubmissionNumber);
			cmd.addParameter("@P_SEQ_NUM", pSeqNum);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_RUCL_CODE", pRuclCode);
			cmd.addParameter("@P_TRANS_AMT", pTransAmt);
			cmd.addParameter("@P_TRANS_DESC", pTransDesc);
			cmd.addParameter("@P_DR_CR_IND", pDrCrInd);
			cmd.addParameter("@P_FSYR_CODE", pFsyrCode);
			cmd.addParameter("@P_ACCI_CODE", pAcciCode);
			cmd.addParameter("@P_COAS_CODE", pCoasCode);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_ORGN_CODE", pOrgnCode);
			cmd.addParameter("@P_ACCT_CODE", pAcctCode);
			cmd.addParameter("@P_PROG_CODE", pProgCode);
			cmd.addParameter("@P_ACTV_CODE", pActvCode);
			cmd.addParameter("@P_LOCN_CODE", pLocnCode);
			cmd.addParameter("@P_BANK_CODE", pBankCode);
			cmd.addParameter("@P_DOC_REF_NUM", pDocRefNum);
			cmd.addParameter("@P_VENDOR_PIDM", pVendorPidm);
			cmd.addParameter("@P_ENCB_NUM", pEncbNum);
			cmd.addParameter("@P_ENCD_ITEM_NUM", pEncdItemNum);
			cmd.addParameter("@P_ENCD_SEQ_NUM", pEncdSeqNum);
			cmd.addParameter("@P_ENCB_TYPE", pEncbType);
			cmd.addParameter("@P_BUD_DISPN", pBudDispn);
			cmd.addParameter("@P_BUD_ID", pBudId);
			cmd.addParameter("@P_CMT_TYPE", pCmtType);
			cmd.addParameter("@P_CMT_PCT", pCmtPct);
			cmd.addParameter("@P_DEP_NUM", pDepNum);
			cmd.addParameter("@P_ENCB_ACTION_IND", pEncbActionInd);
			cmd.addParameter("@P_PRJD_CODE", pPrjdCode);
			cmd.addParameter("@P_ACCT_CODE_CASH", pAcctCodeCash);
			cmd.addParameter("@P_DIST_PCT", pDistPct);
			cmd.addParameter("@P_POSTING_PERIOD", pPostingPeriod);
			cmd.addParameter("@P_BUDGET_PERIOD", pBudgetPeriod);
			cmd.addParameter("@P_ACCRUAL_IND", pAccrualInd);
			cmd.addParameter("@P_STATUS_IN_OUT", pStatusInOut, true);
			cmd.addParameter("@P_ABAL_OVERRIDE", pAbalOverride);
			cmd.addParameter("@P_APPR_IND", pApprInd);
			cmd.addParameter("@P_CURR_CODE", pCurrCode);
			cmd.addParameter("@P_CONVERTED_AMT", pConvertedAmt);
			cmd.addParameter("@P_GIFT_DATE", pGiftDate);
			cmd.addParameter("@P_EMC_UNITS", pEmcUnits);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_WARNING_OUT", NString.class);
			cmd.addParameter("@P_ABAL_SEVERITY_OUT", NString.class);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pStatusInOut.val = cmd.getParameterValue("@P_STATUS_IN_OUT", NString.class);
			pWarningOut.val = cmd.getParameterValue("@P_WARNING_OUT", NString.class);
			pAbalSeverityOut.val = cmd.getParameterValue("@P_ABAL_SEVERITY_OUT", NString.class);
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NString pDocNum,NNumber pSubmissionNumber,NNumber pSeqNum,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_JV_DETAIL.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DOC_NUM", pDocNum);
			cmd.addParameter("@P_SUBMISSION_NUMBER", pSubmissionNumber);
			cmd.addParameter("@P_SEQ_NUM", pSeqNum);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pDeleteAll(NString pDocNum,NNumber pSubmissionNumber) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_JV_DETAIL.P_DELETE_ALL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DOC_NUM", pDocNum);
			cmd.addParameter("@P_SUBMISSION_NUMBER", pSubmissionNumber);
				
			cmd.execute();


		}
		
		public static void pLock(NString pDocNum,NNumber pSubmissionNumber,NNumber pSeqNum,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_JV_DETAIL.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DOC_NUM", pDocNum);
			cmd.addParameter("@P_SUBMISSION_NUMBER", pSubmissionNumber);
			cmd.addParameter("@P_SEQ_NUM", pSeqNum);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NString pDocNum,NNumber pSubmissionNumber,NNumber pSeqNum,NString pUserId,NString pRuclCode,NNumber pTransAmt,NString pTransDesc,NString pDrCrInd,NString pFsyrCode,NString pAcciCode,NString pCoasCode,NString pFundCode,NString pOrgnCode,NString pAcctCode,NString pProgCode,NString pActvCode,NString pLocnCode,NString pBankCode,NString pDocRefNum,NNumber pVendorPidm,NString pEncbNum,NNumber pEncdItemNum,NNumber pEncdSeqNum,NString pEncbType,NString pBudDispn,NString pBudId,NString pCmtType,NNumber pCmtPct,NString pDepNum,NString pEncbActionInd,NString pPrjdCode,NString pAcctCodeCash,NNumber pDistPct,NString pPostingPeriod,NString pBudgetPeriod,NString pAccrualInd,Ref<NString> pStatusInOut,NString pAbalOverride,NString pApprInd,NString pCurrCode,NNumber pConvertedAmt,NDate pGiftDate,NNumber pEmcUnits,NString pDataOrigin,Ref<NString> pWarningOut,Ref<NString> pAbalSeverityOut,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_JV_DETAIL.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DOC_NUM", pDocNum);
			cmd.addParameter("@P_SUBMISSION_NUMBER", pSubmissionNumber);
			cmd.addParameter("@P_SEQ_NUM", pSeqNum);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_RUCL_CODE", pRuclCode);
			cmd.addParameter("@P_TRANS_AMT", pTransAmt);
			cmd.addParameter("@P_TRANS_DESC", pTransDesc);
			cmd.addParameter("@P_DR_CR_IND", pDrCrInd);
			cmd.addParameter("@P_FSYR_CODE", pFsyrCode);
			cmd.addParameter("@P_ACCI_CODE", pAcciCode);
			cmd.addParameter("@P_COAS_CODE", pCoasCode);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_ORGN_CODE", pOrgnCode);
			cmd.addParameter("@P_ACCT_CODE", pAcctCode);
			cmd.addParameter("@P_PROG_CODE", pProgCode);
			cmd.addParameter("@P_ACTV_CODE", pActvCode);
			cmd.addParameter("@P_LOCN_CODE", pLocnCode);
			cmd.addParameter("@P_BANK_CODE", pBankCode);
			cmd.addParameter("@P_DOC_REF_NUM", pDocRefNum);
			cmd.addParameter("@P_VENDOR_PIDM", pVendorPidm);
			cmd.addParameter("@P_ENCB_NUM", pEncbNum);
			cmd.addParameter("@P_ENCD_ITEM_NUM", pEncdItemNum);
			cmd.addParameter("@P_ENCD_SEQ_NUM", pEncdSeqNum);
			cmd.addParameter("@P_ENCB_TYPE", pEncbType);
			cmd.addParameter("@P_BUD_DISPN", pBudDispn);
			cmd.addParameter("@P_BUD_ID", pBudId);
			cmd.addParameter("@P_CMT_TYPE", pCmtType);
			cmd.addParameter("@P_CMT_PCT", pCmtPct);
			cmd.addParameter("@P_DEP_NUM", pDepNum);
			cmd.addParameter("@P_ENCB_ACTION_IND", pEncbActionInd);
			cmd.addParameter("@P_PRJD_CODE", pPrjdCode);
			cmd.addParameter("@P_ACCT_CODE_CASH", pAcctCodeCash);
			cmd.addParameter("@P_DIST_PCT", pDistPct);
			cmd.addParameter("@P_POSTING_PERIOD", pPostingPeriod);
			cmd.addParameter("@P_BUDGET_PERIOD", pBudgetPeriod);
			cmd.addParameter("@P_ACCRUAL_IND", pAccrualInd);
			cmd.addParameter("@P_STATUS_IN_OUT", pStatusInOut, true);
			cmd.addParameter("@P_ABAL_OVERRIDE", pAbalOverride);
			cmd.addParameter("@P_APPR_IND", pApprInd);
			cmd.addParameter("@P_CURR_CODE", pCurrCode);
			cmd.addParameter("@P_CONVERTED_AMT", pConvertedAmt);
			cmd.addParameter("@P_GIFT_DATE", pGiftDate);
			cmd.addParameter("@P_EMC_UNITS", pEmcUnits);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_WARNING_OUT", NString.class);
			cmd.addParameter("@P_ABAL_SEVERITY_OUT", NString.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();
			pStatusInOut.val = cmd.getParameterValue("@P_STATUS_IN_OUT", NString.class);
			pWarningOut.val = cmd.getParameterValue("@P_WARNING_OUT", NString.class);
			pAbalSeverityOut.val = cmd.getParameterValue("@P_ABAL_SEVERITY_OUT", NString.class);


		}
		
		public static void pUpdateInternal(NString pDocNum,NNumber pSubmissionNumber,NNumber pSeqNum,NString pApprInd,NString pAbalOverride,NString pStatusInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_JV_DETAIL.P_UPDATE_INTERNAL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DOC_NUM", pDocNum);
			cmd.addParameter("@P_SUBMISSION_NUMBER", pSubmissionNumber);
			cmd.addParameter("@P_SEQ_NUM", pSeqNum);
			cmd.addParameter("@P_APPR_IND", pApprInd);
			cmd.addParameter("@P_ABAL_OVERRIDE", pAbalOverride);
			cmd.addParameter("@P_STATUS_IND", pStatusInd);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="JvDetailRecRow", dataSourceName="JV_DETAIL_REC")
	public static class JvDetailRecRow
	{
		@DbRecordField(dataSourceName="R_DOC_NUM")
		public NString RDocNum;
		@DbRecordField(dataSourceName="R_SUBMISSION_NUMBER")
		public NNumber RSubmissionNumber;
		@DbRecordField(dataSourceName="R_SEQ_NUM")
		public NNumber RSeqNum;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_RUCL_CODE")
		public NString RRuclCode;
		@DbRecordField(dataSourceName="R_TRANS_AMT")
		public NNumber RTransAmt;
		@DbRecordField(dataSourceName="R_TRANS_DESC")
		public NString RTransDesc;
		@DbRecordField(dataSourceName="R_DR_CR_IND")
		public NString RDrCrInd;
		@DbRecordField(dataSourceName="R_FSYR_CODE")
		public NString RFsyrCode;
		@DbRecordField(dataSourceName="R_ACCI_CODE")
		public NString RAcciCode;
		@DbRecordField(dataSourceName="R_COAS_CODE")
		public NString RCoasCode;
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
		@DbRecordField(dataSourceName="R_DOC_REF_NUM")
		public NString RDocRefNum;
		@DbRecordField(dataSourceName="R_VENDOR_PIDM")
		public NNumber RVendorPidm;
		@DbRecordField(dataSourceName="R_ENCB_NUM")
		public NString REncbNum;
		@DbRecordField(dataSourceName="R_ENCD_ITEM_NUM")
		public NNumber REncdItemNum;
		@DbRecordField(dataSourceName="R_ENCD_SEQ_NUM")
		public NNumber REncdSeqNum;
		@DbRecordField(dataSourceName="R_ENCB_TYPE")
		public NString REncbType;
		@DbRecordField(dataSourceName="R_BUD_DISPN")
		public NString RBudDispn;
		@DbRecordField(dataSourceName="R_BUD_ID")
		public NString RBudId;
		@DbRecordField(dataSourceName="R_CMT_TYPE")
		public NString RCmtType;
		@DbRecordField(dataSourceName="R_CMT_PCT")
		public NNumber RCmtPct;
		@DbRecordField(dataSourceName="R_DEP_NUM")
		public NString RDepNum;
		@DbRecordField(dataSourceName="R_ENCB_ACTION_IND")
		public NString REncbActionInd;
		@DbRecordField(dataSourceName="R_PRJD_CODE")
		public NString RPrjdCode;
		@DbRecordField(dataSourceName="R_ACCT_CODE_CASH")
		public NString RAcctCodeCash;
		@DbRecordField(dataSourceName="R_DIST_PCT")
		public NNumber RDistPct;
		@DbRecordField(dataSourceName="R_POSTING_PERIOD")
		public NString RPostingPeriod;
		@DbRecordField(dataSourceName="R_BUDGET_PERIOD")
		public NString RBudgetPeriod;
		@DbRecordField(dataSourceName="R_ACCRUAL_IND")
		public NString RAccrualInd;
		@DbRecordField(dataSourceName="R_STATUS_IND")
		public NString RStatusInd;
		@DbRecordField(dataSourceName="R_ABAL_OVERRIDE")
		public NString RAbalOverride;
		@DbRecordField(dataSourceName="R_POST_BAVL")
		public NString RPostBavl;
		@DbRecordField(dataSourceName="R_APPR_IND")
		public NString RApprInd;
		@DbRecordField(dataSourceName="R_CURR_CODE")
		public NString RCurrCode;
		@DbRecordField(dataSourceName="R_CONVERTED_AMT")
		public NNumber RConvertedAmt;
		@DbRecordField(dataSourceName="R_FUND_CODE_POOL")
		public NString RFundCodePool;
		@DbRecordField(dataSourceName="R_COAS_CODE_POOL")
		public NString RCoasCodePool;
		@DbRecordField(dataSourceName="R_GIFT_DATE")
		public NDate RGiftDate;
		@DbRecordField(dataSourceName="R_EMC_UNITS")
		public NNumber REmcUnits;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_CREATE_SOURCE")
		public NString RCreateSource;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
