package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Fokutil {
		public static NString fCheckClosed(NNumber pDtypSeqNum,NString pDocType,NString pDocCode,NNumber pChgSeq,NNumber pSubNum) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FOKUTIL.F_CHECK_CLOSED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_DTYP_SEQ_NUM", pDtypSeqNum);
			cmd.addParameter("@P_DOC_TYPE", pDocType);
			cmd.addParameter("@P_DOC_CODE", pDocCode);
			cmd.addParameter("@P_CHG_SEQ", pChgSeq);
			cmd.addParameter("@P_SUB_NUM", pSubNum);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fConvertDateToDatetime(NString charDate,NString dateFormat) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FOKUTIL.F_CONVERT_DATE_TO_DATETIME", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@CHAR_DATE", charDate);
			cmd.addParameter("@DATE_FORMAT", dateFormat);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NDate fConvertDateToDatetime(NDate pDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FOKUTIL.F_CONVERT_DATE_TO_DATETIME", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NDate.class);
			cmd.addParameter("@P_DATE", pDate);
				
			cmd.execute();

			return cmd.getReturnValue(NDate.class);

		}
		
		public static NString fCreateNtGroup(NString userid,NDate asofdate,NString coas) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FOKUTIL.F_CREATE_NT_GROUP", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@USERID", userid);
			cmd.addParameter("@ASOFDATE", asofdate);
			cmd.addParameter("@COAS", coas);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fDisbAgentExist(NString pCurrCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FOKUTIL.F_DISB_AGENT_EXIST", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_CURR_CODE", pCurrCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fFundOrgSecurityFnc(NString coasCode,NString fundCode,NString orgCode,NDate asofDate,NString queryOrPost,NString whichUserId,NString whichAccess) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FOKUTIL.F_FUND_ORG_SECURITY_FNC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@COAS_CODE", coasCode);
			cmd.addParameter("@FUND_CODE", fundCode);
			cmd.addParameter("@ORG_CODE", orgCode);
			cmd.addParameter("@ASOF_DATE", asofDate);
			cmd.addParameter("@QUERY_OR_POST", queryOrPost);
			cmd.addParameter("@WHICH_USER_ID", whichUserId);
			cmd.addParameter("@WHICH_ACCESS", whichAccess);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGenEdocNumber(NNumber docType) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FOKUTIL.F_GEN_EDOC_NUMBER", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@DOC_TYPE", docType);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGenFseqNumber(NString systemId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FOKUTIL.F_GEN_FSEQ_NUMBER", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@SYSTEM_ID", systemId);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGet1099Definition(NString pCoasCode,NString pBankCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FOKUTIL.F_GET_1099_DEFINITION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_COAS_CODE", pCoasCode);
			cmd.addParameter("@P_BANK_CODE", pBankCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetCurrFromBank(NString pBankCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FOKUTIL.F_GET_CURR_FROM_BANK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_BANK_CODE", pBankCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetCurrFromInv(NString pInvoiceTypeInd,NNumber pVendPidm,NString pPohdCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FOKUTIL.F_GET_CURR_FROM_INV", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_INVOICE_TYPE_IND", pInvoiceTypeInd);
			cmd.addParameter("@P_VEND_PIDM", pVendPidm);
			cmd.addParameter("@P_POHD_CODE", pPohdCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber fGetCurrencyRate(NString pCurrCode,NDate pEffDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FOKUTIL.F_GET_CURRENCY_RATE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_CURR_CODE", pCurrCode);
			cmd.addParameter("@P_EFF_DATE", pEffDate);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fGetGlBalance(NDate pAsofDate,NString pCoasCode,NString pAccountCode,NString pFundCode,NString pIncludeAccrualPeriod) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FOKUTIL.F_GET_GL_BALANCE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_ASOF_DATE", pAsofDate);
			cmd.addParameter("@P_COAS_CODE", pCoasCode);
			cmd.addParameter("@P_ACCOUNT_CODE", pAccountCode);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_INCLUDE_ACCRUAL_PERIOD", pIncludeAccrualPeriod);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString fGetSeqnType(NNumber docType) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FOKUTIL.F_GET_SEQN_TYPE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@DOC_TYPE", docType);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fNextDisplay() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FOKUTIL.F_NEXT_DISPLAY", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fNoDupdocExists(NNumber docType,NString docCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FOKUTIL.F_NO_DUPDOC_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@DOC_TYPE", docType);
			cmd.addParameter("@DOC_CODE", docCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NBool fNsfCheckIsRequired(NNumber pDocType,NDate pTransDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FOKUTIL.F_NSF_CHECK_IS_REQUIRED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@P_DOC_TYPE", pDocType);
			cmd.addParameter("@P_TRANS_DATE", pTransDate);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NString fPendingDocStatus(NNumber pDocType,NString pDocCode,NNumber pDocSubNum) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FOKUTIL.F_PENDING_DOC_STATUS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_DOC_TYPE", pDocType);
			cmd.addParameter("@P_DOC_CODE", pDocCode);
			cmd.addParameter("@P_DOC_SUB_NUM", pDocSubNum);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fPneInstFlag() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FOKUTIL.F_PNE_INST_FLAG", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fSingleAcctgDefaultInd(NNumber docType) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FOKUTIL.F_SINGLE_ACCTG_DEFAULT_IND", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@DOC_TYPE", docType);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fTextExists(NNumber docType,NString docCode,NNumber docItem) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FOKUTIL.F_TEXT_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@DOC_TYPE", docType);
			cmd.addParameter("@DOC_CODE", docCode);
			cmd.addParameter("@DOC_ITEM", docItem);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void genNextFobseqn15(NString pSeqType,Ref<NString> pNextDocCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FOKUTIL.GEN_NEXT_FOBSEQN15", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SEQ_TYPE", pSeqType);
			cmd.addParameter("@P_NEXT_DOC_CODE", NString.class);
				
			cmd.execute();
			pNextDocCode.val = cmd.getParameterValue("@P_NEXT_DOC_CODE", NString.class);


		}
		
		public static void genNextFobseqn7(NString pSeqType,Ref<NString> pNextDocCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FOKUTIL.GEN_NEXT_FOBSEQN7", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SEQ_TYPE", pSeqType);
			cmd.addParameter("@P_NEXT_DOC_CODE", NString.class);
				
			cmd.execute();
			pNextDocCode.val = cmd.getParameterValue("@P_NEXT_DOC_CODE", NString.class);


		}
		
		public static void genNextFobseqn8(NString pSeqType,Ref<NString> pNextDocCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FOKUTIL.GEN_NEXT_FOBSEQN8", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SEQ_TYPE", pSeqType);
			cmd.addParameter("@P_NEXT_DOC_CODE", NString.class);
				
			cmd.execute();
			pNextDocCode.val = cmd.getParameterValue("@P_NEXT_DOC_CODE", NString.class);


		}
		
		public static void pCompleteValidCurrBank(NString pInvhCode,NString pHeaderBankCode,NString pInvoiceTypeInd,NNumber pVendPidm,NString pPohdCode,NString pCurrCode,NString pDisbAgentInd,Ref<NString> pErrorMesgOut,Ref<NString> pWarnMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FOKUTIL.P_COMPLETE_VALID_CURR_BANK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_INVH_CODE", pInvhCode);
			cmd.addParameter("@P_HEADER_BANK_CODE", pHeaderBankCode);
			cmd.addParameter("@P_INVOICE_TYPE_IND", pInvoiceTypeInd);
			cmd.addParameter("@P_VEND_PIDM", pVendPidm);
			cmd.addParameter("@P_POHD_CODE", pPohdCode);
			cmd.addParameter("@P_CURR_CODE", pCurrCode);
			cmd.addParameter("@P_DISB_AGENT_IND", pDisbAgentInd);
			cmd.addParameter("@P_ERROR_MESG_OUT", NString.class);
			cmd.addParameter("@P_WARN_MSG_OUT", NString.class);
				
			cmd.execute();
			pErrorMesgOut.val = cmd.getParameterValue("@P_ERROR_MESG_OUT", NString.class);
			pWarnMsgOut.val = cmd.getParameterValue("@P_WARN_MSG_OUT", NString.class);


		}
		
		public static void pDoAbalQuery(NString docCode,NString docType,NString transDate,NString reversalInd,NNumber itemNumber,NNumber seqNumber,NNumber submissionNumber,NNumber serialNumber,NString coasCode,NString fsyrCode,NString fundCode,NString orgnCode,NString acctCode,NString progCode,NString ruclCode,NNumber transAmount,NString drCrInd,NString postingPeriod,NString budgetPeriod,NString encdNum,NNumber encdItemNum,NNumber encdSeqNum,NString encdActionInd,NString commitmentType,NString nsfOverrideInd,Ref<NString> abalIndicator,Ref<NString> abalMessage) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FOKUTIL.P_DO_ABAL_QUERY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@DOC_CODE", docCode);
			cmd.addParameter("@DOC_TYPE", docType);
			cmd.addParameter("@TRANS_DATE", transDate);
			cmd.addParameter("@REVERSAL_IND", reversalInd);
			cmd.addParameter("@ITEM_NUMBER", itemNumber);
			cmd.addParameter("@SEQ_NUMBER", seqNumber);
			cmd.addParameter("@SUBMISSION_NUMBER", submissionNumber);
			cmd.addParameter("@SERIAL_NUMBER", serialNumber);
			cmd.addParameter("@COAS_CODE", coasCode);
			cmd.addParameter("@FSYR_CODE", fsyrCode);
			cmd.addParameter("@FUND_CODE", fundCode);
			cmd.addParameter("@ORGN_CODE", orgnCode);
			cmd.addParameter("@ACCT_CODE", acctCode);
			cmd.addParameter("@PROG_CODE", progCode);
			cmd.addParameter("@RUCL_CODE", ruclCode);
			cmd.addParameter("@TRANS_AMOUNT", transAmount);
			cmd.addParameter("@DR_CR_IND", drCrInd);
			cmd.addParameter("@POSTING_PERIOD", postingPeriod);
			cmd.addParameter("@BUDGET_PERIOD", budgetPeriod);
			cmd.addParameter("@ENCD_NUM", encdNum);
			cmd.addParameter("@ENCD_ITEM_NUM", encdItemNum);
			cmd.addParameter("@ENCD_SEQ_NUM", encdSeqNum);
			cmd.addParameter("@ENCD_ACTION_IND", encdActionInd);
			cmd.addParameter("@COMMITMENT_TYPE", commitmentType);
			cmd.addParameter("@NSF_OVERRIDE_IND", nsfOverrideInd);
			cmd.addParameter("@ABAL_INDICATOR", abalIndicator, true);
			cmd.addParameter("@ABAL_MESSAGE", abalMessage, true);
				
			cmd.execute();
			abalIndicator.val = cmd.getParameterValue("@ABAL_INDICATOR", NString.class);
			abalMessage.val = cmd.getParameterValue("@ABAL_MESSAGE", NString.class);


		}
		
		public static void pGenDocCode(NNumber docType,Ref<NString> docCode,NNumber docLength,NString docPrefix) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FOKUTIL.P_GEN_DOC_CODE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@DOC_TYPE", docType);
			cmd.addParameter("@DOC_CODE", docCode, true);
			cmd.addParameter("@DOC_LENGTH", docLength);
			cmd.addParameter("@DOC_PREFIX", docPrefix);
				
			cmd.execute();
			docCode.val = cmd.getParameterValue("@DOC_CODE", NString.class);


		}
		
		public static void pGetFinancialMgr(NString fundOrOrg,NString coasCode,NString fundCode,NString orgnCode,NDate asOfDate,Ref<NNumber> fmgrPidm,Ref<NString> fmgrTitle,Ref<NString> fmgrFirstName,Ref<NString> fmgrMiName,Ref<NString> fmgrLastName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FOKUTIL.P_GET_FINANCIAL_MGR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@FUND_OR_ORG", fundOrOrg);
			cmd.addParameter("@COAS_CODE", coasCode);
			cmd.addParameter("@FUND_CODE", fundCode);
			cmd.addParameter("@ORGN_CODE", orgnCode);
			cmd.addParameter("@AS_OF_DATE", asOfDate);
			cmd.addParameter("@FMGR_PIDM", NNumber.class);
			cmd.addParameter("@FMGR_TITLE", NString.class);
			cmd.addParameter("@FMGR_FIRST_NAME", NString.class);
			cmd.addParameter("@FMGR_MI_NAME", NString.class);
			cmd.addParameter("@FMGR_LAST_NAME", NString.class);
				
			cmd.execute();
			fmgrPidm.val = cmd.getParameterValue("@FMGR_PIDM", NNumber.class);
			fmgrTitle.val = cmd.getParameterValue("@FMGR_TITLE", NString.class);
			fmgrFirstName.val = cmd.getParameterValue("@FMGR_FIRST_NAME", NString.class);
			fmgrMiName.val = cmd.getParameterValue("@FMGR_MI_NAME", NString.class);
			fmgrLastName.val = cmd.getParameterValue("@FMGR_LAST_NAME", NString.class);


		}
		
		public static void pGetFsyrFspd(NString pCoasCode,NDate pTransDate,NString pUserId,Ref<NString> pFsyrOut,Ref<NString> pFspdOut,NString pCheckUserAuth) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FOKUTIL.P_GET_FSYR_FSPD", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_COAS_CODE", pCoasCode);
			cmd.addParameter("@P_TRANS_DATE", pTransDate);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_FSYR_OUT", NString.class);
			cmd.addParameter("@P_FSPD_OUT", NString.class);
			cmd.addParameter("@P_CHECK_USER_AUTH", pCheckUserAuth);
				
			cmd.execute();
			pFsyrOut.val = cmd.getParameterValue("@P_FSYR_OUT", NString.class);
			pFspdOut.val = cmd.getParameterValue("@P_FSPD_OUT", NString.class);


		}
		
		public static void pInsertFgrtrnr(NNumber pDocType,NString pDocNum,NNumber pSeqNum,NNumber pItemNum,NString pSubmissionNumber,NString pReversalInd,NString pEditCode,NString pShortTitle,NString pFieldName,NString pErrorMessage,NString pUserId,NString pRuclCode,NString pDocRefNum,NDate pTransDate,NNumber pTransAmt,NString pTransDesc,NString pDrCrInd,NString pBankCode,NString pObudCode,NString pObphCode,NString pBudgDurCode,NString pCoasCode,NString pAcciCode,NString pFundCode,NString pOrgnCode,NString pAcctCode,NString pProgCode,NString pActvCode,NString pLocnCode,NString pDepNum,NString pEncdNum,NNumber pEncdItemNum,NNumber pEncdSeqNum,NString pEncdActionInd,NString pPrjdCode,NNumber pDistPct,NString pBudDispn,NString pCmtType,NNumber pCmtPct,NString pEncbType,NNumber pVendorPidm,NString pOneTimeVendCode,NString pBudgetPeriod,NString pAccrualInd,NString pAbalOverride) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FOKUTIL.P_INSERT_FGRTRNR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DOC_TYPE", pDocType);
			cmd.addParameter("@P_DOC_NUM", pDocNum);
			cmd.addParameter("@P_SEQ_NUM", pSeqNum);
			cmd.addParameter("@P_ITEM_NUM", pItemNum);
			cmd.addParameter("@P_SUBMISSION_NUMBER", pSubmissionNumber);
			cmd.addParameter("@P_REVERSAL_IND", pReversalInd);
			cmd.addParameter("@P_EDIT_CODE", pEditCode);
			cmd.addParameter("@P_SHORT_TITLE", pShortTitle);
			cmd.addParameter("@P_FIELD_NAME", pFieldName);
			cmd.addParameter("@P_ERROR_MESSAGE", pErrorMessage);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_RUCL_CODE", pRuclCode);
			cmd.addParameter("@P_DOC_REF_NUM", pDocRefNum);
			cmd.addParameter("@P_TRANS_DATE", pTransDate);
			cmd.addParameter("@P_TRANS_AMT", pTransAmt);
			cmd.addParameter("@P_TRANS_DESC", pTransDesc);
			cmd.addParameter("@P_DR_CR_IND", pDrCrInd);
			cmd.addParameter("@P_BANK_CODE", pBankCode);
			cmd.addParameter("@P_OBUD_CODE", pObudCode);
			cmd.addParameter("@P_OBPH_CODE", pObphCode);
			cmd.addParameter("@P_BUDG_DUR_CODE", pBudgDurCode);
			cmd.addParameter("@P_COAS_CODE", pCoasCode);
			cmd.addParameter("@P_ACCI_CODE", pAcciCode);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_ORGN_CODE", pOrgnCode);
			cmd.addParameter("@P_ACCT_CODE", pAcctCode);
			cmd.addParameter("@P_PROG_CODE", pProgCode);
			cmd.addParameter("@P_ACTV_CODE", pActvCode);
			cmd.addParameter("@P_LOCN_CODE", pLocnCode);
			cmd.addParameter("@P_DEP_NUM", pDepNum);
			cmd.addParameter("@P_ENCD_NUM", pEncdNum);
			cmd.addParameter("@P_ENCD_ITEM_NUM", pEncdItemNum);
			cmd.addParameter("@P_ENCD_SEQ_NUM", pEncdSeqNum);
			cmd.addParameter("@P_ENCD_ACTION_IND", pEncdActionInd);
			cmd.addParameter("@P_PRJD_CODE", pPrjdCode);
			cmd.addParameter("@P_DIST_PCT", pDistPct);
			cmd.addParameter("@P_BUD_DISPN", pBudDispn);
			cmd.addParameter("@P_CMT_TYPE", pCmtType);
			cmd.addParameter("@P_CMT_PCT", pCmtPct);
			cmd.addParameter("@P_ENCB_TYPE", pEncbType);
			cmd.addParameter("@P_VENDOR_PIDM", pVendorPidm);
			cmd.addParameter("@P_ONE_TIME_VEND_CODE", pOneTimeVendCode);
			cmd.addParameter("@P_BUDGET_PERIOD", pBudgetPeriod);
			cmd.addParameter("@P_ACCRUAL_IND", pAccrualInd);
			cmd.addParameter("@P_ABAL_OVERRIDE", pAbalOverride);
				
			cmd.execute();


		}
		
