package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Gkkoutp {
		public static void csv(NString pipeName,NString sessId,NString userName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKOUTP.CSV", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIPE_NAME", pipeName);
			cmd.addParameter("@SESS_ID", sessId);
			cmd.addParameter("@USER_NAME", userName);
				
			cmd.execute();


		}
		
		public static void pSendreq(NNumber oneUpNo,NString fileName,NNumber fileNumber,Ref<NString> pipeName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKOUTP.P_SENDREQ", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@ONE_UP_NO", oneUpNo);
			cmd.addParameter("@FILE_NAME", fileName);
			cmd.addParameter("@FILE_NUMBER", fileNumber);
			cmd.addParameter("@PIPE_NAME", NString.class);
				
			cmd.execute();
			pipeName.val = cmd.getParameterValue("@PIPE_NAME", NString.class);


		}
		
		public static void pShowreq(NString pipeName,NString sessId,NString userName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKOUTP.P_SHOWREQ", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIPE_NAME", pipeName);
			cmd.addParameter("@SESS_ID", sessId);
			cmd.addParameter("@USER_NAME", userName);
				
			cmd.execute();


		}
		
	
	
	
}
