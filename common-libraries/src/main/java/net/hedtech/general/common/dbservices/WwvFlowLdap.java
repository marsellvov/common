package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class WwvFlowLdap {
		public static NBool Fauthenticate(NString pUsername,NString pPassword,NString pSearchBase,NString pHost,NString pPort) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_LDAP.AUTHENTICATE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@P_USERNAME", pUsername);
			cmd.addParameter("@P_PASSWORD", pPassword);
			cmd.addParameter("@P_SEARCH_BASE", pSearchBase);
			cmd.addParameter("@P_HOST", pHost);
			cmd.addParameter("@P_PORT", pPort);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
//		public static void getAllUserAttributes(NString pUsername,NString pPass,NString pAuthBase,NString pHost,NString pPort,Ref<List<WwvFlowGlobal.VcArr2Row>> pAttributes,Ref<List<WwvFlowGlobal.VcArr2Row>> pAttributeValues) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_LDAP.GET_ALL_USER_ATTRIBUTES", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_USERNAME", pUsername);
//			cmd.addParameter("@P_PASS", pPass);
//			cmd.addParameter("@P_AUTH_BASE", pAuthBase);
//			cmd.addParameter("@P_HOST", pHost);
//			cmd.addParameter("@P_PORT", pPort);
//			// cmd.addParameter(DbTypes.getTableType("P_ATTRIBUTES", "", object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_ATTRIBUTE_VALUES", "", object.class));
//				
//			cmd.execute();
//			// pAttributes.val = cmd.getTableParameterValue("@P_ATTRIBUTES", object.class);
//			// pAttributeValues.val = cmd.getTableParameterValue("@P_ATTRIBUTE_VALUES", object.class);
//
//
//		}
//		
//		public static void getUserAttributes(NString pUsername,NString pPass,NString pAuthBase,NString pHost,NString pPort,List<WwvFlowGlobal.VcArr2Row> pAttributes,Ref<List<WwvFlowGlobal.VcArr2Row>> pAttributeValues) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_LDAP.GET_USER_ATTRIBUTES", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_USERNAME", pUsername);
//			cmd.addParameter("@P_PASS", pPass);
//			cmd.addParameter("@P_AUTH_BASE", pAuthBase);
//			cmd.addParameter("@P_HOST", pHost);
//			cmd.addParameter("@P_PORT", pPort);
//			// cmd.addParameter(DbTypes.getTableType("P_ATTRIBUTES", "", pAttributes, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_ATTRIBUTE_VALUES", "", object.class));
//				
//			cmd.execute();
//			// pAttributeValues.val = cmd.getTableParameterValue("@P_ATTRIBUTE_VALUES", object.class);
//
//
//		}
		
		public static NBool FisMember(NString pUsername,NString pPass,NString pAuthBase,NString pHost,NString pPort,NString pGroup,NString pGroupBase) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_LDAP.IS_MEMBER", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@P_USERNAME", pUsername);
			cmd.addParameter("@P_PASS", pPass);
			cmd.addParameter("@P_AUTH_BASE", pAuthBase);
			cmd.addParameter("@P_HOST", pHost);
			cmd.addParameter("@P_PORT", pPort);
			cmd.addParameter("@P_GROUP", pGroup);
			cmd.addParameter("@P_GROUP_BASE", pGroupBase);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
//		public static List<VcArr2Row> FmemberOf(NString pUsername,NString pPass,NString pAuthBase,NString pHost,NString pPort) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_LDAP.MEMBER_OF", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<VcArr2Row>.class);
//			cmd.addParameter("@P_USERNAME", pUsername);
//			cmd.addParameter("@P_PASS", pPass);
//			cmd.addParameter("@P_AUTH_BASE", pAuthBase);
//			cmd.addParameter("@P_HOST", pHost);
//			cmd.addParameter("@P_PORT", pPort);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<VcArr2Row>.class);
//
//		}
		
		public static NString FmemberOf2(NString pUsername,NString pPass,NString pAuthBase,NString pHost,NString pPort) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_LDAP.MEMBER_OF2", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_USERNAME", pUsername);
			cmd.addParameter("@P_PASS", pPass);
			cmd.addParameter("@P_AUTH_BASE", pAuthBase);
			cmd.addParameter("@P_HOST", pHost);
			cmd.addParameter("@P_PORT", pPort);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
	
	
	
}
