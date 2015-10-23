package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Ftfkutil {
		public static NString fGetRuleEnabled(NString pRuleKey,NString pLevelEnum,NString pCoasCode,NString pOrgnCode,NNumber pUserPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FTFKUTIL.F_GET_RULE_ENABLED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_RULE_KEY", pRuleKey);
			cmd.addParameter("@P_LEVEL_ENUM", pLevelEnum);
			cmd.addParameter("@P_COAS_CODE", pCoasCode);
			cmd.addParameter("@P_ORGN_CODE", pOrgnCode);
			cmd.addParameter("@P_USER_PIDM", pUserPidm);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsTeZeroEr(NString pDocCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FTFKUTIL.F_IS_TE_ZERO_ER", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_DOC_CODE", pDocCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber fSumErAmount(NString pDocCode,NString pExcludeAdvance) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FTFKUTIL.F_SUM_ER_AMOUNT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_DOC_CODE", pDocCode);
			cmd.addParameter("@P_EXCLUDE_ADVANCE", pExcludeAdvance);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static void pClearAbal(NNumber pDocType,NString pDocCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FTFKUTIL.P_CLEAR_ABAL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DOC_TYPE", pDocType);
			cmd.addParameter("@P_DOC_CODE", pDocCode);
				
			cmd.execute();


		}
		
		public static void pCloseFinalInvoice(NString pDocCode,NString pProcessCommit,Ref<NString> pSuccessMsgOut,Ref<NString> pErrorMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FTFKUTIL.P_CLOSE_FINAL_INVOICE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DOC_CODE", pDocCode);
			cmd.addParameter("@P_PROCESS_COMMIT", pProcessCommit);
			cmd.addParameter("@P_SUCCESS_MSG_OUT", NString.class);
			cmd.addParameter("@P_ERROR_MSG_OUT", NString.class);
				
			cmd.execute();
			pSuccessMsgOut.val = cmd.getParameterValue("@P_SUCCESS_MSG_OUT", NString.class);
			pErrorMsgOut.val = cmd.getParameterValue("@P_ERROR_MSG_OUT", NString.class);


		}
		
		public static void pCloseTravelEncumbrance(NString pDocCode,NString pUserId,NDate pCloseDate,NString pProcessCommit,Ref<NString> pSuccessMsgOut,Ref<NString> pErrorMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FTFKUTIL.P_CLOSE_TRAVEL_ENCUMBRANCE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DOC_CODE", pDocCode);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_CLOSE_DATE", pCloseDate);
			cmd.addParameter("@P_PROCESS_COMMIT", pProcessCommit);
			cmd.addParameter("@P_SUCCESS_MSG_OUT", NString.class);
			cmd.addParameter("@P_ERROR_MSG_OUT", NString.class);
				
			cmd.execute();
			pSuccessMsgOut.val = cmd.getParameterValue("@P_SUCCESS_MSG_OUT", NString.class);
			pErrorMsgOut.val = cmd.getParameterValue("@P_ERROR_MSG_OUT", NString.class);


		}
		
		public static void pCreateAdvanceInvoice(NString pDocCode,Ref<NString> pSuccessMsgOut,Ref<NString> pErrorMsgOut,Ref<NString> pWarnMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FTFKUTIL.P_CREATE_ADVANCE_INVOICE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DOC_CODE", pDocCode);
			cmd.addParameter("@P_SUCCESS_MSG_OUT", NString.class);
			cmd.addParameter("@P_ERROR_MSG_OUT", NString.class);
			cmd.addParameter("@P_WARN_MSG_OUT", NString.class);
				
			cmd.execute();
			pSuccessMsgOut.val = cmd.getParameterValue("@P_SUCCESS_MSG_OUT", NString.class);
			pErrorMsgOut.val = cmd.getParameterValue("@P_ERROR_MSG_OUT", NString.class);
			pWarnMsgOut.val = cmd.getParameterValue("@P_WARN_MSG_OUT", NString.class);


		}
		
		public static void pCreateAdvanceRecovery(NString pDocCode,NString pProcessCommit,Ref<NString> pSuccessMsgOut,Ref<NString> pErrorMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FTFKUTIL.P_CREATE_ADVANCE_RECOVERY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DOC_CODE", pDocCode);
			cmd.addParameter("@P_PROCESS_COMMIT", pProcessCommit);
			cmd.addParameter("@P_SUCCESS_MSG_OUT", NString.class);
			cmd.addParameter("@P_ERROR_MSG_OUT", NString.class);
				
			cmd.execute();
			pSuccessMsgOut.val = cmd.getParameterValue("@P_SUCCESS_MSG_OUT", NString.class);
			pErrorMsgOut.val = cmd.getParameterValue("@P_ERROR_MSG_OUT", NString.class);


		}
		
		public static void pCreateDocument(NNumber pDocType,NString pDocCode,Ref<NString> pDocCreatedOut,Ref<NString> pSuccessMsgOut,Ref<NString> pErrorMsgOut,Ref<NString> pWarnMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FTFKUTIL.P_CREATE_DOCUMENT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DOC_TYPE", pDocType);
			cmd.addParameter("@P_DOC_CODE", pDocCode);
			cmd.addParameter("@P_DOC_CREATED_OUT", NString.class);
			cmd.addParameter("@P_SUCCESS_MSG_OUT", NString.class);
			cmd.addParameter("@P_ERROR_MSG_OUT", NString.class);
			cmd.addParameter("@P_WARN_MSG_OUT", NString.class);
				
			cmd.execute();
			pDocCreatedOut.val = cmd.getParameterValue("@P_DOC_CREATED_OUT", NString.class);
			pSuccessMsgOut.val = cmd.getParameterValue("@P_SUCCESS_MSG_OUT", NString.class);
			pErrorMsgOut.val = cmd.getParameterValue("@P_ERROR_MSG_OUT", NString.class);
			pWarnMsgOut.val = cmd.getParameterValue("@P_WARN_MSG_OUT", NString.class);


		}
		
		public static void pCreateTravelEncumbrance(NString pDocCode,FtbAuthorization.AuthorizationRecRow pFtrbauthRec,Ref<NString> pSuccessMsgOut,Ref<NString> pErrorMsgOut,Ref<NString> pWarnMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FTFKUTIL.P_CREATE_TRAVEL_ENCUMBRANCE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DOC_CODE", pDocCode);
			cmd.addParameter(DbTypes.createStructType("P_FTRBAUTH_REC", pFtrbauthRec, FtbAuthorization.AuthorizationRecRow.class ));
			cmd.addParameter("@P_SUCCESS_MSG_OUT", NString.class);
			cmd.addParameter("@P_ERROR_MSG_OUT", NString.class);
			cmd.addParameter("@P_WARN_MSG_OUT", NString.class);
				
			cmd.execute();
			pSuccessMsgOut.val = cmd.getParameterValue("@P_SUCCESS_MSG_OUT", NString.class);
			pErrorMsgOut.val = cmd.getParameterValue("@P_ERROR_MSG_OUT", NString.class);
			pWarnMsgOut.val = cmd.getParameterValue("@P_WARN_MSG_OUT", NString.class);


		}
		
		public static void pCreateTravelInvoice(NString pDocCode,FtbReimbursement.FtrbrembRecRow pFtrbrembRec,Ref<NString> pSuccessMsgOut,Ref<NString> pErrorMsgOut,Ref<NString> pWarnMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FTFKUTIL.P_CREATE_TRAVEL_INVOICE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DOC_CODE", pDocCode);
			cmd.addParameter(DbTypes.createStructType("P_FTRBREMB_REC", pFtrbrembRec, FtbReimbursement.FtrbrembRecRow.class ));
			cmd.addParameter("@P_SUCCESS_MSG_OUT", NString.class);
			cmd.addParameter("@P_ERROR_MSG_OUT", NString.class);
			cmd.addParameter("@P_WARN_MSG_OUT", NString.class);
				
			cmd.execute();
			pSuccessMsgOut.val = cmd.getParameterValue("@P_SUCCESS_MSG_OUT", NString.class);
			pErrorMsgOut.val = cmd.getParameterValue("@P_ERROR_MSG_OUT", NString.class);
			pWarnMsgOut.val = cmd.getParameterValue("@P_WARN_MSG_OUT", NString.class);


		}
		
		public static void pGetTaxCodeList(NString pTgrpCode,NDate pEffdate,NNumber pNetAmt,NString pAutoCalcInd,Ref<DataCursor> pTaxRefOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FTFKUTIL.P_GET_TAX_CODE_LIST", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TGRP_CODE", pTgrpCode);
			cmd.addParameter("@P_EFFDATE", pEffdate);
			cmd.addParameter("@P_NET_AMT", pNetAmt);
			cmd.addParameter("@P_AUTO_CALC_IND", pAutoCalcInd);
			cmd.addParameter("@P_TAX_REF_OUT", DataCursor.class);
				
			cmd.execute();
			pTaxRefOut.val = cmd.getParameterValue("@P_TAX_REF_OUT", DataCursor.class);


		}
		
		public static void pSummarizeFunding(NNumber pDocType,NString pDocCode,Ref<DataCursor> pAcctgRefOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FTFKUTIL.P_SUMMARIZE_FUNDING", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DOC_TYPE", pDocType);
			cmd.addParameter("@P_DOC_CODE", pDocCode);
			cmd.addParameter("@P_ACCTG_REF_OUT", DataCursor.class);
				
			cmd.execute();
			pAcctgRefOut.val = cmd.getParameterValue("@P_ACCTG_REF_OUT", DataCursor.class);


		}
		
		public static void pSwitchAdvanceStatus(NNumber pAuthId,NString pUserId,Ref<NString> pSuccessMsgOut,Ref<NString> pErrorMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FTFKUTIL.P_SWITCH_ADVANCE_STATUS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AUTH_ID", pAuthId);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_SUCCESS_MSG_OUT", NString.class);
			cmd.addParameter("@P_ERROR_MSG_OUT", NString.class);
				
			cmd.execute();
			pSuccessMsgOut.val = cmd.getParameterValue("@P_SUCCESS_MSG_OUT", NString.class);
			pErrorMsgOut.val = cmd.getParameterValue("@P_ERROR_MSG_OUT", NString.class);


		}
		
		public static void pValidateAdvcCheckCancel(NString pCheckNumber,NString pBankCode,NString pReestablishPayableInd,Ref<NString> pMsgOut,Ref<NString> pMsgTypeOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FTFKUTIL.P_VALIDATE_ADVC_CHECK_CANCEL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CHECK_NUMBER", pCheckNumber);
			cmd.addParameter("@P_BANK_CODE", pBankCode);
			cmd.addParameter("@P_REESTABLISH_PAYABLE_IND", pReestablishPayableInd);
			cmd.addParameter("@P_MSG_OUT", NString.class);
			cmd.addParameter("@P_MSG_TYPE_OUT", NString.class);
				
			cmd.execute();
			pMsgOut.val = cmd.getParameterValue("@P_MSG_OUT", NString.class);
			pMsgTypeOut.val = cmd.getParameterValue("@P_MSG_TYPE_OUT", NString.class);


		}
		
		public static void pValidateRequestFinance(NString pDocCode,Ref<NString> pErrorMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FTFKUTIL.P_VALIDATE_REQUEST_FINANCE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DOC_CODE", pDocCode);
			cmd.addParameter("@P_ERROR_MSG_OUT", NString.class);
				
			cmd.execute();
			pErrorMsgOut.val = cmd.getParameterValue("@P_ERROR_MSG_OUT", NString.class);


		}
		
	
	
	@DbRecordType(id="AcctgRectypeRow", dataSourceName="ACCTG_RECTYPE")
	public static class AcctgRectypeRow
	{
		@DbRecordField(dataSourceName="R_ITEM")
		public NNumber RItem;
		@DbRecordField(dataSourceName="R_SEQ_NUM")
		public NNumber RSeqNum;
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
		@DbRecordField(dataSourceName="R_PROJ_CODE")
		public NString RProjCode;
		@DbRecordField(dataSourceName="R_BANK_CODE")
		public NString RBankCode;
		@DbRecordField(dataSourceName="R_ABAL_IND")
		public NString RAbalInd;
		@DbRecordField(dataSourceName="R_AMOUNT")
		public NNumber RAmount;
		@DbRecordField(dataSourceName="R_APPR_AMOUNT")
		public NNumber RApprAmount;
		@DbRecordField(dataSourceName="R_PAY_AMOUNT")
		public NNumber RPayAmount;
		@DbRecordField(dataSourceName="R_PAY_APPR_AMOUNT")
		public NNumber RPayApprAmount;
		@DbRecordField(dataSourceName="R_TGRP_CODE")
		public NString RTgrpCode;
	}

	
	@DbRecordType(id="TaxRectypeRow", dataSourceName="TAX_RECTYPE")
	public static class TaxRectypeRow
	{
		@DbRecordField(dataSourceName="R_TRAT_CODE")
		public NString RTratCode;
		@DbRecordField(dataSourceName="R_TAX_AMT")
		public NNumber RTaxAmt;
		@DbRecordField(dataSourceName="R_CALC_TAX_AMT")
		public NNumber RCalcTaxAmt;
		@DbRecordField(dataSourceName="R_PAY_TAX_AMT")
		public NNumber RPayTaxAmt;
	}

	
	
}
