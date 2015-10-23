package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class GpGprhistRules {
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GP_GPRHIST_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NNumber pPersonPidm,NString pPageName,NString pOldAuthInd,NString pNewAuthInd,NString pCreateUser,NDate pCreateDate,NString pUserId,NNumber pProxyIdm,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GP_GPRHIST_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_PERSON_PIDM", pPersonPidm);
			cmd.addParameter("@P_PAGE_NAME", pPageName);
			cmd.addParameter("@P_OLD_AUTH_IND", pOldAuthInd);
			cmd.addParameter("@P_NEW_AUTH_IND", pNewAuthInd);
			cmd.addParameter("@P_CREATE_USER", pCreateUser);
			cmd.addParameter("@P_CREATE_DATE", pCreateDate);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_PROXY_IDM", pProxyIdm);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NNumber pPersonPidm,NString pPageName,NString pOldAuthInd,NString pNewAuthInd,NString pCreateUser,NDate pCreateDate,NString pUserId,NNumber pProxyIdm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GP_GPRHIST_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PERSON_PIDM", pPersonPidm);
			cmd.addParameter("@P_PAGE_NAME", pPageName);
			cmd.addParameter("@P_OLD_AUTH_IND", pOldAuthInd);
			cmd.addParameter("@P_NEW_AUTH_IND", pNewAuthInd);
			cmd.addParameter("@P_CREATE_USER", pCreateUser);
			cmd.addParameter("@P_CREATE_DATE", pCreateDate);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_PROXY_IDM", pProxyIdm);
				
			cmd.execute();


		}
		
	
	
	
}
