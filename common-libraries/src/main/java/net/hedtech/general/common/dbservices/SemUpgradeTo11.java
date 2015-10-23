package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SemUpgradeTo11 {
		public static void createAllModelsIn11() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SEM_UPGRADE_TO_11.CREATE_ALL_MODELS_IN_11", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void emptyAppTabsDropRdfCols(NBool downgrade) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SEM_UPGRADE_TO_11.EMPTY_APP_TABS_DROP_RDF_COLS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@DOWNGRADE", downgrade);
				
			cmd.execute();


		}
		
		public static void loadFromAllStagingTables() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SEM_UPGRADE_TO_11.LOAD_FROM_ALL_STAGING_TABLES", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void restore102RdfNetworkIn11() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SEM_UPGRADE_TO_11.RESTORE_10_2_RDF_NETWORK_IN_11", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void save102RdfNetworkFor11() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SEM_UPGRADE_TO_11.SAVE_10_2_RDF_NETWORK_FOR_11", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void setupForLoadingIn11() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SEM_UPGRADE_TO_11.SETUP_FOR_LOADING_IN_11", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void unloadAllIntoStagingTables(NBool downgrade) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SEM_UPGRADE_TO_11.UNLOAD_ALL_INTO_STAGING_TABLES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@DOWNGRADE", downgrade);
				
			cmd.execute();


		}
		
	
	
	
}
