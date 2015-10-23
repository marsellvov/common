package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwakpref {
		public static void pPrefAddress() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWAKPREF.P_PREF_ADDRESS", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pUpdPrefAddress(NString prefIndIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWAKPREF.P_UPD_PREF_ADDRESS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PREF_IND_IN", prefIndIn);
				
			cmd.execute();


		}
		
	
	
	
}
