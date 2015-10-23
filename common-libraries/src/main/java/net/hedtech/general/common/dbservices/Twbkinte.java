package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Twbkinte {
		public static void pForwardfrombanner() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKINTE.P_FORWARDFROMBANNER", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pForwardtoother(NString systemname) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKINTE.P_FORWARDTOOTHER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SYSTEMNAME", systemname);
				
			cmd.execute();


		}
		
		public static void pReturnfromother() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKINTE.P_RETURNFROMOTHER", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pReturntobanner() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKINTE.P_RETURNTOBANNER", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
	
	
	
}
