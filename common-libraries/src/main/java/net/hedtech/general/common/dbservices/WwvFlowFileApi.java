package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class WwvFlowFileApi {
//		public static List<Varchar2TableRow> FblobToVarchar2(BLOB pBlob) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_FILE_API.BLOB_TO_VARCHAR2", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<Varchar2TableRow>.class);
//			cmd.addParameter("@P_BLOB", pBlob);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<Varchar2TableRow>.class);
//
//		}
		
		public static NString FcleanDirname(NString pDir) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_FILE_API.CLEAN_DIRNAME", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_DIR", pDir);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FcleanFilename(NString pFile) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_FILE_API.CLEAN_FILENAME", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_FILE", pFile);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
//		public static void createFile(NNumber pId,NNumber pFlowId,NString pName,NNumber pPathid,NString pFilename,NString pTitle,NString pMimeType,NNumber pDocSize,NString pDadCharset,NString pCreatedBy,NDate pCreatedOn,NString pUpdatedBy,NDate pUpdatedOn,NDate pDeletedAsOf,NDate pLastUpdated,NString pContentType,BLOB pBlobContent,NString pLanguage,NString pDescription,NString pFileType) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_FILE_API.CREATE_FILE", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_ID", pId);
//			cmd.addParameter("@P_FLOW_ID", pFlowId);
//			cmd.addParameter("@P_NAME", pName);
//			cmd.addParameter("@P_PATHID", pPathid);
//			cmd.addParameter("@P_FILENAME", pFilename);
//			cmd.addParameter("@P_TITLE", pTitle);
//			cmd.addParameter("@P_MIME_TYPE", pMimeType);
//			cmd.addParameter("@P_DOC_SIZE", pDocSize);
//			cmd.addParameter("@P_DAD_CHARSET", pDadCharset);
//			cmd.addParameter("@P_CREATED_BY", pCreatedBy);
//			cmd.addParameter("@P_CREATED_ON", pCreatedOn);
//			cmd.addParameter("@P_UPDATED_BY", pUpdatedBy);
//			cmd.addParameter("@P_UPDATED_ON", pUpdatedOn);
//			cmd.addParameter("@P_DELETED_AS_OF", pDeletedAsOf);
//			cmd.addParameter("@P_LAST_UPDATED", pLastUpdated);
//			cmd.addParameter("@P_CONTENT_TYPE", pContentType);
//			cmd.addParameter("@P_BLOB_CONTENT", pBlobContent);
//			cmd.addParameter("@P_LANGUAGE", pLanguage);
//			cmd.addParameter("@P_DESCRIPTION", pDescription);
//			cmd.addParameter("@P_FILE_TYPE", pFileType);
//				
//			cmd.execute();
//
//
//		}
		
		public static NNumber FgetFileId(NString pFileName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_FILE_API.GET_FILE_ID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_FILE_NAME", pFileName);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
//		public static NNumber FnewFileObject(Ref<NString> pName,BLOB pBlob,NString pMimetype) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_FILE_API.NEW_FILE_OBJECT$", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NNumber.class);
//			cmd.addParameter("@P_NAME", pName, true);
//			cmd.addParameter("@P_BLOB", pBlob);
//			cmd.addParameter("@P_MIMETYPE", pMimetype);
//				
//			cmd.execute();
//			pName.val = cmd.getParameterValue("@P_NAME", NString.class);
//
//			return cmd.getReturnValue(NNumber.class);
//
//		}
		
		public static void removeFile(NNumber pId,NString pFilePath,NString pFileName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_FILE_API.REMOVE_FILE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_FILE_PATH", pFilePath);
			cmd.addParameter("@P_FILE_NAME", pFileName);
				
			cmd.execute();


		}
		
		public static void setFileSecurityGroupId(NString pFileName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_FILE_API.SET_FILE_SECURITY_GROUP_ID", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_FILE_NAME", pFileName);
				
			cmd.execute();


		}
		
		public static void setFileSecurityGroupId(NNumber pFileId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_FILE_API.SET_FILE_SECURITY_GROUP_ID", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_FILE_ID", pFileId);
				
			cmd.execute();


		}
		
//		public static BLOB Fvarchar2ToBlob(List<DbmsSql.Varchar2TableRow> pVarchar2Tab) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_FILE_API.VARCHAR2_TO_BLOB", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(BLOB.class);
//			// cmd.addParameter(DbTypes.getTableType("P_VARCHAR2_TAB", "", pVarchar2Tab, object.class));
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(BLOB.class);
//
//		}
		
	
	
	
}
