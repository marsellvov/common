package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Ordplsgwyutil {
		public static NBool FcacheIsValid(NDate lastUpdateTime) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ORDPLSGWYUTIL.CACHE_IS_VALID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@LAST_UPDATE_TIME", lastUpdateTime);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static void resourceNotFound(NString paramName,NString paramValue) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ORDPLSGWYUTIL.RESOURCE_NOT_FOUND", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PARAM_NAME", paramName);
			cmd.addParameter("@PARAM_VALUE", paramValue);
				
			cmd.execute();


		}
		
		public static void setLastModified(NDate lastUpdateTime) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ORDPLSGWYUTIL.SET_LAST_MODIFIED", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@LAST_UPDATE_TIME", lastUpdateTime);
				
			cmd.execute();


		}
		
	
	
	
}
