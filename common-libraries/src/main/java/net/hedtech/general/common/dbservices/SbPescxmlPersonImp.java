package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SbPescxmlPersonImp {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_PESCXML_PERSON_IMP.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static void pPersonElement(NNumber pDcmtSeqnoIn,NString pSchoolassignedpersonidIn,NString pSinIn,NString pNsnIn,NString pAgencyassignedidIn,NString pRecipientassignedidIn,NString pSsnIn,NString pBirthdateIn,NString pBirthdayMmddIn,NString pBirthNotemessageIn,NString pNameNameprefixIn,NString pNameFirstnameIn,NString pNameMiddlenameIn,NString pNameLastnameIn,NString pNameNamesuffixIn,NString pNameNametitleIn,NString pNameCompositenameIn,NString pNameNotemessageIn,NString pAltnameNameprefixIn,NString pAltnameFirstnameIn,NString pAltnameMiddlenameIn,NString pAltnameLastnameIn,NString pAltnameNamesuffixIn,NString pAltnameNametitleIn,NString pAltnameCompositenameIn,NString pAltnameNotemessageIn,NString pPersonHschOrgnameIn,NString pPrsnHschOrgidTypeIn,NString pPrsnHschOrgidValueIn,NString pPrsnAddressline1In,NString pPrsnAddressline2In,NString pPrsnAddressline3In,NString pPrsnCityIn,NString pPrsnDomesticIndIn,NString pPrsnStateprovcodeIn,NString pPrsnAddrPostalcodeIn,NString pPrsnStateprovinceIn,NString pPrsnPostalcodeIn,NString pPrsnCountrycodeIn,NString pPrsnAttentionlineIn,NString pPrsnAddrNotemessageIn,NString pPrsnCountryprefixcodeIn,NString pPrsnAreacitycodeIn,NString pPrsnPhonenumberIn,NString pPrsnPhonenumberextIn,NString pPrsnPhnNotemessageIn,NString pPrsnEmailaddressIn,NString pPrsnEmailNotemessageIn,NString pPrsnUrladdressIn,NString pPrsnUrlNotemessageIn,NString pPrsnContactNotemessageIn,NString pGendercodeIn,NString pGendercodeNotemessageIn,NString pResdStateprovinceIn,NString pResdCountycodeIn,NString pResdCountyIn,NString pResdCountrycodeIn,NString pResdCountryIn,NString pResdResidencystatcodeIn,NString pResdNotemessageIn,NString pDeceasedindicatorIn,NString pDeceasedNotemessageIn,NString pPersonNotemessageIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_PESCXML_PERSON_IMP.P_PERSON_ELEMENT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DCMT_SEQNO_IN", pDcmtSeqnoIn);
			cmd.addParameter("@P_SCHOOLASSIGNEDPERSONID_IN", pSchoolassignedpersonidIn);
			cmd.addParameter("@P_SIN_IN", pSinIn);
			cmd.addParameter("@P_NSN_IN", pNsnIn);
			cmd.addParameter("@P_AGENCYASSIGNEDID_IN", pAgencyassignedidIn);
			cmd.addParameter("@P_RECIPIENTASSIGNEDID_IN", pRecipientassignedidIn);
			cmd.addParameter("@P_SSN_IN", pSsnIn);
			cmd.addParameter("@P_BIRTHDATE_IN", pBirthdateIn);
			cmd.addParameter("@P_BIRTHDAY_MMDD_IN", pBirthdayMmddIn);
			cmd.addParameter("@P_BIRTH_NOTEMESSAGE_IN", pBirthNotemessageIn);
			cmd.addParameter("@P_NAME_NAMEPREFIX_IN", pNameNameprefixIn);
			cmd.addParameter("@P_NAME_FIRSTNAME_IN", pNameFirstnameIn);
			cmd.addParameter("@P_NAME_MIDDLENAME_IN", pNameMiddlenameIn);
			cmd.addParameter("@P_NAME_LASTNAME_IN", pNameLastnameIn);
			cmd.addParameter("@P_NAME_NAMESUFFIX_IN", pNameNamesuffixIn);
			cmd.addParameter("@P_NAME_NAMETITLE_IN", pNameNametitleIn);
			cmd.addParameter("@P_NAME_COMPOSITENAME_IN", pNameCompositenameIn);
			cmd.addParameter("@P_NAME_NOTEMESSAGE_IN", pNameNotemessageIn);
			cmd.addParameter("@P_ALTNAME_NAMEPREFIX_IN", pAltnameNameprefixIn);
			cmd.addParameter("@P_ALTNAME_FIRSTNAME_IN", pAltnameFirstnameIn);
			cmd.addParameter("@P_ALTNAME_MIDDLENAME_IN", pAltnameMiddlenameIn);
			cmd.addParameter("@P_ALTNAME_LASTNAME_IN", pAltnameLastnameIn);
			cmd.addParameter("@P_ALTNAME_NAMESUFFIX_IN", pAltnameNamesuffixIn);
			cmd.addParameter("@P_ALTNAME_NAMETITLE_IN", pAltnameNametitleIn);
			cmd.addParameter("@P_ALTNAME_COMPOSITENAME_IN", pAltnameCompositenameIn);
			cmd.addParameter("@P_ALTNAME_NOTEMESSAGE_IN", pAltnameNotemessageIn);
			cmd.addParameter("@P_PERSON_HSCH_ORGNAME_IN", pPersonHschOrgnameIn);
			cmd.addParameter("@P_PRSN_HSCH_ORGID_TYPE_IN", pPrsnHschOrgidTypeIn);
			cmd.addParameter("@P_PRSN_HSCH_ORGID_VALUE_IN", pPrsnHschOrgidValueIn);
			cmd.addParameter("@P_PRSN_ADDRESSLINE1_IN", pPrsnAddressline1In);
			cmd.addParameter("@P_PRSN_ADDRESSLINE2_IN", pPrsnAddressline2In);
			cmd.addParameter("@P_PRSN_ADDRESSLINE3_IN", pPrsnAddressline3In);
			cmd.addParameter("@P_PRSN_CITY_IN", pPrsnCityIn);
			cmd.addParameter("@P_PRSN_DOMESTIC_IND_IN", pPrsnDomesticIndIn);
			cmd.addParameter("@P_PRSN_STATEPROVCODE_IN", pPrsnStateprovcodeIn);
			cmd.addParameter("@P_PRSN_ADDR_POSTALCODE_IN", pPrsnAddrPostalcodeIn);
			cmd.addParameter("@P_PRSN_STATEPROVINCE_IN", pPrsnStateprovinceIn);
			cmd.addParameter("@P_PRSN_POSTALCODE_IN", pPrsnPostalcodeIn);
			cmd.addParameter("@P_PRSN_COUNTRYCODE_IN", pPrsnCountrycodeIn);
			cmd.addParameter("@P_PRSN_ATTENTIONLINE_IN", pPrsnAttentionlineIn);
			cmd.addParameter("@P_PRSN_ADDR_NOTEMESSAGE_IN", pPrsnAddrNotemessageIn);
			cmd.addParameter("@P_PRSN_COUNTRYPREFIXCODE_IN", pPrsnCountryprefixcodeIn);
			cmd.addParameter("@P_PRSN_AREACITYCODE_IN", pPrsnAreacitycodeIn);
			cmd.addParameter("@P_PRSN_PHONENUMBER_IN", pPrsnPhonenumberIn);
			cmd.addParameter("@P_PRSN_PHONENUMBEREXT_IN", pPrsnPhonenumberextIn);
			cmd.addParameter("@P_PRSN_PHN_NOTEMESSAGE_IN", pPrsnPhnNotemessageIn);
			cmd.addParameter("@P_PRSN_EMAILADDRESS_IN", pPrsnEmailaddressIn);
			cmd.addParameter("@P_PRSN_EMAIL_NOTEMESSAGE_IN", pPrsnEmailNotemessageIn);
			cmd.addParameter("@P_PRSN_URLADDRESS_IN", pPrsnUrladdressIn);
			cmd.addParameter("@P_PRSN_URL_NOTEMESSAGE_IN", pPrsnUrlNotemessageIn);
			cmd.addParameter("@P_PRSN_CONTACT_NOTEMESSAGE_IN", pPrsnContactNotemessageIn);
			cmd.addParameter("@P_GENDERCODE_IN", pGendercodeIn);
			cmd.addParameter("@P_GENDERCODE_NOTEMESSAGE_IN", pGendercodeNotemessageIn);
			cmd.addParameter("@P_RESD_STATEPROVINCE_IN", pResdStateprovinceIn);
			cmd.addParameter("@P_RESD_COUNTYCODE_IN", pResdCountycodeIn);
			cmd.addParameter("@P_RESD_COUNTY_IN", pResdCountyIn);
			cmd.addParameter("@P_RESD_COUNTRYCODE_IN", pResdCountrycodeIn);
			cmd.addParameter("@P_RESD_COUNTRY_IN", pResdCountryIn);
			cmd.addParameter("@P_RESD_RESIDENCYSTATCODE_IN", pResdResidencystatcodeIn);
			cmd.addParameter("@P_RESD_NOTEMESSAGE_IN", pResdNotemessageIn);
			cmd.addParameter("@P_DECEASEDINDICATOR_IN", pDeceasedindicatorIn);
			cmd.addParameter("@P_DECEASED_NOTEMESSAGE_IN", pDeceasedNotemessageIn);
			cmd.addParameter("@P_PERSON_NOTEMESSAGE_IN", pPersonNotemessageIn);
				
			cmd.execute();


		}
		
	
	
	
}
