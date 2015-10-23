package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SbPescxmlTrandataExp {
		public static NString fGetEnddate(NString pTermIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_PESCXML_TRANDATA_EXP.F_GET_ENDDATE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_TERM_IN", pTermIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetStartdate(NString pTermIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_PESCXML_TRANDATA_EXP.F_GET_STARTDATE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_TERM_IN", pTermIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pSourceElement(Ref<NString> pSourceOrgIdTypeOut,Ref<NString> pSourceOrgIdValueOut,Ref<NString> pSrceOrganizationnameOut,Ref<NString> pSrceAddressline1Out,Ref<NString> pSrceAddressline2Out,Ref<NString> pSrceAddressline3Out,Ref<NString> pSrceCityOut,Ref<NString> pSrceDomesticIndOut,Ref<NString> pSrceStateprovincecodeOut,Ref<NString> pSrcePostalcodeOut,Ref<NString> pSrceStateprovinceOut,Ref<NString> pSrceCountrycodeOut,Ref<NString> pSrceAttentionlineOut,Ref<NString> pSrceAddrNotemessageOut,Ref<NString> pSrceCountryprefixcodeOut,Ref<NString> pSrceAreacitycodeOut,Ref<NString> pSrcePhonenumberOut,Ref<NString> pSrcePhonenumberextOut,Ref<NString> pSrcePhoneNotemessageOut,Ref<NString> pSrceEmailaddressOut,Ref<NString> pSrceEmailNotemessageOut,Ref<NString> pSrceUrladdress,Ref<NString> pSrceUrlNotemessageOut,Ref<NString> pSrceContctNotemessageOut,Ref<NString> pSrceOrgNotemessageOut,Ref<NString> pSrceNotemessageOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_PESCXML_TRANDATA_EXP.P_SOURCE_ELEMENT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SOURCE_ORG_ID_TYPE_OUT", NString.class);
			cmd.addParameter("@P_SOURCE_ORG_ID_VALUE_OUT", NString.class);
			cmd.addParameter("@P_SRCE_ORGANIZATIONNAME_OUT", NString.class);
			cmd.addParameter("@P_SRCE_ADDRESSLINE1_OUT", NString.class);
			cmd.addParameter("@P_SRCE_ADDRESSLINE2_OUT", NString.class);
			cmd.addParameter("@P_SRCE_ADDRESSLINE3_OUT", NString.class);
			cmd.addParameter("@P_SRCE_CITY_OUT", NString.class);
			cmd.addParameter("@P_SRCE_DOMESTIC_IND_OUT", NString.class);
			cmd.addParameter("@P_SRCE_STATEPROVINCECODE_OUT", NString.class);
			cmd.addParameter("@P_SRCE_POSTALCODE_OUT", NString.class);
			cmd.addParameter("@P_SRCE_STATEPROVINCE_OUT", NString.class);
			cmd.addParameter("@P_SRCE_COUNTRYCODE_OUT", NString.class);
			cmd.addParameter("@P_SRCE_ATTENTIONLINE_OUT", NString.class);
			cmd.addParameter("@P_SRCE_ADDR_NOTEMESSAGE_OUT", NString.class);
			cmd.addParameter("@P_SRCE_COUNTRYPREFIXCODE_OUT", NString.class);
			cmd.addParameter("@P_SRCE_AREACITYCODE_OUT", NString.class);
			cmd.addParameter("@P_SRCE_PHONENUMBER_OUT", NString.class);
			cmd.addParameter("@P_SRCE_PHONENUMBEREXT_OUT", NString.class);
			cmd.addParameter("@P_SRCE_PHONE_NOTEMESSAGE_OUT", NString.class);
			cmd.addParameter("@P_SRCE_EMAILADDRESS_OUT", NString.class);
			cmd.addParameter("@P_SRCE_EMAIL_NOTEMESSAGE_OUT", NString.class);
			cmd.addParameter("@P_SRCE_URLADDRESS", NString.class);
			cmd.addParameter("@P_SRCE_URL_NOTEMESSAGE_OUT", NString.class);
			cmd.addParameter("@P_SRCE_CONTCT_NOTEMESSAGE_OUT", NString.class);
			cmd.addParameter("@P_SRCE_ORG_NOTEMESSAGE_OUT", NString.class);
			cmd.addParameter("@P_SRCE_NOTEMESSAGE_OUT", NString.class);
				
			cmd.execute();
			pSourceOrgIdTypeOut.val = cmd.getParameterValue("@P_SOURCE_ORG_ID_TYPE_OUT", NString.class);
			pSourceOrgIdValueOut.val = cmd.getParameterValue("@P_SOURCE_ORG_ID_VALUE_OUT", NString.class);
			pSrceOrganizationnameOut.val = cmd.getParameterValue("@P_SRCE_ORGANIZATIONNAME_OUT", NString.class);
			pSrceAddressline1Out.val = cmd.getParameterValue("@P_SRCE_ADDRESSLINE1_OUT", NString.class);
			pSrceAddressline2Out.val = cmd.getParameterValue("@P_SRCE_ADDRESSLINE2_OUT", NString.class);
			pSrceAddressline3Out.val = cmd.getParameterValue("@P_SRCE_ADDRESSLINE3_OUT", NString.class);
			pSrceCityOut.val = cmd.getParameterValue("@P_SRCE_CITY_OUT", NString.class);
			pSrceDomesticIndOut.val = cmd.getParameterValue("@P_SRCE_DOMESTIC_IND_OUT", NString.class);
			pSrceStateprovincecodeOut.val = cmd.getParameterValue("@P_SRCE_STATEPROVINCECODE_OUT", NString.class);
			pSrcePostalcodeOut.val = cmd.getParameterValue("@P_SRCE_POSTALCODE_OUT", NString.class);
			pSrceStateprovinceOut.val = cmd.getParameterValue("@P_SRCE_STATEPROVINCE_OUT", NString.class);
			pSrceCountrycodeOut.val = cmd.getParameterValue("@P_SRCE_COUNTRYCODE_OUT", NString.class);
			pSrceAttentionlineOut.val = cmd.getParameterValue("@P_SRCE_ATTENTIONLINE_OUT", NString.class);
			pSrceAddrNotemessageOut.val = cmd.getParameterValue("@P_SRCE_ADDR_NOTEMESSAGE_OUT", NString.class);
			pSrceCountryprefixcodeOut.val = cmd.getParameterValue("@P_SRCE_COUNTRYPREFIXCODE_OUT", NString.class);
			pSrceAreacitycodeOut.val = cmd.getParameterValue("@P_SRCE_AREACITYCODE_OUT", NString.class);
			pSrcePhonenumberOut.val = cmd.getParameterValue("@P_SRCE_PHONENUMBER_OUT", NString.class);
			pSrcePhonenumberextOut.val = cmd.getParameterValue("@P_SRCE_PHONENUMBEREXT_OUT", NString.class);
			pSrcePhoneNotemessageOut.val = cmd.getParameterValue("@P_SRCE_PHONE_NOTEMESSAGE_OUT", NString.class);
			pSrceEmailaddressOut.val = cmd.getParameterValue("@P_SRCE_EMAILADDRESS_OUT", NString.class);
			pSrceEmailNotemessageOut.val = cmd.getParameterValue("@P_SRCE_EMAIL_NOTEMESSAGE_OUT", NString.class);
			pSrceUrladdress.val = cmd.getParameterValue("@P_SRCE_URLADDRESS", NString.class);
			pSrceUrlNotemessageOut.val = cmd.getParameterValue("@P_SRCE_URL_NOTEMESSAGE_OUT", NString.class);
			pSrceContctNotemessageOut.val = cmd.getParameterValue("@P_SRCE_CONTCT_NOTEMESSAGE_OUT", NString.class);
			pSrceOrgNotemessageOut.val = cmd.getParameterValue("@P_SRCE_ORG_NOTEMESSAGE_OUT", NString.class);
			pSrceNotemessageOut.val = cmd.getParameterValue("@P_SRCE_NOTEMESSAGE_OUT", NString.class);


		}
		
		public static void pTransmitElement(NNumber pRequestPidmIn,NNumber pRequestSeqNoIn,NString pRequestUserIn,NString pRequestTermIn,NString pRequestLevlIn,NString pRequestSbgiCodeIn,NString pRequesttableIn,Ref<NString> pDocumentidOut,Ref<NString> pCreateddatetimeOut,Ref<NString> pTransmissiontypeOut,Ref<NString> pDocumenttypeOut,Ref<NString> pSourceOrgIdTypeOut,Ref<NString> pSourceOrgIdValueOut,Ref<NString> pSrceOrganizationnameOut,Ref<NString> pSrceAddressline1Out,Ref<NString> pSrceAddressline2Out,Ref<NString> pSrceAddressline3Out,Ref<NString> pSrceCityOut,Ref<NString> pSrceDomesticIndOut,Ref<NString> pSrceStateprovincecodeOut,Ref<NString> pSrcePostalcodeOut,Ref<NString> pSrceStateprovinceOut,Ref<NString> pSrceCountrycodeOut,Ref<NString> pSrceAttentionlineOut,Ref<NString> pSrceAddrNotemessageOut,Ref<NString> pSrceCountryprefixcodeOut,Ref<NString> pSrceAreacitycodeOut,Ref<NString> pSrcePhonenumberOut,Ref<NString> pSrcePhonenumberextOut,Ref<NString> pSrcePhoneNotemessageOut,Ref<NString> pSrceEmailaddressOut,Ref<NString> pSrceEmailNotemessageOut,Ref<NString> pSrceUrladdress,Ref<NString> pSrceUrlNotemessageOut,Ref<NString> pSrceContctNotemessageOut,Ref<NString> pSrceOrgNotemessageOut,Ref<NString> pSrceNotemessageOut,Ref<NString> pDestOrgIdTypeOut,Ref<NString> pDestOrgIdValueOut,Ref<NString> pDestOrganizationnameOut,Ref<NString> pDestAddressline1Out,Ref<NString> pDestAddressline2Out,Ref<NString> pDestAddressline3Out,Ref<NString> pDestCityOut,Ref<NString> pDestDomesticIndOut,Ref<NString> pDestStateprovincecodeOut,Ref<NString> pDestPostalcodeOut,Ref<NString> pDestStateprovinceOut,Ref<NString> pDestCountrycodeOut,Ref<NString> pDestAttentionlineOut,Ref<NString> pDestAddrNotemessageOut,Ref<NString> pDestCountryprefixcodeOut,Ref<NString> pDestAreacitycodeOut,Ref<NString> pDestPhonenumberOut,Ref<NString> pDestPhonenumberextOut,Ref<NString> pDestPhoneNotemessageOut,Ref<NString> pDestEmailaddressOut,Ref<NString> pDestEmailNotemessageOut,Ref<NString> pDestUrladdressOut,Ref<NString> pDestUrlNotemessageOut,Ref<NString> pDestContctNotemessageOut,Ref<NString> pDestOrgNotemessageOut,Ref<NString> pDestNotemessageOut,Ref<NString> pDocumentprocesscodeOut,Ref<NString> pDocumentofficialcodeOut,Ref<NString> pDocumentcompletecodeOut,Ref<NString> pRequesttrackingidOut,Ref<NString> pNotemessageOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_PESCXML_TRANDATA_EXP.P_TRANSMIT_ELEMENT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_REQUEST_PIDM_IN", pRequestPidmIn);
			cmd.addParameter("@P_REQUEST_SEQ_NO_IN", pRequestSeqNoIn);
			cmd.addParameter("@P_REQUEST_USER_IN", pRequestUserIn);
			cmd.addParameter("@P_REQUEST_TERM_IN", pRequestTermIn);
			cmd.addParameter("@P_REQUEST_LEVL_IN", pRequestLevlIn);
			cmd.addParameter("@P_REQUEST_SBGI_CODE_IN", pRequestSbgiCodeIn);
			cmd.addParameter("@P_REQUESTTABLE_IN", pRequesttableIn);
			cmd.addParameter("@P_DOCUMENTID_OUT", NString.class);
			cmd.addParameter("@P_CREATEDDATETIME_OUT", NString.class);
			cmd.addParameter("@P_TRANSMISSIONTYPE_OUT", NString.class);
			cmd.addParameter("@P_DOCUMENTTYPE_OUT", NString.class);
			cmd.addParameter("@P_SOURCE_ORG_ID_TYPE_OUT", NString.class);
			cmd.addParameter("@P_SOURCE_ORG_ID_VALUE_OUT", NString.class);
			cmd.addParameter("@P_SRCE_ORGANIZATIONNAME_OUT", NString.class);
			cmd.addParameter("@P_SRCE_ADDRESSLINE1_OUT", NString.class);
			cmd.addParameter("@P_SRCE_ADDRESSLINE2_OUT", NString.class);
			cmd.addParameter("@P_SRCE_ADDRESSLINE3_OUT", NString.class);
			cmd.addParameter("@P_SRCE_CITY_OUT", NString.class);
			cmd.addParameter("@P_SRCE_DOMESTIC_IND_OUT", NString.class);
			cmd.addParameter("@P_SRCE_STATEPROVINCECODE_OUT", NString.class);
			cmd.addParameter("@P_SRCE_POSTALCODE_OUT", NString.class);
			cmd.addParameter("@P_SRCE_STATEPROVINCE_OUT", NString.class);
			cmd.addParameter("@P_SRCE_COUNTRYCODE_OUT", NString.class);
			cmd.addParameter("@P_SRCE_ATTENTIONLINE_OUT", NString.class);
			cmd.addParameter("@P_SRCE_ADDR_NOTEMESSAGE_OUT", NString.class);
			cmd.addParameter("@P_SRCE_COUNTRYPREFIXCODE_OUT", NString.class);
			cmd.addParameter("@P_SRCE_AREACITYCODE_OUT", NString.class);
			cmd.addParameter("@P_SRCE_PHONENUMBER_OUT", NString.class);
			cmd.addParameter("@P_SRCE_PHONENUMBEREXT_OUT", NString.class);
			cmd.addParameter("@P_SRCE_PHONE_NOTEMESSAGE_OUT", NString.class);
			cmd.addParameter("@P_SRCE_EMAILADDRESS_OUT", NString.class);
			cmd.addParameter("@P_SRCE_EMAIL_NOTEMESSAGE_OUT", NString.class);
			cmd.addParameter("@P_SRCE_URLADDRESS", NString.class);
			cmd.addParameter("@P_SRCE_URL_NOTEMESSAGE_OUT", NString.class);
			cmd.addParameter("@P_SRCE_CONTCT_NOTEMESSAGE_OUT", NString.class);
			cmd.addParameter("@P_SRCE_ORG_NOTEMESSAGE_OUT", NString.class);
			cmd.addParameter("@P_SRCE_NOTEMESSAGE_OUT", NString.class);
			cmd.addParameter("@P_DEST_ORG_ID_TYPE_OUT", NString.class);
			cmd.addParameter("@P_DEST_ORG_ID_VALUE_OUT", NString.class);
			cmd.addParameter("@P_DEST_ORGANIZATIONNAME_OUT", NString.class);
			cmd.addParameter("@P_DEST_ADDRESSLINE1_OUT", NString.class);
			cmd.addParameter("@P_DEST_ADDRESSLINE2_OUT", NString.class);
			cmd.addParameter("@P_DEST_ADDRESSLINE3_OUT", NString.class);
			cmd.addParameter("@P_DEST_CITY_OUT", NString.class);
			cmd.addParameter("@P_DEST_DOMESTIC_IND_OUT", NString.class);
			cmd.addParameter("@P_DEST_STATEPROVINCECODE_OUT", NString.class);
			cmd.addParameter("@P_DEST_POSTALCODE_OUT", NString.class);
			cmd.addParameter("@P_DEST_STATEPROVINCE_OUT", NString.class);
			cmd.addParameter("@P_DEST_COUNTRYCODE_OUT", NString.class);
			cmd.addParameter("@P_DEST_ATTENTIONLINE_OUT", NString.class);
			cmd.addParameter("@P_DEST_ADDR_NOTEMESSAGE_OUT", NString.class);
			cmd.addParameter("@P_DEST_COUNTRYPREFIXCODE_OUT", NString.class);
			cmd.addParameter("@P_DEST_AREACITYCODE_OUT", NString.class);
			cmd.addParameter("@P_DEST_PHONENUMBER_OUT", NString.class);
			cmd.addParameter("@P_DEST_PHONENUMBEREXT_OUT", NString.class);
			cmd.addParameter("@P_DEST_PHONE_NOTEMESSAGE_OUT", NString.class);
			cmd.addParameter("@P_DEST_EMAILADDRESS_OUT", NString.class);
			cmd.addParameter("@P_DEST_EMAIL_NOTEMESSAGE_OUT", NString.class);
			cmd.addParameter("@P_DEST_URLADDRESS_OUT", NString.class);
			cmd.addParameter("@P_DEST_URL_NOTEMESSAGE_OUT", NString.class);
			cmd.addParameter("@P_DEST_CONTCT_NOTEMESSAGE_OUT", NString.class);
			cmd.addParameter("@P_DEST_ORG_NOTEMESSAGE_OUT", NString.class);
			cmd.addParameter("@P_DEST_NOTEMESSAGE_OUT", NString.class);
			cmd.addParameter("@P_DOCUMENTPROCESSCODE_OUT", NString.class);
			cmd.addParameter("@P_DOCUMENTOFFICIALCODE_OUT", NString.class);
			cmd.addParameter("@P_DOCUMENTCOMPLETECODE_OUT", NString.class);
			cmd.addParameter("@P_REQUESTTRACKINGID_OUT", NString.class);
			cmd.addParameter("@P_NOTEMESSAGE_OUT", NString.class);
				
			cmd.execute();
			pDocumentidOut.val = cmd.getParameterValue("@P_DOCUMENTID_OUT", NString.class);
			pCreateddatetimeOut.val = cmd.getParameterValue("@P_CREATEDDATETIME_OUT", NString.class);
			pTransmissiontypeOut.val = cmd.getParameterValue("@P_TRANSMISSIONTYPE_OUT", NString.class);
			pDocumenttypeOut.val = cmd.getParameterValue("@P_DOCUMENTTYPE_OUT", NString.class);
			pSourceOrgIdTypeOut.val = cmd.getParameterValue("@P_SOURCE_ORG_ID_TYPE_OUT", NString.class);
			pSourceOrgIdValueOut.val = cmd.getParameterValue("@P_SOURCE_ORG_ID_VALUE_OUT", NString.class);
			pSrceOrganizationnameOut.val = cmd.getParameterValue("@P_SRCE_ORGANIZATIONNAME_OUT", NString.class);
			pSrceAddressline1Out.val = cmd.getParameterValue("@P_SRCE_ADDRESSLINE1_OUT", NString.class);
			pSrceAddressline2Out.val = cmd.getParameterValue("@P_SRCE_ADDRESSLINE2_OUT", NString.class);
			pSrceAddressline3Out.val = cmd.getParameterValue("@P_SRCE_ADDRESSLINE3_OUT", NString.class);
			pSrceCityOut.val = cmd.getParameterValue("@P_SRCE_CITY_OUT", NString.class);
			pSrceDomesticIndOut.val = cmd.getParameterValue("@P_SRCE_DOMESTIC_IND_OUT", NString.class);
			pSrceStateprovincecodeOut.val = cmd.getParameterValue("@P_SRCE_STATEPROVINCECODE_OUT", NString.class);
			pSrcePostalcodeOut.val = cmd.getParameterValue("@P_SRCE_POSTALCODE_OUT", NString.class);
			pSrceStateprovinceOut.val = cmd.getParameterValue("@P_SRCE_STATEPROVINCE_OUT", NString.class);
			pSrceCountrycodeOut.val = cmd.getParameterValue("@P_SRCE_COUNTRYCODE_OUT", NString.class);
			pSrceAttentionlineOut.val = cmd.getParameterValue("@P_SRCE_ATTENTIONLINE_OUT", NString.class);
			pSrceAddrNotemessageOut.val = cmd.getParameterValue("@P_SRCE_ADDR_NOTEMESSAGE_OUT", NString.class);
			pSrceCountryprefixcodeOut.val = cmd.getParameterValue("@P_SRCE_COUNTRYPREFIXCODE_OUT", NString.class);
			pSrceAreacitycodeOut.val = cmd.getParameterValue("@P_SRCE_AREACITYCODE_OUT", NString.class);
			pSrcePhonenumberOut.val = cmd.getParameterValue("@P_SRCE_PHONENUMBER_OUT", NString.class);
			pSrcePhonenumberextOut.val = cmd.getParameterValue("@P_SRCE_PHONENUMBEREXT_OUT", NString.class);
			pSrcePhoneNotemessageOut.val = cmd.getParameterValue("@P_SRCE_PHONE_NOTEMESSAGE_OUT", NString.class);
			pSrceEmailaddressOut.val = cmd.getParameterValue("@P_SRCE_EMAILADDRESS_OUT", NString.class);
			pSrceEmailNotemessageOut.val = cmd.getParameterValue("@P_SRCE_EMAIL_NOTEMESSAGE_OUT", NString.class);
			pSrceUrladdress.val = cmd.getParameterValue("@P_SRCE_URLADDRESS", NString.class);
			pSrceUrlNotemessageOut.val = cmd.getParameterValue("@P_SRCE_URL_NOTEMESSAGE_OUT", NString.class);
			pSrceContctNotemessageOut.val = cmd.getParameterValue("@P_SRCE_CONTCT_NOTEMESSAGE_OUT", NString.class);
			pSrceOrgNotemessageOut.val = cmd.getParameterValue("@P_SRCE_ORG_NOTEMESSAGE_OUT", NString.class);
			pSrceNotemessageOut.val = cmd.getParameterValue("@P_SRCE_NOTEMESSAGE_OUT", NString.class);
			pDestOrgIdTypeOut.val = cmd.getParameterValue("@P_DEST_ORG_ID_TYPE_OUT", NString.class);
			pDestOrgIdValueOut.val = cmd.getParameterValue("@P_DEST_ORG_ID_VALUE_OUT", NString.class);
			pDestOrganizationnameOut.val = cmd.getParameterValue("@P_DEST_ORGANIZATIONNAME_OUT", NString.class);
			pDestAddressline1Out.val = cmd.getParameterValue("@P_DEST_ADDRESSLINE1_OUT", NString.class);
			pDestAddressline2Out.val = cmd.getParameterValue("@P_DEST_ADDRESSLINE2_OUT", NString.class);
			pDestAddressline3Out.val = cmd.getParameterValue("@P_DEST_ADDRESSLINE3_OUT", NString.class);
			pDestCityOut.val = cmd.getParameterValue("@P_DEST_CITY_OUT", NString.class);
			pDestDomesticIndOut.val = cmd.getParameterValue("@P_DEST_DOMESTIC_IND_OUT", NString.class);
			pDestStateprovincecodeOut.val = cmd.getParameterValue("@P_DEST_STATEPROVINCECODE_OUT", NString.class);
			pDestPostalcodeOut.val = cmd.getParameterValue("@P_DEST_POSTALCODE_OUT", NString.class);
			pDestStateprovinceOut.val = cmd.getParameterValue("@P_DEST_STATEPROVINCE_OUT", NString.class);
			pDestCountrycodeOut.val = cmd.getParameterValue("@P_DEST_COUNTRYCODE_OUT", NString.class);
			pDestAttentionlineOut.val = cmd.getParameterValue("@P_DEST_ATTENTIONLINE_OUT", NString.class);
			pDestAddrNotemessageOut.val = cmd.getParameterValue("@P_DEST_ADDR_NOTEMESSAGE_OUT", NString.class);
			pDestCountryprefixcodeOut.val = cmd.getParameterValue("@P_DEST_COUNTRYPREFIXCODE_OUT", NString.class);
			pDestAreacitycodeOut.val = cmd.getParameterValue("@P_DEST_AREACITYCODE_OUT", NString.class);
			pDestPhonenumberOut.val = cmd.getParameterValue("@P_DEST_PHONENUMBER_OUT", NString.class);
			pDestPhonenumberextOut.val = cmd.getParameterValue("@P_DEST_PHONENUMBEREXT_OUT", NString.class);
			pDestPhoneNotemessageOut.val = cmd.getParameterValue("@P_DEST_PHONE_NOTEMESSAGE_OUT", NString.class);
			pDestEmailaddressOut.val = cmd.getParameterValue("@P_DEST_EMAILADDRESS_OUT", NString.class);
			pDestEmailNotemessageOut.val = cmd.getParameterValue("@P_DEST_EMAIL_NOTEMESSAGE_OUT", NString.class);
			pDestUrladdressOut.val = cmd.getParameterValue("@P_DEST_URLADDRESS_OUT", NString.class);
			pDestUrlNotemessageOut.val = cmd.getParameterValue("@P_DEST_URL_NOTEMESSAGE_OUT", NString.class);
			pDestContctNotemessageOut.val = cmd.getParameterValue("@P_DEST_CONTCT_NOTEMESSAGE_OUT", NString.class);
			pDestOrgNotemessageOut.val = cmd.getParameterValue("@P_DEST_ORG_NOTEMESSAGE_OUT", NString.class);
			pDestNotemessageOut.val = cmd.getParameterValue("@P_DEST_NOTEMESSAGE_OUT", NString.class);
			pDocumentprocesscodeOut.val = cmd.getParameterValue("@P_DOCUMENTPROCESSCODE_OUT", NString.class);
			pDocumentofficialcodeOut.val = cmd.getParameterValue("@P_DOCUMENTOFFICIALCODE_OUT", NString.class);
			pDocumentcompletecodeOut.val = cmd.getParameterValue("@P_DOCUMENTCOMPLETECODE_OUT", NString.class);
			pRequesttrackingidOut.val = cmd.getParameterValue("@P_REQUESTTRACKINGID_OUT", NString.class);
			pNotemessageOut.val = cmd.getParameterValue("@P_NOTEMESSAGE_OUT", NString.class);


		}
		
	
	
	
}
