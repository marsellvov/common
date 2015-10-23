package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Nokglob {
		public static NDate fGlobalDate(NString pGlobalName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKGLOB.F_GLOBAL_DATE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NDate.class);
			cmd.addParameter("@P_GLOBAL_NAME", pGlobalName);
				
			cmd.execute();

			return cmd.getReturnValue(NDate.class);

		}
		
		public static NNumber fGlobalNumber(NString pGlobalName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKGLOB.F_GLOBAL_NUMBER", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_GLOBAL_NAME", pGlobalName);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString fGlobalString(NString pGlobalName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKGLOB.F_GLOBAL_STRING", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_GLOBAL_NAME", pGlobalName);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pDeleteGlobal(NString pGlobalName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKGLOB.P_DELETE_GLOBAL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_GLOBAL_NAME", pGlobalName);
				
			cmd.execute();


		}
		
		
		
		
		public static void pGetGlobal(NString pGlobalName,Ref<NString> pGlobalValueOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKGLOB.P_GET_GLOBAL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_GLOBAL_NAME", pGlobalName);
			cmd.addParameter("@P_GLOBAL_VALUE_OUT", NString.class);
				
			cmd.execute();
			pGlobalValueOut.val = cmd.getParameterValue("@P_GLOBAL_VALUE_OUT", NString.class);


		}
		
		public static void pInitSessionGlobals() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKGLOB.P_INIT_SESSION_GLOBALS", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pSetGlobal(NString pGlobalName,NDate pGlobalValue,NString pLockOption) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKGLOB.P_SET_GLOBAL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_GLOBAL_NAME", pGlobalName);
			cmd.addParameter("@P_GLOBAL_VALUE", pGlobalValue);
			cmd.addParameter("@P_LOCK_OPTION", pLockOption);
				
			cmd.execute();


		}
		
		public static void pSetGlobal(NString pGlobalName,NNumber pGlobalValue,NString pLockOption) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKGLOB.P_SET_GLOBAL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_GLOBAL_NAME", pGlobalName);
			cmd.addParameter("@P_GLOBAL_VALUE", pGlobalValue);
			cmd.addParameter("@P_LOCK_OPTION", pLockOption);
				
			cmd.execute();


		}
		
		public static void pSetGlobal(NString pGlobalName,NString pGlobalValue,NString pLockOption) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKGLOB.P_SET_GLOBAL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_GLOBAL_NAME", pGlobalName);
			cmd.addParameter("@P_GLOBAL_VALUE", pGlobalValue);
			cmd.addParameter("@P_LOCK_OPTION", pLockOption);
				
			cmd.execute();


		}
		
	
	
	
}
