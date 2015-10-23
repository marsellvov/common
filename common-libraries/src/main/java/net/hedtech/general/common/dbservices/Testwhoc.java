package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Testwhoc {
		public static void fWhocalledme() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TESTWHOC.F_WHOCALLEDME", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void fWhocalledme2(NString str1) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TESTWHOC.F_WHOCALLEDME2", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@STR1", str1);
				
			cmd.execute();


		}
		
	
	
	
}
