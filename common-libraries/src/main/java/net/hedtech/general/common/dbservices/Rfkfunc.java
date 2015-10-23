package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Rfkfunc {
		public static void pGetRfrbaseRow(NString fundCodeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RFKFUNC.P_GET_RFRBASE_ROW", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@FUND_CODE_IN", fundCodeIn);
				
			cmd.execute();


		}
		
	
	
	
}
