package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Eoksecr {
		public static NString fCmhash(NString s) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EOKSECR.F_CMHASH", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@S", s);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fDecrypt(NString message,NString key) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EOKSECR.F_DECRYPT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@MESSAGE", message);
			cmd.addParameter("@KEY", key);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fEncrypt(NString message,NString key) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EOKSECR.F_ENCRYPT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@MESSAGE", message);
			cmd.addParameter("@KEY", key);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGenerateCredentials(NString username,NString password,NString key) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EOKSECR.F_GENERATE_CREDENTIALS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@USERNAME", username);
			cmd.addParameter("@PASSWORD", password);
			cmd.addParameter("@KEY", key);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetAxSecurityProvider() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EOKSECR.F_GET_AX_SECURITY_PROVIDER", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber fSetCmPassword(NString username,NString password) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EOKSECR.F_SET_CM_PASSWORD", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@USERNAME", username);
			cmd.addParameter("@PASSWORD", password);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static void pSetCmPassword(NString username,NString password) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EOKSECR.P_SET_CM_PASSWORD", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@USERNAME", username);
			cmd.addParameter("@PASSWORD", password);
				
			cmd.execute();


		}
		
	
	
	
}
