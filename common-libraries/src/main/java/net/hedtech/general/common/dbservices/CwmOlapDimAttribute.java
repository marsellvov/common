package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class CwmOlapDimAttribute {
		public static void addLevelAttribute() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM_OLAP_DIM_ATTRIBUTE.ADD_LEVEL_ATTRIBUTE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void createDimensionAttribute() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM_OLAP_DIM_ATTRIBUTE.CREATE_DIMENSION_ATTRIBUTE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void dropDimensionAttribute() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM_OLAP_DIM_ATTRIBUTE.DROP_DIMENSION_ATTRIBUTE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void getDimensionattributeId() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM_OLAP_DIM_ATTRIBUTE.GET_DIMENSIONATTRIBUTE_ID", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void lockDimensionAttribute() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM_OLAP_DIM_ATTRIBUTE.LOCK_DIMENSION_ATTRIBUTE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void removeLevelAttribute() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM_OLAP_DIM_ATTRIBUTE.REMOVE_LEVEL_ATTRIBUTE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void setDescription() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM_OLAP_DIM_ATTRIBUTE.SET_DESCRIPTION", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void setDisplayName() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM_OLAP_DIM_ATTRIBUTE.SET_DISPLAY_NAME", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
	
	
	
}
