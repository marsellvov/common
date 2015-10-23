package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class TsSbRepeatsHistory {
		public static void pTsRepeatsHistory(NNumber pPidm,NString pTerm,NString pLevl,NString pSubj,NString pCrse,NString pPrintDetail) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TS_SB_REPEATS_HISTORY.P_TS_REPEATS_HISTORY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM", pTerm);
			cmd.addParameter("@P_LEVL", pLevl);
			cmd.addParameter("@P_SUBJ", pSubj);
			cmd.addParameter("@P_CRSE", pCrse);
			cmd.addParameter("@P_PRINT_DETAIL", pPrintDetail);
				
			cmd.execute();


		}
		
	
	
	
}
