package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class GbBldgdefinitionRules {
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_BLDGDEFINITION_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NString pBldgCode,NString pCampCode,NNumber pCapacity,NNumber pMaximumCapacity,NString pRrcdCode,NString pPrcdCode,NString pSiteCode,NString pStreetLine1,NString pStreetLine2,NString pStreetLine3,NString pCity,NString pStatCode,NString pZip,NString pCntyCode,NString pPhoneArea,NString pPhoneNumber,NString pPhoneExtension,NString pSex,NString pCollCode,NString pDeptCode,NString pKeyNumber,NString pParsCode,NString pDataOrigin,NString pUserId,NString pCtryCodePhone,NString pHouseNumber,NString pStreetLine4,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_BLDGDEFINITION_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_BLDG_CODE", pBldgCode);
			cmd.addParameter("@P_CAMP_CODE", pCampCode);
			cmd.addParameter("@P_CAPACITY", pCapacity);
			cmd.addParameter("@P_MAXIMUM_CAPACITY", pMaximumCapacity);
			cmd.addParameter("@P_RRCD_CODE", pRrcdCode);
			cmd.addParameter("@P_PRCD_CODE", pPrcdCode);
			cmd.addParameter("@P_SITE_CODE", pSiteCode);
			cmd.addParameter("@P_STREET_LINE1", pStreetLine1);
			cmd.addParameter("@P_STREET_LINE2", pStreetLine2);
			cmd.addParameter("@P_STREET_LINE3", pStreetLine3);
			cmd.addParameter("@P_CITY", pCity);
			cmd.addParameter("@P_STAT_CODE", pStatCode);
			cmd.addParameter("@P_ZIP", pZip);
			cmd.addParameter("@P_CNTY_CODE", pCntyCode);
			cmd.addParameter("@P_PHONE_AREA", pPhoneArea);
			cmd.addParameter("@P_PHONE_NUMBER", pPhoneNumber);
			cmd.addParameter("@P_PHONE_EXTENSION", pPhoneExtension);
			cmd.addParameter("@P_SEX", pSex);
			cmd.addParameter("@P_COLL_CODE", pCollCode);
			cmd.addParameter("@P_DEPT_CODE", pDeptCode);
			cmd.addParameter("@P_KEY_NUMBER", pKeyNumber);
			cmd.addParameter("@P_PARS_CODE", pParsCode);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_CTRY_CODE_PHONE", pCtryCodePhone);
			cmd.addParameter("@P_HOUSE_NUMBER", pHouseNumber);
			cmd.addParameter("@P_STREET_LINE4", pStreetLine4);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NString pBldgCode,NString pCampCode,NNumber pCapacity,NNumber pMaximumCapacity,NString pRrcdCode,NString pPrcdCode,NString pSiteCode,NString pStreetLine1,NString pStreetLine2,NString pStreetLine3,NString pCity,NString pStatCode,NString pZip,NString pCntyCode,NString pPhoneArea,NString pPhoneNumber,NString pPhoneExtension,NString pSex,NString pCollCode,NString pDeptCode,NString pKeyNumber,NString pParsCode,NString pDataOrigin,NString pUserId,NString pCtryCodePhone,NString pHouseNumber,NString pStreetLine4) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_BLDGDEFINITION_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_BLDG_CODE", pBldgCode);
			cmd.addParameter("@P_CAMP_CODE", pCampCode);
			cmd.addParameter("@P_CAPACITY", pCapacity);
			cmd.addParameter("@P_MAXIMUM_CAPACITY", pMaximumCapacity);
			cmd.addParameter("@P_RRCD_CODE", pRrcdCode);
			cmd.addParameter("@P_PRCD_CODE", pPrcdCode);
			cmd.addParameter("@P_SITE_CODE", pSiteCode);
			cmd.addParameter("@P_STREET_LINE1", pStreetLine1);
			cmd.addParameter("@P_STREET_LINE2", pStreetLine2);
			cmd.addParameter("@P_STREET_LINE3", pStreetLine3);
			cmd.addParameter("@P_CITY", pCity);
			cmd.addParameter("@P_STAT_CODE", pStatCode);
			cmd.addParameter("@P_ZIP", pZip);
			cmd.addParameter("@P_CNTY_CODE", pCntyCode);
			cmd.addParameter("@P_PHONE_AREA", pPhoneArea);
			cmd.addParameter("@P_PHONE_NUMBER", pPhoneNumber);
			cmd.addParameter("@P_PHONE_EXTENSION", pPhoneExtension);
			cmd.addParameter("@P_SEX", pSex);
			cmd.addParameter("@P_COLL_CODE", pCollCode);
			cmd.addParameter("@P_DEPT_CODE", pDeptCode);
			cmd.addParameter("@P_KEY_NUMBER", pKeyNumber);
			cmd.addParameter("@P_PARS_CODE", pParsCode);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_CTRY_CODE_PHONE", pCtryCodePhone);
			cmd.addParameter("@P_HOUSE_NUMBER", pHouseNumber);
			cmd.addParameter("@P_STREET_LINE4", pStreetLine4);
				
			cmd.execute();


		}
		
	
	
	
}
