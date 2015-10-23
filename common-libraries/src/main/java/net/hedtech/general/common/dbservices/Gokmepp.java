package net.hedtech.general.common.dbservices;

import morphis.foundations.core.appdatalayer.data.DataCursor;
import morphis.foundations.core.appdatalayer.data.DbManager;
import morphis.foundations.core.appdatalayer.data.IDataCommand;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.NBool;
import morphis.foundations.core.types.NNumber;
import morphis.foundations.core.types.NString;
import morphis.foundations.core.util.Ref;


public class Gokmepp {

	@DbRecordType(id="DbaSourceTypeRow", dataSourceName="GOKMEPP.DBA_SOURCE_TYPE")
	public static class DbaSourceTypeRow
	{
		@DbRecordField(dataSourceName="OWNER")
		public NString Owner;
		@DbRecordField(dataSourceName="NAME")
		public NString _Name;
		@DbRecordField(dataSourceName="SOURCE_TYPE")
		public NString SourceType;
		@DbRecordField(dataSourceName="LINE")
		public NNumber Line;
		@DbRecordField(dataSourceName="TEXT")
		public NString Text;
	}
		
	
	
		public static NString fGetMepAudit() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKMEPP.F_GET_MEP_AUDIT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetPolicyScript(NString pSessionid,NString pOwner,NString pName,NString pCategory,NString pGenerateFor,NString pScriptName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKMEPP.F_GET_POLICY_SCRIPT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_SESSIONID", pSessionid);
			cmd.addParameter("@P_OWNER", pOwner);
			cmd.addParameter("@P_NAME", pName);
			cmd.addParameter("@P_CATEGORY", pCategory);
			cmd.addParameter("@P_GENERATE_FOR", pGenerateFor);
			cmd.addParameter("@P_SCRIPT_NAME", pScriptName);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetTriggerScript(NString pSessionid,NString pOwner,NString pName,NString pCategory,NString pGenerateFor,NString pScriptName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKMEPP.F_GET_TRIGGER_SCRIPT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_SESSIONID", pSessionid);
			cmd.addParameter("@P_OWNER", pOwner);
			cmd.addParameter("@P_NAME", pName);
			cmd.addParameter("@P_CATEGORY", pCategory);
			cmd.addParameter("@P_GENERATE_FOR", pGenerateFor);
			cmd.addParameter("@P_SCRIPT_NAME", pScriptName);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pAuditItem(NNumber pNum,NString pStr1,NString pStr2,NString pStr3,NString pStr4) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKMEPP.P_AUDIT_ITEM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_NUM", pNum);
			cmd.addParameter("@P_STR1", pStr1);
			cmd.addParameter("@P_STR2", pStr2);
			cmd.addParameter("@P_STR3", pStr3);
			cmd.addParameter("@P_STR4", pStr4);
				
			cmd.execute();


		}
		
		public static void pAuditTrail(NString pVersion,NString pInitials) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKMEPP.P_AUDIT_TRAIL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_VERSION", pVersion);
			cmd.addParameter("@P_INITIALS", pInitials);
				
			cmd.execute();


		}
		
