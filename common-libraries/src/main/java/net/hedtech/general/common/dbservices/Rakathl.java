package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Rakathl {
		public static void pAddTermAthleticAid(NNumber pPidm,NString pPeriod,NString pFaspCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RAKATHL.P_ADD_TERM_ATHLETIC_AID", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_PERIOD", pPeriod);
			cmd.addParameter("@P_FASP_CODE", pFaspCode);
				
			cmd.execute();


		}
		
	
	
	
}
