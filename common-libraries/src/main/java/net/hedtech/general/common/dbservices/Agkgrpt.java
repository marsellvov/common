package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Agkgrpt {
		public static void pGiftByFiscalYr(NNumber pPidmIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AGKGRPT.P_GIFT_BY_FISCAL_YR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM_IN", pPidmIn);
				
			cmd.execute();


		}
		
		public static void pProcessGiftData() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AGKGRPT.P_PROCESS_GIFT_DATA", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
	
	
	
}
