package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class MgmtCredential {
		public static void applyTemplateCopyCollCreds(byte[] pTemplateGuid,byte[] pTargetGuid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_CREDENTIAL.APPLY_TEMPLATE_COPY_COLL_CREDS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TEMPLATE_GUID", pTemplateGuid);
			cmd.addParameter("@P_TARGET_GUID", pTargetGuid);
				
			cmd.execute();


		}
		
//		public static void changeCredential(NString pTargetName,NString pTargetType,NString pCredentialType, pKeyColumn,List<SmpEmdNvpairArrayRow> pNonKeyCols,List<SmpEmdStringArrayRow> pOldValues,NNumber pUserOnly,NNumber pPropogate) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_CREDENTIAL.CHANGE_CREDENTIAL", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_TARGET_NAME", pTargetName);
//			cmd.addParameter("@P_TARGET_TYPE", pTargetType);
//			cmd.addParameter("@P_CREDENTIAL_TYPE", pCredentialType);
//			cmd.addParameter("@P_KEY_COLUMN", pKeyColumn);
//			// cmd.addParameter(DbTypes.getCollectionType("P_NON_KEY_COLS", "", pNonKeyCols, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("P_OLD_VALUES", "", pOldValues, object.class));
//			cmd.addParameter("@P_USER_ONLY", pUserOnly);
//			cmd.addParameter("@P_PROPOGATE", pPropogate);
//				
//			cmd.execute();
//
//
//		}
		
		public static void changeHostPassword(NString pHostName,NString pHostUserName,NString pHostPassword) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_CREDENTIAL.CHANGE_HOST_PASSWORD", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_HOST_NAME", pHostName);
			cmd.addParameter("@P_HOST_USER_NAME", pHostUserName);
			cmd.addParameter("@P_HOST_PASSWORD", pHostPassword);
				
			cmd.execute();


		}
		
		public static void computeAssociatedInfo(byte[] pCredentialGuid,byte[] pTargetGuid,NString pSetName,NString pCredentialSetColumn,NString pCredentialValue,Ref<NString> pTypeNameOut,Ref<NString> pTypeColumnOut,Ref<NString> pKeyValueOut,Ref<byte[]> pAssocTargetOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_CREDENTIAL.COMPUTE_ASSOCIATED_INFO", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CREDENTIAL_GUID", pCredentialGuid);
			cmd.addParameter("@P_TARGET_GUID", pTargetGuid);
			cmd.addParameter("@P_SET_NAME", pSetName);
			cmd.addParameter("@P_CREDENTIAL_SET_COLUMN", pCredentialSetColumn);
			cmd.addParameter("@P_CREDENTIAL_VALUE", pCredentialValue);
			cmd.addParameter("@P_TYPE_NAME_OUT", NString.class);
			cmd.addParameter("@P_TYPE_COLUMN_OUT", NString.class);
			cmd.addParameter("@P_KEY_VALUE_OUT", NString.class);
			cmd.addParameter("@P_ASSOC_TARGET_OUT", byte[].class);
				
			cmd.execute();
			pTypeNameOut.val = cmd.getParameterValue("@P_TYPE_NAME_OUT", NString.class);
			pTypeColumnOut.val = cmd.getParameterValue("@P_TYPE_COLUMN_OUT", NString.class);
			pKeyValueOut.val = cmd.getParameterValue("@P_KEY_VALUE_OUT", NString.class);
			pAssocTargetOut.val = cmd.getParameterValue("@P_ASSOC_TARGET_OUT", byte[].class);


		}
		
//		public static void createCredentialSet(NString pTargetType,NString pTargetTypeMetaVer,NString pSetName,NString pSetUsage,NString pSetContextType,NString pSetContext,NString pSetDisplayName,NString pSetDisplayNlsid,NString pTypeName,List<MgmtCredSetColArrayRow> pSetColumns) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_CREDENTIAL.CREATE_CREDENTIAL_SET", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_TARGET_TYPE", pTargetType);
//			cmd.addParameter("@P_TARGET_TYPE_META_VER", pTargetTypeMetaVer);
//			cmd.addParameter("@P_SET_NAME", pSetName);
//			cmd.addParameter("@P_SET_USAGE", pSetUsage);
//			cmd.addParameter("@P_SET_CONTEXT_TYPE", pSetContextType);
//			cmd.addParameter("@P_SET_CONTEXT", pSetContext);
//			cmd.addParameter("@P_SET_DISPLAY_NAME", pSetDisplayName);
//			cmd.addParameter("@P_SET_DISPLAY_NLSID", pSetDisplayNlsid);
//			cmd.addParameter("@P_TYPE_NAME", pTypeName);
//			// cmd.addParameter(DbTypes.getCollectionType("P_SET_COLUMNS", "", pSetColumns, object.class));
//				
//			cmd.execute();
//
//
//		}
		
