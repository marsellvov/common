package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Rckfunc {
		public static NNumber fGetApplCount(NNumber pidmIn,NString aidyIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RCKFUNC.F_GET_APPL_COUNT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@AIDY_IN", aidyIn);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
	
	
	
}
