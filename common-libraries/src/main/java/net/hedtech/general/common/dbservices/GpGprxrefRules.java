package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class GpGprxrefRules {
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GP_GPRXREF_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NNumber pProxyIdm,NNumber pPersonPidm,NString pRetpCode,NString pProxyDesc,NDate pStartDate,NDate pStopDate,NString pCreateUser,NDate pCreateDate,NString pUserId,NString pPassphrase,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GP_GPRXREF_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_PROXY_IDM", pProxyIdm);
			cmd.addParameter("@P_PERSON_PIDM", pPersonPidm);
			cmd.addParameter("@P_RETP_CODE", pRetpCode);
			cmd.addParameter("@P_PROXY_DESC", pProxyDesc);
			cmd.addParameter("@P_START_DATE", pStartDate);
			cmd.addParameter("@P_STOP_DATE", pStopDate);
			cmd.addParameter("@P_CREATE_USER", pCreateUser);
			cmd.addParameter("@P_CREATE_DATE", pCreateDate);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_PASSPHRASE", pPassphrase);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NNumber pProxyIdm,NNumber pPersonPidm,NString pRetpCode,NString pProxyDesc,NDate pStartDate,NDate pStopDate,NString pCreateUser,NDate pCreateDate,NString pUserId,NString pPassphrase) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GP_GPRXREF_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PROXY_IDM", pProxyIdm);
			cmd.addParameter("@P_PERSON_PIDM", pPersonPidm);
			cmd.addParameter("@P_RETP_CODE", pRetpCode);
			cmd.addParameter("@P_PROXY_DESC", pProxyDesc);
			cmd.addParameter("@P_START_DATE", pStartDate);
			cmd.addParameter("@P_STOP_DATE", pStopDate);
			cmd.addParameter("@P_CREATE_USER", pCreateUser);
			cmd.addParameter("@P_CREATE_DATE", pCreateDate);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_PASSPHRASE", pPassphrase);
				
			cmd.execute();


		}
		
	
	
	
}
