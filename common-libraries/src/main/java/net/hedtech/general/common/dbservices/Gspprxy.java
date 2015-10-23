package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Gspprxy {
		public static void gGetProxyInfo(NString pAccessMethod,NString pExternalSystem,NString pExternalUserId,NString pExternalImmutId,Ref<NString> pInternalUserId,Ref<NString> pOracleRole,Ref<NString> pOracleRolePwd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GSPPRXY.G$_GET_PROXY_INFO", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ACCESS_METHOD", pAccessMethod);
			cmd.addParameter("@P_EXTERNAL_SYSTEM", pExternalSystem);
			cmd.addParameter("@P_EXTERNAL_USER_ID", pExternalUserId);
			cmd.addParameter("@P_EXTERNAL_IMMUT_ID", pExternalImmutId);
			cmd.addParameter("@P_INTERNAL_USER_ID", NString.class);
			cmd.addParameter("@P_ORACLE_ROLE", NString.class);
			cmd.addParameter("@P_ORACLE_ROLE_PWD", NString.class);
				
			cmd.execute();
			pInternalUserId.val = cmd.getParameterValue("@P_INTERNAL_USER_ID", NString.class);
			pOracleRole.val = cmd.getParameterValue("@P_ORACLE_ROLE", NString.class);
			pOracleRolePwd.val = cmd.getParameterValue("@P_ORACLE_ROLE_PWD", NString.class);


		}
		
	
	
	
}
