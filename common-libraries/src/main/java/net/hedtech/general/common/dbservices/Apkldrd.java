package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Apkldrd {
		public static void pLoadAddress(NNumber pinPidm,NString pinAtype,Ref<NNumber> pinSeqno,NDate pinFromDate,NDate pinToDate,NDate pinActive,NString pinLine1,NString pinLine2,NString pinLine3,NString pinLine4,NString pinHouseNumber,NString pinCity,NString pinState,NString pinZip,NString pinCountry,NString pinCounty,NString pinStatus,NString pinAsrc,NNumber pinDelPoint,NNumber pinCorrDigit,NString pinCarrRoute,Ref<NString> poutStatus,Ref<NString> poutMessage) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APKLDRD.P_LOAD_ADDRESS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIN_PIDM", pinPidm);
			cmd.addParameter("@PIN_ATYPE", pinAtype);
			cmd.addParameter("@PIN_SEQNO", NNumber.class);
			cmd.addParameter("@PIN_FROM_DATE", pinFromDate);
			cmd.addParameter("@PIN_TO_DATE", pinToDate);
			cmd.addParameter("@PIN_ACTIVE", pinActive);
			cmd.addParameter("@PIN_LINE1", pinLine1);
			cmd.addParameter("@PIN_LINE2", pinLine2);
			cmd.addParameter("@PIN_LINE3", pinLine3);
			cmd.addParameter("@PIN_LINE4", pinLine4);
			cmd.addParameter("@PIN_HOUSE_NUMBER", pinHouseNumber);
			cmd.addParameter("@PIN_CITY", pinCity);
			cmd.addParameter("@PIN_STATE", pinState);
			cmd.addParameter("@PIN_ZIP", pinZip);
			cmd.addParameter("@PIN_COUNTRY", pinCountry);
			cmd.addParameter("@PIN_COUNTY", pinCounty);
			cmd.addParameter("@PIN_STATUS", pinStatus);
			cmd.addParameter("@PIN_ASRC", pinAsrc);
			cmd.addParameter("@PIN_DEL_POINT", pinDelPoint);
			cmd.addParameter("@PIN_CORR_DIGIT", pinCorrDigit);
			cmd.addParameter("@PIN_CARR_ROUTE", pinCarrRoute);
			cmd.addParameter("@POUT_STATUS", NString.class);
			cmd.addParameter("@POUT_MESSAGE", NString.class);
				
			cmd.execute();
			pinSeqno.val = cmd.getParameterValue("@PIN_SEQNO", NNumber.class);
			poutStatus.val = cmd.getParameterValue("@POUT_STATUS", NString.class);
			poutMessage.val = cmd.getParameterValue("@POUT_MESSAGE", NString.class);


		}
		
		public static void pLoadAprchld(NNumber passedPidm,NString user,NNumber seqNo,NString surnamePrefix,NString lastName,NString firstName,NString mi,NString sex,NDate birthDate,NString ssn,NString atypCode,NString xrefCode,NNumber chldPidm,NString dispWebInd,NString deceasedInd,NDate deceasedDate,NString okForNotesInd,NString chldComment,Ref<NString> poutStatus,Ref<NString> poutMessage) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APKLDRD.P_LOAD_APRCHLD", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PASSED_PIDM", passedPidm);
			cmd.addParameter("@USER", user);
			cmd.addParameter("@SEQ_NO", seqNo);
			cmd.addParameter("@SURNAME_PREFIX", surnamePrefix);
			cmd.addParameter("@LAST_NAME", lastName);
			cmd.addParameter("@FIRST_NAME", firstName);
			cmd.addParameter("@MI", mi);
			cmd.addParameter("@SEX", sex);
			cmd.addParameter("@BIRTH_DATE", birthDate);
			cmd.addParameter("@SSN", ssn);
			cmd.addParameter("@ATYP_CODE", atypCode);
			cmd.addParameter("@XREF_CODE", xrefCode);
			cmd.addParameter("@CHLD_PIDM", chldPidm);
			cmd.addParameter("@DISP_WEB_IND", dispWebInd);
			cmd.addParameter("@DECEASED_IND", deceasedInd);
			cmd.addParameter("@DECEASED_DATE", deceasedDate);
			cmd.addParameter("@OK_FOR_NOTES_IND", okForNotesInd);
			cmd.addParameter("@CHLD_COMMENT", chldComment);
			cmd.addParameter("@POUT_STATUS", NString.class);
			cmd.addParameter("@POUT_MESSAGE", NString.class);
				
			cmd.execute();
			poutStatus.val = cmd.getParameterValue("@POUT_STATUS", NString.class);
			poutMessage.val = cmd.getParameterValue("@POUT_MESSAGE", NString.class);


		}
		
		public static void pLoadAprxref(NNumber pinPidm,NNumber pinXrefPidm,NString pinXref,Ref<NString> poutStatus,Ref<NString> poutMessage) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APKLDRD.P_LOAD_APRXREF", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIN_PIDM", pinPidm);
			cmd.addParameter("@PIN_XREF_PIDM", pinXrefPidm);
			cmd.addParameter("@PIN_XREF", pinXref);
			cmd.addParameter("@POUT_STATUS", NString.class);
			cmd.addParameter("@POUT_MESSAGE", NString.class);
				
			cmd.execute();
			poutStatus.val = cmd.getParameterValue("@POUT_STATUS", NString.class);
			poutMessage.val = cmd.getParameterValue("@POUT_MESSAGE", NString.class);


		}
		
		public static void pLoadChild(NNumber pinPidm,NString pinDsrcCode,NDate pinLoadDate,NNumber pinSeqNo,Ref<NString> poutStatus,Ref<NString> poutMessage) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APKLDRD.P_LOAD_CHILD", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIN_PIDM", pinPidm);
			cmd.addParameter("@PIN_DSRC_CODE", pinDsrcCode);
			cmd.addParameter("@PIN_LOAD_DATE", pinLoadDate);
			cmd.addParameter("@PIN_SEQ_NO", pinSeqNo);
			cmd.addParameter("@POUT_STATUS", NString.class);
			cmd.addParameter("@POUT_MESSAGE", NString.class);
				
			cmd.execute();
			poutStatus.val = cmd.getParameterValue("@POUT_STATUS", NString.class);
			poutMessage.val = cmd.getParameterValue("@POUT_MESSAGE", NString.class);


		}
		
		public static void pLoadDegree(NNumber pinPidm,NString pinDsrcCode,NDate pinLoadDate,NNumber pinSeqNo,Ref<NString> poutStatus,Ref<NString> poutMessage) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APKLDRD.P_LOAD_DEGREE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIN_PIDM", pinPidm);
			cmd.addParameter("@PIN_DSRC_CODE", pinDsrcCode);
			cmd.addParameter("@PIN_LOAD_DATE", pinLoadDate);
			cmd.addParameter("@PIN_SEQ_NO", pinSeqNo);
			cmd.addParameter("@POUT_STATUS", NString.class);
			cmd.addParameter("@POUT_MESSAGE", NString.class);
				
			cmd.execute();
			poutStatus.val = cmd.getParameterValue("@POUT_STATUS", NString.class);
			poutMessage.val = cmd.getParameterValue("@POUT_MESSAGE", NString.class);


		}
		
		public static void pLoadEmail(NNumber pinPidm,NString pinEtype,NDate pinActdate,NString pinAddress,NString pinPref,NString pinComment,Ref<NString> poutStatus,Ref<NString> poutMessage) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APKLDRD.P_LOAD_EMAIL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIN_PIDM", pinPidm);
			cmd.addParameter("@PIN_ETYPE", pinEtype);
			cmd.addParameter("@PIN_ACTDATE", pinActdate);
			cmd.addParameter("@PIN_ADDRESS", pinAddress);
			cmd.addParameter("@PIN_PREF", pinPref);
			cmd.addParameter("@PIN_COMMENT", pinComment);
			cmd.addParameter("@POUT_STATUS", NString.class);
			cmd.addParameter("@POUT_MESSAGE", NString.class);
				
			cmd.execute();
			poutStatus.val = cmd.getParameterValue("@POUT_STATUS", NString.class);
			poutMessage.val = cmd.getParameterValue("@POUT_MESSAGE", NString.class);


		}
		
		public static void pLoadEmployer(NNumber pinPidm,NString pinDsrcCode,NDate pinLoadDate,NNumber pinSeqNo,Ref<NString> poutStatus,Ref<NString> poutMessage) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APKLDRD.P_LOAD_EMPLOYER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIN_PIDM", pinPidm);
			cmd.addParameter("@PIN_DSRC_CODE", pinDsrcCode);
			cmd.addParameter("@PIN_LOAD_DATE", pinLoadDate);
			cmd.addParameter("@PIN_SEQ_NO", pinSeqNo);
			cmd.addParameter("@POUT_STATUS", NString.class);
			cmd.addParameter("@POUT_MESSAGE", NString.class);
				
			cmd.execute();
			poutStatus.val = cmd.getParameterValue("@POUT_STATUS", NString.class);
			poutMessage.val = cmd.getParameterValue("@POUT_MESSAGE", NString.class);


		}
		
		public static void pLoadSpbpers(NNumber pidm,NString ssn,NDate birthDate,NString prefFirstName,NString namePrefix,NString nameSuffix,NDate activityDate,NString deadInd,NDate deadDate,NString mrtlCode,NString sex,Ref<NString> poutStatus,Ref<NString> poutMessage) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APKLDRD.P_LOAD_SPBPERS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@SSN", ssn);
			cmd.addParameter("@BIRTH_DATE", birthDate);
			cmd.addParameter("@PREF_FIRST_NAME", prefFirstName);
			cmd.addParameter("@NAME_PREFIX", namePrefix);
			cmd.addParameter("@NAME_SUFFIX", nameSuffix);
			cmd.addParameter("@ACTIVITY_DATE", activityDate);
			cmd.addParameter("@DEAD_IND", deadInd);
			cmd.addParameter("@DEAD_DATE", deadDate);
			cmd.addParameter("@MRTL_CODE", mrtlCode);
			cmd.addParameter("@SEX", sex);
			cmd.addParameter("@POUT_STATUS", NString.class);
			cmd.addParameter("@POUT_MESSAGE", NString.class);
				
			cmd.execute();
			poutStatus.val = cmd.getParameterValue("@POUT_STATUS", NString.class);
			poutMessage.val = cmd.getParameterValue("@POUT_MESSAGE", NString.class);


		}
		
		public static void pLoadSpouse(NNumber pinPidm,NString pinDsrcCode,NDate pinLoadDate,NNumber pinSeqNo,Ref<NString> poutStatus,Ref<NString> poutMessage) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APKLDRD.P_LOAD_SPOUSE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIN_PIDM", pinPidm);
			cmd.addParameter("@PIN_DSRC_CODE", pinDsrcCode);
			cmd.addParameter("@PIN_LOAD_DATE", pinLoadDate);
			cmd.addParameter("@PIN_SEQ_NO", pinSeqNo);
			cmd.addParameter("@POUT_STATUS", NString.class);
			cmd.addParameter("@POUT_MESSAGE", NString.class);
				
			cmd.execute();
			poutStatus.val = cmd.getParameterValue("@POUT_STATUS", NString.class);
			poutMessage.val = cmd.getParameterValue("@POUT_MESSAGE", NString.class);


		}
		
		public static void pLoadSpriden(NNumber pinPidm,NString pinSurnamePrefix,NString pinLastName,NString pinFirstName,NString pinMi,NString pinOrigin,NString pinNtypCode,Ref<NString> poutStatus,Ref<NString> poutMessage) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APKLDRD.P_LOAD_SPRIDEN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIN_PIDM", pinPidm);
			cmd.addParameter("@PIN_SURNAME_PREFIX", pinSurnamePrefix);
			cmd.addParameter("@PIN_LAST_NAME", pinLastName);
			cmd.addParameter("@PIN_FIRST_NAME", pinFirstName);
			cmd.addParameter("@PIN_MI", pinMi);
			cmd.addParameter("@PIN_ORIGIN", pinOrigin);
			cmd.addParameter("@PIN_NTYP_CODE", pinNtypCode);
			cmd.addParameter("@POUT_STATUS", NString.class);
			cmd.addParameter("@POUT_MESSAGE", NString.class);
				
			cmd.execute();
			poutStatus.val = cmd.getParameterValue("@POUT_STATUS", NString.class);
			poutMessage.val = cmd.getParameterValue("@POUT_MESSAGE", NString.class);


		}
		
		public static void pLoadTelephone(NNumber pinPidm,NString pinAtype,NNumber pinAddrSeqno,NString pinPtype,NDate pinActdate,NString pinActive,NString pinCtryCodePhone,NString pinArea,NString pinNumber,NString pinExtension,NString pinIntlAccess,NString pinUnlistInd,NString pinComment,Ref<NString> poutStatus,Ref<NString> poutMessage) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APKLDRD.P_LOAD_TELEPHONE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIN_PIDM", pinPidm);
			cmd.addParameter("@PIN_ATYPE", pinAtype);
			cmd.addParameter("@PIN_ADDR_SEQNO", pinAddrSeqno);
			cmd.addParameter("@PIN_PTYPE", pinPtype);
			cmd.addParameter("@PIN_ACTDATE", pinActdate);
			cmd.addParameter("@PIN_ACTIVE", pinActive);
			cmd.addParameter("@PIN_CTRY_CODE_PHONE", pinCtryCodePhone);
			cmd.addParameter("@PIN_AREA", pinArea);
			cmd.addParameter("@PIN_NUMBER", pinNumber);
			cmd.addParameter("@PIN_EXTENSION", pinExtension);
			cmd.addParameter("@PIN_INTL_ACCESS", pinIntlAccess);
			cmd.addParameter("@PIN_UNLIST_IND", pinUnlistInd);
			cmd.addParameter("@PIN_COMMENT", pinComment);
			cmd.addParameter("@POUT_STATUS", NString.class);
			cmd.addParameter("@POUT_MESSAGE", NString.class);
				
			cmd.execute();
			poutStatus.val = cmd.getParameterValue("@POUT_STATUS", NString.class);
			poutMessage.val = cmd.getParameterValue("@POUT_MESSAGE", NString.class);


		}
		
	
	
	
}
