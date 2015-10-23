package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Baninst1SqlPkg {
		public static void gForeignSqlFnc() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BANINST1_SQL_PKG.G$_FOREIGN_SQL_FNC", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
	
	
	
}
