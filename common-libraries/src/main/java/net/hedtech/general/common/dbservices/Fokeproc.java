package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Fokeproc {
		public static void pSyncAccountingElement(NNumber entitiesPerPublish) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FOKEPROC.P_SYNC_ACCOUNTING_ELEMENT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@ENTITIES_PER_PUBLISH", entitiesPerPublish);
				
			cmd.execute();


		}
		
		public static void pSyncChart(NDate effectiveDateIn,NNumber entitiesPerPublish) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FOKEPROC.P_SYNC_CHART", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@EFFECTIVE_DATE_IN", effectiveDateIn);
			cmd.addParameter("@ENTITIES_PER_PUBLISH", entitiesPerPublish);
				
			cmd.execute();


		}
		
		public static void pSyncCommodity(NDate effectiveDateIn,NNumber entitiesPerPublish) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FOKEPROC.P_SYNC_COMMODITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@EFFECTIVE_DATE_IN", effectiveDateIn);
			cmd.addParameter("@ENTITIES_PER_PUBLISH", entitiesPerPublish);
				
			cmd.execute();


		}
		
		public static void pSyncEprocSupplier(NDate effectiveDateIn,NNumber entitiesPerPublish) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FOKEPROC.P_SYNC_EPROC_SUPPLIER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@EFFECTIVE_DATE_IN", effectiveDateIn);
			cmd.addParameter("@ENTITIES_PER_PUBLISH", entitiesPerPublish);
				
			cmd.execute();


		}
		
		public static void pSyncShipToLocation(NNumber entitiesPerPublish) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FOKEPROC.P_SYNC_SHIP_TO_LOCATION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@ENTITIES_PER_PUBLISH", entitiesPerPublish);
				
			cmd.execute();


		}
		
	
	
	
}
