package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class GbThirdPartyAccessRules {
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_THIRD_PARTY_ACCESS_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NNumber pPidm,NString pPinDisabledInd,NString pUsageAcceptInd,NString pUser,NString pPin,NDate pPinExpDate,NString pExternalUser,NString pQuestion,NString pResponse,NString pInsertSource,NString pLdapUser,NString pDataOrigin,NString pSalt,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_THIRD_PARTY_ACCESS_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
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
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NNumber pPidm,NString pPinDisabledInd,NString pUsageAcceptInd,NString pUser,NString pPin,NDate pPinExpDate,NString pExternalUser,NString pQuestion,NString pResponse,NString pInsertSource,NString pLdapUser,NString pDataOrigin,NString pSalt,NString pValidatePin,NString pPinReusechkInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_THIRD_PARTY_ACCESS_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
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
			cmd.addParameter("@P_VALIDATE_PIN", pValidatePin);
			cmd.addParameter("@P_PIN_REUSECHK_IND", pPinReusechkInd);
				
			cmd.execute();


		}
		
		public static void pValidatePinrules(NNumber pPidm,NString pPin,NString pPinReusechkInd,Ref<NString> errorMessage) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_THIRD_PARTY_ACCESS_RULES.P_VALIDATE_PINRULES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_PIN", pPin);
			cmd.addParameter("@P_PIN_REUSECHK_IND", pPinReusechkInd);
			cmd.addParameter("@ERROR_MESSAGE", NString.class);
				
			cmd.execute();
			errorMessage.val = cmd.getParameterValue("@ERROR_MESSAGE", NString.class);


		}
		
	
	
	
}
