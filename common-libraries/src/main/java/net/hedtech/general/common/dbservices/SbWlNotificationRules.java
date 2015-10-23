package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SbWlNotificationRules {
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_WL_NOTIFICATION_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NString pTermCode,NString pCrn,NNumber pPidm,NString pUserId,NDate pStartDate,NDate pEndDate,NNumber pWlPriority,NString pRegConfStat,NString pDataOrigin,NString pErrorStatus,NNumber pErrorCount,NString pLastErrorMessage,NDate pLastErrorDate,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_WL_NOTIFICATION_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_CRN", pCrn);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_START_DATE", pStartDate);
			cmd.addParameter("@P_END_DATE", pEndDate);
			cmd.addParameter("@P_WL_PRIORITY", pWlPriority);
			cmd.addParameter("@P_REG_CONF_STAT", pRegConfStat);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ERROR_STATUS", pErrorStatus);
			cmd.addParameter("@P_ERROR_COUNT", pErrorCount);
			cmd.addParameter("@P_LAST_ERROR_MESSAGE", pLastErrorMessage);
			cmd.addParameter("@P_LAST_ERROR_DATE", pLastErrorDate);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NString pTermCode,NString pCrn,NNumber pPidm,NString pUserId,NDate pStartDate,NDate pEndDate,NNumber pWlPriority,NString pRegConfStat,NString pDataOrigin,NString pErrorStatus,NNumber pErrorCount,NString pLastErrorMessage,NDate pLastErrorDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_WL_NOTIFICATION_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_CRN", pCrn);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_START_DATE", pStartDate);
			cmd.addParameter("@P_END_DATE", pEndDate);
			cmd.addParameter("@P_WL_PRIORITY", pWlPriority);
			cmd.addParameter("@P_REG_CONF_STAT", pRegConfStat);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ERROR_STATUS", pErrorStatus);
			cmd.addParameter("@P_ERROR_COUNT", pErrorCount);
			cmd.addParameter("@P_LAST_ERROR_MESSAGE", pLastErrorMessage);
			cmd.addParameter("@P_LAST_ERROR_DATE", pLastErrorDate);
				
			cmd.execute();


		}
		
	
	
	
}
