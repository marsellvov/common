package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class GbGtvcurr {
		public static NString fCodeExists(NString pCurrCode,NDate pRateEffDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_GTVCURR.F_CODE_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_CURR_CODE", pCurrCode);
			cmd.addParameter("@P_RATE_EFF_DATE", pRateEffDate);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetDescription(NString pCurrCode,NDate pRateEffDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_GTVCURR.F_GET_DESCRIPTION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_CURR_CODE", pCurrCode);
			cmd.addParameter("@P_RATE_EFF_DATE", pRateEffDate);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
	
	
	
}
