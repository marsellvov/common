package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwskeacc {
		public static void pAcctsummary() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKEACC.P_ACCTSUMMARY", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pPeriodacctsummary(NString pPeriod) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKEACC.P_PERIODACCTSUMMARY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PERIOD", pPeriod);
				
			cmd.execute();


		}
		
	
	
	
}
