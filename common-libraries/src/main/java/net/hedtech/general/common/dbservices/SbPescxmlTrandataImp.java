package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SbPescxmlTrandataImp {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_PESCXML_TRANDATA_IMP.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static void pGetSobbgtaInfo(NString pSrceSbgiCodeIn,NString pSrceTermCodeIn,Ref<NString> pSrceHwlkDescOut,Ref<NString> pSrceAcprDescOut,Ref<NString> pSrceCaldDescOut,Ref<NString> pSrceSbgiDescOut,Ref<NString> pSrceTaauDescOut,Ref<NString> pSrceReportedByOut,Ref<NString> pSrceReportinfoOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_PESCXML_TRANDATA_IMP.P_GET_SOBBGTA_INFO", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SRCE_SBGI_CODE_IN", pSrceSbgiCodeIn);
			cmd.addParameter("@P_SRCE_TERM_CODE_IN", pSrceTermCodeIn);
			cmd.addParameter("@P_SRCE_HWLK_DESC_OUT", NString.class);
			cmd.addParameter("@P_SRCE_ACPR_DESC_OUT", NString.class);
			cmd.addParameter("@P_SRCE_CALD_DESC_OUT", NString.class);
			cmd.addParameter("@P_SRCE_SBGI_DESC_OUT", NString.class);
			cmd.addParameter("@P_SRCE_TAAU_DESC_OUT", NString.class);
			cmd.addParameter("@P_SRCE_REPORTED_BY_OUT", NString.class);
			cmd.addParameter("@P_SRCE_REPORTINFO_OUT", NString.class);
				
			cmd.execute();
			pSrceHwlkDescOut.val = cmd.getParameterValue("@P_SRCE_HWLK_DESC_OUT", NString.class);
			pSrceAcprDescOut.val = cmd.getParameterValue("@P_SRCE_ACPR_DESC_OUT", NString.class);
			pSrceCaldDescOut.val = cmd.getParameterValue("@P_SRCE_CALD_DESC_OUT", NString.class);
			pSrceSbgiDescOut.val = cmd.getParameterValue("@P_SRCE_SBGI_DESC_OUT", NString.class);
			pSrceTaauDescOut.val = cmd.getParameterValue("@P_SRCE_TAAU_DESC_OUT", NString.class);
			pSrceReportedByOut.val = cmd.getParameterValue("@P_SRCE_REPORTED_BY_OUT", NString.class);
			pSrceReportinfoOut.val = cmd.getParameterValue("@P_SRCE_REPORTINFO_OUT", NString.class);


		}
		
		public static void pGetSobsbgiInfo(NString pSbgiCodeIn,Ref<NString> pSrceSbgiDescOut,Ref<NString> pSrceAddressline1Out,Ref<NString> pSrceAddressline2Out,Ref<NString> pSrceAddressline3Out,Ref<NString> pSrceAddressline4Out,Ref<NString> pSrceCityOut,Ref<NString> pSrceStatecodeOut,Ref<NString> pSrceCntydescOut,Ref<NString> pSrceZipcodeOut,Ref<NString> pSrceNationOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_PESCXML_TRANDATA_IMP.P_GET_SOBSBGI_INFO", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SBGI_CODE_IN", pSbgiCodeIn);
			cmd.addParameter("@P_SRCE_SBGI_DESC_OUT", NString.class);
			cmd.addParameter("@P_SRCE_ADDRESSLINE1_OUT", NString.class);
			cmd.addParameter("@P_SRCE_ADDRESSLINE2_OUT", NString.class);
			cmd.addParameter("@P_SRCE_ADDRESSLINE3_OUT", NString.class);
			cmd.addParameter("@P_SRCE_ADDRESSLINE4_OUT", NString.class);
			cmd.addParameter("@P_SRCE_CITY_OUT", NString.class);
			cmd.addParameter("@P_SRCE_STATECODE_OUT", NString.class);
			cmd.addParameter("@P_SRCE_CNTYDESC_OUT", NString.class);
			cmd.addParameter("@P_SRCE_ZIPCODE_OUT", NString.class);
			cmd.addParameter("@P_SRCE_NATION_OUT", NString.class);
				
			cmd.execute();
			pSrceSbgiDescOut.val = cmd.getParameterValue("@P_SRCE_SBGI_DESC_OUT", NString.class);
			pSrceAddressline1Out.val = cmd.getParameterValue("@P_SRCE_ADDRESSLINE1_OUT", NString.class);
			pSrceAddressline2Out.val = cmd.getParameterValue("@P_SRCE_ADDRESSLINE2_OUT", NString.class);
			pSrceAddressline3Out.val = cmd.getParameterValue("@P_SRCE_ADDRESSLINE3_OUT", NString.class);
			pSrceAddressline4Out.val = cmd.getParameterValue("@P_SRCE_ADDRESSLINE4_OUT", NString.class);
			pSrceCityOut.val = cmd.getParameterValue("@P_SRCE_CITY_OUT", NString.class);
			pSrceStatecodeOut.val = cmd.getParameterValue("@P_SRCE_STATECODE_OUT", NString.class);
			pSrceCntydescOut.val = cmd.getParameterValue("@P_SRCE_CNTYDESC_OUT", NString.class);
			pSrceZipcodeOut.val = cmd.getParameterValue("@P_SRCE_ZIPCODE_OUT", NString.class);
			pSrceNationOut.val = cmd.getParameterValue("@P_SRCE_NATION_OUT", NString.class);


		}
		
		public static void pTransmitElement(NString pDocumentidIn,NDate pCreateddatetimeIn,NString pTransmissiontypeIn,NString pDocumenttypeIn,NString pSourceOrgIdTypeIn,NString pSourceOrgIdValueIn,NString pSrceOrganizationnameIn,NString pSrceAddressline1In,NString pSrceAddressline2In,NString pSrceAddressline3In,NString pSrceCityIn,NString pSrceStateprovincecodeIn,NString pSrcePostalcodeIn,NString pSrceStateprovinceIn,NString pSrceCountrycodeIn,NString pSrceAttentionlineIn,NString pSrceAddrNotemessageIn,NString pSrceOuntryprefixcodeIn,NString pSrceAreacitycodeIn,NString pSrcePhonenumberIn,NString pSrcePhonenumberextensionIn,NString pSrceNotemessageIn,NString pSrceEmailaddressIn,NString pSrceUrladdress,NString pSrceUrlNotemessageIn,NString pSrceAddrContctNotemsgIn,NString pSrceOrgNotemessageIn,NString pDestOrgIdTypeIn,NString pDestOrgIdValueIn,NString pDestOrganizationnameIn,NString pDestAddressline1In,NString pDestAddressline2In,NString pDestAddressline3In,NString pDestCityIn,NString pDestDomesticIndIn,NString pDestStateprovincecodeIn,NString pDestPostalcodeIn,NString pDestStateprovinceIn,NString pDestCountrycodeIn,NString pDestAttentionlineIn,NString pDestCountryprefixcodeIn,NString pDestAreacitycodeIn,NString pDestPhonenumberIn,NString pDestPhonenumberextensionIn,NString pDestAddrNotemessageIn,NString pDestEmailaddressIn,NString pDestUrladdressIn,NString pDestContctNotemessageIn,NString pDestOrgNotemessageIn,NString pDestNotemessageIn,NString pDocumentprocesscodeIn,NString pDocumentofficialcodeIn,NString pDocumentcompletecodeIn,NString pRequesttrackingidIn,NString pNotemessageIn,Ref<NNumber> pDcmtSeqnoOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_PESCXML_TRANDATA_IMP.P_TRANSMIT_ELEMENT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DOCUMENTID_IN", pDocumentidIn);
			cmd.addParameter("@P_CREATEDDATETIME_IN", pCreateddatetimeIn);
			cmd.addParameter("@P_TRANSMISSIONTYPE_IN", pTransmissiontypeIn);
			cmd.addParameter("@P_DOCUMENTTYPE_IN", pDocumenttypeIn);
			cmd.addParameter("@P_SOURCE_ORG_ID_TYPE_IN", pSourceOrgIdTypeIn);
			cmd.addParameter("@P_SOURCE_ORG_ID_VALUE_IN", pSourceOrgIdValueIn);
			cmd.addParameter("@P_SRCE_ORGANIZATIONNAME_IN", pSrceOrganizationnameIn);
			cmd.addParameter("@P_SRCE_ADDRESSLINE1_IN", pSrceAddressline1In);
			cmd.addParameter("@P_SRCE_ADDRESSLINE2_IN", pSrceAddressline2In);
			cmd.addParameter("@P_SRCE_ADDRESSLINE3_IN", pSrceAddressline3In);
			cmd.addParameter("@P_SRCE_CITY_IN", pSrceCityIn);
			cmd.addParameter("@P_SRCE_STATEPROVINCECODE_IN", pSrceStateprovincecodeIn);
			cmd.addParameter("@P_SRCE_POSTALCODE_IN", pSrcePostalcodeIn);
			cmd.addParameter("@P_SRCE_STATEPROVINCE_IN", pSrceStateprovinceIn);
			cmd.addParameter("@P_SRCE_COUNTRYCODE_IN", pSrceCountrycodeIn);
			cmd.addParameter("@P_SRCE_ATTENTIONLINE_IN", pSrceAttentionlineIn);
			cmd.addParameter("@P_SRCE_ADDR_NOTEMESSAGE_IN", pSrceAddrNotemessageIn);
			cmd.addParameter("@P_SRCE_OUNTRYPREFIXCODE_IN", pSrceOuntryprefixcodeIn);
			cmd.addParameter("@P_SRCE_AREACITYCODE_IN", pSrceAreacitycodeIn);
			cmd.addParameter("@P_SRCE_PHONENUMBER_IN", pSrcePhonenumberIn);
			cmd.addParameter("@P_SRCE_PHONENUMBEREXTENSION_IN", pSrcePhonenumberextensionIn);
			cmd.addParameter("@P_SRCE_NOTEMESSAGE_IN", pSrceNotemessageIn);
			cmd.addParameter("@P_SRCE_EMAILADDRESS_IN", pSrceEmailaddressIn);
			cmd.addParameter("@P_SRCE_URLADDRESS", pSrceUrladdress);
			cmd.addParameter("@P_SRCE_URL_NOTEMESSAGE_IN", pSrceUrlNotemessageIn);
			cmd.addParameter("@P_SRCE_ADDR_CONTCT_NOTEMSG_IN", pSrceAddrContctNotemsgIn);
			cmd.addParameter("@P_SRCE_ORG_NOTEMESSAGE_IN", pSrceOrgNotemessageIn);
			cmd.addParameter("@P_DEST_ORG_ID_TYPE_IN", pDestOrgIdTypeIn);
			cmd.addParameter("@P_DEST_ORG_ID_VALUE_IN", pDestOrgIdValueIn);
			cmd.addParameter("@P_DEST_ORGANIZATIONNAME_IN", pDestOrganizationnameIn);
			cmd.addParameter("@P_DEST_ADDRESSLINE1_IN", pDestAddressline1In);
			cmd.addParameter("@P_DEST_ADDRESSLINE2_IN", pDestAddressline2In);
			cmd.addParameter("@P_DEST_ADDRESSLINE3_IN", pDestAddressline3In);
			cmd.addParameter("@P_DEST_CITY_IN", pDestCityIn);
			cmd.addParameter("@P_DEST_DOMESTIC_IND_IN", pDestDomesticIndIn);
			cmd.addParameter("@P_DEST_STATEPROVINCECODE_IN", pDestStateprovincecodeIn);
			cmd.addParameter("@P_DEST_POSTALCODE_IN", pDestPostalcodeIn);
			cmd.addParameter("@P_DEST_STATEPROVINCE_IN", pDestStateprovinceIn);
			cmd.addParameter("@P_DEST_COUNTRYCODE_IN", pDestCountrycodeIn);
			cmd.addParameter("@P_DEST_ATTENTIONLINE_IN", pDestAttentionlineIn);
			cmd.addParameter("@P_DEST_COUNTRYPREFIXCODE_IN", pDestCountryprefixcodeIn);
			cmd.addParameter("@P_DEST_AREACITYCODE_IN", pDestAreacitycodeIn);
			cmd.addParameter("@P_DEST_PHONENUMBER_IN", pDestPhonenumberIn);
			cmd.addParameter("@P_DEST_PHONENUMBEREXTENSION_IN", pDestPhonenumberextensionIn);
			cmd.addParameter("@P_DEST_ADDR_NOTEMESSAGE_IN", pDestAddrNotemessageIn);
			cmd.addParameter("@P_DEST_EMAILADDRESS_IN", pDestEmailaddressIn);
			cmd.addParameter("@P_DEST_URLADDRESS_IN", pDestUrladdressIn);
			cmd.addParameter("@P_DEST_CONTCT_NOTEMESSAGE_IN", pDestContctNotemessageIn);
			cmd.addParameter("@P_DEST_ORG_NOTEMESSAGE_IN", pDestOrgNotemessageIn);
			cmd.addParameter("@P_DEST_NOTEMESSAGE_IN", pDestNotemessageIn);
			cmd.addParameter("@P_DOCUMENTPROCESSCODE_IN", pDocumentprocesscodeIn);
			cmd.addParameter("@P_DOCUMENTOFFICIALCODE_IN", pDocumentofficialcodeIn);
			cmd.addParameter("@P_DOCUMENTCOMPLETECODE_IN", pDocumentcompletecodeIn);
			cmd.addParameter("@P_REQUESTTRACKINGID_IN", pRequesttrackingidIn);
			cmd.addParameter("@P_NOTEMESSAGE_IN", pNotemessageIn);
			cmd.addParameter("@P_DCMT_SEQNO_OUT", NNumber.class);
				
			cmd.execute();
			pDcmtSeqnoOut.val = cmd.getParameterValue("@P_DCMT_SEQNO_OUT", NNumber.class);


		}
		
	
	
	
}
