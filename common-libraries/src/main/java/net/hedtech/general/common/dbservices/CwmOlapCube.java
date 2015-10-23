package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class CwmOlapCube {
		public static void addDimension() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM_OLAP_CUBE.ADD_DIMENSION", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void createCube() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM_OLAP_CUBE.CREATE_CUBE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void dropCube() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM_OLAP_CUBE.DROP_CUBE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void getCubeId() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM_OLAP_CUBE.GET_CUBE_ID", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void lockCube() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM_OLAP_CUBE.LOCK_CUBE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void mapCube() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM_OLAP_CUBE.MAP_CUBE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void rebuild() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM_OLAP_CUBE.REBUILD", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void removeDimension() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM_OLAP_CUBE.REMOVE_DIMENSION", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void setDefaultCalcHierarchy() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM_OLAP_CUBE.SET_DEFAULT_CALC_HIERARCHY", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void setDescription() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM_OLAP_CUBE.SET_DESCRIPTION", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		
		public static void setDimensionDependency() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM_OLAP_CUBE.SET_DIMENSION_DEPENDENCY", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void setDisplayName() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM_OLAP_CUBE.SET_DISPLAY_NAME", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
	
	
	
}