//		public static void pInsertFgrtrnr(FbJvDetail.JvDetailRecRow pJvDetailRec,FbJvHeader.JvHeaderRecRow pJvHeaderRec,List<FbCommon.ErrTabtypeRow> pErrTab) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FOKUTIL.P_INSERT_FGRTRNR", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter(DbTypes.createStructType("P_JV_DETAIL_REC", pJvDetailRec, FbJvDetail.JvDetailRecRow.class ));
//			cmd.addParameter(DbTypes.createStructType("P_JV_HEADER_REC", pJvHeaderRec, FbJvHeader.JvHeaderRecRow.class ));
//			// cmd.addParameter(DbTypes.getTableType("P_ERR_TAB", "", pErrTab, object.class));
//				
//			cmd.execute();
//
//
//		}
		
//		public static void pInsertFgrtrnr(FbEncumbranceDetail.EncumbranceDetailRecRow pEncumbranceDetailRec,FbEncumbranceHeader.EncumbranceHeaderRecRow pEncumbranceHeaderRec,List<FbCommon.ErrTabtypeRow> pErrTab) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FOKUTIL.P_INSERT_FGRTRNR", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter(DbTypes.createStructType("P_ENCUMBRANCE_DETAIL_REC", pEncumbranceDetailRec, FbEncumbranceDetail.EncumbranceDetailRecRow.class ));
//			cmd.addParameter(DbTypes.createStructType("P_ENCUMBRANCE_HEADER_REC", pEncumbranceHeaderRec, FbEncumbranceHeader.EncumbranceHeaderRecRow.class ));
//			// cmd.addParameter(DbTypes.getTableType("P_ERR_TAB", "", pErrTab, object.class));
//				
//			cmd.execute();
//
//
//		}
		
		public static void pInsertFobappd(NNumber seqCode,NString docCode,NNumber seqNum,NString bankCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FOKUTIL.P_INSERT_FOBAPPD", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SEQ_CODE", seqCode);
			cmd.addParameter("@DOC_CODE", docCode);
			cmd.addParameter("@SEQ_NUM", seqNum);
			cmd.addParameter("@BANK_CODE", bankCode);
				
			cmd.execute();


		}
		
		public static void pInsertFobdinp(NNumber seqCode,NString docCode,NNumber seqNum,NString bankCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FOKUTIL.P_INSERT_FOBDINP", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SEQ_CODE", seqCode);
			cmd.addParameter("@DOC_CODE", docCode);
			cmd.addParameter("@SEQ_NUM", seqNum);
			cmd.addParameter("@BANK_CODE", bankCode);
				
			cmd.execute();


		}
		
		public static void pInsertFobuapp(NNumber seqCode,NString userCode,NString docCode,NNumber docAmt,NString origUser,NNumber chgSeqNum,NNumber subNum,NString status) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FOKUTIL.P_INSERT_FOBUAPP", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SEQ_CODE", seqCode);
			cmd.addParameter("@USER_CODE", userCode);
			cmd.addParameter("@DOC_CODE", docCode);
			cmd.addParameter("@DOC_AMT", docAmt);
			cmd.addParameter("@ORIG_USER", origUser);
			cmd.addParameter("@CHG_SEQ_NUM", chgSeqNum);
			cmd.addParameter("@SUB_NUM", subNum);
			cmd.addParameter("@STATUS", status);
				
			cmd.execute();


		}
		
		public static void pInsertFtvtgrp(NString pTgrpCode,NDate pEffDate,NString pUserId,NDate pNchgDate,NDate pTermDate,NString pTitle,NString pStatusInd,NString pCoasCodeValid,NString pNonTaxable) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FOKUTIL.P_INSERT_FTVTGRP", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TGRP_CODE", pTgrpCode);
			cmd.addParameter("@P_EFF_DATE", pEffDate);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_NCHG_DATE", pNchgDate);
			cmd.addParameter("@P_TERM_DATE", pTermDate);
			cmd.addParameter("@P_TITLE", pTitle);
			cmd.addParameter("@P_STATUS_IND", pStatusInd);
			cmd.addParameter("@P_COAS_CODE_VALID", pCoasCodeValid);
			cmd.addParameter("@P_NON_TAXABLE", pNonTaxable);
				
			cmd.execute();


		}
		
		public static void pIsFoapPostable(NString docType,NString docCode,NNumber itemNum,NNumber seqNum,NString coas,NString acci,NString fund,NString orgn,NString acct,NString prog,NString actv,NString locn,NDate transdate,NNumber transAmt,NString userid,Ref<NString> isFoapValid,Ref<NString> messageOut,NString currCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FOKUTIL.P_IS_FOAP_POSTABLE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@DOC_TYPE", docType);
			cmd.addParameter("@DOC_CODE", docCode);
			cmd.addParameter("@ITEM_NUM", itemNum);
			cmd.addParameter("@SEQ_NUM", seqNum);
			cmd.addParameter("@COAS", coas);
			cmd.addParameter("@ACCI", acci);
			cmd.addParameter("@FUND", fund);
			cmd.addParameter("@ORGN", orgn);
			cmd.addParameter("@ACCT", acct);
			cmd.addParameter("@PROG", prog);
			cmd.addParameter("@ACTV", actv);
			cmd.addParameter("@LOCN", locn);
			cmd.addParameter("@TRANSDATE", transdate);
			cmd.addParameter("@TRANS_AMT", transAmt);
			cmd.addParameter("@USERID", userid);
			cmd.addParameter("@IS_FOAP_VALID", NString.class);
			cmd.addParameter("@MESSAGE_OUT", NString.class);
			cmd.addParameter("@CURR_CODE", currCode);
				
			cmd.execute();
			isFoapValid.val = cmd.getParameterValue("@IS_FOAP_VALID", NString.class);
			messageOut.val = cmd.getParameterValue("@MESSAGE_OUT", NString.class);


		}
		
		public static void pLoadGuroutp(NString pProfileName,NString pJob,NNumber pOneUpNo,Ref<NNumber> pUserNum,Ref<NString> pOutMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FOKUTIL.P_LOAD_GUROUTP", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PROFILE_NAME", pProfileName);
			cmd.addParameter("@P_JOB", pJob);
			cmd.addParameter("@P_ONE_UP_NO", pOneUpNo);
			cmd.addParameter("@P_USER_NUM", NNumber.class);
			cmd.addParameter("@P_OUT_MSG", NString.class);
				
			cmd.execute();
			pUserNum.val = cmd.getParameterValue("@P_USER_NUM", NNumber.class);
			pOutMsg.val = cmd.getParameterValue("@P_OUT_MSG", NString.class);


		}
		
		public static void pPendingDocInfo(NNumber pDocType,NString pDocCode,NNumber pDocSubNum,NNumber pDocItemNum,NNumber pDocSeqNum,Ref<NDate> pTranDate,Ref<NDate> pActivityDate,Ref<NString> pTranDesc,Ref<NString> pRuclCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FOKUTIL.P_PENDING_DOC_INFO", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DOC_TYPE", pDocType);
			cmd.addParameter("@P_DOC_CODE", pDocCode);
			cmd.addParameter("@P_DOC_SUB_NUM", pDocSubNum);
			cmd.addParameter("@P_DOC_ITEM_NUM", pDocItemNum);
			cmd.addParameter("@P_DOC_SEQ_NUM", pDocSeqNum);
			cmd.addParameter("@P_TRAN_DATE", NDate.class);
			cmd.addParameter("@P_ACTIVITY_DATE", NDate.class);
			cmd.addParameter("@P_TRAN_DESC", NString.class);
			cmd.addParameter("@P_RUCL_CODE", NString.class);
				
			cmd.execute();
			pTranDate.val = cmd.getParameterValue("@P_TRAN_DATE", NDate.class);
			pActivityDate.val = cmd.getParameterValue("@P_ACTIVITY_DATE", NDate.class);
			pTranDesc.val = cmd.getParameterValue("@P_TRAN_DESC", NString.class);
			pRuclCode.val = cmd.getParameterValue("@P_RUCL_CODE", NString.class);


		}
		
		public static void pReverseAbal(NNumber pDocType,NString pDocCode,NNumber pSubNum,NNumber pChgSeqNum,NString pIsAbalPosted) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FOKUTIL.P_REVERSE_ABAL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DOC_TYPE", pDocType);
			cmd.addParameter("@P_DOC_CODE", pDocCode);
			cmd.addParameter("@P_SUB_NUM", pSubNum);
			cmd.addParameter("@P_CHG_SEQ_NUM", pChgSeqNum);
			cmd.addParameter("@P_IS_ABAL_POSTED", pIsAbalPosted);
				
			cmd.execute();


		}
		
		public static void pScrubchar(NString incode,NNumber maxlength,NString defvalue,Ref<NString> outcode,Ref<NString> errorMesg,Ref<NString> errorLevel,NString codename,NString towhichcase,NString errorout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FOKUTIL.P_SCRUBCHAR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@INCODE", incode);
			cmd.addParameter("@MAXLENGTH", maxlength);
			cmd.addParameter("@DEFVALUE", defvalue);
			cmd.addParameter("@OUTCODE", NString.class);
			cmd.addParameter("@ERROR_MESG", NString.class);
			cmd.addParameter("@ERROR_LEVEL", NString.class);
			cmd.addParameter("@CODENAME", codename);
			cmd.addParameter("@TOWHICHCASE", towhichcase);
			cmd.addParameter("@ERROROUT", errorout);
				
			cmd.execute();
			outcode.val = cmd.getParameterValue("@OUTCODE", NString.class);
			errorMesg.val = cmd.getParameterValue("@ERROR_MESG", NString.class);
			errorLevel.val = cmd.getParameterValue("@ERROR_LEVEL", NString.class);


		}
		
		public static void pScrubdate(NString indate,NString dateformat,Ref<NDate> outdate,Ref<NString> errorMesg,Ref<NString> errorLevel,NString datename) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FOKUTIL.P_SCRUBDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@INDATE", indate);
			cmd.addParameter("@DATEFORMAT", dateformat);
			cmd.addParameter("@OUTDATE", NDate.class);
			cmd.addParameter("@ERROR_MESG", NString.class);
			cmd.addParameter("@ERROR_LEVEL", NString.class);
			cmd.addParameter("@DATENAME", datename);
				
			cmd.execute();
			outdate.val = cmd.getParameterValue("@OUTDATE", NDate.class);
			errorMesg.val = cmd.getParameterValue("@ERROR_MESG", NString.class);
			errorLevel.val = cmd.getParameterValue("@ERROR_LEVEL", NString.class);


		}
		
		public static void pScrubnumb(NString incode,NNumber maxlength,Ref<NNumber> outcode,Ref<NString> errorMesg,Ref<NString> errorLevel,NString codename,NNumber maxscale) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FOKUTIL.P_SCRUBNUMB", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@INCODE", incode);
			cmd.addParameter("@MAXLENGTH", maxlength);
			cmd.addParameter("@OUTCODE", NNumber.class);
			cmd.addParameter("@ERROR_MESG", NString.class);
			cmd.addParameter("@ERROR_LEVEL", NString.class);
			cmd.addParameter("@CODENAME", codename);
			cmd.addParameter("@MAXSCALE", maxscale);
				
			cmd.execute();
			outcode.val = cmd.getParameterValue("@OUTCODE", NNumber.class);
			errorMesg.val = cmd.getParameterValue("@ERROR_MESG", NString.class);
			errorLevel.val = cmd.getParameterValue("@ERROR_LEVEL", NString.class);


		}
		
		public static void pSendTravelPcardEmail(Ref<NString> pMsgOut,Ref<NString> pMsgTypeOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FOKUTIL.P_SEND_TRAVEL_PCARD_EMAIL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_MSG_OUT", NString.class);
			cmd.addParameter("@P_MSG_TYPE_OUT", NString.class);
				
			cmd.execute();
			pMsgOut.val = cmd.getParameterValue("@P_MSG_OUT", NString.class);
			pMsgTypeOut.val = cmd.getParameterValue("@P_MSG_TYPE_OUT", NString.class);


		}
		
		public static void pValidateAdvcCheckCancel(NString pCheckNumber,NString pBankCode,NString pReestablishPayableInd,Ref<NString> pMsgOut,Ref<NString> pMsgTypeOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FOKUTIL.P_VALIDATE_ADVC_CHECK_CANCEL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CHECK_NUMBER", pCheckNumber);
			cmd.addParameter("@P_BANK_CODE", pBankCode);
			cmd.addParameter("@P_REESTABLISH_PAYABLE_IND", pReestablishPayableInd);
			cmd.addParameter("@P_MSG_OUT", NString.class);
			cmd.addParameter("@P_MSG_TYPE_OUT", NString.class);
				
			cmd.execute();
			pMsgOut.val = cmd.getParameterValue("@P_MSG_OUT", NString.class);
			pMsgTypeOut.val = cmd.getParameterValue("@P_MSG_TYPE_OUT", NString.class);


		}
		
		public static void pValidateBankCurr(NString pHeaderBankCode,NString pAcctgBankCode,NString pInvCurrCode,NString pDisbAgentInd,Ref<NString> pErrorMesgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FOKUTIL.P_VALIDATE_BANK_CURR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_HEADER_BANK_CODE", pHeaderBankCode);
			cmd.addParameter("@P_ACCTG_BANK_CODE", pAcctgBankCode);
			cmd.addParameter("@P_INV_CURR_CODE", pInvCurrCode);
			cmd.addParameter("@P_DISB_AGENT_IND", pDisbAgentInd);
			cmd.addParameter("@P_ERROR_MESG_OUT", NString.class);
				
			cmd.execute();
			pErrorMesgOut.val = cmd.getParameterValue("@P_ERROR_MESG_OUT", NString.class);


		}
		
		public static void pValidateInvCurr(NString pCurrCode,NString pInvoiceTypeInd,NNumber pVendPidm,NString pPohdCode,Ref<NString> pErrorMesgOut,Ref<NString> pWarnMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FOKUTIL.P_VALIDATE_INV_CURR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CURR_CODE", pCurrCode);
			cmd.addParameter("@P_INVOICE_TYPE_IND", pInvoiceTypeInd);
			cmd.addParameter("@P_VEND_PIDM", pVendPidm);
			cmd.addParameter("@P_POHD_CODE", pPohdCode);
			cmd.addParameter("@P_ERROR_MESG_OUT", NString.class);
			cmd.addParameter("@P_WARN_MSG_OUT", NString.class);
				
			cmd.execute();
			pErrorMesgOut.val = cmd.getParameterValue("@P_ERROR_MESG_OUT", NString.class);
			pWarnMsgOut.val = cmd.getParameterValue("@P_WARN_MSG_OUT", NString.class);


		}
		
		public static void pValidateTransdate(NString coas,NDate transdate,Ref<NString> fsyrCode,Ref<NString> fspdCode,Ref<NString> message,NString isEncumbRollOk,NString pUserId,NString pCheckUserAuth) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FOKUTIL.P_VALIDATE_TRANSDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@COAS", coas);
			cmd.addParameter("@TRANSDATE", transdate);
			cmd.addParameter("@FSYR_CODE", NString.class);
			cmd.addParameter("@FSPD_CODE", NString.class);
			cmd.addParameter("@MESSAGE", NString.class);
			cmd.addParameter("@IS_ENCUMB_ROLL_OK", isEncumbRollOk);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_CHECK_USER_AUTH", pCheckUserAuth);
				
			cmd.execute();
			fsyrCode.val = cmd.getParameterValue("@FSYR_CODE", NString.class);
			fspdCode.val = cmd.getParameterValue("@FSPD_CODE", NString.class);
			message.val = cmd.getParameterValue("@MESSAGE", NString.class);


		}
		
	
	
	
}
