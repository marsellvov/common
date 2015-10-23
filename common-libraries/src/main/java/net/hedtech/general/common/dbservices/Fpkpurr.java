package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Fpkpurr {
		public static DataCursor fFpbpohdRef(NString poCode,NNumber poChangeSeqNum) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FPKPURR.F_FPBPOHD_REF", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@PO_CODE", poCode);
			cmd.addParameter("@PO_CHANGE_SEQ_NUM", poChangeSeqNum);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fFprpodaRef(NString poCode,NNumber poChangeSeqNum,NNumber poItemNum,NNumber poSeqNum) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FPKPURR.F_FPRPODA_REF", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@PO_CODE", poCode);
			cmd.addParameter("@PO_CHANGE_SEQ_NUM", poChangeSeqNum);
			cmd.addParameter("@PO_ITEM_NUM", poItemNum);
			cmd.addParameter("@PO_SEQ_NUM", poSeqNum);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fFprpodtRef(NString poCode,NNumber poChangeSeqNum,NNumber poItemNum) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FPKPURR.F_FPRPODT_REF", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@PO_CODE", poCode);
			cmd.addParameter("@PO_CHANGE_SEQ_NUM", poChangeSeqNum);
			cmd.addParameter("@PO_ITEM_NUM", poItemNum);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pChangeOrderInProcess(NString poCode,Ref<NString> failureMesg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FPKPURR.P_CHANGE_ORDER_IN_PROCESS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PO_CODE", poCode);
			cmd.addParameter("@FAILURE_MESG", failureMesg, true);
				
			cmd.execute();
			failureMesg.val = cmd.getParameterValue("@FAILURE_MESG", NString.class);


		}
		
		public static void pCheckVendorPoHold(NNumber pVendPidm,NString pUserId,NDate pEffDate,Ref<NString> pInOutErrType,Ref<NString> pInOutErrMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FPKPURR.P_CHECK_VENDOR_PO_HOLD", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_VEND_PIDM", pVendPidm);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_EFF_DATE", pEffDate);
			cmd.addParameter("@P_IN_OUT_ERR_TYPE", pInOutErrType, true);
			cmd.addParameter("@P_IN_OUT_ERR_MSG", pInOutErrMsg, true);
				
			cmd.execute();
			pInOutErrType.val = cmd.getParameterValue("@P_IN_OUT_ERR_TYPE", NString.class);
			pInOutErrMsg.val = cmd.getParameterValue("@P_IN_OUT_ERR_MSG", NString.class);


		}
		
//		public static void pCompletePo(NString poCode,NNumber poChangeSeqNum,Ref<List<Fpkutil.ErrorMesgTabtypeRow>> errorMesg,Ref<NString> successMesg,Ref<NString> finalPoCode,NBool genSeqnForEproc) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FPKPURR.P_COMPLETE_PO", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@PO_CODE", poCode);
//			cmd.addParameter("@PO_CHANGE_SEQ_NUM", poChangeSeqNum);
//			// cmd.addParameter(DbTypes.getTableType("ERROR_MESG", "", errorMesg.val, object.class , true));
//			cmd.addParameter("@SUCCESS_MESG", successMesg, true);
//			cmd.addParameter("@FINAL_PO_CODE", NString.class);
//			cmd.addParameter("@GEN_SEQN_FOR_EPROC", genSeqnForEproc);
//				
//			cmd.execute();
//			// errorMesg.val = cmd.getTableParameterValue("@ERROR_MESG", object.class);
//			successMesg.val = cmd.getParameterValue("@SUCCESS_MESG", NString.class);
//			finalPoCode.val = cmd.getParameterValue("@FINAL_PO_CODE", NString.class);
//
//
//		}
		
//		public static void pCreateAcctg(PoAcctgentryRectypeRow poAcctgEntry,Ref<List<Fpkutil.ErrorMesgTabtypeRow>> errorMesg,NString poDocCode,NNumber poChangeSeqNum,NString poDataChanged) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FPKPURR.P_CREATE_ACCTG", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter(DbTypes.createStructType("PO_ACCTG_ENTRY", poAcctgEntry, PoAcctgentryRectypeRow.class ));
//			// cmd.addParameter(DbTypes.getTableType("ERROR_MESG", "", errorMesg.val, object.class , true));
//			cmd.addParameter("@PO_DOC_CODE", poDocCode);
//			cmd.addParameter("@PO_CHANGE_SEQ_NUM", poChangeSeqNum);
//			cmd.addParameter("@PO_DATA_CHANGED", poDataChanged);
//				
//			cmd.execute();
//			// errorMesg.val = cmd.getTableParameterValue("@ERROR_MESG", object.class);
//
//
//		}
		
