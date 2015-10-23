package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Sakl140 {
		public static void pLoadSortest(NNumber aidm,NNumber applSeqno,NNumber seqno,NString wappCode,NNumber pidm,NString applTerm,Ref<NString> errorInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SAKL140.P_LOAD_SORTEST", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@AIDM", aidm);
			cmd.addParameter("@APPL_SEQNO", applSeqno);
			cmd.addParameter("@SEQNO", seqno);
			cmd.addParameter("@WAPP_CODE", wappCode);
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@APPL_TERM", applTerm);
			cmd.addParameter("@ERROR_IND", errorInd, true);
				
			cmd.execute();
			errorInd.val = cmd.getParameterValue("@ERROR_IND", NString.class);


		}
		
	
	
	
}
