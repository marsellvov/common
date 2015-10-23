package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Cwm2OlapMrCheckPrivs {
		public static void checkCurrentUserPrivs(NString objectmode,Ref<NString> result) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_MR_CHECK_PRIVS.CHECK_CURRENT_USER_PRIVS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@OBJECTMODE", objectmode);
			cmd.addParameter("@RESULT", result, true);
				
			cmd.execute();
			result.val = cmd.getParameterValue("@RESULT", NString.class);


		}
		
	
	
	
}
