package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class GbEmergencyContactRules {
		public static void pAddressRule() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_EMERGENCY_CONTACT_RULES.P_ADDRESS_RULE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_EMERGENCY_CONTACT_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NNumber pPidm,NString pPriority,NString pLastName,NString pFirstName,NString pMi,NString pStreetLine1,NString pStreetLine2,NString pStreetLine3,NString pCity,NString pStatCode,NString pNatnCode,NString pZip,NString pPhoneArea,NString pPhoneNumber,NString pPhoneExt,NString pReltCode,NString pAtypCode,NString pDataOrigin,NString pUserId,NString pSurnamePrefix,NString pCtryCodePhone,NString pHouseNumber,NString pStreetLine4,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_EMERGENCY_CONTACT_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_PRIORITY", pPriority);
			cmd.addParameter("@P_LAST_NAME", pLastName);
			cmd.addParameter("@P_FIRST_NAME", pFirstName);
			cmd.addParameter("@P_MI", pMi);
			cmd.addParameter("@P_STREET_LINE1", pStreetLine1);
			cmd.addParameter("@P_STREET_LINE2", pStreetLine2);
			cmd.addParameter("@P_STREET_LINE3", pStreetLine3);
			cmd.addParameter("@P_CITY", pCity);
			cmd.addParameter("@P_STAT_CODE", pStatCode);
			cmd.addParameter("@P_NATN_CODE", pNatnCode);
			cmd.addParameter("@P_ZIP", pZip);
			cmd.addParameter("@P_PHONE_AREA", pPhoneArea);
			cmd.addParameter("@P_PHONE_NUMBER", pPhoneNumber);
			cmd.addParameter("@P_PHONE_EXT", pPhoneExt);
			cmd.addParameter("@P_RELT_CODE", pReltCode);
			cmd.addParameter("@P_ATYP_CODE", pAtypCode);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_SURNAME_PREFIX", pSurnamePrefix);
			cmd.addParameter("@P_CTRY_CODE_PHONE", pCtryCodePhone);
			cmd.addParameter("@P_HOUSE_NUMBER", pHouseNumber);
			cmd.addParameter("@P_STREET_LINE4", pStreetLine4);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NNumber pPidm,NString pPriority,NString pLastName,NString pFirstName,NString pMi,NString pStreetLine1,NString pStreetLine2,NString pStreetLine3,NString pCity,NString pStatCode,NString pNatnCode,NString pZip,NString pPhoneArea,NString pPhoneNumber,NString pPhoneExt,NString pReltCode,NString pAtypCode,NString pDataOrigin,NString pUserId,NString pSurnamePrefix,NString pCtryCodePhone,NString pHouseNumber,NString pStreetLine4) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_EMERGENCY_CONTACT_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_PRIORITY", pPriority);
			cmd.addParameter("@P_LAST_NAME", pLastName);
			cmd.addParameter("@P_FIRST_NAME", pFirstName);
			cmd.addParameter("@P_MI", pMi);
			cmd.addParameter("@P_STREET_LINE1", pStreetLine1);
			cmd.addParameter("@P_STREET_LINE2", pStreetLine2);
			cmd.addParameter("@P_STREET_LINE3", pStreetLine3);
			cmd.addParameter("@P_CITY", pCity);
			cmd.addParameter("@P_STAT_CODE", pStatCode);
			cmd.addParameter("@P_NATN_CODE", pNatnCode);
			cmd.addParameter("@P_ZIP", pZip);
			cmd.addParameter("@P_PHONE_AREA", pPhoneArea);
			cmd.addParameter("@P_PHONE_NUMBER", pPhoneNumber);
			cmd.addParameter("@P_PHONE_EXT", pPhoneExt);
			cmd.addParameter("@P_RELT_CODE", pReltCode);
			cmd.addParameter("@P_ATYP_CODE", pAtypCode);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_SURNAME_PREFIX", pSurnamePrefix);
			cmd.addParameter("@P_CTRY_CODE_PHONE", pCtryCodePhone);
			cmd.addParameter("@P_HOUSE_NUMBER", pHouseNumber);
			cmd.addParameter("@P_STREET_LINE4", pStreetLine4);
				
			cmd.execute();


		}
		
	
	
	
}