//		public static void createCredentialSet(NString pTargetType,NString pSetName,NString pSetUsage,NString pSetContextType,NString pSetContext,NString pSetDisplayName,NString pSetDisplayNlsid,NString pTypeName,List<MgmtCredSetColArrayRow> pSetColumns) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_CREDENTIAL.CREATE_CREDENTIAL_SET", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_TARGET_TYPE", pTargetType);
//			cmd.addParameter("@P_SET_NAME", pSetName);
//			cmd.addParameter("@P_SET_USAGE", pSetUsage);
//			cmd.addParameter("@P_SET_CONTEXT_TYPE", pSetContextType);
//			cmd.addParameter("@P_SET_CONTEXT", pSetContext);
//			cmd.addParameter("@P_SET_DISPLAY_NAME", pSetDisplayName);
//			cmd.addParameter("@P_SET_DISPLAY_NLSID", pSetDisplayNlsid);
//			cmd.addParameter("@P_TYPE_NAME", pTypeName);
//			// cmd.addParameter(DbTypes.getCollectionType("P_SET_COLUMNS", "", pSetColumns, object.class));
//				
//			cmd.execute();
//
//
//		}
		
//		public static void createCredentialType(NString pTargetType,NString pTypeName,NString pTargetTypeMetaVer,NString pTypeDisplayName,NString pTypeDisplayNlsid,NString pDescription,List<MgmtCredTypeRefArrayRow> pRefs,List<MgmtCredTypeColArrayRow> pTypeColumns) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_CREDENTIAL.CREATE_CREDENTIAL_TYPE", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_TARGET_TYPE", pTargetType);
//			cmd.addParameter("@P_TYPE_NAME", pTypeName);
//			cmd.addParameter("@P_TARGET_TYPE_META_VER", pTargetTypeMetaVer);
//			cmd.addParameter("@P_TYPE_DISPLAY_NAME", pTypeDisplayName);
//			cmd.addParameter("@P_TYPE_DISPLAY_NLSID", pTypeDisplayNlsid);
//			cmd.addParameter("@P_DESCRIPTION", pDescription);
//			// cmd.addParameter(DbTypes.getCollectionType("P_REFS", "", pRefs, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("P_TYPE_COLUMNS", "", pTypeColumns, object.class));
//				
//			cmd.execute();
//
//
//		}
		
