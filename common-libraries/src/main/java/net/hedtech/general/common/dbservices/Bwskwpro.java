package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwskwpro {
		public static void pChooseprospecttype(NString prelType,NString message) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKWPRO.P_CHOOSEPROSPECTTYPE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PREL_TYPE", prelType);
			cmd.addParameter("@MESSAGE", message);
				
			cmd.execute();


		}
		
		public static void pFormselectnewethn(NString cname,NString cvalue,NString cattributes) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKWPRO.P_FORMSELECTNEWETHN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@CNAME", cname);
			cmd.addParameter("@CVALUE", cvalue);
			cmd.addParameter("@CATTRIBUTES", cattributes);
				
			cmd.execute();


		}
		
		public static void pSetparameters(Ref<NString> urlStrOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKWPRO.P_SETPARAMETERS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@URL_STR_OUT", NString.class);
				
			cmd.execute();
			urlStrOut.val = cmd.getParameterValue("@URL_STR_OUT", NString.class);


		}
		
		public static void pWebprospectmain(NString prelCodeIn,NString buttonTextIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKWPRO.P_WEBPROSPECTMAIN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PREL_CODE_IN", prelCodeIn);
			cmd.addParameter("@BUTTON_TEXT_IN", buttonTextIn);
				
			cmd.execute();


		}
		
