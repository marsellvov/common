package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Cwm2OlapMrSecurityInit {
		public static void initMrSessionObjectTable() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_MR_SECURITY_INIT.INIT_MR_SESSION_OBJECT_TABLE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
	
	
	
}
