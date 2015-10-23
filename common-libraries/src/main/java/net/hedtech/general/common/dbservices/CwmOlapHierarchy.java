package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class CwmOlapHierarchy {
		public static void getHierarchyId() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM_OLAP_HIERARCHY.GET_HIERARCHY_ID", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void lockHierarchy() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM_OLAP_HIERARCHY.LOCK_HIERARCHY", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void setDescription() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM_OLAP_HIERARCHY.SET_DESCRIPTION", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void setDisplayName() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM_OLAP_HIERARCHY.SET_DISPLAY_NAME", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
	
	
	
}
