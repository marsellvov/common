package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class PvProvincialBusNoRules {
		public static NString fParentExists(NString pEmprCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_PROVINCIAL_BUS_NO_RULES.F_PARENT_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_EMPR_CODE", pEmprCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_PROVINCIAL_BUS_NO_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NString pEmprCode,NString pProvCode,NString pBusinessNumber,NString pContactName,NString pUserId,NString pEnterpriseNumber,NString pContactArea,NString pContactPhone,NString pContactExt,NString pEmailAddress,NString pLanguageInd,NString pDataOrigin,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_PROVINCIAL_BUS_NO_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_EMPR_CODE", pEmprCode);
			cmd.addParameter("@P_PROV_CODE", pProvCode);
			cmd.addParameter("@P_BUSINESS_NUMBER", pBusinessNumber);
			cmd.addParameter("@P_CONTACT_NAME", pContactName);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_ENTERPRISE_NUMBER", pEnterpriseNumber);
			cmd.addParameter("@P_CONTACT_AREA", pContactArea);
			cmd.addParameter("@P_CONTACT_PHONE", pContactPhone);
			cmd.addParameter("@P_CONTACT_EXT", pContactExt);
			cmd.addParameter("@P_EMAIL_ADDRESS", pEmailAddress);
			cmd.addParameter("@P_LANGUAGE_IND", pLanguageInd);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NString pEmprCode,NString pProvCode,NString pBusinessNumber,NString pContactName,NString pUserId,NString pEnterpriseNumber,NString pContactArea,NString pContactPhone,NString pContactExt,NString pEmailAddress,NString pLanguageInd,NString pDataOrigin) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_PROVINCIAL_BUS_NO_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_EMPR_CODE", pEmprCode);
			cmd.addParameter("@P_PROV_CODE", pProvCode);
			cmd.addParameter("@P_BUSINESS_NUMBER", pBusinessNumber);
			cmd.addParameter("@P_CONTACT_NAME", pContactName);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_ENTERPRISE_NUMBER", pEnterpriseNumber);
			cmd.addParameter("@P_CONTACT_AREA", pContactArea);
			cmd.addParameter("@P_CONTACT_PHONE", pContactPhone);
			cmd.addParameter("@P_CONTACT_EXT", pContactExt);
			cmd.addParameter("@P_EMAIL_ADDRESS", pEmailAddress);
			cmd.addParameter("@P_LANGUAGE_IND", pLanguageInd);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
				
			cmd.execute();


		}
		
	
	
	
}