//		public static void pCreateAcctg(PodaAcctgentryRectypeRow podaAcctgEntry,Ref<List<Fpkutil.ErrorMesgTabtypeRow>> errorMesg,NString poDocCode,NNumber poChangeSeqNum,NString poDataChanged) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FPKPURR.P_CREATE_ACCTG", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter(DbTypes.createStructType("PODA_ACCTG_ENTRY", podaAcctgEntry, PodaAcctgentryRectypeRow.class ));
//			// cmd.addParameter(DbTypes.getTableType("ERROR_MESG", "", errorMesg.val, object.class , true));
//			cmd.addParameter("@PO_DOC_CODE", poDocCode);
//			cmd.addParameter("@PO_CHANGE_SEQ_NUM", poChangeSeqNum);
//			cmd.addParameter("@PO_DATA_CHANGED", poDataChanged);
//				
//			cmd.execute();
//			// errorMesg.val = cmd.getTableParameterValue("@ERROR_MESG", object.class);
//
//
//		}
		
//		public static void pCreateHeader(PoHeadentryRectypeRow poHeadEntry,Ref<List<Fpkutil.ErrorMesgTabtypeRow>> errorMesg,Ref<NString> poDocCode,Ref<NNumber> poChangeSeqNum) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FPKPURR.P_CREATE_HEADER", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter(DbTypes.createStructType("PO_HEAD_ENTRY", poHeadEntry, PoHeadentryRectypeRow.class ));
//			// cmd.addParameter(DbTypes.getTableType("ERROR_MESG", "", errorMesg.val, object.class , true));
//			cmd.addParameter("@PO_DOC_CODE", poDocCode, true);
//			cmd.addParameter("@PO_CHANGE_SEQ_NUM", poChangeSeqNum, true);
//				
//			cmd.execute();
//			// errorMesg.val = cmd.getTableParameterValue("@ERROR_MESG", object.class);
//			poDocCode.val = cmd.getParameterValue("@PO_DOC_CODE", NString.class);
//			poChangeSeqNum.val = cmd.getParameterValue("@PO_CHANGE_SEQ_NUM", NNumber.class);
//
//
//		}
		
//		public static void pCreateHeader(PohdHeadentryRectypeRow pohdHeadEntry,Ref<List<Fpkutil.ErrorMesgTabtypeRow>> errorMesg,Ref<NString> poDocCode,Ref<NNumber> poChangeSeqNum) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FPKPURR.P_CREATE_HEADER", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter(DbTypes.createStructType("POHD_HEAD_ENTRY", pohdHeadEntry, PohdHeadentryRectypeRow.class ));
//			// cmd.addParameter(DbTypes.getTableType("ERROR_MESG", "", errorMesg.val, object.class , true));
//			cmd.addParameter("@PO_DOC_CODE", poDocCode, true);
//			cmd.addParameter("@PO_CHANGE_SEQ_NUM", poChangeSeqNum, true);
//				
//			cmd.execute();
//			// errorMesg.val = cmd.getTableParameterValue("@ERROR_MESG", object.class);
//			poDocCode.val = cmd.getParameterValue("@PO_DOC_CODE", NString.class);
//			poChangeSeqNum.val = cmd.getParameterValue("@PO_CHANGE_SEQ_NUM", NNumber.class);
//
//
//		}
		
//		public static void pCreateItem(PodtItemsentryRectypeRow podtItemEntry,Ref<List<Fpkutil.ErrorMesgTabtypeRow>> errorMesg,NString poDocCode,NNumber poChangeSeqNum,NString poDataChanged) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FPKPURR.P_CREATE_ITEM", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter(DbTypes.createStructType("PODT_ITEM_ENTRY", podtItemEntry, PodtItemsentryRectypeRow.class ));
//			// cmd.addParameter(DbTypes.getTableType("ERROR_MESG", "", errorMesg.val, object.class , true));
//			cmd.addParameter("@PO_DOC_CODE", poDocCode);
//			cmd.addParameter("@PO_CHANGE_SEQ_NUM", poChangeSeqNum);
//			cmd.addParameter("@PO_DATA_CHANGED", poDataChanged);
//				
//			cmd.execute();
//			// errorMesg.val = cmd.getTableParameterValue("@ERROR_MESG", object.class);
//
//
//		}
		
