package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwtktxns {
		public static void pDispTaxNotification(NString taxYearIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWTKTXNS.P_DISP_TAX_NOTIFICATION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TAX_YEAR_IN", taxYearIn);
				
			cmd.execute();


		}
		
	
	
	
}
