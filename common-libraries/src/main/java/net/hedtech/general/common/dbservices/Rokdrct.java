package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Rokdrct {
		public static NString fGetDlSchoolCode(NNumber pPidmIn,NString pPeriodIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKDRCT.F_GET_DL_SCHOOL_CODE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM_IN", pPidmIn);
			cmd.addParameter("@P_PERIOD_IN", pPeriodIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
	
	
	
}
