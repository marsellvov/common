package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class MgmtUser {
		public static void addCallback(NString procIn,NNumber typeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_USER.ADD_CALLBACK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PROC_IN", procIn);
			cmd.addParameter("@TYPE_IN", typeIn);
				
			cmd.execute();


		}
		
//		public static List<MgmtUserObjectsRow> FcheckDropUserConflicts(NString userNameIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_USER.CHECK_DROP_USER_CONFLICTS", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<MgmtUserObjectsRow>.class);
//			cmd.addParameter("@USER_NAME_IN", userNameIn);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<MgmtUserObjectsRow>.class);
//
//		}
		
//		public static List<MgmtUserObjectsRow> FcheckReassignUserConflicts(NString userNameIn,NString newUserNameIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_USER.CHECK_REASSIGN_USER_CONFLICTS", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<MgmtUserObjectsRow>.class);
//			cmd.addParameter("@USER_NAME_IN", userNameIn);
//			cmd.addParameter("@NEW_USER_NAME_IN", newUserNameIn);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<MgmtUserObjectsRow>.class);
//
//		}
		
		public static void checkUserExists(NString userNameIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_USER.CHECK_USER_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@USER_NAME_IN", userNameIn);
				
			cmd.execute();


		}
		
		public static void correctiveActionDeleted(byte[] jobGuidIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_USER.CORRECTIVE_ACTION_DELETED", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@JOB_GUID_IN", jobGuidIn);
				
			cmd.execute();


		}
		
		public static void createPriv(NString privNameIn,NNumber privTypeIn,NString descriptionIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_USER.CREATE_PRIV", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PRIV_NAME_IN", privNameIn);
			cmd.addParameter("@PRIV_TYPE_IN", privTypeIn);
			cmd.addParameter("@DESCRIPTION_IN", descriptionIn);
				
			cmd.execute();


		}
		
		public static void createRole(NString roleNameIn,NString descriptionIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_USER.CREATE_ROLE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@ROLE_NAME_IN", roleNameIn);
			cmd.addParameter("@DESCRIPTION_IN", descriptionIn);
				
			cmd.execute();


		}
		
//		public static void createRole(NString roleNameIn,NString descriptionIn,List<SmpEmdStringArrayRow> rolesIn,List<MgmtUserPrivilegesRow> privilegesIn,List<SmpEmdStringArrayRow> usersIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_USER.CREATE_ROLE", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@ROLE_NAME_IN", roleNameIn);
//			cmd.addParameter("@DESCRIPTION_IN", descriptionIn);
//			// cmd.addParameter(DbTypes.getCollectionType("ROLES_IN", "", rolesIn, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("PRIVILEGES_IN", "", privilegesIn, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("USERS_IN", "", usersIn, object.class));
//				
//			cmd.execute();
//
//
//		}
		
//		public static void createUser(NString userNameIn,NString passwordIn,List<SmpEmdStringArrayRow> emailAddressesIn,List<SmpEmdStringArrayRow> rolesIn,List<MgmtUserPrivilegesRow> privilegesIn,NNumber userTypeIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_USER.CREATE_USER", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@USER_NAME_IN", userNameIn);
//			cmd.addParameter("@PASSWORD_IN", passwordIn);
//			// cmd.addParameter(DbTypes.getCollectionType("EMAIL_ADDRESSES_IN", "", emailAddressesIn, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("ROLES_IN", "", rolesIn, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("PRIVILEGES_IN", "", privilegesIn, object.class));
//			cmd.addParameter("@USER_TYPE_IN", userTypeIn);
//				
//			cmd.execute();
//
//
//		}
		
//		public static void createUser(NString userNameIn,NString passwordIn,NString emailAddressIn,List<SmpEmdStringArrayRow> rolesIn,List<MgmtUserPrivilegesRow> privilegesIn,NNumber userTypeIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_USER.CREATE_USER", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@USER_NAME_IN", userNameIn);
//			cmd.addParameter("@PASSWORD_IN", passwordIn);
//			cmd.addParameter("@EMAIL_ADDRESS_IN", emailAddressIn);
//			// cmd.addParameter(DbTypes.getCollectionType("ROLES_IN", "", rolesIn, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("PRIVILEGES_IN", "", privilegesIn, object.class));
//			cmd.addParameter("@USER_TYPE_IN", userTypeIn);
//				
//			cmd.execute();
//
//
//		}
		
