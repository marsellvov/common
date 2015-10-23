package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Rbkpbgp {
		public static void pInitializeSimulationRun(NString pAidyCode,NString pRunName,NString pProcessInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RBKPBGP.P_INITIALIZE_SIMULATION_RUN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_RUN_NAME", pRunName);
			cmd.addParameter("@P_PROCESS_IND", pProcessInd);
				
			cmd.execute();


		}
		
	
	
	
}
