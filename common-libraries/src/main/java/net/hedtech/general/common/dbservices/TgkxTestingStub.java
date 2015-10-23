package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class TgkxTestingStub {
		public static NString fDateRange(NDate dateVarIn,NDate startDateIn,NDate endDateIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TGKX_TESTING_STUB.F_DATE_RANGE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@DATE_VAR_IN", dateVarIn);
			cmd.addParameter("@START_DATE_IN", startDateIn);
			cmd.addParameter("@END_DATE_IN", endDateIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsValidLaunchDate(NDate launchDateIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TGKX_TESTING_STUB.F_IS_VALID_LAUNCH_DATE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@LAUNCH_DATE_IN", launchDateIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
	
	
	
}