//		public static void createUserDbconsole(NString userNameIn,NString passwordIn,List<SmpEmdStringArrayRow> emailAddressesIn,List<SmpEmdStringArrayRow> rolesIn,List<MgmtUserPrivilegesRow> privilegesIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_USER.CREATE_USER_DBCONSOLE", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@USER_NAME_IN", userNameIn);
//			cmd.addParameter("@PASSWORD_IN", passwordIn);
//			// cmd.addParameter(DbTypes.getCollectionType("EMAIL_ADDRESSES_IN", "", emailAddressesIn, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("ROLES_IN", "", rolesIn, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("PRIVILEGES_IN", "", privilegesIn, object.class));
//				
//			cmd.execute();
//
//
//		}
		
		public static void dropPriv(NString privNameIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_USER.DROP_PRIV", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PRIV_NAME_IN", privNameIn);
				
			cmd.execute();


		}
		
		public static void dropRole(NString roleNameIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_USER.DROP_ROLE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@ROLE_NAME_IN", roleNameIn);
				
			cmd.execute();


		}
		
		public static void dropUser(NString userNameIn,NString newUserNameIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_USER.DROP_USER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@USER_NAME_IN", userNameIn);
			cmd.addParameter("@NEW_USER_NAME_IN", newUserNameIn);
				
			cmd.execute();


		}
		
		public static void dropUserComplete(NString userNameIn,NString newUserNameIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_USER.DROP_USER_COMPLETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@USER_NAME_IN", userNameIn);
			cmd.addParameter("@NEW_USER_NAME_IN", newUserNameIn);
				
			cmd.execute();


		}
		
		public static NString Fem4745545052454449434154454a(NString pSchema,NString pObject) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_USER.EM4745545052454449434154454A", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_SCHEMA", pSchema);
			cmd.addParameter("@P_OBJECT", pObject);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString Fem47455450524544494341544554(NString pSchema,NString pObject) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_USER.EM47455450524544494341544554", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_SCHEMA", pSchema);
			cmd.addParameter("@P_OBJECT", pObject);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
//		public static void getAccessInfo(NString pTargetName,NString pTargetType,Ref<NString> pErrorMessage,Ref<NString> pSuperOrOwner,Ref<List<Varchar2TableRow>> pUserName,Ref<List<Varchar2TableRow>> pUserDescription,Ref<List<Varchar2TableRow>> pUserPrivilege) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_USER.GET_ACCESS_INFO", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_TARGET_NAME", pTargetName);
//			cmd.addParameter("@P_TARGET_TYPE", pTargetType);
//			cmd.addParameter("@P_ERROR_MESSAGE", NString.class);
//			cmd.addParameter("@P_SUPER_OR_OWNER", NString.class);
//			// cmd.addParameter(DbTypes.getCollectionType("P_USER_NAME", "", object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("P_USER_DESCRIPTION", "", object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("P_USER_PRIVILEGE", "", object.class));
//				
//			cmd.execute();
//			pErrorMessage.val = cmd.getParameterValue("@P_ERROR_MESSAGE", NString.class);
//			pSuperOrOwner.val = cmd.getParameterValue("@P_SUPER_OR_OWNER", NString.class);
//			// pUserName.val = cmd.getTableParameterValue("@P_USER_NAME", object.class);
//			// pUserDescription.val = cmd.getTableParameterValue("@P_USER_DESCRIPTION", object.class);
//			// pUserPrivilege.val = cmd.getTableParameterValue("@P_USER_PRIVILEGE", object.class);
//
//
//		}
		
