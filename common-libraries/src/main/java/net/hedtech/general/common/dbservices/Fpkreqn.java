package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Fpkreqn {
		public static DataCursor fFpbreqhRef(NString reqCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FPKREQN.F_FPBREQH_REF", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@REQ_CODE", reqCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fFprreqaRef(NString reqCode,NNumber reqItemNum,NNumber reqSeqNum) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FPKREQN.F_FPRREQA_REF", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@REQ_CODE", reqCode);
			cmd.addParameter("@REQ_ITEM_NUM", reqItemNum);
			cmd.addParameter("@REQ_SEQ_NUM", reqSeqNum);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fFprreqdRef(NString reqCode,NNumber reqItemNum) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FPKREQN.F_FPRREQD_REF", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@REQ_CODE", reqCode);
			cmd.addParameter("@REQ_ITEM_NUM", reqItemNum);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
//		public static void pCompleteReq(NString reqCode,Ref<List<Fpkutil.ErrorMesgTabtypeRow>> errorMesg,Ref<NString> successMesg,Ref<NString> finalReqCode,NBool genSeqnForEproc) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FPKREQN.P_COMPLETE_REQ", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@REQ_CODE", reqCode);
//			// cmd.addParameter(DbTypes.getTableType("ERROR_MESG", "", errorMesg.val, object.class , true));
//			cmd.addParameter("@SUCCESS_MESG", successMesg, true);
//			cmd.addParameter("@FINAL_REQ_CODE", NString.class);
//			cmd.addParameter("@GEN_SEQN_FOR_EPROC", genSeqnForEproc);
//				
//			cmd.execute();
//			// errorMesg.val = cmd.getTableParameterValue("@ERROR_MESG", object.class);
//			successMesg.val = cmd.getParameterValue("@SUCCESS_MESG", NString.class);
//			finalReqCode.val = cmd.getParameterValue("@FINAL_REQ_CODE", NString.class);
//
//
//		}
		
//		public static void pCreateAcctg(ReqAcctgentryRectypeRow reqAcctgEntry,Ref<List<Fpkutil.ErrorMesgTabtypeRow>> errorMesg,NString reqDocCode) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FPKREQN.P_CREATE_ACCTG", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter(DbTypes.createStructType("REQ_ACCTG_ENTRY", reqAcctgEntry, ReqAcctgentryRectypeRow.class ));
//			// cmd.addParameter(DbTypes.getTableType("ERROR_MESG", "", errorMesg.val, object.class , true));
//			cmd.addParameter("@REQ_DOC_CODE", reqDocCode);
//				
//			cmd.execute();
//			// errorMesg.val = cmd.getTableParameterValue("@ERROR_MESG", object.class);
//
//
//		}
		
//		public static void pCreateAcctg(ReqaAcctgentryRectypeRow reqaAcctgEntry,Ref<List<Fpkutil.ErrorMesgTabtypeRow>> errorMesg,NString reqDocCode) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FPKREQN.P_CREATE_ACCTG", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter(DbTypes.createStructType("REQA_ACCTG_ENTRY", reqaAcctgEntry, ReqaAcctgentryRectypeRow.class ));
//			// cmd.addParameter(DbTypes.getTableType("ERROR_MESG", "", errorMesg.val, object.class , true));
//			cmd.addParameter("@REQ_DOC_CODE", reqDocCode);
//				
//			cmd.execute();
//			// errorMesg.val = cmd.getTableParameterValue("@ERROR_MESG", object.class);
//
//
//		}
		
//		public static void pCreateHeader(ReqHeadentryRectypeRow reqHeadEntry,Ref<List<Fpkutil.ErrorMesgTabtypeRow>> errorMesg,Ref<NString> reqDocCode) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FPKREQN.P_CREATE_HEADER", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter(DbTypes.createStructType("REQ_HEAD_ENTRY", reqHeadEntry, ReqHeadentryRectypeRow.class ));
//			// cmd.addParameter(DbTypes.getTableType("ERROR_MESG", "", errorMesg.val, object.class , true));
//			cmd.addParameter("@REQ_DOC_CODE", reqDocCode, true);
//				
//			cmd.execute();
//			// errorMesg.val = cmd.getTableParameterValue("@ERROR_MESG", object.class);
//			reqDocCode.val = cmd.getParameterValue("@REQ_DOC_CODE", NString.class);
//
//
//		}
		