//		public static void createPdpType( pPdp) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_CREDENTIAL.CREATE_PDP_TYPE", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_PDP", pPdp);
//				
//			cmd.execute();
//
//
//		}
		
		public static void deleteAruCredentials() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_CREDENTIAL.DELETE_ARU_CREDENTIALS", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void deleteCaCredentials(byte[] pJobId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_CREDENTIAL.DELETE_CA_CREDENTIALS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_JOB_ID", pJobId);
				
			cmd.execute();


		}
		
		public static void deleteCollTemplateCreds(NString pCredentialSetName,byte[] pObjectGuid,NNumber pObjectType,NString pTargetName,NString pTargetType,NString pMetricName,NString pMetricColumn,NString pCollectionName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_CREDENTIAL.DELETE_COLL_TEMPLATE_CREDS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CREDENTIAL_SET_NAME", pCredentialSetName);
			cmd.addParameter("@P_OBJECT_GUID", pObjectGuid);
			cmd.addParameter("@P_OBJECT_TYPE", pObjectType);
			cmd.addParameter("@P_TARGET_NAME", pTargetName);
			cmd.addParameter("@P_TARGET_TYPE", pTargetType);
			cmd.addParameter("@P_METRIC_NAME", pMetricName);
			cmd.addParameter("@P_METRIC_COLUMN", pMetricColumn);
			cmd.addParameter("@P_COLLECTION_NAME", pCollectionName);
				
			cmd.execute();


		}
		
		public static void deleteCollectionCredentials(NString pCredentialSetName,NString pTargetName,NString pTargetType,NString pMetricName,NString pMetricColumn,NString pCollectionName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_CREDENTIAL.DELETE_COLLECTION_CREDENTIALS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CREDENTIAL_SET_NAME", pCredentialSetName);
			cmd.addParameter("@P_TARGET_NAME", pTargetName);
			cmd.addParameter("@P_TARGET_TYPE", pTargetType);
			cmd.addParameter("@P_METRIC_NAME", pMetricName);
			cmd.addParameter("@P_METRIC_COLUMN", pMetricColumn);
			cmd.addParameter("@P_COLLECTION_NAME", pCollectionName);
				
			cmd.execute();


		}
		
		public static void deleteContainerCredentials(NString pCredentialSetName,NString pHostName,NString pContainerLocation,NString pUserName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_CREDENTIAL.DELETE_CONTAINER_CREDENTIALS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CREDENTIAL_SET_NAME", pCredentialSetName);
			cmd.addParameter("@P_HOST_NAME", pHostName);
			cmd.addParameter("@P_CONTAINER_LOCATION", pContainerLocation);
			cmd.addParameter("@P_USER_NAME", pUserName);
				
			cmd.execute();


		}
		
		public static void deleteCredentialSet(NString pTargetType,NString pSetName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_CREDENTIAL.DELETE_CREDENTIAL_SET", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TARGET_TYPE", pTargetType);
			cmd.addParameter("@P_SET_NAME", pSetName);
				
			cmd.execute();


		}
		
		public static void deleteCredentialType(NString pTargetType,NString pTypeName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_CREDENTIAL.DELETE_CREDENTIAL_TYPE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TARGET_TYPE", pTargetType);
			cmd.addParameter("@P_TYPE_NAME", pTypeName);
				
			cmd.execute();


		}
		
		public static void deleteEnterpriseCredentials(NString pCredentialSetName,NString pTargetType,NString pUserName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_CREDENTIAL.DELETE_ENTERPRISE_CREDENTIALS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CREDENTIAL_SET_NAME", pCredentialSetName);
			cmd.addParameter("@P_TARGET_TYPE", pTargetType);
			cmd.addParameter("@P_USER_NAME", pUserName);
				
			cmd.execute();


		}
		
		public static void deleteHostCredentials(NString pCredentialSetName,NString pHostName,NString pTargetType,NString pUserName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_CREDENTIAL.DELETE_HOST_CREDENTIALS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CREDENTIAL_SET_NAME", pCredentialSetName);
			cmd.addParameter("@P_HOST_NAME", pHostName);
			cmd.addParameter("@P_TARGET_TYPE", pTargetType);
			cmd.addParameter("@P_USER_NAME", pUserName);
				
			cmd.execute();


		}
		
		public static void deleteJobCredentials(NString pJobName,NString pJobOwner,NNumber pIsLibrary) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_CREDENTIAL.DELETE_JOB_CREDENTIALS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_JOB_NAME", pJobName);
			cmd.addParameter("@P_JOB_OWNER", pJobOwner);
			cmd.addParameter("@P_IS_LIBRARY", pIsLibrary);
				
			cmd.execute();


		}
		
		public static void deleteJobCredentials(byte[] pJobId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_CREDENTIAL.DELETE_JOB_CREDENTIALS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_JOB_ID", pJobId);
				
			cmd.execute();


		}
		
		public static void deleteTargetCredentials(NString pCredentialSetName,NString pTargetName,NString pTargetType,NString pUserName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_CREDENTIAL.DELETE_TARGET_CREDENTIALS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CREDENTIAL_SET_NAME", pCredentialSetName);
			cmd.addParameter("@P_TARGET_NAME", pTargetName);
			cmd.addParameter("@P_TARGET_TYPE", pTargetType);
			cmd.addParameter("@P_USER_NAME", pUserName);
				
			cmd.execute();


		}
		
		public static NString FgetCredentialSetKeyColumn(NString pCredset,NString pTargetType) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_CREDENTIAL.GET_CREDENTIAL_SET_KEY_COLUMN", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_CREDSET", pCredset);
			cmd.addParameter("@P_TARGET_TYPE", pTargetType);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
//		public static List<MgmtJobCredArrayRow> FgetJobCredentials(byte[] pJobId) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_CREDENTIAL.GET_JOB_CREDENTIALS", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<MgmtJobCredArrayRow>.class);
//			cmd.addParameter("@P_JOB_ID", pJobId);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<MgmtJobCredArrayRow>.class);
//
//		}
		