//		public static void pCreateItem(PoItemsentryRectypeRow poItemEntry,Ref<List<Fpkutil.ErrorMesgTabtypeRow>> errorMesg,NString poDocCode,NNumber poChangeSeqNum,NString poDataChanged) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FPKPURR.P_CREATE_ITEM", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter(DbTypes.createStructType("PO_ITEM_ENTRY", poItemEntry, PoItemsentryRectypeRow.class ));
//			// cmd.addParameter(DbTypes.getTableType("ERROR_MESG", "", errorMesg.val, object.class , true));
//			cmd.addParameter("@PO_DOC_CODE", poDocCode);
//			cmd.addParameter("@PO_CHANGE_SEQ_NUM", poChangeSeqNum);
//			cmd.addParameter("@PO_DATA_CHANGED", poDataChanged);
//				
//			cmd.execute();
//			// errorMesg.val = cmd.getTableParameterValue("@ERROR_MESG", object.class);
//
//
//		}
		
//		public static void pCreatePo(PoHeadentryRectypeRow poHeadentryRec,List<PoItemsentryTabtypeRow> poItemsentryTable,List<PoAcctgentryTabtypeRow> poAcctgentryTable,Ref<List<Fpkutil.ErrorMesgTabtypeRow>> errorMesgTable,Ref<NString> successMessage) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FPKPURR.P_CREATE_PO", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter(DbTypes.createStructType("PO_HEADENTRY_REC", poHeadentryRec, PoHeadentryRectypeRow.class ));
//			// cmd.addParameter(DbTypes.getCollectionType("PO_ITEMSENTRY_TABLE", "", poItemsentryTable, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("PO_ACCTGENTRY_TABLE", "", poAcctgentryTable, object.class));
//			// cmd.addParameter(DbTypes.getTableType("ERROR_MESG_TABLE", "", errorMesgTable.val, object.class , true));
//			cmd.addParameter("@SUCCESS_MESSAGE", successMessage, true);
//				
//			cmd.execute();
//			// errorMesgTable.val = cmd.getTableParameterValue("@ERROR_MESG_TABLE", object.class);
//			successMessage.val = cmd.getParameterValue("@SUCCESS_MESSAGE", NString.class);
//
//
//		}
		
		public static void pDeleteAcctg() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FPKPURR.P_DELETE_ACCTG", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pDeleteHeader() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FPKPURR.P_DELETE_HEADER", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pDeleteItem() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FPKPURR.P_DELETE_ITEM", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pPoCloseReq(NString reqCode,NNumber reqItemNum,NNumber reqSeqNum,NString fpbpohdSingleAcctgInd,NString pohdCode,Ref<NString> errorMesg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FPKPURR.P_PO_CLOSE_REQ", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@REQ_CODE", reqCode);
			cmd.addParameter("@REQ_ITEM_NUM", reqItemNum);
			cmd.addParameter("@REQ_SEQ_NUM", reqSeqNum);
			cmd.addParameter("@FPBPOHD_SINGLE_ACCTG_IND", fpbpohdSingleAcctgInd);
			cmd.addParameter("@POHD_CODE", pohdCode);
			cmd.addParameter("@ERROR_MESG", errorMesg, true);
				
			cmd.execute();
			errorMesg.val = cmd.getParameterValue("@ERROR_MESG", NString.class);


		}
		
		public static void pPoOpenReq(NString reqCode,NNumber reqItemNum,NNumber reqSeqNum,NString fpbpohdSingleAcctgInd,NString pohdCode,Ref<NString> errorMesg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FPKPURR.P_PO_OPEN_REQ", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@REQ_CODE", reqCode);
			cmd.addParameter("@REQ_ITEM_NUM", reqItemNum);
			cmd.addParameter("@REQ_SEQ_NUM", reqSeqNum);
			cmd.addParameter("@FPBPOHD_SINGLE_ACCTG_IND", fpbpohdSingleAcctgInd);
			cmd.addParameter("@POHD_CODE", pohdCode);
			cmd.addParameter("@ERROR_MESG", errorMesg, true);
				
			cmd.execute();
			errorMesg.val = cmd.getParameterValue("@ERROR_MESG", NString.class);


		}
		
		public static void pReqOpenClose(NString fpbpohdSingleAcctgInd,NString pohdCode,Ref<NString> errorMesg,NString opType) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FPKPURR.P_REQ_OPEN_CLOSE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@FPBPOHD_SINGLE_ACCTG_IND", fpbpohdSingleAcctgInd);
			cmd.addParameter("@POHD_CODE", pohdCode);
			cmd.addParameter("@ERROR_MESG", errorMesg, true);
			cmd.addParameter("@OP_TYPE", opType);
				
			cmd.execute();
			errorMesg.val = cmd.getParameterValue("@ERROR_MESG", NString.class);


		}
		
