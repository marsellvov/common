package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SbPescxmlSchoolImp {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_PESCXML_SCHOOL_IMP.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static void pAcsesSchoolElement(NNumber pDcmtSeqnoIn,NNumber pAsesSeqnoIn,NString pAcsesSchoolOrgnameIn,NString pAcsesSchoolOrgidTypeIn,NString pAcsesSchoolOrgidValueIn,NString pAcsesSchooloverridecdIn,NString pAcsesSchoollevel,NString pSchlAddressline1In,NString pSchlAddressline2In,NString pSchlAddressline3In,NString pSchlCityIn,NString pSchlDomesticIndIn,NString pSchlStateprovcodeIn,NString pSchlStateprovinceIn,NString pSchlPostalcodeIn,NString pSchlCountrycodeIn,NString pSchlAttentionlineIn,NString pSchlAddrNotemessageIn,NString pSchlCountryprefixcodeIn,NString pSchlAreacitycodeIn,NString pSchlPhonenumberIn,NString pSchlPhonenumberextIn,NString pSchlPhnNotemessageIn,NString pSchlEmailaddressIn,NString pSchlEmailNotemessageIn,NString pSchlUrladdressIn,NString pSchlUrlNotemessageIn,NString pSchlContactNotemessageIn,NString pAcsesSchlNotemessageIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_PESCXML_SCHOOL_IMP.P_ACSES_SCHOOL_ELEMENT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DCMT_SEQNO_IN", pDcmtSeqnoIn);
			cmd.addParameter("@P_ASES_SEQNO_IN", pAsesSeqnoIn);
			cmd.addParameter("@P_ACSES_SCHOOL_ORGNAME_IN", pAcsesSchoolOrgnameIn);
			cmd.addParameter("@P_ACSES_SCHOOL_ORGID_TYPE_IN", pAcsesSchoolOrgidTypeIn);
			cmd.addParameter("@P_ACSES_SCHOOL_ORGID_VALUE_IN", pAcsesSchoolOrgidValueIn);
			cmd.addParameter("@P_ACSES_SCHOOLOVERRIDECD_IN", pAcsesSchooloverridecdIn);
			cmd.addParameter("@P_ACSES_SCHOOLLEVEL", pAcsesSchoollevel);
			cmd.addParameter("@P_SCHL_ADDRESSLINE1_IN", pSchlAddressline1In);
			cmd.addParameter("@P_SCHL_ADDRESSLINE2_IN", pSchlAddressline2In);
			cmd.addParameter("@P_SCHL_ADDRESSLINE3_IN", pSchlAddressline3In);
			cmd.addParameter("@P_SCHL_CITY_IN", pSchlCityIn);
			cmd.addParameter("@P_SCHL_DOMESTIC_IND_IN", pSchlDomesticIndIn);
			cmd.addParameter("@P_SCHL_STATEPROVCODE_IN", pSchlStateprovcodeIn);
			cmd.addParameter("@P_SCHL_STATEPROVINCE_IN", pSchlStateprovinceIn);
			cmd.addParameter("@P_SCHL_POSTALCODE_IN", pSchlPostalcodeIn);
			cmd.addParameter("@P_SCHL_COUNTRYCODE_IN", pSchlCountrycodeIn);
			cmd.addParameter("@P_SCHL_ATTENTIONLINE_IN", pSchlAttentionlineIn);
			cmd.addParameter("@P_SCHL_ADDR_NOTEMESSAGE_IN", pSchlAddrNotemessageIn);
			cmd.addParameter("@P_SCHL_COUNTRYPREFIXCODE_IN", pSchlCountryprefixcodeIn);
			cmd.addParameter("@P_SCHL_AREACITYCODE_IN", pSchlAreacitycodeIn);
			cmd.addParameter("@P_SCHL_PHONENUMBER_IN", pSchlPhonenumberIn);
			cmd.addParameter("@P_SCHL_PHONENUMBEREXT_IN", pSchlPhonenumberextIn);
			cmd.addParameter("@P_SCHL_PHN_NOTEMESSAGE_IN", pSchlPhnNotemessageIn);
			cmd.addParameter("@P_SCHL_EMAILADDRESS_IN", pSchlEmailaddressIn);
			cmd.addParameter("@P_SCHL_EMAIL_NOTEMESSAGE_IN", pSchlEmailNotemessageIn);
			cmd.addParameter("@P_SCHL_URLADDRESS_IN", pSchlUrladdressIn);
			cmd.addParameter("@P_SCHL_URL_NOTEMESSAGE_IN", pSchlUrlNotemessageIn);
			cmd.addParameter("@P_SCHL_CONTACT_NOTEMESSAGE_IN", pSchlContactNotemessageIn);
			cmd.addParameter("@P_ACSES_SCHL_NOTEMESSAGE_IN", pAcsesSchlNotemessageIn);
				
			cmd.execute();


		}
		
	
	
	
}
