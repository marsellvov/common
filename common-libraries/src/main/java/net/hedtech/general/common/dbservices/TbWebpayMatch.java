package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class TbWebpayMatch {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_WEBPAY_MATCH.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NString pTermCode,NString pPtypPmntCode,NString pType,NString pValue,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_WEBPAY_MATCH.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_PTYP_PMNT_CODE", pPtypPmntCode);
			cmd.addParameter("@P_TYPE", pType);
			cmd.addParameter("@P_VALUE", pValue);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(WebpayMatchRecRow recOne,WebpayMatchRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_WEBPAY_MATCH.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, WebpayMatchRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, WebpayMatchRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NString pTermCode,NString pPtypPmntCode,NString pType) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_WEBPAY_MATCH.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_PTYP_PMNT_CODE", pPtypPmntCode);
			cmd.addParameter("@P_TYPE", pType);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_WEBPAY_MATCH.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NString pTermCode,NString pPtypPmntCode,NString pType,NString pValue) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_WEBPAY_MATCH.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_PTYP_PMNT_CODE", pPtypPmntCode);
			cmd.addParameter("@P_TYPE", pType);
			cmd.addParameter("@P_VALUE", pValue);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NString pTermCode,NString pPtypPmntCode,NString pType,NString pValue,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_WEBPAY_MATCH.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_PTYP_PMNT_CODE", pPtypPmntCode);
			cmd.addParameter("@P_TYPE", pType);
			cmd.addParameter("@P_VALUE", pValue);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
//		public static List<WebpayHeaderTabRow> fQuerySetAdm(NNumber pPidm,NString pTermCode) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_WEBPAY_MATCH.F_QUERY_SET_ADM", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<WebpayHeaderTabRow>.class);
//			cmd.addParameter("@P_PIDM", pPidm);
//			cmd.addParameter("@P_TERM_CODE", pTermCode);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<WebpayHeaderTabRow>.class);
//
//		}
		
//		public static List<WebpayHeaderTabRow> fQuerySetEnr(NNumber pPidm,NString pTermCode) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_WEBPAY_MATCH.F_QUERY_SET_ENR", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<WebpayHeaderTabRow>.class);
//			cmd.addParameter("@P_PIDM", pPidm);
//			cmd.addParameter("@P_TERM_CODE", pTermCode);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<WebpayHeaderTabRow>.class);
//
//		}
		
		public static DataCursor fQueryTypeList() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_WEBPAY_MATCH.F_QUERY_TYPE_LIST", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCopyRules(NString pTermCodeSrc,NString pPtypPmntCodeSrc,NString pTypeSrc,NString pTermCodeTrg,NString pPtypPmntCodeTrg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_WEBPAY_MATCH.P_COPY_RULES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TERM_CODE_SRC", pTermCodeSrc);
			cmd.addParameter("@P_PTYP_PMNT_CODE_SRC", pPtypPmntCodeSrc);
			cmd.addParameter("@P_TYPE_SRC", pTypeSrc);
			cmd.addParameter("@P_TERM_CODE_TRG", pTermCodeTrg);
			cmd.addParameter("@P_PTYP_PMNT_CODE_TRG", pPtypPmntCodeTrg);
				
			cmd.execute();


		}
		
		public static void pCreate(NString pTermCode,NString pPtypPmntCode,NString pType,NString pValue,NString pUserId,NNumber pSurrogateId,NNumber pVersion,NString pVpdiCode,NString pDataOrigin,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_WEBPAY_MATCH.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_PTYP_PMNT_CODE", pPtypPmntCode);
			cmd.addParameter("@P_TYPE", pType);
			cmd.addParameter("@P_VALUE", pValue);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_SURROGATE_ID", pSurrogateId);
			cmd.addParameter("@P_VERSION", pVersion);
			cmd.addParameter("@P_VPDI_CODE", pVpdiCode);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NString pTermCode,NString pPtypPmntCode,NString pType,NString pValue,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_WEBPAY_MATCH.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_PTYP_PMNT_CODE", pPtypPmntCode);
			cmd.addParameter("@P_TYPE", pType);
			cmd.addParameter("@P_VALUE", pValue);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NString pTermCode,NString pPtypPmntCode,NString pType,NString pValue,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_WEBPAY_MATCH.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_PTYP_PMNT_CODE", pPtypPmntCode);
			cmd.addParameter("@P_TYPE", pType);
			cmd.addParameter("@P_VALUE", pValue);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NString pTermCode,NString pPtypPmntCode,NString pType,NString pValue,NString pUserId,NNumber pSurrogateId,NNumber pVersion,NString pVpdiCode,NString pDataOrigin,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_WEBPAY_MATCH.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_PTYP_PMNT_CODE", pPtypPmntCode);
			cmd.addParameter("@P_TYPE", pType);
			cmd.addParameter("@P_VALUE", pValue);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_SURROGATE_ID", pSurrogateId);
			cmd.addParameter("@P_VERSION", pVersion);
			cmd.addParameter("@P_VPDI_CODE", pVpdiCode);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="WebpayMatchRecRow", dataSourceName="WEBPAY_MATCH_REC")
	public static class WebpayMatchRecRow
	{
		@DbRecordField(dataSourceName="R_TERM_CODE")
		public NString RTermCode;
		@DbRecordField(dataSourceName="R_PTYP_PMNT_CODE")
		public NString RPtypPmntCode;
		@DbRecordField(dataSourceName="R_TYPE")
		public NString RType;
		@DbRecordField(dataSourceName="R_VALUE")
		public NString RValue;
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

	
	@DbRecordType(id="WebpayTypeListRecRow", dataSourceName="WEBPAY_TYPE_LIST_REC")
	public static class WebpayTypeListRecRow
	{
		@DbRecordField(dataSourceName="R_TYPE")
		public NString RType;
		@DbRecordField(dataSourceName="R_DESC")
		public NString RDesc;
	}

	
	
}
