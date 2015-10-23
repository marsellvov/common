package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class GpCommonMatching {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GP_COMMON_MATCHING.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static void pCommonMatching(NString pCmscCode,Ref<NString> pMatchStatusOut,Ref<NNumber> pMatchPidmOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GP_COMMON_MATCHING.P_COMMON_MATCHING", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CMSC_CODE", pCmscCode);
			cmd.addParameter("@P_MATCH_STATUS_OUT", NString.class);
			cmd.addParameter("@P_MATCH_PIDM_OUT", NNumber.class);
				
			cmd.execute();
			pMatchStatusOut.val = cmd.getParameterValue("@P_MATCH_STATUS_OUT", NString.class);
			pMatchPidmOut.val = cmd.getParameterValue("@P_MATCH_PIDM_OUT", NNumber.class);


		}
		
		public static void pInsertGotcmme(NString pLastName,NString pEntityCde,NString pFirstName,NString pMi,NString pId,NString pStreetLine1,NString pCity,NString pStatCode,NString pZip,NString pNatnCode,NString pCntyCode,NString pPhoneArea,NString pPhoneNumber,NString pSsn,NString pBirthDay,NString pBirthMon,NString pBirthYear,NString pSex,NString pEmailAddress,NString pAddidCode,NString pAddid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GP_COMMON_MATCHING.P_INSERT_GOTCMME", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_LAST_NAME", pLastName);
			cmd.addParameter("@P_ENTITY_CDE", pEntityCde);
			cmd.addParameter("@P_FIRST_NAME", pFirstName);
			cmd.addParameter("@P_MI", pMi);
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_STREET_LINE1", pStreetLine1);
			cmd.addParameter("@P_CITY", pCity);
			cmd.addParameter("@P_STAT_CODE", pStatCode);
			cmd.addParameter("@P_ZIP", pZip);
			cmd.addParameter("@P_NATN_CODE", pNatnCode);
			cmd.addParameter("@P_CNTY_CODE", pCntyCode);
			cmd.addParameter("@P_PHONE_AREA", pPhoneArea);
			cmd.addParameter("@P_PHONE_NUMBER", pPhoneNumber);
			cmd.addParameter("@P_SSN", pSsn);
			cmd.addParameter("@P_BIRTH_DAY", pBirthDay);
			cmd.addParameter("@P_BIRTH_MON", pBirthMon);
			cmd.addParameter("@P_BIRTH_YEAR", pBirthYear);
			cmd.addParameter("@P_SEX", pSex);
			cmd.addParameter("@P_EMAIL_ADDRESS", pEmailAddress);
			cmd.addParameter("@P_ADDID_CODE", pAddidCode);
			cmd.addParameter("@P_ADDID", pAddid);
				
			cmd.execute();


		}
		
	
	
	
}
