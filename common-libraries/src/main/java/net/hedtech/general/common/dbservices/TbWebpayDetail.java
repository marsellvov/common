package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class TbWebpayDetail {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_WEBPAY_DETAIL.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NString pTermCode,NString pPtypPmntCode,NString pPtypTranCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_WEBPAY_DETAIL.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_PTYP_PMNT_CODE", pPtypPmntCode);
			cmd.addParameter("@P_PTYP_TRAN_CODE", pPtypTranCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(WebpayDetailRecRow recOne,WebpayDetailRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_WEBPAY_DETAIL.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, WebpayDetailRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, WebpayDetailRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NString pTermCode,NString pPtypPmntCode,NString pPtypTranCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_WEBPAY_DETAIL.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_PTYP_PMNT_CODE", pPtypPmntCode);
			cmd.addParameter("@P_PTYP_TRAN_CODE", pPtypTranCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_WEBPAY_DETAIL.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static WebpayDetailRecRow fQueryNext(NString pTermCode,NString pPtypPmntCode,NNumber pCurrentStep) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_WEBPAY_DETAIL.F_QUERY_NEXT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DbTypes.createStructType(WebpayDetailRecRow.class));
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_PTYP_PMNT_CODE", pPtypPmntCode);
			cmd.addParameter("@P_CURRENT_STEP", pCurrentStep);
				
			cmd.execute();

			return cmd.getReturnValue(WebpayDetailRecRow.class);

		}
		
		public static DataCursor fQueryOne(NString pTermCode,NString pPtypPmntCode,NString pPtypTranCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_WEBPAY_DETAIL.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_PTYP_PMNT_CODE", pPtypPmntCode);
			cmd.addParameter("@P_PTYP_TRAN_CODE", pPtypTranCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NString pTermCode,NString pPtypPmntCode,NString pPtypTranCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_WEBPAY_DETAIL.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_PTYP_PMNT_CODE", pPtypPmntCode);
			cmd.addParameter("@P_PTYP_TRAN_CODE", pPtypTranCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
//		public static List<WebpayDetailTabRow> fQuerySet(NString pTermCode,NString pPtypPmntCode) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_WEBPAY_DETAIL.F_QUERY_SET", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<WebpayDetailTabRow>.class);
//			cmd.addParameter("@P_TERM_CODE", pTermCode);
//			cmd.addParameter("@P_PTYP_PMNT_CODE", pPtypPmntCode);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<WebpayDetailTabRow>.class);
//
//		}
		
		public static void pCopyRules(NString pTermCodeSrc,NString pPtypPmntCodeSrc,NString pTermCodeTrg,NString pPtypPmntCodeTrg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_WEBPAY_DETAIL.P_COPY_RULES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TERM_CODE_SRC", pTermCodeSrc);
			cmd.addParameter("@P_PTYP_PMNT_CODE_SRC", pPtypPmntCodeSrc);
			cmd.addParameter("@P_TERM_CODE_TRG", pTermCodeTrg);
			cmd.addParameter("@P_PTYP_PMNT_CODE_TRG", pPtypPmntCodeTrg);
				
			cmd.execute();


		}
		
		public static void pCreate(NString pTermCode,NString pPtypPmntCode,NString pPtypTranCode,NNumber pSeqno,NString pDesc,NString pReqInd,NString pMultInd,NNumber pAmount,NString pProcess,NString pCode,NString pProcedure,NString pDepReleaseInd,NDate pDepRelDate,NDate pDepExpDate,NNumber pDepMinAmount,NString pUserId,NNumber pSurrogateId,NNumber pVersion,NString pVpdiCode,NString pDataOrigin,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_WEBPAY_DETAIL.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_PTYP_PMNT_CODE", pPtypPmntCode);
			cmd.addParameter("@P_PTYP_TRAN_CODE", pPtypTranCode);
			cmd.addParameter("@P_SEQNO", pSeqno);
			cmd.addParameter("@P_DESC", pDesc);
			cmd.addParameter("@P_REQ_IND", pReqInd);
			cmd.addParameter("@P_MULT_IND", pMultInd);
			cmd.addParameter("@P_AMOUNT", pAmount);
			cmd.addParameter("@P_PROCESS", pProcess);
			cmd.addParameter("@P_CODE", pCode);
			cmd.addParameter("@P_PROCEDURE", pProcedure);
			cmd.addParameter("@P_DEP_RELEASE_IND", pDepReleaseInd);
			cmd.addParameter("@P_DEP_REL_DATE", pDepRelDate);
			cmd.addParameter("@P_DEP_EXP_DATE", pDepExpDate);
			cmd.addParameter("@P_DEP_MIN_AMOUNT", pDepMinAmount);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_SURROGATE_ID", pSurrogateId);
			cmd.addParameter("@P_VERSION", pVersion);
			cmd.addParameter("@P_VPDI_CODE", pVpdiCode);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NString pTermCode,NString pPtypPmntCode,NString pPtypTranCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_WEBPAY_DETAIL.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_PTYP_PMNT_CODE", pPtypPmntCode);
			cmd.addParameter("@P_PTYP_TRAN_CODE", pPtypTranCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NString pTermCode,NString pPtypPmntCode,NString pPtypTranCode,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_WEBPAY_DETAIL.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_PTYP_PMNT_CODE", pPtypPmntCode);
			cmd.addParameter("@P_PTYP_TRAN_CODE", pPtypTranCode);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NString pTermCode,NString pPtypPmntCode,NString pPtypTranCode,NNumber pSeqno,NString pDesc,NString pReqInd,NString pMultInd,NNumber pAmount,NString pProcess,NString pCode,NString pProcedure,NString pDepReleaseInd,NDate pDepRelDate,NDate pDepExpDate,NNumber pDepMinAmount,NString pUserId,NNumber pSurrogateId,NNumber pVersion,NString pVpdiCode,NString pDataOrigin,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_WEBPAY_DETAIL.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_PTYP_PMNT_CODE", pPtypPmntCode);
			cmd.addParameter("@P_PTYP_TRAN_CODE", pPtypTranCode);
			cmd.addParameter("@P_SEQNO", pSeqno);
			cmd.addParameter("@P_DESC", pDesc);
			cmd.addParameter("@P_REQ_IND", pReqInd);
			cmd.addParameter("@P_MULT_IND", pMultInd);
			cmd.addParameter("@P_AMOUNT", pAmount);
			cmd.addParameter("@P_PROCESS", pProcess);
			cmd.addParameter("@P_CODE", pCode);
			cmd.addParameter("@P_PROCEDURE", pProcedure);
			cmd.addParameter("@P_DEP_RELEASE_IND", pDepReleaseInd);
			cmd.addParameter("@P_DEP_REL_DATE", pDepRelDate);
			cmd.addParameter("@P_DEP_EXP_DATE", pDepExpDate);
			cmd.addParameter("@P_DEP_MIN_AMOUNT", pDepMinAmount);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_SURROGATE_ID", pSurrogateId);
			cmd.addParameter("@P_VERSION", pVersion);
			cmd.addParameter("@P_VPDI_CODE", pVpdiCode);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="WebpayDetailRecRow", dataSourceName="WEBPAY_DETAIL_REC")
	public static class WebpayDetailRecRow
	{
		@DbRecordField(dataSourceName="R_TERM_CODE")
		public NString RTermCode;
		@DbRecordField(dataSourceName="R_PTYP_PMNT_CODE")
		public NString RPtypPmntCode;
		@DbRecordField(dataSourceName="R_PTYP_TRAN_CODE")
		public NString RPtypTranCode;
		@DbRecordField(dataSourceName="R_SEQNO")
		public NNumber RSeqno;
		@DbRecordField(dataSourceName="R_DESC")
		public NString RDesc;
		@DbRecordField(dataSourceName="R_REQ_IND")
		public NString RReqInd;
		@DbRecordField(dataSourceName="R_MULT_IND")
		public NString RMultInd;
		@DbRecordField(dataSourceName="R_AMOUNT")
		public NNumber RAmount;
		@DbRecordField(dataSourceName="R_PROCESS")
		public NString RProcess;
		@DbRecordField(dataSourceName="R_CODE")
		public NString RCode;
		@DbRecordField(dataSourceName="R_PROCEDURE")
		public NString RProcedure;
		@DbRecordField(dataSourceName="R_DEP_RELEASE_IND")
		public NString RDepReleaseInd;
		@DbRecordField(dataSourceName="R_DEP_REL_DATE")
		public NDate RDepRelDate;
		@DbRecordField(dataSourceName="R_DEP_EXP_DATE")
		public NDate RDepExpDate;
		@DbRecordField(dataSourceName="R_DEP_MIN_AMOUNT")
		public NNumber RDepMinAmount;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_SURROGATE_ID")
		public NNumber RSurrogateId;
		@DbRecordField(dataSourceName="R_VERSION")
		public NNumber RVersion;
		@DbRecordField(dataSourceName="R_VPDI_CODE")
		public NString RVpdiCode;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
