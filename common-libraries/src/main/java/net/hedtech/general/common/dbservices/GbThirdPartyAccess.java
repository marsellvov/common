package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class GbThirdPartyAccess {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_THIRD_PARTY_ACCESS.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NNumber pPidm,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_THIRD_PARTY_ACCESS.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fExternalPin(NNumber pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_THIRD_PARTY_ACCESS.F_EXTERNAL_PIN", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetPinhash(NNumber pPidm,NString pCleartextPin) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_THIRD_PARTY_ACCESS.F_GET_PINHASH", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_CLEARTEXT_PIN", pCleartextPin);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(ThirdPartyAccessRecRow recOne,ThirdPartyAccessRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_THIRD_PARTY_ACCESS.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, ThirdPartyAccessRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, ThirdPartyAccessRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fProcPin(NNumber pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_THIRD_PARTY_ACCESS.F_PROC_PIN", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NNumber pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_THIRD_PARTY_ACCESS.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_THIRD_PARTY_ACCESS.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NNumber pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_THIRD_PARTY_ACCESS.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NNumber pPidm,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_THIRD_PARTY_ACCESS.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static NBool fValidatePin(NString pPidm,NString pPin,Ref<NString> pExpireInd,Ref<NString> pDisableInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_THIRD_PARTY_ACCESS.F_VALIDATE_PIN", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_PIN", pPin);
			cmd.addParameter("@P_EXPIRE_IND", NString.class);
			cmd.addParameter("@P_DISABLE_IND", NString.class);
				
			cmd.execute();
			pExpireInd.val = cmd.getParameterValue("@P_EXPIRE_IND", NString.class);
			pDisableInd.val = cmd.getParameterValue("@P_DISABLE_IND", NString.class);

			return cmd.getReturnValue(NBool.class);

		}
		
		public static void pCreate(NNumber pPidm,NString pPinDisabledInd,NString pUsageAcceptInd,NString pUser,NString pPin,NDate pPinExpDate,NString pQuestion,NString pResponse,NString pInsertSource,NString pLdapUser,NString pDataOrigin,NString pSalt,NString pNotificationInd,NString pPinReusechkInd,NString pPinEncryptInd,NString pPinValidateInd,Ref<NString> pExternalUserInout,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_THIRD_PARTY_ACCESS.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_PIN_DISABLED_IND", pPinDisabledInd);
			cmd.addParameter("@P_USAGE_ACCEPT_IND", pUsageAcceptInd);
			cmd.addParameter("@P_USER", pUser);
			cmd.addParameter("@P_PIN", pPin);
			cmd.addParameter("@P_PIN_EXP_DATE", pPinExpDate);
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
			cmd.addParameter("@P_EXTERNAL_USER_INOUT", pExternalUserInout, true);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pExternalUserInout.val = cmd.getParameterValue("@P_EXTERNAL_USER_INOUT", NString.class);
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pLock(NNumber pPidm,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_THIRD_PARTY_ACCESS.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NNumber pPidm,NString pPinDisabledInd,NString pUsageAcceptInd,NString pUser,NString pPin,NDate pPinExpDate,NString pExternalUser,NString pQuestion,NString pResponse,NString pInsertSource,NString pLdapUser,NString pDataOrigin,NString pSalt,NString pNotificationInd,NString pPinReusechkInd,NString pPinEncryptInd,NString pPinValidateInd,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_THIRD_PARTY_ACCESS.P_UPDATE", DbManager.getDataBaseFactory());
			
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
		
	
	
	@DbRecordType(id="ThirdPartyAccessRecRow", dataSourceName="THIRD_PARTY_ACCESS_REC")
	public static class ThirdPartyAccessRecRow
	{
		@DbRecordField(dataSourceName="R_PIDM")
		public NNumber RPidm;
		@DbRecordField(dataSourceName="R_PIN_DISABLED_IND")
		public NString RPinDisabledInd;
		@DbRecordField(dataSourceName="R_USAGE_ACCEPT_IND")
		public NString RUsageAcceptInd;
		@DbRecordField(dataSourceName="R_USER")
		public NString RUser;
		@DbRecordField(dataSourceName="R_PIN")
		public NString RPin;
		@DbRecordField(dataSourceName="R_PIN_EXP_DATE")
		public NDate RPinExpDate;
		@DbRecordField(dataSourceName="R_EXTERNAL_USER")
		public NString RExternalUser;
		@DbRecordField(dataSourceName="R_QUESTION")
		public NString RQuestion;
		@DbRecordField(dataSourceName="R_RESPONSE")
		public NString RResponse;
		@DbRecordField(dataSourceName="R_INSERT_SOURCE")
		public NString RInsertSource;
		@DbRecordField(dataSourceName="R_LDAP_USER")
		public NString RLdapUser;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_SALT")
		public NString RSalt;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
