package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Gokcsso {
		public static void pCallBanner(NString url,NString sessToken) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKCSSO.P_CALL_BANNER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@URL", url);
			cmd.addParameter("@SESS_TOKEN", sessToken);
				
			cmd.execute();


		}
		
		public static void pCallBannerSserv(NString url,NString sessToken) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKCSSO.P_CALL_BANNER_SSERV", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@URL", url);
			cmd.addParameter("@SESS_TOKEN", sessToken);
				
			cmd.execute();


		}
		
		public static void pGetSess(NString sessToken) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKCSSO.P_GET_SESS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SESS_TOKEN", sessToken);
				
			cmd.execute();


		}
		
	
	
	
}