//		public static void getAccessInfoTemplate(NString pTargetName,NString pTargetType,Ref<NString> pErrorMessage,Ref<NString> pSuperOrOwner,Ref<List<Varchar2TableRow>> pUserName,Ref<List<Varchar2TableRow>> pUserDescription,Ref<List<Varchar2TableRow>> pUserPrivilege) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_USER.GET_ACCESS_INFO_TEMPLATE", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_TARGET_NAME", pTargetName);
//			cmd.addParameter("@P_TARGET_TYPE", pTargetType);
//			cmd.addParameter("@P_ERROR_MESSAGE", NString.class);
//			cmd.addParameter("@P_SUPER_OR_OWNER", NString.class);
//			// cmd.addParameter(DbTypes.getCollectionType("P_USER_NAME", "", object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("P_USER_DESCRIPTION", "", object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("P_USER_PRIVILEGE", "", object.class));
//				
//			cmd.execute();
//			pErrorMessage.val = cmd.getParameterValue("@P_ERROR_MESSAGE", NString.class);
//			pSuperOrOwner.val = cmd.getParameterValue("@P_SUPER_OR_OWNER", NString.class);
//			// pUserName.val = cmd.getTableParameterValue("@P_USER_NAME", object.class);
//			// pUserDescription.val = cmd.getTableParameterValue("@P_USER_DESCRIPTION", object.class);
//			// pUserPrivilege.val = cmd.getTableParameterValue("@P_USER_PRIVILEGE", object.class);
//
//
//		}
		
		public static NString FgetCaPredicate(NString pSchema,NString pObject) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_USER.GET_CA_PREDICATE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_SCHEMA", pSchema);
			cmd.addParameter("@P_OBJECT", pObject);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FgetCurrentEmUser() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_USER.GET_CURRENT_EM_USER", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FgetMaxPriv(NString userNameIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_USER.GET_MAX_PRIV", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@USER_NAME_IN", userNameIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FgetMaxPriv() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_USER.GET_MAX_PRIV", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FgetMetricPrefsAlias(NString userNameIn,NString targetTypeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_USER.GET_METRIC_PREFS_ALIAS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@USER_NAME_IN", userNameIn);
			cmd.addParameter("@TARGET_TYPE_IN", targetTypeIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void getMgmtPrivs(Ref<NNumber> superUserOut,Ref<NNumber> emrepUserOut,Ref<NNumber> emdUserOut,Ref<NNumber> validEmUserOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_USER.GET_MGMT_PRIVS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SUPER_USER_OUT", NNumber.class);
			cmd.addParameter("@EMREP_USER_OUT", NNumber.class);
			cmd.addParameter("@EMD_USER_OUT", NNumber.class);
			cmd.addParameter("@VALID_EM_USER_OUT", NNumber.class);
				
			cmd.execute();
			superUserOut.val = cmd.getParameterValue("@SUPER_USER_OUT", NNumber.class);
			emrepUserOut.val = cmd.getParameterValue("@EMREP_USER_OUT", NNumber.class);
			emdUserOut.val = cmd.getParameterValue("@EMD_USER_OUT", NNumber.class);
			validEmUserOut.val = cmd.getParameterValue("@VALID_EM_USER_OUT", NNumber.class);


		}
		
		public static DataCursor FgetNodeListWithPrivilege(NString pPrivilege) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_USER.GET_NODE_LIST_WITH_PRIVILEGE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PRIVILEGE", pPrivilege);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
//		public static void getPrivs(NNumber privTypeIn,NNumber userDefinedIn,Ref<List<SmpEmdStringArrayRow>> privsOut) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_USER.GET_PRIVS", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@PRIV_TYPE_IN", privTypeIn);
//			cmd.addParameter("@USER_DEFINED_IN", userDefinedIn);
//			// cmd.addParameter(DbTypes.getCollectionType("PRIVS_OUT", "", object.class));
//				
//			cmd.execute();
//			// privsOut.val = cmd.getTableParameterValue("@PRIVS_OUT", object.class);
//
//
//		}
		
		public static NString FgetReadLock(NNumber exceptionIdIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_USER.GET_READ_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@EXCEPTION_ID_IN", exceptionIdIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FgetReportDefPredicate(NString pSchema,NString pObject) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_USER.GET_REPORT_DEF_PREDICATE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_SCHEMA", pSchema);
			cmd.addParameter("@P_OBJECT", pObject);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void getReportGrants(byte[] reportIdIn,Ref<NString> ownerOut,Ref<DataCursor> granteesOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_USER.GET_REPORT_GRANTS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@REPORT_ID_IN", reportIdIn);
			cmd.addParameter("@OWNER_OUT", NString.class);
			cmd.addParameter("@GRANTEES_OUT", DataCursor.class);
				
			cmd.execute();
			ownerOut.val = cmd.getParameterValue("@OWNER_OUT", NString.class);
			granteesOut.val = cmd.getParameterValue("@GRANTEES_OUT", DataCursor.class);


		}
		
		public static NString FgetRepositoryOwner() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_USER.GET_REPOSITORY_OWNER", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
//		public static List<MgmtUserGuidArrayRow> FgetRepositoryTargets(NNumber includeRepositoryTarget) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_USER.GET_REPOSITORY_TARGETS", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<MgmtUserGuidArrayRow>.class);
//			cmd.addParameter("@INCLUDE_REPOSITORY_TARGET", includeRepositoryTarget);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<MgmtUserGuidArrayRow>.class);
//
//		}
		
		public static void getRoleGrants(NString roleNameIn,Ref<DataCursor> privsOut,Ref<DataCursor> rolesOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_USER.GET_ROLE_GRANTS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@ROLE_NAME_IN", roleNameIn);
			cmd.addParameter("@PRIVS_OUT", DataCursor.class);
			cmd.addParameter("@ROLES_OUT", DataCursor.class);
				
			cmd.execute();
			privsOut.val = cmd.getParameterValue("@PRIVS_OUT", DataCursor.class);
			rolesOut.val = cmd.getParameterValue("@ROLES_OUT", DataCursor.class);


		}
		
		public static void getRolePrivs(NString roleNameIn,NNumber privTypeIn,NNumber userDefinedIn,Ref<DataCursor> privsOut,Ref<DataCursor> userNamesOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_USER.GET_ROLE_PRIVS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@ROLE_NAME_IN", roleNameIn);
			cmd.addParameter("@PRIV_TYPE_IN", privTypeIn);
			cmd.addParameter("@USER_DEFINED_IN", userDefinedIn);
			cmd.addParameter("@PRIVS_OUT", DataCursor.class);
			cmd.addParameter("@USER_NAMES_OUT", DataCursor.class);
				
			cmd.execute();
			privsOut.val = cmd.getParameterValue("@PRIVS_OUT", DataCursor.class);
			userNamesOut.val = cmd.getParameterValue("@USER_NAMES_OUT", DataCursor.class);


		}
		
		public static void getRoleUsers(NString roleNameIn,Ref<DataCursor> availableUsersOut,Ref<DataCursor> grantedUsersOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_USER.GET_ROLE_USERS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@ROLE_NAME_IN", roleNameIn);
			cmd.addParameter("@AVAILABLE_USERS_OUT", DataCursor.class);
			cmd.addParameter("@GRANTED_USERS_OUT", DataCursor.class);
				
			cmd.execute();
			availableUsersOut.val = cmd.getParameterValue("@AVAILABLE_USERS_OUT", DataCursor.class);
			grantedUsersOut.val = cmd.getParameterValue("@GRANTED_USERS_OUT", DataCursor.class);


		}
		
		public static void getRoles(Ref<DataCursor> rolesOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_USER.GET_ROLES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@ROLES_OUT", DataCursor.class);
				
			cmd.execute();
			rolesOut.val = cmd.getParameterValue("@ROLES_OUT", DataCursor.class);


		}
		
		public static void getRolesForRole(NString roleNameIn,Ref<DataCursor> availableRolesOut,Ref<DataCursor> grantedRolesOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_USER.GET_ROLES_FOR_ROLE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@ROLE_NAME_IN", roleNameIn);
			cmd.addParameter("@AVAILABLE_ROLES_OUT", DataCursor.class);
			cmd.addParameter("@GRANTED_ROLES_OUT", DataCursor.class);
				
			cmd.execute();
			availableRolesOut.val = cmd.getParameterValue("@AVAILABLE_ROLES_OUT", DataCursor.class);
			grantedRolesOut.val = cmd.getParameterValue("@GRANTED_ROLES_OUT", DataCursor.class);


		}
		
		public static NString FgetStoredReportPredicate(NString pSchema,NString pObject) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_USER.GET_STORED_REPORT_PREDICATE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_SCHEMA", pSchema);
			cmd.addParameter("@P_OBJECT", pObject);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FgetSubtabPrefsAlias(NString userNameIn,NString subtabNameIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_USER.GET_SUBTAB_PREFS_ALIAS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@USER_NAME_IN", userNameIn);
			cmd.addParameter("@SUBTAB_NAME_IN", subtabNameIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
//		public static void getTargetPrivs(List<SmpEmdStringArrayRow> rolesIn,List<MgmtUserGuidArrayRow> targetsIn,Ref<DataCursor> privsOut) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_USER.GET_TARGET_PRIVS", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getCollectionType("ROLES_IN", "", rolesIn, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("TARGETS_IN", "", targetsIn, object.class));
//			cmd.addParameter("@PRIVS_OUT", DataCursor.class);
//				
//			cmd.execute();
//			privsOut.val = cmd.getParameterValue("@PRIVS_OUT", DataCursor.class);
//
//
//		}
		
		public static DataCursor FgetTargetTypes(NString privNameIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_USER.GET_TARGET_TYPES", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@PRIV_NAME_IN", privNameIn);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor FgetTargets(NString userNameIn,NString targetTypeIn,NString privNameIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_USER.GET_TARGETS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@USER_NAME_IN", userNameIn);
			cmd.addParameter("@TARGET_TYPE_IN", targetTypeIn);
			cmd.addParameter("@PRIV_NAME_IN", privNameIn);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor FgetTargets(NString targetTypeIn,NString privNameIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_USER.GET_TARGETS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@TARGET_TYPE_IN", targetTypeIn);
			cmd.addParameter("@PRIV_NAME_IN", privNameIn);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void getTargetsForRole(NString roleNameIn,Ref<DataCursor> targetsOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_USER.GET_TARGETS_FOR_ROLE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@ROLE_NAME_IN", roleNameIn);
			cmd.addParameter("@TARGETS_OUT", DataCursor.class);
				
			cmd.execute();
			targetsOut.val = cmd.getParameterValue("@TARGETS_OUT", DataCursor.class);


		}
		
		public static void getTargetsForUser(NString userNameIn,Ref<DataCursor> targetsOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_USER.GET_TARGETS_FOR_USER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@USER_NAME_IN", userNameIn);
			cmd.addParameter("@TARGETS_OUT", DataCursor.class);
				
			cmd.execute();
			targetsOut.val = cmd.getParameterValue("@TARGETS_OUT", DataCursor.class);


		}
		
		public static NString FgetTemplatePredicate(NString pSchema,NString pObject) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_USER.GET_TEMPLATE_PREDICATE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_SCHEMA", pSchema);
			cmd.addParameter("@P_OBJECT", pObject);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void getUserJobPriv(byte[] jobIdIn,NString userNameIn,Ref<NString> adminOut,Ref<NString> privOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_USER.GET_USER_JOB_PRIV", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@JOB_ID_IN", jobIdIn);
			cmd.addParameter("@USER_NAME_IN", userNameIn);
			cmd.addParameter("@ADMIN_OUT", NString.class);
			cmd.addParameter("@PRIV_OUT", NString.class);
				
			cmd.execute();
			adminOut.val = cmd.getParameterValue("@ADMIN_OUT", NString.class);
			privOut.val = cmd.getParameterValue("@PRIV_OUT", NString.class);


		}
		
//		public static List<MgmtUserObjectsRow> FgetUserObjects(NString userNameIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_USER.GET_USER_OBJECTS", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<MgmtUserObjectsRow>.class);
//			cmd.addParameter("@USER_NAME_IN", userNameIn);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<MgmtUserObjectsRow>.class);
//
//		}
		
		public static void getUserPrivs(NString userNameIn,NNumber privTypeIn,NNumber userDefinedIn,Ref<DataCursor> privsOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_USER.GET_USER_PRIVS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@USER_NAME_IN", userNameIn);
			cmd.addParameter("@PRIV_TYPE_IN", privTypeIn);
			cmd.addParameter("@USER_DEFINED_IN", userDefinedIn);
			cmd.addParameter("@PRIVS_OUT", DataCursor.class);
				
			cmd.execute();
			privsOut.val = cmd.getParameterValue("@PRIVS_OUT", DataCursor.class);


		}
		
//		public static void getUserRoleList(NString pGivenObjectName,Ref<List<Varchar2TableRow>> pObjectName,Ref<List<Varchar2TableRow>> pObjectDescription) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_USER.GET_USER_ROLE_LIST", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_GIVEN_OBJECT_NAME", pGivenObjectName);
//			// cmd.addParameter(DbTypes.getCollectionType("P_OBJECT_NAME", "", object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("P_OBJECT_DESCRIPTION", "", object.class));
//				
//			cmd.execute();
//			// pObjectName.val = cmd.getTableParameterValue("@P_OBJECT_NAME", object.class);
//			// pObjectDescription.val = cmd.getTableParameterValue("@P_OBJECT_DESCRIPTION", object.class);
//
//
//		}
		
		public static void getUserRoles(NString userNameIn,Ref<DataCursor> rolesOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_USER.GET_USER_ROLES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@USER_NAME_IN", userNameIn);
			cmd.addParameter("@ROLES_OUT", DataCursor.class);
				
			cmd.execute();
			rolesOut.val = cmd.getParameterValue("@ROLES_OUT", DataCursor.class);


		}
		
		public static void getUsers(Ref<DataCursor> userNamesOut,NNumber userTypeIn,NString pUserSrch) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_USER.GET_USERS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@USER_NAMES_OUT", DataCursor.class);
			cmd.addParameter("@USER_TYPE_IN", userTypeIn);
			cmd.addParameter("@P_USER_SRCH", pUserSrch);
				
			cmd.execute();
			userNamesOut.val = cmd.getParameterValue("@USER_NAMES_OUT", DataCursor.class);


		}
		
		public static void getUsersDbconsole(Ref<DataCursor> userNamesOut,NString pUserSrch) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_USER.GET_USERS_DBCONSOLE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@USER_NAMES_OUT", DataCursor.class);
			cmd.addParameter("@P_USER_SRCH", pUserSrch);
				
			cmd.execute();
			userNamesOut.val = cmd.getParameterValue("@USER_NAMES_OUT", DataCursor.class);


		}
		
		public static void grantCaPrivs(byte[] pGuidIn,NNumber pScopeIn,byte[] pTargetGuidIn,byte[] pTemplateGuidIn,NString pOwnerIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_USER.GRANT_CA_PRIVS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_GUID_IN", pGuidIn);
			cmd.addParameter("@P_SCOPE_IN", pScopeIn);
			cmd.addParameter("@P_TARGET_GUID_IN", pTargetGuidIn);
			cmd.addParameter("@P_TEMPLATE_GUID_IN", pTemplateGuidIn);
			cmd.addParameter("@P_OWNER_IN", pOwnerIn);
				
			cmd.execute();


		}
		
		public static void grantFullJobToOwner(byte[] guidIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_USER.GRANT_FULL_JOB_TO_OWNER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@GUID_IN", guidIn);
				
			cmd.execute();


		}
		
		public static void grantPriv(NString granteeIn,NString privNameIn,byte[] guidIn,NNumber invalidateIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_USER.GRANT_PRIV", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@GRANTEE_IN", granteeIn);
			cmd.addParameter("@PRIV_NAME_IN", privNameIn);
			cmd.addParameter("@GUID_IN", guidIn);
			cmd.addParameter("@INVALIDATE_IN", invalidateIn);
				
			cmd.execute();


		}
		
		public static void grantPriv(NString granteeIn,NString privNameIn,NString targetNameIn,NString targetTypeIn,NNumber invalidateIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_USER.GRANT_PRIV", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@GRANTEE_IN", granteeIn);
			cmd.addParameter("@PRIV_NAME_IN", privNameIn);
			cmd.addParameter("@TARGET_NAME_IN", targetNameIn);
			cmd.addParameter("@TARGET_TYPE_IN", targetTypeIn);
			cmd.addParameter("@INVALIDATE_IN", invalidateIn);
				
			cmd.execute();


		}
		
//		public static void grantPrivs(NString granteeIn,List<MgmtUserPrivilegesRow> privilegesIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_USER.GRANT_PRIVS", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@GRANTEE_IN", granteeIn);
//			// cmd.addParameter(DbTypes.getCollectionType("PRIVILEGES_IN", "", privilegesIn, object.class));
//				
//			cmd.execute();
//
//
//		}
		
		public static void grantRole(NString granteeIn,NString roleNameIn,NNumber withAdminIn,NNumber invalidateIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_USER.GRANT_ROLE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@GRANTEE_IN", granteeIn);
			cmd.addParameter("@ROLE_NAME_IN", roleNameIn);
			cmd.addParameter("@WITH_ADMIN_IN", withAdminIn);
			cmd.addParameter("@INVALIDATE_IN", invalidateIn);
				
			cmd.execute();


		}
		
//		public static void grantRoles(NString pGrantee,List<MgmtShortStringArrayRow> pRoles) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_USER.GRANT_ROLES", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_GRANTEE", pGrantee);
//			// cmd.addParameter(DbTypes.getCollectionType("P_ROLES", "", pRoles, object.class));
//				
//			cmd.execute();
//
//
//		}
		
		public static void handleTargetDeleted(NString targetNameIn,NString targetTypeIn,byte[] targetGuidIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_USER.HANDLE_TARGET_DELETED", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TARGET_NAME_IN", targetNameIn);
			cmd.addParameter("@TARGET_TYPE_IN", targetTypeIn);
			cmd.addParameter("@TARGET_GUID_IN", targetGuidIn);
				
			cmd.execute();


		}
		
		public static NNumber FhasPriv(NString userNameIn,NString privNameIn,byte[] guidIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_USER.HAS_PRIV", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@USER_NAME_IN", userNameIn);
			cmd.addParameter("@PRIV_NAME_IN", privNameIn);
			cmd.addParameter("@GUID_IN", guidIn);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber FhasPriv(NString userNameIn,NString privNameIn,NString targetNameIn,NString targetTypeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_USER.HAS_PRIV", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@USER_NAME_IN", userNameIn);
			cmd.addParameter("@PRIV_NAME_IN", privNameIn);
			cmd.addParameter("@TARGET_NAME_IN", targetNameIn);
			cmd.addParameter("@TARGET_TYPE_IN", targetTypeIn);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