//		public static  FgetJobCredsDefault(byte[] pJobId,NString pJobOwner,NString pCredentialSet,NString pTargetType,byte[] pTargetGuid,NString pContainerLocation,byte[] pInstanceGuid,NString pInstanceType,byte[] pJobTypeId,NString pTaskName) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_CREDENTIAL.GET_JOB_CREDS_DEFAULT", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@P_JOB_ID", pJobId);
//			cmd.addParameter("@P_JOB_OWNER", pJobOwner);
//			cmd.addParameter("@P_CREDENTIAL_SET", pCredentialSet);
//			cmd.addParameter("@P_TARGET_TYPE", pTargetType);
//			cmd.addParameter("@P_TARGET_GUID", pTargetGuid);
//			cmd.addParameter("@P_CONTAINER_LOCATION", pContainerLocation);
//			cmd.addParameter("@P_INSTANCE_GUID", pInstanceGuid);
//			cmd.addParameter("@P_INSTANCE_TYPE", pInstanceType);
//			cmd.addParameter("@P_JOB_TYPE_ID", pJobTypeId);
//			cmd.addParameter("@P_TASK_NAME", pTaskName);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
//		
//		public static List<MgmtPdpMetaArrayRow> FgetPdpTypes() {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_CREDENTIAL.GET_PDP_TYPES", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<MgmtPdpMetaArrayRow>.class);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<MgmtPdpMetaArrayRow>.class);
//
//		}
		
//		public static  FgetTargetCredsDefault(NString pCredentialSet,NString pTargetName,NString pTargetType,NString pUserName) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_CREDENTIAL.GET_TARGET_CREDS_DEFAULT", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@P_CREDENTIAL_SET", pCredentialSet);
//			cmd.addParameter("@P_TARGET_NAME", pTargetName);
//			cmd.addParameter("@P_TARGET_TYPE", pTargetType);
//			cmd.addParameter("@P_USER_NAME", pUserName);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
		
		public static NString FgetValue(NString pCredentialColumn,NString pUser,NString pContainerLocation,byte[] pTargetGuid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_CREDENTIAL.GET_VALUE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_CREDENTIAL_COLUMN", pCredentialColumn);
			cmd.addParameter("@P_USER", pUser);
			cmd.addParameter("@P_CONTAINER_LOCATION", pContainerLocation);
			cmd.addParameter("@P_TARGET_GUID", pTargetGuid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
//		public static void insertCredentials(NString pUser,NString pTargetName,NString pTargetType,NString pContainerLocation,List<SmpEmdNvpairArrayRow> pCredentials) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_CREDENTIAL.INSERT_CREDENTIALS", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_USER", pUser);
//			cmd.addParameter("@P_TARGET_NAME", pTargetName);
//			cmd.addParameter("@P_TARGET_TYPE", pTargetType);
//			cmd.addParameter("@P_CONTAINER_LOCATION", pContainerLocation);
//			// cmd.addParameter(DbTypes.getCollectionType("P_CREDENTIALS", "", pCredentials, object.class));
//				
//			cmd.execute();
//
//
//		}
		
//		public static void insertMonitoringCredentials(NString pTargetName,NString pTargetType,List<SmpEmdNvpairArrayRow> pCredentials,NBool pPropogateToAgent) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_CREDENTIAL.INSERT_MONITORING_CREDENTIALS", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_TARGET_NAME", pTargetName);
//			cmd.addParameter("@P_TARGET_TYPE", pTargetType);
//			// cmd.addParameter(DbTypes.getCollectionType("P_CREDENTIALS", "", pCredentials, object.class));
//			cmd.addParameter("@P_PROPOGATE_TO_AGENT", pPropogateToAgent);
//				
//			cmd.execute();
//
//
//		}
		
		public static NBool Fis40StyleSet(NString pSetName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_CREDENTIAL.IS_40_STYLE_SET", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@P_SET_NAME", pSetName);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool FisConsoleInsert() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_CREDENTIAL.IS_CONSOLE_INSERT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool FisNoRecursion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_CREDENTIAL.IS_NO_RECURSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static void postProcess(NBool pUpdating) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_CREDENTIAL.POST_PROCESS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_UPDATING", pUpdating);
				
			cmd.execute();


		}
		
		public static void setAruCredentials(NString pUsername,NString pPassword) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_CREDENTIAL.SET_ARU_CREDENTIALS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_USERNAME", pUsername);
			cmd.addParameter("@P_PASSWORD", pPassword);
				
			cmd.execute();


		}
		
//		public static void setCaCredentials(byte[] pJobId,List<MgmtJobCredArrayRow> pCredentials) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_CREDENTIAL.SET_CA_CREDENTIALS", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_JOB_ID", pJobId);
//			// cmd.addParameter(DbTypes.getCollectionType("P_CREDENTIALS", "", pCredentials, object.class));
//				
//			cmd.execute();
//
//
//		}
		
