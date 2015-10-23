package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwgkomar {
		public static void pDispmrtlupdate(NString dispMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWGKOMAR.P_DISPMRTLUPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@DISP_MSG", dispMsg);
				
			cmd.execute();


		}
		
		public static void pProcmrtlupdate(NString mtyp) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWGKOMAR.P_PROCMRTLUPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@MTYP", mtyp);
				
			cmd.execute();


		}
		
		public static void pSelectmtypupdate(NString mtyp) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWGKOMAR.P_SELECTMTYPUPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@MTYP", mtyp);
				
			cmd.execute();


		}
		
	
	
	
}