//		public static DataCursor FhasPriv(NString userNameIn,NString privNameIn,List<MgmtUserGuidArrayRow> targetGuidsIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_USER.HAS_PRIV", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(DataCursor.class);
//			cmd.addParameter("@USER_NAME_IN", userNameIn);
//			cmd.addParameter("@PRIV_NAME_IN", privNameIn);
//			// cmd.addParameter(DbTypes.getCollectionType("TARGET_GUIDS_IN", "", targetGuidsIn, object.class));
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(DataCursor.class);
//
//		}
		
//		public static NNumber FhasPrivOnAll(NString userNameIn,NString privNameIn,List<MgmtUserGuidArrayRow> targetGuidsIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_USER.HAS_PRIV_ON_ALL", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NNumber.class);
//			cmd.addParameter("@USER_NAME_IN", userNameIn);
//			cmd.addParameter("@PRIV_NAME_IN", privNameIn);
//			// cmd.addParameter(DbTypes.getCollectionType("TARGET_GUIDS_IN", "", targetGuidsIn, object.class));
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NNumber.class);
//
//		}
		
		public static NNumber FhasRole(NString userNameIn,NString roleNameIn,NNumber withAdminIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_USER.HAS_ROLE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@USER_NAME_IN", userNameIn);
			cmd.addParameter("@ROLE_NAME_IN", roleNameIn);
			cmd.addParameter("@WITH_ADMIN_IN", withAdminIn);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static void invalidateUsers(NString modifiedRoleNameIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_USER.INVALIDATE_USERS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@MODIFIED_ROLE_NAME_IN", modifiedRoleNameIn);
				
			cmd.execute();


		}
		
		public static void jobDeleted(byte[] jobGuidIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_USER.JOB_DELETED", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@JOB_GUID_IN", jobGuidIn);
				
			cmd.execute();


		}
		