//		public static void pScrubAcctg(PoAcctgentryRectypeRow inPoAcctgRec,Ref<PodaAcctgentryRectypeRow> outPodaRec,Ref<List<Fpkutil.ErrorMesgTabtypeRow>> errorMesg) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FPKPURR.P_SCRUB_ACCTG", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter(DbTypes.createStructType("IN_PO_ACCTG_REC", inPoAcctgRec, PoAcctgentryRectypeRow.class ));
//			cmd.addParameter(DbTypes.createStructType("OUT_PODA_REC", outPodaRec.val, PodaAcctgentryRectypeRow.class, true));
//			// cmd.addParameter(DbTypes.getTableType("ERROR_MESG", "", errorMesg.val, object.class , true));
//				
//			cmd.execute();
//			outPodaRec.val = cmd.getParameterValue("@OUT_PODA_REC", PodaAcctgentryRectypeRow.class);
//			// errorMesg.val = cmd.getTableParameterValue("@ERROR_MESG", object.class);
//
//
//		}
		
//		public static void pScrubHeader(PoHeadentryRectypeRow inPoHeadrec,Ref<PohdHeadentryRectypeRow> outPohdHeadrec,Ref<List<Fpkutil.ErrorMesgTabtypeRow>> errorMesg) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FPKPURR.P_SCRUB_HEADER", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter(DbTypes.createStructType("IN_PO_HEADREC", inPoHeadrec, PoHeadentryRectypeRow.class ));
//			cmd.addParameter(DbTypes.createStructType("OUT_POHD_HEADREC", outPohdHeadrec.val, PohdHeadentryRectypeRow.class, true));
//			// cmd.addParameter(DbTypes.getTableType("ERROR_MESG", "", errorMesg.val, object.class , true));
//				
//			cmd.execute();
//			outPohdHeadrec.val = cmd.getParameterValue("@OUT_POHD_HEADREC", PohdHeadentryRectypeRow.class);
//			// errorMesg.val = cmd.getTableParameterValue("@ERROR_MESG", object.class);
//
//
//		}
		
