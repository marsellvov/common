package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Cwm2OlapDimensionAttribute {
		public static void createDimensionAttribute(NString pDimensionOwner,NString pDimensionName,NString pDimensionAttributeName,NString pDisplayName,NString pShortDescription,NString pDescription,NString pType) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_DIMENSION_ATTRIBUTE.CREATE_DIMENSION_ATTRIBUTE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DIMENSION_OWNER", pDimensionOwner);
			cmd.addParameter("@P_DIMENSION_NAME", pDimensionName);
			cmd.addParameter("@P_DIMENSION_ATTRIBUTE_NAME", pDimensionAttributeName);
			cmd.addParameter("@P_DISPLAY_NAME", pDisplayName);
			cmd.addParameter("@P_SHORT_DESCRIPTION", pShortDescription);
			cmd.addParameter("@P_DESCRIPTION", pDescription);
			cmd.addParameter("@P_TYPE", pType);
				
			cmd.execute();


		}
		
		public static void createDimensionAttribute(NString pDimensionOwner,NString pDimensionName,NString pDimensionAttributeName,NString pDisplayName,NString pShortDescription,NString pDescription,NBool pUseNameAsType) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_DIMENSION_ATTRIBUTE.CREATE_DIMENSION_ATTRIBUTE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DIMENSION_OWNER", pDimensionOwner);
			cmd.addParameter("@P_DIMENSION_NAME", pDimensionName);
			cmd.addParameter("@P_DIMENSION_ATTRIBUTE_NAME", pDimensionAttributeName);
			cmd.addParameter("@P_DISPLAY_NAME", pDisplayName);
			cmd.addParameter("@P_SHORT_DESCRIPTION", pShortDescription);
			cmd.addParameter("@P_DESCRIPTION", pDescription);
			cmd.addParameter("@P_USE_NAME_AS_TYPE", pUseNameAsType);
				
			cmd.execute();


		}
		
		public static void createDimensionAttribute2(NString pDimensionOwner,NString pDimensionName,NString pDimensionAttributeName,NString pDisplayName,NString pShortDescription,NString pDescription,NNumber pUseNameAsType) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_DIMENSION_ATTRIBUTE.CREATE_DIMENSION_ATTRIBUTE_2", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DIMENSION_OWNER", pDimensionOwner);
			cmd.addParameter("@P_DIMENSION_NAME", pDimensionName);
			cmd.addParameter("@P_DIMENSION_ATTRIBUTE_NAME", pDimensionAttributeName);
			cmd.addParameter("@P_DISPLAY_NAME", pDisplayName);
			cmd.addParameter("@P_SHORT_DESCRIPTION", pShortDescription);
			cmd.addParameter("@P_DESCRIPTION", pDescription);
			cmd.addParameter("@P_USE_NAME_AS_TYPE", pUseNameAsType);
				
			cmd.execute();


		}
		
		public static void dropDimensionAttribute(NString pDimensionOwner,NString pDimensionName,NString pDimensionAttributeName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_DIMENSION_ATTRIBUTE.DROP_DIMENSION_ATTRIBUTE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DIMENSION_OWNER", pDimensionOwner);
			cmd.addParameter("@P_DIMENSION_NAME", pDimensionName);
			cmd.addParameter("@P_DIMENSION_ATTRIBUTE_NAME", pDimensionAttributeName);
				
			cmd.execute();


		}
		
		public static void lockDimensionAttribute(NString pDimensionOwner,NString pDimensionName,NString pDimensionAttributeName,NBool pWaitForLock) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_DIMENSION_ATTRIBUTE.LOCK_DIMENSION_ATTRIBUTE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DIMENSION_OWNER", pDimensionOwner);
			cmd.addParameter("@P_DIMENSION_NAME", pDimensionName);
			cmd.addParameter("@P_DIMENSION_ATTRIBUTE_NAME", pDimensionAttributeName);
			cmd.addParameter("@P_WAIT_FOR_LOCK", pWaitForLock);
				
			cmd.execute();


		}
		
		public static void setDescription(NString pDimensionOwner,NString pDimensionName,NString pDimensionAttributeName,NString pDescription) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_DIMENSION_ATTRIBUTE.SET_DESCRIPTION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DIMENSION_OWNER", pDimensionOwner);
			cmd.addParameter("@P_DIMENSION_NAME", pDimensionName);
			cmd.addParameter("@P_DIMENSION_ATTRIBUTE_NAME", pDimensionAttributeName);
			cmd.addParameter("@P_DESCRIPTION", pDescription);
				
			cmd.execute();


		}
		
		public static void setDimensionAttributeName(NString pDimensionOwner,NString pDimensionName,NString pDimensionAttributeName,NString pSetDimensionAttributeName,NString pType) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_DIMENSION_ATTRIBUTE.SET_DIMENSION_ATTRIBUTE_NAME", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DIMENSION_OWNER", pDimensionOwner);
			cmd.addParameter("@P_DIMENSION_NAME", pDimensionName);
			cmd.addParameter("@P_DIMENSION_ATTRIBUTE_NAME", pDimensionAttributeName);
			cmd.addParameter("@P_SET_DIMENSION_ATTRIBUTE_NAME", pSetDimensionAttributeName);
			cmd.addParameter("@P_TYPE", pType);
				
			cmd.execute();


		}
		
		public static void setDimensionAttributeName(NString pDimensionOwner,NString pDimensionName,NString pDimensionAttributeName,NString pSetDimensionAttributeName,NBool pUseNameAsType) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_DIMENSION_ATTRIBUTE.SET_DIMENSION_ATTRIBUTE_NAME", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DIMENSION_OWNER", pDimensionOwner);
			cmd.addParameter("@P_DIMENSION_NAME", pDimensionName);
			cmd.addParameter("@P_DIMENSION_ATTRIBUTE_NAME", pDimensionAttributeName);
			cmd.addParameter("@P_SET_DIMENSION_ATTRIBUTE_NAME", pSetDimensionAttributeName);
			cmd.addParameter("@P_USE_NAME_AS_TYPE", pUseNameAsType);
				
			cmd.execute();


		}
		
		public static void setDisplayName(NString pDimensionOwner,NString pDimensionName,NString pDimensionAttributeName,NString pDisplayName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_DIMENSION_ATTRIBUTE.SET_DISPLAY_NAME", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DIMENSION_OWNER", pDimensionOwner);
			cmd.addParameter("@P_DIMENSION_NAME", pDimensionName);
			cmd.addParameter("@P_DIMENSION_ATTRIBUTE_NAME", pDimensionAttributeName);
			cmd.addParameter("@P_DISPLAY_NAME", pDisplayName);
				
			cmd.execute();


		}
		
		public static void setShortDescription(NString pDimensionOwner,NString pDimensionName,NString pDimensionAttributeName,NString pShortDescription) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_DIMENSION_ATTRIBUTE.SET_SHORT_DESCRIPTION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DIMENSION_OWNER", pDimensionOwner);
			cmd.addParameter("@P_DIMENSION_NAME", pDimensionName);
			cmd.addParameter("@P_DIMENSION_ATTRIBUTE_NAME", pDimensionAttributeName);
			cmd.addParameter("@P_SHORT_DESCRIPTION", pShortDescription);
				
			cmd.execute();


		}
		
	
	
	
}