//		public static void makeEmUser(NString userNameIn,List<SmpEmdStringArrayRow> emailAddressesIn,List<SmpEmdStringArrayRow> rolesIn,List<MgmtUserPrivilegesRow> privilegesIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_USER.MAKE_EM_USER", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@USER_NAME_IN", userNameIn);
//			// cmd.addParameter(DbTypes.getCollectionType("EMAIL_ADDRESSES_IN", "", emailAddressesIn, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("ROLES_IN", "", rolesIn, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("PRIVILEGES_IN", "", privilegesIn, object.class));
//				
//			cmd.execute();
//
//
//		}
		
//		public static void makeEmUser(NString userNameIn,NString emailAddressIn,List<SmpEmdStringArrayRow> rolesIn,List<MgmtUserPrivilegesRow> privilegesIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_USER.MAKE_EM_USER", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@USER_NAME_IN", userNameIn);
//			cmd.addParameter("@EMAIL_ADDRESS_IN", emailAddressIn);
//			// cmd.addParameter(DbTypes.getCollectionType("ROLES_IN", "", rolesIn, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("PRIVILEGES_IN", "", privilegesIn, object.class));
//				
//			cmd.execute();
//
//
//		}
		
//		public static void makeEmUserDbconsole(NString userNameIn,List<SmpEmdStringArrayRow> emailAddressesIn,List<SmpEmdStringArrayRow> rolesIn,List<MgmtUserPrivilegesRow> privilegesIn,NNumber toGrantDbPrivIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_USER.MAKE_EM_USER_DBCONSOLE", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@USER_NAME_IN", userNameIn);
//			// cmd.addParameter(DbTypes.getCollectionType("EMAIL_ADDRESSES_IN", "", emailAddressesIn, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("ROLES_IN", "", rolesIn, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("PRIVILEGES_IN", "", privilegesIn, object.class));
//			cmd.addParameter("@TO_GRANT_DB_PRIV_IN", toGrantDbPrivIn);
//				
//			cmd.execute();
//
//
//		}
		
