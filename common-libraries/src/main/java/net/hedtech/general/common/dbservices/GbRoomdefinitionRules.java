package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class GbRoomdefinitionRules {
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_ROOMDEFINITION_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NString pBldgCode,NString pRoomNumber,NString pDesc,NNumber pCapacity,NNumber pMaximumCapacity,NString pRmstCode,NString pRrcdCode,NString pPrcdCode,NNumber pUtilityRate,NString pUtilityRatePeriod,NString pPhoneArea,NString pPhoneNumber,NString pPhoneExtension,NString pBcatCode,NString pSex,NString pRoomType,NString pPriority,NString pCollCode,NString pDeptCode,NString pKeyNumber,NNumber pWidth,NNumber pLength,NNumber pArea,NString pTermCodeEff,NString pParsCode,NString pCtryCodePhone,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_ROOMDEFINITION_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_BLDG_CODE", pBldgCode);
			cmd.addParameter("@P_ROOM_NUMBER", pRoomNumber);
			cmd.addParameter("@P_DESC", pDesc);
			cmd.addParameter("@P_CAPACITY", pCapacity);
			cmd.addParameter("@P_MAXIMUM_CAPACITY", pMaximumCapacity);
			cmd.addParameter("@P_RMST_CODE", pRmstCode);
			cmd.addParameter("@P_RRCD_CODE", pRrcdCode);
			cmd.addParameter("@P_PRCD_CODE", pPrcdCode);
			cmd.addParameter("@P_UTILITY_RATE", pUtilityRate);
			cmd.addParameter("@P_UTILITY_RATE_PERIOD", pUtilityRatePeriod);
			cmd.addParameter("@P_PHONE_AREA", pPhoneArea);
			cmd.addParameter("@P_PHONE_NUMBER", pPhoneNumber);
			cmd.addParameter("@P_PHONE_EXTENSION", pPhoneExtension);
			cmd.addParameter("@P_BCAT_CODE", pBcatCode);
			cmd.addParameter("@P_SEX", pSex);
			cmd.addParameter("@P_ROOM_TYPE", pRoomType);
			cmd.addParameter("@P_PRIORITY", pPriority);
			cmd.addParameter("@P_COLL_CODE", pCollCode);
			cmd.addParameter("@P_DEPT_CODE", pDeptCode);
			cmd.addParameter("@P_KEY_NUMBER", pKeyNumber);
			cmd.addParameter("@P_WIDTH", pWidth);
			cmd.addParameter("@P_LENGTH", pLength);
			cmd.addParameter("@P_AREA", pArea);
			cmd.addParameter("@P_TERM_CODE_EFF", pTermCodeEff);
			cmd.addParameter("@P_PARS_CODE", pParsCode);
			cmd.addParameter("@P_CTRY_CODE_PHONE", pCtryCodePhone);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NString pBldgCode,NString pRoomNumber,NString pDesc,NNumber pCapacity,NNumber pMaximumCapacity,NString pRmstCode,NString pRrcdCode,NString pPrcdCode,NNumber pUtilityRate,NString pUtilityRatePeriod,NString pPhoneArea,NString pPhoneNumber,NString pPhoneExtension,NString pBcatCode,NString pSex,NString pRoomType,NString pPriority,NString pCollCode,NString pDeptCode,NString pKeyNumber,NNumber pWidth,NNumber pLength,NNumber pArea,NString pTermCodeEff,NString pParsCode,NString pCtryCodePhone) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_ROOMDEFINITION_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_BLDG_CODE", pBldgCode);
			cmd.addParameter("@P_ROOM_NUMBER", pRoomNumber);
			cmd.addParameter("@P_DESC", pDesc);
			cmd.addParameter("@P_CAPACITY", pCapacity);
			cmd.addParameter("@P_MAXIMUM_CAPACITY", pMaximumCapacity);
			cmd.addParameter("@P_RMST_CODE", pRmstCode);
			cmd.addParameter("@P_RRCD_CODE", pRrcdCode);
			cmd.addParameter("@P_PRCD_CODE", pPrcdCode);
			cmd.addParameter("@P_UTILITY_RATE", pUtilityRate);
			cmd.addParameter("@P_UTILITY_RATE_PERIOD", pUtilityRatePeriod);
			cmd.addParameter("@P_PHONE_AREA", pPhoneArea);
			cmd.addParameter("@P_PHONE_NUMBER", pPhoneNumber);
			cmd.addParameter("@P_PHONE_EXTENSION", pPhoneExtension);
			cmd.addParameter("@P_BCAT_CODE", pBcatCode);
			cmd.addParameter("@P_SEX", pSex);
			cmd.addParameter("@P_ROOM_TYPE", pRoomType);
			cmd.addParameter("@P_PRIORITY", pPriority);
			cmd.addParameter("@P_COLL_CODE", pCollCode);
			cmd.addParameter("@P_DEPT_CODE", pDeptCode);
			cmd.addParameter("@P_KEY_NUMBER", pKeyNumber);
			cmd.addParameter("@P_WIDTH", pWidth);
			cmd.addParameter("@P_LENGTH", pLength);
			cmd.addParameter("@P_AREA", pArea);
			cmd.addParameter("@P_TERM_CODE_EFF", pTermCodeEff);
			cmd.addParameter("@P_PARS_CODE", pParsCode);
			cmd.addParameter("@P_CTRY_CODE_PHONE", pCtryCodePhone);
				
			cmd.execute();


		}
		
	
	
	
}
