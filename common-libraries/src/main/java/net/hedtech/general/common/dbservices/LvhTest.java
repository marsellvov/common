package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class LvhTest {
		public static NString fTest(NString pIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("LVH_TEST.F_TEST", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_IN", pIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pTest(NString pIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("LVH_TEST.P_TEST", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_IN", pIn);
				
			cmd.execute();


		}
		
	
	
	
}
