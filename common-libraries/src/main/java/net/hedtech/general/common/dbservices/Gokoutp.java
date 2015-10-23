package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Gokoutp {
		public static void csv(NString pipeName,NString sessId,NString userName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKOUTP.CSV", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIPE_NAME", pipeName);
			cmd.addParameter("@SESS_ID", sessId);
			cmd.addParameter("@USER_NAME", userName);
				
			cmd.execute();


		}
		
		public static void pReqblob(NNumber mediaId,Ref<NString> pipeName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKOUTP.P_REQBLOB", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@MEDIA_ID", mediaId);
			cmd.addParameter("@PIPE_NAME", NString.class);
				
			cmd.execute();
			pipeName.val = cmd.getParameterValue("@PIPE_NAME", NString.class);


		}
		
		public static void pSendreq(NNumber oneUpNo,NString fileName,NNumber fileNumber,Ref<NString> pipeName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKOUTP.P_SENDREQ", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@ONE_UP_NO", oneUpNo);
			cmd.addParameter("@FILE_NAME", fileName);
			cmd.addParameter("@FILE_NUMBER", fileNumber);
			cmd.addParameter("@PIPE_NAME", NString.class);
				
			cmd.execute();
			pipeName.val = cmd.getParameterValue("@PIPE_NAME", NString.class);


		}
		
		public static void pShowblob(NString pipeName,NString sessId,NString userName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKOUTP.P_SHOWBLOB", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIPE_NAME", pipeName);
			cmd.addParameter("@SESS_ID", sessId);
			cmd.addParameter("@USER_NAME", userName);
				
			cmd.execute();


		}
		
		public static void pShowreq(NString pipeName,NString sessId,NString userName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKOUTP.P_SHOWREQ", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIPE_NAME", pipeName);
			cmd.addParameter("@SESS_ID", sessId);
			cmd.addParameter("@USER_NAME", userName);
				
			cmd.execute();


		}
		
	
	
	
}
