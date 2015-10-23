package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class GbInstitutionRoleRules {
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_INSTITUTION_ROLE_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NNumber pPidm,NString pRoleGroup,NString pRole,NString pUserId,NString pVpdiCode,NString pDataOrigin,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_INSTITUTION_ROLE_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_ROLE_GROUP", pRoleGroup);
			cmd.addParameter("@P_ROLE", pRole);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_VPDI_CODE", pVpdiCode);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NNumber pPidm,NString pRoleGroup,NString pRole,NString pUserId,NString pVpdiCode,NString pDataOrigin) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_INSTITUTION_ROLE_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_ROLE_GROUP", pRoleGroup);
			cmd.addParameter("@P_ROLE", pRole);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_VPDI_CODE", pVpdiCode);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
				
			cmd.execute();


		}
		
		public static void pValidateMaintainRequest(NNumber pPidm,NString pRoleGroup,NString pRole) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_INSTITUTION_ROLE_RULES.P_VALIDATE_MAINTAIN_REQUEST", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_ROLE_GROUP", pRoleGroup);
			cmd.addParameter("@P_ROLE", pRole);
				
			cmd.execute();


		}
		
	
	
	
}
