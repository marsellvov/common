package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class GpGpbprxyRules {
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GP_GPBPRXY_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NNumber pProxyIdm,NString pEmailAddress,NString pLastName,NNumber pProxyPidm,NDate pEmailVerDate,NString pFirstName,NString pPin,NString pPinDisabledInd,NDate pPinExpDate,NDate pLastLoginDate,NNumber pInvLoginCnt,NString pSalt,NString pCreateUser,NDate pCreateDate,NString pUserId,NDate pOptOutAdvDate,NString pEntityCde,NString pMi,NString pId,NString pStreetLine1,NString pStreetLine2,NString pStreetLine3,NString pStreetLine4,NString pCity,NString pStatCode,NString pZip,NString pNatnCode,NString pCntyCode,NString pSsn,NDate pBirthDate,NString pSex,NString pAtypCode,NString pTeleCode,NString pEmalCode,NString pAsrcCode,NString pHouseNumber,NString pSurnamePrefix,NString pPhoneArea,NString pPhoneNumber,NString pPhoneExt,NString pCtryCodePhone,NString pNamePrefix,NString pNameSuffix,NString pPrefFirstName,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GP_GPBPRXY_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_PROXY_IDM", pProxyIdm);
			cmd.addParameter("@P_EMAIL_ADDRESS", pEmailAddress);
			cmd.addParameter("@P_LAST_NAME", pLastName);
			cmd.addParameter("@P_PROXY_PIDM", pProxyPidm);
			cmd.addParameter("@P_EMAIL_VER_DATE", pEmailVerDate);
			cmd.addParameter("@P_FIRST_NAME", pFirstName);
			cmd.addParameter("@P_PIN", pPin);
			cmd.addParameter("@P_PIN_DISABLED_IND", pPinDisabledInd);
			cmd.addParameter("@P_PIN_EXP_DATE", pPinExpDate);
			cmd.addParameter("@P_LAST_LOGIN_DATE", pLastLoginDate);
			cmd.addParameter("@P_INV_LOGIN_CNT", pInvLoginCnt);
			cmd.addParameter("@P_SALT", pSalt);
			cmd.addParameter("@P_CREATE_USER", pCreateUser);
			cmd.addParameter("@P_CREATE_DATE", pCreateDate);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_OPT_OUT_ADV_DATE", pOptOutAdvDate);
			cmd.addParameter("@P_ENTITY_CDE", pEntityCde);
			cmd.addParameter("@P_MI", pMi);
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_STREET_LINE1", pStreetLine1);
			cmd.addParameter("@P_STREET_LINE2", pStreetLine2);
			cmd.addParameter("@P_STREET_LINE3", pStreetLine3);
			cmd.addParameter("@P_STREET_LINE4", pStreetLine4);
			cmd.addParameter("@P_CITY", pCity);
			cmd.addParameter("@P_STAT_CODE", pStatCode);
			cmd.addParameter("@P_ZIP", pZip);
			cmd.addParameter("@P_NATN_CODE", pNatnCode);
			cmd.addParameter("@P_CNTY_CODE", pCntyCode);
			cmd.addParameter("@P_SSN", pSsn);
			cmd.addParameter("@P_BIRTH_DATE", pBirthDate);
			cmd.addParameter("@P_SEX", pSex);
			cmd.addParameter("@P_ATYP_CODE", pAtypCode);
			cmd.addParameter("@P_TELE_CODE", pTeleCode);
			cmd.addParameter("@P_EMAL_CODE", pEmalCode);
			cmd.addParameter("@P_ASRC_CODE", pAsrcCode);
			cmd.addParameter("@P_HOUSE_NUMBER", pHouseNumber);
			cmd.addParameter("@P_SURNAME_PREFIX", pSurnamePrefix);
			cmd.addParameter("@P_PHONE_AREA", pPhoneArea);
			cmd.addParameter("@P_PHONE_NUMBER", pPhoneNumber);
			cmd.addParameter("@P_PHONE_EXT", pPhoneExt);
			cmd.addParameter("@P_CTRY_CODE_PHONE", pCtryCodePhone);
			cmd.addParameter("@P_NAME_PREFIX", pNamePrefix);
			cmd.addParameter("@P_NAME_SUFFIX", pNameSuffix);
			cmd.addParameter("@P_PREF_FIRST_NAME", pPrefFirstName);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NNumber pProxyIdm,NString pEmailAddress,NString pLastName,NNumber pProxyPidm,NDate pEmailVerDate,NString pFirstName,NString pPin,NString pPinDisabledInd,NDate pPinExpDate,NDate pLastLoginDate,NNumber pInvLoginCnt,NString pSalt,NString pCreateUser,NDate pCreateDate,NString pUserId,NDate pOptOutAdvDate,NString pEntityCde,NString pMi,NString pId,NString pStreetLine1,NString pStreetLine2,NString pStreetLine3,NString pStreetLine4,NString pCity,NString pStatCode,NString pZip,NString pNatnCode,NString pCntyCode,NString pSsn,NDate pBirthDate,NString pSex,NString pAtypCode,NString pTeleCode,NString pEmalCode,NString pAsrcCode,NString pHouseNumber,NString pSurnamePrefix,NString pPhoneArea,NString pPhoneNumber,NString pPhoneExt,NString pCtryCodePhone,NString pNamePrefix,NString pNameSuffix,NString pPrefFirstName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GP_GPBPRXY_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PROXY_IDM", pProxyIdm);
			cmd.addParameter("@P_EMAIL_ADDRESS", pEmailAddress);
			cmd.addParameter("@P_LAST_NAME", pLastName);
			cmd.addParameter("@P_PROXY_PIDM", pProxyPidm);
			cmd.addParameter("@P_EMAIL_VER_DATE", pEmailVerDate);
			cmd.addParameter("@P_FIRST_NAME", pFirstName);
			cmd.addParameter("@P_PIN", pPin);
			cmd.addParameter("@P_PIN_DISABLED_IND", pPinDisabledInd);
			cmd.addParameter("@P_PIN_EXP_DATE", pPinExpDate);
			cmd.addParameter("@P_LAST_LOGIN_DATE", pLastLoginDate);
			cmd.addParameter("@P_INV_LOGIN_CNT", pInvLoginCnt);
			cmd.addParameter("@P_SALT", pSalt);
			cmd.addParameter("@P_CREATE_USER", pCreateUser);
			cmd.addParameter("@P_CREATE_DATE", pCreateDate);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_OPT_OUT_ADV_DATE", pOptOutAdvDate);
			cmd.addParameter("@P_ENTITY_CDE", pEntityCde);
			cmd.addParameter("@P_MI", pMi);
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_STREET_LINE1", pStreetLine1);
			cmd.addParameter("@P_STREET_LINE2", pStreetLine2);
			cmd.addParameter("@P_STREET_LINE3", pStreetLine3);
			cmd.addParameter("@P_STREET_LINE4", pStreetLine4);
			cmd.addParameter("@P_CITY", pCity);
			cmd.addParameter("@P_STAT_CODE", pStatCode);
			cmd.addParameter("@P_ZIP", pZip);
			cmd.addParameter("@P_NATN_CODE", pNatnCode);
			cmd.addParameter("@P_CNTY_CODE", pCntyCode);
			cmd.addParameter("@P_SSN", pSsn);
			cmd.addParameter("@P_BIRTH_DATE", pBirthDate);
			cmd.addParameter("@P_SEX", pSex);
			cmd.addParameter("@P_ATYP_CODE", pAtypCode);
			cmd.addParameter("@P_TELE_CODE", pTeleCode);
			cmd.addParameter("@P_EMAL_CODE", pEmalCode);
			cmd.addParameter("@P_ASRC_CODE", pAsrcCode);
			cmd.addParameter("@P_HOUSE_NUMBER", pHouseNumber);
			cmd.addParameter("@P_SURNAME_PREFIX", pSurnamePrefix);
			cmd.addParameter("@P_PHONE_AREA", pPhoneArea);
			cmd.addParameter("@P_PHONE_NUMBER", pPhoneNumber);
			cmd.addParameter("@P_PHONE_EXT", pPhoneExt);
			cmd.addParameter("@P_CTRY_CODE_PHONE", pCtryCodePhone);
			cmd.addParameter("@P_NAME_PREFIX", pNamePrefix);
			cmd.addParameter("@P_NAME_SUFFIX", pNameSuffix);
			cmd.addParameter("@P_PREF_FIRST_NAME", pPrefFirstName);
				
			cmd.execute();


		}
		
	
	
	
}
