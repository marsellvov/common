package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class CwmOlapDimension {
		public static void getDimensionId() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM_OLAP_DIMENSION.GET_DIMENSION_ID", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void lockDimension() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM_OLAP_DIMENSION.LOCK_DIMENSION", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void setDefaultDisplayHierarchy() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM_OLAP_DIMENSION.SET_DEFAULT_DISPLAY_HIERARCHY", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void setDescription() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM_OLAP_DIMENSION.SET_DESCRIPTION", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void setDisplayName() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM_OLAP_DIMENSION.SET_DISPLAY_NAME", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void setPluralName() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM_OLAP_DIMENSION.SET_PLURAL_NAME", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
	
	
	
}
