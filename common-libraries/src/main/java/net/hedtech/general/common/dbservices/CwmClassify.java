package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class CwmClassify {
		public static void addCatalogEntity() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM_CLASSIFY.ADD_CATALOG_ENTITY", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void addDescriptorEntityType() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM_CLASSIFY.ADD_DESCRIPTOR_ENTITY_TYPE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void addEntityDescriptorUse() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM_CLASSIFY.ADD_ENTITY_DESCRIPTOR_USE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void createCatalog() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM_CLASSIFY.CREATE_CATALOG", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void createDescriptor() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM_CLASSIFY.CREATE_DESCRIPTOR", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void createDescriptorType() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM_CLASSIFY.CREATE_DESCRIPTOR_TYPE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void dropCatalog() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM_CLASSIFY.DROP_CATALOG", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void dropDescriptor() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM_CLASSIFY.DROP_DESCRIPTOR", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void dropDescriptorType() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM_CLASSIFY.DROP_DESCRIPTOR_TYPE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void lockCatalog() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM_CLASSIFY.LOCK_CATALOG", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void removeCatalogEntity() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM_CLASSIFY.REMOVE_CATALOG_ENTITY", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void removeDescriptorEntityType() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM_CLASSIFY.REMOVE_DESCRIPTOR_ENTITY_TYPE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void removeEntityDescriptorUse() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM_CLASSIFY.REMOVE_ENTITY_DESCRIPTOR_USE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void setCatalogDescription() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM_CLASSIFY.SET_CATALOG_DESCRIPTION", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void setCatalogParent() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM_CLASSIFY.SET_CATALOG_PARENT", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
	
	
	
}