//		public static void pCreateHeader(ReqhHeadentryRectypeRow reqhHeadEntry,Ref<List<Fpkutil.ErrorMesgTabtypeRow>> errorMesg,Ref<NString> reqDocCode) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FPKREQN.P_CREATE_HEADER", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter(DbTypes.createStructType("REQH_HEAD_ENTRY", reqhHeadEntry, ReqhHeadentryRectypeRow.class ));
//			// cmd.addParameter(DbTypes.getTableType("ERROR_MESG", "", errorMesg.val, object.class , true));
//			cmd.addParameter("@REQ_DOC_CODE", reqDocCode, true);
//				
//			cmd.execute();
//			// errorMesg.val = cmd.getTableParameterValue("@ERROR_MESG", object.class);
//			reqDocCode.val = cmd.getParameterValue("@REQ_DOC_CODE", NString.class);
//
//
//		}
		
//		public static void pCreateItem(ReqdItemsentryRectypeRow reqdItemEntry,Ref<List<Fpkutil.ErrorMesgTabtypeRow>> errorMesg,NString reqDocCode) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FPKREQN.P_CREATE_ITEM", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter(DbTypes.createStructType("REQD_ITEM_ENTRY", reqdItemEntry, ReqdItemsentryRectypeRow.class ));
//			// cmd.addParameter(DbTypes.getTableType("ERROR_MESG", "", errorMesg.val, object.class , true));
//			cmd.addParameter("@REQ_DOC_CODE", reqDocCode);
//				
//			cmd.execute();
//			// errorMesg.val = cmd.getTableParameterValue("@ERROR_MESG", object.class);
//
//
//		}
		
//		public static void pCreateItem(ReqItemsentryRectypeRow reqItemEntry,Ref<List<Fpkutil.ErrorMesgTabtypeRow>> errorMesg,NString reqDocCode) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FPKREQN.P_CREATE_ITEM", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter(DbTypes.createStructType("REQ_ITEM_ENTRY", reqItemEntry, ReqItemsentryRectypeRow.class ));
//			// cmd.addParameter(DbTypes.getTableType("ERROR_MESG", "", errorMesg.val, object.class , true));
//			cmd.addParameter("@REQ_DOC_CODE", reqDocCode);
//				
//			cmd.execute();
//			// errorMesg.val = cmd.getTableParameterValue("@ERROR_MESG", object.class);
//
//
//		}
		
//		public static void pCreateReq(ReqHeadentryRectypeRow reqHeadentryRec,List<ReqItemsentryTabtypeRow> reqItemsentryTable,List<ReqAcctgentryTabtypeRow> reqAcctgentryTable,Ref<List<Fpkutil.ErrorMesgTabtypeRow>> errorMesgTable,Ref<NString> successMessage) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FPKREQN.P_CREATE_REQ", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter(DbTypes.createStructType("REQ_HEADENTRY_REC", reqHeadentryRec, ReqHeadentryRectypeRow.class ));
//			// cmd.addParameter(DbTypes.getCollectionType("REQ_ITEMSENTRY_TABLE", "", reqItemsentryTable, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("REQ_ACCTGENTRY_TABLE", "", reqAcctgentryTable, object.class));
//			// cmd.addParameter(DbTypes.getTableType("ERROR_MESG_TABLE", "", errorMesgTable.val, object.class , true));
//			cmd.addParameter("@SUCCESS_MESSAGE", successMessage, true);
//				
//			cmd.execute();
//			// errorMesgTable.val = cmd.getTableParameterValue("@ERROR_MESG_TABLE", object.class);
//			successMessage.val = cmd.getParameterValue("@SUCCESS_MESSAGE", NString.class);
//
//
//		}
		
