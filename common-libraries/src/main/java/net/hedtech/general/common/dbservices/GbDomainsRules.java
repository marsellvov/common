package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class GbDomainsRules {
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_DOMAINS_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NString pFdmnCode,NString pTableName,NString pFdtpCode,NString pSysReqInd,NString pEnablePiiInd,NString pUserId,NString pPiiColumnName,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_DOMAINS_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_FDMN_CODE", pFdmnCode);
			cmd.addParameter("@P_TABLE_NAME", pTableName);
			cmd.addParameter("@P_FDTP_CODE", pFdtpCode);
			cmd.addParameter("@P_SYS_REQ_IND", pSysReqInd);
			cmd.addParameter("@P_ENABLE_PII_IND", pEnablePiiInd);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_PII_COLUMN_NAME", pPiiColumnName);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NString pFdmnCode,NString pTableName,NString pFdtpCode,NString pSysReqInd,NString pEnablePiiInd,NString pUserId,NString pPiiColumnName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_DOMAINS_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_FDMN_CODE", pFdmnCode);
			cmd.addParameter("@P_TABLE_NAME", pTableName);
			cmd.addParameter("@P_FDTP_CODE", pFdtpCode);
			cmd.addParameter("@P_SYS_REQ_IND", pSysReqInd);
			cmd.addParameter("@P_ENABLE_PII_IND", pEnablePiiInd);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_PII_COLUMN_NAME", pPiiColumnName);
				
			cmd.execute();


		}
		
	
	
	
}
