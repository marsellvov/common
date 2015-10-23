package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SbPescxmlPersonExp {
		public static void pPersonElement(NNumber pRequestPidmIn,NNumber pRequestSeqNoIn,NString pRequestUserIn,NString pRequestTermIn,NString pRequestLevlIn,NString pRequestSbgiCodeIn,NString pRequesttableIn,NString pTprtCodeIn,Ref<NString> pSchoolassignedpersonidOut,Ref<NString> pSinOut,Ref<NString> pNsnOut,Ref<NString> pAgencyassignedidOut,Ref<NString> pRecipientassignedidOut,Ref<NString> pSsnOut,Ref<NString> pBirthdateOut,Ref<NString> pBirthdayMmddOut,Ref<NString> pBirthNotemessageOut,Ref<NString> pNameNameprefixOut,Ref<NString> pNameFirstnameOut,Ref<NString> pNameMiddlenameOut,Ref<NString> pNameLastnameOut,Ref<NString> pNameNamesuffixOut,Ref<NString> pNameNametitleOut,Ref<NString> pNameCompositenameOut,Ref<NString> pNameNotemessageOut,Ref<NString> pAltnameNameprefixOut,Ref<NString> pAltnameFirstnameOut,Ref<NString> pAltnameMiddlenameOut,Ref<NString> pAltnameLastnameOut,Ref<NString> pAltnameNamesuffixOut,Ref<NString> pAltnameNametitleOut,Ref<NString> pAltnameCompositenameOut,Ref<NString> pAltnameNotemessageOut,Ref<NString> pPersonHschOrgnameOut,Ref<NString> pPrsnHschOrgidTypeOut,Ref<NString> pPrsnHschOrgidValueOut,Ref<NString> pPrsnAddressline1Out,Ref<NString> pPrsnAddressline2Out,Ref<NString> pPrsnAddressline3Out,Ref<NString> pPrsnCityOut,Ref<NString> pPrsnDomesticIndOut,Ref<NString> pPrsnStateprovcodeOut,Ref<NString> pPrsnPostalcodeOut,Ref<NString> pPrsnStateprovinceOut,Ref<NString> pPrsnCountrycodeOut,Ref<NString> pPrsnAttentionlineOut,Ref<NString> pPrsnAddrNotemessageOut,Ref<NString> pPrsnCountryprefixcodeOut,Ref<NString> pPrsnAreacitycodeOut,Ref<NString> pPrsnPhonenumberOut,Ref<NString> pPrsnPhonenumberextOut,Ref<NString> pPrsnPhnNotemessageOut,Ref<NString> pPrsnEmailaddressOut,Ref<NString> pPrsnEmailNotemessageOut,Ref<NString> pPrsnUrladdressOut,Ref<NString> pPrsnUrlNotemessageOut,Ref<NString> pPrsnContactNotemessageOut,Ref<NString> pGendercodeOut,Ref<NString> pGendercodeNotemessageOut,Ref<NString> pResdStateprovinceOut,Ref<NString> pResdCountycodeOut,Ref<NString> pResdCountyOut,Ref<NString> pResdCountrycodeOut,Ref<NString> pResdCountryOut,Ref<NString> pResdResidencystatcodeOut,Ref<NString> pResdNotemessageOut,Ref<NString> pDeceasedindicatorOut,Ref<NString> pDeceasedNotemessageOut,Ref<NString> pPersonNotemessageOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_PESCXML_PERSON_EXP.P_PERSON_ELEMENT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_REQUEST_PIDM_IN", pRequestPidmIn);
			cmd.addParameter("@P_REQUEST_SEQ_NO_IN", pRequestSeqNoIn);
			cmd.addParameter("@P_REQUEST_USER_IN", pRequestUserIn);
			cmd.addParameter("@P_REQUEST_TERM_IN", pRequestTermIn);
			cmd.addParameter("@P_REQUEST_LEVL_IN", pRequestLevlIn);
			cmd.addParameter("@P_REQUEST_SBGI_CODE_IN", pRequestSbgiCodeIn);
			cmd.addParameter("@P_REQUESTTABLE_IN", pRequesttableIn);
			cmd.addParameter("@P_TPRT_CODE_IN", pTprtCodeIn);
			cmd.addParameter("@P_SCHOOLASSIGNEDPERSONID_OUT", NString.class);
			cmd.addParameter("@P_SIN_OUT", NString.class);
			cmd.addParameter("@P_NSN_OUT", NString.class);
			cmd.addParameter("@P_AGENCYASSIGNEDID_OUT", NString.class);
			cmd.addParameter("@P_RECIPIENTASSIGNEDID_OUT", NString.class);
			cmd.addParameter("@P_SSN_OUT", NString.class);
			cmd.addParameter("@P_BIRTHDATE_OUT", NString.class);
			cmd.addParameter("@P_BIRTHDAY_MMDD_OUT", NString.class);
			cmd.addParameter("@P_BIRTH_NOTEMESSAGE_OUT", NString.class);
			cmd.addParameter("@P_NAME_NAMEPREFIX_OUT", NString.class);
			cmd.addParameter("@P_NAME_FIRSTNAME_OUT", NString.class);
			cmd.addParameter("@P_NAME_MIDDLENAME_OUT", NString.class);
			cmd.addParameter("@P_NAME_LASTNAME_OUT", NString.class);
			cmd.addParameter("@P_NAME_NAMESUFFIX_OUT", NString.class);
			cmd.addParameter("@P_NAME_NAMETITLE_OUT", NString.class);
			cmd.addParameter("@P_NAME_COMPOSITENAME_OUT", NString.class);
			cmd.addParameter("@P_NAME_NOTEMESSAGE_OUT", NString.class);
			cmd.addParameter("@P_ALTNAME_NAMEPREFIX_OUT", NString.class);
			cmd.addParameter("@P_ALTNAME_FIRSTNAME_OUT", NString.class);
			cmd.addParameter("@P_ALTNAME_MIDDLENAME_OUT", NString.class);
			cmd.addParameter("@P_ALTNAME_LASTNAME_OUT", NString.class);
			cmd.addParameter("@P_ALTNAME_NAMESUFFIX_OUT", NString.class);
			cmd.addParameter("@P_ALTNAME_NAMETITLE_OUT", NString.class);
			cmd.addParameter("@P_ALTNAME_COMPOSITENAME_OUT", NString.class);
			cmd.addParameter("@P_ALTNAME_NOTEMESSAGE_OUT", NString.class);
			cmd.addParameter("@P_PERSON_HSCH_ORGNAME_OUT", NString.class);
			cmd.addParameter("@P_PRSN_HSCH_ORGID_TYPE_OUT", NString.class);
			cmd.addParameter("@P_PRSN_HSCH_ORGID_VALUE_OUT", NString.class);
			cmd.addParameter("@P_PRSN_ADDRESSLINE1_OUT", NString.class);
			cmd.addParameter("@P_PRSN_ADDRESSLINE2_OUT", NString.class);
			cmd.addParameter("@P_PRSN_ADDRESSLINE3_OUT", NString.class);
			cmd.addParameter("@P_PRSN_CITY_OUT", NString.class);
			cmd.addParameter("@P_PRSN_DOMESTIC_IND_OUT", NString.class);
			cmd.addParameter("@P_PRSN_STATEPROVCODE_OUT", NString.class);
			cmd.addParameter("@P_PRSN_POSTALCODE_OUT", NString.class);
			cmd.addParameter("@P_PRSN_STATEPROVINCE_OUT", NString.class);
			cmd.addParameter("@P_PRSN_COUNTRYCODE_OUT", NString.class);
			cmd.addParameter("@P_PRSN_ATTENTIONLINE_OUT", NString.class);
			cmd.addParameter("@P_PRSN_ADDR_NOTEMESSAGE_OUT", NString.class);
			cmd.addParameter("@P_PRSN_COUNTRYPREFIXCODE_OUT", NString.class);
			cmd.addParameter("@P_PRSN_AREACITYCODE_OUT", NString.class);
			cmd.addParameter("@P_PRSN_PHONENUMBER_OUT", NString.class);
			cmd.addParameter("@P_PRSN_PHONENUMBEREXT_OUT", NString.class);
			cmd.addParameter("@P_PRSN_PHN_NOTEMESSAGE_OUT", NString.class);
			cmd.addParameter("@P_PRSN_EMAILADDRESS_OUT", NString.class);
			cmd.addParameter("@P_PRSN_EMAIL_NOTEMESSAGE_OUT", NString.class);
			cmd.addParameter("@P_PRSN_URLADDRESS_OUT", NString.class);
			cmd.addParameter("@P_PRSN_URL_NOTEMESSAGE_OUT", NString.class);
			cmd.addParameter("@P_PRSN_CONTACT_NOTEMESSAGE_OUT", NString.class);
			cmd.addParameter("@P_GENDERCODE_OUT", NString.class);
			cmd.addParameter("@P_GENDERCODE_NOTEMESSAGE_OUT", NString.class);
			cmd.addParameter("@P_RESD_STATEPROVINCE_OUT", NString.class);
			cmd.addParameter("@P_RESD_COUNTYCODE_OUT", NString.class);
			cmd.addParameter("@P_RESD_COUNTY_OUT", NString.class);
			cmd.addParameter("@P_RESD_COUNTRYCODE_OUT", NString.class);
			cmd.addParameter("@P_RESD_COUNTRY_OUT", NString.class);
			cmd.addParameter("@P_RESD_RESIDENCYSTATCODE_OUT", NString.class);
			cmd.addParameter("@P_RESD_NOTEMESSAGE_OUT", NString.class);
			cmd.addParameter("@P_DECEASEDINDICATOR_OUT", NString.class);
			cmd.addParameter("@P_DECEASED_NOTEMESSAGE_OUT", NString.class);
			cmd.addParameter("@P_PERSON_NOTEMESSAGE_OUT", NString.class);
				
			cmd.execute();
			pSchoolassignedpersonidOut.val = cmd.getParameterValue("@P_SCHOOLASSIGNEDPERSONID_OUT", NString.class);
			pSinOut.val = cmd.getParameterValue("@P_SIN_OUT", NString.class);
			pNsnOut.val = cmd.getParameterValue("@P_NSN_OUT", NString.class);
			pAgencyassignedidOut.val = cmd.getParameterValue("@P_AGENCYASSIGNEDID_OUT", NString.class);
			pRecipientassignedidOut.val = cmd.getParameterValue("@P_RECIPIENTASSIGNEDID_OUT", NString.class);
			pSsnOut.val = cmd.getParameterValue("@P_SSN_OUT", NString.class);
			pBirthdateOut.val = cmd.getParameterValue("@P_BIRTHDATE_OUT", NString.class);
			pBirthdayMmddOut.val = cmd.getParameterValue("@P_BIRTHDAY_MMDD_OUT", NString.class);
			pBirthNotemessageOut.val = cmd.getParameterValue("@P_BIRTH_NOTEMESSAGE_OUT", NString.class);
			pNameNameprefixOut.val = cmd.getParameterValue("@P_NAME_NAMEPREFIX_OUT", NString.class);
			pNameFirstnameOut.val = cmd.getParameterValue("@P_NAME_FIRSTNAME_OUT", NString.class);
			pNameMiddlenameOut.val = cmd.getParameterValue("@P_NAME_MIDDLENAME_OUT", NString.class);
			pNameLastnameOut.val = cmd.getParameterValue("@P_NAME_LASTNAME_OUT", NString.class);
			pNameNamesuffixOut.val = cmd.getParameterValue("@P_NAME_NAMESUFFIX_OUT", NString.class);
			pNameNametitleOut.val = cmd.getParameterValue("@P_NAME_NAMETITLE_OUT", NString.class);
			pNameCompositenameOut.val = cmd.getParameterValue("@P_NAME_COMPOSITENAME_OUT", NString.class);
			pNameNotemessageOut.val = cmd.getParameterValue("@P_NAME_NOTEMESSAGE_OUT", NString.class);
			pAltnameNameprefixOut.val = cmd.getParameterValue("@P_ALTNAME_NAMEPREFIX_OUT", NString.class);
			pAltnameFirstnameOut.val = cmd.getParameterValue("@P_ALTNAME_FIRSTNAME_OUT", NString.class);
			pAltnameMiddlenameOut.val = cmd.getParameterValue("@P_ALTNAME_MIDDLENAME_OUT", NString.class);
			pAltnameLastnameOut.val = cmd.getParameterValue("@P_ALTNAME_LASTNAME_OUT", NString.class);
			pAltnameNamesuffixOut.val = cmd.getParameterValue("@P_ALTNAME_NAMESUFFIX_OUT", NString.class);
			pAltnameNametitleOut.val = cmd.getParameterValue("@P_ALTNAME_NAMETITLE_OUT", NString.class);
			pAltnameCompositenameOut.val = cmd.getParameterValue("@P_ALTNAME_COMPOSITENAME_OUT", NString.class);
			pAltnameNotemessageOut.val = cmd.getParameterValue("@P_ALTNAME_NOTEMESSAGE_OUT", NString.class);
			pPersonHschOrgnameOut.val = cmd.getParameterValue("@P_PERSON_HSCH_ORGNAME_OUT", NString.class);
			pPrsnHschOrgidTypeOut.val = cmd.getParameterValue("@P_PRSN_HSCH_ORGID_TYPE_OUT", NString.class);
			pPrsnHschOrgidValueOut.val = cmd.getParameterValue("@P_PRSN_HSCH_ORGID_VALUE_OUT", NString.class);
			pPrsnAddressline1Out.val = cmd.getParameterValue("@P_PRSN_ADDRESSLINE1_OUT", NString.class);
			pPrsnAddressline2Out.val = cmd.getParameterValue("@P_PRSN_ADDRESSLINE2_OUT", NString.class);
			pPrsnAddressline3Out.val = cmd.getParameterValue("@P_PRSN_ADDRESSLINE3_OUT", NString.class);
			pPrsnCityOut.val = cmd.getParameterValue("@P_PRSN_CITY_OUT", NString.class);
			pPrsnDomesticIndOut.val = cmd.getParameterValue("@P_PRSN_DOMESTIC_IND_OUT", NString.class);
			pPrsnStateprovcodeOut.val = cmd.getParameterValue("@P_PRSN_STATEPROVCODE_OUT", NString.class);
			pPrsnPostalcodeOut.val = cmd.getParameterValue("@P_PRSN_POSTALCODE_OUT", NString.class);
			pPrsnStateprovinceOut.val = cmd.getParameterValue("@P_PRSN_STATEPROVINCE_OUT", NString.class);
			pPrsnCountrycodeOut.val = cmd.getParameterValue("@P_PRSN_COUNTRYCODE_OUT", NString.class);
			pPrsnAttentionlineOut.val = cmd.getParameterValue("@P_PRSN_ATTENTIONLINE_OUT", NString.class);
			pPrsnAddrNotemessageOut.val = cmd.getParameterValue("@P_PRSN_ADDR_NOTEMESSAGE_OUT", NString.class);
			pPrsnCountryprefixcodeOut.val = cmd.getParameterValue("@P_PRSN_COUNTRYPREFIXCODE_OUT", NString.class);
			pPrsnAreacitycodeOut.val = cmd.getParameterValue("@P_PRSN_AREACITYCODE_OUT", NString.class);
			pPrsnPhonenumberOut.val = cmd.getParameterValue("@P_PRSN_PHONENUMBER_OUT", NString.class);
			pPrsnPhonenumberextOut.val = cmd.getParameterValue("@P_PRSN_PHONENUMBEREXT_OUT", NString.class);
			pPrsnPhnNotemessageOut.val = cmd.getParameterValue("@P_PRSN_PHN_NOTEMESSAGE_OUT", NString.class);
			pPrsnEmailaddressOut.val = cmd.getParameterValue("@P_PRSN_EMAILADDRESS_OUT", NString.class);
			pPrsnEmailNotemessageOut.val = cmd.getParameterValue("@P_PRSN_EMAIL_NOTEMESSAGE_OUT", NString.class);
			pPrsnUrladdressOut.val = cmd.getParameterValue("@P_PRSN_URLADDRESS_OUT", NString.class);
			pPrsnUrlNotemessageOut.val = cmd.getParameterValue("@P_PRSN_URL_NOTEMESSAGE_OUT", NString.class);
			pPrsnContactNotemessageOut.val = cmd.getParameterValue("@P_PRSN_CONTACT_NOTEMESSAGE_OUT", NString.class);
			pGendercodeOut.val = cmd.getParameterValue("@P_GENDERCODE_OUT", NString.class);
			pGendercodeNotemessageOut.val = cmd.getParameterValue("@P_GENDERCODE_NOTEMESSAGE_OUT", NString.class);
			pResdStateprovinceOut.val = cmd.getParameterValue("@P_RESD_STATEPROVINCE_OUT", NString.class);
			pResdCountycodeOut.val = cmd.getParameterValue("@P_RESD_COUNTYCODE_OUT", NString.class);
			pResdCountyOut.val = cmd.getParameterValue("@P_RESD_COUNTY_OUT", NString.class);
			pResdCountrycodeOut.val = cmd.getParameterValue("@P_RESD_COUNTRYCODE_OUT", NString.class);
			pResdCountryOut.val = cmd.getParameterValue("@P_RESD_COUNTRY_OUT", NString.class);
			pResdResidencystatcodeOut.val = cmd.getParameterValue("@P_RESD_RESIDENCYSTATCODE_OUT", NString.class);
			pResdNotemessageOut.val = cmd.getParameterValue("@P_RESD_NOTEMESSAGE_OUT", NString.class);
			pDeceasedindicatorOut.val = cmd.getParameterValue("@P_DECEASEDINDICATOR_OUT", NString.class);
			pDeceasedNotemessageOut.val = cmd.getParameterValue("@P_DECEASED_NOTEMESSAGE_OUT", NString.class);
			pPersonNotemessageOut.val = cmd.getParameterValue("@P_PERSON_NOTEMESSAGE_OUT", NString.class);


		}
		
	
	
	
}
