package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwpkfsor {
		public static void pPrintOrganizations(NNumber globalPidm,NString selTermCode,NNumber pRecordNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKFSOR.P_PRINT_ORGANIZATIONS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@GLOBAL_PIDM", globalPidm);
			cmd.addParameter("@SEL_TERM_CODE", selTermCode);
			cmd.addParameter("@P_RECORD_NO", pRecordNo);
				
			cmd.execute();


		}
		
	
	
	
}
