package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class GbPaymentRules {
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_PAYMENT_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NString pId,NNumber pPidm,NString pTermCode,NString pLocation,NString pDetail,NString pStreetLine1,NString pStreetLine2,NString pStatCode,NString pZip,NString pNatnCode,NString pMerchantId,NString pDebugMsg,NString pStatus,NString pStreetLine3,NString pStreetLine4,NNumber pPayTransId,NString pVendorStatus,NString pBannerStatus,NString pVendorErrorMsg,NString pApplicationData,NString pUpdateFunction,NString pSuccessUrl,NString pFailureUrl,NString pVendorAuthCode,NString pLastName,NString pFirstName,NString pMiddleName,NString pSurnamePrefix,NString pNamePrefix,NString pNameSuffix,NString pSubCode,NString pProcCode,NString pSysiCode,NNumber pApplNo,NString pCity,NString pHouseNumber,NNumber pAidm,NString pGiftNo,NString pVendorReferNo,NNumber pAmount,NString pCartId,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_PAYMENT_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
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
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NString pId,NNumber pPidm,NString pTermCode,NString pLocation,NString pDetail,NString pStreetLine1,NString pStreetLine2,NString pStatCode,NString pZip,NString pNatnCode,NString pMerchantId,NString pDebugMsg,NString pStatus,NString pStreetLine3,NString pStreetLine4,NNumber pPayTransId,NString pVendorStatus,NString pBannerStatus,NString pVendorErrorMsg,NString pApplicationData,NString pUpdateFunction,NString pSuccessUrl,NString pFailureUrl,NString pVendorAuthCode,NString pLastName,NString pFirstName,NString pMiddleName,NString pSurnamePrefix,NString pNamePrefix,NString pNameSuffix,NString pSubCode,NString pProcCode,NString pSysiCode,NNumber pApplNo,NString pCity,NString pHouseNumber,NNumber pAidm,NString pGiftNo,NString pVendorReferNo,NNumber pAmount,NString pCartId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_PAYMENT_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
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
				
			cmd.execute();


		}
		
	
	
	
}
