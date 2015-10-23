package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwakalog {
		public static NNumber fChecksecurity() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWAKALOG.F_CHECKSECURITY", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString fCleanLocalCheck(NString pText) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWAKALOG.F_CLEAN_LOCAL_CHECK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_TEXT", pText);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NBool fValidusernon(Ref<NString> aidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWAKALOG.F_VALIDUSERNON", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@AIDM", aidm, true);
				
			cmd.execute();
			aidm.val = cmd.getParameterValue("@AIDM", NString.class);

			return cmd.getReturnValue(NBool.class);

		}
		
		public static void pDispadvmnunon() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWAKALOG.P_DISPADVMNUNON", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pDisploginnew(NString inId,NString cpbl,NString newid,NString nextPage) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWAKALOG.P_DISPLOGINNEW", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@IN_ID", inId);
			cmd.addParameter("@CPBL", cpbl);
			cmd.addParameter("@NEWID", newid);
			cmd.addParameter("@NEXT_PAGE", nextPage);
				
			cmd.execute();


		}
		
		public static void pDisploginnon(NString inId,NString cpbl,NString newid,NString nextPage) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWAKALOG.P_DISPLOGINNON", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@IN_ID", inId);
			cmd.addParameter("@CPBL", cpbl);
			cmd.addParameter("@NEWID", newid);
			cmd.addParameter("@NEXT_PAGE", nextPage);
				
			cmd.execute();


		}
		
		public static void pDisplogoutnon() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWAKALOG.P_DISPLOGOUTNON", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pDisppinlocked() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWAKALOG.P_DISPPINLOCKED", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pDisppinverifyexist(NString aidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWAKALOG.P_DISPPINVERIFYEXIST", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@AIDM", aidm);
				
			cmd.execute();


		}
		
		public static void pDisppinverifynew(NString aidm,NString newpin) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWAKALOG.P_DISPPINVERIFYNEW", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@AIDM", aidm);
			cmd.addParameter("@NEWPIN", newpin);
				
			cmd.execute();


		}
		
		public static void pForgotpin(NString aidm,NString retLoc,NString retType,NString nextPage) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWAKALOG.P_FORGOTPIN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@AIDM", aidm);
			cmd.addParameter("@RET_LOC", retLoc);
			cmd.addParameter("@RET_TYPE", retType);
			cmd.addParameter("@NEXT_PAGE", nextPage);
				
			cmd.execute();


		}
		
		public static void pPersinfo(NString aidmIn,NString surnamePrefixIn,NString lastNameIn,NString firstNameIn,NString miIn,NString maidenNameIn,NString namePrefixIn,NString nameSuffixIn,NString birthDateIn,NString sexIn,NString atypCodeIn,NString houseNumberIn,NString streetLine1In,NString streetLine2In,NString streetLine3In,NString streetLine4In,NString cityIn,NString statCodeIn,NString zipIn,NString cntyCodeIn,NString natnCodeIn,NString teleCodeIn,NString phoneCtryCodeIn,NString phoneAreaIn,NString phoneNumberIn,NString phoneExtIn,NString intlAccessIn,NString unlistIndIn,NString faxTeleCodeIn,NString faxCtryCodeIn,NString faxAreaIn,NString faxNumberIn,NString faxIntlAccessIn,NString faxUnlistIndIn,NString emailAddressIn,NString emalCodeIn,NString spsSurnamePrefixIn,NString spsLastNameIn,NString spsFirstNameIn,NString spsMiIn,NString prefClasIn,NString prefCollIn,NString donrCodeIn,NString submitBtn,NString nextPage) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWAKALOG.P_PERSINFO", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@AIDM_IN", aidmIn);
			cmd.addParameter("@SURNAME_PREFIX_IN", surnamePrefixIn);
			cmd.addParameter("@LAST_NAME_IN", lastNameIn);
			cmd.addParameter("@FIRST_NAME_IN", firstNameIn);
			cmd.addParameter("@MI_IN", miIn);
			cmd.addParameter("@MAIDEN_NAME_IN", maidenNameIn);
			cmd.addParameter("@NAME_PREFIX_IN", namePrefixIn);
			cmd.addParameter("@NAME_SUFFIX_IN", nameSuffixIn);
			cmd.addParameter("@BIRTH_DATE_IN", birthDateIn);
			cmd.addParameter("@SEX_IN", sexIn);
			cmd.addParameter("@ATYP_CODE_IN", atypCodeIn);
			cmd.addParameter("@HOUSE_NUMBER_IN", houseNumberIn);
			cmd.addParameter("@STREET_LINE1_IN", streetLine1In);
			cmd.addParameter("@STREET_LINE2_IN", streetLine2In);
			cmd.addParameter("@STREET_LINE3_IN", streetLine3In);
			cmd.addParameter("@STREET_LINE4_IN", streetLine4In);
			cmd.addParameter("@CITY_IN", cityIn);
			cmd.addParameter("@STAT_CODE_IN", statCodeIn);
			cmd.addParameter("@ZIP_IN", zipIn);
			cmd.addParameter("@CNTY_CODE_IN", cntyCodeIn);
			cmd.addParameter("@NATN_CODE_IN", natnCodeIn);
			cmd.addParameter("@TELE_CODE_IN", teleCodeIn);
			cmd.addParameter("@PHONE_CTRY_CODE_IN", phoneCtryCodeIn);
			cmd.addParameter("@PHONE_AREA_IN", phoneAreaIn);
			cmd.addParameter("@PHONE_NUMBER_IN", phoneNumberIn);
			cmd.addParameter("@PHONE_EXT_IN", phoneExtIn);
			cmd.addParameter("@INTL_ACCESS_IN", intlAccessIn);
			cmd.addParameter("@UNLIST_IND_IN", unlistIndIn);
			cmd.addParameter("@FAX_TELE_CODE_IN", faxTeleCodeIn);
			cmd.addParameter("@FAX_CTRY_CODE_IN", faxCtryCodeIn);
			cmd.addParameter("@FAX_AREA_IN", faxAreaIn);
			cmd.addParameter("@FAX_NUMBER_IN", faxNumberIn);
			cmd.addParameter("@FAX_INTL_ACCESS_IN", faxIntlAccessIn);
			cmd.addParameter("@FAX_UNLIST_IND_IN", faxUnlistIndIn);
			cmd.addParameter("@EMAIL_ADDRESS_IN", emailAddressIn);
			cmd.addParameter("@EMAL_CODE_IN", emalCodeIn);
			cmd.addParameter("@SPS_SURNAME_PREFIX_IN", spsSurnamePrefixIn);
			cmd.addParameter("@SPS_LAST_NAME_IN", spsLastNameIn);
			cmd.addParameter("@SPS_FIRST_NAME_IN", spsFirstNameIn);
			cmd.addParameter("@SPS_MI_IN", spsMiIn);
			cmd.addParameter("@PREF_CLAS_IN", prefClasIn);
			cmd.addParameter("@PREF_COLL_IN", prefCollIn);
			cmd.addParameter("@DONR_CODE_IN", donrCodeIn);
			cmd.addParameter("@SUBMIT_BTN", submitBtn);
			cmd.addParameter("@NEXT_PAGE", nextPage);
				
			cmd.execute();


		}
		
		public static void pPinChange(NString aidm,NString msg,NString retLoc,NString retType,NString nextPage) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWAKALOG.P_PIN_CHANGE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@AIDM", aidm);
			cmd.addParameter("@MSG", msg);
			cmd.addParameter("@RET_LOC", retLoc);
			cmd.addParameter("@RET_TYPE", retType);
			cmd.addParameter("@NEXT_PAGE", nextPage);
				
			cmd.execute();


		}
		
		public static void pPrintmsg() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWAKALOG.P_PRINTMSG", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pProcforcepinchange(NString aidm,NString newPin,NString verfPin,NString retLoc,NString retType,NString nextPage) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWAKALOG.P_PROCFORCEPINCHANGE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@AIDM", aidm);
			cmd.addParameter("@NEW_PIN", newPin);
			cmd.addParameter("@VERF_PIN", verfPin);
			cmd.addParameter("@RET_LOC", retLoc);
			cmd.addParameter("@RET_TYPE", retType);
			cmd.addParameter("@NEXT_PAGE", nextPage);
				
			cmd.execute();


		}
		
		public static void pProcforgotpin(NString aidm,NString retLoc,NString retType,NString nextPage,NString answer) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWAKALOG.P_PROCFORGOTPIN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@AIDM", aidm);
			cmd.addParameter("@RET_LOC", retLoc);
			cmd.addParameter("@RET_TYPE", retType);
			cmd.addParameter("@NEXT_PAGE", nextPage);
			cmd.addParameter("@ANSWER", answer);
				
			cmd.execute();


		}
		
		public static void pProcloginnon(NString inId,NString newid,NString pin,NString newpin,NString verifypin,NString submitBtn,NString nextPage) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWAKALOG.P_PROCLOGINNON", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@IN_ID", inId);
			cmd.addParameter("@NEWID", newid);
			cmd.addParameter("@PIN", pin);
			cmd.addParameter("@NEWPIN", newpin);
			cmd.addParameter("@VERIFYPIN", verifypin);
			cmd.addParameter("@SUBMIT_BTN", submitBtn);
			cmd.addParameter("@NEXT_PAGE", nextPage);
				
			cmd.execute();


		}
		
		public static void pProcpersinfo(NString aidmIn,NString surnamePrefixIn,NString lastNameIn,NString firstNameIn,NString miIn,NString maidenNameIn,NString namePrefixIn,NString nameSuffixIn,NString birthDateIn,NString sexIn,NString atypCodeIn,NString houseNumberIn,NString streetLine1In,NString streetLine2In,NString streetLine3In,NString streetLine4In,NString cityIn,NString statCodeIn,NString zipIn,NString cntyCodeIn,NString natnCodeIn,NString teleCodeIn,NString phoneCtryCodeIn,NString phoneAreaIn,NString phoneNumberIn,NString phoneExtIn,NString intlAccessIn,NString unlistIndIn,NString faxTeleCodeIn,NString faxCtryCodeIn,NString faxAreaIn,NString faxNumberIn,NString faxIntlAccessIn,NString faxUnlistIndIn,NString emailAddressIn,NString emalCodeIn,NString spsSurnamePrefixIn,NString spsLastNameIn,NString spsFirstNameIn,NString spsMiIn,NString prefClasIn,NString prefCollIn,NString donrCodeIn,NString submitBtn,NString nextPage) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWAKALOG.P_PROCPERSINFO", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@AIDM_IN", aidmIn);
			cmd.addParameter("@SURNAME_PREFIX_IN", surnamePrefixIn);
			cmd.addParameter("@LAST_NAME_IN", lastNameIn);
			cmd.addParameter("@FIRST_NAME_IN", firstNameIn);
			cmd.addParameter("@MI_IN", miIn);
			cmd.addParameter("@MAIDEN_NAME_IN", maidenNameIn);
			cmd.addParameter("@NAME_PREFIX_IN", namePrefixIn);
			cmd.addParameter("@NAME_SUFFIX_IN", nameSuffixIn);
			cmd.addParameter("@BIRTH_DATE_IN", birthDateIn);
			cmd.addParameter("@SEX_IN", sexIn);
			cmd.addParameter("@ATYP_CODE_IN", atypCodeIn);
			cmd.addParameter("@HOUSE_NUMBER_IN", houseNumberIn);
			cmd.addParameter("@STREET_LINE1_IN", streetLine1In);
			cmd.addParameter("@STREET_LINE2_IN", streetLine2In);
			cmd.addParameter("@STREET_LINE3_IN", streetLine3In);
			cmd.addParameter("@STREET_LINE4_IN", streetLine4In);
			cmd.addParameter("@CITY_IN", cityIn);
			cmd.addParameter("@STAT_CODE_IN", statCodeIn);
			cmd.addParameter("@ZIP_IN", zipIn);
			cmd.addParameter("@CNTY_CODE_IN", cntyCodeIn);
			cmd.addParameter("@NATN_CODE_IN", natnCodeIn);
			cmd.addParameter("@TELE_CODE_IN", teleCodeIn);
			cmd.addParameter("@PHONE_CTRY_CODE_IN", phoneCtryCodeIn);
			cmd.addParameter("@PHONE_AREA_IN", phoneAreaIn);
			cmd.addParameter("@PHONE_NUMBER_IN", phoneNumberIn);
			cmd.addParameter("@PHONE_EXT_IN", phoneExtIn);
			cmd.addParameter("@INTL_ACCESS_IN", intlAccessIn);
			cmd.addParameter("@UNLIST_IND_IN", unlistIndIn);
			cmd.addParameter("@FAX_TELE_CODE_IN", faxTeleCodeIn);
			cmd.addParameter("@FAX_CTRY_CODE_IN", faxCtryCodeIn);
			cmd.addParameter("@FAX_AREA_IN", faxAreaIn);
			cmd.addParameter("@FAX_NUMBER_IN", faxNumberIn);
			cmd.addParameter("@FAX_INTL_ACCESS_IN", faxIntlAccessIn);
			cmd.addParameter("@FAX_UNLIST_IND_IN", faxUnlistIndIn);
			cmd.addParameter("@EMAIL_ADDRESS_IN", emailAddressIn);
			cmd.addParameter("@EMAL_CODE_IN", emalCodeIn);
			cmd.addParameter("@SPS_SURNAME_PREFIX_IN", spsSurnamePrefixIn);
			cmd.addParameter("@SPS_LAST_NAME_IN", spsLastNameIn);
			cmd.addParameter("@SPS_FIRST_NAME_IN", spsFirstNameIn);
			cmd.addParameter("@SPS_MI_IN", spsMiIn);
			cmd.addParameter("@PREF_CLAS_IN", prefClasIn);
			cmd.addParameter("@PREF_COLL_IN", prefCollIn);
			cmd.addParameter("@DONR_CODE_IN", donrCodeIn);
			cmd.addParameter("@SUBMIT_BTN", submitBtn);
			cmd.addParameter("@NEXT_PAGE", nextPage);
				
			cmd.execute();


		}
		
		public static void pProcpinchange(NString aidm,NString oldPin,NString newPin,NString verfPin,NString retLoc,NString retType,NString nextPage) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWAKALOG.P_PROCPINCHANGE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@AIDM", aidm);
			cmd.addParameter("@OLD_PIN", oldPin);
			cmd.addParameter("@NEW_PIN", newPin);
			cmd.addParameter("@VERF_PIN", verfPin);
			cmd.addParameter("@RET_LOC", retLoc);
			cmd.addParameter("@RET_TYPE", retType);
			cmd.addParameter("@NEXT_PAGE", nextPage);
				
			cmd.execute();


		}
		
		public static void pProcpininvalid(NString inId,NString pin) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWAKALOG.P_PROCPININVALID", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@IN_ID", inId);
			cmd.addParameter("@PIN", pin);
				
			cmd.execute();


		}
		
		public static void pProcpinverifyexist(NString aidm,NString vpin) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWAKALOG.P_PROCPINVERIFYEXIST", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@AIDM", aidm);
			cmd.addParameter("@VPIN", vpin);
				
			cmd.execute();


		}
		
		public static void pProcpinverifynew(NString aidm,NString vpin) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWAKALOG.P_PROCPINVERIFYNEW", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@AIDM", aidm);
			cmd.addParameter("@VPIN", vpin);
				
			cmd.execute();


		}
		
		public static void pProcsecurityquestion(NString aidm,NString question,NString answer,NString pPin,NString retLoc,NString retType,NString nextPage) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWAKALOG.P_PROCSECURITYQUESTION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@AIDM", aidm);
			cmd.addParameter("@QUESTION", question);
			cmd.addParameter("@ANSWER", answer);
			cmd.addParameter("@P_PIN", pPin);
			cmd.addParameter("@RET_LOC", retLoc);
			cmd.addParameter("@RET_TYPE", retType);
			cmd.addParameter("@NEXT_PAGE", nextPage);
				
			cmd.execute();


		}
		
		public static void pSecurityquestion(NString aidm,NString question,NString answer,NString msg,NString retLoc,NString retType,NString nextPage) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWAKALOG.P_SECURITYQUESTION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@AIDM", aidm);
			cmd.addParameter("@QUESTION", question);
			cmd.addParameter("@ANSWER", answer);
			cmd.addParameter("@MSG", msg);
			cmd.addParameter("@RET_LOC", retLoc);
			cmd.addParameter("@RET_TYPE", retType);
			cmd.addParameter("@NEXT_PAGE", nextPage);
				
			cmd.execute();


		}
		
		public static void pUpdategobtpac(NString aidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWAKALOG.P_UPDATEGOBTPAC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@AIDM", aidm);
				
			cmd.execute();


		}
		
	
	
	
}
