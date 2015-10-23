package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Dlindblo {
		public static void pDelLoad(NString pSbgi) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DLINDBLO.P_DEL_LOAD", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SBGI", pSbgi);
				
			cmd.execute();


		}
		
		public static void pDelLoad(NNumber pPidm,NString pSbgi) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DLINDBLO.P_DEL_LOAD", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SBGI", pSbgi);
				
			cmd.execute();


		}
		
	
	
	
}
