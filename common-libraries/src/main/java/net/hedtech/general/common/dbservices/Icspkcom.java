package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Icspkcom {
		public static NString fCalcFullName(NString namePrefixIn,NString firstNameIn,NString miIn,NString lastNameIn,NString nameSuffixIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ICSPKCOM.F_CALC_FULL_NAME", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@NAME_PREFIX_IN", namePrefixIn);
			cmd.addParameter("@FIRST_NAME_IN", firstNameIn);
			cmd.addParameter("@MI_IN", miIn);
			cmd.addParameter("@LAST_NAME_IN", lastNameIn);
			cmd.addParameter("@NAME_SUFFIX_IN", nameSuffixIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fCalcGender(NString sexIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ICSPKCOM.F_CALC_GENDER", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@SEX_IN", sexIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fCalcLogonId(NString idIn,NString externalUserIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ICSPKCOM.F_CALC_LOGON_ID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@ID_IN", idIn);
			cmd.addParameter("@EXTERNAL_USER_IN", externalUserIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fCalcMajor(NString majrCodeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ICSPKCOM.F_CALC_MAJOR", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@MAJR_CODE_IN", majrCodeIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fCalcNation(NString natnCodeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ICSPKCOM.F_CALC_NATION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@NATN_CODE_IN", natnCodeIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fCalcNickname(NString prefFirstNameIn,NString lastNameIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ICSPKCOM.F_CALC_NICKNAME", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PREF_FIRST_NAME_IN", prefFirstNameIn);
			cmd.addParameter("@LAST_NAME_IN", lastNameIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fCalcPhoneFormat(NString intlAccessIn,NString phoneAreaIn,NString phoneNumberIn,NString phoneExtIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ICSPKCOM.F_CALC_PHONE_FORMAT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@INTL_ACCESS_IN", intlAccessIn);
			cmd.addParameter("@PHONE_AREA_IN", phoneAreaIn);
			cmd.addParameter("@PHONE_NUMBER_IN", phoneNumberIn);
			cmd.addParameter("@PHONE_EXT_IN", phoneExtIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fCalcStreet(NString streetLine1In,NString streetLine2In,NString streetLine3In) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ICSPKCOM.F_CALC_STREET", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@STREET_LINE1_IN", streetLine1In);
			cmd.addParameter("@STREET_LINE2_IN", streetLine2In);
			cmd.addParameter("@STREET_LINE3_IN", streetLine3In);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
//		public static List<AcademicDegreesTabTypeRow> fGetAcademicDegrees(NNumber pidmIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ICSPKCOM.F_GET_ACADEMIC_DEGREES", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<AcademicDegreesTabTypeRow>.class);
//			cmd.addParameter("@PIDM_IN", pidmIn);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<AcademicDegreesTabTypeRow>.class);
//
//		}
		
		public static NString fGetAcademicTitle(NNumber pidmIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ICSPKCOM.F_GET_ACADEMIC_TITLE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PIDM_IN", pidmIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static AddressRecTypeRow fGetAddress(NNumber pidmIn,NString addressHierarchyIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ICSPKCOM.F_GET_ADDRESS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DbTypes.createStructType(AddressRecTypeRow.class));
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@ADDRESS_HIERARCHY_IN", addressHierarchyIn);
				
			cmd.execute();

			return cmd.getReturnValue(AddressRecTypeRow.class);

		}
		
		public static NString fGetEmail(NNumber pidmIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ICSPKCOM.F_GET_EMAIL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PIDM_IN", pidmIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetEncryptionType(NString password) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ICSPKCOM.F_GET_ENCRYPTION_TYPE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PASSWORD", password);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static MajorRecTypeRow fGetMajors(NNumber pidmIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ICSPKCOM.F_GET_MAJORS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DbTypes.createStructType(MajorRecTypeRow.class));
			cmd.addParameter("@PIDM_IN", pidmIn);
				
			cmd.execute();

			return cmd.getReturnValue(MajorRecTypeRow.class);

		}
		
		public static NString fGetMaxSobterm() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ICSPKCOM.F_GET_MAX_SOBTERM", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static PersonRecTypeRow fGetPerson(NNumber pidmIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ICSPKCOM.F_GET_PERSON", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DbTypes.createStructType(PersonRecTypeRow.class));
			cmd.addParameter("@PIDM_IN", pidmIn);
				
			cmd.execute();

			return cmd.getReturnValue(PersonRecTypeRow.class);

		}
		
		public static NString fGetPhone(NNumber pidmIn,NString addressHierarchyIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ICSPKCOM.F_GET_PHONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@ADDRESS_HIERARCHY_IN", addressHierarchyIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetPin(NNumber pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ICSPKCOM.F_GET_PIN", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void fGetSpraddr() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ICSPKCOM.F_GET_SPRADDR", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void fGetStudentByTerm() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ICSPKCOM.F_GET_STUDENT_BY_TERM", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="AddressRecTypeRow", dataSourceName="ADDRESS_REC_TYPE")
	public static class AddressRecTypeRow
	{
		@DbRecordField(dataSourceName="STREET")
		public NString Street;
		@DbRecordField(dataSourceName="LOCALITY")
		public NString Locality;
		@DbRecordField(dataSourceName="REGION")
		public NString Region;
		@DbRecordField(dataSourceName="PCODE")
		public NString Pcode;
		@DbRecordField(dataSourceName="COUNTRY")
		public NString Country;
	}

	
	@DbRecordType(id="MajorRecTypeRow", dataSourceName="MAJOR_REC_TYPE")
	public static class MajorRecTypeRow
	{
		@DbRecordField(dataSourceName="MAJOR1")
		public NString Major1;
		@DbRecordField(dataSourceName="MAJOR2")
		public NString Major2;
		@DbRecordField(dataSourceName="MAJOR3")
		public NString Major3;
		@DbRecordField(dataSourceName="MAJOR4")
		public NString Major4;
	}

	
	@DbRecordType(id="PersonRecTypeRow", dataSourceName="PERSON_REC_TYPE")
	public static class PersonRecTypeRow
	{
		@DbRecordField(dataSourceName="LOGON_ID")
		public NString LogonId;
		@DbRecordField(dataSourceName="LOGON_PASSWORD")
		public NString LogonPassword;
		@DbRecordField(dataSourceName="SCT_ID")
		public NString SctId;
		@DbRecordField(dataSourceName="SCT_PASSWORD")
		public NString SctPassword;
		@DbRecordField(dataSourceName="EMAIL_ID")
		public NString EmailId;
		@DbRecordField(dataSourceName="FULL_NAME")
		public NString FullName;
		@DbRecordField(dataSourceName="NICKNAME")
		public NString Nickname;
		@DbRecordField(dataSourceName="FAMILY_NAME")
		public NString FamilyName;
		@DbRecordField(dataSourceName="GIVEN_NAME")
		public NString GivenName;
		@DbRecordField(dataSourceName="NAME_PREFIX")
		public NString NamePrefix;
		@DbRecordField(dataSourceName="NAME_SUFFIX")
		public NString NameSuffix;
		@DbRecordField(dataSourceName="PARTNAME")
		public NString Partname;
		@DbRecordField(dataSourceName="PARTNAME_TYPE")
		public NString PartnameType;
		@DbRecordField(dataSourceName="GENDER")
		public NString Gender;
		@DbRecordField(dataSourceName="UDC_ID")
		public NString UdcId;
	}

	
	
}
