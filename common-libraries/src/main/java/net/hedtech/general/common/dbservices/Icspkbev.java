package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Icspkbev {
		public static void pSendAddHold(NNumber pidmIn,NString hlddCodeIn,NDate activityDateIn,NDate fromDateIn,NDate toDateIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ICSPKBEV.P_SEND_ADD_HOLD", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@HLDD_CODE_IN", hlddCodeIn);
			cmd.addParameter("@ACTIVITY_DATE_IN", activityDateIn);
			cmd.addParameter("@FROM_DATE_IN", fromDateIn);
			cmd.addParameter("@TO_DATE_IN", toDateIn);
				
			cmd.execute();


		}
		
	
	
	
}