//		public static void pScrubAcctg(ReqAcctgentryRectypeRow inReqAcctgRec,Ref<ReqaAcctgentryRectypeRow> outReqdaRec,Ref<List<Fpkutil.ErrorMesgTabtypeRow>> errorMesg) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FPKREQN.P_SCRUB_ACCTG", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter(DbTypes.createStructType("IN_REQ_ACCTG_REC", inReqAcctgRec, ReqAcctgentryRectypeRow.class ));
//			cmd.addParameter(DbTypes.createStructType("OUT_REQDA_REC", outReqdaRec.val, ReqaAcctgentryRectypeRow.class, true));
//			// cmd.addParameter(DbTypes.getTableType("ERROR_MESG", "", errorMesg.val, object.class , true));
//				
//			cmd.execute();
//			outReqdaRec.val = cmd.getParameterValue("@OUT_REQDA_REC", ReqaAcctgentryRectypeRow.class);
//			// errorMesg.val = cmd.getTableParameterValue("@ERROR_MESG", object.class);
//
//
//		}
		
//		public static void pScrubHeader(ReqHeadentryRectypeRow inReqHeadrec,Ref<ReqhHeadentryRectypeRow> outReqhHeadrec,Ref<List<Fpkutil.ErrorMesgTabtypeRow>> errorMesg) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FPKREQN.P_SCRUB_HEADER", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter(DbTypes.createStructType("IN_REQ_HEADREC", inReqHeadrec, ReqHeadentryRectypeRow.class ));
//			cmd.addParameter(DbTypes.createStructType("OUT_REQH_HEADREC", outReqhHeadrec.val, ReqhHeadentryRectypeRow.class, true));
//			// cmd.addParameter(DbTypes.getTableType("ERROR_MESG", "", errorMesg.val, object.class , true));
//				
//			cmd.execute();
//			outReqhHeadrec.val = cmd.getParameterValue("@OUT_REQH_HEADREC", ReqhHeadentryRectypeRow.class);
//			// errorMesg.val = cmd.getTableParameterValue("@ERROR_MESG", object.class);
//
//
//		}
		
