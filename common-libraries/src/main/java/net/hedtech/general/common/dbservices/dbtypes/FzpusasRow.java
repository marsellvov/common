package net.hedtech.general.common.dbservices.dbtypes;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class FzpusasRow {
		public static NString f1099Ityp(NString fnItyp) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FZPUSAS.F_1099_ITYP", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@FN_ITYP", fnItyp);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fAcctCodeAtLevel(NString coasCodeIn,NString acctCodeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FZPUSAS.F_ACCT_CODE_AT_LEVEL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@COAS_CODE_IN", coasCodeIn);
			cmd.addParameter("@ACCT_CODE_IN", acctCodeIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber fBdocTotal(NString fnBdoc) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FZPUSAS.F_BDOC_TOTAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@FN_BDOC", fnBdoc);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString fCheckUsasAccounting(NString fnCoas,NString fnYear,NString fnBank) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FZPUSAS.F_CHECK_USAS_ACCOUNTING", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@FN_COAS", fnCoas);
			cmd.addParameter("@FN_YEAR", fnYear);
			cmd.addParameter("@FN_BANK", fnBank);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fCoasAgency(NString fnCoas) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FZPUSAS.F_COAS_AGENCY", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@FN_COAS", fnCoas);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber fDocumentVendor(NString fnDoc,NString fnDtyp,NNumber fnSeq) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FZPUSAS.F_DOCUMENT_VENDOR", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@FN_DOC", fnDoc);
			cmd.addParameter("@FN_DTYP", fnDtyp);
			cmd.addParameter("@FN_SEQ", fnSeq);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString fFeedUsasDoc(NString fnDtyp,NString fnCoas) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FZPUSAS.F_FEED_USAS_DOC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@FN_DTYP", fnDtyp);
			cmd.addParameter("@FN_COAS", fnCoas);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fFgbjvcdExists(NString fnDoc) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FZPUSAS.F_FGBJVCD_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@FN_DOC", fnDoc);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fFzruclrExists(NString fnDoc,NNumber fnSeqno,NNumber fnItem) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FZPUSAS.F_FZRUCLR_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@FN_DOC", fnDoc);
			cmd.addParameter("@FN_SEQNO", fnSeqno);
			cmd.addParameter("@FN_ITEM", fnItem);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fFzrudhrExists(NString fnDoc,NString fnUbbt) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FZPUSAS.F_FZRUDHR_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@FN_DOC", fnDoc);
			cmd.addParameter("@FN_UBBT", fnUbbt);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fFzrudtlExists(NString fnDoc,NString fnUbbt,NNumber fnSeqno,NNumber fnItem) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FZPUSAS.F_FZRUDTL_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@FN_DOC", fnDoc);
			cmd.addParameter("@FN_UBBT", fnUbbt);
			cmd.addParameter("@FN_SEQNO", fnSeqno);
			cmd.addParameter("@FN_ITEM", fnItem);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fFzrusasExists(NString fnDoc,NString fnUbbt) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FZPUSAS.F_FZRUSAS_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@FN_DOC", fnDoc);
			cmd.addParameter("@FN_UBBT", fnUbbt);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fFzrusasJvExists(NString fnDoc,NString fnDtyp,NString fnCoas) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FZPUSAS.F_FZRUSAS_JV_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@FN_DOC", fnDoc);
			cmd.addParameter("@FN_DTYP", fnDtyp);
			cmd.addParameter("@FN_COAS", fnCoas);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetFsyrCode(NString fnCoas,NDate fnDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FZPUSAS.F_GET_FSYR_CODE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@FN_COAS", fnCoas);
			cmd.addParameter("@FN_DATE", fnDate);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetInvoiceDesc(NString fnInvh) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FZPUSAS.F_GET_INVOICE_DESC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@FN_INVH", fnInvh);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fInvoiceDesc(NString fnInvh,NNumber fnSeqNum,NNumber fnItem,NString fnPohd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FZPUSAS.F_INVOICE_DESC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@FN_INVH", fnInvh);
			cmd.addParameter("@FN_SEQ_NUM", fnSeqNum);
			cmd.addParameter("@FN_ITEM", fnItem);
			cmd.addParameter("@FN_POHD", fnPohd);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fJulianDay() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FZPUSAS.F_JULIAN_DAY", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fJulianYearDay() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FZPUSAS.F_JULIAN_YEAR_DAY", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber fMaxUsasSeq(NString fnDoc) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FZPUSAS.F_MAX_USAS_SEQ", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@FN_DOC", fnDoc);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString fRedoUsasTrans(NString fnDoc) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FZPUSAS.F_REDO_USAS_TRANS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@FN_DOC", fnDoc);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fRequiresLegalText(NString fnAcct) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FZPUSAS.F_REQUIRES_LEGAL_TEXT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@FN_ACCT", fnAcct);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber fUdocSeqTotal(NString fnBdoc,NNumber fnBseq,NNumber fnItem) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FZPUSAS.F_UDOC_SEQ_TOTAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@FN_BDOC", fnBdoc);
			cmd.addParameter("@FN_BSEQ", fnBseq);
			cmd.addParameter("@FN_ITEM", fnItem);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fUdocTotal(NString fnBdoc) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FZPUSAS.F_UDOC_TOTAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@FN_BDOC", fnBdoc);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString fUsasBank(NString fnBank,NString fnCoas) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FZPUSAS.F_USAS_BANK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@FN_BANK", fnBank);
			cmd.addParameter("@FN_COAS", fnCoas);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fUsasFed(NString fnDoc) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FZPUSAS.F_USAS_FED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@FN_DOC", fnDoc);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fUse1099Ityp() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FZPUSAS.F_USE_1099_ITYP", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fVendMailCode(NNumber fnPidm,NString fnAtyp,NNumber fnSeqno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FZPUSAS.F_VEND_MAIL_CODE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@FN_PIDM", fnPidm);
			cmd.addParameter("@FN_ATYP", fnAtyp);
			cmd.addParameter("@FN_SEQNO", fnSeqno);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fVendTinNumb(NNumber fnPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FZPUSAS.F_VEND_TIN_NUMB", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@FN_PIDM", fnPidm);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FZPUSAS.F_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pDupUdtl(NString pBdoc,NNumber pBseq,NNumber pItem,NNumber pHseq,NNumber pUseq) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FZPUSAS.P_DUP_UDTL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_BDOC", pBdoc);
			cmd.addParameter("@P_BSEQ", pBseq);
			cmd.addParameter("@P_ITEM", pItem);
			cmd.addParameter("@P_HSEQ", pHseq);
			cmd.addParameter("@P_USEQ", pUseq);
				
			cmd.execute();


		}
		
		public static void pFzruclrInvh(NString pDoc,NString pDtyp,NDate pDate,NNumber pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FZPUSAS.P_FZRUCLR_INVH", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DOC", pDoc);
			cmd.addParameter("@P_DTYP", pDtyp);
			cmd.addParameter("@P_DATE", pDate);
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();


		}
		
		public static void pFzruclrJvcd(NString pDoc,NString pDtyp,NNumber pSubNum,NDate pDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FZPUSAS.P_FZRUCLR_JVCD", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DOC", pDoc);
			cmd.addParameter("@P_DTYP", pDtyp);
			cmd.addParameter("@P_SUB_NUM", pSubNum);
			cmd.addParameter("@P_DATE", pDate);
				
			cmd.execute();


		}
		
		public static void pGetJvFzrusas(NString pBdocCode,NString pDtypCode,NString pCoas,Ref<NString> pUdtpCode,Ref<NString> pUbbtCode,Ref<NString> pUdocCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FZPUSAS.P_GET_JV_FZRUSAS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_BDOC_CODE", pBdocCode);
			cmd.addParameter("@P_DTYP_CODE", pDtypCode);
			cmd.addParameter("@P_COAS", pCoas);
			cmd.addParameter("@P_UDTP_CODE", pUdtpCode, true);
			cmd.addParameter("@P_UBBT_CODE", pUbbtCode, true);
			cmd.addParameter("@P_UDOC_CODE", pUdocCode, true);
				
			cmd.execute();
			pUdtpCode.val = cmd.getParameterValue("@P_UDTP_CODE", NString.class);
			pUbbtCode.val = cmd.getParameterValue("@P_UBBT_CODE", NString.class);
			pUdocCode.val = cmd.getParameterValue("@P_UDOC_CODE", NString.class);


		}
		
		public static void pInsertFzrudtl(NString udtlUbbt,NNumber udtlSeq,NString udtlUser,NString udtlBdoc,NString udtlDtyp,NNumber udtlBdocSeq,NNumber udtlItem,NString udtlUdoc,NString udtlUdocSuffix,NDate udtlEffDate,NString udtlAppYr,NString udtlAppropriation,NString udtlFund,NNumber udtlTransAmt,NString udtlUpca,NString udtlCompObj,NString udtlAgencyObj,NNumber udtlVendPidm,NString udtlItyp,NDate udtlInvhDate,NDate udtlDocDate,NDate udtlPmtDueDate,NString udtlReqNum,NString udtlUpcc,NString udtlDocYr,NString udtlNacubo,NString udtlInvoiceNum,NString udtlInvoiceDesc,NString udtlAtypCode,NString udtlCoasCode,NNumber udtlAtypSeqno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FZPUSAS.P_INSERT_FZRUDTL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@UDTL_UBBT", udtlUbbt);
			cmd.addParameter("@UDTL_SEQ", udtlSeq);
			cmd.addParameter("@UDTL_USER", udtlUser);
			cmd.addParameter("@UDTL_BDOC", udtlBdoc);
			cmd.addParameter("@UDTL_DTYP", udtlDtyp);
			cmd.addParameter("@UDTL_BDOC_SEQ", udtlBdocSeq);
			cmd.addParameter("@UDTL_ITEM", udtlItem);
			cmd.addParameter("@UDTL_UDOC", udtlUdoc);
			cmd.addParameter("@UDTL_UDOC_SUFFIX", udtlUdocSuffix);
			cmd.addParameter("@UDTL_EFF_DATE", udtlEffDate);
			cmd.addParameter("@UDTL_APP_YR", udtlAppYr);
			cmd.addParameter("@UDTL_APPROPRIATION", udtlAppropriation);
			cmd.addParameter("@UDTL_FUND", udtlFund);
			cmd.addParameter("@UDTL_TRANS_AMT", udtlTransAmt);
			cmd.addParameter("@UDTL_UPCA", udtlUpca);
			cmd.addParameter("@UDTL_COMP_OBJ", udtlCompObj);
			cmd.addParameter("@UDTL_AGENCY_OBJ", udtlAgencyObj);
			cmd.addParameter("@UDTL_VEND_PIDM", udtlVendPidm);
			cmd.addParameter("@UDTL_ITYP", udtlItyp);
			cmd.addParameter("@UDTL_INVH_DATE", udtlInvhDate);
			cmd.addParameter("@UDTL_DOC_DATE", udtlDocDate);
			cmd.addParameter("@UDTL_PMT_DUE_DATE", udtlPmtDueDate);
			cmd.addParameter("@UDTL_REQ_NUM", udtlReqNum);
			cmd.addParameter("@UDTL_UPCC", udtlUpcc);
			cmd.addParameter("@UDTL_DOC_YR", udtlDocYr);
			cmd.addParameter("@UDTL_NACUBO", udtlNacubo);
			cmd.addParameter("@UDTL_INVOICE_NUM", udtlInvoiceNum);
			cmd.addParameter("@UDTL_INVOICE_DESC", udtlInvoiceDesc);
			cmd.addParameter("@UDTL_ATYP_CODE", udtlAtypCode);
			cmd.addParameter("@UDTL_COAS_CODE", udtlCoasCode);
			cmd.addParameter("@UDTL_ATYP_SEQNO", udtlAtypSeqno);
				
			cmd.execute();


		}
		
		public static void pInsertFzrusas(NString inDocCode,NString inDtypCode,NNumber inSeqno,NNumber inItem,NString inUser,NNumber inVendPidm,NString inItypCode,NString inBankCode,NString inCoasCode,NString inFsyrCode,NString inFundCode,NString inOrgnCode,NString inAcctCode,NString inProgCode,NString inActvCode,NString inLocnCode,NNumber inAmount,NString inTransDesc,NString inUdocCode,NString inBudYr,NString inUpccCode,NString inUdtpCode,NString inUbbtCode,NDate inEffDate,NString inLegalText,NString inUclrInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FZPUSAS.P_INSERT_FZRUSAS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@IN_DOC_CODE", inDocCode);
			cmd.addParameter("@IN_DTYP_CODE", inDtypCode);
			cmd.addParameter("@IN_SEQNO", inSeqno);
			cmd.addParameter("@IN_ITEM", inItem);
			cmd.addParameter("@IN_USER", inUser);
			cmd.addParameter("@IN_VEND_PIDM", inVendPidm);
			cmd.addParameter("@IN_ITYP_CODE", inItypCode);
			cmd.addParameter("@IN_BANK_CODE", inBankCode);
			cmd.addParameter("@IN_COAS_CODE", inCoasCode);
			cmd.addParameter("@IN_FSYR_CODE", inFsyrCode);
			cmd.addParameter("@IN_FUND_CODE", inFundCode);
			cmd.addParameter("@IN_ORGN_CODE", inOrgnCode);
			cmd.addParameter("@IN_ACCT_CODE", inAcctCode);
			cmd.addParameter("@IN_PROG_CODE", inProgCode);
			cmd.addParameter("@IN_ACTV_CODE", inActvCode);
			cmd.addParameter("@IN_LOCN_CODE", inLocnCode);
			cmd.addParameter("@IN_AMOUNT", inAmount);
			cmd.addParameter("@IN_TRANS_DESC", inTransDesc);
			cmd.addParameter("@IN_UDOC_CODE", inUdocCode);
			cmd.addParameter("@IN_BUD_YR", inBudYr);
			cmd.addParameter("@IN_UPCC_CODE", inUpccCode);
			cmd.addParameter("@IN_UDTP_CODE", inUdtpCode);
			cmd.addParameter("@IN_UBBT_CODE", inUbbtCode);
			cmd.addParameter("@IN_EFF_DATE", inEffDate);
			cmd.addParameter("@IN_LEGAL_TEXT", inLegalText);
			cmd.addParameter("@IN_UCLR_IND", inUclrInd);
				
			cmd.execute();


		}
		
		public static void pLoadEnc(NString pEncDtyp,NString pEncBdoc,NString pEncUpcc,NString pEncUdtp,NString pEncUbbt,NString pEncUdoc,NString pEncFsyr,NString pEncUser,Ref<NNumber> pEncCount) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FZPUSAS.P_LOAD_ENC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ENC_DTYP", pEncDtyp);
			cmd.addParameter("@P_ENC_BDOC", pEncBdoc);
			cmd.addParameter("@P_ENC_UPCC", pEncUpcc);
			cmd.addParameter("@P_ENC_UDTP", pEncUdtp);
			cmd.addParameter("@P_ENC_UBBT", pEncUbbt);
			cmd.addParameter("@P_ENC_UDOC", pEncUdoc);
			cmd.addParameter("@P_ENC_FSYR", pEncFsyr);
			cmd.addParameter("@P_ENC_USER", pEncUser);
			cmd.addParameter("@P_ENC_COUNT", NNumber.class);
				
			cmd.execute();
			pEncCount.val = cmd.getParameterValue("@P_ENC_COUNT", NNumber.class);


		}
		
		public static void pLoadFzrudhr(NString pUdtlDoc,NString pUdtlDtyp,NString pUdtlUser) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FZPUSAS.P_LOAD_FZRUDHR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_UDTL_DOC", pUdtlDoc);
			cmd.addParameter("@P_UDTL_DTYP", pUdtlDtyp);
			cmd.addParameter("@P_UDTL_USER", pUdtlUser);
				
			cmd.execute();


		}
		
		public static void pLoadFzrudtl(NString pBdocCode,NString pDtypCode,NNumber pSeqNo,NNumber pItem,NString pUser,NString pBudgetYr,Ref<NNumber> pDocSeq,Ref<NNumber> pCount) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FZPUSAS.P_LOAD_FZRUDTL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_BDOC_CODE", pBdocCode);
			cmd.addParameter("@P_DTYP_CODE", pDtypCode);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_ITEM", pItem);
			cmd.addParameter("@P_USER", pUser);
			cmd.addParameter("@P_BUDGET_YR", pBudgetYr);
			cmd.addParameter("@P_DOC_SEQ", pDocSeq, true);
			cmd.addParameter("@P_COUNT", NNumber.class);
				
			cmd.execute();
			pDocSeq.val = cmd.getParameterValue("@P_DOC_SEQ", NNumber.class);
			pCount.val = cmd.getParameterValue("@P_COUNT", NNumber.class);


		}
		
		public static void pLoadFzruhdr(NString pUdhrUser,NString pUpdateAudit) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FZPUSAS.P_LOAD_FZRUHDR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_UDHR_USER", pUdhrUser);
			cmd.addParameter("@P_UPDATE_AUDIT", pUpdateAudit);
				
			cmd.execute();


		}
		
		public static void pLoadFzrusas(NString pDtypCode,NString pBdocCode,NString pUpccCode,NString pUdtpCode,NString pUbbtCode,NString pUdocCode,NString pBudYear,NString pUser,NString pBank,Ref<NNumber> pCount) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FZPUSAS.P_LOAD_FZRUSAS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DTYP_CODE", pDtypCode);
			cmd.addParameter("@P_BDOC_CODE", pBdocCode);
			cmd.addParameter("@P_UPCC_CODE", pUpccCode);
			cmd.addParameter("@P_UDTP_CODE", pUdtpCode);
			cmd.addParameter("@P_UBBT_CODE", pUbbtCode);
			cmd.addParameter("@P_UDOC_CODE", pUdocCode);
			cmd.addParameter("@P_BUD_YEAR", pBudYear);
			cmd.addParameter("@P_USER", pUser);
			cmd.addParameter("@P_BANK", pBank);
			cmd.addParameter("@P_COUNT", NNumber.class);
				
			cmd.execute();
			pCount.val = cmd.getParameterValue("@P_COUNT", NNumber.class);


		}
		
		public static void pLoadInv(NString pInvDtyp,NString pInvBdoc,NString pInvUpcc,NString pInvUdtp,NString pInvUbbt,NString pInvUdoc,NString pInvFsyr,NString pInvUser,NString pInvBank,Ref<NNumber> pInvCount) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FZPUSAS.P_LOAD_INV", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_INV_DTYP", pInvDtyp);
			cmd.addParameter("@P_INV_BDOC", pInvBdoc);
			cmd.addParameter("@P_INV_UPCC", pInvUpcc);
			cmd.addParameter("@P_INV_UDTP", pInvUdtp);
			cmd.addParameter("@P_INV_UBBT", pInvUbbt);
			cmd.addParameter("@P_INV_UDOC", pInvUdoc);
			cmd.addParameter("@P_INV_FSYR", pInvFsyr);
			cmd.addParameter("@P_INV_USER", pInvUser);
			cmd.addParameter("@P_INV_BANK", pInvBank);
			cmd.addParameter("@P_INV_COUNT", NNumber.class);
				
			cmd.execute();
			pInvCount.val = cmd.getParameterValue("@P_INV_COUNT", NNumber.class);


		}
		
		public static void pLoadJv(NString pJvDtyp,NString pJvBdoc,NString pJvUpcc,NString pJvUdtp,NString pJvUbbt,NString pJvUdoc,NString pJvFsyr,NString pJvUser,Ref<NNumber> pJvCount) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FZPUSAS.P_LOAD_JV", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_JV_DTYP", pJvDtyp);
			cmd.addParameter("@P_JV_BDOC", pJvBdoc);
			cmd.addParameter("@P_JV_UPCC", pJvUpcc);
			cmd.addParameter("@P_JV_UDTP", pJvUdtp);
			cmd.addParameter("@P_JV_UBBT", pJvUbbt);
			cmd.addParameter("@P_JV_UDOC", pJvUdoc);
			cmd.addParameter("@P_JV_FSYR", pJvFsyr);
			cmd.addParameter("@P_JV_USER", pJvUser);
			cmd.addParameter("@P_JV_COUNT", NNumber.class);
				
			cmd.execute();
			pJvCount.val = cmd.getParameterValue("@P_JV_COUNT", NNumber.class);


		}
		
		public static void pLoadPo(NString pPoDtyp,NString pPoBdoc,NString pPoUpcc,NString pPoUdtp,NString pPoUbbt,NString pPoUdoc,NString pPoFsyr,NString pPoUser,Ref<NNumber> pPoCount) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FZPUSAS.P_LOAD_PO", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PO_DTYP", pPoDtyp);
			cmd.addParameter("@P_PO_BDOC", pPoBdoc);
			cmd.addParameter("@P_PO_UPCC", pPoUpcc);
			cmd.addParameter("@P_PO_UDTP", pPoUdtp);
			cmd.addParameter("@P_PO_UBBT", pPoUbbt);
			cmd.addParameter("@P_PO_UDOC", pPoUdoc);
			cmd.addParameter("@P_PO_FSYR", pPoFsyr);
			cmd.addParameter("@P_PO_USER", pPoUser);
			cmd.addParameter("@P_PO_COUNT", NNumber.class);
				
			cmd.execute();
			pPoCount.val = cmd.getParameterValue("@P_PO_COUNT", NNumber.class);


		}
		
		public static void pLoadReq(NString pReqDtyp,NString pReqBdoc,NString pReqUpcc,NString pReqUdtp,NString pReqUbbt,NString pReqUdoc,NString pReqFsyr,NString pReqUser,Ref<NNumber> pReqCount) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FZPUSAS.P_LOAD_REQ", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_REQ_DTYP", pReqDtyp);
			cmd.addParameter("@P_REQ_BDOC", pReqBdoc);
			cmd.addParameter("@P_REQ_UPCC", pReqUpcc);
			cmd.addParameter("@P_REQ_UDTP", pReqUdtp);
			cmd.addParameter("@P_REQ_UBBT", pReqUbbt);
			cmd.addParameter("@P_REQ_UDOC", pReqUdoc);
			cmd.addParameter("@P_REQ_FSYR", pReqFsyr);
			cmd.addParameter("@P_REQ_USER", pReqUser);
			cmd.addParameter("@P_REQ_COUNT", NNumber.class);
				
			cmd.execute();
			pReqCount.val = cmd.getParameterValue("@P_REQ_COUNT", NNumber.class);


		}
		
		public static void pSetBatchDate() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FZPUSAS.P_SET_BATCH_DATE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pUpdateFeedInd(NString pBdoc) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FZPUSAS.P_UPDATE_FEED_IND", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_BDOC", pBdoc);
				
			cmd.execute();


		}
		
		public static void pUsasUpca(NString pUpcaCoas,NString pUpcaFsyr,NString pUpcaFund,NString pUpcaOrgn,NString pUpcaProg,Ref<NString> gUpca,Ref<NString> gNacubo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FZPUSAS.P_USAS_UPCA", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_UPCA_COAS", pUpcaCoas);
			cmd.addParameter("@P_UPCA_FSYR", pUpcaFsyr);
			cmd.addParameter("@P_UPCA_FUND", pUpcaFund);
			cmd.addParameter("@P_UPCA_ORGN", pUpcaOrgn);
			cmd.addParameter("@P_UPCA_PROG", pUpcaProg);
			cmd.addParameter("@G_UPCA", NString.class);
			cmd.addParameter("@G_NACUBO", NString.class);
				
			cmd.execute();
			gUpca.val = cmd.getParameterValue("@G_UPCA", NString.class);
			gNacubo.val = cmd.getParameterValue("@G_NACUBO", NString.class);


		}
		
	
	
	
}
