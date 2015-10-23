package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class GkkbGkradivRules {
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKB_GKRADIV_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NNumber pPidm,NString pAdidCode,NString pAdditionalId,NString pExemptReason,NString pStatusCode,NDate pStatusDate,NDate pVerifiedDate,NString pConsent,NDate pConsentDate,NString pContactMethodCode,NString pDocVerificationInd,NString pSource,NString pUserId,NString pDataOrigin,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKB_GKRADIV_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_ADID_CODE", pAdidCode);
			cmd.addParameter("@P_ADDITIONAL_ID", pAdditionalId);
			cmd.addParameter("@P_EXEMPT_REASON", pExemptReason);
			cmd.addParameter("@P_STATUS_CODE", pStatusCode);
			cmd.addParameter("@P_STATUS_DATE", pStatusDate);
			cmd.addParameter("@P_VERIFIED_DATE", pVerifiedDate);
			cmd.addParameter("@P_CONSENT", pConsent);
			cmd.addParameter("@P_CONSENT_DATE", pConsentDate);
			cmd.addParameter("@P_CONTACT_METHOD_CODE", pContactMethodCode);
			cmd.addParameter("@P_DOC_VERIFICATION_IND", pDocVerificationInd);
			cmd.addParameter("@P_SOURCE", pSource);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NNumber pPidm,NString pAdidCode,NString pAdditionalId,NString pExemptReason,NString pStatusCode,NDate pStatusDate,NDate pVerifiedDate,NString pConsent,NDate pConsentDate,NString pContactMethodCode,NString pDocVerificationInd,NString pSource,NString pUserId,NString pDataOrigin) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKB_GKRADIV_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_ADID_CODE", pAdidCode);
			cmd.addParameter("@P_ADDITIONAL_ID", pAdditionalId);
			cmd.addParameter("@P_EXEMPT_REASON", pExemptReason);
			cmd.addParameter("@P_STATUS_CODE", pStatusCode);
			cmd.addParameter("@P_STATUS_DATE", pStatusDate);
			cmd.addParameter("@P_VERIFIED_DATE", pVerifiedDate);
			cmd.addParameter("@P_CONSENT", pConsent);
			cmd.addParameter("@P_CONSENT_DATE", pConsentDate);
			cmd.addParameter("@P_CONTACT_METHOD_CODE", pContactMethodCode);
			cmd.addParameter("@P_DOC_VERIFICATION_IND", pDocVerificationInd);
			cmd.addParameter("@P_SOURCE", pSource);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
				
			cmd.execute();


		}
		
	
	
	
}
