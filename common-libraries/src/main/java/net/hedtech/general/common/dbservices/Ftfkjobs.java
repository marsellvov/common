package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Ftfkjobs {
		public static void pGetRuleDefault(NString pRuleKey,Ref<NString> pValueOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FTFKJOBS.P_GET_RULE_DEFAULT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_RULE_KEY", pRuleKey);
			cmd.addParameter("@P_VALUE_OUT", NString.class);
				
			cmd.execute();
			pValueOut.val = cmd.getParameterValue("@P_VALUE_OUT", NString.class);


		}
		
		public static void pUpdateFtrbauthAdvcStatus() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FTFKJOBS.P_UPDATE_FTRBAUTH_ADVC_STATUS", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
	
	
	
}
