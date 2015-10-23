package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Phklibs {
		public static void pCalcdirectdeposit() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PHKLIBS.P_CALCDIRECTDEPOSIT", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pFormatdirectdeposit() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PHKLIBS.P_FORMATDIRECTDEPOSIT", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
	
	
	
}
