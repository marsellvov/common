package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Utrunittest {
		public static void initiate(NNumber runIdIn,NNumber unittestIdIn,NDate startOnIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTRUNITTEST.INITIATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@RUN_ID_IN", runIdIn);
			cmd.addParameter("@UNITTEST_ID_IN", unittestIdIn);
			cmd.addParameter("@START_ON_IN", startOnIn);
				
			cmd.execute();


		}
		
		public static void terminate(NNumber runIdIn,NNumber unittestIdIn,NDate endOnIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTRUNITTEST.TERMINATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@RUN_ID_IN", runIdIn);
			cmd.addParameter("@UNITTEST_ID_IN", unittestIdIn);
			cmd.addParameter("@END_ON_IN", endOnIn);
				
			cmd.execute();


		}
		
	
	
	
}