//		public static void modifyJobGrants(byte[] jobIdIn,NString replaceIn,List<SmpEmdNvpairArrayRow> grantNameIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_USER.MODIFY_JOB_GRANTS", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@JOB_ID_IN", jobIdIn);
//			cmd.addParameter("@REPLACE_IN", replaceIn);
//			// cmd.addParameter(DbTypes.getCollectionType("GRANT_NAME_IN", "", grantNameIn, object.class));
//				
//			cmd.execute();
//
//
//		}
		
//		public static void modifyRole(NString roleNameIn,NString descriptionIn,List<SmpEmdStringArrayRow> rolesIn,List<MgmtUserPrivilegesRow> privilegesIn,List<SmpEmdStringArrayRow> usersIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_USER.MODIFY_ROLE", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@ROLE_NAME_IN", roleNameIn);
//			cmd.addParameter("@DESCRIPTION_IN", descriptionIn);
//			// cmd.addParameter(DbTypes.getCollectionType("ROLES_IN", "", rolesIn, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("PRIVILEGES_IN", "", privilegesIn, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("USERS_IN", "", usersIn, object.class));
//				
//			cmd.execute();
//
//
//		}
		
//		public static void modifyUser(NString userNameIn,NString passwordIn,List<SmpEmdStringArrayRow> emailAddressesIn,List<SmpEmdStringArrayRow> rolesIn,List<MgmtUserPrivilegesRow> privilegesIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_USER.MODIFY_USER", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@USER_NAME_IN", userNameIn);
//			cmd.addParameter("@PASSWORD_IN", passwordIn);
//			// cmd.addParameter(DbTypes.getCollectionType("EMAIL_ADDRESSES_IN", "", emailAddressesIn, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("ROLES_IN", "", rolesIn, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("PRIVILEGES_IN", "", privilegesIn, object.class));
//				
//			cmd.execute();
//
//
//		}
		
