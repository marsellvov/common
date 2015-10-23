package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Twbkausr {
		public static void pMainWrapper(NString url) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKAUSR.P_MAIN_WRAPPER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@URL", url);
				
			cmd.execute();


		}
		
		public static void pWebLogin(NString ssoUser,NString ssoPswd,NString ssoLumUser,NString url,NString pswdDiffSw) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKAUSR.P_WEB_LOGIN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SSO_USER", ssoUser);
			cmd.addParameter("@SSO_PSWD", ssoPswd);
			cmd.addParameter("@SSO_LUM_USER", ssoLumUser);
			cmd.addParameter("@URL", url);
			cmd.addParameter("@PSWD_DIFF_SW", pswdDiffSw);
				
			cmd.execute();


		}
		
	
	
	
}
