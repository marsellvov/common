package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SdoNetMem {
		public static void setMaxMemorySize(NNumber bytes) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_NET_MEM.SET_MAX_MEMORY_SIZE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@BYTES", bytes);
				
			cmd.execute();


		}
		
	
	
	
}
