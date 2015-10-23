package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Twbkupld {
		public static void pUpload(NString filen,NString pipeName,NString sessId,NString userName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKUPLD.P_UPLOAD", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@FILEN", filen);
			cmd.addParameter("@PIPE_NAME", pipeName);
			cmd.addParameter("@SESS_ID", sessId);
			cmd.addParameter("@USER_NAME", userName);
				
			cmd.execute();


		}
		
		public static void pUploadStart(NString pipeName,NString sessId,NString userName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKUPLD.P_UPLOAD_START", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIPE_NAME", pipeName);
			cmd.addParameter("@SESS_ID", sessId);
			cmd.addParameter("@USER_NAME", userName);
				
			cmd.execute();


		}
		
		public static void pUploadcommit(NString file,NString filen,NString pipeName,NString sessId,NString userName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKUPLD.P_UPLOADCOMMIT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@FILE", file);
			cmd.addParameter("@FILEN", filen);
			cmd.addParameter("@PIPE_NAME", pipeName);
			cmd.addParameter("@SESS_ID", sessId);
			cmd.addParameter("@USER_NAME", userName);
				
			cmd.execute();


		}
		
	
	
	
}
