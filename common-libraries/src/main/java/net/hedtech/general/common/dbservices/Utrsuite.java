package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Utrsuite {
		public static void initiate(NNumber runIdIn,NNumber suiteIdIn,NDate startOnIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTRSUITE.INITIATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@RUN_ID_IN", runIdIn);
			cmd.addParameter("@SUITE_ID_IN", suiteIdIn);
			cmd.addParameter("@START_ON_IN", startOnIn);
				
			cmd.execute();


		}
		
		public static void terminate(NNumber runIdIn,NNumber suiteIdIn,NDate endOnIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTRSUITE.TERMINATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@RUN_ID_IN", runIdIn);
			cmd.addParameter("@SUITE_ID_IN", suiteIdIn);
			cmd.addParameter("@END_ON_IN", endOnIn);
				
			cmd.execute();


		}
		
	
	
	
}
