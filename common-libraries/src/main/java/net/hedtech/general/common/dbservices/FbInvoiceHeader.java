package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class FbInvoiceHeader {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_INVOICE_HEADER.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static void fConvertRectypeToRowtype() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_INVOICE_HEADER.F_CONVERT_RECTYPE_TO_ROWTYPE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static InvoiceHeaderRecRow fConvertRowtypeToRectype() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_INVOICE_HEADER.F_CONVERT_ROWTYPE_TO_RECTYPE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DbTypes.createStructType(InvoiceHeaderRecRow.class));
				
			cmd.execute();

			return cmd.getReturnValue(InvoiceHeaderRecRow.class);

		}
		
		public static NString fExists(NString pCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_INVOICE_HEADER.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_CODE", pCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NBool fExistsData(NString pCode,NString pRowid,Ref<InvoiceHeaderRecRow> pInvheadRecOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_INVOICE_HEADER.F_EXISTS_DATA", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@P_CODE", pCode);
			cmd.addParameter("@P_ROWID", pRowid);
			cmd.addParameter(DbTypes.createStructType("P_INVHEAD_REC_OUT", pInvheadRecOut.val, InvoiceHeaderRecRow.class));
				
			cmd.execute();
			pInvheadRecOut.val = cmd.getParameterValue("@P_INVHEAD_REC_OUT", InvoiceHeaderRecRow.class);

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NString fGenValidateInvoiceCode(NString pCode,NString pInvoicePrefixType) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_INVOICE_HEADER.F_GEN_VALIDATE_INVOICE_CODE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_CODE", pCode);
			cmd.addParameter("@P_INVOICE_PREFIX_TYPE", pInvoicePrefixType);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetCompleteInd(NString pCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_INVOICE_HEADER.F_GET_COMPLETE_IND", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_CODE", pCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(InvoiceHeaderRecRow recOne,InvoiceHeaderRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_INVOICE_HEADER.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, InvoiceHeaderRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, InvoiceHeaderRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_INVOICE_HEADER.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_INVOICE_HEADER.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NString pCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_INVOICE_HEADER.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_CODE", pCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NString pCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_INVOICE_HEADER.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_CODE", pCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static InvoiceHeaderRecRow fQueryOneRec(NString pCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_INVOICE_HEADER.F_QUERY_ONE_REC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DbTypes.createStructType(InvoiceHeaderRecRow.class));
			cmd.addParameter("@P_CODE", pCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(InvoiceHeaderRecRow.class);

		}
		
		public static NString fQueryOneString(NString pCode,NString pRowid,NString pSeparationChar) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_INVOICE_HEADER.F_QUERY_ONE_STRING", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_CODE", pCode);
			cmd.addParameter("@P_ROWID", pRowid);
			cmd.addParameter("@P_SEPARATION_CHAR", pSeparationChar);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pCreate(Ref<NString> pCode,NString pInvoicePrefixType,NString pPohdCode,NNumber pVendPidm,NString pUserId,NString pVendInvCode,NDate pInvoiceDate,NDate pPmtDueDate,NDate pTransDate,NString pCrMemoInd,NString pAdjtCode,NDate pAdjtDate,NString p1099Ind,NString p1099Id,NNumber pItypSeqCode,NString pDiscCode,NString pTratCode,NNumber pAddlChrgAmt,NString pHoldInd,NDate pPostDate,NString pAtypCode,NNumber pAtypSeqNum,NString pGroupingInd,NString pBankCode,NString pRuivInd,NString pEditDeferInd,NNumber pOverrideTaxAmt,NString pTgrpCode,NNumber pVendCheckPidm,NString pInvoiceTypeInd,NString pCurrCode,NString pDisbAgentInd,NString pAtypCodeVend,NNumber pAtypSeqNumVend,NString pNsfOnOffInd,NString pSingleAcctgInd,NString pOneTimeVendName,NString pOneTimeHouseNumber,NString pOneTimeVendAddr1,NString pOneTimeVendAddr2,NString pOneTimeVendAddr3,NString pOneTimeVendAddr4,NString pOneTimeVendCity,NString pOneTimeVendState,NString pOneTimeVendZip,NString pOneTimeVendNatn,NNumber pDeliveryPoint,NNumber pCorrectionDigit,NString pCarrierRoute,NString pRuivInstallmentInd,NString pMultipleInvInd,NString pPhoneArea,NString pPhoneNumber,NString pPhoneExt,NString pEmailAddr,NString pCtryCodeFax,NString pFaxArea,NString pFaxNumber,NString pFaxExt,NString pAttentionTo,NString pVendorContact,NString pAchOverrideInd,NString pAchtCode,NString pOriginCode,NString pMatchRequired,NString pDataOrigin,NString pCtryCodePhone,NString pVendHoldOvrdInd,NString pVendHoldOvrdUser,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_INVOICE_HEADER.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CODE", pCode, true);
			cmd.addParameter("@P_INVOICE_PREFIX_TYPE", pInvoicePrefixType);
			cmd.addParameter("@P_POHD_CODE", pPohdCode);
			cmd.addParameter("@P_VEND_PIDM", pVendPidm);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_VEND_INV_CODE", pVendInvCode);
			cmd.addParameter("@P_INVOICE_DATE", pInvoiceDate);
			cmd.addParameter("@P_PMT_DUE_DATE", pPmtDueDate);
			cmd.addParameter("@P_TRANS_DATE", pTransDate);
			cmd.addParameter("@P_CR_MEMO_IND", pCrMemoInd);
			cmd.addParameter("@P_ADJT_CODE", pAdjtCode);
			cmd.addParameter("@P_ADJT_DATE", pAdjtDate);
			cmd.addParameter("@P_1099_IND", p1099Ind);
			cmd.addParameter("@P_1099_ID", p1099Id);
			cmd.addParameter("@P_ITYP_SEQ_CODE", pItypSeqCode);
			cmd.addParameter("@P_DISC_CODE", pDiscCode);
			cmd.addParameter("@P_TRAT_CODE", pTratCode);
			cmd.addParameter("@P_ADDL_CHRG_AMT", pAddlChrgAmt);
			cmd.addParameter("@P_HOLD_IND", pHoldInd);
			cmd.addParameter("@P_POST_DATE", pPostDate);
			cmd.addParameter("@P_ATYP_CODE", pAtypCode);
			cmd.addParameter("@P_ATYP_SEQ_NUM", pAtypSeqNum);
			cmd.addParameter("@P_GROUPING_IND", pGroupingInd);
			cmd.addParameter("@P_BANK_CODE", pBankCode);
			cmd.addParameter("@P_RUIV_IND", pRuivInd);
			cmd.addParameter("@P_EDIT_DEFER_IND", pEditDeferInd);
			cmd.addParameter("@P_OVERRIDE_TAX_AMT", pOverrideTaxAmt);
			cmd.addParameter("@P_TGRP_CODE", pTgrpCode);
			cmd.addParameter("@P_VEND_CHECK_PIDM", pVendCheckPidm);
			cmd.addParameter("@P_INVOICE_TYPE_IND", pInvoiceTypeInd);
			cmd.addParameter("@P_CURR_CODE", pCurrCode);
			cmd.addParameter("@P_DISB_AGENT_IND", pDisbAgentInd);
			cmd.addParameter("@P_ATYP_CODE_VEND", pAtypCodeVend);
			cmd.addParameter("@P_ATYP_SEQ_NUM_VEND", pAtypSeqNumVend);
			cmd.addParameter("@P_NSF_ON_OFF_IND", pNsfOnOffInd);
			cmd.addParameter("@P_SINGLE_ACCTG_IND", pSingleAcctgInd);
			cmd.addParameter("@P_ONE_TIME_VEND_NAME", pOneTimeVendName);
			cmd.addParameter("@P_ONE_TIME_HOUSE_NUMBER", pOneTimeHouseNumber);
			cmd.addParameter("@P_ONE_TIME_VEND_ADDR1", pOneTimeVendAddr1);
			cmd.addParameter("@P_ONE_TIME_VEND_ADDR2", pOneTimeVendAddr2);
			cmd.addParameter("@P_ONE_TIME_VEND_ADDR3", pOneTimeVendAddr3);
			cmd.addParameter("@P_ONE_TIME_VEND_ADDR4", pOneTimeVendAddr4);
			cmd.addParameter("@P_ONE_TIME_VEND_CITY", pOneTimeVendCity);
			cmd.addParameter("@P_ONE_TIME_VEND_STATE", pOneTimeVendState);
			cmd.addParameter("@P_ONE_TIME_VEND_ZIP", pOneTimeVendZip);
			cmd.addParameter("@P_ONE_TIME_VEND_NATN", pOneTimeVendNatn);
			cmd.addParameter("@P_DELIVERY_POINT", pDeliveryPoint);
			cmd.addParameter("@P_CORRECTION_DIGIT", pCorrectionDigit);
			cmd.addParameter("@P_CARRIER_ROUTE", pCarrierRoute);
			cmd.addParameter("@P_RUIV_INSTALLMENT_IND", pRuivInstallmentInd);
			cmd.addParameter("@P_MULTIPLE_INV_IND", pMultipleInvInd);
			cmd.addParameter("@P_PHONE_AREA", pPhoneArea);
			cmd.addParameter("@P_PHONE_NUMBER", pPhoneNumber);
			cmd.addParameter("@P_PHONE_EXT", pPhoneExt);
			cmd.addParameter("@P_EMAIL_ADDR", pEmailAddr);
			cmd.addParameter("@P_CTRY_CODE_FAX", pCtryCodeFax);
			cmd.addParameter("@P_FAX_AREA", pFaxArea);
			cmd.addParameter("@P_FAX_NUMBER", pFaxNumber);
			cmd.addParameter("@P_FAX_EXT", pFaxExt);
			cmd.addParameter("@P_ATTENTION_TO", pAttentionTo);
			cmd.addParameter("@P_VENDOR_CONTACT", pVendorContact);
			cmd.addParameter("@P_ACH_OVERRIDE_IND", pAchOverrideInd);
			cmd.addParameter("@P_ACHT_CODE", pAchtCode);
			cmd.addParameter("@P_ORIGIN_CODE", pOriginCode);
			cmd.addParameter("@P_MATCH_REQUIRED", pMatchRequired);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_CTRY_CODE_PHONE", pCtryCodePhone);
			cmd.addParameter("@P_VEND_HOLD_OVRD_IND", pVendHoldOvrdInd);
			cmd.addParameter("@P_VEND_HOLD_OVRD_USER", pVendHoldOvrdUser);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pCode.val = cmd.getParameterValue("@P_CODE", NString.class);
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pCreateHeader(Ref<InvoiceHeaderRecRow> invoiceHeaderData,NString invoicePrefixType) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_INVOICE_HEADER.P_CREATE_HEADER", DbManager.getDataBaseFactory());
			
			cmd.addParameter(DbTypes.createStructType("INVOICE_HEADER_DATA", invoiceHeaderData.val, InvoiceHeaderRecRow.class, true));
			cmd.addParameter("@INVOICE_PREFIX_TYPE", invoicePrefixType);
				
			cmd.execute();
			invoiceHeaderData.val = cmd.getParameterValue("@INVOICE_HEADER_DATA", InvoiceHeaderRecRow.class);


		}
		
		public static void pDelete(NString pCode,NString pRowid,NString pUserId,Ref<NString> pDeleteMesgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_INVOICE_HEADER.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CODE", pCode);
			cmd.addParameter("@P_ROWID", pRowid);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DELETE_MESG_OUT", NString.class);
				
			cmd.execute();
			pDeleteMesgOut.val = cmd.getParameterValue("@P_DELETE_MESG_OUT", NString.class);


		}
		
		public static void pLock(NString pCode,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_INVOICE_HEADER.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CODE", pCode);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NString pCode,NString pPohdCode,NNumber pVendPidm,NString pOpenPaidInd,NString pUserId,NString pVendInvCode,NDate pInvoiceDate,NDate pPmtDueDate,NDate pTransDate,NString pCrMemoInd,NString pAdjtCode,NDate pAdjtDate,NString p1099Ind,NString p1099Id,NNumber pItypSeqCode,NString pApprInd,NString pCompleteInd,NString pDiscCode,NString pTratCode,NNumber pAddlChrgAmt,NString pHoldInd,NString pCancelInd,NDate pCancelDate,NDate pPostDate,NString pAtypCode,NNumber pAtypSeqNum,NString pGroupingInd,NString pBankCode,NString pRuivInd,NString pEditDeferInd,NNumber pOverrideTaxAmt,NString pTgrpCode,NNumber pSubmissionNumber,NNumber pVendCheckPidm,NString pCurrCode,NString pDisbAgentInd,NString pAtypCodeVend,NNumber pAtypSeqNumVend,NString pNsfOnOffInd,NString pSingleAcctgInd,NString pOneTimeVendName,NString pOneTimeHouseNumber,NString pOneTimeVendAddr1,NString pOneTimeVendAddr2,NString pOneTimeVendAddr3,NString pOneTimeVendAddr4,NString pOneTimeVendCity,NString pOneTimeVendState,NString pOneTimeVendZip,NString pOneTimeVendNatn,NNumber pDeliveryPoint,NNumber pCorrectionDigit,NString pCarrierRoute,NString pRuivInstallmentInd,NString pMultipleInvInd,NString pPhoneArea,NString pPhoneNumber,NString pPhoneExt,NString pEmailAddr,NString pCtryCodeFax,NString pFaxArea,NString pFaxNumber,NString pFaxExt,NString pCancelCode,NString pAttentionTo,NString pVendorContact,NString pInvdReEstablishInd,NString pAchOverrideInd,NString pAchtCode,NString pOriginCode,NString pMatchRequired,NString pDataOrigin,NString pCancelUser,NDate pCancelActivityDate,NString pCtryCodePhone,NString pVendHoldOvrdInd,NString pVendHoldOvrdUser,NString pRowid,NString pDefaultIfNull) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_INVOICE_HEADER.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CODE", pCode);
			cmd.addParameter("@P_POHD_CODE", pPohdCode);
			cmd.addParameter("@P_VEND_PIDM", pVendPidm);
			cmd.addParameter("@P_OPEN_PAID_IND", pOpenPaidInd);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_VEND_INV_CODE", pVendInvCode);
			cmd.addParameter("@P_INVOICE_DATE", pInvoiceDate);
			cmd.addParameter("@P_PMT_DUE_DATE", pPmtDueDate);
			cmd.addParameter("@P_TRANS_DATE", pTransDate);
			cmd.addParameter("@P_CR_MEMO_IND", pCrMemoInd);
			cmd.addParameter("@P_ADJT_CODE", pAdjtCode);
			cmd.addParameter("@P_ADJT_DATE", pAdjtDate);
			cmd.addParameter("@P_1099_IND", p1099Ind);
			cmd.addParameter("@P_1099_ID", p1099Id);
			cmd.addParameter("@P_ITYP_SEQ_CODE", pItypSeqCode);
			cmd.addParameter("@P_APPR_IND", pApprInd);
			cmd.addParameter("@P_COMPLETE_IND", pCompleteInd);
			cmd.addParameter("@P_DISC_CODE", pDiscCode);
			cmd.addParameter("@P_TRAT_CODE", pTratCode);
			cmd.addParameter("@P_ADDL_CHRG_AMT", pAddlChrgAmt);
			cmd.addParameter("@P_HOLD_IND", pHoldInd);
			cmd.addParameter("@P_CANCEL_IND", pCancelInd);
			cmd.addParameter("@P_CANCEL_DATE", pCancelDate);
			cmd.addParameter("@P_POST_DATE", pPostDate);
			cmd.addParameter("@P_ATYP_CODE", pAtypCode);
			cmd.addParameter("@P_ATYP_SEQ_NUM", pAtypSeqNum);
			cmd.addParameter("@P_GROUPING_IND", pGroupingInd);
			cmd.addParameter("@P_BANK_CODE", pBankCode);
			cmd.addParameter("@P_RUIV_IND", pRuivInd);
			cmd.addParameter("@P_EDIT_DEFER_IND", pEditDeferInd);
			cmd.addParameter("@P_OVERRIDE_TAX_AMT", pOverrideTaxAmt);
			cmd.addParameter("@P_TGRP_CODE", pTgrpCode);
			cmd.addParameter("@P_SUBMISSION_NUMBER", pSubmissionNumber);
			cmd.addParameter("@P_VEND_CHECK_PIDM", pVendCheckPidm);
			cmd.addParameter("@P_CURR_CODE", pCurrCode);
			cmd.addParameter("@P_DISB_AGENT_IND", pDisbAgentInd);
			cmd.addParameter("@P_ATYP_CODE_VEND", pAtypCodeVend);
			cmd.addParameter("@P_ATYP_SEQ_NUM_VEND", pAtypSeqNumVend);
			cmd.addParameter("@P_NSF_ON_OFF_IND", pNsfOnOffInd);
			cmd.addParameter("@P_SINGLE_ACCTG_IND", pSingleAcctgInd);
			cmd.addParameter("@P_ONE_TIME_VEND_NAME", pOneTimeVendName);
			cmd.addParameter("@P_ONE_TIME_HOUSE_NUMBER", pOneTimeHouseNumber);
			cmd.addParameter("@P_ONE_TIME_VEND_ADDR1", pOneTimeVendAddr1);
			cmd.addParameter("@P_ONE_TIME_VEND_ADDR2", pOneTimeVendAddr2);
			cmd.addParameter("@P_ONE_TIME_VEND_ADDR3", pOneTimeVendAddr3);
			cmd.addParameter("@P_ONE_TIME_VEND_ADDR4", pOneTimeVendAddr4);
			cmd.addParameter("@P_ONE_TIME_VEND_CITY", pOneTimeVendCity);
			cmd.addParameter("@P_ONE_TIME_VEND_STATE", pOneTimeVendState);
			cmd.addParameter("@P_ONE_TIME_VEND_ZIP", pOneTimeVendZip);
			cmd.addParameter("@P_ONE_TIME_VEND_NATN", pOneTimeVendNatn);
			cmd.addParameter("@P_DELIVERY_POINT", pDeliveryPoint);
			cmd.addParameter("@P_CORRECTION_DIGIT", pCorrectionDigit);
			cmd.addParameter("@P_CARRIER_ROUTE", pCarrierRoute);
			cmd.addParameter("@P_RUIV_INSTALLMENT_IND", pRuivInstallmentInd);
			cmd.addParameter("@P_MULTIPLE_INV_IND", pMultipleInvInd);
			cmd.addParameter("@P_PHONE_AREA", pPhoneArea);
			cmd.addParameter("@P_PHONE_NUMBER", pPhoneNumber);
			cmd.addParameter("@P_PHONE_EXT", pPhoneExt);
			cmd.addParameter("@P_EMAIL_ADDR", pEmailAddr);
			cmd.addParameter("@P_CTRY_CODE_FAX", pCtryCodeFax);
			cmd.addParameter("@P_FAX_AREA", pFaxArea);
			cmd.addParameter("@P_FAX_NUMBER", pFaxNumber);
			cmd.addParameter("@P_FAX_EXT", pFaxExt);
			cmd.addParameter("@P_CANCEL_CODE", pCancelCode);
			cmd.addParameter("@P_ATTENTION_TO", pAttentionTo);
			cmd.addParameter("@P_VENDOR_CONTACT", pVendorContact);
			cmd.addParameter("@P_INVD_RE_ESTABLISH_IND", pInvdReEstablishInd);
			cmd.addParameter("@P_ACH_OVERRIDE_IND", pAchOverrideInd);
			cmd.addParameter("@P_ACHT_CODE", pAchtCode);
			cmd.addParameter("@P_ORIGIN_CODE", pOriginCode);
			cmd.addParameter("@P_MATCH_REQUIRED", pMatchRequired);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_CANCEL_USER", pCancelUser);
			cmd.addParameter("@P_CANCEL_ACTIVITY_DATE", pCancelActivityDate);
			cmd.addParameter("@P_CTRY_CODE_PHONE", pCtryCodePhone);
			cmd.addParameter("@P_VEND_HOLD_OVRD_IND", pVendHoldOvrdInd);
			cmd.addParameter("@P_VEND_HOLD_OVRD_USER", pVendHoldOvrdUser);
			cmd.addParameter("@P_ROWID", pRowid);
			cmd.addParameter("@P_DEFAULT_IF_NULL", pDefaultIfNull);
				
			cmd.execute();


		}
		
		public static void pUpdateHeader(Ref<InvoiceHeaderRecRow> invoiceHeaderData,NString pDefaultIfNull) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_INVOICE_HEADER.P_UPDATE_HEADER", DbManager.getDataBaseFactory());
			
			cmd.addParameter(DbTypes.createStructType("INVOICE_HEADER_DATA", invoiceHeaderData.val, InvoiceHeaderRecRow.class, true));
			cmd.addParameter("@P_DEFAULT_IF_NULL", pDefaultIfNull);
				
			cmd.execute();
			invoiceHeaderData.val = cmd.getParameterValue("@INVOICE_HEADER_DATA", InvoiceHeaderRecRow.class);


		}
		
		public static void pUpdateInternal(NString pCheckCode,NString pBankCode,NString pUserId,NString pReestablishInd,NDate pCancelDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_INVOICE_HEADER.P_UPDATE_INTERNAL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CHECK_CODE", pCheckCode);
			cmd.addParameter("@P_BANK_CODE", pBankCode);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_REESTABLISH_IND", pReestablishInd);
			cmd.addParameter("@P_CANCEL_DATE", pCancelDate);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="InvoiceHeaderRecRow", dataSourceName="INVOICE_HEADER_REC")
	public static class InvoiceHeaderRecRow
	{
		@DbRecordField(dataSourceName="R_CODE")
		public NString RCode;
		@DbRecordField(dataSourceName="R_POHD_CODE")
		public NString RPohdCode;
		@DbRecordField(dataSourceName="R_VEND_PIDM")
		public NNumber RVendPidm;
		@DbRecordField(dataSourceName="R_OPEN_PAID_IND")
		public NString ROpenPaidInd;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_VEND_INV_CODE")
		public NString RVendInvCode;
		@DbRecordField(dataSourceName="R_INVOICE_DATE")
		public NDate RInvoiceDate;
		@DbRecordField(dataSourceName="R_PMT_DUE_DATE")
		public NDate RPmtDueDate;
		@DbRecordField(dataSourceName="R_TRANS_DATE")
		public NDate RTransDate;
		@DbRecordField(dataSourceName="R_CR_MEMO_IND")
		public NString RCrMemoInd;
		@DbRecordField(dataSourceName="R_ADJT_CODE")
		public NString RAdjtCode;
		@DbRecordField(dataSourceName="R_ADJT_DATE")
		public NDate RAdjtDate;
		@DbRecordField(dataSourceName="R_1099_IND")
		public NString R1099Ind;
		@DbRecordField(dataSourceName="R_1099_ID")
		public NString R1099Id;
		@DbRecordField(dataSourceName="R_ITYP_SEQ_CODE")
		public NNumber RItypSeqCode;
		@DbRecordField(dataSourceName="R_TEXT_IND")
		public NString RTextInd;
		@DbRecordField(dataSourceName="R_APPR_IND")
		public NString RApprInd;
		@DbRecordField(dataSourceName="R_COMPLETE_IND")
		public NString RCompleteInd;
		@DbRecordField(dataSourceName="R_DISC_CODE")
		public NString RDiscCode;
		@DbRecordField(dataSourceName="R_TRAT_CODE")
		public NString RTratCode;
		@DbRecordField(dataSourceName="R_ADDL_CHRG_AMT")
		public NNumber RAddlChrgAmt;
		@DbRecordField(dataSourceName="R_HOLD_IND")
		public NString RHoldInd;
		@DbRecordField(dataSourceName="R_SUSP_IND")
		public NString RSuspInd;
		@DbRecordField(dataSourceName="R_SUSP_IND_ADDL")
		public NString RSuspIndAddl;
		@DbRecordField(dataSourceName="R_CANCEL_IND")
		public NString RCancelInd;
		@DbRecordField(dataSourceName="R_CANCEL_DATE")
		public NDate RCancelDate;
		@DbRecordField(dataSourceName="R_POST_DATE")
		public NDate RPostDate;
		@DbRecordField(dataSourceName="R_ATYP_CODE")
		public NString RAtypCode;
		@DbRecordField(dataSourceName="R_ATYP_SEQ_NUM")
		public NNumber RAtypSeqNum;
		@DbRecordField(dataSourceName="R_GROUPING_IND")
		public NString RGroupingInd;
		@DbRecordField(dataSourceName="R_BANK_CODE")
		public NString RBankCode;
		@DbRecordField(dataSourceName="R_RUIV_IND")
		public NString RRuivInd;
		@DbRecordField(dataSourceName="R_EDIT_DEFER_IND")
		public NString REditDeferInd;
		@DbRecordField(dataSourceName="R_OVERRIDE_TAX_AMT")
		public NNumber ROverrideTaxAmt;
		@DbRecordField(dataSourceName="R_TGRP_CODE")
		public NString RTgrpCode;
		@DbRecordField(dataSourceName="R_SUBMISSION_NUMBER")
		public NNumber RSubmissionNumber;
		@DbRecordField(dataSourceName="R_VEND_CHECK_PIDM")
		public NNumber RVendCheckPidm;
		@DbRecordField(dataSourceName="R_INVOICE_TYPE_IND")
		public NString RInvoiceTypeInd;
		@DbRecordField(dataSourceName="R_CURR_CODE")
		public NString RCurrCode;
		@DbRecordField(dataSourceName="R_DISB_AGENT_IND")
		public NString RDisbAgentInd;
		@DbRecordField(dataSourceName="R_ATYP_CODE_VEND")
		public NString RAtypCodeVend;
		@DbRecordField(dataSourceName="R_ATYP_SEQ_NUM_VEND")
		public NNumber RAtypSeqNumVend;
		@DbRecordField(dataSourceName="R_NSF_ON_OFF_IND")
		public NString RNsfOnOffInd;
		@DbRecordField(dataSourceName="R_SINGLE_ACCTG_IND")
		public NString RSingleAcctgInd;
		@DbRecordField(dataSourceName="R_ONE_TIME_VEND_NAME")
		public NString ROneTimeVendName;
		@DbRecordField(dataSourceName="R_ONE_TIME_HOUSE_NUMBER")
		public NString ROneTimeHouseNumber;
		@DbRecordField(dataSourceName="R_ONE_TIME_VEND_ADDR1")
		public NString ROneTimeVendAddr1;
		@DbRecordField(dataSourceName="R_ONE_TIME_VEND_ADDR2")
		public NString ROneTimeVendAddr2;
		@DbRecordField(dataSourceName="R_ONE_TIME_VEND_ADDR3")
		public NString ROneTimeVendAddr3;
		@DbRecordField(dataSourceName="R_ONE_TIME_VEND_ADDR4")
		public NString ROneTimeVendAddr4;
		@DbRecordField(dataSourceName="R_ONE_TIME_VEND_CITY")
		public NString ROneTimeVendCity;
		@DbRecordField(dataSourceName="R_ONE_TIME_VEND_STATE")
		public NString ROneTimeVendState;
		@DbRecordField(dataSourceName="R_ONE_TIME_VEND_ZIP")
		public NString ROneTimeVendZip;
		@DbRecordField(dataSourceName="R_ONE_TIME_VEND_NATN")
		public NString ROneTimeVendNatn;
		@DbRecordField(dataSourceName="R_DELIVERY_POINT")
		public NNumber RDeliveryPoint;
		@DbRecordField(dataSourceName="R_CORRECTION_DIGIT")
		public NNumber RCorrectionDigit;
		@DbRecordField(dataSourceName="R_CARRIER_ROUTE")
		public NString RCarrierRoute;
		@DbRecordField(dataSourceName="R_RUIV_INSTALLMENT_IND")
		public NString RRuivInstallmentInd;
		@DbRecordField(dataSourceName="R_MULTIPLE_INV_IND")
		public NString RMultipleInvInd;
		@DbRecordField(dataSourceName="R_PHONE_AREA")
		public NString RPhoneArea;
		@DbRecordField(dataSourceName="R_PHONE_NUMBER")
		public NString RPhoneNumber;
		@DbRecordField(dataSourceName="R_PHONE_EXT")
		public NString RPhoneExt;
		@DbRecordField(dataSourceName="R_EMAIL_ADDR")
		public NString REmailAddr;
		@DbRecordField(dataSourceName="R_CTRY_CODE_FAX")
		public NString RCtryCodeFax;
		@DbRecordField(dataSourceName="R_FAX_AREA")
		public NString RFaxArea;
		@DbRecordField(dataSourceName="R_FAX_NUMBER")
		public NString RFaxNumber;
		@DbRecordField(dataSourceName="R_FAX_EXT")
		public NString RFaxExt;
		@DbRecordField(dataSourceName="R_CANCEL_CODE")
		public NString RCancelCode;
		@DbRecordField(dataSourceName="R_ATTENTION_TO")
		public NString RAttentionTo;
		@DbRecordField(dataSourceName="R_VENDOR_CONTACT")
		public NString RVendorContact;
		@DbRecordField(dataSourceName="R_INVD_RE_ESTABLISH_IND")
		public NString RInvdReEstablishInd;
		@DbRecordField(dataSourceName="R_ACH_OVERRIDE_IND")
		public NString RAchOverrideInd;
		@DbRecordField(dataSourceName="R_ACHT_CODE")
		public NString RAchtCode;
		@DbRecordField(dataSourceName="R_ORIGIN_CODE")
		public NString ROriginCode;
		@DbRecordField(dataSourceName="R_MATCH_REQUIRED")
		public NString RMatchRequired;
		@DbRecordField(dataSourceName="R_CREATE_USER")
		public NString RCreateUser;
		@DbRecordField(dataSourceName="R_CREATE_DATE")
		public NDate RCreateDate;
		@DbRecordField(dataSourceName="R_COMPLETE_USER")
		public NString RCompleteUser;
		@DbRecordField(dataSourceName="R_COMPLETE_DATE")
		public NDate RCompleteDate;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_CREATE_SOURCE")
		public NString RCreateSource;
		@DbRecordField(dataSourceName="R_CANCEL_USER")
		public NString RCancelUser;
		@DbRecordField(dataSourceName="R_CANCEL_ACTIVITY_DATE")
		public NDate RCancelActivityDate;
		@DbRecordField(dataSourceName="R_CTRY_CODE_PHONE")
		public NString RCtryCodePhone;
		@DbRecordField(dataSourceName="R_VEND_HOLD_OVRD_IND")
		public NString RVendHoldOvrdInd;
		@DbRecordField(dataSourceName="R_VEND_HOLD_OVRD_USER")
		public NString RVendHoldOvrdUser;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