		public static void pAuditTrailEnd() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKMEPP.P_AUDIT_TRAIL_END", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pClientProject(NString pClient,NString pProject) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKMEPP.P_CLIENT_PROJECT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CLIENT", pClient);
			cmd.addParameter("@P_PROJECT", pProject);
				
			cmd.execute();


		}
		
		public static void pConnect(NString pOwner,NString pServer) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKMEPP.P_CONNECT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OWNER", pOwner);
			cmd.addParameter("@P_SERVER", pServer);
				
			cmd.execute();


		}
		
		public static void pCopyright(NString pScriptName,NString pSessionId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKMEPP.P_COPYRIGHT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SCRIPT_NAME", pScriptName);
			cmd.addParameter("@P_SESSION_ID", pSessionId);
				
			cmd.execute();


		}
		
		public static void pCreatePolicy(NString pSessionid,NString pOwner,NString pName,NString pCategory,NString pGenerateFor) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKMEPP.P_CREATE_POLICY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SESSIONID", pSessionid);
			cmd.addParameter("@P_OWNER", pOwner);
			cmd.addParameter("@P_NAME", pName);
			cmd.addParameter("@P_CATEGORY", pCategory);
			cmd.addParameter("@P_GENERATE_FOR", pGenerateFor);
				
			cmd.execute();


		}
		
		public static void pCreatePolicyScript(NString pSessionid,NString pOwnerLike,NString pNameLike,NString pCategoryLike,NString pClient,NString pProject,NString pVersion,NString pOraVer,NString pScriptName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKMEPP.P_CREATE_POLICY_SCRIPT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SESSIONID", pSessionid);
			cmd.addParameter("@P_OWNER_LIKE", pOwnerLike);
			cmd.addParameter("@P_NAME_LIKE", pNameLike);
			cmd.addParameter("@P_CATEGORY_LIKE", pCategoryLike);
			cmd.addParameter("@P_CLIENT", pClient);
			cmd.addParameter("@P_PROJECT", pProject);
			cmd.addParameter("@P_VERSION", pVersion);
			cmd.addParameter("@P_ORA_VER", pOraVer);
			cmd.addParameter("@P_SCRIPT_NAME", pScriptName);
				
			cmd.execute();


		}
		
		public static void pCreateTrigger(NString pSessionid,NString pOwner,NString pName,NBool pSuidByOwner,NString pGenerateFor) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKMEPP.P_CREATE_TRIGGER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SESSIONID", pSessionid);
			cmd.addParameter("@P_OWNER", pOwner);
			cmd.addParameter("@P_NAME", pName);
			cmd.addParameter("@P_SUID_BY_OWNER", pSuidByOwner);
			cmd.addParameter("@P_GENERATE_FOR", pGenerateFor);
				
			cmd.execute();


		}
		
		public static void pCreateTriggerScript(NString pSessionid,NString pOwnerLike,NString pNameLike,NString pCategoryLike,NString pClient,NString pProject,NString pVersion,NString pOraVer,NString pScriptName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKMEPP.P_CREATE_TRIGGER_SCRIPT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SESSIONID", pSessionid);
			cmd.addParameter("@P_OWNER_LIKE", pOwnerLike);
			cmd.addParameter("@P_NAME_LIKE", pNameLike);
			cmd.addParameter("@P_CATEGORY_LIKE", pCategoryLike);
			cmd.addParameter("@P_CLIENT", pClient);
			cmd.addParameter("@P_PROJECT", pProject);
			cmd.addParameter("@P_VERSION", pVersion);
			cmd.addParameter("@P_ORA_VER", pOraVer);
			cmd.addParameter("@P_SCRIPT_NAME", pScriptName);
				
			cmd.execute();


		}
		
		public static void pDbaSourceQuery(Ref<DataCursor> dbaSourceResult,NString pOwner,NString pName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKMEPP.P_DBA_SOURCE_QUERY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@DBA_SOURCE_RESULT", DataCursor.class);
			cmd.addParameter("@P_OWNER", pOwner);
			cmd.addParameter("@P_NAME", pName);
				
			cmd.execute();
			dbaSourceResult.val = cmd.getParameterValue("@DBA_SOURCE_RESULT", DataCursor.class);


		}
		
		public static void pEndFile() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKMEPP.P_END_FILE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pRemovePolicy(NString pSessionid,NString pOwner,NString pName,NString pCategory,NString pGenerateFor) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKMEPP.P_REMOVE_POLICY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SESSIONID", pSessionid);
			cmd.addParameter("@P_OWNER", pOwner);
			cmd.addParameter("@P_NAME", pName);
			cmd.addParameter("@P_CATEGORY", pCategory);
			cmd.addParameter("@P_GENERATE_FOR", pGenerateFor);
				
			cmd.execute();


		}
		
		public static void pRemoveTrigger(NString pSessionid,NString pOwner,NString pName,NString pGenerateFor) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKMEPP.P_REMOVE_TRIGGER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SESSIONID", pSessionid);
			cmd.addParameter("@P_OWNER", pOwner);
			cmd.addParameter("@P_NAME", pName);
			cmd.addParameter("@P_GENERATE_FOR", pGenerateFor);
				
			cmd.execute();


		}
		
		public static void pRunScript(NString pScriptDesc,NString pSql,Ref<NString> pErrMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKMEPP.P_RUN_SCRIPT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SCRIPT_DESC", pScriptDesc);
			cmd.addParameter("@P_SQL", pSql);
			cmd.addParameter("@P_ERR_MSG_OUT", NString.class);
				
			cmd.execute();
			pErrMsgOut.val = cmd.getParameterValue("@P_ERR_MSG_OUT", NString.class);


		}
		
	
	
//	@DbRecordType(id="DbaSourceTypeRow", dataSourceName="DBA_SOURCE_TYPE")
//	public static class DbaSourceTypeRow
//	{
//		@DbRecordField(dataSourceName="OWNER")
//		public NString Owner;
//		@DbRecordField(dataSourceName="NAME")
//		public NString _Name;
//		@DbRecordField(dataSourceName="SOURCE_TYPE")
//		public NString SourceType;
//		@DbRecordField(dataSourceName="LINE")
//		public NNumber Line;
//		@DbRecordField(dataSourceName="TEXT")
//		public NString Text;
//	}

	
 
//	@DbTableType(id = "dbaSourceRef", dataSourceName = "gokmepp.dba_source_ref", indexed = true)
//	public class dbaSourceRef extends Table<DbaSourceTypeRow> {
//		
//		// test
//		public dbaSourceRef() {
//			super();
//		}
//
//		@Override
//		protected DbaSourceTypeRow newValue() {
//			return new DbaSourceTypeRow();
//		}
//	}	
	
}
