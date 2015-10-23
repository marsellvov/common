package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Secondary {
		public static void test() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SECONDARY.TEST", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
	
	
	
}