//		public static void modifyUser(NString userNameIn,NString passwordIn,NString emailAddressIn,List<SmpEmdStringArrayRow> rolesIn,List<MgmtUserPrivilegesRow> privilegesIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_USER.MODIFY_USER", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@USER_NAME_IN", userNameIn);
//			cmd.addParameter("@PASSWORD_IN", passwordIn);
//			cmd.addParameter("@EMAIL_ADDRESS_IN", emailAddressIn);
//			// cmd.addParameter(DbTypes.getCollectionType("ROLES_IN", "", rolesIn, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("PRIVILEGES_IN", "", privilegesIn, object.class));
//				
//			cmd.execute();
//
//
//		}
		
		public static void nestedJobAdded(byte[] parentJobidIn,byte[] nestedJobidIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_USER.NESTED_JOB_ADDED", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PARENT_JOBID_IN", parentJobidIn);
			cmd.addParameter("@NESTED_JOBID_IN", nestedJobidIn);
				
			cmd.execute();


		}
		
		public static void nestedJobDeleted(byte[] nestedJobidIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_USER.NESTED_JOB_DELETED", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@NESTED_JOBID_IN", nestedJobidIn);
				
			cmd.execute();


		}
		
		public static NNumber FreleaseReadLock(NString lockHandleIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_USER.RELEASE_READ_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@LOCK_HANDLE_IN", lockHandleIn);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static void removeCallback(NString procIn,NNumber typeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_USER.REMOVE_CALLBACK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PROC_IN", procIn);
			cmd.addParameter("@TYPE_IN", typeIn);
				
			cmd.execute();


		}
		
		public static void reportDefinitionDeleted(byte[] reportGuidIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_USER.REPORT_DEFINITION_DELETED", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@REPORT_GUID_IN", reportGuidIn);
				
			cmd.execute();


		}
		
		public static void revokePriv(NString granteeIn,NString privNameIn,byte[] guidIn,NNumber invalidateIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_USER.REVOKE_PRIV", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@GRANTEE_IN", granteeIn);
			cmd.addParameter("@PRIV_NAME_IN", privNameIn);
			cmd.addParameter("@GUID_IN", guidIn);
			cmd.addParameter("@INVALIDATE_IN", invalidateIn);
				
			cmd.execute();


		}
		
		public static void revokePriv(NString granteeIn,NString privNameIn,NString targetNameIn,NString targetTypeIn,NNumber invalidateIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_USER.REVOKE_PRIV", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@GRANTEE_IN", granteeIn);
			cmd.addParameter("@PRIV_NAME_IN", privNameIn);
			cmd.addParameter("@TARGET_NAME_IN", targetNameIn);
			cmd.addParameter("@TARGET_TYPE_IN", targetTypeIn);
			cmd.addParameter("@INVALIDATE_IN", invalidateIn);
				
			cmd.execute();


		}
		
//		public static void revokePrivs(NString granteeIn,List<MgmtUserPrivilegesRow> privilegesIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_USER.REVOKE_PRIVS", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@GRANTEE_IN", granteeIn);
//			// cmd.addParameter(DbTypes.getCollectionType("PRIVILEGES_IN", "", privilegesIn, object.class));
//				
//			cmd.execute();
//
//
//		}
		
		public static void revokeRole(NString granteeIn,NString roleNameIn,NNumber invalidateIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_USER.REVOKE_ROLE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@GRANTEE_IN", granteeIn);
			cmd.addParameter("@ROLE_NAME_IN", roleNameIn);
			cmd.addParameter("@INVALIDATE_IN", invalidateIn);
				
			cmd.execute();


		}
		
//		public static void revokeRoles(NString pGrantee,List<MgmtShortStringArrayRow> pRoles) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_USER.REVOKE_ROLES", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_GRANTEE", pGrantee);
//			// cmd.addParameter(DbTypes.getCollectionType("P_ROLES", "", pRoles, object.class));
//				
//			cmd.execute();
//
//
//		}
		
		public static void revokeViewReportAll(byte[] reportIdIn,NString ownerIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_USER.REVOKE_VIEW_REPORT_ALL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@REPORT_ID_IN", reportIdIn);
			cmd.addParameter("@OWNER_IN", ownerIn);
				
			cmd.execute();


		}
		
		public static void setEmUserContext(NString emClientIn,NNumber opIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_USER.SET_EM_USER_CONTEXT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@EM_CLIENT_IN", emClientIn);
			cmd.addParameter("@OP_IN", opIn);
				
			cmd.execute();


		}
		