//		public static void pScrubItem(PoItemsentryRectypeRow inPoItemRec,Ref<PodtItemsentryRectypeRow> outPodtRec,Ref<List<Fpkutil.ErrorMesgTabtypeRow>> errorMesg) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FPKPURR.P_SCRUB_ITEM", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter(DbTypes.createStructType("IN_PO_ITEM_REC", inPoItemRec, PoItemsentryRectypeRow.class ));
//			cmd.addParameter(DbTypes.createStructType("OUT_PODT_REC", outPodtRec.val, PodtItemsentryRectypeRow.class, true));
//			// cmd.addParameter(DbTypes.getTableType("ERROR_MESG", "", errorMesg.val, object.class , true));
//				
//			cmd.execute();
//			outPodtRec.val = cmd.getParameterValue("@OUT_PODT_REC", PodtItemsentryRectypeRow.class);
//			// errorMesg.val = cmd.getTableParameterValue("@ERROR_MESG", object.class);
//
//
//		}
		
		public static void pUpdateAcctg() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FPKPURR.P_UPDATE_ACCTG", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pUpdateItem() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FPKPURR.P_UPDATE_ITEM", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pValidateAcctg(PodaAcctgentryRectypeRow podaEntryRec) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FPKPURR.P_VALIDATE_ACCTG", DbManager.getDataBaseFactory());
			
			cmd.addParameter(DbTypes.createStructType("PODA_ENTRY_REC", podaEntryRec, PodaAcctgentryRectypeRow.class ));
				
			cmd.execute();


		}
		
		public static void pValidateHeader(PohdHeadentryRectypeRow pohdHeaderData) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FPKPURR.P_VALIDATE_HEADER", DbManager.getDataBaseFactory());
			
			cmd.addParameter(DbTypes.createStructType("POHD_HEADER_DATA", pohdHeaderData, PohdHeadentryRectypeRow.class ));
				
			cmd.execute();


		}
		
		public static void pValidateItem(PodtItemsentryRectypeRow podtEntryRec) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FPKPURR.P_VALIDATE_ITEM", DbManager.getDataBaseFactory());
			
			cmd.addParameter(DbTypes.createStructType("PODT_ENTRY_REC", podtEntryRec, PodtItemsentryRectypeRow.class ));
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="PoAcctgentryRectypeRow", dataSourceName="PO_ACCTGENTRY_RECTYPE")
	public static class PoAcctgentryRectypeRow
	{
		@DbRecordField(dataSourceName="PO_CODE")
		public NString PoCode;
		@DbRecordField(dataSourceName="PO_CHANGE_SEQ_NUM")
		public NString PoChangeSeqNum;
		@DbRecordField(dataSourceName="PO_SEQITEM")
		public NString PoSeqitem;
		@DbRecordField(dataSourceName="PO_SEQNUM")
		public NString PoSeqnum;
		@DbRecordField(dataSourceName="PO_ACCTG_AMT")
		public NString PoAcctgAmt;
		@DbRecordField(dataSourceName="PO_DISC_AMT")
		public NString PoDiscAmt;
		@DbRecordField(dataSourceName="PO_TAX_AMT")
		public NString PoTaxAmt;
		@DbRecordField(dataSourceName="PO_ADDL_AMT")
		public NString PoAddlAmt;
		@DbRecordField(dataSourceName="PO_COAS")
		public NString PoCoas;
		@DbRecordField(dataSourceName="PO_ACCI")
		public NString PoAcci;
		@DbRecordField(dataSourceName="PO_FUND")
		public NString PoFund;
		@DbRecordField(dataSourceName="PO_ORGN")
		public NString PoOrgn;
		@DbRecordField(dataSourceName="PO_ACCT")
		public NString PoAcct;
		@DbRecordField(dataSourceName="PO_PROG")
		public NString PoProg;
		@DbRecordField(dataSourceName="PO_ACTV")
		public NString PoActv;
		@DbRecordField(dataSourceName="PO_LOCN")
		public NString PoLocn;
		@DbRecordField(dataSourceName="PO_NSF_OVERRIDE")
		public NString PoNsfOverride;
		@DbRecordField(dataSourceName="PO_PERCENT_DIST")
		public NString PoPercentDist;
	}

	
	@DbRecordType(id="PoHeadentryRectypeRow", dataSourceName="PO_HEADENTRY_RECTYPE")
	public static class PoHeadentryRectypeRow
	{
		@DbRecordField(dataSourceName="PO_CODE")
		public NString PoCode;
		@DbRecordField(dataSourceName="PO_CHANGE_SEQ_NUM")
		public NString PoChangeSeqNum;
		@DbRecordField(dataSourceName="PO_USERID")
		public NString PoUserid;
		@DbRecordField(dataSourceName="PO_ORDER_DATE")
		public NString PoOrderDate;
		@DbRecordField(dataSourceName="PO_TRANS_DATE")
		public NString PoTransDate;
		@DbRecordField(dataSourceName="PO_VEND_ID")
		public NString PoVendId;
		@DbRecordField(dataSourceName="PO_ADDR_TYPE")
		public NString PoAddrType;
		@DbRecordField(dataSourceName="PO_ADDR_SEQ_NO")
		public NString PoAddrSeqNo;
		@DbRecordField(dataSourceName="PO_BUYR_CODE")
		public NString PoBuyrCode;
		@DbRecordField(dataSourceName="PO_DELIV_DATE")
		public NString PoDelivDate;
		@DbRecordField(dataSourceName="PO_COAS")
		public NString PoCoas;
		@DbRecordField(dataSourceName="PO_ORGN")
		public NString PoOrgn;
		@DbRecordField(dataSourceName="PO_SHIP_CODE")
		public NString PoShipCode;
		@DbRecordField(dataSourceName="PO_DISC_CODE")
		public NString PoDiscCode;
		@DbRecordField(dataSourceName="PO_PRINT_TEXT")
		public NString PoPrintText;
		@DbRecordField(dataSourceName="PO_NOPRINT_TEXT")
		public NString PoNoprintText;
		@DbRecordField(dataSourceName="PO_TGRP_CODE")
		public NString PoTgrpCode;
		@DbRecordField(dataSourceName="PO_CURR_CODE")
		public NString PoCurrCode;
		@DbRecordField(dataSourceName="PO_ACCTG_TYPE")
		public NString PoAcctgType;
		@DbRecordField(dataSourceName="PO_EMAIL_ADDR")
		public NString PoEmailAddr;
		@DbRecordField(dataSourceName="PO_FAX_AREA")
		public NString PoFaxArea;
		@DbRecordField(dataSourceName="PO_FAX_NUMBER")
		public NString PoFaxNumber;
		@DbRecordField(dataSourceName="PO_FAX_EXT")
		public NString PoFaxExt;
		@DbRecordField(dataSourceName="PO_ATTN_TO")
		public NString PoAttnTo;
		@DbRecordField(dataSourceName="PO_VEND_CONTACT")
		public NString PoVendContact;
		@DbRecordField(dataSourceName="PO_DELIV_COMMENT")
		public NString PoDelivComment;
		@DbRecordField(dataSourceName="PO_VEND_EMAIL")
		public NString PoVendEmail;
		@DbRecordField(dataSourceName="PO_REQUESTOR")
		public NString PoRequestor;
		@DbRecordField(dataSourceName="PO_PHONE_AREA")
		public NString PoPhoneArea;
		@DbRecordField(dataSourceName="PO_PHONE_NUM")
		public NString PoPhoneNum;
		@DbRecordField(dataSourceName="PO_PHONE_EXT")
		public NString PoPhoneExt;
		@DbRecordField(dataSourceName="PO_EDI_IND")
		public NString PoEdiInd;
		@DbRecordField(dataSourceName="PO_FTRM_CODE")
		public NString PoFtrmCode;
		@DbRecordField(dataSourceName="PO_ORIGIN")
		public NString PoOrigin;
		@DbRecordField(dataSourceName="PO_TYPE")
		public NString PoType;
		@DbRecordField(dataSourceName="PO_DOC_REF")
		public NString PoDocRef;
		@DbRecordField(dataSourceName="PO_CTRY_CODE_PHONE")
		public NString PoCtryCodePhone;
		@DbRecordField(dataSourceName="PO_CTRY_CODE_FAX")
		public NString PoCtryCodeFax;
	}

	
	@DbRecordType(id="PoItemsentryRectypeRow", dataSourceName="PO_ITEMSENTRY_RECTYPE")
	public static class PoItemsentryRectypeRow
	{
		@DbRecordField(dataSourceName="PO_CODE")
		public NString PoCode;
		@DbRecordField(dataSourceName="PO_CHANGE_SEQ_NUM")
		public NString PoChangeSeqNum;
		@DbRecordField(dataSourceName="PO_ITEMNUM")
		public NString PoItemnum;
		@DbRecordField(dataSourceName="PO_COMM_CODE")
		public NString PoCommCode;
		@DbRecordField(dataSourceName="PO_COMM_DESC")
		public NString PoCommDesc;
		@DbRecordField(dataSourceName="PO_UOM")
		public NString PoUom;
		@DbRecordField(dataSourceName="PO_UNIT_PRICE")
		public NString PoUnitPrice;
		@DbRecordField(dataSourceName="PO_QUANTITY")
		public NString PoQuantity;
		@DbRecordField(dataSourceName="PO_DISC_AMT")
		public NString PoDiscAmt;
		@DbRecordField(dataSourceName="PO_ADDL_AMT")
		public NString PoAddlAmt;
		@DbRecordField(dataSourceName="PO_TAX_AMT")
		public NString PoTaxAmt;
		@DbRecordField(dataSourceName="PO_TGRP_CODE")
		public NString PoTgrpCode;
		@DbRecordField(dataSourceName="PO_SHIP_CODE")
		public NString PoShipCode;
		@DbRecordField(dataSourceName="PO_DELIV_DATE")
		public NString PoDelivDate;
		@DbRecordField(dataSourceName="PO_PRINT_TEXT")
		public NString PoPrintText;
		@DbRecordField(dataSourceName="PO_NOPRINT_TEXT")
		public NString PoNoprintText;
	}

	
	@DbRecordType(id="PodaAcctgentryRectypeRow", dataSourceName="PODA_ACCTGENTRY_RECTYPE")
	public static class PodaAcctgentryRectypeRow
	{
		@DbRecordField(dataSourceName="P_CODE")
		public NString PCode;
		@DbRecordField(dataSourceName="P_CHANGE_SEQ_NUM")
		public NNumber PChangeSeqNum;
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
		@DbRecordField(dataSourceName="P_APPR_AMT_PCT")
		public NNumber PApprAmtPct;
		@DbRecordField(dataSourceName="P_DISC_AMT_PCT")
		public NNumber PDiscAmtPct;
		@DbRecordField(dataSourceName="P_ADDL_AMT_PCT")
		public NNumber PAddlAmtPct;
		@DbRecordField(dataSourceName="P_TAX_AMT_PCT")
		public NNumber PTaxAmtPct;
	}

	
	@DbRecordType(id="PodtItemsentryRectypeRow", dataSourceName="PODT_ITEMSENTRY_RECTYPE")
	public static class PodtItemsentryRectypeRow
	{
		@DbRecordField(dataSourceName="P_CODE")
		public NString PCode;
		@DbRecordField(dataSourceName="P_CHANGE_SEQ_NUM")
		public NNumber PChangeSeqNum;
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
		@DbRecordField(dataSourceName="P_VEND_REF_NUM")
		public NString PVendRefNum;
	}

	
	@DbRecordType(id="PohdHeadentryRectypeRow", dataSourceName="POHD_HEADENTRY_RECTYPE")
	public static class PohdHeadentryRectypeRow
	{
		@DbRecordField(dataSourceName="P_CODE")
		public NString PCode;
		@DbRecordField(dataSourceName="P_CHANGE_SEQ_NUM")
		public NNumber PChangeSeqNum;
		@DbRecordField(dataSourceName="P_USER_ID")
		public NString PUserId;
		@DbRecordField(dataSourceName="P_PO_DATE")
		public NDate PPoDate;
		@DbRecordField(dataSourceName="P_TRANS_DATE")
		public NDate PTransDate;
		@DbRecordField(dataSourceName="P_VENDOR_ID")
		public NString PVendorId;
		@DbRecordField(dataSourceName="P_ATYP_CODE")
		public NString PAtypCode;
		@DbRecordField(dataSourceName="P_ATYP_SEQ_NUM")
		public NNumber PAtypSeqNum;
		@DbRecordField(dataSourceName="P_BUYR_CODE")
		public NString PBuyrCode;
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
		@DbRecordField(dataSourceName="P_EDI_IND")
		public NString PEdiInd;
		@DbRecordField(dataSourceName="P_FTRM_CODE")
		public NString PFtrmCode;
		@DbRecordField(dataSourceName="P_ORIGIN_CODE")
		public NString POriginCode;
		@DbRecordField(dataSourceName="P_PO_TYPE_IND")
		public NString PPoTypeInd;
		@DbRecordField(dataSourceName="P_DOC_REF_CODE")
		public NString PDocRefCode;
		@DbRecordField(dataSourceName="P_CTRY_CODE_PHONE")
		public NString PCtryCodePhone;
		@DbRecordField(dataSourceName="P_CTRY_CODE_FAX")
		public NString PCtryCodeFax;
		@DbRecordField(dataSourceName="P_CLOSED_IND")
		public NString PClosedInd;
		@DbRecordField(dataSourceName="P_COMPLETE_IND")
		public NString PCompleteInd;
		@DbRecordField(dataSourceName="P_CANCEL_IND")
		public NString PCancelInd;
		@DbRecordField(dataSourceName="P_APPR_IND")
		public NString PApprInd;
		@DbRecordField(dataSourceName="P_VEND_PIDM")
		public NNumber PVendPidm;
	}

	
	
}
