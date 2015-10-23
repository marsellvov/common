package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Gokfgac {
		public static NString fCommonPredicate(NString pObjschema,NString pObjectname,NString pCrud,NString pFgacUser) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKFGAC.F_COMMON_PREDICATE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_OBJSCHEMA", pObjschema);
			cmd.addParameter("@P_OBJECTNAME", pObjectname);
			cmd.addParameter("@P_CRUD", pCrud);
			cmd.addParameter("@P_FGAC_USER", pFgacUser);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fDeleteFnc(NString pObjschema,NString pObjectname) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKFGAC.F_DELETE_FNC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_OBJSCHEMA", pObjschema);
			cmd.addParameter("@P_OBJECTNAME", pObjectname);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fFindPiiDomain() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKFGAC.F_FIND_PII_DOMAIN", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fFindPredicate(NString pFdmnName,NString pDatabaseActivity,NString pCtxFdmnName,NString pFgacUser) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKFGAC.F_FIND_PREDICATE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_FDMN_NAME", pFdmnName);
			cmd.addParameter("@P_DATABASE_ACTIVITY", pDatabaseActivity);
			cmd.addParameter("@P_CTX_FDMN_NAME", pCtxFdmnName);
			cmd.addParameter("@P_FGAC_USER", pFgacUser);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fFormatData(NString pFmask,NString pData) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKFGAC.F_FORMAT_DATA", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_FMASK", pFmask);
			cmd.addParameter("@P_DATA", pData);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetHomeDomain() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKFGAC.F_GET_HOME_DOMAIN", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetPidm() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKFGAC.F_GET_PIDM", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetPolicyName(NString pOwnerName,NString pTableName,NString pPolicyType,NString pPolicyPrefix) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKFGAC.F_GET_POLICY_NAME", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_OWNER_NAME", pOwnerName);
			cmd.addParameter("@P_TABLE_NAME", pTableName);
			cmd.addParameter("@P_POLICY_TYPE", pPolicyType);
			cmd.addParameter("@P_POLICY_PREFIX", pPolicyPrefix);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetTempPidm(NNumber pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKFGAC.F_GET_TEMP_PIDM", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fInsertFnc(NString pObjschema,NString pObjectname) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKFGAC.F_INSERT_FNC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_OBJSCHEMA", pObjschema);
			cmd.addParameter("@P_OBJECTNAME", pObjectname);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsUserExempt() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKFGAC.F_IS_USER_EXEMPT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fPredicateHeader(NString pTablePredicate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKFGAC.F_PREDICATE_HEADER", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_TABLE_PREDICATE", pTablePredicate);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fQueryPolicy(NString pObjectname,NString pCrud) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKFGAC.F_QUERY_POLICY", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_OBJECTNAME", pObjectname);
			cmd.addParameter("@P_CRUD", pCrud);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fQueryPredicate(NString pObjectname,NString pCrud,NString pFgacUser) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKFGAC.F_QUERY_PREDICATE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_OBJECTNAME", pObjectname);
			cmd.addParameter("@P_CRUD", pCrud);
			cmd.addParameter("@P_FGAC_USER", pFgacUser);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fSelectFnc(NString pObjschema,NString pObjectname) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKFGAC.F_SELECT_FNC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_OBJSCHEMA", pObjschema);
			cmd.addParameter("@P_OBJECTNAME", pObjectname);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fSpridenPiiActive() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKFGAC.F_SPRIDEN_PII_ACTIVE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fUpdateFnc(NString pObjschema,NString pObjectname) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKFGAC.F_UPDATE_FNC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_OBJSCHEMA", pObjschema);
			cmd.addParameter("@P_OBJECTNAME", pObjectname);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fValidatePredicate(NString pFdmnCode,NString pPredicate,NString pTableName,Ref<NString> errMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKFGAC.F_VALIDATE_PREDICATE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_FDMN_CODE", pFdmnCode);
			cmd.addParameter("@P_PREDICATE", pPredicate);
			cmd.addParameter("@P_TABLE_NAME", pTableName);
			cmd.addParameter("@ERR_MSG", NString.class);
				
			cmd.execute();
			errMsg.val = cmd.getParameterValue("@ERR_MSG", NString.class);

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fValidateVbsDriver(NString pPredicate,NString pTableName,Ref<NString> errMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKFGAC.F_VALIDATE_VBS_DRIVER", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PREDICATE", pPredicate);
			cmd.addParameter("@P_TABLE_NAME", pTableName);
			cmd.addParameter("@ERR_MSG", NString.class);
				
			cmd.execute();
			errMsg.val = cmd.getParameterValue("@ERR_MSG", NString.class);

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pAddPolicy(NString pPolicyName,NString pTableOwner,NString pTableName,NString pCrudInd,NString pEnabledInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKFGAC.P_ADD_POLICY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_POLICY_NAME", pPolicyName);
			cmd.addParameter("@P_TABLE_OWNER", pTableOwner);
			cmd.addParameter("@P_TABLE_NAME", pTableName);
			cmd.addParameter("@P_CRUD_IND", pCrudInd);
			cmd.addParameter("@P_ENABLED_IND", pEnabledInd);
				
			cmd.execute();


		}
		
		public static void pDisableFgac(NString pEnableFgac) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKFGAC.P_DISABLE_FGAC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ENABLE_FGAC", pEnableFgac);
				
			cmd.execute();


		}
		
		public static void pDomainEnabled() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKFGAC.P_DOMAIN_ENABLED", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pDropPolicy(NString pPolicyName,NString pTableOwner,NString pTableName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKFGAC.P_DROP_POLICY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_POLICY_NAME", pPolicyName);
			cmd.addParameter("@P_TABLE_OWNER", pTableOwner);
			cmd.addParameter("@P_TABLE_NAME", pTableName);
				
			cmd.execute();


		}
		
		public static void pEnableFdmn(NString pPolicy,NString pEnableInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKFGAC.P_ENABLE_FDMN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_POLICY", pPolicy);
			cmd.addParameter("@P_ENABLE_IND", pEnableInd);
				
			cmd.execute();


		}
		
		public static void pFindUserPiiDomains(NString pFgacUser) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKFGAC.P_FIND_USER_PII_DOMAINS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_FGAC_USER", pFgacUser);
				
			cmd.execute();


		}
		
		public static void pGetUserInfo(NString pFgacUser) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKFGAC.P_GET_USER_INFO", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_FGAC_USER", pFgacUser);
				
			cmd.execute();


		}
		
		public static void pObjectExcluded(NString pObject) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKFGAC.P_OBJECT_EXCLUDED", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OBJECT", pObject);
				
			cmd.execute();


		}
		
		public static void pRequirePiiPrompt() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKFGAC.P_REQUIRE_PII_PROMPT", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pSearchFormUpdateTempPidm(NNumber pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKFGAC.P_SEARCH_FORM_UPDATE_TEMP_PIDM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();


		}
		
		public static void pSetHomeDomain(NString pNewDomain) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKFGAC.P_SET_HOME_DOMAIN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_NEW_DOMAIN", pNewDomain);
				
			cmd.execute();


		}
		
		public static void pTurnFgacOff() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKFGAC.P_TURN_FGAC_OFF", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTurnFgacOn() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKFGAC.P_TURN_FGAC_ON", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pUpdateTempPidm(NNumber pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKFGAC.P_UPDATE_TEMP_PIDM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();


		}
		
	
	
	
}
