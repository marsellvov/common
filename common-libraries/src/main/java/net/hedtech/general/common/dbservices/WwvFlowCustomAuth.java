package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class WwvFlowCustomAuth {
		public static NBool FcurrentPageIsPublic() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_CUSTOM_AUTH.CURRENT_PAGE_IS_PUBLIC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static void defineUserSession(NString pUser,NNumber pSessionId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_CUSTOM_AUTH.DEFINE_USER_SESSION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_USER", pUser);
			cmd.addParameter("@P_SESSION_ID", pSessionId);
				
			cmd.execute();


		}
		
		public static NBool flowPageItemExists(NString pItemName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_CUSTOM_AUTH.FLOW_PAGE_ITEM_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@P_ITEM_NAME", pItemName);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NNumber FgetNextSessionId() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_CUSTOM_AUTH.GET_NEXT_SESSION_ID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber FgetSecurityGroupId() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_CUSTOM_AUTH.GET_SECURITY_GROUP_ID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber FgetSessionId() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_CUSTOM_AUTH.GET_SESSION_ID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString FgetUser() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_CUSTOM_AUTH.GET_USER", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void rememberDeepLink(NString pUrl) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_CUSTOM_AUTH.REMEMBER_DEEP_LINK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_URL", pUrl);
				
			cmd.execute();


		}
		
		public static NBool FsessionIdExists() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_CUSTOM_AUTH.SESSION_ID_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static void setSessionId(NNumber pSessionId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_CUSTOM_AUTH.SET_SESSION_ID", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SESSION_ID", pSessionId);
				
			cmd.execute();


		}
		
		public static void setSessionIdToNextValue() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_CUSTOM_AUTH.SET_SESSION_ID_TO_NEXT_VALUE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void setUser(NString pUser) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_CUSTOM_AUTH.SET_USER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_USER", pUser);
				
			cmd.execute();


		}
		
	
	
	
}
