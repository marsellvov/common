package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Wfckgsso {
		public static void getSso(NString clientId,NString encryptionKey,Ref<NString> usernameArg,Ref<NString> passwordArg,Ref<NNumber> expirationArg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WFCKGSSO.GET_SSO", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@CLIENT_ID", clientId);
			cmd.addParameter("@ENCRYPTION_KEY", encryptionKey);
			cmd.addParameter("@USERNAME_ARG", NString.class);
			cmd.addParameter("@PASSWORD_ARG", NString.class);
			cmd.addParameter("@EXPIRATION_ARG", NNumber.class);
				
			cmd.execute();
			usernameArg.val = cmd.getParameterValue("@USERNAME_ARG", NString.class);
			passwordArg.val = cmd.getParameterValue("@PASSWORD_ARG", NString.class);
			expirationArg.val = cmd.getParameterValue("@EXPIRATION_ARG", NNumber.class);


		}
		
	
	
	
}
