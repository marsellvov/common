package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Cwm2Security {
		public static void dimensionTablesVisible() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_SECURITY.DIMENSION_TABLES_VISIBLE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void factTableVisible() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_SECURITY.FACT_TABLE_VISIBLE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
	
	
	
}
