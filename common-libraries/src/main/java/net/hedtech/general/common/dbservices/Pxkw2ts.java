package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Pxkw2ts {
		public static void pSendreq(NNumber pPidm,NNumber pYear,NString pEmprCode,NNumber pSeqNo,Ref<NString> pPipeName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PXKW2TS.P_SENDREQ", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_YEAR", pYear);
			cmd.addParameter("@P_EMPR_CODE", pEmprCode);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_PIPE_NAME", NString.class);
				
			cmd.execute();
			pPipeName.val = cmd.getParameterValue("@P_PIPE_NAME", NString.class);


		}
		
		public static void pShowreq(NString pipeName,NString sessId,NString userName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PXKW2TS.P_SHOWREQ", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIPE_NAME", pipeName);
			cmd.addParameter("@SESS_ID", sessId);
			cmd.addParameter("@USER_NAME", userName);
				
			cmd.execute();


		}
		
	
	
	
}
