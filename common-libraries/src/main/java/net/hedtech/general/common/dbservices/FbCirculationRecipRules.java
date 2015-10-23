package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class FbCirculationRecipRules {
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_CIRCULATION_RECIP_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NNumber pId,NString pAction,NNumber pRecipientPidm,NNumber pForcirsId,NString pUserId,NString pDataOrigin,NString pWorkflowId,NString pCoasCode,NString pOrgnCode,NString pRole,NString pRoleOrigin,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_CIRCULATION_RECIP_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_ACTION", pAction);
			cmd.addParameter("@P_RECIPIENT_PIDM", pRecipientPidm);
			cmd.addParameter("@P_FORCIRS_ID", pForcirsId);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_WORKFLOW_ID", pWorkflowId);
			cmd.addParameter("@P_COAS_CODE", pCoasCode);
			cmd.addParameter("@P_ORGN_CODE", pOrgnCode);
			cmd.addParameter("@P_ROLE", pRole);
			cmd.addParameter("@P_ROLE_ORIGIN", pRoleOrigin);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NNumber pId,NString pAction,NNumber pRecipientPidm,NNumber pForcirsId,NString pUserId,NString pDataOrigin,NString pWorkflowId,NString pCoasCode,NString pOrgnCode,NString pRole,NString pRoleOrigin) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_CIRCULATION_RECIP_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_ACTION", pAction);
			cmd.addParameter("@P_RECIPIENT_PIDM", pRecipientPidm);
			cmd.addParameter("@P_FORCIRS_ID", pForcirsId);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_WORKFLOW_ID", pWorkflowId);
			cmd.addParameter("@P_COAS_CODE", pCoasCode);
			cmd.addParameter("@P_ORGN_CODE", pOrgnCode);
			cmd.addParameter("@P_ROLE", pRole);
			cmd.addParameter("@P_ROLE_ORIGIN", pRoleOrigin);
				
			cmd.execute();


		}
		
	
	
	
}
