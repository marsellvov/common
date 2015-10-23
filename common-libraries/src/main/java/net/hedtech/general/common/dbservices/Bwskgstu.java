package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwskgstu {
		public static void pStuinfo(NString termIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKGSTU.P_STUINFO", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM_IN", termIn);
				
			cmd.execute();


		}
		
	
	
	
}
