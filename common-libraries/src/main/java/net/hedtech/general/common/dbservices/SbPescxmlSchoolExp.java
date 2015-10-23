package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SbPescxmlSchoolExp {
		public static void pAcrecSchoolElement(NNumber pRequestPidmIn,NNumber pRequestSeqNoIn,NString pRequestUserIn,NString pRequestTermIn,NString pRequestLevlIn,NString pRequestSbgiCodeIn,NString pRequesttableIn,Ref<NString> pAcrecSchoolOrgnameOut,Ref<NString> pAcrecSchoolOrgidTypeOut,Ref<NString> pAcrecSchoolOrgidValueOut,Ref<NString> pAcrecSchooloverridecdOut,Ref<NString> pAcrecSchoollevelOut,Ref<NString> pSchlAddressline1Out,Ref<NString> pSchlAddressline2Out,Ref<NString> pSchlAddressline3Out,Ref<NString> pSchlCityOut,Ref<NString> pSchlDomesticIndOut,Ref<NString> pSchlStateprovcodeOut,Ref<NString> pSchlPostalcodeOut,Ref<NString> pSchlStateprovinceOut,Ref<NString> pSchlCountrycodeOut,Ref<NString> pSchlAttentionlineOut,Ref<NString> pSchlAddrNotemessageOut,Ref<NString> pSchlCountryprefixcodeOut,Ref<NString> pSchlAreacitycodeOut,Ref<NString> pSchlPhonenumberOut,Ref<NString> pSchlPhonenumberextOut,Ref<NString> pSchlPhnNotemessageOut,Ref<NString> pSchlEmailaddressOut,Ref<NString> pSchlEmailNotemessageOut,Ref<NString> pSchlUrladdressOut,Ref<NString> pSchlUrlNotemessageOut,Ref<NString> pSchlContactNotemessageOut,Ref<NString> pAcrecSchlNotemessageOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_PESCXML_SCHOOL_EXP.P_ACREC_SCHOOL_ELEMENT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_REQUEST_PIDM_IN", pRequestPidmIn);
			cmd.addParameter("@P_REQUEST_SEQ_NO_IN", pRequestSeqNoIn);
			cmd.addParameter("@P_REQUEST_USER_IN", pRequestUserIn);
			cmd.addParameter("@P_REQUEST_TERM_IN", pRequestTermIn);
			cmd.addParameter("@P_REQUEST_LEVL_IN", pRequestLevlIn);
			cmd.addParameter("@P_REQUEST_SBGI_CODE_IN", pRequestSbgiCodeIn);
			cmd.addParameter("@P_REQUESTTABLE_IN", pRequesttableIn);
			cmd.addParameter("@P_ACREC_SCHOOL_ORGNAME_OUT", NString.class);
			cmd.addParameter("@P_ACREC_SCHOOL_ORGID_TYPE_OUT", NString.class);
			cmd.addParameter("@P_ACREC_SCHOOL_ORGID_VALUE_OUT", NString.class);
			cmd.addParameter("@P_ACREC_SCHOOLOVERRIDECD_OUT", NString.class);
			cmd.addParameter("@P_ACREC_SCHOOLLEVEL_OUT", NString.class);
			cmd.addParameter("@P_SCHL_ADDRESSLINE1_OUT", NString.class);
			cmd.addParameter("@P_SCHL_ADDRESSLINE2_OUT", NString.class);
			cmd.addParameter("@P_SCHL_ADDRESSLINE3_OUT", NString.class);
			cmd.addParameter("@P_SCHL_CITY_OUT", NString.class);
			cmd.addParameter("@P_SCHL_DOMESTIC_IND_OUT", NString.class);
			cmd.addParameter("@P_SCHL_STATEPROVCODE_OUT", NString.class);
			cmd.addParameter("@P_SCHL_POSTALCODE_OUT", NString.class);
			cmd.addParameter("@P_SCHL_STATEPROVINCE_OUT", NString.class);
			cmd.addParameter("@P_SCHL_COUNTRYCODE_OUT", NString.class);
			cmd.addParameter("@P_SCHL_ATTENTIONLINE_OUT", NString.class);
			cmd.addParameter("@P_SCHL_ADDR_NOTEMESSAGE_OUT", NString.class);
			cmd.addParameter("@P_SCHL_COUNTRYPREFIXCODE_OUT", NString.class);
			cmd.addParameter("@P_SCHL_AREACITYCODE_OUT", NString.class);
			cmd.addParameter("@P_SCHL_PHONENUMBER_OUT", NString.class);
			cmd.addParameter("@P_SCHL_PHONENUMBEREXT_OUT", NString.class);
			cmd.addParameter("@P_SCHL_PHN_NOTEMESSAGE_OUT", NString.class);
			cmd.addParameter("@P_SCHL_EMAILADDRESS_OUT", NString.class);
			cmd.addParameter("@P_SCHL_EMAIL_NOTEMESSAGE_OUT", NString.class);
			cmd.addParameter("@P_SCHL_URLADDRESS_OUT", NString.class);
			cmd.addParameter("@P_SCHL_URL_NOTEMESSAGE_OUT", NString.class);
			cmd.addParameter("@P_SCHL_CONTACT_NOTEMESSAGE_OUT", NString.class);
			cmd.addParameter("@P_ACREC_SCHL_NOTEMESSAGE_OUT", NString.class);
				
			cmd.execute();
			pAcrecSchoolOrgnameOut.val = cmd.getParameterValue("@P_ACREC_SCHOOL_ORGNAME_OUT", NString.class);
			pAcrecSchoolOrgidTypeOut.val = cmd.getParameterValue("@P_ACREC_SCHOOL_ORGID_TYPE_OUT", NString.class);
			pAcrecSchoolOrgidValueOut.val = cmd.getParameterValue("@P_ACREC_SCHOOL_ORGID_VALUE_OUT", NString.class);
			pAcrecSchooloverridecdOut.val = cmd.getParameterValue("@P_ACREC_SCHOOLOVERRIDECD_OUT", NString.class);
			pAcrecSchoollevelOut.val = cmd.getParameterValue("@P_ACREC_SCHOOLLEVEL_OUT", NString.class);
			pSchlAddressline1Out.val = cmd.getParameterValue("@P_SCHL_ADDRESSLINE1_OUT", NString.class);
			pSchlAddressline2Out.val = cmd.getParameterValue("@P_SCHL_ADDRESSLINE2_OUT", NString.class);
			pSchlAddressline3Out.val = cmd.getParameterValue("@P_SCHL_ADDRESSLINE3_OUT", NString.class);
			pSchlCityOut.val = cmd.getParameterValue("@P_SCHL_CITY_OUT", NString.class);
			pSchlDomesticIndOut.val = cmd.getParameterValue("@P_SCHL_DOMESTIC_IND_OUT", NString.class);
			pSchlStateprovcodeOut.val = cmd.getParameterValue("@P_SCHL_STATEPROVCODE_OUT", NString.class);
			pSchlPostalcodeOut.val = cmd.getParameterValue("@P_SCHL_POSTALCODE_OUT", NString.class);
			pSchlStateprovinceOut.val = cmd.getParameterValue("@P_SCHL_STATEPROVINCE_OUT", NString.class);
			pSchlCountrycodeOut.val = cmd.getParameterValue("@P_SCHL_COUNTRYCODE_OUT", NString.class);
			pSchlAttentionlineOut.val = cmd.getParameterValue("@P_SCHL_ATTENTIONLINE_OUT", NString.class);
			pSchlAddrNotemessageOut.val = cmd.getParameterValue("@P_SCHL_ADDR_NOTEMESSAGE_OUT", NString.class);
			pSchlCountryprefixcodeOut.val = cmd.getParameterValue("@P_SCHL_COUNTRYPREFIXCODE_OUT", NString.class);
			pSchlAreacitycodeOut.val = cmd.getParameterValue("@P_SCHL_AREACITYCODE_OUT", NString.class);
			pSchlPhonenumberOut.val = cmd.getParameterValue("@P_SCHL_PHONENUMBER_OUT", NString.class);
			pSchlPhonenumberextOut.val = cmd.getParameterValue("@P_SCHL_PHONENUMBEREXT_OUT", NString.class);
			pSchlPhnNotemessageOut.val = cmd.getParameterValue("@P_SCHL_PHN_NOTEMESSAGE_OUT", NString.class);
			pSchlEmailaddressOut.val = cmd.getParameterValue("@P_SCHL_EMAILADDRESS_OUT", NString.class);
			pSchlEmailNotemessageOut.val = cmd.getParameterValue("@P_SCHL_EMAIL_NOTEMESSAGE_OUT", NString.class);
			pSchlUrladdressOut.val = cmd.getParameterValue("@P_SCHL_URLADDRESS_OUT", NString.class);
			pSchlUrlNotemessageOut.val = cmd.getParameterValue("@P_SCHL_URL_NOTEMESSAGE_OUT", NString.class);
			pSchlContactNotemessageOut.val = cmd.getParameterValue("@P_SCHL_CONTACT_NOTEMESSAGE_OUT", NString.class);
			pAcrecSchlNotemessageOut.val = cmd.getParameterValue("@P_ACREC_SCHL_NOTEMESSAGE_OUT", NString.class);


		}
		
		public static void pAcrecTransSchoolElement(NNumber pRequestPidmIn,NNumber pRequestSeqNoIn,NString pRequestUserIn,NString pRequestTermIn,NString pRequestLevlIn,NString pRequestSbgiCodeIn,NString pRequesttableIn,NNumber pTritSeqNoIn,Ref<NString> pAcrecSchoolOrgnameOut,Ref<NString> pAcrecSchoolOrgidTypeOut,Ref<NString> pAcrecSchoolOrgidValueOut,Ref<NString> pAcrecSchooloverridecdOut,Ref<NString> pAcrecSchoollevelOut,Ref<NString> pSchlAddressline1Out,Ref<NString> pSchlAddressline2Out,Ref<NString> pSchlAddressline3Out,Ref<NString> pSchlCityOut,Ref<NString> pSchlDomesticIndOut,Ref<NString> pSchlStateprovcodeOut,Ref<NString> pSchlPostalcodeOut,Ref<NString> pSchlStateprovinceOut,Ref<NString> pSchlCountrycodeOut,Ref<NString> pSchlAttentionlineOut,Ref<NString> pSchlAddrNotemessageOut,Ref<NString> pSchlCountryprefixcodeOut,Ref<NString> pSchlAreacitycodeOut,Ref<NString> pSchlPhonenumberOut,Ref<NString> pSchlPhonenumberextOut,Ref<NString> pSchlPhnNotemessageOut,Ref<NString> pSchlEmailaddressOut,Ref<NString> pSchlEmailNotemessageOut,Ref<NString> pSchlUrladdressOut,Ref<NString> pSchlUrlNotemessageOut,Ref<NString> pSchlContactNotemessageOut,Ref<NString> pAcrecSchlNotemessageOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_PESCXML_SCHOOL_EXP.P_ACREC_TRANS_SCHOOL_ELEMENT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_REQUEST_PIDM_IN", pRequestPidmIn);
			cmd.addParameter("@P_REQUEST_SEQ_NO_IN", pRequestSeqNoIn);
			cmd.addParameter("@P_REQUEST_USER_IN", pRequestUserIn);
			cmd.addParameter("@P_REQUEST_TERM_IN", pRequestTermIn);
			cmd.addParameter("@P_REQUEST_LEVL_IN", pRequestLevlIn);
			cmd.addParameter("@P_REQUEST_SBGI_CODE_IN", pRequestSbgiCodeIn);
			cmd.addParameter("@P_REQUESTTABLE_IN", pRequesttableIn);
			cmd.addParameter("@P_TRIT_SEQ_NO_IN", pTritSeqNoIn);
			cmd.addParameter("@P_ACREC_SCHOOL_ORGNAME_OUT", NString.class);
			cmd.addParameter("@P_ACREC_SCHOOL_ORGID_TYPE_OUT", NString.class);
			cmd.addParameter("@P_ACREC_SCHOOL_ORGID_VALUE_OUT", NString.class);
			cmd.addParameter("@P_ACREC_SCHOOLOVERRIDECD_OUT", NString.class);
			cmd.addParameter("@P_ACREC_SCHOOLLEVEL_OUT", NString.class);
			cmd.addParameter("@P_SCHL_ADDRESSLINE1_OUT", NString.class);
			cmd.addParameter("@P_SCHL_ADDRESSLINE2_OUT", NString.class);
			cmd.addParameter("@P_SCHL_ADDRESSLINE3_OUT", NString.class);
			cmd.addParameter("@P_SCHL_CITY_OUT", NString.class);
			cmd.addParameter("@P_SCHL_DOMESTIC_IND_OUT", NString.class);
			cmd.addParameter("@P_SCHL_STATEPROVCODE_OUT", NString.class);
			cmd.addParameter("@P_SCHL_POSTALCODE_OUT", NString.class);
			cmd.addParameter("@P_SCHL_STATEPROVINCE_OUT", NString.class);
			cmd.addParameter("@P_SCHL_COUNTRYCODE_OUT", NString.class);
			cmd.addParameter("@P_SCHL_ATTENTIONLINE_OUT", NString.class);
			cmd.addParameter("@P_SCHL_ADDR_NOTEMESSAGE_OUT", NString.class);
			cmd.addParameter("@P_SCHL_COUNTRYPREFIXCODE_OUT", NString.class);
			cmd.addParameter("@P_SCHL_AREACITYCODE_OUT", NString.class);
			cmd.addParameter("@P_SCHL_PHONENUMBER_OUT", NString.class);
			cmd.addParameter("@P_SCHL_PHONENUMBEREXT_OUT", NString.class);
			cmd.addParameter("@P_SCHL_PHN_NOTEMESSAGE_OUT", NString.class);
			cmd.addParameter("@P_SCHL_EMAILADDRESS_OUT", NString.class);
			cmd.addParameter("@P_SCHL_EMAIL_NOTEMESSAGE_OUT", NString.class);
			cmd.addParameter("@P_SCHL_URLADDRESS_OUT", NString.class);
			cmd.addParameter("@P_SCHL_URL_NOTEMESSAGE_OUT", NString.class);
			cmd.addParameter("@P_SCHL_CONTACT_NOTEMESSAGE_OUT", NString.class);
			cmd.addParameter("@P_ACREC_SCHL_NOTEMESSAGE_OUT", NString.class);
				
			cmd.execute();
			pAcrecSchoolOrgnameOut.val = cmd.getParameterValue("@P_ACREC_SCHOOL_ORGNAME_OUT", NString.class);
			pAcrecSchoolOrgidTypeOut.val = cmd.getParameterValue("@P_ACREC_SCHOOL_ORGID_TYPE_OUT", NString.class);
			pAcrecSchoolOrgidValueOut.val = cmd.getParameterValue("@P_ACREC_SCHOOL_ORGID_VALUE_OUT", NString.class);
			pAcrecSchooloverridecdOut.val = cmd.getParameterValue("@P_ACREC_SCHOOLOVERRIDECD_OUT", NString.class);
			pAcrecSchoollevelOut.val = cmd.getParameterValue("@P_ACREC_SCHOOLLEVEL_OUT", NString.class);
			pSchlAddressline1Out.val = cmd.getParameterValue("@P_SCHL_ADDRESSLINE1_OUT", NString.class);
			pSchlAddressline2Out.val = cmd.getParameterValue("@P_SCHL_ADDRESSLINE2_OUT", NString.class);
			pSchlAddressline3Out.val = cmd.getParameterValue("@P_SCHL_ADDRESSLINE3_OUT", NString.class);
			pSchlCityOut.val = cmd.getParameterValue("@P_SCHL_CITY_OUT", NString.class);
			pSchlDomesticIndOut.val = cmd.getParameterValue("@P_SCHL_DOMESTIC_IND_OUT", NString.class);
			pSchlStateprovcodeOut.val = cmd.getParameterValue("@P_SCHL_STATEPROVCODE_OUT", NString.class);
			pSchlPostalcodeOut.val = cmd.getParameterValue("@P_SCHL_POSTALCODE_OUT", NString.class);
			pSchlStateprovinceOut.val = cmd.getParameterValue("@P_SCHL_STATEPROVINCE_OUT", NString.class);
			pSchlCountrycodeOut.val = cmd.getParameterValue("@P_SCHL_COUNTRYCODE_OUT", NString.class);
			pSchlAttentionlineOut.val = cmd.getParameterValue("@P_SCHL_ATTENTIONLINE_OUT", NString.class);
			pSchlAddrNotemessageOut.val = cmd.getParameterValue("@P_SCHL_ADDR_NOTEMESSAGE_OUT", NString.class);
			pSchlCountryprefixcodeOut.val = cmd.getParameterValue("@P_SCHL_COUNTRYPREFIXCODE_OUT", NString.class);
			pSchlAreacitycodeOut.val = cmd.getParameterValue("@P_SCHL_AREACITYCODE_OUT", NString.class);
			pSchlPhonenumberOut.val = cmd.getParameterValue("@P_SCHL_PHONENUMBER_OUT", NString.class);
			pSchlPhonenumberextOut.val = cmd.getParameterValue("@P_SCHL_PHONENUMBEREXT_OUT", NString.class);
			pSchlPhnNotemessageOut.val = cmd.getParameterValue("@P_SCHL_PHN_NOTEMESSAGE_OUT", NString.class);
			pSchlEmailaddressOut.val = cmd.getParameterValue("@P_SCHL_EMAILADDRESS_OUT", NString.class);
			pSchlEmailNotemessageOut.val = cmd.getParameterValue("@P_SCHL_EMAIL_NOTEMESSAGE_OUT", NString.class);
			pSchlUrladdressOut.val = cmd.getParameterValue("@P_SCHL_URLADDRESS_OUT", NString.class);
			pSchlUrlNotemessageOut.val = cmd.getParameterValue("@P_SCHL_URL_NOTEMESSAGE_OUT", NString.class);
			pSchlContactNotemessageOut.val = cmd.getParameterValue("@P_SCHL_CONTACT_NOTEMESSAGE_OUT", NString.class);
			pAcrecSchlNotemessageOut.val = cmd.getParameterValue("@P_ACREC_SCHL_NOTEMESSAGE_OUT", NString.class);


		}
		
	
	
	
}
