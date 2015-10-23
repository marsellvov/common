package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Jwf {
		public static NString fGetImageTag(NString pImageName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("JWF.F_GET_IMAGE_TAG", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_IMAGE_NAME", pImageName);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pDownloadImage(NString pImageName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("JWF.P_DOWNLOAD_IMAGE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_IMAGE_NAME", pImageName);
				
			cmd.execute();


		}
		
		public static void pDownloadLob(NBlob pLob,NString pMimeType) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("JWF.P_DOWNLOAD_LOB", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_LOB", pLob);
			cmd.addParameter("@P_MIME_TYPE", pMimeType);
				
			cmd.execute();


		}
		
		public static void pDownloadPoit(NString pId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("JWF.P_DOWNLOAD_POIT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ID", pId);
				
			cmd.execute();


		}
		
		public static void pPrepopulatePoit(NString pId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("JWF.P_PREPOPULATE_POIT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ID", pId);
				
			cmd.execute();


		}
		
		public static void pShowMyPoits() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("JWF.P_SHOW_MY_POITS", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pUpload(NString file) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("JWF.P_UPLOAD", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@FILE", file);
				
			cmd.execute();


		}
		
		public static void pUploadPoit(NString pId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("JWF.P_UPLOAD_POIT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ID", pId);
				
			cmd.execute();


		}
		
	
	
	
}
