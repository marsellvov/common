package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwskwprv {
		public static void pInsertdataintotables() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKWPRV.P_INSERTDATAINTOTABLES", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pPrintvariables() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKWPRV.P_PRINTVARIABLES", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pValidatedata() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKWPRV.P_VALIDATEDATA", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
	
	
	
}