//		public static void pWebprospectmain(NString prelTypeIn,NString prelCodeIn,NString buttonTextIn,NString nameFlagIn,NString lastNameIn,NString firstNameIn,NString middleNameIn,NString namePrefixIn,NString nameSuffixIn,NString nicknameIn,NString ntypFlagIn,NString ntypCodeIn,NString termFlagIn,NString termCodeIn,NString ssntintfnFlagIn,NString ssntintfnIn,NString emailFlagIn,NString emalCodeIn,NString emailAddressIn,NString verifyEmailAddressIn,NString birthdateFlagIn,NString birthdateDdIn,NString birthdateMmIn,NString birthdateYyyyIn,NString ethnFlagIn,NString ethnCodeIn,NString ethnCatHispanicIn,NString ethnCatNothispanicIn,List<Varchar2TabtypeRow> raceCdeIn,NString citzFlagIn,NString citzCodeIn,NString intlFlagIn,NString visaFlagIn,NString visaNumberFlagIn,NString vtypCodeIn,NString natnCodeLegalIn,NString natnCodeBirthIn,NString nativeLangCodeIn,NString foreignSsnIn,NString genderFlagIn,NString genderIn,NString addr1FlagIn,NString addr1FromDdIn,NString addr1FromMmIn,NString addr1FromYyyyIn,NString addr1ToDdIn,NString addr1ToMmIn,NString addr1ToYyyyIn,NString multvFlagIn,NString multvIssueDdIn,NString multvIssueMmIn,NString multvIssueYyyyIn,NString multvExpDdIn,NString multvExpMmIn,NString multvExpYyyyIn,NString addr1AtypCodeIn,NString addr1Str1In,NString addr1Str2In,NString addr1Str3In,NString addr1CityIn,NString addr1StatCodeIn,NString addr1CntyCodeIn,NString addr1ZipIn,NString addr1NatnCodeIn,NString tele1AtypCodeIn,NString tele1PhoneAreaIn,NString tele1PhoneNumberIn,NString tele1PhoneExtIn,NString tele1IntlAccessIn,NString addr2FlagIn,NString addr2FromDdIn,NString addr2FromMmIn,NString addr2FromYyyyIn,NString addr2ToDdIn,NString addr2ToMmIn,NString addr2ToYyyyIn,NString addr2AtypCodeIn,NString addr2Str1In,NString addr2Str2In,NString addr2Str3In,NString addr2CityIn,NString addr2StatCodeIn,NString addr2CntyCodeIn,NString addr2ZipIn,NString addr2NatnCodeIn,NString tele2AtypCodeIn,NString tele2PhoneAreaIn,NString tele2PhoneNumberIn,NString tele2PhoneExtIn,NString tele2IntlAccessIn,NString tele3FlagIn,NString tele3TeleCodeIn,NString tele3PhoneAreaIn,NString tele3PhoneNumberIn,NString tele3PhoneExtIn,NString tele3IntlAccessIn,NString tele4TeleCodeIn,NString tele4PhoneAreaIn,NString tele4PhoneNumberIn,NString tele4PhoneExtIn,NString tele4IntlAccessIn,NString tele5TeleCodeIn,NString tele5PhoneAreaIn,NString tele5PhoneNumberIn,NString tele5PhoneExtIn,NString tele5IntlAccessIn,NString hsFlagIn,NString hsSbgiCodeIn,NString hsNameIn,NString hsStr1In,NString hsStr2In,NString hsStr3In,NString hsCityIn,NString hsStatCodeIn,NString hsZipIn,NString hsNatnCodeIn,NString hsGradDdIn,NString hsGradMmIn,NString hsGradYyyyIn,NString hsClassRankIn,NString hsClassSizeIn,NString hsGpaIn,NString hsHomeschoolIn,NString hsSbgiCodeInvalidIn,NString pcolFlagIn,NString pcolSbgiCodeIn,NString pcolNameIn,NString pcolStr1In,NString pcolStr2In,NString pcolStr3In,NString pcolCityIn,NString pcolStatCodeIn,NString pcolZipIn,NString pcolNatnCodeIn,NString pcolAttendFromIn,NString pcolAttendToIn,NString pcolGradDdIn,NString pcolGradMmIn,NString pcolGradYyyyIn,NString pcolGpaIn,NString pcolSbgiCodeInvalidIn,NString pcolDegcCodeIn,NString intsFlagIn,List<Varchar2TabtypeRow> intsCodeIn,List<Varchar2TabtypeRow> testsFlagIn,List<Varchar2TabtypeRow> testTescCodeIn,List<Varchar2TabtypeRow> testScoreIn,List<Varchar2TabtypeRow> testDdIn,List<Varchar2TabtypeRow> testMmIn,List<Varchar2TabtypeRow> testYyyyIn,NString stypFlagIn,NString stypCodeIn,NString majrFlagIn,NString majrCodeIn,NString matlFlagIn,List<Varchar2TabtypeRow> matlCodeIn,NString lendFlagIn,List<Varchar2TabtypeRow> lendCodeIn,NString lTypeIndIn,NString lCityIn,NString lStatCodeIn,NString lNatnCodeIn,NString lSbgiCodeIn,NString visaNumberIn,NString lastNamePrefixIn,NString addr1HnumIn,NString addr1Str4In,NString tele1CtryPhoneIn,NString addr2HnumIn,NString addr2Str4In,NString tele2CtryPhoneIn,NString tele3CtryPhoneIn,NString tele4CtryPhoneIn,NString tele5CtryPhoneIn,NString hsHnumIn,NString hsStr4In,NString pcolHnumIn,NString pcolStr4In) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKWPRO.P_WEBPROSPECTMAIN", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@PREL_TYPE_IN", prelTypeIn);
//			cmd.addParameter("@PREL_CODE_IN", prelCodeIn);
//			cmd.addParameter("@BUTTON_TEXT_IN", buttonTextIn);
//			cmd.addParameter("@NAME_FLAG_IN", nameFlagIn);
//			cmd.addParameter("@LAST_NAME_IN", lastNameIn);
//			cmd.addParameter("@FIRST_NAME_IN", firstNameIn);
//			cmd.addParameter("@MIDDLE_NAME_IN", middleNameIn);
//			cmd.addParameter("@NAME_PREFIX_IN", namePrefixIn);
//			cmd.addParameter("@NAME_SUFFIX_IN", nameSuffixIn);
//			cmd.addParameter("@NICKNAME_IN", nicknameIn);
//			cmd.addParameter("@NTYP_FLAG_IN", ntypFlagIn);
//			cmd.addParameter("@NTYP_CODE_IN", ntypCodeIn);
//			cmd.addParameter("@TERM_FLAG_IN", termFlagIn);
//			cmd.addParameter("@TERM_CODE_IN", termCodeIn);
//			cmd.addParameter("@SSNTINTFN_FLAG_IN", ssntintfnFlagIn);
//			cmd.addParameter("@SSNTINTFN_IN", ssntintfnIn);
//			cmd.addParameter("@EMAIL_FLAG_IN", emailFlagIn);
//			cmd.addParameter("@EMAL_CODE_IN", emalCodeIn);
//			cmd.addParameter("@EMAIL_ADDRESS_IN", emailAddressIn);
//			cmd.addParameter("@VERIFY_EMAIL_ADDRESS_IN", verifyEmailAddressIn);
//			cmd.addParameter("@BIRTHDATE_FLAG_IN", birthdateFlagIn);
//			cmd.addParameter("@BIRTHDATE_DD_IN", birthdateDdIn);
//			cmd.addParameter("@BIRTHDATE_MM_IN", birthdateMmIn);
//			cmd.addParameter("@BIRTHDATE_YYYY_IN", birthdateYyyyIn);
//			cmd.addParameter("@ETHN_FLAG_IN", ethnFlagIn);
//			cmd.addParameter("@ETHN_CODE_IN", ethnCodeIn);
//			cmd.addParameter("@ETHN_CAT_HISPANIC_IN", ethnCatHispanicIn);
//			cmd.addParameter("@ETHN_CAT_NOTHISPANIC_IN", ethnCatNothispanicIn);
//			// cmd.addParameter(DbTypes.getTableType("RACE_CDE_IN", "", raceCdeIn, object.class));
//			cmd.addParameter("@CITZ_FLAG_IN", citzFlagIn);
//			cmd.addParameter("@CITZ_CODE_IN", citzCodeIn);
//			cmd.addParameter("@INTL_FLAG_IN", intlFlagIn);
//			cmd.addParameter("@VISA_FLAG_IN", visaFlagIn);
//			cmd.addParameter("@VISA_NUMBER_FLAG_IN", visaNumberFlagIn);
//			cmd.addParameter("@VTYP_CODE_IN", vtypCodeIn);
//			cmd.addParameter("@NATN_CODE_LEGAL_IN", natnCodeLegalIn);
//			cmd.addParameter("@NATN_CODE_BIRTH_IN", natnCodeBirthIn);
//			cmd.addParameter("@NATIVE_LANG_CODE_IN", nativeLangCodeIn);
//			cmd.addParameter("@FOREIGN_SSN_IN", foreignSsnIn);
//			cmd.addParameter("@GENDER_FLAG_IN", genderFlagIn);
//			cmd.addParameter("@GENDER_IN", genderIn);
//			cmd.addParameter("@ADDR1_FLAG_IN", addr1FlagIn);
//			cmd.addParameter("@ADDR1_FROM_DD_IN", addr1FromDdIn);
//			cmd.addParameter("@ADDR1_FROM_MM_IN", addr1FromMmIn);
//			cmd.addParameter("@ADDR1_FROM_YYYY_IN", addr1FromYyyyIn);
//			cmd.addParameter("@ADDR1_TO_DD_IN", addr1ToDdIn);
//			cmd.addParameter("@ADDR1_TO_MM_IN", addr1ToMmIn);
//			cmd.addParameter("@ADDR1_TO_YYYY_IN", addr1ToYyyyIn);
//			cmd.addParameter("@MULTV_FLAG_IN", multvFlagIn);
//			cmd.addParameter("@MULTV_ISSUE_DD_IN", multvIssueDdIn);
//			cmd.addParameter("@MULTV_ISSUE_MM_IN", multvIssueMmIn);
//			cmd.addParameter("@MULTV_ISSUE_YYYY_IN", multvIssueYyyyIn);
//			cmd.addParameter("@MULTV_EXP_DD_IN", multvExpDdIn);
//			cmd.addParameter("@MULTV_EXP_MM_IN", multvExpMmIn);
//			cmd.addParameter("@MULTV_EXP_YYYY_IN", multvExpYyyyIn);
//			cmd.addParameter("@ADDR1_ATYP_CODE_IN", addr1AtypCodeIn);
//			cmd.addParameter("@ADDR1_STR1_IN", addr1Str1In);
//			cmd.addParameter("@ADDR1_STR2_IN", addr1Str2In);
//			cmd.addParameter("@ADDR1_STR3_IN", addr1Str3In);
//			cmd.addParameter("@ADDR1_CITY_IN", addr1CityIn);
//			cmd.addParameter("@ADDR1_STAT_CODE_IN", addr1StatCodeIn);
//			cmd.addParameter("@ADDR1_CNTY_CODE_IN", addr1CntyCodeIn);
//			cmd.addParameter("@ADDR1_ZIP_IN", addr1ZipIn);
//			cmd.addParameter("@ADDR1_NATN_CODE_IN", addr1NatnCodeIn);
//			cmd.addParameter("@TELE1_ATYP_CODE_IN", tele1AtypCodeIn);
//			cmd.addParameter("@TELE1_PHONE_AREA_IN", tele1PhoneAreaIn);
//			cmd.addParameter("@TELE1_PHONE_NUMBER_IN", tele1PhoneNumberIn);
//			cmd.addParameter("@TELE1_PHONE_EXT_IN", tele1PhoneExtIn);
//			cmd.addParameter("@TELE1_INTL_ACCESS_IN", tele1IntlAccessIn);
//			cmd.addParameter("@ADDR2_FLAG_IN", addr2FlagIn);
//			cmd.addParameter("@ADDR2_FROM_DD_IN", addr2FromDdIn);
//			cmd.addParameter("@ADDR2_FROM_MM_IN", addr2FromMmIn);
//			cmd.addParameter("@ADDR2_FROM_YYYY_IN", addr2FromYyyyIn);
//			cmd.addParameter("@ADDR2_TO_DD_IN", addr2ToDdIn);
//			cmd.addParameter("@ADDR2_TO_MM_IN", addr2ToMmIn);
//			cmd.addParameter("@ADDR2_TO_YYYY_IN", addr2ToYyyyIn);
//			cmd.addParameter("@ADDR2_ATYP_CODE_IN", addr2AtypCodeIn);
//			cmd.addParameter("@ADDR2_STR1_IN", addr2Str1In);
//			cmd.addParameter("@ADDR2_STR2_IN", addr2Str2In);
//			cmd.addParameter("@ADDR2_STR3_IN", addr2Str3In);
//			cmd.addParameter("@ADDR2_CITY_IN", addr2CityIn);
//			cmd.addParameter("@ADDR2_STAT_CODE_IN", addr2StatCodeIn);
//			cmd.addParameter("@ADDR2_CNTY_CODE_IN", addr2CntyCodeIn);
//			cmd.addParameter("@ADDR2_ZIP_IN", addr2ZipIn);
//			cmd.addParameter("@ADDR2_NATN_CODE_IN", addr2NatnCodeIn);
//			cmd.addParameter("@TELE2_ATYP_CODE_IN", tele2AtypCodeIn);
//			cmd.addParameter("@TELE2_PHONE_AREA_IN", tele2PhoneAreaIn);
//			cmd.addParameter("@TELE2_PHONE_NUMBER_IN", tele2PhoneNumberIn);
//			cmd.addParameter("@TELE2_PHONE_EXT_IN", tele2PhoneExtIn);
//			cmd.addParameter("@TELE2_INTL_ACCESS_IN", tele2IntlAccessIn);
//			cmd.addParameter("@TELE3_FLAG_IN", tele3FlagIn);
//			cmd.addParameter("@TELE3_TELE_CODE_IN", tele3TeleCodeIn);
//			cmd.addParameter("@TELE3_PHONE_AREA_IN", tele3PhoneAreaIn);
//			cmd.addParameter("@TELE3_PHONE_NUMBER_IN", tele3PhoneNumberIn);
//			cmd.addParameter("@TELE3_PHONE_EXT_IN", tele3PhoneExtIn);
//			cmd.addParameter("@TELE3_INTL_ACCESS_IN", tele3IntlAccessIn);
//			cmd.addParameter("@TELE4_TELE_CODE_IN", tele4TeleCodeIn);
//			cmd.addParameter("@TELE4_PHONE_AREA_IN", tele4PhoneAreaIn);
//			cmd.addParameter("@TELE4_PHONE_NUMBER_IN", tele4PhoneNumberIn);
//			cmd.addParameter("@TELE4_PHONE_EXT_IN", tele4PhoneExtIn);
//			cmd.addParameter("@TELE4_INTL_ACCESS_IN", tele4IntlAccessIn);
//			cmd.addParameter("@TELE5_TELE_CODE_IN", tele5TeleCodeIn);
//			cmd.addParameter("@TELE5_PHONE_AREA_IN", tele5PhoneAreaIn);
//			cmd.addParameter("@TELE5_PHONE_NUMBER_IN", tele5PhoneNumberIn);
//			cmd.addParameter("@TELE5_PHONE_EXT_IN", tele5PhoneExtIn);
//			cmd.addParameter("@TELE5_INTL_ACCESS_IN", tele5IntlAccessIn);
//			cmd.addParameter("@HS_FLAG_IN", hsFlagIn);
//			cmd.addParameter("@HS_SBGI_CODE_IN", hsSbgiCodeIn);
//			cmd.addParameter("@HS_NAME_IN", hsNameIn);
//			cmd.addParameter("@HS_STR1_IN", hsStr1In);
//			cmd.addParameter("@HS_STR2_IN", hsStr2In);
//			cmd.addParameter("@HS_STR3_IN", hsStr3In);
//			cmd.addParameter("@HS_CITY_IN", hsCityIn);
//			cmd.addParameter("@HS_STAT_CODE_IN", hsStatCodeIn);
//			cmd.addParameter("@HS_ZIP_IN", hsZipIn);
//			cmd.addParameter("@HS_NATN_CODE_IN", hsNatnCodeIn);
//			cmd.addParameter("@HS_GRAD_DD_IN", hsGradDdIn);
//			cmd.addParameter("@HS_GRAD_MM_IN", hsGradMmIn);
//			cmd.addParameter("@HS_GRAD_YYYY_IN", hsGradYyyyIn);
//			cmd.addParameter("@HS_CLASS_RANK_IN", hsClassRankIn);
//			cmd.addParameter("@HS_CLASS_SIZE_IN", hsClassSizeIn);
//			cmd.addParameter("@HS_GPA_IN", hsGpaIn);
//			cmd.addParameter("@HS_HOMESCHOOL_IN", hsHomeschoolIn);
//			cmd.addParameter("@HS_SBGI_CODE_INVALID_IN", hsSbgiCodeInvalidIn);
//			cmd.addParameter("@PCOL_FLAG_IN", pcolFlagIn);
//			cmd.addParameter("@PCOL_SBGI_CODE_IN", pcolSbgiCodeIn);
//			cmd.addParameter("@PCOL_NAME_IN", pcolNameIn);
//			cmd.addParameter("@PCOL_STR1_IN", pcolStr1In);
//			cmd.addParameter("@PCOL_STR2_IN", pcolStr2In);
//			cmd.addParameter("@PCOL_STR3_IN", pcolStr3In);
//			cmd.addParameter("@PCOL_CITY_IN", pcolCityIn);
//			cmd.addParameter("@PCOL_STAT_CODE_IN", pcolStatCodeIn);
//			cmd.addParameter("@PCOL_ZIP_IN", pcolZipIn);
//			cmd.addParameter("@PCOL_NATN_CODE_IN", pcolNatnCodeIn);
//			cmd.addParameter("@PCOL_ATTEND_FROM_IN", pcolAttendFromIn);
//			cmd.addParameter("@PCOL_ATTEND_TO_IN", pcolAttendToIn);
//			cmd.addParameter("@PCOL_GRAD_DD_IN", pcolGradDdIn);
//			cmd.addParameter("@PCOL_GRAD_MM_IN", pcolGradMmIn);
//			cmd.addParameter("@PCOL_GRAD_YYYY_IN", pcolGradYyyyIn);
//			cmd.addParameter("@PCOL_GPA_IN", pcolGpaIn);
//			cmd.addParameter("@PCOL_SBGI_CODE_INVALID_IN", pcolSbgiCodeInvalidIn);
//			cmd.addParameter("@PCOL_DEGC_CODE_IN", pcolDegcCodeIn);
//			cmd.addParameter("@INTS_FLAG_IN", intsFlagIn);
//			// cmd.addParameter(DbTypes.getTableType("INTS_CODE_IN", "", intsCodeIn, object.class));
//			// cmd.addParameter(DbTypes.getTableType("TESTS_FLAG_IN", "", testsFlagIn, object.class));
//			// cmd.addParameter(DbTypes.getTableType("TEST_TESC_CODE_IN", "", testTescCodeIn, object.class));
//			// cmd.addParameter(DbTypes.getTableType("TEST_SCORE_IN", "", testScoreIn, object.class));
//			// cmd.addParameter(DbTypes.getTableType("TEST_DD_IN", "", testDdIn, object.class));
//			// cmd.addParameter(DbTypes.getTableType("TEST_MM_IN", "", testMmIn, object.class));
//			// cmd.addParameter(DbTypes.getTableType("TEST_YYYY_IN", "", testYyyyIn, object.class));
//			cmd.addParameter("@STYP_FLAG_IN", stypFlagIn);
//			cmd.addParameter("@STYP_CODE_IN", stypCodeIn);
//			cmd.addParameter("@MAJR_FLAG_IN", majrFlagIn);
//			cmd.addParameter("@MAJR_CODE_IN", majrCodeIn);
//			cmd.addParameter("@MATL_FLAG_IN", matlFlagIn);
//			// cmd.addParameter(DbTypes.getTableType("MATL_CODE_IN", "", matlCodeIn, object.class));
//			cmd.addParameter("@LEND_FLAG_IN", lendFlagIn);
//			// cmd.addParameter(DbTypes.getTableType("LEND_CODE_IN", "", lendCodeIn, object.class));
//			cmd.addParameter("@L_TYPE_IND_IN", lTypeIndIn);
//			cmd.addParameter("@L_CITY_IN", lCityIn);
//			cmd.addParameter("@L_STAT_CODE_IN", lStatCodeIn);
//			cmd.addParameter("@L_NATN_CODE_IN", lNatnCodeIn);
//			cmd.addParameter("@L_SBGI_CODE_IN", lSbgiCodeIn);
//			cmd.addParameter("@VISA_NUMBER_IN", visaNumberIn);
//			cmd.addParameter("@LAST_NAME_PREFIX_IN", lastNamePrefixIn);
//			cmd.addParameter("@ADDR1_HNUM_IN", addr1HnumIn);
//			cmd.addParameter("@ADDR1_STR4_IN", addr1Str4In);
//			cmd.addParameter("@TELE1_CTRY_PHONE_IN", tele1CtryPhoneIn);
//			cmd.addParameter("@ADDR2_HNUM_IN", addr2HnumIn);
//			cmd.addParameter("@ADDR2_STR4_IN", addr2Str4In);
//			cmd.addParameter("@TELE2_CTRY_PHONE_IN", tele2CtryPhoneIn);
//			cmd.addParameter("@TELE3_CTRY_PHONE_IN", tele3CtryPhoneIn);
//			cmd.addParameter("@TELE4_CTRY_PHONE_IN", tele4CtryPhoneIn);
//			cmd.addParameter("@TELE5_CTRY_PHONE_IN", tele5CtryPhoneIn);
//			cmd.addParameter("@HS_HNUM_IN", hsHnumIn);
//			cmd.addParameter("@HS_STR4_IN", hsStr4In);
//			cmd.addParameter("@PCOL_HNUM_IN", pcolHnumIn);
//			cmd.addParameter("@PCOL_STR4_IN", pcolStr4In);
//				
//			cmd.execute();
//
//
//		}
		
	
	
	
}
