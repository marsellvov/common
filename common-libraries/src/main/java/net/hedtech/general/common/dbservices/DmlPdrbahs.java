package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class DmlPdrbahs {
		public static void pInsert() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DML_PDRBAHS.P_INSERT", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
	
	
	
}
