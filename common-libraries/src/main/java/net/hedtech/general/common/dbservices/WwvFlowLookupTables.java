package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class WwvFlowLookupTables {
		public static void createCountriesTable(NString pSchema,NString pTableName,NString pColumnName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_LOOKUP_TABLES.CREATE_COUNTRIES_TABLE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SCHEMA", pSchema);
			cmd.addParameter("@P_TABLE_NAME", pTableName);
			cmd.addParameter("@P_COLUMN_NAME", pColumnName);
				
			cmd.execute();


		}
		
		public static void removeCountriesTable(NString pSchema,NString pTableName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_LOOKUP_TABLES.REMOVE_COUNTRIES_TABLE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SCHEMA", pSchema);
			cmd.addParameter("@P_TABLE_NAME", pTableName);
				
			cmd.execute();


		}
		
	
	
	
}
