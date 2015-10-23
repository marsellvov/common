package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class FtbStatushistoryRules {
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FTB_STATUSHISTORY_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NNumber pId,NString pDataOrigin,NDate pActivityDate,NString pUserId,NString pMessage,NString pStatus,NDate pStatusDate,NNumber pFtrbauthId,NNumber pFtrbrembId,NNumber pFtrbadvcId,NNumber pFtrbadvrId,NString pAdvanceStatus,NDate pAdvanceStatusDate,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FTB_STATUSHISTORY_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ACTIVITY_DATE", pActivityDate);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_MESSAGE", pMessage);
			cmd.addParameter("@P_STATUS", pStatus);
			cmd.addParameter("@P_STATUS_DATE", pStatusDate);
			cmd.addParameter("@P_FTRBAUTH_ID", pFtrbauthId);
			cmd.addParameter("@P_FTRBREMB_ID", pFtrbrembId);
			cmd.addParameter("@P_FTRBADVC_ID", pFtrbadvcId);
			cmd.addParameter("@P_FTRBADVR_ID", pFtrbadvrId);
			cmd.addParameter("@P_ADVANCE_STATUS", pAdvanceStatus);
			cmd.addParameter("@P_ADVANCE_STATUS_DATE", pAdvanceStatusDate);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NNumber pId,NString pDataOrigin,NDate pActivityDate,NString pUserId,NString pMessage,NString pStatus,NDate pStatusDate,NNumber pFtrbauthId,NNumber pFtrbrembId,NNumber pFtrbadvcId,NNumber pFtrbadvrId,NString pAdvanceStatus,NDate pAdvanceStatusDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FTB_STATUSHISTORY_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ACTIVITY_DATE", pActivityDate);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_MESSAGE", pMessage);
			cmd.addParameter("@P_STATUS", pStatus);
			cmd.addParameter("@P_STATUS_DATE", pStatusDate);
			cmd.addParameter("@P_FTRBAUTH_ID", pFtrbauthId);
			cmd.addParameter("@P_FTRBREMB_ID", pFtrbrembId);
			cmd.addParameter("@P_FTRBADVC_ID", pFtrbadvcId);
			cmd.addParameter("@P_FTRBADVR_ID", pFtrbadvrId);
			cmd.addParameter("@P_ADVANCE_STATUS", pAdvanceStatus);
			cmd.addParameter("@P_ADVANCE_STATUS_DATE", pAdvanceStatusDate);
				
			cmd.execute();


		}
		
	
	
	
}
