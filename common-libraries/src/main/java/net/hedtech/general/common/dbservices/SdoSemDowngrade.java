package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SdoSemDowngrade {
		public static void prepareDowngradeFrom11() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_SEM_DOWNGRADE.PREPARE_DOWNGRADE_FROM_11", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
	
	
	
}
