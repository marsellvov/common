package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class FbCirculationHeaderRules {
	
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_CIRCULATION_HEADER_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NNumber pId,NString pName,NString pType,NString pStatus,NNumber pOwnerPidm,NString pActiveInd,NString pAllOrganizationsInd,NString pHeaderChangeInd,NString pRoutingChangeInd,NString pLockObjectInd,NString pTemplateInd,NString pTriggerEnabledInd,NString pUserId,NString pDataOrigin,NString pSuccessStatus,NString pSuplEmailText,NDate pCompletionDate,NDate pStartDate,NString pDesc,NString pTriggerType,NString pTriggerValue,NNumber pFobcirhId,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_CIRCULATION_HEADER_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_NAME", pName);
			cmd.addParameter("@P_TYPE", pType);
			cmd.addParameter("@P_STATUS", pStatus);
			cmd.addParameter("@P_OWNER_PIDM", pOwnerPidm);
			cmd.addParameter("@P_ACTIVE_IND", pActiveInd);
			cmd.addParameter("@P_ALL_ORGANIZATIONS_IND", pAllOrganizationsInd);
			cmd.addParameter("@P_HEADER_CHANGE_IND", pHeaderChangeInd);
			cmd.addParameter("@P_ROUTING_CHANGE_IND", pRoutingChangeInd);
			cmd.addParameter("@P_LOCK_OBJECT_IND", pLockObjectInd);
			cmd.addParameter("@P_TEMPLATE_IND", pTemplateInd);
			cmd.addParameter("@P_TRIGGER_ENABLED_IND", pTriggerEnabledInd);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_SUCCESS_STATUS", pSuccessStatus);
			cmd.addParameter("@P_SUPL_EMAIL_TEXT", pSuplEmailText);
			cmd.addParameter("@P_COMPLETION_DATE", pCompletionDate);
			cmd.addParameter("@P_START_DATE", pStartDate);
			cmd.addParameter("@P_DESC", pDesc);
			cmd.addParameter("@P_TRIGGER_TYPE", pTriggerType);
			cmd.addParameter("@P_TRIGGER_VALUE", pTriggerValue);
			cmd.addParameter("@P_FOBCIRH_ID", pFobcirhId);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NNumber pId,NString pName,NString pType,NString pStatus,NNumber pOwnerPidm,NString pActiveInd,NString pAllOrganizationsInd,NString pHeaderChangeInd,NString pRoutingChangeInd,NString pLockObjectInd,NString pTemplateInd,NString pTriggerEnabledInd,NString pUserId,NString pDataOrigin,NString pSuccessStatus,NString pSuplEmailText,NDate pCompletionDate,NDate pStartDate,NString pDesc,NString pTriggerType,NString pTriggerValue,NNumber pFobcirhId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_CIRCULATION_HEADER_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_NAME", pName);
			cmd.addParameter("@P_TYPE", pType);
			cmd.addParameter("@P_STATUS", pStatus);
			cmd.addParameter("@P_OWNER_PIDM", pOwnerPidm);
			cmd.addParameter("@P_ACTIVE_IND", pActiveInd);
			cmd.addParameter("@P_ALL_ORGANIZATIONS_IND", pAllOrganizationsInd);
			cmd.addParameter("@P_HEADER_CHANGE_IND", pHeaderChangeInd);
			cmd.addParameter("@P_ROUTING_CHANGE_IND", pRoutingChangeInd);
			cmd.addParameter("@P_LOCK_OBJECT_IND", pLockObjectInd);
			cmd.addParameter("@P_TEMPLATE_IND", pTemplateInd);
			cmd.addParameter("@P_TRIGGER_ENABLED_IND", pTriggerEnabledInd);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_SUCCESS_STATUS", pSuccessStatus);
			cmd.addParameter("@P_SUPL_EMAIL_TEXT", pSuplEmailText);
			cmd.addParameter("@P_COMPLETION_DATE", pCompletionDate);
			cmd.addParameter("@P_START_DATE", pStartDate);
			cmd.addParameter("@P_DESC", pDesc);
			cmd.addParameter("@P_TRIGGER_TYPE", pTriggerType);
			cmd.addParameter("@P_TRIGGER_VALUE", pTriggerValue);
			cmd.addParameter("@P_FOBCIRH_ID", pFobcirhId);
				
			cmd.execute();


		}
		
	
	
	
}
