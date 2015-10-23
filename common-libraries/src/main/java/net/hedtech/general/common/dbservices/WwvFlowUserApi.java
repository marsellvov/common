package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class WwvFlowUserApi {
		public static NBool FcurrentUserInGroup(NString pGroupName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_USER_API.CURRENT_USER_IN_GROUP", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@P_GROUP_NAME", pGroupName);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool FcurrentUserInGroup(NNumber pGroupId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_USER_API.CURRENT_USER_IN_GROUP", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@P_GROUP_ID", pGroupId);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NString FgetAttribute(NString pUsername,NNumber pAttributeNumber) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_USER_API.GET_ATTRIBUTE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_USERNAME", pUsername);
			cmd.addParameter("@P_ATTRIBUTE_NUMBER", pAttributeNumber);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber FgetCurrentUserId() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_USER_API.GET_CURRENT_USER_ID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString FgetDefaultSchema() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_USER_API.GET_DEFAULT_SCHEMA", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FgetEmail(NString pUsername) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_USER_API.GET_EMAIL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_USERNAME", pUsername);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FgetFirstName(NString pUsername) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_USER_API.GET_FIRST_NAME", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_USERNAME", pUsername);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber FgetGroupId(NString pGroupName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_USER_API.GET_GROUP_ID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_GROUP_NAME", pGroupName);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString FgetGroupName(NString pGroupId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_USER_API.GET_GROUP_NAME", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_GROUP_ID", pGroupId);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FgetGroupsUserBelongsTo(NString pUsername) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_USER_API.GET_GROUPS_USER_BELONGS_TO", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_USERNAME", pUsername);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FgetLastName(NString pUsername) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_USER_API.GET_LAST_NAME", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_USERNAME", pUsername);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber FgetUserId(NString pUsername) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_USER_API.GET_USER_ID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_USERNAME", pUsername);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString FgetUsername(NNumber pUserid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_USER_API.GET_USERNAME", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_USERID", pUserid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NBool FisLoginPasswordValid(NString pUsername,NString pPassword) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_USER_API.IS_LOGIN_PASSWORD_VALID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@P_USERNAME", pUsername);
			cmd.addParameter("@P_PASSWORD", pPassword);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool FisUsernameUnique(NString pUsername) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_USER_API.IS_USERNAME_UNIQUE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@P_USERNAME", pUsername);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static void setAttribute(NNumber pUserid,NNumber pAttributeNumber,NString pAttributeValue) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_USER_API.SET_ATTRIBUTE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_USERID", pUserid);
			cmd.addParameter("@P_ATTRIBUTE_NUMBER", pAttributeNumber);
			cmd.addParameter("@P_ATTRIBUTE_VALUE", pAttributeValue);
				
			cmd.execute();


		}
		
		public static void setEmail(NNumber pUserid,NString pEmail) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_USER_API.SET_EMAIL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_USERID", pUserid);
			cmd.addParameter("@P_EMAIL", pEmail);
				
			cmd.execute();


		}
		
		public static void setFirstName(NNumber pUserid,NString pFirstName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_USER_API.SET_FIRST_NAME", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_USERID", pUserid);
			cmd.addParameter("@P_FIRST_NAME", pFirstName);
				
			cmd.execute();


		}
		
		public static void setLastName(NNumber pUserid,NString pLastName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_USER_API.SET_LAST_NAME", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_USERID", pUserid);
			cmd.addParameter("@P_LAST_NAME", pLastName);
				
			cmd.execute();


		}
		
		public static void setUsername(NNumber pUserid,NString pUsername) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_USER_API.SET_USERNAME", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_USERID", pUserid);
			cmd.addParameter("@P_USERNAME", pUsername);
				
			cmd.execute();


		}
		
	
	
	
}
