package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwrksaph {
		public static void pDispsap() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWRKSAPH.P_DISPSAP", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
	
	
	
}
