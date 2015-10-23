package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Twbksels {
		public static NString fGenerateRandomId(NString valueIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKSELS.F_GENERATE_RANDOM_ID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@VALUE_IN", valueIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetParamValue(NString paramNameIn,NNumber pidmIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKSELS.F_GET_PARAM_VALUE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PARAM_NAME_IN", paramNameIn);
			cmd.addParameter("@PIDM_IN", pidmIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber fGetPidmFromTwgrwprm(NString paramNameIn,NString paramValueIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKSELS.F_GET_PIDM_FROM_TWGRWPRM", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@PARAM_NAME_IN", paramNameIn);
			cmd.addParameter("@PARAM_VALUE_IN", paramValueIn);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
	
	
	
}
