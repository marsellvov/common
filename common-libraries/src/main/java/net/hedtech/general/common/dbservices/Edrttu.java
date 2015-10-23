package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Edrttu {
		public static NNumber fCalcDispositionDate(NString pActivityDate,NNumber pYears,Ref<NDate> pDispDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EDRTTU.F_CALC_DISPOSITION_DATE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_ACTIVITY_DATE", pActivityDate);
			cmd.addParameter("@P_YEARS", pYears);
			cmd.addParameter("@P_DISP_DATE", NDate.class);
				
			cmd.execute();
			pDispDate.val = cmd.getParameterValue("@P_DISP_DATE", NDate.class);

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fGreaterThan(NString pActivityDate,NNumber pYears) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EDRTTU.F_GREATER_THAN", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_ACTIVITY_DATE", pActivityDate);
			cmd.addParameter("@P_YEARS", pYears);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NDate fMyToDate(NString pDateStr) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EDRTTU.F_MY_TO_DATE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NDate.class);
			cmd.addParameter("@P_DATE_STR", pDateStr);
				
			cmd.execute();

			return cmd.getReturnValue(NDate.class);

		}
		
	
	
	
}
