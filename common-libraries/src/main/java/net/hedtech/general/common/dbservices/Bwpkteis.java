package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwpkteis {
		public static void pSelectleavereport() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKTEIS.P_SELECTLEAVEREPORT", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pSelectleaverequest() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKTEIS.P_SELECTLEAVEREQUEST", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pSelecttimesheet() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKTEIS.P_SELECTTIMESHEET", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
//		public static void pSelecttimesheetdriver(List<Twbklibs.Varchar2TabtypeRow> payperiod,NString jobs) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKTEIS.P_SELECTTIMESHEETDRIVER", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("PAYPERIOD", "", payperiod, object.class));
//			cmd.addParameter("@JOBS", jobs);
//				
//			cmd.execute();
//
//
//		}
		
	
	
	
}
