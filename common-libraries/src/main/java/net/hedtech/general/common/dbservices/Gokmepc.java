package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Gokmepc {
		public static NString fGetAlterTableScript(NString pSessionid,NString pOwner,NString pName,NString pCategory,NString pGenerateFor) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKMEPC.F_GET_ALTER_TABLE_SCRIPT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_SESSIONID", pSessionid);
			cmd.addParameter("@P_OWNER", pOwner);
			cmd.addParameter("@P_NAME", pName);
			cmd.addParameter("@P_CATEGORY", pCategory);
			cmd.addParameter("@P_GENERATE_FOR", pGenerateFor);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetKeyParent(NString pTableName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKMEPC.F_GET_KEY_PARENT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_TABLE_NAME", pTableName);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fHasChildren(NString pOwner,NString pTableName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKMEPC.F_HAS_CHILDREN", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_OWNER", pOwner);
			cmd.addParameter("@P_TABLE_NAME", pTableName);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fHasParent(NString pOwner,NString pTableName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKMEPC.F_HAS_PARENT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_OWNER", pOwner);
			cmd.addParameter("@P_TABLE_NAME", pTableName);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber fParent(NString pOwner,NString pTable) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKMEPC.F_PARENT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_OWNER", pOwner);
			cmd.addParameter("@P_TABLE", pTable);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fTableLevel(NString pOwner,NString pTableName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKMEPC.F_TABLE_LEVEL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_OWNER", pOwner);
			cmd.addParameter("@P_TABLE_NAME", pTableName);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static void pAuditVpdiCodeScript(NString pOwner,NString pName,NString pCategory) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKMEPC.P_AUDIT_VPDI_CODE_SCRIPT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OWNER", pOwner);
			cmd.addParameter("@P_NAME", pName);
			cmd.addParameter("@P_CATEGORY", pCategory);
				
			cmd.execute();


		}
		
		public static void pAuditVpdiCodeScriptNew(NString pOwner,NString pName,NString pCategory) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKMEPC.P_AUDIT_VPDI_CODE_SCRIPT_NEW", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OWNER", pOwner);
			cmd.addParameter("@P_NAME", pName);
			cmd.addParameter("@P_CATEGORY", pCategory);
				
			cmd.execute();


		}
		
		public static void pCreateDisableScript(NString pSessionid,NString pBaseOwner,NString pExtraOwner,NString pClient,NString pProject,NString pVersion,NString pDisableScriptName,NString pEnableScriptName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKMEPC.P_CREATE_DISABLE_SCRIPT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SESSIONID", pSessionid);
			cmd.addParameter("@P_BASE_OWNER", pBaseOwner);
			cmd.addParameter("@P_EXTRA_OWNER", pExtraOwner);
			cmd.addParameter("@P_CLIENT", pClient);
			cmd.addParameter("@P_PROJECT", pProject);
			cmd.addParameter("@P_VERSION", pVersion);
			cmd.addParameter("@P_DISABLE_SCRIPT_NAME", pDisableScriptName);
			cmd.addParameter("@P_ENABLE_SCRIPT_NAME", pEnableScriptName);
				
			cmd.execute();


		}
		
		public static void pCreateSeedDataScript(NString pSessionid,NString pScriptIn,NString pOwnerTable,NString pVersion,NString pClient,NString pProject) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKMEPC.P_CREATE_SEED_DATA_SCRIPT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SESSIONID", pSessionid);
			cmd.addParameter("@P_SCRIPT_IN", pScriptIn);
			cmd.addParameter("@P_OWNER_TABLE", pOwnerTable);
			cmd.addParameter("@P_VERSION", pVersion);
			cmd.addParameter("@P_CLIENT", pClient);
			cmd.addParameter("@P_PROJECT", pProject);
				
			cmd.execute();


		}
		
		public static void pCreateVpdiCode(NString pSessionid,NString pOwner,NString pName,Ref<NNumber> pVpdrSeq,NString pVersion,NString pGenerateFor,NString pCategory) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKMEPC.P_CREATE_VPDI_CODE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SESSIONID", pSessionid);
			cmd.addParameter("@P_OWNER", pOwner);
			cmd.addParameter("@P_NAME", pName);
			cmd.addParameter("@P_VPDR_SEQ", pVpdrSeq, true);
			cmd.addParameter("@P_VERSION", pVersion);
			cmd.addParameter("@P_GENERATE_FOR", pGenerateFor);
			cmd.addParameter("@P_CATEGORY", pCategory);
				
			cmd.execute();
			pVpdrSeq.val = cmd.getParameterValue("@P_VPDR_SEQ", NNumber.class);


		}
		
		public static void pCreateVpdiCodeScript(NString pSessionid,NString pOwner,NString pName,NString pCategory,NString pClient,NString pProject,NString pVersion,NString pGenerateFor,NString pScriptName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKMEPC.P_CREATE_VPDI_CODE_SCRIPT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SESSIONID", pSessionid);
			cmd.addParameter("@P_OWNER", pOwner);
			cmd.addParameter("@P_NAME", pName);
			cmd.addParameter("@P_CATEGORY", pCategory);
			cmd.addParameter("@P_CLIENT", pClient);
			cmd.addParameter("@P_PROJECT", pProject);
			cmd.addParameter("@P_VERSION", pVersion);
			cmd.addParameter("@P_GENERATE_FOR", pGenerateFor);
			cmd.addParameter("@P_SCRIPT_NAME", pScriptName);
				
			cmd.execute();


		}
		
		public static void pCreateVpdiIndxScript(NString pSessionid,NString pOwner,NString pName,NString pCategory,NString pClient,NString pProject,NString pVersion,NString pGenerateFor,NString pScriptName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKMEPC.P_CREATE_VPDI_INDX_SCRIPT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SESSIONID", pSessionid);
			cmd.addParameter("@P_OWNER", pOwner);
			cmd.addParameter("@P_NAME", pName);
			cmd.addParameter("@P_CATEGORY", pCategory);
			cmd.addParameter("@P_CLIENT", pClient);
			cmd.addParameter("@P_PROJECT", pProject);
			cmd.addParameter("@P_VERSION", pVersion);
			cmd.addParameter("@P_GENERATE_FOR", pGenerateFor);
			cmd.addParameter("@P_SCRIPT_NAME", pScriptName);
				
			cmd.execute();


		}
		
		public static void pGetKeyParent(NString pOwner,NString pTable) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKMEPC.P_GET_KEY_PARENT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OWNER", pOwner);
			cmd.addParameter("@P_TABLE", pTable);
				
			cmd.execute();


		}
		
		public static void pInsertModScript(NString pSessionid,NString pOwner,NString pName,NString pCategory,NString pClient,NString pProject,NString pVersion) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKMEPC.P_INSERT_MOD_SCRIPT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SESSIONID", pSessionid);
			cmd.addParameter("@P_OWNER", pOwner);
			cmd.addParameter("@P_NAME", pName);
			cmd.addParameter("@P_CATEGORY", pCategory);
			cmd.addParameter("@P_CLIENT", pClient);
			cmd.addParameter("@P_PROJECT", pProject);
			cmd.addParameter("@P_VERSION", pVersion);
				
			cmd.execute();


		}
		
		public static void pInsertTableScript(NString pSessionid,NString pOwner,NString pName,NString pClient,NString pProject,NString pVersion,NString pScriptName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKMEPC.P_INSERT_TABLE_SCRIPT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SESSIONID", pSessionid);
			cmd.addParameter("@P_OWNER", pOwner);
			cmd.addParameter("@P_NAME", pName);
			cmd.addParameter("@P_CLIENT", pClient);
			cmd.addParameter("@P_PROJECT", pProject);
			cmd.addParameter("@P_VERSION", pVersion);
			cmd.addParameter("@P_SCRIPT_NAME", pScriptName);
				
			cmd.execute();


		}
		
		public static void pNewFile(NString pSessionid,NString pVersion,NString pCategory,NString pTableOwner,NString pTableName,NNumber pFileCount,NNumber pVpdrSeq,NString pComment,NString pGenerateFor) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKMEPC.P_NEW_FILE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SESSIONID", pSessionid);
			cmd.addParameter("@P_VERSION", pVersion);
			cmd.addParameter("@P_CATEGORY", pCategory);
			cmd.addParameter("@P_TABLE_OWNER", pTableOwner);
			cmd.addParameter("@P_TABLE_NAME", pTableName);
			cmd.addParameter("@P_FILE_COUNT", pFileCount);
			cmd.addParameter("@P_VPDR_SEQ", pVpdrSeq);
			cmd.addParameter("@P_COMMENT", pComment);
			cmd.addParameter("@P_GENERATE_FOR", pGenerateFor);
				
			cmd.execute();


		}
		
		public static void pRemoveVpdiCode(NString pSessionid,NString pOwner,NString pName,Ref<NNumber> pVpdrSeq,NString pVersion,NString pGenerateFor,NString pCategory) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKMEPC.P_REMOVE_VPDI_CODE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SESSIONID", pSessionid);
			cmd.addParameter("@P_OWNER", pOwner);
			cmd.addParameter("@P_NAME", pName);
			cmd.addParameter("@P_VPDR_SEQ", pVpdrSeq, true);
			cmd.addParameter("@P_VERSION", pVersion);
			cmd.addParameter("@P_GENERATE_FOR", pGenerateFor);
			cmd.addParameter("@P_CATEGORY", pCategory);
				
			cmd.execute();
			pVpdrSeq.val = cmd.getParameterValue("@P_VPDR_SEQ", NNumber.class);


		}
		
	
	
	
}
