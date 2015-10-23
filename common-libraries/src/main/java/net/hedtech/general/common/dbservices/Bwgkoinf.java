package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwgkoinf {
		public static void pDispupdname() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWGKOINF.P_DISPUPDNAME", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pDispupdssn() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWGKOINF.P_DISPUPDSSN", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
	
	
	
}
