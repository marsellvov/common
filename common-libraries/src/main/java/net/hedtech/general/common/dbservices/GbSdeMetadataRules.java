package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class GbSdeMetadataRules {
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_SDE_METADATA_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
//		public static void pRegisterEntity(NNumber pOperationType,NString pTableName,NString pAttrName,NString pAttrType,NNumber pAttrOrder,NString pAttrReqdInd,NString pAttrDataType,NString pAttrPrompt,NString pUserId,NNumber pAttrDataLen,NNumber pAttrDataScale,NString pAttrInfo,NString pAttrBaseCol,NString pSddcCode,NString pDataOrigin,NString pLovForm,NString pLovTableOvrd,NString pLovAttrOvrd,NString pLovCodeTitle,NString pLovDescTitle, pLovLowRange, pLovHighRange,NString pLovLowSysdateInd,NString pLovHighSysdateInd,NString pGjapdefValidation,NString pSqlSqprCode,NString pSqlSqruCode,NString pInternalRecordId) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_SDE_METADATA_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
//			cmd.addParameter("@P_TABLE_NAME", pTableName);
//			cmd.addParameter("@P_ATTR_NAME", pAttrName);
//			cmd.addParameter("@P_ATTR_TYPE", pAttrType);
//			cmd.addParameter("@P_ATTR_ORDER", pAttrOrder);
//			cmd.addParameter("@P_ATTR_REQD_IND", pAttrReqdInd);
//			cmd.addParameter("@P_ATTR_DATA_TYPE", pAttrDataType);
//			cmd.addParameter("@P_ATTR_PROMPT", pAttrPrompt);
//			cmd.addParameter("@P_USER_ID", pUserId);
//			cmd.addParameter("@P_ATTR_DATA_LEN", pAttrDataLen);
//			cmd.addParameter("@P_ATTR_DATA_SCALE", pAttrDataScale);
//			cmd.addParameter("@P_ATTR_INFO", pAttrInfo);
//			cmd.addParameter("@P_ATTR_BASE_COL", pAttrBaseCol);
//			cmd.addParameter("@P_SDDC_CODE", pSddcCode);
//			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
//			cmd.addParameter("@P_LOV_FORM", pLovForm);
//			cmd.addParameter("@P_LOV_TABLE_OVRD", pLovTableOvrd);
//			cmd.addParameter("@P_LOV_ATTR_OVRD", pLovAttrOvrd);
//			cmd.addParameter("@P_LOV_CODE_TITLE", pLovCodeTitle);
//			cmd.addParameter("@P_LOV_DESC_TITLE", pLovDescTitle);
//			cmd.addParameter("@P_LOV_LOW_RANGE", pLovLowRange);
//			cmd.addParameter("@P_LOV_HIGH_RANGE", pLovHighRange);
//			cmd.addParameter("@P_LOV_LOW_SYSDATE_IND", pLovLowSysdateInd);
//			cmd.addParameter("@P_LOV_HIGH_SYSDATE_IND", pLovHighSysdateInd);
//			cmd.addParameter("@P_GJAPDEF_VALIDATION", pGjapdefValidation);
//			cmd.addParameter("@P_SQL_SQPR_CODE", pSqlSqprCode);
//			cmd.addParameter("@P_SQL_SQRU_CODE", pSqlSqruCode);
//			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
//				
//			cmd.execute();
//
//
//		}
		
//		public static void pValidate(NString pTableName,NString pAttrName,NString pAttrType,NNumber pAttrOrder,NString pAttrReqdInd,NString pAttrDataType,NString pAttrPrompt,NString pUserId,NNumber pAttrDataLen,NNumber pAttrDataScale,NString pAttrInfo,NString pAttrBaseCol,NString pSddcCode,NString pDataOrigin,NString pLovForm,NString pLovTableOvrd,NString pLovAttrOvrd,NString pLovCodeTitle,NString pLovDescTitle, pLovLowRange, pLovHighRange,NString pLovLowSysdateInd,NString pLovHighSysdateInd,NString pGjapdefValidation,NString pSqlSqprCode,NString pSqlSqruCode) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_SDE_METADATA_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_TABLE_NAME", pTableName);
//			cmd.addParameter("@P_ATTR_NAME", pAttrName);
//			cmd.addParameter("@P_ATTR_TYPE", pAttrType);
//			cmd.addParameter("@P_ATTR_ORDER", pAttrOrder);
//			cmd.addParameter("@P_ATTR_REQD_IND", pAttrReqdInd);
//			cmd.addParameter("@P_ATTR_DATA_TYPE", pAttrDataType);
//			cmd.addParameter("@P_ATTR_PROMPT", pAttrPrompt);
//			cmd.addParameter("@P_USER_ID", pUserId);
//			cmd.addParameter("@P_ATTR_DATA_LEN", pAttrDataLen);
//			cmd.addParameter("@P_ATTR_DATA_SCALE", pAttrDataScale);
//			cmd.addParameter("@P_ATTR_INFO", pAttrInfo);
//			cmd.addParameter("@P_ATTR_BASE_COL", pAttrBaseCol);
//			cmd.addParameter("@P_SDDC_CODE", pSddcCode);
//			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
//			cmd.addParameter("@P_LOV_FORM", pLovForm);
//			cmd.addParameter("@P_LOV_TABLE_OVRD", pLovTableOvrd);
//			cmd.addParameter("@P_LOV_ATTR_OVRD", pLovAttrOvrd);
//			cmd.addParameter("@P_LOV_CODE_TITLE", pLovCodeTitle);
//			cmd.addParameter("@P_LOV_DESC_TITLE", pLovDescTitle);
//			cmd.addParameter("@P_LOV_LOW_RANGE", pLovLowRange);
//			cmd.addParameter("@P_LOV_HIGH_RANGE", pLovHighRange);
//			cmd.addParameter("@P_LOV_LOW_SYSDATE_IND", pLovLowSysdateInd);
//			cmd.addParameter("@P_LOV_HIGH_SYSDATE_IND", pLovHighSysdateInd);
//			cmd.addParameter("@P_GJAPDEF_VALIDATION", pGjapdefValidation);
//			cmd.addParameter("@P_SQL_SQPR_CODE", pSqlSqprCode);
//			cmd.addParameter("@P_SQL_SQRU_CODE", pSqlSqruCode);
//				
//			cmd.execute();
//
//
//		}
		
	
	
	
}