//		public static void targetAssocChanged(byte[] sourceTargetGuidIn,List<MgmtUserGuidArrayRow> assocTargetGuidsIn,NNumber changeIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_USER.TARGET_ASSOC_CHANGED", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@SOURCE_TARGET_GUID_IN", sourceTargetGuidIn);
//			// cmd.addParameter(DbTypes.getCollectionType("ASSOC_TARGET_GUIDS_IN", "", assocTargetGuidsIn, object.class));
//			cmd.addParameter("@CHANGE_IN", changeIn);
//				
//			cmd.execute();
//
//
//		}
		
		public static void templateDeleted(byte[] templateGuidIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_USER.TEMPLATE_DELETED", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TEMPLATE_GUID_IN", templateGuidIn);
				
			cmd.execute();


		}
		
		public static void updateFlatRoleGrants(NString roleNameIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_USER.UPDATE_FLAT_ROLE_GRANTS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@ROLE_NAME_IN", roleNameIn);
				
			cmd.execute();


		}
		
//		public static void updatePrivilege(NString pTargetName,NString pTargetType,NString pType,List<Varchar2TableRow> pNewObjectName,List<Varchar2TableRow> pNewObjectPriv,List<Varchar2TableRow> pChangedObjectName,List<Varchar2TableRow> pChangedObjectPriv,List<Varchar2TableRow> pPreviousObjectName,List<Varchar2TableRow> pPreviousObjectPriv,List<Varchar2TableRow> pRevokedObjectName,List<Varchar2TableRow> pRevokedObjectPriv) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_USER.UPDATE_PRIVILEGE", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_TARGET_NAME", pTargetName);
//			cmd.addParameter("@P_TARGET_TYPE", pTargetType);
//			cmd.addParameter("@P_TYPE", pType);
//			// cmd.addParameter(DbTypes.getCollectionType("P_NEW_OBJECT_NAME", "", pNewObjectName, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("P_NEW_OBJECT_PRIV", "", pNewObjectPriv, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("P_CHANGED_OBJECT_NAME", "", pChangedObjectName, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("P_CHANGED_OBJECT_PRIV", "", pChangedObjectPriv, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("P_PREVIOUS_OBJECT_NAME", "", pPreviousObjectName, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("P_PREVIOUS_OBJECT_PRIV", "", pPreviousObjectPriv, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("P_REVOKED_OBJECT_NAME", "", pRevokedObjectName, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("P_REVOKED_OBJECT_PRIV", "", pRevokedObjectPriv, object.class));
//				
//			cmd.execute();
//
//
//		}
		
//		public static void updatePrivilige(NString pTargetName,NString pTargetType,NString pType,List<Varchar2TableRow> pObjectName,List<Varchar2TableRow> pObjectPriv) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_USER.UPDATE_PRIVILIGE", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_TARGET_NAME", pTargetName);
//			cmd.addParameter("@P_TARGET_TYPE", pTargetType);
//			cmd.addParameter("@P_TYPE", pType);
//			// cmd.addParameter(DbTypes.getCollectionType("P_OBJECT_NAME", "", pObjectName, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("P_OBJECT_PRIV", "", pObjectPriv, object.class));
//				
//			cmd.execute();
//
//
//		}
		
//		public static void updateRevokeGrantPrivilege(byte[] pGuid,NString pRevokeOrGrant,List<Varchar2TableRow> pObjectName,List<Varchar2TableRow> pObjectPriv) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_USER.UPDATE_REVOKE_GRANT_PRIVILEGE", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_GUID", pGuid);
//			cmd.addParameter("@P_REVOKE_OR_GRANT", pRevokeOrGrant);
//			// cmd.addParameter(DbTypes.getCollectionType("P_OBJECT_NAME", "", pObjectName, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("P_OBJECT_PRIV", "", pObjectPriv, object.class));
//				
//			cmd.execute();
//
//
//		}
		
//		public static void updateUserPrefEmail(NString userNameIn,List<SmpEmdStringArrayRow> userEmailIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_USER.UPDATE_USER_PREF_EMAIL", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@USER_NAME_IN", userNameIn);
//			// cmd.addParameter(DbTypes.getCollectionType("USER_EMAIL_IN", "", userEmailIn, object.class));
//				
//			cmd.execute();
//
//
//		}
		
//		public static void updateUserPrefEmail(NString userNameIn,List<SmpEmdStringArrayRow> userEmailIn,List<SmpEmdIntegerArrayRow> userEmailFormatIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_USER.UPDATE_USER_PREF_EMAIL", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@USER_NAME_IN", userNameIn);
//			// cmd.addParameter(DbTypes.getCollectionType("USER_EMAIL_IN", "", userEmailIn, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("USER_EMAIL_FORMAT_IN", "", userEmailFormatIn, object.class));
//				
//			cmd.execute();
//
//
//		}
		
		public static NNumber FvalidGroupMember(byte[] groupGuidIn,byte[] memberGuidIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_USER.VALID_GROUP_MEMBER", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@GROUP_GUID_IN", groupGuidIn);
			cmd.addParameter("@MEMBER_GUID_IN", memberGuidIn);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber FvalidGroupMember(byte[] groupGuidIn,NString memberTargetNameIn,NString memberTargetTypeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_USER.VALID_GROUP_MEMBER", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@GROUP_GUID_IN", groupGuidIn);
			cmd.addParameter("@MEMBER_TARGET_NAME_IN", memberTargetNameIn);
			cmd.addParameter("@MEMBER_TARGET_TYPE_IN", memberTargetTypeIn);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
	
	
	
}
