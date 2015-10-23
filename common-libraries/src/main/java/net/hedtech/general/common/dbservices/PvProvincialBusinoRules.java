package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class PvProvincialBusinoRules {
		public static NString fParentExists(NString pMtinCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_PROVINCIAL_BUSINO_RULES.F_PARENT_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_MTIN_CODE", pMtinCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_PROVINCIAL_BUSINO_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NString pMtinCode,NString pProvCode,NString pXmitNumber,NNumber pXmitType,NString pXmitNameLine1,NString pXmitNameLine2,NString pXmitAddressLine1,NString pXmitAddressLine2,NString pXmitCity,NString pXmitProvCode,NString pXmitPostalCode,NString pXmitNatnCode,NString pContactName,NString pUserId,NString pSoftwareCertNum,NString pContactArea,NString pContactPhone,NString pContactExt,NString pEmailAddress,NString pLanguageInd,NString pDataOrigin,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_PROVINCIAL_BUSINO_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_MTIN_CODE", pMtinCode);
			cmd.addParameter("@P_PROV_CODE", pProvCode);
			cmd.addParameter("@P_XMIT_NUMBER", pXmitNumber);
			cmd.addParameter("@P_XMIT_TYPE", pXmitType);
			cmd.addParameter("@P_XMIT_NAME_LINE_1", pXmitNameLine1);
			cmd.addParameter("@P_XMIT_NAME_LINE_2", pXmitNameLine2);
			cmd.addParameter("@P_XMIT_ADDRESS_LINE_1", pXmitAddressLine1);
			cmd.addParameter("@P_XMIT_ADDRESS_LINE_2", pXmitAddressLine2);
			cmd.addParameter("@P_XMIT_CITY", pXmitCity);
			cmd.addParameter("@P_XMIT_PROV_CODE", pXmitProvCode);
			cmd.addParameter("@P_XMIT_POSTAL_CODE", pXmitPostalCode);
			cmd.addParameter("@P_XMIT_NATN_CODE", pXmitNatnCode);
			cmd.addParameter("@P_CONTACT_NAME", pContactName);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_SOFTWARE_CERT_NUM", pSoftwareCertNum);
			cmd.addParameter("@P_CONTACT_AREA", pContactArea);
			cmd.addParameter("@P_CONTACT_PHONE", pContactPhone);
			cmd.addParameter("@P_CONTACT_EXT", pContactExt);
			cmd.addParameter("@P_EMAIL_ADDRESS", pEmailAddress);
			cmd.addParameter("@P_LANGUAGE_IND", pLanguageInd);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NString pMtinCode,NString pProvCode,NString pXmitNumber,NNumber pXmitType,NString pXmitNameLine1,NString pXmitNameLine2,NString pXmitAddressLine1,NString pXmitAddressLine2,NString pXmitCity,NString pXmitProvCode,NString pXmitPostalCode,NString pXmitNatnCode,NString pContactName,NString pUserId,NString pSoftwareCertNum,NString pContactArea,NString pContactPhone,NString pContactExt,NString pEmailAddress,NString pLanguageInd,NString pDataOrigin) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_PROVINCIAL_BUSINO_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_MTIN_CODE", pMtinCode);
			cmd.addParameter("@P_PROV_CODE", pProvCode);
			cmd.addParameter("@P_XMIT_NUMBER", pXmitNumber);
			cmd.addParameter("@P_XMIT_TYPE", pXmitType);
			cmd.addParameter("@P_XMIT_NAME_LINE_1", pXmitNameLine1);
			cmd.addParameter("@P_XMIT_NAME_LINE_2", pXmitNameLine2);
			cmd.addParameter("@P_XMIT_ADDRESS_LINE_1", pXmitAddressLine1);
			cmd.addParameter("@P_XMIT_ADDRESS_LINE_2", pXmitAddressLine2);
			cmd.addParameter("@P_XMIT_CITY", pXmitCity);
			cmd.addParameter("@P_XMIT_PROV_CODE", pXmitProvCode);
			cmd.addParameter("@P_XMIT_POSTAL_CODE", pXmitPostalCode);
			cmd.addParameter("@P_XMIT_NATN_CODE", pXmitNatnCode);
			cmd.addParameter("@P_CONTACT_NAME", pContactName);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_SOFTWARE_CERT_NUM", pSoftwareCertNum);
			cmd.addParameter("@P_CONTACT_AREA", pContactArea);
			cmd.addParameter("@P_CONTACT_PHONE", pContactPhone);
			cmd.addParameter("@P_CONTACT_EXT", pContactExt);
			cmd.addParameter("@P_EMAIL_ADDRESS", pEmailAddress);
			cmd.addParameter("@P_LANGUAGE_IND", pLanguageInd);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
				
			cmd.execute();


		}
		
	
	
	
}
