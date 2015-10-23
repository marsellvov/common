package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class EcmUtil {
		public static NString FallPolicyViolColumnVals(byte[] pViolationId,NString pColumnName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ECM_UTIL.ALL_POLICY_VIOL_COLUMN_VALS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_VIOLATION_ID", pViolationId);
			cmd.addParameter("@P_COLUMN_NAME", pColumnName);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FconcatCol(NString col,NString tab,NString predicate,NString delimeter,NNumber colLimit) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ECM_UTIL.CONCAT_COL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@COL", col);
			cmd.addParameter("@TAB", tab);
			cmd.addParameter("@PREDICATE", predicate);
			cmd.addParameter("@DELIMETER", delimeter);
			cmd.addParameter("@COL_LIMIT", colLimit);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FconcatComponentVersion(NString pComponentName,byte[] pContainerGuid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ECM_UTIL.CONCAT_COMPONENT_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_COMPONENT_NAME", pComponentName);
			cmd.addParameter("@P_CONTAINER_GUID", pContainerGuid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FconcatResultCol(DataCursor c1,NString delimeter,NNumber colLimit) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ECM_UTIL.CONCAT_RESULT_COL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@C1", DataCursor.class);
			cmd.addParameter("@DELIMETER", delimeter);
			cmd.addParameter("@COL_LIMIT", colLimit);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FconfigStdKeywordList(byte[] pCsGuid,NString pLanguageCode,NString pCountryCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ECM_UTIL.CONFIG_STD_KEYWORD_LIST", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_CS_GUID", pCsGuid);
			cmd.addParameter("@P_LANGUAGE_CODE", pLanguageCode);
			cmd.addParameter("@P_COUNTRY_CODE", pCountryCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FcsaClientRuleList(byte[] pSnapshotId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ECM_UTIL.CSA_CLIENT_RULE_LIST", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_SNAPSHOT_ID", pSnapshotId);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FcsaTargetList(NString pApplicationId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ECM_UTIL.CSA_TARGET_LIST", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_APPLICATION_ID", pApplicationId);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fixedBugsInHome(byte[] pHomeId,NString pDelimiter) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ECM_UTIL.FIXED_BUGS_IN_HOME", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_HOME_ID", pHomeId);
			cmd.addParameter("@P_DELIMITER", pDelimiter);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fixedBugsInPatch(byte[] pPatchGuid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ECM_UTIL.FIXED_BUGS_IN_PATCH", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PATCH_GUID", pPatchGuid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor FgetCloneSource(NString pSearchexact,NString pSearchcol,NString pSearchval,NString pCompListDb,NString pCompListAs,NString pHostname) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ECM_UTIL.GET_CLONE_SOURCE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_SEARCHEXACT", pSearchexact);
			cmd.addParameter("@P_SEARCHCOL", pSearchcol);
			cmd.addParameter("@P_SEARCHVAL", pSearchval);
			cmd.addParameter("@P_COMP_LIST_DB", pCompListDb);
			cmd.addParameter("@P_COMP_LIST_AS", pCompListAs);
			cmd.addParameter("@P_HOSTNAME", pHostname);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static NString FgetGenericValsDatatype(NString vTextinquestion) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ECM_UTIL.GET_GENERIC_VALS_DATATYPE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@V_TEXTINQUESTION", vTextinquestion);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void getHistForGroup(NString targetname,NString targettype,NNumber historyforndays,Ref<DataCursor> pMemberTargetsCursor,Ref<DataCursor> pChangeCountsCursor) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ECM_UTIL.GET_HIST_FOR_GROUP", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TARGETNAME", targetname);
			cmd.addParameter("@TARGETTYPE", targettype);
			cmd.addParameter("@HISTORYFORNDAYS", historyforndays);
			cmd.addParameter("@P_MEMBER_TARGETS_CURSOR", DataCursor.class);
			cmd.addParameter("@P_CHANGE_COUNTS_CURSOR", DataCursor.class);
				
			cmd.execute();
			pMemberTargetsCursor.val = cmd.getParameterValue("@P_MEMBER_TARGETS_CURSOR", DataCursor.class);
			pChangeCountsCursor.val = cmd.getParameterValue("@P_CHANGE_COUNTS_CURSOR", DataCursor.class);


		}
		
		public static NString FhostHomeList(NString pTargetName,NString pTargetType) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ECM_UTIL.HOST_HOME_LIST", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_TARGET_NAME", pTargetName);
			cmd.addParameter("@P_TARGET_TYPE", pTargetType);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FhostHomeLsnrList(NString vHostName,NString vOracleHome) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ECM_UTIL.HOST_HOME_LSNR_LIST", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@V_HOST_NAME", vHostName);
			cmd.addParameter("@V_ORACLE_HOME", vOracleHome);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FhostHomeSidList(NString vHostName,NString vOracleHome) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ECM_UTIL.HOST_HOME_SID_LIST", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@V_HOST_NAME", vHostName);
			cmd.addParameter("@V_ORACLE_HOME", vOracleHome);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FhostHomeTargetList(NString vHostName,NString vOracleHome,NString vTargetType) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ECM_UTIL.HOST_HOME_TARGET_LIST", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@V_HOST_NAME", vHostName);
			cmd.addParameter("@V_ORACLE_HOME", vOracleHome);
			cmd.addParameter("@V_TARGET_TYPE", vTargetType);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void insertAvailSearches(NString targettype,NString classname,NString searchtype) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ECM_UTIL.INSERT_AVAIL_SEARCHES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TARGETTYPE", targettype);
			cmd.addParameter("@CLASSNAME", classname);
			cmd.addParameter("@SEARCHTYPE", searchtype);
				
			cmd.execute();


		}
		
		public static NString FinterimPatchesInHome(byte[] pHomeId,NString pDelimiter) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ECM_UTIL.INTERIM_PATCHES_IN_HOME", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_HOME_ID", pHomeId);
			cmd.addParameter("@P_DELIMITER", pDelimiter);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FpatchAdvisoryList(byte[] pPatchGuid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ECM_UTIL.PATCH_ADVISORY_LIST", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PATCH_GUID", pPatchGuid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FpatchsetsInHome(byte[] pHomeId,NString pDelimiter) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ECM_UTIL.PATCHSETS_IN_HOME", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_HOME_ID", pHomeId);
			cmd.addParameter("@P_DELIMITER", pDelimiter);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FpolicyViolColumnVals(byte[] pViolationId,NString pColumnName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ECM_UTIL.POLICY_VIOL_COLUMN_VALS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_VIOLATION_ID", pViolationId);
			cmd.addParameter("@P_COLUMN_NAME", pColumnName);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void updateEcmMetadata() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ECM_UTIL.UPDATE_ECM_METADATA", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
	
	
	
}
