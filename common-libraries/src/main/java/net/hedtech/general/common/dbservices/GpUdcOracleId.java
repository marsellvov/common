package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class GpUdcOracleId {
		public static NString fDeleteUser(NString pUser) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GP_UDC_ORACLE_ID.F_DELETE_USER", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_USER", pUser);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIdmCreateUser(NString pUser,NString pPassword) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GP_UDC_ORACLE_ID.F_IDM_CREATE_USER", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_USER", pUser);
			cmd.addParameter("@P_PASSWORD", pPassword);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pExpireAccount(NString pUser) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GP_UDC_ORACLE_ID.P_EXPIRE_ACCOUNT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_USER", pUser);
				
			cmd.execute();


		}
		
		public static void pRemoveBannerPermissions(NString pUser) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GP_UDC_ORACLE_ID.P_REMOVE_BANNER_PERMISSIONS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_USER", pUser);
				
			cmd.execute();


		}
		
	
	
	
}
