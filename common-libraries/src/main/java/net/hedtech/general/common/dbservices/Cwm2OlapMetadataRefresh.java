package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Cwm2OlapMetadataRefresh {
		public static void mrAcRefresh() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_METADATA_REFRESH.MR_AC_REFRESH", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void mrRefresh() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_METADATA_REFRESH.MR_REFRESH", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
	
	
	
}
