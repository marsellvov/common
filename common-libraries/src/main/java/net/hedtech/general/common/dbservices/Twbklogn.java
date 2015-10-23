package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Twbklogn {
		public static NString fEncData(NString fInpString) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKLOGN.F_ENC_DATA", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@F_INP_STRING", fInpString);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetBannerId(NNumber pidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKLOGN.F_GET_BANNER_ID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PIDM", pidm);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetUser() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKLOGN.F_GET_USER", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber fLdapBannersearch(NString fLdapuser,NString fLdappasswd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKLOGN.F_LDAP_BANNERSEARCH", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@F_LDAPUSER", fLdapuser);
			cmd.addParameter("@F_LDAPPASSWD", fLdappasswd);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fLdapCpsearch(NString fLdapuser,NString fLdappasswd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKLOGN.F_LDAP_CPSEARCH", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@F_LDAPUSER", fLdapuser);
			cmd.addParameter("@F_LDAPPASSWD", fLdappasswd);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fLdapCustomsearch(NString fLdapuser,NString fLdappasswd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKLOGN.F_LDAP_CUSTOMSEARCH", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@F_LDAPUSER", fLdapuser);
			cmd.addParameter("@F_LDAPPASSWD", fLdappasswd);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static void pAuthenticateMain(NString sid,NString pin,NString tempid,NString newpin,NString verpin,NString retCode,NString question,NString answer,NString buttonselected) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKLOGN.P_AUTHENTICATE_MAIN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SID", sid);
			cmd.addParameter("@PIN", pin);
			cmd.addParameter("@TEMPID", tempid);
			cmd.addParameter("@NEWPIN", newpin);
			cmd.addParameter("@VERPIN", verpin);
			cmd.addParameter("@RET_CODE", retCode);
			cmd.addParameter("@QUESTION", question);
			cmd.addParameter("@ANSWER", answer);
			cmd.addParameter("@BUTTONSELECTED", buttonselected);
				
			cmd.execute();


		}
		
		public static void pValidatePin(NString pId,NNumber pPidm,NString pPin,Ref<NString> pPinValid,Ref<NString> pPinExpired,Ref<NString> pPinDisabled,Ref<NString> pUseLdap) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKLOGN.P_VALIDATE_PIN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_PIN", pPin);
			cmd.addParameter("@P_PIN_VALID", NString.class);
			cmd.addParameter("@P_PIN_EXPIRED", NString.class);
			cmd.addParameter("@P_PIN_DISABLED", NString.class);
			cmd.addParameter("@P_USE_LDAP", NString.class);
				
			cmd.execute();
			pPinValid.val = cmd.getParameterValue("@P_PIN_VALID", NString.class);
			pPinExpired.val = cmd.getParameterValue("@P_PIN_EXPIRED", NString.class);
			pPinDisabled.val = cmd.getParameterValue("@P_PIN_DISABLED", NString.class);
			pUseLdap.val = cmd.getParameterValue("@P_USE_LDAP", NString.class);


		}
		
	
	
	
}
