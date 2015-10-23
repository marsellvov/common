package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class GpGpbprxy {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GP_GPBPRXY.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NNumber pProxyIdm,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GP_GPBPRXY.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PROXY_IDM", pProxyIdm);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(GpbprxyRecRow recOne,GpbprxyRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GP_GPBPRXY.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, GpbprxyRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, GpbprxyRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NNumber pProxyIdm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GP_GPBPRXY.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PROXY_IDM", pProxyIdm);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GP_GPBPRXY.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NNumber pProxyIdm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GP_GPBPRXY.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PROXY_IDM", pProxyIdm);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneByEmail(NString pEmailAddress) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GP_GPBPRXY.F_QUERY_ONE_BY_EMAIL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_EMAIL_ADDRESS", pEmailAddress);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneByPidm(NNumber pProxyPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GP_GPBPRXY.F_QUERY_ONE_BY_PIDM", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PROXY_PIDM", pProxyPidm);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NNumber pProxyIdm,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GP_GPBPRXY.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PROXY_IDM", pProxyIdm);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NNumber pProxyIdm,NString pEmailAddress,NString pLastName,NNumber pProxyPidm,NDate pEmailVerDate,NString pFirstName,NString pPin,NString pPinDisabledInd,NDate pPinExpDate,NDate pLastLoginDate,NNumber pInvLoginCnt,NString pSalt,NString pCreateUser,NDate pCreateDate,NString pUserId,NDate pOptOutAdvDate,NString pEntityCde,NString pMi,NString pId,NString pStreetLine1,NString pStreetLine2,NString pStreetLine3,NString pStreetLine4,NString pCity,NString pStatCode,NString pZip,NString pNatnCode,NString pCntyCode,NString pSsn,NDate pBirthDate,NString pSex,NString pAtypCode,NString pTeleCode,NString pEmalCode,NString pAsrcCode,NString pHouseNumber,NString pSurnamePrefix,NString pPhoneArea,NString pPhoneNumber,NString pPhoneExt,NString pCtryCodePhone,NString pNamePrefix,NString pNameSuffix,NString pPrefFirstName,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GP_GPBPRXY.P_CREATE", DbManager.getDataBaseFactory());
			
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
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NNumber pProxyIdm,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GP_GPBPRXY.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PROXY_IDM", pProxyIdm);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NNumber pProxyIdm,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GP_GPBPRXY.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PROXY_IDM", pProxyIdm);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NNumber pProxyIdm,NString pEmailAddress,NString pLastName,NNumber pProxyPidm,NDate pEmailVerDate,NString pFirstName,NString pPin,NString pPinDisabledInd,NDate pPinExpDate,NDate pLastLoginDate,NNumber pInvLoginCnt,NString pSalt,NString pCreateUser,NDate pCreateDate,NString pUserId,NDate pOptOutAdvDate,NString pEntityCde,NString pMi,NString pId,NString pStreetLine1,NString pStreetLine2,NString pStreetLine3,NString pStreetLine4,NString pCity,NString pStatCode,NString pZip,NString pNatnCode,NString pCntyCode,NString pSsn,NDate pBirthDate,NString pSex,NString pAtypCode,NString pTeleCode,NString pEmalCode,NString pAsrcCode,NString pHouseNumber,NString pSurnamePrefix,NString pPhoneArea,NString pPhoneNumber,NString pPhoneExt,NString pCtryCodePhone,NString pNamePrefix,NString pNameSuffix,NString pPrefFirstName,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GP_GPBPRXY.P_UPDATE", DbManager.getDataBaseFactory());
			
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
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="GpbprxyRecRow", dataSourceName="GPBPRXY_REC")
	public static class GpbprxyRecRow
	{
		@DbRecordField(dataSourceName="R_PROXY_IDM")
		public NNumber RProxyIdm;
		@DbRecordField(dataSourceName="R_EMAIL_ADDRESS")
		public NString REmailAddress;
		@DbRecordField(dataSourceName="R_LAST_NAME")
		public NString RLastName;
		@DbRecordField(dataSourceName="R_PROXY_PIDM")
		public NNumber RProxyPidm;
		@DbRecordField(dataSourceName="R_EMAIL_VER_DATE")
		public NDate REmailVerDate;
		@DbRecordField(dataSourceName="R_FIRST_NAME")
		public NString RFirstName;
		@DbRecordField(dataSourceName="R_PIN")
		public NString RPin;
		@DbRecordField(dataSourceName="R_PIN_DISABLED_IND")
		public NString RPinDisabledInd;
		@DbRecordField(dataSourceName="R_PIN_EXP_DATE")
		public NDate RPinExpDate;
		@DbRecordField(dataSourceName="R_LAST_LOGIN_DATE")
		public NDate RLastLoginDate;
		@DbRecordField(dataSourceName="R_INV_LOGIN_CNT")
		public NNumber RInvLoginCnt;
		@DbRecordField(dataSourceName="R_SALT")
		public NString RSalt;
		@DbRecordField(dataSourceName="R_CREATE_USER")
		public NString RCreateUser;
		@DbRecordField(dataSourceName="R_CREATE_DATE")
		public NDate RCreateDate;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_OPT_OUT_ADV_DATE")
		public NDate ROptOutAdvDate;
		@DbRecordField(dataSourceName="R_ENTITY_CDE")
		public NString REntityCde;
		@DbRecordField(dataSourceName="R_MI")
		public NString RMi;
		@DbRecordField(dataSourceName="R_ID")
		public NString RId;
		@DbRecordField(dataSourceName="R_STREET_LINE1")
		public NString RStreetLine1;
		@DbRecordField(dataSourceName="R_STREET_LINE2")
		public NString RStreetLine2;
		@DbRecordField(dataSourceName="R_STREET_LINE3")
		public NString RStreetLine3;
		@DbRecordField(dataSourceName="R_STREET_LINE4")
		public NString RStreetLine4;
		@DbRecordField(dataSourceName="R_CITY")
		public NString RCity;
		@DbRecordField(dataSourceName="R_STAT_CODE")
		public NString RStatCode;
		@DbRecordField(dataSourceName="R_ZIP")
		public NString RZip;
		@DbRecordField(dataSourceName="R_NATN_CODE")
		public NString RNatnCode;
		@DbRecordField(dataSourceName="R_CNTY_CODE")
		public NString RCntyCode;
		@DbRecordField(dataSourceName="R_SSN")
		public NString RSsn;
		@DbRecordField(dataSourceName="R_BIRTH_DATE")
		public NDate RBirthDate;
		@DbRecordField(dataSourceName="R_SEX")
		public NString RSex;
		@DbRecordField(dataSourceName="R_ATYP_CODE")
		public NString RAtypCode;
		@DbRecordField(dataSourceName="R_TELE_CODE")
		public NString RTeleCode;
		@DbRecordField(dataSourceName="R_EMAL_CODE")
		public NString REmalCode;
		@DbRecordField(dataSourceName="R_ASRC_CODE")
		public NString RAsrcCode;
		@DbRecordField(dataSourceName="R_HOUSE_NUMBER")
		public NString RHouseNumber;
		@DbRecordField(dataSourceName="R_SURNAME_PREFIX")
		public NString RSurnamePrefix;
		@DbRecordField(dataSourceName="R_PHONE_AREA")
		public NString RPhoneArea;
		@DbRecordField(dataSourceName="R_PHONE_NUMBER")
		public NString RPhoneNumber;
		@DbRecordField(dataSourceName="R_PHONE_EXT")
		public NString RPhoneExt;
		@DbRecordField(dataSourceName="R_CTRY_CODE_PHONE")
		public NString RCtryCodePhone;
		@DbRecordField(dataSourceName="R_NAME_PREFIX")
		public NString RNamePrefix;
		@DbRecordField(dataSourceName="R_NAME_SUFFIX")
		public NString RNameSuffix;
		@DbRecordField(dataSourceName="R_PREF_FIRST_NAME")
		public NString RPrefFirstName;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
