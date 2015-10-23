package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class WwvFlowCustomAuthLdap {
		public static NBool Fauthenticate(NString pDn,NString pPassword,NString pLdapHost,NNumber pLdapPort) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_CUSTOM_AUTH_LDAP.AUTHENTICATE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@P_DN", pDn);
			cmd.addParameter("@P_PASSWORD", pPassword);
			cmd.addParameter("@P_LDAP_HOST", pLdapHost);
			cmd.addParameter("@P_LDAP_PORT", pLdapPort);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
	
	
	
}
