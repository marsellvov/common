package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Eaeapps {
		public static void pGetAppid(NString appName,Ref<NNumber> appId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EAEAPPS.P_GET_APPID", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@APP_NAME", appName);
			cmd.addParameter("@APP_ID", NNumber.class);
				
			cmd.execute();
			appId.val = cmd.getParameterValue("@APP_ID", NNumber.class);


		}
		
	
	
	
}
