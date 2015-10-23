package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class CwmOlapMeasure {
		public static void createMeasure() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM_OLAP_MEASURE.CREATE_MEASURE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void dropMeasure() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM_OLAP_MEASURE.DROP_MEASURE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void getMeasureId() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM_OLAP_MEASURE.GET_MEASURE_ID", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void lockMeasure() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM_OLAP_MEASURE.LOCK_MEASURE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void removeColumnMap() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM_OLAP_MEASURE.REMOVE_COLUMN_MAP", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void setColumnMap() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM_OLAP_MEASURE.SET_COLUMN_MAP", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void setDefaultAggregationMethod() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM_OLAP_MEASURE.SET_DEFAULT_AGGREGATION_METHOD", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void setDescription() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM_OLAP_MEASURE.SET_DESCRIPTION", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void setDisplayName() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM_OLAP_MEASURE.SET_DISPLAY_NAME", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
	
	
	
}
