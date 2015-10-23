package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class NbQueueParticipantRules {
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NB_QUEUE_PARTICIPANT_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NNumber pId,NString pCoasCode,NString pQprtCode,NString pDataSourceType,NString pCatchAllGroupInd,NString pUserId,NString pPersonnelId,NString pDataOrigin,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NB_QUEUE_PARTICIPANT_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_COAS_CODE", pCoasCode);
			cmd.addParameter("@P_QPRT_CODE", pQprtCode);
			cmd.addParameter("@P_DATA_SOURCE_TYPE", pDataSourceType);
			cmd.addParameter("@P_CATCH_ALL_GROUP_IND", pCatchAllGroupInd);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_PERSONNEL_ID", pPersonnelId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NNumber pOperationType,NString pCoasCode,NString pQprtCode,NString pDataSourceType,NString pCatchAllGroupInd,NString pUserId,NString pPersonnelId,NString pDataOrigin) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NB_QUEUE_PARTICIPANT_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_COAS_CODE", pCoasCode);
			cmd.addParameter("@P_QPRT_CODE", pQprtCode);
			cmd.addParameter("@P_DATA_SOURCE_TYPE", pDataSourceType);
			cmd.addParameter("@P_CATCH_ALL_GROUP_IND", pCatchAllGroupInd);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_PERSONNEL_ID", pPersonnelId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
				
			cmd.execute();


		}
		
	
	
	
}
