package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class DocumentApi {
		public static void download() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DOCUMENT_API.DOWNLOAD", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void download(NString file) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DOCUMENT_API.DOWNLOAD", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@FILE", file);
				
			cmd.execute();


		}
		
		public static void upload() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DOCUMENT_API.UPLOAD", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void upload(NString file) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DOCUMENT_API.UPLOAD", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@FILE", file);
				
			cmd.execute();


		}
		
	
	
	
}
