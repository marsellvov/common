package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class PbDriverLicenseRules {
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_DRIVER_LICENSE_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NNumber pPidm,NString pDriverLicense,NString pUserId,NDate pIssueDate,NString pSkilCode,NString pStatus,NDate pExpireDate,NString pStatCodeDriver,NString pNatnCodeDriver,NString pDataOrigin,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_DRIVER_LICENSE_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_DRIVER_LICENSE", pDriverLicense);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_ISSUE_DATE", pIssueDate);
			cmd.addParameter("@P_SKIL_CODE", pSkilCode);
			cmd.addParameter("@P_STATUS", pStatus);
			cmd.addParameter("@P_EXPIRE_DATE", pExpireDate);
			cmd.addParameter("@P_STAT_CODE_DRIVER", pStatCodeDriver);
			cmd.addParameter("@P_NATN_CODE_DRIVER", pNatnCodeDriver);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NNumber pPidm,NString pDriverLicense,NString pUserId,NDate pIssueDate,NString pSkilCode,NString pStatus,NDate pExpireDate,NString pStatCodeDriver,NString pNatnCodeDriver,NString pDataOrigin,NString pOperationType) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_DRIVER_LICENSE_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_DRIVER_LICENSE", pDriverLicense);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_ISSUE_DATE", pIssueDate);
			cmd.addParameter("@P_SKIL_CODE", pSkilCode);
			cmd.addParameter("@P_STATUS", pStatus);
			cmd.addParameter("@P_EXPIRE_DATE", pExpireDate);
			cmd.addParameter("@P_STAT_CODE_DRIVER", pStatCodeDriver);
			cmd.addParameter("@P_NATN_CODE_DRIVER", pNatnCodeDriver);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
				
			cmd.execute();


		}
		
	
	
	
}
