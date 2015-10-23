package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class TestLvh {
		public static void gbAdditionalIdent(NNumber pPidm,NString pAdditionalId,NString pAdidCode,NString pUserId,NString pDataOrigin,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TEST_LVH.GB_ADDITIONAL_IDENT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_ADDITIONAL_ID", pAdditionalId);
			cmd.addParameter("@P_ADID_CODE", pAdidCode);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void gbCmUserSetup(NString pCmUserId,NString pCmscOptionInd,NString pExcludeInd,NString pUserId,NString pCmscCode,NString pDataOrigin,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TEST_LVH.GB_CM_USER_SETUP", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CM_USER_ID", pCmUserId);
			cmd.addParameter("@P_CMSC_OPTION_IND", pCmscOptionInd);
			cmd.addParameter("@P_EXCLUDE_IND", pExcludeInd);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_CMSC_CODE", pCmscCode);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void gbIntegConfig(NString pSqprCode,NString pIcsnCode,NString pValue,NString pUserId,NString pValueDesc,NNumber pSeqNo,NString pTranslationValue,NString pDataOrigin,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TEST_LVH.GB_INTEG_CONFIG", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SQPR_CODE", pSqprCode);
			cmd.addParameter("@P_ICSN_CODE", pIcsnCode);
			cmd.addParameter("@P_VALUE", pValue);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_VALUE_DESC", pValueDesc);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_TRANSLATION_VALUE", pTranslationValue);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void gbPayment(NString pId,NNumber pPidm,NString pTermCode,NString pLocation,NString pDetail,NString pStreetLine1,NString pStreetLine2,NString pStatCode,NString pZip,NString pNatnCode,NNumber pAmount,NString pMerchantId,NString pDebugMsg,NString pStatus,NString pStreetLine3,NString pStreetLine4,NNumber pPayTransId,NString pVendorStatus,NString pBannerStatus,NString pVendorErrorMsg,NString pApplicationData,NString pUpdateFunction,NString pSuccessUrl,NString pFailureUrl,NString pVendorAuthCode,NString pLastName,NString pFirstName,NString pMiddleName,NString pSurnamePrefix,NString pNamePrefix,NString pNameSuffix,NString pSubCode,NString pProcCode,NString pSysiCode,NNumber pApplNo,NString pCity,NString pHouseNumber,NNumber pAidm,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TEST_LVH.GB_PAYMENT", DbManager.getDataBaseFactory());
			
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
			cmd.addParameter("@P_AMOUNT", pAmount);
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
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void gbThirdPartyAccess(NNumber pPidm,NString pPinDisabledInd,NString pUsageAcceptInd,NString pUser,NString pPin,NDate pPinExpDate,NString pExternalUser,NString pQuestion,NString pResponse,NString pInsertSource,NString pLdapUser,NString pDataOrigin,NString pSalt,NString pNotificationInd,NString pPinReusechkInd,NString pPinEncryptInd,NString pPinValidateInd,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TEST_LVH.GB_THIRD_PARTY_ACCESS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_PIN_DISABLED_IND", pPinDisabledInd);
			cmd.addParameter("@P_USAGE_ACCEPT_IND", pUsageAcceptInd);
			cmd.addParameter("@P_USER", pUser);
			cmd.addParameter("@P_PIN", pPin);
			cmd.addParameter("@P_PIN_EXP_DATE", pPinExpDate);
			cmd.addParameter("@P_EXTERNAL_USER", pExternalUser);
			cmd.addParameter("@P_QUESTION", pQuestion);
			cmd.addParameter("@P_RESPONSE", pResponse);
			cmd.addParameter("@P_INSERT_SOURCE", pInsertSource);
			cmd.addParameter("@P_LDAP_USER", pLdapUser);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_SALT", pSalt);
			cmd.addParameter("@P_NOTIFICATION_IND", pNotificationInd);
			cmd.addParameter("@P_PIN_REUSECHK_IND", pPinReusechkInd);
			cmd.addParameter("@P_PIN_ENCRYPT_IND", pPinEncryptInd);
			cmd.addParameter("@P_PIN_VALIDATE_IND", pPinValidateInd);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	
}
