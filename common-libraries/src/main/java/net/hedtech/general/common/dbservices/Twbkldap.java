package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Twbkldap {
		public static void pModifypgldap(NString returnCode,NString returnMsg,NString ldapProtocolIn,NString ldapSearchIndIn,NString ldapServerNameIn,NString ldapPortIn,NString ldapSearchBaseIn,NString ldapSearchFltrSufxIn,NString ldapSearchFltrPrfxIn,NString ldapSearchAttributeIn,NString ldapCertificateLocationIn,NString ldapCertificatePasswdIn,NString ldapCertificateAuthModeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKLDAP.P_MODIFYPGLDAP", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@RETURN_CODE", returnCode);
			cmd.addParameter("@RETURN_MSG", returnMsg);
			cmd.addParameter("@LDAP_PROTOCOL_IN", ldapProtocolIn);
			cmd.addParameter("@LDAP_SEARCH_IND_IN", ldapSearchIndIn);
			cmd.addParameter("@LDAP_SERVER_NAME_IN", ldapServerNameIn);
			cmd.addParameter("@LDAP_PORT_IN", ldapPortIn);
			cmd.addParameter("@LDAP_SEARCH_BASE_IN", ldapSearchBaseIn);
			cmd.addParameter("@LDAP_SEARCH_FLTR_SUFX_IN", ldapSearchFltrSufxIn);
			cmd.addParameter("@LDAP_SEARCH_FLTR_PRFX_IN", ldapSearchFltrPrfxIn);
			cmd.addParameter("@LDAP_SEARCH_ATTRIBUTE_IN", ldapSearchAttributeIn);
			cmd.addParameter("@LDAP_CERTIFICATE_LOCATION_IN", ldapCertificateLocationIn);
			cmd.addParameter("@LDAP_CERTIFICATE_PASSWD_IN", ldapCertificatePasswdIn);
			cmd.addParameter("@LDAP_CERTIFICATE_AUTH_MODE_IN", ldapCertificateAuthModeIn);
				
			cmd.execute();


		}
		
		public static void pSaveldap(NString transType,NString ldapProtocolIn,NString ldapSearchIndIn,NString ldapServerNameIn,NString ldapPortIn,NString ldapSearchBaseIn,NString ldapSearchFltrSufxIn,NString ldapSearchFltrPrfxIn,NString ldapSearchAttributeIn,NString ldapCertificateLocationIn,NString ldapCertificatePasswdIn,NString ldapCertificateAuthModeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKLDAP.P_SAVELDAP", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TRANS_TYPE", transType);
			cmd.addParameter("@LDAP_PROTOCOL_IN", ldapProtocolIn);
			cmd.addParameter("@LDAP_SEARCH_IND_IN", ldapSearchIndIn);
			cmd.addParameter("@LDAP_SERVER_NAME_IN", ldapServerNameIn);
			cmd.addParameter("@LDAP_PORT_IN", ldapPortIn);
			cmd.addParameter("@LDAP_SEARCH_BASE_IN", ldapSearchBaseIn);
			cmd.addParameter("@LDAP_SEARCH_FLTR_SUFX_IN", ldapSearchFltrSufxIn);
			cmd.addParameter("@LDAP_SEARCH_FLTR_PRFX_IN", ldapSearchFltrPrfxIn);
			cmd.addParameter("@LDAP_SEARCH_ATTRIBUTE_IN", ldapSearchAttributeIn);
			cmd.addParameter("@LDAP_CERTIFICATE_LOCATION_IN", ldapCertificateLocationIn);
			cmd.addParameter("@LDAP_CERTIFICATE_PASSWD_IN", ldapCertificatePasswdIn);
			cmd.addParameter("@LDAP_CERTIFICATE_AUTH_MODE_IN", ldapCertificateAuthModeIn);
				
			cmd.execute();


		}
		
	
	
	
}
