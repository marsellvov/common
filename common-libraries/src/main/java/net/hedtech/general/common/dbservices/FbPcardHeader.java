package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class FbPcardHeader {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_PCARD_HEADER.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NString pFabinvtSystemId,NString pFabinvtSystemTimeStamp,NNumber pFabinvtTranNum,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_PCARD_HEADER.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_FABINVT_SYSTEM_ID", pFabinvtSystemId);
			cmd.addParameter("@P_FABINVT_SYSTEM_TIME_STAMP", pFabinvtSystemTimeStamp);
			cmd.addParameter("@P_FABINVT_TRAN_NUM", pFabinvtTranNum);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fExists(NNumber pFabinvtSurrogateId,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_PCARD_HEADER.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_FABINVT_SURROGATE_ID", pFabinvtSurrogateId);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(PcardHeaderRecRow recOne,PcardHeaderRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_PCARD_HEADER.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, PcardHeaderRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, PcardHeaderRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NString pFabinvtSystemId,NString pFabinvtSystemTimeStamp,NNumber pFabinvtTranNum,NString pFabinvtFeedInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_PCARD_HEADER.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_FABINVT_SYSTEM_ID", pFabinvtSystemId);
			cmd.addParameter("@P_FABINVT_SYSTEM_TIME_STAMP", pFabinvtSystemTimeStamp);
			cmd.addParameter("@P_FABINVT_TRAN_NUM", pFabinvtTranNum);
			cmd.addParameter("@P_FABINVT_FEED_IND", pFabinvtFeedInd);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByCard(NString pFabinvtCardTypeCode,NString pFabinvtCardCode,NString pFabinvtCampusCode,NString pFabinvtFeedInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_PCARD_HEADER.F_QUERY_BY_CARD", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_FABINVT_CARD_TYPE_CODE", pFabinvtCardTypeCode);
			cmd.addParameter("@P_FABINVT_CARD_CODE", pFabinvtCardCode);
			cmd.addParameter("@P_FABINVT_CAMPUS_CODE", pFabinvtCampusCode);
			cmd.addParameter("@P_FABINVT_FEED_IND", pFabinvtFeedInd);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByCardHolder(NNumber pFabinvtCardholderPidm,NString pFabinvtCardTypeCode,NString pFabinvtCardCode,NString pFabinvtCampusCode,NString pFabinvtFeedInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_PCARD_HEADER.F_QUERY_BY_CARD_HOLDER", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_FABINVT_CARDHOLDER_PIDM", pFabinvtCardholderPidm);
			cmd.addParameter("@P_FABINVT_CARD_TYPE_CODE", pFabinvtCardTypeCode);
			cmd.addParameter("@P_FABINVT_CARD_CODE", pFabinvtCardCode);
			cmd.addParameter("@P_FABINVT_CAMPUS_CODE", pFabinvtCampusCode);
			cmd.addParameter("@P_FABINVT_FEED_IND", pFabinvtFeedInd);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_PCARD_HEADER.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByTransRef(NString pFabinvtTransRefNum) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_PCARD_HEADER.F_QUERY_BY_TRANS_REF", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_FABINVT_TRANS_REF_NUM", pFabinvtTransRefNum);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryMultiple(NNumber pFabinvtCardholderPidm,NString pFabinvtCardTypeCode,NString pFabinvtCardCode,NString pFabinvtCampusCode,NNumber pFabinvtOrigTransAmt,NString pFabinvtTransRefNum,NString pFabinvtVendName,NString pFabinvtVendState,NString pFabinvtVendZip,NDate pFabinvtInvoiceDate,NDate pFabinvtBankPostDate,NString pFabinvtFeedInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_PCARD_HEADER.F_QUERY_MULTIPLE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_FABINVT_CARDHOLDER_PIDM", pFabinvtCardholderPidm);
			cmd.addParameter("@P_FABINVT_CARD_TYPE_CODE", pFabinvtCardTypeCode);
			cmd.addParameter("@P_FABINVT_CARD_CODE", pFabinvtCardCode);
			cmd.addParameter("@P_FABINVT_CAMPUS_CODE", pFabinvtCampusCode);
			cmd.addParameter("@P_FABINVT_ORIG_TRANS_AMT", pFabinvtOrigTransAmt);
			cmd.addParameter("@P_FABINVT_TRANS_REF_NUM", pFabinvtTransRefNum);
			cmd.addParameter("@P_FABINVT_VEND_NAME", pFabinvtVendName);
			cmd.addParameter("@P_FABINVT_VEND_STATE", pFabinvtVendState);
			cmd.addParameter("@P_FABINVT_VEND_ZIP", pFabinvtVendZip);
			cmd.addParameter("@P_FABINVT_INVOICE_DATE", pFabinvtInvoiceDate);
			cmd.addParameter("@P_FABINVT_BANK_POST_DATE", pFabinvtBankPostDate);
			cmd.addParameter("@P_FABINVT_FEED_IND", pFabinvtFeedInd);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NNumber pFabinvtSurrogateId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_PCARD_HEADER.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_FABINVT_SURROGATE_ID", pFabinvtSurrogateId);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NString pFabinvtSystemId,NString pFabinvtSystemTimeStamp,NNumber pFabinvtTranNum) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_PCARD_HEADER.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_FABINVT_SYSTEM_ID", pFabinvtSystemId);
			cmd.addParameter("@P_FABINVT_SYSTEM_TIME_STAMP", pFabinvtSystemTimeStamp);
			cmd.addParameter("@P_FABINVT_TRAN_NUM", pFabinvtTranNum);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NNumber pFabinvtSurrogateId,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_PCARD_HEADER.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_FABINVT_SURROGATE_ID", pFabinvtSurrogateId);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NString pFabinvtSystemId,NString pFabinvtSystemTimeStamp,NNumber pFabinvtTranNum,NString pFabinvtCardTypeCode,NString pFabinvtCardCode,NString pFabinvtCampusCode,NString pFabinvtFeedInd,NString pFabinvtUserId,NNumber pFabinvtCardholderPidm,NString pFabinvtDrCrInd,NNumber pFabinvtOrigTransAmt,NString pFabinvtTransRefNum,NString pFabinvtVendName,NString pFabinvtVendStreet1,NString pFabinvtVendStreet2,NString pFabinvtVendStreet3,NString pFabinvtVendCity,NString pFabinvtVendState,NString pFabinvtVendZip,NString pFabinvtVendNatn,NString pFabinvtSicCode,NDate pFabinvtInvoiceDate,NDate pFabinvtBankPostDate,NDate pFabinvtFeedSweepDate,NDate pFabinvtPmtDueDate,NNumber pFabinvtVendPidm,NNumber pFabinvtVendCheckPidm,NString pFabinvtVendAtypCode,NNumber pFabinvtVendAtypSeqno,NString pFabinvtTransTypeCode,NString pFabinvtMerchantCode,NString pFabinvtFeedDocCode,NString pFabinvtCommodityCode,NString pFabinvtCommodityDescNotes,NString pFabinvtJvDocNum,NString pFabinvtVendHouseNumber,NString pFabinvtVendStreet4,NString pFabinvtProcessModuleCde,NNumber pFabinvtReconcileDocSeq,NString pFabinvtAddlInformation,NString pFabinvtTravelAuthDoc,NString pFabinvtTravelRembDoc,NString pFabinvtStatusCde,NString pFabinvtReasonCde,NString pFabinvtDataOrigin,NString pFabinvtVpdiCode,NNumber pFabinvtVersion,NString pFabinvtEmailNotifyCde,NNumber pFabinvtResolveGroupNum,Ref<NNumber> pFabinvtSurrogateIdOut,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_PCARD_HEADER.P_CREATE", DbManager.getDataBaseFactory());
			
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
			cmd.addParameter("@P_FABINVT_DATA_ORIGIN", pFabinvtDataOrigin);
			cmd.addParameter("@P_FABINVT_VPDI_CODE", pFabinvtVpdiCode);
			cmd.addParameter("@P_FABINVT_VERSION", pFabinvtVersion);
			cmd.addParameter("@P_FABINVT_EMAIL_NOTIFY_CDE", pFabinvtEmailNotifyCde);
			cmd.addParameter("@P_FABINVT_RESOLVE_GROUP_NUM", pFabinvtResolveGroupNum);
			cmd.addParameter("@P_FABINVT_SURROGATE_ID_OUT", NNumber.class);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pFabinvtSurrogateIdOut.val = cmd.getParameterValue("@P_FABINVT_SURROGATE_ID_OUT", NNumber.class);
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NNumber pFabinvtSurrogateId,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_PCARD_HEADER.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_FABINVT_SURROGATE_ID", pFabinvtSurrogateId);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NNumber pFabinvtSurrogateId,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_PCARD_HEADER.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_FABINVT_SURROGATE_ID", pFabinvtSurrogateId);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NString pFabinvtSystemId,NString pFabinvtSystemTimeStamp,NNumber pFabinvtTranNum,NString pFabinvtCardTypeCode,NString pFabinvtCardCode,NString pFabinvtCampusCode,NString pFabinvtFeedInd,NString pFabinvtUserId,NNumber pFabinvtCardholderPidm,NString pFabinvtDrCrInd,NNumber pFabinvtOrigTransAmt,NString pFabinvtTransRefNum,NString pFabinvtVendName,NString pFabinvtVendStreet1,NString pFabinvtVendStreet2,NString pFabinvtVendStreet3,NString pFabinvtVendCity,NString pFabinvtVendState,NString pFabinvtVendZip,NString pFabinvtVendNatn,NString pFabinvtSicCode,NDate pFabinvtInvoiceDate,NDate pFabinvtBankPostDate,NDate pFabinvtFeedSweepDate,NDate pFabinvtPmtDueDate,NNumber pFabinvtVendPidm,NNumber pFabinvtVendCheckPidm,NString pFabinvtVendAtypCode,NNumber pFabinvtVendAtypSeqno,NString pFabinvtTransTypeCode,NString pFabinvtMerchantCode,NString pFabinvtFeedDocCode,NString pFabinvtCommodityCode,NString pFabinvtCommodityDescNotes,NString pFabinvtJvDocNum,NString pFabinvtVendHouseNumber,NString pFabinvtVendStreet4,NString pFabinvtProcessModuleCde,NNumber pFabinvtReconcileDocSeq,NString pFabinvtAddlInformation,NString pFabinvtTravelAuthDoc,NString pFabinvtTravelRembDoc,NString pFabinvtStatusCde,NString pFabinvtReasonCde,NNumber pFabinvtSurrogateId,NString pFabinvtDataOrigin,NNumber pFabinvtVersion,NString pFabinvtVpdiCode,NString pFabinvtEmailNotifyCde,NNumber pFabinvtResolveGroupNum,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_PCARD_HEADER.P_UPDATE", DbManager.getDataBaseFactory());
			
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
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="PcardHeaderRecRow", dataSourceName="PCARD_HEADER_REC")
	public static class PcardHeaderRecRow
	{
		@DbRecordField(dataSourceName="R_FABINVT_SYSTEM_ID")
		public NString RFabinvtSystemId;
		@DbRecordField(dataSourceName="R_FABINVT_SYSTEM_TIME_STAMP")
		public NString RFabinvtSystemTimeStamp;
		@DbRecordField(dataSourceName="R_FABINVT_TRAN_NUM")
		public NNumber RFabinvtTranNum;
		@DbRecordField(dataSourceName="R_FABINVT_CARD_TYPE_CODE")
		public NString RFabinvtCardTypeCode;
		@DbRecordField(dataSourceName="R_FABINVT_CARD_CODE")
		public NString RFabinvtCardCode;
		@DbRecordField(dataSourceName="R_FABINVT_CAMPUS_CODE")
		public NString RFabinvtCampusCode;
		@DbRecordField(dataSourceName="R_FABINVT_FEED_IND")
		public NString RFabinvtFeedInd;
		@DbRecordField(dataSourceName="R_FABINVT_USER_ID")
		public NString RFabinvtUserId;
		@DbRecordField(dataSourceName="R_FABINVT_CARDHOLDER_PIDM")
		public NNumber RFabinvtCardholderPidm;
		@DbRecordField(dataSourceName="R_FABINVT_DR_CR_IND")
		public NString RFabinvtDrCrInd;
		@DbRecordField(dataSourceName="R_FABINVT_ORIG_TRANS_AMT")
		public NNumber RFabinvtOrigTransAmt;
		@DbRecordField(dataSourceName="R_FABINVT_TRANS_REF_NUM")
		public NString RFabinvtTransRefNum;
		@DbRecordField(dataSourceName="R_FABINVT_VEND_NAME")
		public NString RFabinvtVendName;
		@DbRecordField(dataSourceName="R_FABINVT_VEND_STREET1")
		public NString RFabinvtVendStreet1;
		@DbRecordField(dataSourceName="R_FABINVT_VEND_STREET2")
		public NString RFabinvtVendStreet2;
		@DbRecordField(dataSourceName="R_FABINVT_VEND_STREET3")
		public NString RFabinvtVendStreet3;
		@DbRecordField(dataSourceName="R_FABINVT_VEND_CITY")
		public NString RFabinvtVendCity;
		@DbRecordField(dataSourceName="R_FABINVT_VEND_STATE")
		public NString RFabinvtVendState;
		@DbRecordField(dataSourceName="R_FABINVT_VEND_ZIP")
		public NString RFabinvtVendZip;
		@DbRecordField(dataSourceName="R_FABINVT_VEND_NATN")
		public NString RFabinvtVendNatn;
		@DbRecordField(dataSourceName="R_FABINVT_SIC_CODE")
		public NString RFabinvtSicCode;
		@DbRecordField(dataSourceName="R_FABINVT_INVOICE_DATE")
		public NDate RFabinvtInvoiceDate;
		@DbRecordField(dataSourceName="R_FABINVT_BANK_POST_DATE")
		public NDate RFabinvtBankPostDate;
		@DbRecordField(dataSourceName="R_FABINVT_FEED_SWEEP_DATE")
		public NDate RFabinvtFeedSweepDate;
		@DbRecordField(dataSourceName="R_FABINVT_PMT_DUE_DATE")
		public NDate RFabinvtPmtDueDate;
		@DbRecordField(dataSourceName="R_FABINVT_VEND_PIDM")
		public NNumber RFabinvtVendPidm;
		@DbRecordField(dataSourceName="R_FABINVT_VEND_CHECK_PIDM")
		public NNumber RFabinvtVendCheckPidm;
		@DbRecordField(dataSourceName="R_FABINVT_VEND_ATYP_CODE")
		public NString RFabinvtVendAtypCode;
		@DbRecordField(dataSourceName="R_FABINVT_VEND_ATYP_SEQNO")
		public NNumber RFabinvtVendAtypSeqno;
		@DbRecordField(dataSourceName="R_FABINVT_TRANS_TYPE_CODE")
		public NString RFabinvtTransTypeCode;
		@DbRecordField(dataSourceName="R_FABINVT_MERCHANT_CODE")
		public NString RFabinvtMerchantCode;
		@DbRecordField(dataSourceName="R_FABINVT_FEED_DOC_CODE")
		public NString RFabinvtFeedDocCode;
		@DbRecordField(dataSourceName="R_FABINVT_COMMODITY_CODE")
		public NString RFabinvtCommodityCode;
		@DbRecordField(dataSourceName="R_FABINVT_COMMODITY_DESC_NOTES")
		public NString RFabinvtCommodityDescNotes;
		@DbRecordField(dataSourceName="R_FABINVT_JV_DOC_NUM")
		public NString RFabinvtJvDocNum;
		@DbRecordField(dataSourceName="R_FABINVT_VEND_HOUSE_NUMBER")
		public NString RFabinvtVendHouseNumber;
		@DbRecordField(dataSourceName="R_FABINVT_VEND_STREET4")
		public NString RFabinvtVendStreet4;
		@DbRecordField(dataSourceName="R_FABINVT_PROCESS_MODULE_CDE")
		public NString RFabinvtProcessModuleCde;
		@DbRecordField(dataSourceName="R_FABINVT_RECONCILE_DOC_SEQ")
		public NNumber RFabinvtReconcileDocSeq;
		@DbRecordField(dataSourceName="R_FABINVT_ADDL_INFORMATION")
		public NString RFabinvtAddlInformation;
		@DbRecordField(dataSourceName="R_FABINVT_TRAVEL_AUTH_DOC")
		public NString RFabinvtTravelAuthDoc;
		@DbRecordField(dataSourceName="R_FABINVT_TRAVEL_REMB_DOC")
		public NString RFabinvtTravelRembDoc;
		@DbRecordField(dataSourceName="R_FABINVT_STATUS_CDE")
		public NString RFabinvtStatusCde;
		@DbRecordField(dataSourceName="R_FABINVT_REASON_CDE")
		public NString RFabinvtReasonCde;
		@DbRecordField(dataSourceName="R_FABINVT_SURROGATE_ID")
		public NNumber RFabinvtSurrogateId;
		@DbRecordField(dataSourceName="R_FABINVT_DATA_ORIGIN")
		public NString RFabinvtDataOrigin;
		@DbRecordField(dataSourceName="R_FABINVT_VERSION")
		public NNumber RFabinvtVersion;
		@DbRecordField(dataSourceName="R_FABINVT_VPDI_CODE")
		public NString RFabinvtVpdiCode;
		@DbRecordField(dataSourceName="R_FABINVT_EMAIL_NOTIFY_CDE")
		public NString RFabinvtEmailNotifyCde;
		@DbRecordField(dataSourceName="R_FABINVT_RESOLVE_GROUP_NUM")
		public NNumber RFabinvtResolveGroupNum;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
