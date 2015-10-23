package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Vrgkoint {
		public static void pBannervr(NString vrCommand,NString vrKeys) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("VRGKOINT.P_BANNERVR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@VR_COMMAND", vrCommand);
			cmd.addParameter("@VR_KEYS", vrKeys);
				
			cmd.execute();


		}
		
		public static void pBannervrBuildoutput(NString vrLine) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("VRGKOINT.P_BANNERVR_BUILDOUTPUT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@VR_LINE", vrLine);
				
			cmd.execute();


		}
		
		public static void pBannervrDatabaseerror(NString inRoutine) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("VRGKOINT.P_BANNERVR_DATABASEERROR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@IN_ROUTINE", inRoutine);
				
			cmd.execute();


		}
		
		public static void pBannervrPing() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("VRGKOINT.P_BANNERVR_PING", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
//		public static void pBannervrTabletoline(List<Goktabs.CharTabTypeRow> inTab,NString inName) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("VRGKOINT.P_BANNERVR_TABLETOLINE", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("IN_TAB", "", inTab, object.class));
//			cmd.addParameter("@IN_NAME", inName);
//				
//			cmd.execute();
//
//
//		}
		
	
	
	
}
