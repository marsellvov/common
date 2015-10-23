package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwgkpxya {
		public static NNumber fGetproxyidm(NString pEmail) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWGKPXYA.F_GETPROXYIDM", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_EMAIL", pEmail);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString fValidIdmx(NNumber pProxyidm,NString pCallingProcedure,NNumber pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWGKPXYA.F_VALID_IDMX", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PROXYIDM", pProxyidm);
			cmd.addParameter("@P_CALLING_PROCEDURE", pCallingProcedure);
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pPaAction(NString pToken,NString pVerify,NString pSubmit,NString accessibility) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWGKPXYA.P_PA_ACTION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TOKEN", pToken);
			cmd.addParameter("@P_VERIFY", pVerify);
			cmd.addParameter("@P_SUBMIT", pSubmit);
			cmd.addParameter("@ACCESSIBILITY", accessibility);
				
			cmd.execute();


		}
		
		public static void pPaActionverify(NString pToken) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWGKPXYA.P_PA_ACTIONVERIFY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TOKEN", pToken);
				
			cmd.execute();


		}
		
		public static void pPaCancelemail(NNumber pProxyidm,NString pEmail1,NString pEmail2) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWGKPXYA.P_PA_CANCELEMAIL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PROXYIDM", pProxyidm);
			cmd.addParameter("@P_EMAIL1", pEmail1);
			cmd.addParameter("@P_EMAIL2", pEmail2);
				
			cmd.execute();


		}
		
		public static void pPaDeleteretp(NNumber pProxyidm,NNumber pPersonpidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWGKPXYA.P_PA_DELETERETP", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PROXYIDM", pProxyidm);
			cmd.addParameter("@P_PERSONPIDM", pPersonpidm);
				
			cmd.execute();


		}
		
		public static void pPaForgotpin(NNumber pProxyidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWGKPXYA.P_PA_FORGOTPIN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PROXYIDM", pProxyidm);
				
			cmd.execute();


		}
		
		public static void pPaGlobalproxyaccess(NNumber pProxyidm,NString pInfo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWGKPXYA.P_PA_GLOBALPROXYACCESS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PROXYIDM", pProxyidm);
			cmd.addParameter("@P_INFO", pInfo);
				
			cmd.execute();


		}
		
		public static void pPaGrantone(NNumber pProxyidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWGKPXYA.P_PA_GRANTONE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PROXYIDM", pProxyidm);
				
			cmd.execute();


		}
		
		public static void pPaLogin(NString pEmail,NString pPin,NString pLogin,NString pForgot) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWGKPXYA.P_PA_LOGIN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_EMAIL", pEmail);
			cmd.addParameter("@P_PIN", pPin);
			cmd.addParameter("@P_LOGIN", pLogin);
			cmd.addParameter("@P_FORGOT", pForgot);
				
			cmd.execute();


		}
		
		public static void pPaLogtohistory(NNumber pProxyidm,NNumber pPersonpidm,NString pText) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWGKPXYA.P_PA_LOGTOHISTORY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PROXYIDM", pProxyidm);
			cmd.addParameter("@P_PERSONPIDM", pPersonpidm);
			cmd.addParameter("@P_TEXT", pText);
				
			cmd.execute();


		}
		
		public static void pPaProxyaccess(NNumber pProxyidm,NString pInfo,NString pMessage) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWGKPXYA.P_PA_PROXYACCESS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PROXYIDM", pProxyidm);
			cmd.addParameter("@P_INFO", pInfo);
			cmd.addParameter("@P_MESSAGE", pMessage);
				
			cmd.execute();


		}
		
		public static void pPaResetpin(NNumber pProxyidm,NString pInfo,NString pMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWGKPXYA.P_PA_RESETPIN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PROXYIDM", pProxyidm);
			cmd.addParameter("@P_INFO", pInfo);
			cmd.addParameter("@P_MSG", pMsg);
				
			cmd.execute();


		}
		
		public static void pPaSaveemail(NNumber pProxyidm,NString pEmail1,NString pEmail2) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWGKPXYA.P_PA_SAVEEMAIL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PROXYIDM", pProxyidm);
			cmd.addParameter("@P_EMAIL1", pEmail1);
			cmd.addParameter("@P_EMAIL2", pEmail2);
				
			cmd.execute();


		}
		
		public static void pPaSavepin(NNumber pProxyidm,NString pPin1,NString pPin2,NString pEmail,NString pPinOrig,NString pSave) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWGKPXYA.P_PA_SAVEPIN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PROXYIDM", pProxyidm);
			cmd.addParameter("@P_PIN1", pPin1);
			cmd.addParameter("@P_PIN2", pPin2);
			cmd.addParameter("@P_EMAIL", pEmail);
			cmd.addParameter("@P_PIN_ORIG", pPinOrig);
			cmd.addParameter("@P_SAVE", pSave);
				
			cmd.execute();


		}
		
		public static void pPaShowauth(NNumber pProxyidm,NNumber pPersonpidm,NNumber pRequired) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWGKPXYA.P_PA_SHOWAUTH", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PROXYIDM", pProxyidm);
			cmd.addParameter("@P_PERSONPIDM", pPersonpidm);
			cmd.addParameter("@P_REQUIRED", pRequired);
				
			cmd.execute();


		}
		
		public static void pPaShowprofile(NNumber pProxyidm,NString pMessage) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWGKPXYA.P_PA_SHOWPROFILE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PROXYIDM", pProxyidm);
			cmd.addParameter("@P_MESSAGE", pMessage);
				
			cmd.execute();


		}
		
		public static void pPaShowselector(NNumber pProxyidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWGKPXYA.P_PA_SHOWSELECTOR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PROXYIDM", pProxyidm);
				
			cmd.execute();


		}
		
		public static void pPaStoreprofile(NNumber pProxyidm,NString pFirstName,NString pMi,NString pLastName,NString pSurnamePrefix,NString pNamePrefix,NString pNameSuffix,NString pPrefFirstName,NString pEmailAddress,NString pPhoneArea,NString pPhoneNumber,NString pPhoneExt,NString pCtryCodePhone,NString pHouseNumber,NString pStreetLine1,NString pStreetLine2,NString pStreetLine3,NString pStreetLine4,NString pCity,NString pStatCode,NString pZip,NString pCntyCode,NString pNatnCode,NString pSex,NString pBirthDate,NString pSsn,NString pOptOutAdvInd,NString pSave) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWGKPXYA.P_PA_STOREPROFILE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PROXYIDM", pProxyidm);
			cmd.addParameter("@P_FIRST_NAME", pFirstName);
			cmd.addParameter("@P_MI", pMi);
			cmd.addParameter("@P_LAST_NAME", pLastName);
			cmd.addParameter("@P_SURNAME_PREFIX", pSurnamePrefix);
			cmd.addParameter("@P_NAME_PREFIX", pNamePrefix);
			cmd.addParameter("@P_NAME_SUFFIX", pNameSuffix);
			cmd.addParameter("@P_PREF_FIRST_NAME", pPrefFirstName);
			cmd.addParameter("@P_EMAIL_ADDRESS", pEmailAddress);
			cmd.addParameter("@P_PHONE_AREA", pPhoneArea);
			cmd.addParameter("@P_PHONE_NUMBER", pPhoneNumber);
			cmd.addParameter("@P_PHONE_EXT", pPhoneExt);
			cmd.addParameter("@P_CTRY_CODE_PHONE", pCtryCodePhone);
			cmd.addParameter("@P_HOUSE_NUMBER", pHouseNumber);
			cmd.addParameter("@P_STREET_LINE1", pStreetLine1);
			cmd.addParameter("@P_STREET_LINE2", pStreetLine2);
			cmd.addParameter("@P_STREET_LINE3", pStreetLine3);
			cmd.addParameter("@P_STREET_LINE4", pStreetLine4);
			cmd.addParameter("@P_CITY", pCity);
			cmd.addParameter("@P_STAT_CODE", pStatCode);
			cmd.addParameter("@P_ZIP", pZip);
			cmd.addParameter("@P_CNTY_CODE", pCntyCode);
			cmd.addParameter("@P_NATN_CODE", pNatnCode);
			cmd.addParameter("@P_SEX", pSex);
			cmd.addParameter("@P_BIRTH_DATE", pBirthDate);
			cmd.addParameter("@P_SSN", pSsn);
			cmd.addParameter("@P_OPT_OUT_ADV_IND", pOptOutAdvInd);
			cmd.addParameter("@P_SAVE", pSave);
				
			cmd.execute();


		}
		
		public static void pPaStoreselector(NNumber pProxyidm,NString pBannerId,NString pRetp,NString pAdd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWGKPXYA.P_PA_STORESELECTOR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PROXYIDM", pProxyidm);
			cmd.addParameter("@P_BANNER_ID", pBannerId);
			cmd.addParameter("@P_RETP", pRetp);
			cmd.addParameter("@P_ADD", pAdd);
				
			cmd.execute();


		}
		
		public static void pSetHash(NNumber pGidm,NString pHash,NString pProc,NString pLabel,NString pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWGKPXYA.P_SET_HASH", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_GIDM", pGidm);
			cmd.addParameter("@P_HASH", pHash);
			cmd.addParameter("@P_PROC", pProc);
			cmd.addParameter("@P_LABEL", pLabel);
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();


		}
		
	
	
	
}
