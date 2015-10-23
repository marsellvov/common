package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Gzkxwlk {
		public static NString fGetXwlkInfo(NString sourceTable,NString sourceColumn,NString bannerValue,NString processId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GZKXWLK.F_GET_XWLK_INFO", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@SOURCE_TABLE", sourceTable);
			cmd.addParameter("@SOURCE_COLUMN", sourceColumn);
			cmd.addParameter("@BANNER_VALUE", bannerValue);
			cmd.addParameter("@PROCESS_ID", processId);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void populateColumns(NString pSourceTable,NString pSourceColumn,NString pProcessId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GZKXWLK.POPULATE_COLUMNS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SOURCE_TABLE", pSourceTable);
			cmd.addParameter("@P_SOURCE_COLUMN", pSourceColumn);
			cmd.addParameter("@P_PROCESS_ID", pProcessId);
				
			cmd.execute();


		}
		
	
	
	
}
