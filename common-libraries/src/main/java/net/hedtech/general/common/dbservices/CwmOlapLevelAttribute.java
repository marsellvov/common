package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class CwmOlapLevelAttribute {
		public static void getAttributeId() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM_OLAP_LEVEL_ATTRIBUTE.GET_ATTRIBUTE_ID", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void lockAttribute() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM_OLAP_LEVEL_ATTRIBUTE.LOCK_ATTRIBUTE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void setDescription() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM_OLAP_LEVEL_ATTRIBUTE.SET_DESCRIPTION", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void setDisplayName() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM_OLAP_LEVEL_ATTRIBUTE.SET_DISPLAY_NAME", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void setName() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM_OLAP_LEVEL_ATTRIBUTE.SET_NAME", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
	
	
	
}
