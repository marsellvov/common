package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Rokemal {
		public static void pSendemail(NString emailAddr,NString emailToName,NString emailFromAddr,NString emailFromName,NString emailHost,NString emailSubject,NString emailMessage,NNumber emailPort,NString emailCtype,Ref<NString> emailSuccess,Ref<NString> emailReply) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKEMAL.P_SENDEMAIL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@EMAIL_ADDR", emailAddr);
			cmd.addParameter("@EMAIL_TO_NAME", emailToName);
			cmd.addParameter("@EMAIL_FROM_ADDR", emailFromAddr);
			cmd.addParameter("@EMAIL_FROM_NAME", emailFromName);
			cmd.addParameter("@EMAIL_HOST", emailHost);
			cmd.addParameter("@EMAIL_SUBJECT", emailSubject);
			cmd.addParameter("@EMAIL_MESSAGE", emailMessage);
			cmd.addParameter("@EMAIL_PORT", emailPort);
			cmd.addParameter("@EMAIL_CTYPE", emailCtype);
			cmd.addParameter("@EMAIL_SUCCESS", emailSuccess, true);
			cmd.addParameter("@EMAIL_REPLY", emailReply, true);
				
			cmd.execute();
			emailSuccess.val = cmd.getParameterValue("@EMAIL_SUCCESS", NString.class);
			emailReply.val = cmd.getParameterValue("@EMAIL_REPLY", NString.class);


		}
		
	
	
	
}
