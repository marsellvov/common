package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwakigrp {
		public static void pAddToProfile(NString igrp) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWAKIGRP.P_ADD_TO_PROFILE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@IGRP", igrp);
				
			cmd.execute();


		}
		
		public static void pDispnotify(NNumber pidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWAKIGRP.P_DISPNOTIFY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
				
			cmd.execute();


		}
		
		public static void pDispupdProfile(NString dispMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWAKIGRP.P_DISPUPD_PROFILE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@DISP_MSG", dispMsg);
				
			cmd.execute();


		}
		
		public static void pProcaddToProfile(NString igrp) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWAKIGRP.P_PROCADD_TO_PROFILE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@IGRP", igrp);
				
			cmd.execute();


		}
		
		public static void pProcremoveFromProfile(NString igrp) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWAKIGRP.P_PROCREMOVE_FROM_PROFILE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@IGRP", igrp);
				
			cmd.execute();


		}
		
		public static void pRemoveFromProfile(NString igrp) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWAKIGRP.P_REMOVE_FROM_PROFILE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@IGRP", igrp);
				
			cmd.execute();


		}
		
		public static void pUpdateApbwses() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWAKIGRP.P_UPDATE_APBWSES", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pViewInterests() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWAKIGRP.P_VIEW_INTERESTS", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pViewProfile() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWAKIGRP.P_VIEW_PROFILE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pViewUpdinterests() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWAKIGRP.P_VIEW_UPDINTERESTS", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
	
	
	
}
