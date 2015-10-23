package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class GpGpbeltrRules {
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GP_GPBELTR_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NString pSystCode,NString pCtypCode,NString pCtypUrl,NDate pCtypExpDate,NDate pCtypExeDate,NDate pTransmitDate,NNumber pProxyIdm,NString pProxyOldData,NString pProxyNewData,NNumber pPersonPidm,NString pUserId,NDate pCreateDate,NString pCreateUser,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GP_GPBELTR_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_SYST_CODE", pSystCode);
			cmd.addParameter("@P_CTYP_CODE", pCtypCode);
			cmd.addParameter("@P_CTYP_URL", pCtypUrl);
			cmd.addParameter("@P_CTYP_EXP_DATE", pCtypExpDate);
			cmd.addParameter("@P_CTYP_EXE_DATE", pCtypExeDate);
			cmd.addParameter("@P_TRANSMIT_DATE", pTransmitDate);
			cmd.addParameter("@P_PROXY_IDM", pProxyIdm);
			cmd.addParameter("@P_PROXY_OLD_DATA", pProxyOldData);
			cmd.addParameter("@P_PROXY_NEW_DATA", pProxyNewData);
			cmd.addParameter("@P_PERSON_PIDM", pPersonPidm);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_CREATE_DATE", pCreateDate);
			cmd.addParameter("@P_CREATE_USER", pCreateUser);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NString pSystCode,NString pCtypCode,NString pCtypUrl,NDate pCtypExpDate,NDate pCtypExeDate,NDate pTransmitDate,NNumber pProxyIdm,NString pProxyOldData,NString pProxyNewData,NNumber pPersonPidm,NString pUserId,NDate pCreateDate,NString pCreateUser) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GP_GPBELTR_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SYST_CODE", pSystCode);
			cmd.addParameter("@P_CTYP_CODE", pCtypCode);
			cmd.addParameter("@P_CTYP_URL", pCtypUrl);
			cmd.addParameter("@P_CTYP_EXP_DATE", pCtypExpDate);
			cmd.addParameter("@P_CTYP_EXE_DATE", pCtypExeDate);
			cmd.addParameter("@P_TRANSMIT_DATE", pTransmitDate);
			cmd.addParameter("@P_PROXY_IDM", pProxyIdm);
			cmd.addParameter("@P_PROXY_OLD_DATA", pProxyOldData);
			cmd.addParameter("@P_PROXY_NEW_DATA", pProxyNewData);
			cmd.addParameter("@P_PERSON_PIDM", pPersonPidm);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_CREATE_DATE", pCreateDate);
			cmd.addParameter("@P_CREATE_USER", pCreateUser);
				
			cmd.execute();


		}
		
	
	
	
}