//		public static void setCollectionCredentials(List<MgmtCollectionCredArrayRow> pCredentials) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_CREDENTIAL.SET_COLLECTION_CREDENTIALS", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getCollectionType("P_CREDENTIALS", "", pCredentials, object.class));
//				
//			cmd.execute();
//
//
//		}
		
//		public static void setCollectionTemplateCreds(List<MgmtCollectionCredArrayRow> pCredentials,byte[] pObjectGuid,NNumber pObjectType) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_CREDENTIAL.SET_COLLECTION_TEMPLATE_CREDS", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getCollectionType("P_CREDENTIALS", "", pCredentials, object.class));
//			cmd.addParameter("@P_OBJECT_GUID", pObjectGuid);
//			cmd.addParameter("@P_OBJECT_TYPE", pObjectType);
//				
//			cmd.execute();
//
//
//		}
		
//		public static void setContainerCredentials(List<MgmtContainerCredArrayRow> pCredentials) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_CREDENTIAL.SET_CONTAINER_CREDENTIALS", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getCollectionType("P_CREDENTIALS", "", pCredentials, object.class));
//				
//			cmd.execute();
//
//
//		}
		
//		public static void setEnterpriseCredentials(List<MgmtEnterpriseCredArrayRow> pCredentials) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_CREDENTIAL.SET_ENTERPRISE_CREDENTIALS", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getCollectionType("P_CREDENTIALS", "", pCredentials, object.class));
//				
//			cmd.execute();
//
//
//		}
		
//		public static void setHostCredentials(List<MgmtHostCredArrayRow> pCredentials) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_CREDENTIAL.SET_HOST_CREDENTIALS", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getCollectionType("P_CREDENTIALS", "", pCredentials, object.class));
//				
//			cmd.execute();
//
//
//		}
		
//		public static void setJobCredentials(NString pJobName,NString pOwner,NNumber pIsLibrary,List<MgmtJobCredArrayRow> pCredentials) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_CREDENTIAL.SET_JOB_CREDENTIALS", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_JOB_NAME", pJobName);
//			cmd.addParameter("@P_OWNER", pOwner);
//			cmd.addParameter("@P_IS_LIBRARY", pIsLibrary);
//			// cmd.addParameter(DbTypes.getCollectionType("P_CREDENTIALS", "", pCredentials, object.class));
//				
//			cmd.execute();
//
//
//		}
		
//		public static void setJobCredentials(byte[] pJobId,List<MgmtJobCredArrayRow> pCredentials) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_CREDENTIAL.SET_JOB_CREDENTIALS", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_JOB_ID", pJobId);
//			// cmd.addParameter(DbTypes.getCollectionType("P_CREDENTIALS", "", pCredentials, object.class));
//				
//			cmd.execute();
//
//
//		}
		
//		public static void setMonitoringCredentials(List<MgmtTargetCredArrayRow> pCredentials,NBool pPropogate) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_CREDENTIAL.SET_MONITORING_CREDENTIALS", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getCollectionType("P_CREDENTIALS", "", pCredentials, object.class));
//			cmd.addParameter("@P_PROPOGATE", pPropogate);
//				
//			cmd.execute();
//
//
//		}
		
//		public static void setNestedJobCredInfo(byte[] pJobTypeId,NString pNestedJobName,List<MgmtJobCredArrayRow> pCredentials) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_CREDENTIAL.SET_NESTED_JOB_CRED_INFO", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_JOB_TYPE_ID", pJobTypeId);
//			cmd.addParameter("@P_NESTED_JOB_NAME", pNestedJobName);
//			// cmd.addParameter(DbTypes.getCollectionType("P_CREDENTIALS", "", pCredentials, object.class));
//				
//			cmd.execute();
//
//
//		}
		
//		public static void setTargetCredentials(List<MgmtTargetCredArrayRow> pCredentials) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_CREDENTIAL.SET_TARGET_CREDENTIALS", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getCollectionType("P_CREDENTIALS", "", pCredentials, object.class));
//				
//			cmd.execute();
//
//
//		}
		
		public static void updCollectionTemplateCreds(byte[] pObjectGuidOld,byte[] pObjectGuidNew,NNumber pObjectType,byte[] pTargetGuid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_CREDENTIAL.UPD_COLLECTION_TEMPLATE_CREDS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OBJECT_GUID_OLD", pObjectGuidOld);
			cmd.addParameter("@P_OBJECT_GUID_NEW", pObjectGuidNew);
			cmd.addParameter("@P_OBJECT_TYPE", pObjectType);
			cmd.addParameter("@P_TARGET_GUID", pTargetGuid);
				
			cmd.execute();


		}
		
	
	
	
}
