package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class FbPcardHeaderRules {
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_PCARD_HEADER_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NString pFabinvtSystemId,NString pFabinvtSystemTimeStamp,NNumber pFabinvtTranNum,NString pFabinvtCardTypeCode,NString pFabinvtCardCode,NString pFabinvtCampusCode,NString pFabinvtFeedInd,NString pFabinvtUserId,NNumber pFabinvtCardholderPidm,NString pFabinvtDrCrInd,NNumber pFabinvtOrigTransAmt,NString pFabinvtTransRefNum,NString pFabinvtVendName,NString pFabinvtVendStreet1,NString pFabinvtVendStreet2,NString pFabinvtVendStreet3,NString pFabinvtVendCity,NString pFabinvtVendState,NString pFabinvtVendZip,NString pFabinvtVendNatn,NString pFabinvtSicCode,NDate pFabinvtInvoiceDate,NDate pFabinvtBankPostDate,NDate pFabinvtFeedSweepDate,NDate pFabinvtPmtDueDate,NNumber pFabinvtVendPidm,NNumber pFabinvtVendCheckPidm,NString pFabinvtVendAtypCode,NNumber pFabinvtVendAtypSeqno,NString pFabinvtTransTypeCode,NString pFabinvtMerchantCode,NString pFabinvtFeedDocCode,NString pFabinvtCommodityCode,NString pFabinvtCommodityDescNotes,NString pFabinvtJvDocNum,NString pFabinvtVendHouseNumber,NString pFabinvtVendStreet4,NString pFabinvtProcessModuleCde,NNumber pFabinvtReconcileDocSeq,NString pFabinvtAddlInformation,NString pFabinvtTravelAuthDoc,NString pFabinvtTravelRembDoc,NString pFabinvtStatusCde,NString pFabinvtReasonCde,NNumber pFabinvtSurrogateId,NString pFabinvtDataOrigin,NNumber pFabinvtVersion,NString pFabinvtVpdiCode,NString pFabinvtEmailNotifyCde,NNumber pFabinvtResolveGroupNum,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_PCARD_HEADER_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_FABINVT_SYSTEM_ID", pFabinvtSystemId);
			cmd.addParameter("@P_FABINVT_SYSTEM_TIME_STAMP", pFabinvtSystemTimeStamp);
			cmd.addParameter("@P_FABINVT_TRAN_NUM", pFabinvtTranNum);
			cmd.addParameter("@P_FABINVT_CARD_TYPE_CODE", pFabinvtCardTypeCode);
			cmd.addParameter("@P_FABINVT_CARD_CODE", pFabinvtCardCode);
			cmd.addParameter("@P_FABINVT_CAMPUS_CODE", pFabinvtCampusCode);
			cmd.addParameter("@P_FABINVT_FEED_IND", pFabinvtFeedInd);
			cmd.addParameter("@P_FABINVT_USER_ID", pFabinvtUserId);
			cmd.addParameter("@P_FABINVT_CARDHOLDER_PIDM", pFabinvtCardholderPidm);
			cmd.addParameter("@P_FABINVT_DR_CR_IND", pFabinvtDrCrInd);
			cmd.addParameter("@P_FABINVT_ORIG_TRANS_AMT", pFabinvtOrigTransAmt);
			cmd.addParameter("@P_FABINVT_TRANS_REF_NUM", pFabinvtTransRefNum);
			cmd.addParameter("@P_FABINVT_VEND_NAME", pFabinvtVendName);
			cmd.addParameter("@P_FABINVT_VEND_STREET1", pFabinvtVendStreet1);
			cmd.addParameter("@P_FABINVT_VEND_STREET2", pFabinvtVendStreet2);
			cmd.addParameter("@P_FABINVT_VEND_STREET3", pFabinvtVendStreet3);
			cmd.addParameter("@P_FABINVT_VEND_CITY", pFabinvtVendCity);
			cmd.addParameter("@P_FABINVT_VEND_STATE", pFabinvtVendState);
			cmd.addParameter("@P_FABINVT_VEND_ZIP", pFabinvtVendZip);
			cmd.addParameter("@P_FABINVT_VEND_NATN", pFabinvtVendNatn);
			cmd.addParameter("@P_FABINVT_SIC_CODE", pFabinvtSicCode);
			cmd.addParameter("@P_FABINVT_INVOICE_DATE", pFabinvtInvoiceDate);
			cmd.addParameter("@P_FABINVT_BANK_POST_DATE", pFabinvtBankPostDate);
			cmd.addParameter("@P_FABINVT_FEED_SWEEP_DATE", pFabinvtFeedSweepDate);
			cmd.addParameter("@P_FABINVT_PMT_DUE_DATE", pFabinvtPmtDueDate);
			cmd.addParameter("@P_FABINVT_VEND_PIDM", pFabinvtVendPidm);
			cmd.addParameter("@P_FABINVT_VEND_CHECK_PIDM", pFabinvtVendCheckPidm);
			cmd.addParameter("@P_FABINVT_VEND_ATYP_CODE", pFabinvtVendAtypCode);
			cmd.addParameter("@P_FABINVT_VEND_ATYP_SEQNO", pFabinvtVendAtypSeqno);
			cmd.addParameter("@P_FABINVT_TRANS_TYPE_CODE", pFabinvtTransTypeCode);
			cmd.addParameter("@P_FABINVT_MERCHANT_CODE", pFabinvtMerchantCode);
			cmd.addParameter("@P_FABINVT_FEED_DOC_CODE", pFabinvtFeedDocCode);
			cmd.addParameter("@P_FABINVT_COMMODITY_CODE", pFabinvtCommodityCode);
			cmd.addParameter("@P_FABINVT_COMMODITY_DESC_NOTES", pFabinvtCommodityDescNotes);
			cmd.addParameter("@P_FABINVT_JV_DOC_NUM", pFabinvtJvDocNum);
			cmd.addParameter("@P_FABINVT_VEND_HOUSE_NUMBER", pFabinvtVendHouseNumber);
			cmd.addParameter("@P_FABINVT_VEND_STREET4", pFabinvtVendStreet4);
			cmd.addParameter("@P_FABINVT_PROCESS_MODULE_CDE", pFabinvtProcessModuleCde);
			cmd.addParameter("@P_FABINVT_RECONCILE_DOC_SEQ", pFabinvtReconcileDocSeq);
			cmd.addParameter("@P_FABINVT_ADDL_INFORMATION", pFabinvtAddlInformation);
			cmd.addParameter("@P_FABINVT_TRAVEL_AUTH_DOC", pFabinvtTravelAuthDoc);
			cmd.addParameter("@P_FABINVT_TRAVEL_REMB_DOC", pFabinvtTravelRembDoc);
			cmd.addParameter("@P_FABINVT_STATUS_CDE", pFabinvtStatusCde);
			cmd.addParameter("@P_FABINVT_REASON_CDE", pFabinvtReasonCde);
			cmd.addParameter("@P_FABINVT_SURROGATE_ID", pFabinvtSurrogateId);
			cmd.addParameter("@P_FABINVT_DATA_ORIGIN", pFabinvtDataOrigin);
			cmd.addParameter("@P_FABINVT_VERSION", pFabinvtVersion);
			cmd.addParameter("@P_FABINVT_VPDI_CODE", pFabinvtVpdiCode);
			cmd.addParameter("@P_FABINVT_EMAIL_NOTIFY_CDE", pFabinvtEmailNotifyCde);
			cmd.addParameter("@P_FABINVT_RESOLVE_GROUP_NUM", pFabinvtResolveGroupNum);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NString pFabinvtSystemId,NString pFabinvtSystemTimeStamp,NNumber pFabinvtTranNum,NString pFabinvtCardTypeCode,NString pFabinvtCardCode,NString pFabinvtCampusCode,NString pFabinvtFeedInd,NString pFabinvtUserId,NNumber pFabinvtCardholderPidm,NString pFabinvtDrCrInd,NNumber pFabinvtOrigTransAmt,NString pFabinvtTransRefNum,NString pFabinvtVendName,NString pFabinvtVendStreet1,NString pFabinvtVendStreet2,NString pFabinvtVendStreet3,NString pFabinvtVendCity,NString pFabinvtVendState,NString pFabinvtVendZip,NString pFabinvtVendNatn,NString pFabinvtSicCode,NDate pFabinvtInvoiceDate,NDate pFabinvtBankPostDate,NDate pFabinvtFeedSweepDate,NDate pFabinvtPmtDueDate,NNumber pFabinvtVendPidm,NNumber pFabinvtVendCheckPidm,NString pFabinvtVendAtypCode,NNumber pFabinvtVendAtypSeqno,NString pFabinvtTransTypeCode,NString pFabinvtMerchantCode,NString pFabinvtFeedDocCode,NString pFabinvtCommodityCode,NString pFabinvtCommodityDescNotes,NString pFabinvtJvDocNum,NString pFabinvtVendHouseNumber,NString pFabinvtVendStreet4,NString pFabinvtProcessModuleCde,NNumber pFabinvtReconcileDocSeq,NString pFabinvtAddlInformation,NString pFabinvtTravelAuthDoc,NString pFabinvtTravelRembDoc,NString pFabinvtStatusCde,NString pFabinvtReasonCde,NNumber pFabinvtSurrogateId,NString pFabinvtDataOrigin,NNumber pFabinvtVersion,NString pFabinvtVpdiCode,NString pFabinvtEmailNotifyCde,NNumber pFabinvtResolveGroupNum) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_PCARD_HEADER_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_FABINVT_SYSTEM_ID", pFabinvtSystemId);
			cmd.addParameter("@P_FABINVT_SYSTEM_TIME_STAMP", pFabinvtSystemTimeStamp);
			cmd.addParameter("@P_FABINVT_TRAN_NUM", pFabinvtTranNum);
			cmd.addParameter("@P_FABINVT_CARD_TYPE_CODE", pFabinvtCardTypeCode);
			cmd.addParameter("@P_FABINVT_CARD_CODE", pFabinvtCardCode);
			cmd.addParameter("@P_FABINVT_CAMPUS_CODE", pFabinvtCampusCode);
			cmd.addParameter("@P_FABINVT_FEED_IND", pFabinvtFeedInd);
			cmd.addParameter("@P_FABINVT_USER_ID", pFabinvtUserId);
			cmd.addParameter("@P_FABINVT_CARDHOLDER_PIDM", pFabinvtCardholderPidm);
			cmd.addParameter("@P_FABINVT_DR_CR_IND", pFabinvtDrCrInd);
			cmd.addParameter("@P_FABINVT_ORIG_TRANS_AMT", pFabinvtOrigTransAmt);
			cmd.addParameter("@P_FABINVT_TRANS_REF_NUM", pFabinvtTransRefNum);
			cmd.addParameter("@P_FABINVT_VEND_NAME", pFabinvtVendName);
			cmd.addParameter("@P_FABINVT_VEND_STREET1", pFabinvtVendStreet1);
			cmd.addParameter("@P_FABINVT_VEND_STREET2", pFabinvtVendStreet2);
			cmd.addParameter("@P_FABINVT_VEND_STREET3", pFabinvtVendStreet3);
			cmd.addParameter("@P_FABINVT_VEND_CITY", pFabinvtVendCity);
			cmd.addParameter("@P_FABINVT_VEND_STATE", pFabinvtVendState);
			cmd.addParameter("@P_FABINVT_VEND_ZIP", pFabinvtVendZip);
			cmd.addParameter("@P_FABINVT_VEND_NATN", pFabinvtVendNatn);
			cmd.addParameter("@P_FABINVT_SIC_CODE", pFabinvtSicCode);
			cmd.addParameter("@P_FABINVT_INVOICE_DATE", pFabinvtInvoiceDate);
			cmd.addParameter("@P_FABINVT_BANK_POST_DATE", pFabinvtBankPostDate);
			cmd.addParameter("@P_FABINVT_FEED_SWEEP_DATE", pFabinvtFeedSweepDate);
			cmd.addParameter("@P_FABINVT_PMT_DUE_DATE", pFabinvtPmtDueDate);
			cmd.addParameter("@P_FABINVT_VEND_PIDM", pFabinvtVendPidm);
			cmd.addParameter("@P_FABINVT_VEND_CHECK_PIDM", pFabinvtVendCheckPidm);
			cmd.addParameter("@P_FABINVT_VEND_ATYP_CODE", pFabinvtVendAtypCode);
			cmd.addParameter("@P_FABINVT_VEND_ATYP_SEQNO", pFabinvtVendAtypSeqno);
			cmd.addParameter("@P_FABINVT_TRANS_TYPE_CODE", pFabinvtTransTypeCode);
			cmd.addParameter("@P_FABINVT_MERCHANT_CODE", pFabinvtMerchantCode);
			cmd.addParameter("@P_FABINVT_FEED_DOC_CODE", pFabinvtFeedDocCode);
			cmd.addParameter("@P_FABINVT_COMMODITY_CODE", pFabinvtCommodityCode);
			cmd.addParameter("@P_FABINVT_COMMODITY_DESC_NOTES", pFabinvtCommodityDescNotes);
			cmd.addParameter("@P_FABINVT_JV_DOC_NUM", pFabinvtJvDocNum);
			cmd.addParameter("@P_FABINVT_VEND_HOUSE_NUMBER", pFabinvtVendHouseNumber);
			cmd.addParameter("@P_FABINVT_VEND_STREET4", pFabinvtVendStreet4);
			cmd.addParameter("@P_FABINVT_PROCESS_MODULE_CDE", pFabinvtProcessModuleCde);
			cmd.addParameter("@P_FABINVT_RECONCILE_DOC_SEQ", pFabinvtReconcileDocSeq);
			cmd.addParameter("@P_FABINVT_ADDL_INFORMATION", pFabinvtAddlInformation);
			cmd.addParameter("@P_FABINVT_TRAVEL_AUTH_DOC", pFabinvtTravelAuthDoc);
			cmd.addParameter("@P_FABINVT_TRAVEL_REMB_DOC", pFabinvtTravelRembDoc);
			cmd.addParameter("@P_FABINVT_STATUS_CDE", pFabinvtStatusCde);
			cmd.addParameter("@P_FABINVT_REASON_CDE", pFabinvtReasonCde);
			cmd.addParameter("@P_FABINVT_SURROGATE_ID", pFabinvtSurrogateId);
			cmd.addParameter("@P_FABINVT_DATA_ORIGIN", pFabinvtDataOrigin);
			cmd.addParameter("@P_FABINVT_VERSION", pFabinvtVersion);
			cmd.addParameter("@P_FABINVT_VPDI_CODE", pFabinvtVpdiCode);
			cmd.addParameter("@P_FABINVT_EMAIL_NOTIFY_CDE", pFabinvtEmailNotifyCde);
			cmd.addParameter("@P_FABINVT_RESOLVE_GROUP_NUM", pFabinvtResolveGroupNum);
				
			cmd.execute();


		}
		
	
	
	
}
