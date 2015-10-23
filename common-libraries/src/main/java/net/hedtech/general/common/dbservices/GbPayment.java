package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class GbPayment {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_PAYMENT.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fApplValue(NString pParm,NString pApplData,NNumber pPayTransId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_PAYMENT.F_APPL_VALUE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PARM", pParm);
			cmd.addParameter("@P_APPL_DATA", pApplData);
			cmd.addParameter("@P_PAY_TRANS_ID", pPayTransId);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fExists(NNumber pPayTransId,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_PAYMENT.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PAY_TRANS_ID", pPayTransId);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void fGetOne() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_PAYMENT.F_GET_ONE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static NString fIsequal(PaymentRecRow recOne,PaymentRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_PAYMENT.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, PaymentRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, PaymentRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NNumber pPayTransId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_PAYMENT.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PAY_TRANS_ID", pPayTransId);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_PAYMENT.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NNumber pPayTransId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_PAYMENT.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PAY_TRANS_ID", pPayTransId);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NNumber pPayTransId,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_PAYMENT.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PAY_TRANS_ID", pPayTransId);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NString pId,NNumber pPidm,NString pTermCode,NString pLocation,NString pDetail,NString pStreetLine1,NString pStreetLine2,NString pStatCode,NString pZip,NString pNatnCode,NString pMerchantId,NString pDebugMsg,NString pStatus,NString pStreetLine3,NString pStreetLine4,NNumber pPayTransId,NString pVendorStatus,NString pBannerStatus,NString pVendorErrorMsg,NString pApplicationData,NString pUpdateFunction,NString pSuccessUrl,NString pFailureUrl,NString pVendorAuthCode,NString pLastName,NString pFirstName,NString pMiddleName,NString pSurnamePrefix,NString pNamePrefix,NString pNameSuffix,NString pSubCode,NString pProcCode,NString pSysiCode,NNumber pApplNo,NString pCity,NString pHouseNumber,NNumber pAidm,NString pGiftNo,NString pVendorReferNo,NNumber pAmount,NString pCartId,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_PAYMENT.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_LOCATION", pLocation);
			cmd.addParameter("@P_DETAIL", pDetail);
			cmd.addParameter("@P_STREET_LINE1", pStreetLine1);
			cmd.addParameter("@P_STREET_LINE2", pStreetLine2);
			cmd.addParameter("@P_STAT_CODE", pStatCode);
			cmd.addParameter("@P_ZIP", pZip);
			cmd.addParameter("@P_NATN_CODE", pNatnCode);
			cmd.addParameter("@P_MERCHANT_ID", pMerchantId);
			cmd.addParameter("@P_DEBUG_MSG", pDebugMsg);
			cmd.addParameter("@P_STATUS", pStatus);
			cmd.addParameter("@P_STREET_LINE3", pStreetLine3);
			cmd.addParameter("@P_STREET_LINE4", pStreetLine4);
			cmd.addParameter("@P_PAY_TRANS_ID", pPayTransId);
			cmd.addParameter("@P_VENDOR_STATUS", pVendorStatus);
			cmd.addParameter("@P_BANNER_STATUS", pBannerStatus);
			cmd.addParameter("@P_VENDOR_ERROR_MSG", pVendorErrorMsg);
			cmd.addParameter("@P_APPLICATION_DATA", pApplicationData);
			cmd.addParameter("@P_UPDATE_FUNCTION", pUpdateFunction);
			cmd.addParameter("@P_SUCCESS_URL", pSuccessUrl);
			cmd.addParameter("@P_FAILURE_URL", pFailureUrl);
			cmd.addParameter("@P_VENDOR_AUTH_CODE", pVendorAuthCode);
			cmd.addParameter("@P_LAST_NAME", pLastName);
			cmd.addParameter("@P_FIRST_NAME", pFirstName);
			cmd.addParameter("@P_MIDDLE_NAME", pMiddleName);
			cmd.addParameter("@P_SURNAME_PREFIX", pSurnamePrefix);
			cmd.addParameter("@P_NAME_PREFIX", pNamePrefix);
			cmd.addParameter("@P_NAME_SUFFIX", pNameSuffix);
			cmd.addParameter("@P_SUB_CODE", pSubCode);
			cmd.addParameter("@P_PROC_CODE", pProcCode);
			cmd.addParameter("@P_SYSI_CODE", pSysiCode);
			cmd.addParameter("@P_APPL_NO", pApplNo);
			cmd.addParameter("@P_CITY", pCity);
			cmd.addParameter("@P_HOUSE_NUMBER", pHouseNumber);
			cmd.addParameter("@P_AIDM", pAidm);
			cmd.addParameter("@P_GIFT_NO", pGiftNo);
			cmd.addParameter("@P_VENDOR_REFER_NO", pVendorReferNo);
			cmd.addParameter("@P_AMOUNT", pAmount);
			cmd.addParameter("@P_CART_ID", pCartId);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NNumber pPayTransId,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_PAYMENT.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PAY_TRANS_ID", pPayTransId);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NNumber pPayTransId,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_PAYMENT.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PAY_TRANS_ID", pPayTransId);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NString pId,NNumber pPidm,NString pTermCode,NString pLocation,NString pDetail,NString pStreetLine1,NString pStreetLine2,NString pStatCode,NString pZip,NString pNatnCode,NString pMerchantId,NString pDebugMsg,NString pStatus,NString pStreetLine3,NString pStreetLine4,NNumber pPayTransId,NString pVendorStatus,NString pBannerStatus,NString pVendorErrorMsg,NString pApplicationData,NString pUpdateFunction,NString pSuccessUrl,NString pFailureUrl,NString pVendorAuthCode,NString pLastName,NString pFirstName,NString pMiddleName,NString pSurnamePrefix,NString pNamePrefix,NString pNameSuffix,NString pSubCode,NString pProcCode,NString pSysiCode,NNumber pApplNo,NString pCity,NString pHouseNumber,NNumber pAidm,NString pGiftNo,NString pVendorReferNo,NNumber pAmount,NString pCartId,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_PAYMENT.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_LOCATION", pLocation);
			cmd.addParameter("@P_DETAIL", pDetail);
			cmd.addParameter("@P_STREET_LINE1", pStreetLine1);
			cmd.addParameter("@P_STREET_LINE2", pStreetLine2);
			cmd.addParameter("@P_STAT_CODE", pStatCode);
			cmd.addParameter("@P_ZIP", pZip);
			cmd.addParameter("@P_NATN_CODE", pNatnCode);
			cmd.addParameter("@P_MERCHANT_ID", pMerchantId);
			cmd.addParameter("@P_DEBUG_MSG", pDebugMsg);
			cmd.addParameter("@P_STATUS", pStatus);
			cmd.addParameter("@P_STREET_LINE3", pStreetLine3);
			cmd.addParameter("@P_STREET_LINE4", pStreetLine4);
			cmd.addParameter("@P_PAY_TRANS_ID", pPayTransId);
			cmd.addParameter("@P_VENDOR_STATUS", pVendorStatus);
			cmd.addParameter("@P_BANNER_STATUS", pBannerStatus);
			cmd.addParameter("@P_VENDOR_ERROR_MSG", pVendorErrorMsg);
			cmd.addParameter("@P_APPLICATION_DATA", pApplicationData);
			cmd.addParameter("@P_UPDATE_FUNCTION", pUpdateFunction);
			cmd.addParameter("@P_SUCCESS_URL", pSuccessUrl);
			cmd.addParameter("@P_FAILURE_URL", pFailureUrl);
			cmd.addParameter("@P_VENDOR_AUTH_CODE", pVendorAuthCode);
			cmd.addParameter("@P_LAST_NAME", pLastName);
			cmd.addParameter("@P_FIRST_NAME", pFirstName);
			cmd.addParameter("@P_MIDDLE_NAME", pMiddleName);
			cmd.addParameter("@P_SURNAME_PREFIX", pSurnamePrefix);
			cmd.addParameter("@P_NAME_PREFIX", pNamePrefix);
			cmd.addParameter("@P_NAME_SUFFIX", pNameSuffix);
			cmd.addParameter("@P_SUB_CODE", pSubCode);
			cmd.addParameter("@P_PROC_CODE", pProcCode);
			cmd.addParameter("@P_SYSI_CODE", pSysiCode);
			cmd.addParameter("@P_APPL_NO", pApplNo);
			cmd.addParameter("@P_CITY", pCity);
			cmd.addParameter("@P_HOUSE_NUMBER", pHouseNumber);
			cmd.addParameter("@P_AIDM", pAidm);
			cmd.addParameter("@P_GIFT_NO", pGiftNo);
			cmd.addParameter("@P_VENDOR_REFER_NO", pVendorReferNo);
			cmd.addParameter("@P_AMOUNT", pAmount);
			cmd.addParameter("@P_CART_ID", pCartId);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="PaymentRecRow", dataSourceName="PAYMENT_REC")
	public static class PaymentRecRow
	{
		@DbRecordField(dataSourceName="R_ID")
		public NString RId;
		@DbRecordField(dataSourceName="R_PIDM")
		public NNumber RPidm;
		@DbRecordField(dataSourceName="R_TERM_CODE")
		public NString RTermCode;
		@DbRecordField(dataSourceName="R_LOCATION")
		public NString RLocation;
		@DbRecordField(dataSourceName="R_DETAIL")
		public NString RDetail;
		@DbRecordField(dataSourceName="R_STREET_LINE1")
		public NString RStreetLine1;
		@DbRecordField(dataSourceName="R_STREET_LINE2")
		public NString RStreetLine2;
		@DbRecordField(dataSourceName="R_STAT_CODE")
		public NString RStatCode;
		@DbRecordField(dataSourceName="R_ZIP")
		public NString RZip;
		@DbRecordField(dataSourceName="R_NATN_CODE")
		public NString RNatnCode;
		@DbRecordField(dataSourceName="R_MERCHANT_ID")
		public NString RMerchantId;
		@DbRecordField(dataSourceName="R_DEBUG_MSG")
		public NString RDebugMsg;
		@DbRecordField(dataSourceName="R_STATUS")
		public NString RStatus;
		@DbRecordField(dataSourceName="R_STREET_LINE3")
		public NString RStreetLine3;
		@DbRecordField(dataSourceName="R_STREET_LINE4")
		public NString RStreetLine4;
		@DbRecordField(dataSourceName="R_PAY_TRANS_ID")
		public NNumber RPayTransId;
		@DbRecordField(dataSourceName="R_VENDOR_STATUS")
		public NString RVendorStatus;
		@DbRecordField(dataSourceName="R_BANNER_STATUS")
		public NString RBannerStatus;
		@DbRecordField(dataSourceName="R_VENDOR_ERROR_MSG")
		public NString RVendorErrorMsg;
		@DbRecordField(dataSourceName="R_APPLICATION_DATA")
		public NString RApplicationData;
		@DbRecordField(dataSourceName="R_UPDATE_FUNCTION")
		public NString RUpdateFunction;
		@DbRecordField(dataSourceName="R_SUCCESS_URL")
		public NString RSuccessUrl;
		@DbRecordField(dataSourceName="R_FAILURE_URL")
		public NString RFailureUrl;
		@DbRecordField(dataSourceName="R_VENDOR_AUTH_CODE")
		public NString RVendorAuthCode;
		@DbRecordField(dataSourceName="R_LAST_NAME")
		public NString RLastName;
		@DbRecordField(dataSourceName="R_FIRST_NAME")
		public NString RFirstName;
		@DbRecordField(dataSourceName="R_MIDDLE_NAME")
		public NString RMiddleName;
		@DbRecordField(dataSourceName="R_SURNAME_PREFIX")
		public NString RSurnamePrefix;
		@DbRecordField(dataSourceName="R_NAME_PREFIX")
		public NString RNamePrefix;
		@DbRecordField(dataSourceName="R_NAME_SUFFIX")
		public NString RNameSuffix;
		@DbRecordField(dataSourceName="R_SUB_CODE")
		public NString RSubCode;
		@DbRecordField(dataSourceName="R_PROC_CODE")
		public NString RProcCode;
		@DbRecordField(dataSourceName="R_SYSI_CODE")
		public NString RSysiCode;
		@DbRecordField(dataSourceName="R_APPL_NO")
		public NNumber RApplNo;
		@DbRecordField(dataSourceName="R_CITY")
		public NString RCity;
		@DbRecordField(dataSourceName="R_HOUSE_NUMBER")
		public NString RHouseNumber;
		@DbRecordField(dataSourceName="R_AIDM")
		public NNumber RAidm;
		@DbRecordField(dataSourceName="R_GIFT_NO")
		public NString RGiftNo;
		@DbRecordField(dataSourceName="R_VENDOR_REFER_NO")
		public NString RVendorReferNo;
		@DbRecordField(dataSourceName="R_AMOUNT")
		public NNumber RAmount;
		@DbRecordField(dataSourceName="R_CART_ID")
		public NString RCartId;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