//		public static void pScrubItem(ReqItemsentryRectypeRow inReqItemRec,Ref<ReqdItemsentryRectypeRow> outReqdtRec,Ref<List<Fpkutil.ErrorMesgTabtypeRow>> errorMesg) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FPKREQN.P_SCRUB_ITEM", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter(DbTypes.createStructType("IN_REQ_ITEM_REC", inReqItemRec, ReqItemsentryRectypeRow.class ));
//			cmd.addParameter(DbTypes.createStructType("OUT_REQDT_REC", outReqdtRec.val, ReqdItemsentryRectypeRow.class, true));
//			// cmd.addParameter(DbTypes.getTableType("ERROR_MESG", "", errorMesg.val, object.class , true));
//				
//			cmd.execute();
//			outReqdtRec.val = cmd.getParameterValue("@OUT_REQDT_REC", ReqdItemsentryRectypeRow.class);
//			// errorMesg.val = cmd.getTableParameterValue("@ERROR_MESG", object.class);
//
//
//		}
		
		public static void pValidateAcctg(ReqaAcctgentryRectypeRow reqaEntryRec) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FPKREQN.P_VALIDATE_ACCTG", DbManager.getDataBaseFactory());
			
			cmd.addParameter(DbTypes.createStructType("REQA_ENTRY_REC", reqaEntryRec, ReqaAcctgentryRectypeRow.class ));
				
			cmd.execute();


		}
		
		public static void pValidateHeader(ReqhHeadentryRectypeRow reqhHeaderData) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FPKREQN.P_VALIDATE_HEADER", DbManager.getDataBaseFactory());
			
			cmd.addParameter(DbTypes.createStructType("REQH_HEADER_DATA", reqhHeaderData, ReqhHeadentryRectypeRow.class ));
				
			cmd.execute();


		}
		
		public static void pValidateItem(ReqdItemsentryRectypeRow reqdEntryRec) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FPKREQN.P_VALIDATE_ITEM", DbManager.getDataBaseFactory());
			
			cmd.addParameter(DbTypes.createStructType("REQD_ENTRY_REC", reqdEntryRec, ReqdItemsentryRectypeRow.class ));
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="ReqAcctgentryRectypeRow", dataSourceName="REQ_ACCTGENTRY_RECTYPE")
	public static class ReqAcctgentryRectypeRow
	{
		@DbRecordField(dataSourceName="REQ_CODE")
		public NString ReqCode;
		@DbRecordField(dataSourceName="REQ_SEQITEM")
		public NString ReqSeqitem;
		@DbRecordField(dataSourceName="REQ_SEQNUM")
		public NString ReqSeqnum;
		@DbRecordField(dataSourceName="REQ_ACCTG_AMT")
		public NString ReqAcctgAmt;
		@DbRecordField(dataSourceName="REQ_DISC_AMT")
		public NString ReqDiscAmt;
		@DbRecordField(dataSourceName="REQ_TAX_AMT")
		public NString ReqTaxAmt;
		@DbRecordField(dataSourceName="REQ_ADDL_AMT")
		public NString ReqAddlAmt;
		@DbRecordField(dataSourceName="REQ_COAS")
		public NString ReqCoas;
		@DbRecordField(dataSourceName="REQ_ACCI")
		public NString ReqAcci;
		@DbRecordField(dataSourceName="REQ_FUND")
		public NString ReqFund;
		@DbRecordField(dataSourceName="REQ_ORGN")
		public NString ReqOrgn;
		@DbRecordField(dataSourceName="REQ_ACCT")
		public NString ReqAcct;
		@DbRecordField(dataSourceName="REQ_PROG")
		public NString ReqProg;
		@DbRecordField(dataSourceName="REQ_ACTV")
		public NString ReqActv;
		@DbRecordField(dataSourceName="REQ_LOCN")
		public NString ReqLocn;
		@DbRecordField(dataSourceName="REQ_NSF_OVERRIDE")
		public NString ReqNsfOverride;
		@DbRecordField(dataSourceName="REQ_PERCENT_DIST")
		public NString ReqPercentDist;
	}

	
	@DbRecordType(id="ReqHeadentryRectypeRow", dataSourceName="REQ_HEADENTRY_RECTYPE")
	public static class ReqHeadentryRectypeRow
	{
		@DbRecordField(dataSourceName="REQ_CODE")
		public NString ReqCode;
		@DbRecordField(dataSourceName="REQ_USERID")
		public NString ReqUserid;
		@DbRecordField(dataSourceName="REQ_ORDER_DATE")
		public NString ReqOrderDate;
		@DbRecordField(dataSourceName="REQ_TRANS_DATE")
		public NString ReqTransDate;
		@DbRecordField(dataSourceName="REQ_VEND_ID")
		public NString ReqVendId;
		@DbRecordField(dataSourceName="REQ_ADDR_TYPE")
		public NString ReqAddrType;
		@DbRecordField(dataSourceName="REQ_ADDR_SEQ_NO")
		public NString ReqAddrSeqNo;
		@DbRecordField(dataSourceName="REQ_DELIV_DATE")
		public NString ReqDelivDate;
		@DbRecordField(dataSourceName="REQ_COAS")
		public NString ReqCoas;
		@DbRecordField(dataSourceName="REQ_ORGN")
		public NString ReqOrgn;
		@DbRecordField(dataSourceName="REQ_SHIP_CODE")
		public NString ReqShipCode;
		@DbRecordField(dataSourceName="REQ_DISC_CODE")
		public NString ReqDiscCode;
		@DbRecordField(dataSourceName="REQ_PRINT_TEXT")
		public NString ReqPrintText;
		@DbRecordField(dataSourceName="REQ_NOPRINT_TEXT")
		public NString ReqNoprintText;
		@DbRecordField(dataSourceName="REQ_TGRP_CODE")
		public NString ReqTgrpCode;
		@DbRecordField(dataSourceName="REQ_CURR_CODE")
		public NString ReqCurrCode;
		@DbRecordField(dataSourceName="REQ_ACCTG_TYPE")
		public NString ReqAcctgType;
		@DbRecordField(dataSourceName="REQ_EMAIL_ADDR")
		public NString ReqEmailAddr;
		@DbRecordField(dataSourceName="REQ_FAX_AREA")
		public NString ReqFaxArea;
		@DbRecordField(dataSourceName="REQ_FAX_NUMBER")
		public NString ReqFaxNumber;
		@DbRecordField(dataSourceName="REQ_FAX_EXT")
		public NString ReqFaxExt;
		@DbRecordField(dataSourceName="REQ_ATTN_TO")
		public NString ReqAttnTo;
		@DbRecordField(dataSourceName="REQ_VEND_CONTACT")
		public NString ReqVendContact;
		@DbRecordField(dataSourceName="REQ_DELIV_COMMENT")
		public NString ReqDelivComment;
		@DbRecordField(dataSourceName="REQ_VEND_EMAIL")
		public NString ReqVendEmail;
		@DbRecordField(dataSourceName="REQ_REQUESTOR")
		public NString ReqRequestor;
		@DbRecordField(dataSourceName="REQ_PHONE_AREA")
		public NString ReqPhoneArea;
		@DbRecordField(dataSourceName="REQ_PHONE_NUM")
		public NString ReqPhoneNum;
		@DbRecordField(dataSourceName="REQ_PHONE_EXT")
		public NString ReqPhoneExt;
		@DbRecordField(dataSourceName="REQ_EDI_IND")
		public NString ReqEdiInd;
		@DbRecordField(dataSourceName="REQ_FTRM_CODE")
		public NString ReqFtrmCode;
		@DbRecordField(dataSourceName="REQ_ORIGIN")
		public NString ReqOrigin;
		@DbRecordField(dataSourceName="REQ_TYPE")
		public NString ReqType;
		@DbRecordField(dataSourceName="REQ_DOC_REF")
		public NString ReqDocRef;
		@DbRecordField(dataSourceName="REQ_CTRY_CODE_PHONE")
		public NString ReqCtryCodePhone;
		@DbRecordField(dataSourceName="REQ_CTRY_CODE_FAX")
		public NString ReqCtryCodeFax;
	}

	
	@DbRecordType(id="ReqItemsentryRectypeRow", dataSourceName="REQ_ITEMSENTRY_RECTYPE")
	public static class ReqItemsentryRectypeRow
	{
		@DbRecordField(dataSourceName="REQ_CODE")
		public NString ReqCode;
		@DbRecordField(dataSourceName="REQ_ITEMNUM")
		public NString ReqItemnum;
		@DbRecordField(dataSourceName="REQ_COMM_CODE")
		public NString ReqCommCode;
		@DbRecordField(dataSourceName="REQ_COMM_DESC")
		public NString ReqCommDesc;
		@DbRecordField(dataSourceName="REQ_UOM")
		public NString ReqUom;
		@DbRecordField(dataSourceName="REQ_UNIT_PRICE")
		public NString ReqUnitPrice;
		@DbRecordField(dataSourceName="REQ_QUANTITY")
		public NString ReqQuantity;
		@DbRecordField(dataSourceName="REQ_DISC_AMT")
		public NString ReqDiscAmt;
		@DbRecordField(dataSourceName="REQ_ADDL_AMT")
		public NString ReqAddlAmt;
		@DbRecordField(dataSourceName="REQ_TAX_AMT")
		public NString ReqTaxAmt;
		@DbRecordField(dataSourceName="REQ_TGRP_CODE")
		public NString ReqTgrpCode;
		@DbRecordField(dataSourceName="REQ_SHIP_CODE")
		public NString ReqShipCode;
		@DbRecordField(dataSourceName="REQ_DELIV_DATE")
		public NString ReqDelivDate;
		@DbRecordField(dataSourceName="REQ_PRINT_TEXT")
		public NString ReqPrintText;
		@DbRecordField(dataSourceName="REQ_NOPRINT_TEXT")
		public NString ReqNoprintText;
	}

	
	@DbRecordType(id="ReqaAcctgentryRectypeRow", dataSourceName="REQA_ACCTGENTRY_RECTYPE")
	public static class ReqaAcctgentryRectypeRow
	{
		@DbRecordField(dataSourceName="P_CODE")
		public NString PCode;
		@DbRecordField(dataSourceName="P_ITEM")
		public NNumber PItem;
		@DbRecordField(dataSourceName="P_SEQ_NUM")
		public NNumber PSeqNum;
		@DbRecordField(dataSourceName="P_AMT")
		public NNumber PAmt;
		@DbRecordField(dataSourceName="P_DISC_AMT")
		public NNumber PDiscAmt;
		@DbRecordField(dataSourceName="P_TAX_AMT")
		public NNumber PTaxAmt;
		@DbRecordField(dataSourceName="P_ADDL_CHRG_AMT")
		public NNumber PAddlChrgAmt;
		@DbRecordField(dataSourceName="P_COAS_CODE")
		public NString PCoasCode;
		@DbRecordField(dataSourceName="P_ACCI_CODE")
		public NString PAcciCode;
		@DbRecordField(dataSourceName="P_FUND_CODE")
		public NString PFundCode;
		@DbRecordField(dataSourceName="P_ORGN_CODE")
		public NString POrgnCode;
		@DbRecordField(dataSourceName="P_ACCT_CODE")
		public NString PAcctCode;
		@DbRecordField(dataSourceName="P_PROG_CODE")
		public NString PProgCode;
		@DbRecordField(dataSourceName="P_ACTV_CODE")
		public NString PActvCode;
		@DbRecordField(dataSourceName="P_LOCN_CODE")
		public NString PLocnCode;
		@DbRecordField(dataSourceName="P_PROJ_CODE")
		public NString PProjCode;
		@DbRecordField(dataSourceName="P_NSF_OVERRIDE_IND")
		public NString PNsfOverrideInd;
		@DbRecordField(dataSourceName="P_PCT")
		public NNumber PPct;
		@DbRecordField(dataSourceName="P_DISC_AMT_PCT")
		public NNumber PDiscAmtPct;
		@DbRecordField(dataSourceName="P_ADDL_AMT_PCT")
		public NNumber PAddlAmtPct;
		@DbRecordField(dataSourceName="P_TAX_AMT_PCT")
		public NNumber PTaxAmtPct;
	}

	
	@DbRecordType(id="ReqdItemsentryRectypeRow", dataSourceName="REQD_ITEMSENTRY_RECTYPE")
	public static class ReqdItemsentryRectypeRow
	{
		@DbRecordField(dataSourceName="P_CODE")
		public NString PCode;
		@DbRecordField(dataSourceName="P_ITEM")
		public NNumber PItem;
		@DbRecordField(dataSourceName="P_COMM_CODE")
		public NString PCommCode;
		@DbRecordField(dataSourceName="P_COMM_DESC")
		public NString PCommDesc;
		@DbRecordField(dataSourceName="P_UOMS_CODE")
		public NString PUomsCode;
		@DbRecordField(dataSourceName="P_UNIT_PRICE")
		public NNumber PUnitPrice;
		@DbRecordField(dataSourceName="P_QTY")
		public NNumber PQty;
		@DbRecordField(dataSourceName="P_DISC_AMT")
		public NNumber PDiscAmt;
		@DbRecordField(dataSourceName="P_ADDL_CHRG_AMT")
		public NNumber PAddlChrgAmt;
		@DbRecordField(dataSourceName="P_TAX_AMT")
		public NNumber PTaxAmt;
		@DbRecordField(dataSourceName="P_TGRP_CODE")
		public NString PTgrpCode;
		@DbRecordField(dataSourceName="P_SHIP_CODE")
		public NString PShipCode;
		@DbRecordField(dataSourceName="P_REQD_DATE")
		public NDate PReqdDate;
		@DbRecordField(dataSourceName="P_PRINT_TEXT")
		public NString PPrintText;
		@DbRecordField(dataSourceName="P_NOPRINT_TEXT")
		public NString PNoprintText;
	}

	
	@DbRecordType(id="ReqhHeadentryRectypeRow", dataSourceName="REQH_HEADENTRY_RECTYPE")
	public static class ReqhHeadentryRectypeRow
	{
		@DbRecordField(dataSourceName="P_CODE")
		public NString PCode;
		@DbRecordField(dataSourceName="P_USER_ID")
		public NString PUserId;
		@DbRecordField(dataSourceName="P_REQH_DATE")
		public NDate PReqhDate;
		@DbRecordField(dataSourceName="P_TRANS_DATE")
		public NDate PTransDate;
		@DbRecordField(dataSourceName="P_VENDOR_ID")
		public NString PVendorId;
		@DbRecordField(dataSourceName="P_ATYP_CODE")
		public NString PAtypCode;
		@DbRecordField(dataSourceName="P_ATYP_SEQ_NUM")
		public NNumber PAtypSeqNum;
		@DbRecordField(dataSourceName="P_REQD_DATE")
		public NDate PReqdDate;
		@DbRecordField(dataSourceName="P_COAS_CODE")
		public NString PCoasCode;
		@DbRecordField(dataSourceName="P_ORGN_CODE")
		public NString POrgnCode;
		@DbRecordField(dataSourceName="P_SHIP_CODE")
		public NString PShipCode;
		@DbRecordField(dataSourceName="P_DISC_CODE")
		public NString PDiscCode;
		@DbRecordField(dataSourceName="P_PRINT_TEXT")
		public NString PPrintText;
		@DbRecordField(dataSourceName="P_NOPRINT_TEXT")
		public NString PNoprintText;
		@DbRecordField(dataSourceName="P_TGRP_CODE")
		public NString PTgrpCode;
		@DbRecordField(dataSourceName="P_CURR_CODE")
		public NString PCurrCode;
		@DbRecordField(dataSourceName="P_SINGLE_ACCTG_IND")
		public NString PSingleAcctgInd;
		@DbRecordField(dataSourceName="P_EMAIL_ADDR")
		public NString PEmailAddr;
		@DbRecordField(dataSourceName="P_FAX_AREA")
		public NString PFaxArea;
		@DbRecordField(dataSourceName="P_FAX_NUMBER")
		public NString PFaxNumber;
		@DbRecordField(dataSourceName="P_FAX_EXT")
		public NString PFaxExt;
		@DbRecordField(dataSourceName="P_ATTENTION_TO")
		public NString PAttentionTo;
		@DbRecordField(dataSourceName="P_VENDOR_CONTACT")
		public NString PVendorContact;
		@DbRecordField(dataSourceName="P_DELIVERY_COMMENT")
		public NString PDeliveryComment;
		@DbRecordField(dataSourceName="P_VEND_EMAIL_ADDR")
		public NString PVendEmailAddr;
		@DbRecordField(dataSourceName="P_NAME")
		public NString PName;
		@DbRecordField(dataSourceName="P_PHONE_AREA")
		public NString PPhoneArea;
		@DbRecordField(dataSourceName="P_PHONE_NUM")
		public NString PPhoneNum;
		@DbRecordField(dataSourceName="P_PHONE_EXT")
		public NString PPhoneExt;
		@DbRecordField(dataSourceName="P_ORIGIN_CODE")
		public NString POriginCode;
		@DbRecordField(dataSourceName="P_RQST_TYPE_IND")
		public NString PRqstTypeInd;
		@DbRecordField(dataSourceName="P_DOC_REF_CODE")
		public NString PDocRefCode;
		@DbRecordField(dataSourceName="P_CTRY_CODE_PHONE")
		public NString PCtryCodePhone;
		@DbRecordField(dataSourceName="P_CTRY_CODE_FAX")
		public NString PCtryCodeFax;
	}

	
	
}
