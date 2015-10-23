package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class TbWebpayHeader {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_WEBPAY_HEADER.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NString pTermCode,NString pPtypPmntCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_WEBPAY_HEADER.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_PTYP_PMNT_CODE", pPtypPmntCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(WebpayHeaderRecRow recOne,WebpayHeaderRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_WEBPAY_HEADER.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, WebpayHeaderRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, WebpayHeaderRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
//		public static List<WebpayHeaderTabRow> fQueryActiveSet(NString pEnrAdm,NDate pAsofDate,NString pTermCode) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_WEBPAY_HEADER.F_QUERY_ACTIVE_SET", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<WebpayHeaderTabRow>.class);
//			cmd.addParameter("@P_ENR_ADM", pEnrAdm);
//			cmd.addParameter("@P_ASOF_DATE", pAsofDate);
//			cmd.addParameter("@P_TERM_CODE", pTermCode);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<WebpayHeaderTabRow>.class);
//
//		}
		
		public static DataCursor fQueryAll(NString pTermCode,NString pPtypPmntCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_WEBPAY_HEADER.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_PTYP_PMNT_CODE", pPtypPmntCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_WEBPAY_HEADER.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NString pTermCode,NString pPtypPmntCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_WEBPAY_HEADER.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_PTYP_PMNT_CODE", pPtypPmntCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NString pTermCode,NString pPtypPmntCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_WEBPAY_HEADER.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_PTYP_PMNT_CODE", pPtypPmntCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCopyRules(NString pTermCodeSrc,NString pPtypPmntCodeSrc,NString pTermCodeTrg,NString pPtypPmntCodeTrg,NString pActiveInd,NDate pStartDate,NDate pEndDate,NString pCopyMatching,NString pCopyTransaction) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_WEBPAY_HEADER.P_COPY_RULES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TERM_CODE_SRC", pTermCodeSrc);
			cmd.addParameter("@P_PTYP_PMNT_CODE_SRC", pPtypPmntCodeSrc);
			cmd.addParameter("@P_TERM_CODE_TRG", pTermCodeTrg);
			cmd.addParameter("@P_PTYP_PMNT_CODE_TRG", pPtypPmntCodeTrg);
			cmd.addParameter("@P_ACTIVE_IND", pActiveInd);
			cmd.addParameter("@P_START_DATE", pStartDate);
			cmd.addParameter("@P_END_DATE", pEndDate);
			cmd.addParameter("@P_COPY_MATCHING", pCopyMatching);
			cmd.addParameter("@P_COPY_TRANSACTION", pCopyTransaction);
				
			cmd.execute();


		}
		
		public static void pCreate(NString pTermCode,NString pPtypPmntCode,NNumber pSeqno,NString pActiveInd,NString pAdmInd,NString pEnrInd,NString pUrlText,NString pUrlDesc,NDate pStartDate,NDate pEndDate,NString pUserId,NNumber pSurrogateId,NNumber pVersion,NString pVpdiCode,NString pDataOrigin,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_WEBPAY_HEADER.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_PTYP_PMNT_CODE", pPtypPmntCode);
			cmd.addParameter("@P_SEQNO", pSeqno);
			cmd.addParameter("@P_ACTIVE_IND", pActiveInd);
			cmd.addParameter("@P_ADM_IND", pAdmInd);
			cmd.addParameter("@P_ENR_IND", pEnrInd);
			cmd.addParameter("@P_URL_TEXT", pUrlText);
			cmd.addParameter("@P_URL_DESC", pUrlDesc);
			cmd.addParameter("@P_START_DATE", pStartDate);
			cmd.addParameter("@P_END_DATE", pEndDate);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_SURROGATE_ID", pSurrogateId);
			cmd.addParameter("@P_VERSION", pVersion);
			cmd.addParameter("@P_VPDI_CODE", pVpdiCode);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NString pTermCode,NString pPtypPmntCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_WEBPAY_HEADER.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_PTYP_PMNT_CODE", pPtypPmntCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NString pTermCode,NString pPtypPmntCode,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_WEBPAY_HEADER.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_PTYP_PMNT_CODE", pPtypPmntCode);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NString pTermCode,NString pPtypPmntCode,NNumber pSeqno,NString pActiveInd,NString pAdmInd,NString pEnrInd,NString pUrlText,NString pUrlDesc,NDate pStartDate,NDate pEndDate,NString pUserId,NNumber pSurrogateId,NNumber pVersion,NString pVpdiCode,NString pDataOrigin,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_WEBPAY_HEADER.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_PTYP_PMNT_CODE", pPtypPmntCode);
			cmd.addParameter("@P_SEQNO", pSeqno);
			cmd.addParameter("@P_ACTIVE_IND", pActiveInd);
			cmd.addParameter("@P_ADM_IND", pAdmInd);
			cmd.addParameter("@P_ENR_IND", pEnrInd);
			cmd.addParameter("@P_URL_TEXT", pUrlText);
			cmd.addParameter("@P_URL_DESC", pUrlDesc);
			cmd.addParameter("@P_START_DATE", pStartDate);
			cmd.addParameter("@P_END_DATE", pEndDate);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_SURROGATE_ID", pSurrogateId);
			cmd.addParameter("@P_VERSION", pVersion);
			cmd.addParameter("@P_VPDI_CODE", pVpdiCode);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="WebpayHeaderRecRow", dataSourceName="WEBPAY_HEADER_REC")
	public static class WebpayHeaderRecRow
	{
		@DbRecordField(dataSourceName="R_TERM_CODE")
		public NString RTermCode;
		@DbRecordField(dataSourceName="R_PTYP_PMNT_CODE")
		public NString RPtypPmntCode;
		@DbRecordField(dataSourceName="R_SEQNO")
		public NNumber RSeqno;
		@DbRecordField(dataSourceName="R_ACTIVE_IND")
		public NString RActiveInd;
		@DbRecordField(dataSourceName="R_ADM_IND")
		public NString RAdmInd;
		@DbRecordField(dataSourceName="R_ENR_IND")
		public NString REnrInd;
		@DbRecordField(dataSourceName="R_URL_TEXT")
		public NString RUrlText;
		@DbRecordField(dataSourceName="R_URL_DESC")
		public NString RUrlDesc;
		@DbRecordField(dataSourceName="R_START_DATE")
		public NDate RStartDate;
		@DbRecordField(dataSourceName="R_END_DATE")
		public NDate REndDate;
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
