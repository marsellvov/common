package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class ApplicationAuthentication {
		public static void changeCurrentPassword(NString pNewPassword) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APPLICATION_AUTHENTICATION.CHANGE_CURRENT_PASSWORD", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_NEW_PASSWORD", pNewPassword);
				
			cmd.execute();


		}
		
		public static void home(NString pUserid,NString pPassword,NString pCompany,NString pFlowPage) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APPLICATION_AUTHENTICATION.HOME", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_USERID", pUserid);
			cmd.addParameter("@P_PASSWORD", pPassword);
			cmd.addParameter("@P_COMPANY", pCompany);
			cmd.addParameter("@P_FLOW_PAGE", pFlowPage);
				
			cmd.execute();


		}
		
		public static void logout(NString pLoginUrl) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APPLICATION_AUTHENTICATION.LOGOUT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_LOGIN_URL", pLoginUrl);
				
			cmd.execute();


		}
		
	
	
	
}
